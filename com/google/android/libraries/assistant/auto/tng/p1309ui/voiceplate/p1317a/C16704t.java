package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a;

import android.net.Uri;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.t */
/* compiled from: PG */
final class C16704t {
    /* renamed from: a */
    static final String m33775a(String str, String str2, int i) {
        Uri.Builder appendPath = Uri.parse("https://fonts.gstatic.com/s/i/googlematerialicons").buildUpon().appendPath(str2);
        Uri.Builder appendPath2 = appendPath.appendPath("v" + i).appendPath(str.concat("-36dp")).appendPath("2x");
        return appendPath2.appendPath("gm_" + str2 + "_" + str + "_36dp.png").build().toString();
    }
}
