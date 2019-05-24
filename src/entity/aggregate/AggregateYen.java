package entity.aggregate;

import entity.base.Money;
import entity.bill.J10000Yen;
import entity.bill.J1000Yen;
import entity.bill.J5000Yen;
import entity.coin.*;
import exception.NoMoneyException;

import java.util.ArrayList;
import java.util.List;

public class AggregateYen extends Money {

    // デフォルトの初期値は0円
    // ※金額から貨幣の内訳を一意に確定できないので、金額を指定して初期化はできない
    public AggregateYen () {
        this.value = 0;
    }

    // 各貨幣の数
    private List<J1Yen> list1Yen = new ArrayList<>();
    private List<J5Yen> list5Yen = new ArrayList<>();
    private List<J10Yen> list10Yen = new ArrayList<>();
    private List<J50Yen> list50Yen = new ArrayList<>();
    private List<J100Yen> list100Yen = new ArrayList<>();
    private List<J500Yen> list500Yen = new ArrayList<>();
    private List<J1000Yen> list1000Yen = new ArrayList<>();
    private List<J5000Yen> list5000Yen = new ArrayList<>();
    private List<J10000Yen> list10000Yen = new ArrayList<>();

    // 貨幣を追加するメソッド
    public void add1Yen () {
        this.list1Yen.add(new J1Yen());
    }
    public void add5Yen () {
        this.list5Yen.add(new J5Yen());
    }
    public void add10Yen () {
        this.list10Yen.add(new J10Yen());
    }
    public void add50Yen () {
        this.list50Yen.add(new J50Yen());
    }
    public void add100Yen () {
        this.list100Yen.add(new J100Yen());
    }
    public void add500Yen () {
        this.list500Yen.add(new J500Yen());
    }
    public void add1000Yen () {
        this.list1000Yen.add(new J1000Yen());
    }
    public void add5000Yen () {
        this.list5000Yen.add(new J5000Yen());
    }
    public void add10000Yen () {
        this.list10000Yen.add(new J10000Yen());
    }

    // 貨幣を除去するメソッド
    public void remove1Yen () throws NoMoneyException {
        try {
            this.list1Yen.remove(0);
        } catch (IndexOutOfBoundsException e) {
            throw new NoMoneyException();
        }
    }
    public void remove5Yen () throws NoMoneyException {
        try {
            this.list5Yen.remove(0);
        } catch (IndexOutOfBoundsException e) {
            throw new NoMoneyException();
        }
    }
    public void remove10Yen () throws NoMoneyException {
        try {
            this.list10Yen.remove(0);
        } catch (IndexOutOfBoundsException e) {
            throw new NoMoneyException();
        }
    }
    public void remove50Yen () throws NoMoneyException {
        try {
            this.list50Yen.remove(0);
        } catch (IndexOutOfBoundsException e) {
            throw new NoMoneyException();
        }
    }
    public void remove100Yen () throws NoMoneyException {
        try {
            this.list100Yen.remove(0);
        } catch (IndexOutOfBoundsException e) {
            throw new NoMoneyException();
        }
    }
    public void remove500Yen () throws NoMoneyException {
        try {
            this.list500Yen.remove(0);
        } catch (IndexOutOfBoundsException e) {
            throw new NoMoneyException();
        }
    }
    public void remove1000Yen () throws NoMoneyException {
        try {
            this.list1000Yen.remove(0);
        } catch (IndexOutOfBoundsException e) {
            throw new NoMoneyException();
        }
    }
    public void remove5000Yen () throws NoMoneyException {
        try {
            this.list5000Yen.remove(0);
        } catch (IndexOutOfBoundsException e) {
            throw new NoMoneyException();
        }
    }
    public void remove10000Yen () throws NoMoneyException {
        try {
            this.list10000Yen.remove(0);
        } catch (IndexOutOfBoundsException e) {
            throw new NoMoneyException();
        }
    }

    @Override
    public int getValue () {

        // 初期化
        int value = 0;

        // お財布の中身計算
        value += this.list1Yen.size() * new J1Yen().getValue();
        value += this.list5Yen.size() * new J5Yen().getValue();
        value += this.list10Yen.size() * new J10Yen().getValue();
        value += this.list50Yen.size() * new J50Yen().getValue();
        value += this.list100Yen.size() * new J100Yen().getValue();
        value += this.list500Yen.size() * new J500Yen().getValue();
        value += this.list1000Yen.size() * new J1000Yen().getValue();
        value += this.list5000Yen.size() * new J5000Yen().getValue();
        value += this.list10000Yen.size() * new J10000Yen().getValue();

        return value;
    }


}
