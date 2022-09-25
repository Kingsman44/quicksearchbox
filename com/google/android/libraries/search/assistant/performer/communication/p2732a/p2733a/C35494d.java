package com.google.android.libraries.search.assistant.performer.communication.p2732a.p2733a;

import com.google.assistant.p3745ab.C48269bz;
import com.google.assistant.p3745ab.C48273ca;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C35494d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C35505o f93216a;

    /* renamed from: b */
    public final /* synthetic */ long f93217b;

    public /* synthetic */ C35494d(C35505o oVar, long j) {
        this.f93216a = oVar;
        this.f93217b = j;
    }

    public final void run() {
        C35505o oVar = this.f93216a;
        long j = this.f93217b;
        synchronized (oVar.f93231d) {
            oVar.mo39679b();
            C48269bz bzVar = (C48269bz) C48273ca.f124851d.createBuilder();
            float f = (float) j;
            bzVar.copyOnWrite();
            C48273ca caVar = (C48273ca) bzVar.instance;
            caVar.f124853a |= 1;
            caVar.f124854b = f;
            bzVar.copyOnWrite();
            C48273ca caVar2 = (C48273ca) bzVar.instance;
            caVar2.f124853a |= 2;
            caVar2.f124855c = f;
            C35493c c = oVar.f93235h.mo39681c((C48273ca) bzVar.build());
            oVar.f93235h.f93243g.mo39714h(((C35491a) c).f93214a, ((C35491a) c).f93215b, C62722b.DEADLINE_EXCEEDED);
        }
    }
}
