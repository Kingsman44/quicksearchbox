package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.impl;

import android.content.Context;
import android.provider.Settings;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.C129183a;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46783d;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.dataservice.impl.BrightnessDataServiceImpl */
/* compiled from: PG */
public final class BrightnessDataServiceImpl implements C129183a {

    /* renamed from: f */
    private static final C59071e f354869f = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.dataservice.impl.BrightnessDataServiceImpl");

    /* renamed from: b */
    public final Context f354870b;

    /* renamed from: c */
    public final C46783d f354871c;

    /* renamed from: d */
    public final C46778cv f354872d;

    /* renamed from: e */
    public final C46877q f354873e;

    /* renamed from: g */
    private final C60887da f354874g;

    /* renamed from: h */
    private final C2384o f354875h;

    /* renamed from: i */
    private final C47770dh f354876i;

    /* renamed from: j */
    private final C46723bg f354877j;

    public BrightnessDataServiceImpl(Context context, C46877q qVar, C2384o oVar, C47770dh dhVar, C60887da daVar, C46778cv cvVar, C46723bg bgVar) {
        this.f354870b = context;
        this.f354874g = daVar;
        this.f354872d = cvVar;
        this.f354875h = oVar;
        this.f354876i = dhVar;
        this.f354873e = qVar;
        this.f354871c = new C129188b(this, dhVar, daVar);
        this.f354877j = bgVar;
    }

    /* renamed from: a */
    public final C46689ag mo108891a() {
        return new C46719bc(this.f354877j, new C129187a(this), f354867a);
    }

    /* renamed from: b */
    public final void mo108892b() {
        if (this.f354875h.mo5789a() == C2383n.DESTROYED) {
            C59104x d = f354869f.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BrightnessDataService");
            ((C59052c) ((C59052c) d).mo56372aa(38162)).mo56386p("Failed to register brightness contentObserver, lifecycle has already been destroyed");
            return;
        }
        this.f354873e.mo50875e(Settings.System.getUriFor("screen_brightness"), false, this.f354871c);
        this.f354875h.mo5790b(new C2376g() {
            /* renamed from: gV */
            public final /* synthetic */ void mo3520gV(C2391v vVar) {
            }

            /* renamed from: gW */
            public final void mo3521gW(C2391v vVar) {
                BrightnessDataServiceImpl brightnessDataServiceImpl = BrightnessDataServiceImpl.this;
                brightnessDataServiceImpl.f354873e.mo50876f(brightnessDataServiceImpl.f354871c);
            }

            /* renamed from: gX */
            public final /* synthetic */ void mo3522gX(C2391v vVar) {
            }

            /* renamed from: gY */
            public final /* synthetic */ void mo3523gY(C2391v vVar) {
            }

            /* renamed from: gZ */
            public final /* synthetic */ void mo3524gZ(C2391v vVar) {
            }

            /* renamed from: ha */
            public final /* synthetic */ void mo3525ha(C2391v vVar) {
            }
        });
    }
}
