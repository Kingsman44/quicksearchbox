package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting;

import android.content.Context;
import android.widget.SeekBar;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.C129183a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.C129184b;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47758cw;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.assistant.p3897e.p3921j.C52131gj;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.p */
/* compiled from: PG */
public final class C129217p {

    /* renamed from: a */
    public static final C59071e f354939a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.p");

    /* renamed from: b */
    public final C129212k f354940b;

    /* renamed from: c */
    public final Context f354941c;

    /* renamed from: d */
    public final C129184b f354942d;

    /* renamed from: e */
    public final C129183a f354943e;

    /* renamed from: f */
    public final C46801dp f354944f;

    /* renamed from: g */
    public final C52131gj f354945g;

    /* renamed from: h */
    public final C46792di f354946h = new C129213l(this);

    /* renamed from: i */
    public final C46792di f354947i = new C129214m(this);

    /* renamed from: j */
    public final C46792di f354948j = new C129215n(this);

    /* renamed from: k */
    public final SeekBar.OnSeekBarChangeListener f354949k;

    public C129217p(C129212k kVar, Context context, C129184b bVar, C129183a aVar, C46801dp dpVar, C52131gj gjVar, C47770dh dhVar) {
        this.f354940b = kVar;
        this.f354941c = context;
        this.f354942d = bVar;
        this.f354943e = aVar;
        this.f354944f = dpVar;
        this.f354945g = gjVar;
        this.f354949k = new C47758cw(dhVar, new C129216o(this, gjVar.f136792b), "slider setting seekBar");
    }
}
