package androidx.p116i.p117a.p118a;

import android.util.Log;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.i.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C2281b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f6430a;

    /* renamed from: b */
    public final /* synthetic */ C2294o f6431b;

    public /* synthetic */ C2281b(String str, C2294o oVar) {
        this.f6430a = str;
        this.f6431b = oVar;
    }

    public final void run() {
        String str = this.f6430a;
        C2294o oVar = this.f6431b;
        Log.e("FragmentStrictMode", C69664n.m101057c("Policy violation with PENALTY_DEATH in ", str), oVar);
        throw oVar;
    }
}
