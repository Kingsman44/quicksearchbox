package com.google.firebase;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.firebase.p4613f.C61201g;

/* renamed from: com.google.firebase.k */
/* compiled from: PG */
public final /* synthetic */ class C61266k implements C61201g {

    /* renamed from: a */
    public static final /* synthetic */ C61266k f165708a = new C61266k();

    private /* synthetic */ C61266k() {
    }

    /* renamed from: a */
    public final String mo57766a(Object obj) {
        Context context = (Context) obj;
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.m93454a(installerPackageName) : BuildConfig.FLAVOR;
    }
}
