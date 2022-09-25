package com.google.android.apps.search.assistant.surfaces.voice.growth.jitconsent;

import android.os.Bundle;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.jitconsent.i */
/* compiled from: PG */
public final class C127834i {

    /* renamed from: a */
    public static final C59071e f351836a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.growth.jitconsent.i");

    /* renamed from: b */
    public final JitConsentFlowActivity f351837b;

    /* renamed from: c */
    public final C46128f f351838c;

    /* renamed from: d */
    public final C127839n f351839d;

    /* renamed from: e */
    public final C55912b f351840e;

    /* renamed from: f */
    public final Executor f351841f;

    /* renamed from: g */
    public C60870cx f351842g;

    public C127834i(JitConsentFlowActivity jitConsentFlowActivity, C127839n nVar, C46128f fVar, C45989b bVar, C32158h hVar, Executor executor) {
        C55912b bVar2;
        this.f351837b = jitConsentFlowActivity;
        this.f351839d = nVar;
        this.f351838c = fVar;
        this.f351841f = executor;
        hVar.mo37971b(jitConsentFlowActivity, new C127833h(this), bVar);
        Bundle extras = jitConsentFlowActivity.getIntent().getExtras();
        if (extras == null) {
            bVar2 = null;
        } else {
            bVar2 = C55912b.m87801a(extras.getInt("ACTIVITY_CONTROLS_SETTING"));
        }
        this.f351840e = bVar2;
    }
}
