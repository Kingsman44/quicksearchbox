package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import android.os.IBinder;
import com.google.android.apps.search.assistant.platform.appintegration.p8997e.C119532a;
import com.google.android.apps.search.assistant.platform.appintegration.p8997e.C119533b;
import com.google.android.libraries.assistant.p1467d.p1472c.p1474b.C17868h;
import com.google.android.libraries.assistant.p1467d.p1472c.p1474b.C17869i;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17873ac;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17880aj;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17881ak;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17882al;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17883am;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17906h;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17908j;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17909k;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17914p;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import java.util.HashSet;
import java.util.Set;
import p3186j$.util.Optional;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.ak */
/* compiled from: PG */
public final class C119591ak implements C119616bb {

    /* renamed from: h */
    private static final C59071e f333303h = C59071e.m91332i("com.google.android.apps.search.assistant.platform.appintegration.grpc.ak");

    /* renamed from: a */
    public final String f333304a;

    /* renamed from: b */
    public final C119603aw f333305b;

    /* renamed from: c */
    public final C119617bc f333306c;

    /* renamed from: d */
    public final C119533b f333307d;

    /* renamed from: e */
    boolean f333308e;

    /* renamed from: f */
    public final Set f333309f = new HashSet();

    /* renamed from: g */
    final C17873ac f333310g = ((C17873ac) C17880aj.f51221i.createBuilder());

    /* renamed from: i */
    private final C70862aj f333311i;

    public C119591ak(String str, C70862aj ajVar, C119603aw awVar, C119617bc bcVar, C119533b bVar) {
        this.f333304a = str;
        this.f333311i = ajVar;
        C60826bg bgVar = C60826bg.f164896a;
        this.f333305b = awVar;
        this.f333306c = bcVar;
        this.f333307d = bVar;
        bVar.mo104418a(C119532a.KARAJAN_V1, str);
    }

    /* renamed from: j */
    private final void m198479j(C17909k kVar) {
        C70862aj ajVar = this.f333311i;
        C17868h hVar = (C17868h) C17869i.f51204c.createBuilder();
        hVar.copyOnWrite();
        C17869i iVar = (C17869i) hVar.instance;
        kVar.getClass();
        iVar.f51207b = kVar;
        iVar.f51206a |= 1;
        ajVar.mo20123c((C17869i) hVar.build());
    }

    /* renamed from: a */
    public final String mo104438a() {
        return this.f333304a;
    }

    /* renamed from: b */
    public final void mo104439b() {
        this.f333308e = false;
        C119603aw awVar = this.f333305b;
        C17882al alVar = (C17882al) C17883am.f51242f.createBuilder();
        alVar.copyOnWrite();
        C17883am amVar = (C17883am) alVar.instance;
        amVar.f51245b = 5;
        amVar.f51246c = true;
        String str = this.f333304a;
        alVar.copyOnWrite();
        C17883am amVar2 = (C17883am) alVar.instance;
        str.getClass();
        amVar2.f51244a = 1 | amVar2.f51244a;
        amVar2.f51247d = str;
        awVar.mo104452a((C17883am) alVar.build());
    }

    /* renamed from: c */
    public final void mo104440c(C17909k kVar) {
        m198479j(kVar);
    }

    /* renamed from: d */
    public final void mo104441d(Optional optional) {
        if (optional.isPresent()) {
            ((C119616bb) optional.get()).mo104438a();
        }
        if (!this.f333308e) {
            this.f333308e = true;
            optional.ifPresent(C119589ai.f333300a);
            C119603aw awVar = this.f333305b;
            C17882al alVar = (C17882al) C17883am.f51242f.createBuilder();
            alVar.copyOnWrite();
            C17883am amVar = (C17883am) alVar.instance;
            amVar.f51245b = 4;
            amVar.f51246c = true;
            String str = this.f333304a;
            alVar.copyOnWrite();
            C17883am amVar2 = (C17883am) alVar.instance;
            str.getClass();
            amVar2.f51244a |= 1;
            amVar2.f51247d = str;
            awVar.mo104452a((C17883am) alVar.build());
            C119603aw awVar2 = this.f333305b;
            C17882al alVar2 = (C17882al) C17883am.f51242f.createBuilder();
            C17914p pVar = (C17914p) C17881ak.f51231h.createBuilder();
            C17873ac acVar = this.f333310g;
            pVar.copyOnWrite();
            C17881ak akVar = (C17881ak) pVar.instance;
            C17880aj ajVar = (C17880aj) acVar.build();
            ajVar.getClass();
            akVar.f51235c = ajVar;
            akVar.f51233a |= 2;
            alVar2.copyOnWrite();
            C17883am amVar3 = (C17883am) alVar2.instance;
            C17881ak akVar2 = (C17881ak) pVar.build();
            akVar2.getClass();
            amVar3.f51246c = akVar2;
            amVar3.f51245b = 3;
            String str2 = this.f333304a;
            alVar2.copyOnWrite();
            C17883am amVar4 = (C17883am) alVar2.instance;
            str2.getClass();
            amVar4.f51244a = 1 | amVar4.f51244a;
            amVar4.f51247d = str2;
            awVar2.mo104452a((C17883am) alVar2.build());
        }
    }

    /* renamed from: e */
    public final void mo104442e() {
        C17906h hVar = (C17906h) C17909k.f51314c.createBuilder();
        C17908j jVar = C17908j.ASSISTANT_CONNECTION_LOST;
        hVar.copyOnWrite();
        C17909k kVar = (C17909k) hVar.instance;
        kVar.f51317b = jVar.f51313l;
        kVar.f51316a |= 1;
        m198479j((C17909k) hVar.build());
    }

    /* renamed from: f */
    public final void mo104443f() {
        C119603aw awVar = this.f333305b;
        C17882al alVar = (C17882al) C17883am.f51242f.createBuilder();
        alVar.copyOnWrite();
        C17883am amVar = (C17883am) alVar.instance;
        amVar.f51245b = 6;
        amVar.f51246c = true;
        String str = this.f333304a;
        alVar.copyOnWrite();
        C17883am amVar2 = (C17883am) alVar.instance;
        str.getClass();
        amVar2.f51244a = 1 | amVar2.f51244a;
        amVar2.f51247d = str;
        awVar.mo104452a((C17883am) alVar.build());
    }

    /* renamed from: g */
    public final void mo104444g(C17909k kVar) {
        ((C59052c) ((C59052c) f333303h.mo56224b()).mo56372aa(34475)).mo56389s("Karajan callback: calls onUpdate for %s", kVar);
        m198479j(kVar);
    }

    /* renamed from: h */
    public final void mo104445h(C17881ak akVar) {
        C47810es.m84977q(new C119590aj(this, akVar)).run();
    }

    /* renamed from: i */
    public final void mo104446i(IBinder iBinder) {
        C47810es.m84977q(new C119588ah(this, iBinder)).run();
    }
}
