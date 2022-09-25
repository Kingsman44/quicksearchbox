package androidx.work.impl.utils;

import android.content.Context;
import androidx.work.C4380ad;
import androidx.work.C4409e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.utils.r */
/* compiled from: PG */
public final class C4611r {
    static {
        C4380ad.m12561i("ProcessUtils");
    }

    /* renamed from: a */
    public static final boolean m13005a(Context context, C4409e eVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(eVar, "configuration");
        String a = C4566a.f14419a.mo9521a();
        String str = eVar.f14067g;
        if (str == null || str.length() == 0) {
            return C69664n.m101066l(a, context.getApplicationInfo().processName);
        }
        return C69664n.m101066l(a, eVar.f14067g);
    }
}
