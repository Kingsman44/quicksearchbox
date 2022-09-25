package com.google.android.apps.gsa.staticplugins.opa.appintegration;

import android.content.SharedPreferences;
import android.util.Base64;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.l.a;
import com.google.android.apps.gsa.assistant.shared.l.b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17880aj;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58872ci;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.r */
/* compiled from: PG */
public final class C107348r implements C58881cr, C90991b {

    /* renamed from: a */
    private static final C59071e f298749a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.appintegration.r");

    /* renamed from: b */
    private b f298750b;

    /* renamed from: c */
    private b f298751c = b.d;

    /* renamed from: d */
    private final SharedPreferences f298752d;

    public C107348r(SharedPreferences sharedPreferences) {
        this.f298752d = sharedPreferences;
    }

    /* renamed from: b */
    public final b mo6453a() {
        if (this.f298750b == null) {
            C58872ci d = C58872ci.m90947d(C58274c.f155808a);
            try {
                byte[] decode = Base64.decode(this.f298752d.getString("opa_app_integration_status", BuildConfig.FLAVOR), 0);
                if (decode != null) {
                    this.f298750b = C62942bv.parseFrom((C62942bv) b.d, decode);
                }
                d.mo56162g();
                C58976aa aaVar = C58975e.f156826a;
                d.mo56158a(TimeUnit.MILLISECONDS);
            } catch (C62974ct | IllegalArgumentException e) {
                C59104x d2 = f298749a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "OpaAIStatusSupplier");
                ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(23680)).mo56386p("Failed to get OpaAppIntegrationStatus from cache");
                this.f298750b = b.d;
            }
        }
        return this.f298750b;
    }

    /* renamed from: c */
    public final void mo95946c() {
        a builder = this.f298751c.toBuilder();
        String str = mo6453a().b;
        builder.copyOnWrite();
        b bVar = builder.instance;
        str.getClass();
        bVar.a |= 1;
        bVar.b = str;
        this.f298751c = builder.build();
        a builder2 = mo6453a().toBuilder();
        builder2.copyOnWrite();
        b bVar2 = builder2.instance;
        bVar2.a &= -2;
        bVar2.b = b.d.b;
        mo95949g(builder2.build());
    }

    /* renamed from: e */
    public final void mo95947e() {
        a builder = this.f298751c.toBuilder();
        C17880aj ajVar = mo6453a().c;
        if (ajVar == null) {
            ajVar = C17880aj.f51221i;
        }
        builder.copyOnWrite();
        b bVar = builder.instance;
        ajVar.getClass();
        bVar.c = ajVar;
        bVar.a |= 2;
        this.f298751c = builder.build();
        a builder2 = mo6453a().toBuilder();
        builder2.copyOnWrite();
        b bVar2 = builder2.instance;
        bVar2.c = null;
        bVar2.a &= -3;
        mo95949g(builder2.build());
    }

    /* renamed from: f */
    public final void mo95948f(String str) {
        a builder = mo6453a().toBuilder();
        builder.copyOnWrite();
        b bVar = builder.instance;
        str.getClass();
        bVar.a |= 1;
        bVar.b = str;
        mo95949g(builder.build());
    }

    /* renamed from: g */
    public final void mo95949g(b bVar) {
        this.f298750b = bVar;
        this.f298752d.edit().putString("opa_app_integration_status", Base64.encodeToString(this.f298750b.toByteArray(), 0)).apply();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("OpaAppIntegrationStatusSupplier");
        fVar.mo85279c("status").mo85276a(C90752i.m148231e(this.f298750b));
    }
}
