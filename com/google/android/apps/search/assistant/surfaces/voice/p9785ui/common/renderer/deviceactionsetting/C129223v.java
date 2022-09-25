package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting;

import android.content.Context;
import android.widget.CompoundButton;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.C129184b;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47754cs;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.assistant.p3897e.p3921j.C52131gj;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.v */
/* compiled from: PG */
public final class C129223v {

    /* renamed from: a */
    public static final C59071e f354958a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.v");

    /* renamed from: b */
    public final C129219r f354959b;

    /* renamed from: c */
    public final Context f354960c;

    /* renamed from: d */
    public final C129184b f354961d;

    /* renamed from: e */
    public final C46801dp f354962e;

    /* renamed from: f */
    public final C52131gj f354963f;

    /* renamed from: g */
    public final C46792di f354964g = new C129220s(this);

    /* renamed from: h */
    public final C46792di f354965h = new C129221t(this);

    /* renamed from: i */
    public final CompoundButton.OnCheckedChangeListener f354966i;

    public C129223v(C129219r rVar, Context context, C129184b bVar, C46801dp dpVar, C52131gj gjVar, C47770dh dhVar) {
        this.f354959b = rVar;
        this.f354960c = context;
        this.f354962e = dpVar;
        this.f354963f = gjVar;
        this.f354961d = bVar;
        this.f354966i = new C47754cs(dhVar, new C129222u(this, gjVar.f136792b), "Toggled Setting Switch");
    }
}
