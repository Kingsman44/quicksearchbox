package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import androidx.activity.result.C0816c;
import androidx.activity.result.p046a.C0813f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9413a.C124786a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.p */
/* compiled from: PG */
public final class C124919p {

    /* renamed from: a */
    public static final C59071e f344655a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.p");

    /* renamed from: b */
    public static final C46691ai f344656b = new C46885y("com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.RECOVERY_INTENT");

    /* renamed from: c */
    public final AuthTokenCheckerFragment f344657c;

    /* renamed from: d */
    public final C124786a f344658d;

    /* renamed from: e */
    public final C46855i f344659e;

    /* renamed from: f */
    public final C0816c f344660f;

    /* renamed from: g */
    public final C124918o f344661g = new C124918o(this);

    /* renamed from: h */
    public final C124917n f344662h = new C124917n(this);

    /* renamed from: i */
    private final C124848bs f344663i;

    /* renamed from: j */
    private final C46485f f344664j;

    public C124919p(AuthTokenCheckerFragment authTokenCheckerFragment, C124848bs bsVar, C124786a aVar, C46485f fVar, C46855i iVar) {
        this.f344657c = authTokenCheckerFragment;
        this.f344663i = bsVar;
        this.f344658d = aVar;
        this.f344664j = fVar;
        this.f344659e = iVar;
        this.f344660f = authTokenCheckerFragment.registerForActivityResult(new C0813f(), new C124916m(this));
    }

    /* renamed from: a */
    public final void mo106714a() {
        this.f344664j.mo50482c(this.f344657c).mo50509e(R.id.assistant_bisto_oobe_next, this.f344663i);
    }
}
