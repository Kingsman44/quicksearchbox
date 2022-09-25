package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.evernote.android.state.BuildConfig;
import com.google.firebase.p4613f.C61201g;

/* renamed from: com.google.firebase.h */
/* compiled from: PG */
public final /* synthetic */ class C61205h implements C61201g {

    /* renamed from: a */
    public static final /* synthetic */ C61205h f165564a = new C61205h();

    private /* synthetic */ C61205h() {
    }

    /* renamed from: a */
    public final String mo57766a(Object obj) {
        ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : BuildConfig.FLAVOR;
    }
}
