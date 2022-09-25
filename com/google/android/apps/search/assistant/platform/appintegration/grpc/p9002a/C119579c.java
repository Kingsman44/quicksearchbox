package com.google.android.apps.search.assistant.platform.appintegration.grpc.p9002a;

import android.os.IBinder;
import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119616bb;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1073a.C14638a;
import com.google.android.libraries.assistant.p1467d.p1472c.p1474b.C17868h;
import com.google.android.libraries.assistant.p1467d.p1472c.p1474b.C17869i;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17881ak;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17882al;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17883am;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17906h;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17908j;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17909k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.a.c */
/* compiled from: PG */
public final class C119579c implements C119616bb {

    /* renamed from: a */
    private static final C59071e f333275a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.appintegration.grpc.a.c");

    /* renamed from: b */
    private final C14638a f333276b;

    /* renamed from: c */
    private final C119578b f333277c = new C119578b(this);

    /* renamed from: d */
    private final String f333278d;

    /* renamed from: e */
    private final C70862aj f333279e;

    /* renamed from: f */
    private boolean f333280f;

    public C119579c(String str, C70862aj ajVar, C14638a aVar) {
        this.f333278d = str;
        this.f333279e = ajVar;
        this.f333276b = aVar;
    }

    /* renamed from: a */
    public final String mo104438a() {
        return this.f333278d;
    }

    /* renamed from: b */
    public final void mo104439b() {
        C58976aa aaVar = C58975e.f156826a;
        this.f333280f = false;
        this.f333276b.mo21575g();
    }

    /* renamed from: c */
    public final void mo104440c(C17909k kVar) {
        C58976aa aaVar = C58975e.f156826a;
        mo104447j(kVar);
    }

    /* renamed from: d */
    public final void mo104441d(Optional optional) {
        C58976aa aaVar = C58975e.f156826a;
        if (optional.isPresent()) {
            ((C119616bb) optional.get()).mo104438a();
        }
        if (!this.f333280f) {
            this.f333280f = true;
            optional.ifPresent(C119577a.f333273a);
            this.f333276b.mo21581o(this.f333278d, this.f333277c);
        }
    }

    /* renamed from: e */
    public final void mo104442e() {
        C58976aa aaVar = C58975e.f156826a;
        C17906h hVar = (C17906h) C17909k.f51314c.createBuilder();
        C17908j jVar = C17908j.ASSISTANT_CONNECTION_LOST;
        hVar.copyOnWrite();
        C17909k kVar = (C17909k) hVar.instance;
        kVar.f51317b = jVar.f51313l;
        kVar.f51316a |= 1;
        mo104447j((C17909k) hVar.build());
    }

    /* renamed from: f */
    public final void mo104443f() {
        C14638a aVar = this.f333276b;
        C17882al alVar = (C17882al) C17883am.f51242f.createBuilder();
        alVar.copyOnWrite();
        C17883am amVar = (C17883am) alVar.instance;
        amVar.f51245b = 6;
        amVar.f51246c = true;
        String str = this.f333278d;
        alVar.copyOnWrite();
        C17883am amVar2 = (C17883am) alVar.instance;
        str.getClass();
        amVar2.f51244a = 1 | amVar2.f51244a;
        amVar2.f51247d = str;
        aVar.mo21574f((C17883am) alVar.build());
    }

    /* renamed from: g */
    public final void mo104444g(C17909k kVar) {
        C59104x b = f333275a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.GrpcSession");
        ((C59052c) ((C59052c) b).mo56372aa(34504)).mo56389s("Morris callback: calls onUpdate for %s", kVar);
        mo104447j(kVar);
    }

    /* renamed from: h */
    public final void mo104445h(C17881ak akVar) {
        C14638a aVar = this.f333276b;
        C17882al alVar = (C17882al) C17883am.f51242f.createBuilder();
        alVar.copyOnWrite();
        C17883am amVar = (C17883am) alVar.instance;
        akVar.getClass();
        amVar.f51246c = akVar;
        amVar.f51245b = 3;
        String str = this.f333278d;
        alVar.copyOnWrite();
        C17883am amVar2 = (C17883am) alVar.instance;
        str.getClass();
        amVar2.f51244a |= 1;
        amVar2.f51247d = str;
        aVar.mo21574f((C17883am) alVar.build());
    }

    /* renamed from: i */
    public final void mo104446i(IBinder iBinder) {
        this.f333276b.mo21576h(iBinder);
    }

    /* renamed from: j */
    public final void mo104447j(C17909k kVar) {
        C70862aj ajVar = this.f333279e;
        C17868h hVar = (C17868h) C17869i.f51204c.createBuilder();
        hVar.copyOnWrite();
        C17869i iVar = (C17869i) hVar.instance;
        kVar.getClass();
        iVar.f51207b = kVar;
        iVar.f51206a |= 1;
        ajVar.mo20123c((C17869i) hVar.build());
    }
}
