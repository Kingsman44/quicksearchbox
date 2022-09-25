package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.opa.C83579aj;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6941ui.C88523c;
import com.google.android.apps.gsa.staticplugins.opa.audio.C107619d;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.VoiceSearchUi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.logoview.LogoView;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.nq */
/* compiled from: PG */
public final class C109743nq {

    /* renamed from: a */
    final Context f305740a;

    /* renamed from: b */
    final VoiceSearchUi f305741b;

    /* renamed from: c */
    final C83579aj f305742c;

    /* renamed from: d */
    final C88523c f305743d;

    /* renamed from: e */
    final C88523c f305744e;

    public C109743nq(C109712mq mqVar, C86124t tVar, Context context, View view, C88523c cVar, C107619d dVar) {
        this.f305740a = context;
        this.f305743d = cVar;
        VoiceSearchUi voiceSearchUi = (VoiceSearchUi) ((ViewStub) view.findViewById(R.id.voice_search_overlay_view_stub)).inflate();
        this.f305741b = voiceSearchUi;
        voiceSearchUi.setBackgroundColor(C1878d.m5128a(context, 17170443));
        voiceSearchUi.setOnTouchListener(new C109741no());
        C83579aj a = mqVar.mo98043a(new C109325jp(tVar));
        this.f305742c = a;
        a.mo76918f(dVar);
        C109742np npVar = new C109742np(this);
        this.f305744e = npVar;
        C109711mp mpVar = (C109711mp) a;
        mpVar.f305661k = npVar;
        mpVar.mo76914a(voiceSearchUi, R.id.opa_fab_container);
        if (voiceSearchUi != null) {
            Resources resources = context.getResources();
            LogoView logoView = (LogoView) ((FrameLayout) voiceSearchUi.findViewById(R.id.opa_fab_container)).findViewById(R.id.logo_view);
            if (logoView != null) {
                logoView.mo28223c((float) resources.getInteger(R.integer.opa_voice_search_logo_view_logo_width), (float) resources.getInteger(R.integer.opa_voice_search_logo_view_logo_height));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo98064a() {
        VoiceSearchUi voiceSearchUi = this.f305741b;
        if (voiceSearchUi != null) {
            voiceSearchUi.f314936a.setText(this.f305740a.getResources().getString(R.string.opa_voice_search_listening));
        }
    }

    /* renamed from: b */
    public final void mo98065b() {
        VoiceSearchUi voiceSearchUi = this.f305741b;
        if (voiceSearchUi != null) {
            voiceSearchUi.f314936a.setText(voiceSearchUi.getContext().getString(R.string.opa_voice_search_tap_mic_to_speak));
        }
    }
}
