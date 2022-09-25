package androidx.work.impl.utils;

import java.util.ArrayList;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;

/* renamed from: androidx.work.impl.utils.t */
/* compiled from: PG */
public final class C4613t {
    /* renamed from: a */
    public static final void m13006a(StringBuilder sb, int i) {
        if (i > 0) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add("?");
            }
            sb.append(C69540x.m100851ag(arrayList, ",", (CharSequence) null, (CharSequence) null, (C69626l) null, 62));
        }
    }
}
