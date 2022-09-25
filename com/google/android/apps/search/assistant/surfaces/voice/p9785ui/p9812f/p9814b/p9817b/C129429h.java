package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9817b;

import android.content.Context;
import android.provider.Settings;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.b.h */
/* compiled from: PG */
public final class C129429h {

    /* renamed from: a */
    private static final C59071e f355388a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.b.h");

    /* renamed from: a */
    public static boolean m211310a(Context context, String str) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), str) == 1;
        } catch (Settings.SettingNotFoundException unused) {
            ((C59052c) ((C59052c) f355388a.mo56224b()).mo56372aa(38555)).mo56389s("The setting %s has not been set, or the string value is not a number", str);
            return true;
        }
    }
}
