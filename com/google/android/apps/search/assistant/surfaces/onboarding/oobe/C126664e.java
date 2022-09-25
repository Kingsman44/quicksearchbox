package com.google.android.apps.search.assistant.surfaces.onboarding.oobe;

import android.os.Bundle;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import com.google.protos.p4759ad.p4760a.p4761a.p4788b.p4789a.p4790a.p4791a.p4792a.p4793a.C63145c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.oobe.e */
/* compiled from: PG */
public final class C126664e {

    /* renamed from: a */
    public static final C59071e f348808a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.onboarding.oobe.e");

    /* renamed from: b */
    public final OobeActivity f348809b;

    /* renamed from: c */
    public final C45989b f348810c;

    /* renamed from: d */
    public final C28306ab f348811d;

    /* renamed from: e */
    public final C28310af f348812e;

    /* renamed from: f */
    public C63145c f348813f;

    public C126664e(OobeActivity oobeActivity, C45989b bVar, C32158h hVar, C28306ab abVar, C28310af afVar) {
        this.f348809b = oobeActivity;
        this.f348810c = bVar;
        hVar.mo37971b(oobeActivity, new C126663d(this), bVar);
        Bundle extras = oobeActivity.getIntent().getExtras();
        if (!(extras == null || extras.getParcelable("oobe_args") == null)) {
            this.f348813f = (C63145c) ProtoParsers.m95522e(extras, "oobe_args", C63145c.f170514c, C62921ba.m95368a());
        }
        this.f348811d = abVar;
        this.f348812e = afVar;
    }
}
