package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.C129185c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.p9801a.C129173c;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.assistant.p3897e.p3921j.C52131gj;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.aa */
/* compiled from: PG */
public final class C129174aa {

    /* renamed from: a */
    public static final C59071e f354826a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.aa");

    /* renamed from: b */
    public final C129225x f354827b;

    /* renamed from: c */
    public final Context f354828c;

    /* renamed from: d */
    public final C129185c f354829d;

    /* renamed from: e */
    public final C46801dp f354830e;

    /* renamed from: f */
    public final Uri f354831f;

    /* renamed from: g */
    public final Integer f354832g;

    /* renamed from: h */
    public final C46792di f354833h = new C129227z(this);

    public C129174aa(C129225x xVar, Context context, C129185c cVar, C46801dp dpVar, C52131gj gjVar) {
        this.f354827b = xVar;
        this.f354828c = context;
        this.f354829d = cVar;
        this.f354830e = dpVar;
        Uri parse = Uri.parse(gjVar.f136796f);
        C58838bb.m90866a(parse, "Slice Uri is null.");
        this.f354831f = parse;
        this.f354832g = (Integer) C129173c.f354825a.getOrDefault(parse.toString(), Integer.valueOf(R.drawable.quantum_gm_ic_settings_gm_grey_36));
    }
}
