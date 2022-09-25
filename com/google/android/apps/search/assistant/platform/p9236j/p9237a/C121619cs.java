package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.google.android.libraries.search.assistant.invocation.p2632h.p2633a.C33884b;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.p5573a.C71347aa;
import kotlinx.coroutines.p5573a.C71348ab;
import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.cs */
/* compiled from: PG */
public final class C121619cs implements C33884b {

    /* renamed from: a */
    final /* synthetic */ C71361ao f337462a;

    public C121619cs(C71361ao aoVar) {
        this.f337462a = aoVar;
    }

    /* renamed from: a */
    public final void mo39111a(String str) {
        C69664n.m101061g(str, "activityId");
        C71361ao aoVar = this.f337462a;
        C121557ak akVar = (C121557ak) C121558al.f337306c.createBuilder();
        C69664n.m101060f(akVar, "newBuilder()");
        C121635dh a = C69664n.m101061g(akVar, "builder");
        a.mo105278b(str);
        C121557ak akVar2 = a.f337485a;
        akVar2.copyOnWrite();
        ((C121558al) akVar2.instance).f337309b = false;
        Object w = aoVar.mo62730w(a.mo105277a());
        C71361ao aoVar2 = this.f337462a;
        if (w instanceof C71347aa) {
            aoVar2.mo62727D(C71348ab.m103984b(w));
            C71423ax.m104198c(aoVar2, (CancellationException) null);
        }
    }

    /* renamed from: b */
    public final void mo39112b(String str) {
        C69664n.m101061g(str, "activityId");
        C71361ao aoVar = this.f337462a;
        C121557ak akVar = (C121557ak) C121558al.f337306c.createBuilder();
        C69664n.m101060f(akVar, "newBuilder()");
        C121635dh a = C69664n.m101061g(akVar, "builder");
        a.mo105278b(str);
        C121557ak akVar2 = a.f337485a;
        akVar2.copyOnWrite();
        ((C121558al) akVar2.instance).f337309b = true;
        Object w = aoVar.mo62730w(a.mo105277a());
        C71361ao aoVar2 = this.f337462a;
        if (w instanceof C71347aa) {
            aoVar2.mo62727D(C71348ab.m103984b(w));
            C71423ax.m104198c(aoVar2, (CancellationException) null);
        }
    }
}
