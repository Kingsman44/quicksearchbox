package com.google.android.apps.gsa.staticplugins.opa.samson.p8435j;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.C73845bq;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110315aa;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110318ad;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110337aw;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110340az;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110370cb;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110396z;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j.aa */
/* compiled from: PG */
public final class C110190aa extends C84036z {

    /* renamed from: a */
    public static final C59071e f307031a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.j.aa");

    /* renamed from: b */
    public final Context f307032b;

    /* renamed from: c */
    public final C86124t f307033c;

    /* renamed from: d */
    public final C68214a f307034d;

    /* renamed from: e */
    public final C83893b f307035e;

    /* renamed from: f */
    public final C58881cr f307036f;

    /* renamed from: g */
    public final boolean f307037g;

    /* renamed from: h */
    private final C58833ax f307038h;

    /* renamed from: i */
    private final C84026u f307039i;

    /* renamed from: j */
    private final C110340az f307040j;

    /* renamed from: k */
    private final C110370cb f307041k;

    public C110190aa(C58833ax axVar, Context context, C86124t tVar, C68214a aVar, C83893b bVar, C58881cr crVar, C84026u uVar, C110340az azVar, C110370cb cbVar, Bundle bundle) {
        this.f307038h = axVar;
        this.f307032b = context;
        this.f307033c = tVar;
        this.f307034d = aVar;
        this.f307035e = bVar;
        this.f307036f = crVar;
        this.f307039i = uVar;
        this.f307040j = azVar;
        this.f307041k = cbVar;
        this.f307037g = bundle.getBoolean("dreamliner_seq_arg_pf_from_settings", false);
    }

    /* renamed from: b */
    public final boolean mo98463b() {
        if (!this.f307035e.mo77278a().mo56113h() || this.f307036f.mo6453a() == null) {
            return false;
        }
        C73845bq bqVar = (C73845bq) this.f307036f.mo6453a();
        bqVar.getClass();
        return bqVar.mo65330d() != null;
    }

    /* renamed from: d */
    public final boolean mo98464d() {
        List list = (List) this.f307041k.f307609a.mo3842a();
        return list != null && !list.isEmpty();
    }

    /* renamed from: h */
    public final C58485gu mo77495h() {
        C60870cx cxVar;
        if (this.f307038h.mo56113h()) {
            cxVar = (C60870cx) this.f307038h.mo56107c();
        } else {
            cxVar = this.f307040j.mo98580b(this.f307041k, C58836b.f156633a);
        }
        C110340az azVar = this.f307040j;
        C110370cb cbVar = this.f307041k;
        C110318ad adVar = (C110318ad) azVar.f307547f.mo27525b();
        C58976aa aaVar = C58975e.f156826a;
        C60870cx i = adVar.f307479f.mo28209i(adVar.f307479f.mo28210j(adVar.mo98570c(), "fetch settings", new C110396z(adVar)), "parse response", C110315aa.f307471a);
        azVar.f307550i.mo28211k(i, "getsettings", new C110337aw(cbVar));
        return C58485gu.m89847o(this.f307039i.mo77487a(C60856cj.m92897f(cxVar, i), C110225w.f307140a), new C110228z(this));
    }
}
