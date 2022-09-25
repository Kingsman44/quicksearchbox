package com.google.p4420by.p4425c.p4426a.p4427a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.social.populous.core.AutoValue_MatchInfo;
import com.google.common.base.C58837ba;
import com.google.common.base.C58902l;
import com.google.common.base.C58907q;
import com.google.common.base.C58908r;
import com.google.common.base.C58909s;
import com.google.common.base.C58910t;
import com.google.common.base.C58912v;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.BitSet;

/* renamed from: com.google.by.c.a.a.c */
/* compiled from: PG */
public final class C57873c {

    /* renamed from: a */
    private static final C58912v f154601a;

    /* renamed from: b */
    private static final C58912v f154602b = C58837ba.m90853b(new C58907q(new C58910t(new C58910t(new C58910t(new C58910t(new C58902l('a', 'z'), new C58902l('A', 'Z')), new C58902l('0', '9')), new C58902l(128, 8219)), new C58902l(8222, 65535))));

    /* renamed from: c */
    private static final C58912v f154603c = new C58908r(new C58902l('0', '9'));

    /* renamed from: d */
    private static final C58912v f154604d;

    /* renamed from: e */
    private static final C58912v f154605e = C58909s.f156747a;

    static {
        C58912v b = C58837ba.m90853b(new C58910t(new C58910t(new C58910t(new C58902l(8, 13), new C58902l(28, ' ')), new C58902l(8192, 8202)), C58912v.m91034k("  ᠎    　")));
        f154601a = b;
        f154604d = C58837ba.m90853b(new C58910t(new C58910t(new C58910t(new C58902l('(', '/'), new C58902l('[', ']')), C58912v.m91034k("#_~")), b));
    }

    /* renamed from: a */
    public static C58485gu m88539a(String str) {
        if (C58837ba.m90859h(str)) {
            return C58485gu.m89845m();
        }
        BitSet j = m88548j(str, f154603c);
        C58480gp e = C58485gu.m89837e();
        m88547i(e, str, 0, str.length(), j);
        return e.mo55394f();
    }

    /* renamed from: b */
    public static C58485gu m88540b(String str, boolean z) {
        int indexOf;
        if (C58837ba.m90859h(str)) {
            return C58485gu.m89845m();
        }
        C58480gp e = C58485gu.m89837e();
        if (z && (indexOf = str.indexOf(64)) > 0) {
            e.mo55395g(m88544f(str));
            str = str.substring(0, indexOf);
        }
        m88550l(e, str, f154601a, f154602b);
        return e.mo55394f();
    }

    /* renamed from: c */
    public static C58485gu m88541c(String str) {
        if (C58837ba.m90859h(str)) {
            return C58485gu.m89845m();
        }
        C58480gp e = C58485gu.m89837e();
        m88550l(e, str, f154601a, f154605e);
        return e.mo55394f();
    }

    /* renamed from: d */
    public static C57872b m88542d(String str) {
        BitSet[] k = m88549k(str, f154603c, f154604d);
        BitSet bitSet = k[0];
        BitSet bitSet2 = k[1];
        int cardinality = bitSet.cardinality();
        if (cardinality == str.length() || cardinality != bitSet2.cardinality()) {
            return null;
        }
        return m88546h(str, bitSet);
    }

    /* renamed from: e */
    public static C57872b m88543e(String str) {
        if (C58837ba.m90859h(str)) {
            return C57872b.f154595a;
        }
        return m88546h(str, m88548j(str, f154603c));
    }

    /* renamed from: f */
    public static C57872b m88544f(String str) {
        int i = 0;
        while (i < str.length() && f154601a.mo56144c(str.charAt(i))) {
            i++;
        }
        return new C57872b(str.trim(), i, 2, (BitSet) null);
    }

    /* renamed from: g */
    public static C58485gu m88545g(C57872b bVar, int i) {
        BitSet bitSet = bVar.f154599e;
        if (bitSet == null) {
            return C58485gu.m89846n(new AutoValue_MatchInfo(bVar.f154598d, i));
        }
        int i2 = bVar.f154598d;
        int i3 = i + i2;
        C58480gp e = C58485gu.m89837e();
        while (true) {
            int nextSetBit = bitSet.nextSetBit(i2);
            if (nextSetBit < 0 || nextSetBit >= i3) {
                int i4 = i3 - i2;
            } else {
                int i5 = nextSetBit - i2;
                if (i5 > 0) {
                    e.mo55395g(new AutoValue_MatchInfo(i2, i5));
                }
                i2 = nextSetBit + 1;
                i3++;
            }
        }
        int i42 = i3 - i2;
        if (i42 > 0) {
            e.mo55395g(new AutoValue_MatchInfo(i2, i42));
        }
        return e.mo55394f();
    }

    /* renamed from: h */
    private static C57872b m88546h(String str, BitSet bitSet) {
        int length = str.length();
        if (bitSet.isEmpty()) {
            return new C57872b(str, 0, 2, (BitSet) null);
        }
        int cardinality = length - bitSet.cardinality();
        if (cardinality <= 0) {
            return C57872b.f154595a;
        }
        int nextClearBit = bitSet.nextClearBit(0);
        StringBuilder sb = new StringBuilder(cardinality);
        int i = nextClearBit;
        while (i < length) {
            int nextSetBit = bitSet.nextSetBit(i);
            if (nextSetBit < 0) {
                nextSetBit = length;
            }
            sb.append(str, i, nextSetBit);
            i = bitSet.nextClearBit(nextSetBit);
        }
        return new C57872b(sb.toString(), nextClearBit, 4, bitSet);
    }

    /* renamed from: i */
    private static String m88547i(C58480gp gpVar, String str, int i, int i2, BitSet bitSet) {
        int nextClearBit = bitSet.nextClearBit(i);
        if (nextClearBit >= i2) {
            return BuildConfig.FLAVOR;
        }
        int nextSetBit = bitSet.nextSetBit(nextClearBit);
        if (nextSetBit < 0) {
            String substring = str.substring(nextClearBit, i2);
            gpVar.mo55395g(new C57872b(substring, nextClearBit, 3, bitSet));
            return substring;
        }
        String concat = String.valueOf(str.substring(nextClearBit, nextSetBit)).concat(String.valueOf(m88547i(gpVar, str, nextSetBit, i2, bitSet)));
        gpVar.mo55395g(new C57872b(concat, nextClearBit, 4, bitSet));
        return concat;
    }

    /* renamed from: j */
    private static BitSet m88548j(String str, C58912v vVar) {
        return m88549k(str, vVar, f154605e)[0];
    }

    /* renamed from: k */
    private static BitSet[] m88549k(String str, C58912v vVar, C58912v vVar2) {
        int length = str.length();
        BitSet[] bitSetArr = {new BitSet(length), new BitSet(length)};
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (vVar.mo56144c(charAt)) {
                bitSetArr[0].set(i);
            }
            if (vVar2.mo56144c(charAt)) {
                bitSetArr[1].set(i);
            }
        }
        return bitSetArr;
    }

    /* renamed from: l */
    private static void m88550l(C58480gp gpVar, String str, C58912v vVar, C58912v vVar2) {
        BitSet[] k = m88549k(str, vVar, vVar2);
        BitSet bitSet = k[0];
        BitSet bitSet2 = k[1];
        int length = str.length();
        if (bitSet.isEmpty() && bitSet2.isEmpty()) {
            gpVar.mo55395g(new C57872b(str, 0, 2, (BitSet) null));
        } else if (length - bitSet.cardinality() > 0) {
            int nextClearBit = bitSet.nextClearBit(0);
            while (nextClearBit < length) {
                int nextSetBit = bitSet.nextSetBit(nextClearBit);
                if (nextSetBit < 0) {
                    nextSetBit = length;
                }
                gpVar.mo55395g(new C57872b(str.substring(nextClearBit, nextSetBit), nextClearBit, 2, bitSet));
                int nextSetBit2 = bitSet2.nextSetBit(nextClearBit);
                if (nextSetBit2 >= 0 && bitSet2.nextClearBit(nextSetBit2) < nextSetBit) {
                    m88547i(gpVar, str, nextClearBit, nextSetBit, bitSet2);
                }
                nextClearBit = bitSet.nextClearBit(nextSetBit);
            }
        }
    }
}
