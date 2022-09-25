package com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile;

import android.content.Context;
import android.content.Intent;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile.ah */
/* compiled from: PG */
public final class C101726ah implements C101725ag {

    /* renamed from: a */
    private final Context f283824a;

    public C101726ah(Context context) {
        this.f283824a = context;
    }

    /* renamed from: a */
    public final C60870cx mo92529a(Intent intent, String str) {
        this.f283824a.sendBroadcast(intent, "android.permission.MANAGE_VOICE_KEYPHRASES");
        return C60866ct.f164955a;
    }
}
