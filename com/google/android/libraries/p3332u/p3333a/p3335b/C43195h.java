package com.google.android.libraries.p3332u.p3333a.p3335b;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.gmscompliance.p10800a.C144264d;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.libraries.p3332u.p3333a.p3334a.C43187a;
import com.google.android.libraries.p3332u.p3333a.p3337d.C43198a;
import com.google.android.libraries.p3332u.p3333a.p3338e.C43200a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4580v.C60950i;
import p3186j$.time.Instant;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.u.a.b.h */
/* compiled from: PG */
public final class C43195h implements C43187a {

    /* renamed from: a */
    public final Context f112912a;

    /* renamed from: b */
    public final C43198a f112913b;

    /* renamed from: c */
    public final C43200a f112914c;

    /* renamed from: d */
    public final C60950i f112915d;

    /* renamed from: e */
    private final C69464a f112916e;

    /* renamed from: f */
    private final C144264d f112917f;

    public C43195h(Context context, C69464a aVar, C43198a aVar2, C144264d dVar, C43200a aVar3, C60950i iVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(aVar, "featureEnabled");
        C69664n.m101061g(dVar, "client");
        C69664n.m101061g(aVar3, "storage");
        C69664n.m101061g(iVar, "timeSource");
        this.f112912a = context;
        this.f112916e = aVar;
        this.f112913b = aVar2;
        this.f112917f = dVar;
        this.f112914c = aVar3;
        this.f112915d = iVar;
    }

    /* renamed from: a */
    public final void mo46251a(Application application) {
        C59052c cVar = (C59052c) C43196i.f112918a.mo56224b();
        cVar.mo56379ah(new C59094n(48164));
        cVar.mo56386p("Initializing GMS Compliance Client Library...");
        application.registerActivityLifecycleCallbacks(new C43190c(this));
        mo46259b(C43191d.f112906a, C43192e.f112907a);
        C59052c cVar2 = (C59052c) C43196i.f112918a.mo56224b();
        cVar2.mo56379ah(new C59094n(48165));
        cVar2.mo56386p("Completed library init.");
    }

    /* renamed from: b */
    public final void mo46259b(C69615a aVar, C69615a aVar2) {
        C59052c cVar = (C59052c) C43196i.f112918a.mo56224b();
        cVar.mo56379ah(new C59094n(48166));
        cVar.mo56386p("Checking for device compliance...");
        if (!((Boolean) this.f112916e.mo17428b()).booleanValue()) {
            C59052c cVar2 = (C59052c) C43196i.f112918a.mo56224b();
            cVar2.mo56379ah(new C59094n(48167));
            cVar2.mo56386p("Feature is disabled!");
            C43196i.m76179b(this.f112912a, this.f112914c);
            return;
        }
        Instant a = this.f112915d.mo57444a();
        C69664n.m101060f(a, "timeSource.now()");
        C146006ab a2 = this.f112917f.mo119790a();
        a2.mo122495n(this.f112913b.f112919a, new C43193f(a, this, aVar2, aVar));
        a2.mo122494m(this.f112913b.f112919a, new C43194g());
    }
}
