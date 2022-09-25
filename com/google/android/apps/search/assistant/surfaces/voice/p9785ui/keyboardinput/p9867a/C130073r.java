package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4526f.C59071e;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.r */
/* compiled from: PG */
public final class C130073r {

    /* renamed from: a */
    public static final C59071e f356675a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.r");

    /* renamed from: b */
    private static final Pattern f356676b = Pattern.compile("<(/?b)>");

    /* renamed from: a */
    public static String m212374a(String str) {
        return f356676b.matcher(str).replaceAll(BuildConfig.FLAVOR);
    }
}
