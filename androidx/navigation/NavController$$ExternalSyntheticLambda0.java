package androidx.navigation;

import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2389t;
import androidx.lifecycle.C2391v;
import java.util.Iterator;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final /* synthetic */ class NavController$$ExternalSyntheticLambda0 implements C2389t {

    /* renamed from: a */
    public /* synthetic */ C3807af f12267a;

    public /* synthetic */ NavController$$ExternalSyntheticLambda0(C3807af afVar) {
        this.f12267a = afVar;
    }

    /* renamed from: eN */
    public final void mo416eN(C2391v vVar, C2382m mVar) {
        C3807af afVar = this.f12267a;
        C69664n.m101061g(afVar, "this$0");
        C2383n d = mVar.mo5787d();
        C69664n.m101060f(d, "event.targetState");
        afVar.f12299m = d;
        if (afVar.f12288b != null) {
            Iterator it = afVar.f12292f.iterator();
            while (it.hasNext()) {
                C3892m mVar2 = (C3892m) it.next();
                C2383n d2 = mVar.mo5787d();
                C69664n.m101060f(d2, "event.targetState");
                mVar2.f12479d = d2;
                mVar2.mo8134b();
            }
        }
    }
}
