package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2386q;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32466y;
import com.google.assistant.p3897e.p3921j.ady;
import com.google.assistant.p3931f.p3940d.p3941a.C52858ah;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71613bn;
import kotlinx.coroutines.C71641cn;
import kotlinx.coroutines.C71683ds;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.g.a.e */
/* compiled from: PG */
public final class C120949e implements C120948d {

    /* renamed from: a */
    private final C69585o f336269a;

    /* renamed from: b */
    private final C71422aw f336270b;

    /* renamed from: c */
    private final AtomicReference f336271c = new AtomicReference();

    /* renamed from: d */
    private final C32466y f336272d;

    public C120949e(C69585o oVar, C71422aw awVar, C32466y yVar) {
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(awVar, "lightWeightCoroutine");
        this.f336269a = oVar;
        this.f336270b = awVar;
        this.f336272d = yVar;
    }

    /* renamed from: a */
    public final AtomicReference mo105012a() {
        return this.f336271c;
    }

    /* renamed from: b */
    public final void mo105013b() {
        C120947c cVar = (C120947c) this.f336271c.get();
        if (cVar != null) {
            cVar.mo104961b();
        }
    }

    /* renamed from: c */
    public final void mo105014c(ady ady, C120904a aVar, C52858ah ahVar) {
        C69664n.m101061g(ady, "bindArgs");
        C69664n.m101061g(ahVar, "hostProps");
        mo105016e(this.f336270b, ady, aVar, ahVar);
    }

    /* renamed from: d */
    public final void mo105015d(C2391v vVar, ady ady, C120904a aVar, C52858ah ahVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        C69664n.m101061g(vVar, "lifecycleOwner");
        C69664n.m101061g(ady, "bindArgs");
        C69664n.m101061g(ahVar, "hostProps");
        C69664n.m101061g(vVar, "<this>");
        C2384o lifecycle = vVar.getLifecycle();
        C69664n.m101060f(lifecycle, "lifecycle");
        C69664n.m101061g(lifecycle, "<this>");
        loop0:
        while (true) {
            lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) lifecycle.f6605a.get();
            if (lifecycleCoroutineScopeImpl != null) {
                break;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, C71641cn.m104621a(new C71683ds(), C71613bn.m104563a().mo62770h()));
            AtomicReference atomicReference = lifecycle.f6605a;
            while (true) {
                if (atomicReference.compareAndSet((Object) null, lifecycleCoroutineScopeImpl)) {
                    C71803m.m105043d(lifecycleCoroutineScopeImpl, C71613bn.m104563a().mo62770h(), (C71424ay) null, new C2386q(lifecycleCoroutineScopeImpl, (C69577g) null), 2);
                    break loop0;
                } else if (atomicReference.get() != null) {
                }
            }
        }
        mo105016e(lifecycleCoroutineScopeImpl, ady, aVar, ahVar);
    }

    /* renamed from: e */
    public final void mo105016e(C71422aw awVar, ady ady, C120904a aVar, C52858ah ahVar) {
        C69664n.m101061g(awVar, "activityScope");
        C69664n.m101061g(ady, "bindArgs");
        C69664n.m101061g(ahVar, "hostProps");
        this.f336271c.set(new C120917am(awVar, this.f336269a, this.f336272d, ady, aVar, ahVar));
    }
}
