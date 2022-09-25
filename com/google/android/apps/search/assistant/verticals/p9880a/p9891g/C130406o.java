package com.google.android.apps.search.assistant.verticals.p9880a.p9891g;

import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.binaries.satin.app.aox;
import com.google.android.apps.search.assistant.verticals.p9880a.p9884c.C130353c;
import com.google.android.libraries.search.assistant.invocation.p2632h.p2633a.C33885c;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51688app;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62974ct;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.g.o */
/* compiled from: PG */
public final class C130406o implements C35472h {

    /* renamed from: a */
    public static final C59071e f357353a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.a.g.o");

    /* renamed from: b */
    public final C130353c f357354b;

    /* renamed from: c */
    public final C33885c f357355c;

    /* renamed from: d */
    public final C60888db f357356d;

    /* renamed from: e */
    public final aox f357357e;

    public C130406o(C130353c cVar, C33885c cVar2, aox aox, C60888db dbVar) {
        this.f357354b = cVar;
        this.f357355c = cVar2;
        this.f357357e = aox;
        this.f357356d = dbVar;
    }

    /* renamed from: b */
    public static boolean m212846b(C58485gu guVar) {
        return Collection.EL.stream(guVar).anyMatch(C130401j.f357344a);
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        ((C59052c) ((C59052c) f357353a.mo56224b()).mo56372aa(39429)).mo56386p("performing device.WAIT_ACTIVITY ClientOp");
        C36183e.m64586d(dyVar, "device.WAIT_ACTIVITY");
        try {
            C51688app app = (C51688app) C36183e.m64585c(dyVar, "wait_activity_args", C51688app.f135571d.getParserForType()).get();
            return C60846c.m92878g(C60922j.m93044g(C60856cj.m92908q(C60922j.m93045h(C2169h.m6027a(new C130402k(this, app)), C47810es.m84966f(new C130403l(this)), this.f357356d), app.f135575c, TimeUnit.MILLISECONDS, this.f357356d), C47810es.m84963c(new C130397f(this)), this.f357356d), Exception.class, C47810es.m84963c(C130398g.f357340a), this.f357356d);
        } catch (C62974ct | NoSuchElementException unused) {
            C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
            C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
            C52235kf kfVar = C52235kf.INVALID_ARGUMENT;
            kdVar.copyOnWrite();
            C52236kg kgVar = (C52236kg) kdVar.instance;
            kgVar.f137092b = kfVar.f137088t;
            kgVar.f137091a |= 1;
            dzVar.copyOnWrite();
            C52070ec ecVar = (C52070ec) dzVar.instance;
            C52236kg kgVar2 = (C52236kg) kdVar.build();
            kgVar2.getClass();
            ecVar.f136654b = kgVar2;
            ecVar.f136653a |= 1;
            return C60856cj.m92900i((C52070ec) dzVar.build());
        }
    }
}
