package p5589m.p5590a;

import p5462h.p5473f.p5475b.C69664n;
import p5589m.C71844u;

/* renamed from: m.a.c */
/* compiled from: PG */
public final class C71822c {
    /* renamed from: a */
    public static final int m105124a(C71844u uVar, int i) {
        int i2;
        int[] iArr = uVar.f191384f;
        int i3 = i + 1;
        int length = ((Object[]) uVar.f191383e).length;
        C69664n.m101061g(iArr, "<this>");
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = (-i5) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : i2 ^ -1;
    }
}
