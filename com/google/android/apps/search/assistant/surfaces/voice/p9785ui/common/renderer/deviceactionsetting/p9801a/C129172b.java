package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.p9801a;

import android.net.Uri;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.a.b */
/* compiled from: PG */
public final class C129172b {

    /* renamed from: a */
    public static final C59071e f354824a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.a.b");

    /* renamed from: a */
    public static Uri m210854a(String str) {
        return new Uri.Builder().scheme("content").authority("com.google.android.settings.external").path("settings_manager").appendPath(str).build();
    }

    /* renamed from: b */
    public static boolean m210855b(Integer num) {
        return num.intValue() >= 0 && num.intValue() <= 100;
    }
}
