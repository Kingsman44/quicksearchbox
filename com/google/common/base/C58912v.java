package com.google.common.base;

import com.evernote.android.state.BuildConfig;
import java.util.BitSet;

/* renamed from: com.google.common.base.v */
/* compiled from: PG */
public abstract class C58912v implements C58839bc {
    protected C58912v() {
    }

    /* renamed from: k */
    public static C58912v m91034k(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return C58909s.f156747a;
        }
        if (length == 1) {
            return new C58903m(charSequence.charAt(0));
        }
        if (length != 2) {
            return new C58897g(charSequence);
        }
        return new C58904n(charSequence.charAt(0), charSequence.charAt(1));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: char} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m91036n(char r6) {
        /*
            r0 = 6
            char[] r0 = new char[r0]
            r0 = {92, 117, 0, 0, 0, 0} // fill-array
            r1 = 0
        L_0x0007:
            r2 = 4
            if (r1 >= r2) goto L_0x001a
            int r3 = 5 - r1
            r4 = r6 & 15
            java.lang.String r5 = "0123456789ABCDEF"
            char r4 = r5.charAt(r4)
            r0[r3] = r4
            int r6 = r6 >> r2
            int r1 = r1 + 1
            goto L_0x0007
        L_0x001a:
            java.lang.String r6 = java.lang.String.copyValueOf(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.C58912v.m91036n(char):java.lang.String");
    }

    @Deprecated
    /* renamed from: a */
    public final /* synthetic */ boolean mo5941a(Object obj) {
        return mo56144c(((Character) obj).charValue());
    }

    /* renamed from: b */
    public void mo56143b(BitSet bitSet) {
        for (int i = 65535; i >= 0; i--) {
            if (mo56144c((char) i)) {
                bitSet.set(i);
            }
        }
    }

    /* renamed from: c */
    public abstract boolean mo56144c(char c);

    /* renamed from: d */
    public C58912v mo56180d() {
        return C58837ba.m90853b(this);
    }

    /* renamed from: e */
    public C58912v mo56182e(C58912v vVar) {
        return new C58910t(this, vVar);
    }

    /* renamed from: f */
    public String mo56183f(CharSequence charSequence) {
        String obj = charSequence.toString();
        int i = mo56190i(obj);
        if (i == -1) {
            return obj;
        }
        char[] charArray = obj.toCharArray();
        charArray[i] = '.';
        while (true) {
            i++;
            if (i >= charArray.length) {
                return new String(charArray);
            }
            if (mo56144c(charArray[i])) {
                charArray[i] = '.';
            }
        }
    }

    /* renamed from: g */
    public boolean mo56188g(CharSequence charSequence) {
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return true;
            }
        } while (mo56144c(charSequence.charAt(length)));
        return false;
    }

    /* renamed from: h */
    public boolean mo56189h(CharSequence charSequence) {
        return mo56190i(charSequence) == -1;
    }

    /* renamed from: i */
    public int mo56190i(CharSequence charSequence) {
        return mo56191j(charSequence, 0);
    }

    /* renamed from: j */
    public int mo56191j(CharSequence charSequence, int i) {
        int length = charSequence.length();
        C58838bb.m90864E(i, length);
        while (i < length) {
            if (mo56144c(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: m */
    public final String mo56193m(CharSequence charSequence) {
        String obj = charSequence.toString();
        int i = mo56190i(obj);
        if (i == -1) {
            return obj;
        }
        char[] charArray = obj.toCharArray();
        int i2 = 1;
        while (true) {
            i++;
            while (i != charArray.length) {
                if (mo56144c(charArray[i])) {
                    i2++;
                } else {
                    charArray[i - i2] = charArray[i];
                    i++;
                }
            }
            return new String(charArray, 0, i - i2);
        }
    }

    /* renamed from: o */
    public final String mo56194o(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && mo56144c(charSequence.charAt(i))) {
            i++;
        }
        do {
            length--;
            if (length <= i || !mo56144c(charSequence.charAt(length))) {
            }
            length--;
            break;
        } while (!mo56144c(charSequence.charAt(length)));
        return charSequence.subSequence(i, length + 1).toString();
    }

    /* renamed from: p */
    public final String mo56195p(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!mo56144c(charSequence.charAt(i))) {
                return charSequence.subSequence(i, length).toString();
            }
        }
        return BuildConfig.FLAVOR;
    }

    /* renamed from: q */
    public final String mo56196q(CharSequence charSequence) {
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return BuildConfig.FLAVOR;
            }
        } while (mo56144c(charSequence.charAt(length)));
        return charSequence.subSequence(0, length + 1).toString();
    }

    /* renamed from: l */
    public static C58912v m91035l(int i, BitSet bitSet, String str) {
        int i2;
        if (i == 0) {
            return C58909s.f156747a;
        }
        if (i == 1) {
            return new C58903m((char) bitSet.nextSetBit(0));
        }
        int i3 = 2;
        if (i != 2) {
            int length = bitSet.length();
            if (i > 1023 || length <= i * 64) {
                return new C58899i(bitSet, str);
            }
            int cardinality = bitSet.cardinality();
            boolean z = bitSet.get(0);
            if (cardinality != 1) {
                int highestOneBit = Integer.highestOneBit(cardinality - 1);
                i3 = highestOneBit + highestOneBit;
                while (true) {
                    double d = (double) i3;
                    Double.isNaN(d);
                    if (d * 0.5d >= ((double) cardinality)) {
                        break;
                    }
                    i3 += i3;
                }
            }
            char[] cArr = new char[i3];
            int i4 = i3 - 1;
            int nextSetBit = bitSet.nextSetBit(0);
            long j = 0;
            while (nextSetBit != -1) {
                long j2 = (1 << nextSetBit) | j;
                int r = C58855bs.m90915r(nextSetBit);
                while (true) {
                    i2 = r & i4;
                    if (cArr[i2] == 0) {
                        break;
                    }
                    r = i2 + 1;
                }
                cArr[i2] = (char) nextSetBit;
                nextSetBit = bitSet.nextSetBit(nextSetBit + 1);
                j = j2;
            }
            return new C58855bs(cArr, j, z, str);
        }
        char nextSetBit2 = (char) bitSet.nextSetBit(0);
        return new C58904n(nextSetBit2, (char) bitSet.nextSetBit(nextSetBit2 + 1));
    }
}
