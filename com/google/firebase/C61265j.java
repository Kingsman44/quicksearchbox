package com.google.firebase;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.firebase.p4613f.C61201g;

/* renamed from: com.google.firebase.j */
/* compiled from: PG */
public final /* synthetic */ class C61265j implements C61201g {

    /* renamed from: a */
    public static final /* synthetic */ C61265j f165707a = new C61265j();

    private /* synthetic */ C61265j() {
    }

    /* renamed from: a */
    public final String mo57766a(Object obj) {
        Context context = (Context) obj;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        return context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : BuildConfig.FLAVOR;
    }
}
