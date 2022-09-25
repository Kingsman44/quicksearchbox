package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import androidx.lifecycle.C2368bp;
import com.google.android.apps.search.assistant.platform.p9141h.p9156f.C121090b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.p10712d.C142324bc;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.dataservice.local.C46854h;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.co */
/* compiled from: PG */
public final class C124890co {

    /* renamed from: a */
    public static final C59071e f344578a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.co");

    /* renamed from: b */
    public static final C46691ai f344579b = new C46885y("com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.ACCOUNT_NAME");

    /* renamed from: c */
    public final UnsupportedLanguageFragment f344580c;

    /* renamed from: d */
    public final C124848bs f344581d;

    /* renamed from: e */
    public final C46855i f344582e;

    /* renamed from: f */
    public final C124921r f344583f;

    /* renamed from: g */
    public final C47770dh f344584g;

    /* renamed from: h */
    public final boolean f344585h;

    /* renamed from: i */
    public final OobeActivityViewModel f344586i;

    /* renamed from: j */
    public final C124889cn f344587j = new C124889cn(this);

    /* renamed from: k */
    public final C124888cm f344588k = new C124888cm(this);

    /* renamed from: l */
    public final C121090b f344589l;

    /* renamed from: m */
    public C142324bc f344590m;

    /* renamed from: n */
    public C46854h f344591n;

    /* renamed from: o */
    public boolean f344592o = false;

    /* renamed from: p */
    private final C46485f f344593p;

    public C124890co(UnsupportedLanguageFragment unsupportedLanguageFragment, C124848bs bsVar, C46855i iVar, C46485f fVar, C124921r rVar, C47770dh dhVar, C121090b bVar, boolean z) {
        this.f344580c = unsupportedLanguageFragment;
        this.f344581d = bsVar;
        this.f344582e = iVar;
        this.f344593p = fVar;
        this.f344583f = rVar;
        this.f344584g = dhVar;
        this.f344589l = bVar;
        this.f344585h = z;
        this.f344586i = (OobeActivityViewModel) new C2368bp(unsupportedLanguageFragment.requireActivity()).mo5770a(OobeActivityViewModel.class);
    }

    /* renamed from: a */
    public final void mo106709a() {
        C58976aa aaVar = C58975e.f156826a;
        this.f344593p.mo50482c(this.f344580c).mo50509e(R.id.assistant_bisto_oobe_next, this.f344581d);
    }
}
