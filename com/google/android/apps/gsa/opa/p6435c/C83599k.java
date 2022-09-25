package com.google.android.apps.gsa.opa.p6435c;

import com.google.android.libraries.gsa.conversation.clientop.communication.p1843a.C22411a;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.assistant.p3745ab.C48269bz;
import com.google.assistant.p3745ab.C48273ca;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.opa.c.k */
/* compiled from: PG */
final class C83599k implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C48273ca f227904a;

    /* renamed from: b */
    final /* synthetic */ C83600l f227905b;

    public C83599k(C83600l lVar, C48273ca caVar) {
        this.f227905b = lVar;
        this.f227904a = caVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C83601m.f227916a.mo56225c()).mo56382g(th)).mo56372aa(6765)).mo56386p("Internal error during getDurationFromCallLog.");
        synchronized (this.f227905b.f227909d) {
            C22411a aVar = this.f227905b.f227912g;
            C48269bz bzVar = (C48269bz) this.f227904a.toBuilder();
            bzVar.copyOnWrite();
            C48273ca caVar = (C48273ca) bzVar.instance;
            caVar.f124853a |= 1;
            caVar.f124854b = -1.0f;
            aVar.mo27600a(11, (C48273ca) bzVar.build());
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        Long l = (Long) obj;
        synchronized (this.f227905b.f227909d) {
            C48269bz bzVar = (C48269bz) this.f227904a.toBuilder();
            bzVar.copyOnWrite();
            C48273ca caVar = (C48273ca) bzVar.instance;
            caVar.f124853a |= 1;
            caVar.f124854b = (float) l.longValue();
            this.f227905b.f227912g.mo27600a(l.longValue() >= 0 ? 10 : 11, (C48273ca) bzVar.build());
        }
    }
}
