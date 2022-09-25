package com.google.android.apps.search.assistant.platform.appintegration.grpc.p9003b;

import android.os.IBinder;
import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119616bb;
import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119633o;
import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119635q;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17881ak;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17909k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.b.f */
/* compiled from: PG */
public final class C119613f implements C119616bb {

    /* renamed from: a */
    public static final C59071e f333361a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.appintegration.grpc.b.f");

    /* renamed from: b */
    public final String f333362b;

    /* renamed from: c */
    private final C119608a f333363c;

    /* renamed from: d */
    private boolean f333364d;

    /* renamed from: e */
    private Optional f333365e = Optional.empty();

    /* renamed from: f */
    private final C119633o f333366f;

    public C119613f(String str, C70862aj ajVar, C119633o oVar) {
        this.f333362b = str;
        this.f333366f = oVar;
        this.f333363c = new C119608a(ajVar);
    }

    /* renamed from: a */
    public final String mo104438a() {
        return this.f333362b;
    }

    /* renamed from: b */
    public final void mo104439b() {
        C58976aa aaVar = C58975e.f156826a;
        this.f333364d = false;
        this.f333365e.ifPresent(C119609b.f333356a);
    }

    /* renamed from: c */
    public final void mo104440c(C17909k kVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f333363c.mo104468d(kVar);
    }

    /* renamed from: d */
    public final void mo104441d(Optional optional) {
        C59104x b = f333361a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Mosaic.GrpcSession");
        ((C59052c) ((C59052c) b).mo56372aa(34516)).mo56354G("#markPrimary - oldSession = %s; newSession = %s", optional.isPresent() ? ((C119616bb) optional.get()).mo104438a() : "absent", this.f333362b);
        if (!this.f333364d) {
            this.f333364d = true;
            optional.ifPresent(C119612e.f333360a);
            C119633o oVar = this.f333366f;
            this.f333365e = Optional.m71637of(C70876o.m103761b(oVar.f189039a.mo39510a(C119635q.m198557a(), oVar.f189040b), this.f333363c, true));
        }
    }

    /* renamed from: e */
    public final void mo104442e() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: f */
    public final void mo104443f() {
    }

    /* renamed from: g */
    public final void mo104444g(C17909k kVar) {
        C59104x b = f333361a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Mosaic.GrpcSession");
        ((C59052c) ((C59052c) b).mo56372aa(34518)).mo56389s("Mosaic callback: calls onUpdate for %s", kVar);
        this.f333363c.mo104468d(kVar);
    }

    /* renamed from: h */
    public final void mo104445h(C17881ak akVar) {
        this.f333365e.ifPresent(new C119610c(this, akVar));
    }

    /* renamed from: i */
    public final void mo104446i(IBinder iBinder) {
    }
}
