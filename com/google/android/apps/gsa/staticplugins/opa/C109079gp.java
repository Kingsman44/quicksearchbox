package com.google.android.apps.gsa.staticplugins.opa;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120918an;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120948d;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.gp */
/* compiled from: PG */
public final /* synthetic */ class C109079gp implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C120948d f303692a;

    /* renamed from: b */
    public final /* synthetic */ C2164c f303693b;

    public /* synthetic */ C109079gp(C120948d dVar, C2164c cVar) {
        this.f303692a = dVar;
        this.f303693b = cVar;
    }

    public final void accept(Object obj) {
        C52070ec ecVar;
        C120948d dVar = this.f303692a;
        C2164c cVar = this.f303693b;
        C120918an anVar = (C120918an) obj;
        dVar.mo105013b();
        C69664n.m101061g(anVar, "status");
        C120918an anVar2 = C120918an.UNKNOWN;
        int ordinal = anVar.ordinal();
        if (ordinal == 1) {
            ecVar = C36180b.f94544a;
            C69664n.m101060f(ecVar, "ok()");
        } else if (ordinal != 3) {
            ecVar = C36180b.m64578b(C52235kf.UNKNOWN);
            C69664n.m101060f(ecVar, "error(Status.UNKNOWN)");
        } else {
            ecVar = C36180b.m64578b(C52235kf.CANCELLED);
            C69664n.m101060f(ecVar, "error(Status.CANCELLED)");
        }
        cVar.mo5437b(ecVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
