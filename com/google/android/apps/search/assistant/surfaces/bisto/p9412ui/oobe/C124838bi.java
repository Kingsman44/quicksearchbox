package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.bi */
/* compiled from: PG */
public final class C124838bi {

    /* renamed from: a */
    public static final C59071e f344408a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.bi");

    /* renamed from: b */
    public final OobeActivity f344409b;

    /* renamed from: c */
    public C124844bo f344410c = C124844bo.f344417m;

    /* renamed from: d */
    public final C45989b f344411d;

    /* renamed from: e */
    public final C28306ab f344412e;

    /* renamed from: f */
    public final C28310af f344413f;

    /* renamed from: g */
    public final C47770dh f344414g;

    public C124838bi(OobeActivity oobeActivity, C45989b bVar, C28306ab abVar, C28310af afVar, C47770dh dhVar) {
        this.f344409b = oobeActivity;
        this.f344411d = bVar;
        this.f344412e = abVar;
        this.f344413f = afVar;
        this.f344414g = dhVar;
    }

    /* renamed from: a */
    public final void mo106667a() {
        C59104x d = f344408a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "OobeActivity");
        ((C59052c) ((C59052c) d).mo56372aa(36339)).mo56386p("Failure exit");
        this.f344409b.setResult(0);
        this.f344409b.finish();
    }
}
