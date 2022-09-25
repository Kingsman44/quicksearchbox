package com.google.android.libraries.search.assistant.performer.communication.p2732a.p2733a;

import com.google.assistant.p3745ab.C48269bz;
import com.google.assistant.p3745ab.C48273ca;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.a.a.m */
/* compiled from: PG */
final class C35503m implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C48273ca f93225a;

    /* renamed from: b */
    final /* synthetic */ C35505o f93226b;

    public C35503m(C35505o oVar, C48273ca caVar) {
        this.f93226b = oVar;
        this.f93225a = caVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C35506p.f93237a.mo56225c()).mo56382g(th)).mo56372aa(51717)).mo56386p("Internal error during getDurationFromCallLog.");
        synchronized (this.f93226b.f93231d) {
            C48269bz bzVar = (C48269bz) this.f93225a.toBuilder();
            bzVar.copyOnWrite();
            C48273ca caVar = (C48273ca) bzVar.instance;
            caVar.f124853a |= 1;
            caVar.f124854b = -1.0f;
            C35493c c = this.f93226b.f93235h.mo39681c((C48273ca) bzVar.build());
            this.f93226b.f93235h.f93243g.mo39711e(((C35491a) c).f93214a, ((C35491a) c).f93215b, C62722b.INTERNAL);
        }
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Long l = (Long) obj;
        synchronized (this.f93226b.f93231d) {
            C48269bz bzVar = (C48269bz) this.f93225a.toBuilder();
            bzVar.copyOnWrite();
            C48273ca caVar = (C48273ca) bzVar.instance;
            caVar.f124853a |= 1;
            caVar.f124854b = (float) l.longValue();
            C35493c c = this.f93226b.f93235h.mo39681c((C48273ca) bzVar.build());
            if (l.longValue() >= 0) {
                this.f93226b.f93235h.f93243g.mo39712f(((C35491a) c).f93214a, ((C35491a) c).f93215b);
            } else {
                this.f93226b.f93235h.f93243g.mo39711e(((C35491a) c).f93214a, ((C35491a) c).f93215b, C62722b.INTERNAL);
            }
        }
    }
}
