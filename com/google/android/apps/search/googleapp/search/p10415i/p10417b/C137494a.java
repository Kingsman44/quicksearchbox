package com.google.android.apps.search.googleapp.search.p10415i.p10417b;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.search.p10415i.C137501c;
import com.google.android.apps.search.googleapp.search.p10415i.C137508j;
import com.google.android.apps.search.googleapp.search.p10415i.C137514p;
import com.google.android.libraries.web.profile.Profile;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58486gv;
import com.google.common.p4522b.C58585km;
import com.google.common.util.concurrent.C60801ai;
import com.google.common.util.concurrent.C60812at;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.search.googleapp.search.i.b.a */
/* compiled from: PG */
public final /* synthetic */ class C137494a implements C60801ai {

    /* renamed from: a */
    public final /* synthetic */ C137500g f373961a;

    /* renamed from: b */
    public final /* synthetic */ C137514p f373962b;

    /* renamed from: c */
    public final /* synthetic */ String f373963c;

    /* renamed from: d */
    public final /* synthetic */ C58585km f373964d;

    /* renamed from: e */
    public final /* synthetic */ String f373965e;

    public /* synthetic */ C137494a(C137500g gVar, C137514p pVar, String str, C58585km kmVar, String str2) {
        this.f373961a = gVar;
        this.f373962b = pVar;
        this.f373963c = str;
        this.f373964d = kmVar;
        this.f373965e = str2;
    }

    /* renamed from: a */
    public final C60817ay mo20982a(C60812at atVar, Object obj) {
        C137500g gVar = this.f373961a;
        C137514p pVar = this.f373962b;
        String str = this.f373963c;
        C58585km kmVar = this.f373964d;
        String str2 = this.f373965e;
        String str3 = (String) obj;
        if (TextUtils.equals(str3, BuildConfig.FLAVOR)) {
            return new C60817ay(C47633f.m84733g(C60856cj.m92900i(pVar)));
        }
        C137501c cVar = gVar.f373983j;
        C58486gv gvVar = new C58486gv();
        gvVar.mo55420d(kmVar);
        gvVar.mo55419c(C137500g.f373974a, str2);
        gvVar.mo55419c(C137500g.f373975b, str3);
        C137508j jVar = (C137508j) cVar;
        return jVar.mo113788a(str, gvVar.mo55417a(), jVar.f374006e, (Profile) null);
    }
}
