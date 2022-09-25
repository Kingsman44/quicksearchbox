package com.airbnb.lottie.p243e.p244a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p5462h.p5463a.C69531o;
import p5462h.p5463a.C69540x;
import p5462h.p5465b.C69544a;
import p5462h.p5473f.p5475b.C69664n;
import p5589m.C71828e;
import p5589m.C71832i;
import p5589m.C71836m;
import p5589m.C71837n;

/* renamed from: com.airbnb.lottie.e.a.c */
/* compiled from: PG */
public final class C4906c {

    /* renamed from: a */
    final String[] f15642a;

    /* renamed from: b */
    final C71837n f15643b;

    private C4906c(String[] strArr, C71837n nVar) {
        this.f15642a = strArr;
        this.f15643b = nVar;
    }

    /* renamed from: a */
    public static C4906c m13601a(String... strArr) {
        int i;
        String str;
        String[] strArr2 = strArr;
        try {
            int length = strArr2.length;
            C71832i[] iVarArr = new C71832i[length];
            C71828e eVar = new C71828e();
            int i2 = 0;
            for (int i3 = 0; i3 < strArr2.length; i3++) {
                String str2 = strArr2[i3];
                String[] strArr3 = C4908e.f15644a;
                eVar.mo63087v(34);
                int length2 = str2.length();
                int i4 = 0;
                for (int i5 = 0; i5 < length2; i5++) {
                    char charAt = str2.charAt(i5);
                    if (charAt < 128) {
                        str = strArr3[charAt];
                        if (str == null) {
                        }
                    } else if (charAt == 8232) {
                        str = "\\u2028";
                    } else if (charAt == 8233) {
                        str = "\\u2029";
                    }
                    if (i4 < i5) {
                        eVar.mo63092z(str2, i4, i5);
                    }
                    eVar.mo63059A(str);
                    i4 = i5 + 1;
                }
                if (i4 < length2) {
                    eVar.mo63092z(str2, i4, length2);
                }
                eVar.mo63087v(34);
                eVar.mo63062c();
                iVarArr[i3] = eVar.mo63073j(eVar.f191356b);
            }
            String[] strArr4 = (String[]) strArr.clone();
            C71836m mVar = C71837n.f191362a;
            List o = C69531o.m100938o(iVarArr);
            C69540x.m100808o(o);
            ArrayList arrayList = new ArrayList(length);
            for (int i6 = 0; i6 < length; i6++) {
                C71832i iVar = iVarArr[i6];
                arrayList.add(-1);
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            C69664n.m101059e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            Integer[] numArr = (Integer[]) array;
            List g = C69540x.m100949g(Arrays.copyOf(numArr, numArr.length));
            int i7 = 0;
            int i8 = 0;
            while (i7 < length) {
                C71832i iVar2 = iVarArr[i7];
                int i9 = i8 + 1;
                int size = o.size();
                C69664n.m101061g(o, "<this>");
                int size2 = o.size();
                if (size < 0) {
                    throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
                } else if (size <= size2) {
                    int i10 = size - 1;
                    int i11 = 0;
                    while (true) {
                        if (i11 > i10) {
                            i = -(i11 + 1);
                            break;
                        }
                        i = (i11 + i10) >>> 1;
                        int a = C69544a.m100954a((Comparable) o.get(i), iVar2);
                        if (a >= 0) {
                            if (a <= 0) {
                                break;
                            }
                            i10 = i - 1;
                        } else {
                            i11 = i + 1;
                        }
                    }
                    g.set(i, Integer.valueOf(i8));
                    i7++;
                    i8 = i9;
                    i2 = 0;
                } else {
                    throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
                }
            }
            if (((C71832i) o.get(i2)).mo63094b() > 0) {
                int i12 = 0;
                while (i12 < o.size()) {
                    C71832i iVar3 = (C71832i) o.get(i12);
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (i14 < o.size()) {
                        C71832i iVar4 = (C71832i) o.get(i14);
                        if (!iVar4.mo63101g(iVar3)) {
                            continue;
                            break;
                        } else if (iVar4.mo63094b() == iVar3.mo63094b()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("duplicate option: ");
                            sb.append(iVar4);
                            throw new IllegalArgumentException("duplicate option: ".concat(String.valueOf(iVar4)));
                        } else if (((Number) g.get(i14)).intValue() > ((Number) g.get(i12)).intValue()) {
                            o.remove(i14);
                            g.remove(i14);
                        } else {
                            i14++;
                        }
                    }
                    i12 = i13;
                }
                C71828e eVar2 = new C71828e();
                mVar.mo63109a(0, eVar2, 0, o, 0, o.size(), g);
                int[] iArr = new int[((int) (eVar2.f191356b / 4))];
                while (!eVar2.mo63079p()) {
                    iArr[i2] = eVar2.mo63065e();
                    i2++;
                }
                Object[] copyOf = Arrays.copyOf(iVarArr, length);
                C69664n.m101060f(copyOf, "copyOf(this, size)");
                return new C4906c(strArr4, new C71837n((C71832i[]) copyOf, iArr));
            }
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
