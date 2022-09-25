package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import android.content.Context;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.reminders.p6485a.C84254a;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.gms.reminders.C145775d;
import com.google.android.gms.reminders.LoadRemindersOptions;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3861at.C50251qd;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60836bq;
import com.google.p4479cg.C58078j;
import com.google.p4479cg.C58079k;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.h */
/* compiled from: PG */
public final class C114469h {

    /* renamed from: a */
    public static final C59071e f317409a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.worker.proactive.h");

    /* renamed from: b */
    public static final LoadRemindersOptions f317410b;

    /* renamed from: c */
    public final Context f317411c;

    /* renamed from: d */
    public final C21370a f317412d;

    /* renamed from: e */
    public final C86054o f317413e;

    /* renamed from: f */
    public final l f317414f;

    /* renamed from: g */
    public final C84254a f317415g;

    /* renamed from: h */
    public final C114396ar f317416h;

    /* renamed from: i */
    public final C60836bq f317417i = new C60836bq();

    /* renamed from: j */
    public final Executor f317418j;

    /* renamed from: k */
    public final C86124t f317419k;

    static {
        C145775d dVar = new C145775d();
        dVar.mo121944b(3);
        dVar.mo121945c(2);
        dVar.f394139f = true;
        f317410b = dVar.mo121943a();
    }

    public C114469h(Context context, C21370a aVar, C86054o oVar, l lVar, C84254a aVar2, C114396ar arVar, Executor executor, C86124t tVar) {
        this.f317411c = context;
        this.f317412d = aVar;
        this.f317413e = oVar;
        this.f317414f = lVar;
        this.f317415g = aVar2;
        this.f317416h = arVar;
        this.f317418j = executor;
        this.f317419k = tVar;
    }

    /* renamed from: a */
    public static final C58079k m189745a(C50251qd qdVar) {
        C58078j jVar = (C58078j) C58079k.f155250c.createBuilder();
        double d = qdVar.f130680c;
        jVar.copyOnWrite();
        ((C58079k) jVar.instance).f155252a = d;
        double d2 = qdVar.f130681d;
        jVar.copyOnWrite();
        ((C58079k) jVar.instance).f155253b = d2;
        return (C58079k) jVar.build();
    }
}
