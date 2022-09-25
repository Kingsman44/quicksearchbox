package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.evernote.android.state.BuildConfig;
import com.google.firebase.p4613f.C61201g;

/* renamed from: com.google.firebase.i */
/* compiled from: PG */
public final /* synthetic */ class C61206i implements C61201g {

    /* renamed from: a */
    public static final /* synthetic */ C61206i f165565a = new C61206i();

    private /* synthetic */ C61206i() {
    }

    /* renamed from: a */
    public final String mo57766a(Object obj) {
        ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : BuildConfig.FLAVOR;
    }
}
