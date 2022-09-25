package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8198b;

import android.content.ServiceConnection;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6414f.p6415a.C83219b;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c.C106286n;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import java.util.ArrayList;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.b.u */
/* compiled from: PG */
public final class C106261u implements C106264x {

    /* renamed from: a */
    public static final C59071e f296468a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ak.c.b.u");

    /* renamed from: b */
    public static final Duration f296469b = Duration.ofSeconds(1);

    /* renamed from: c */
    static final Duration f296470c = Duration.ofSeconds(4);

    /* renamed from: d */
    public static final Duration f296471d = Duration.ofSeconds(60);

    /* renamed from: e */
    public final C22871g f296472e;

    /* renamed from: f */
    public final Optional f296473f;

    /* renamed from: g */
    public final C83305i f296474g;

    /* renamed from: h */
    public final C60950i f296475h;

    /* renamed from: i */
    public final C91142g f296476i;

    /* renamed from: j */
    public final C22871g f296477j;

    /* renamed from: k */
    public final List f296478k = new ArrayList();

    /* renamed from: l */
    public Optional f296479l = Optional.empty();

    /* renamed from: m */
    public C106260t f296480m = new C106257q(this);

    /* renamed from: n */
    public final C83219b f296481n;

    /* renamed from: o */
    public final C106242b f296482o;

    public C106261u(C106242b bVar, C22871g gVar, Optional optional, C83219b bVar2, C83305i iVar, C60950i iVar2, C22871g gVar2, C91142g gVar3) {
        this.f296482o = bVar;
        this.f296472e = gVar;
        this.f296473f = optional;
        this.f296481n = bVar2;
        this.f296474g = iVar;
        this.f296475h = iVar2;
        this.f296477j = gVar2;
        this.f296476i = gVar3;
    }

    /* renamed from: a */
    public final void mo95476a(ServiceConnection serviceConnection, String str) {
        try {
            this.f296482o.f296443a.unbindService(serviceConnection);
        } catch (Throwable th) {
            Throwable th2 = th;
            C59104x c = f296468a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NgaEntryPointEventSendr");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th2)).mo56372aa(25194)).mo56354G("Unbinding failed (%s): %s", str, th2.getMessage());
        }
        C106257q qVar = new C106257q(this);
        C59104x b = f296468a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NgaEntryPointEventSendr");
        ((C59052c) ((C59052c) b).mo56372aa(25196)).mo56359L("State changed: %s => %s (%s)", this.f296480m.mo95471a(), "Disconnected", str);
        this.f296480m = qVar;
    }

    /* renamed from: b */
    public final void mo95477b(C106260t tVar) {
        C59104x b = f296468a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NgaEntryPointEventSendr");
        ((C59052c) ((C59052c) b).mo56372aa(25195)).mo56354G("State changed: %s => %s", this.f296480m.mo95471a(), tVar.mo95471a());
        this.f296480m = tVar;
        tVar.mo95474d();
    }

    /* renamed from: c */
    public final void mo95478c(C106286n nVar, Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        this.f296472e.mo28212l("sendEventData", new C106243c(this, nVar, bundle));
    }
}
