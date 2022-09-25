package com.google.android.apps.search.transcription.p10679ui;

import android.app.Activity;
import android.content.Context;
import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.transcription.p10670f.C141853bu;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.transcription.ui.v */
/* compiled from: PG */
public final class C141956v {

    /* renamed from: a */
    public static final C59071e f385205a = C59071e.m91332i("com.google.android.apps.search.transcription.ui.v");

    /* renamed from: b */
    public final C141955u f385206b;

    /* renamed from: c */
    public final Activity f385207c;

    /* renamed from: d */
    public final Context f385208d;

    /* renamed from: e */
    private final C141853bu f385209e;

    public C141956v(Activity activity, Context context, C141955u uVar, C141853bu buVar) {
        this.f385207c = activity;
        this.f385208d = context;
        this.f385206b = uVar;
        this.f385209e = buVar;
    }

    /* renamed from: a */
    public final void mo116927a() {
        C0154a aVar = new C0154a(this.f385206b.getChildFragmentManager());
        aVar.mo689v(R.id.transcription_fragment_container, C141947n.m230436f(this.f385209e.mo116843a()), "transcriptionFragment");
        aVar.mo509f();
    }
}
