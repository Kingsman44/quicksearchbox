package com.google.android.apps.gsa.staticplugins.searchboxroot.features.brainsuggest;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.C90727ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import java.io.File;

/* compiled from: PG */
public class BrainSuggestDecoder {

    /* renamed from: a */
    public final C90931ca f324354a;

    /* renamed from: b */
    public final String f324355b;

    /* renamed from: c */
    public final float f324356c;

    /* renamed from: d */
    public final Boolean f324357d;

    public BrainSuggestDecoder(Context context, C90931ca caVar, float f) {
        this.f324354a = caVar;
        String str = context.getFilesDir().getAbsolutePath() + File.separator + "brainsuggest";
        this.f324355b = str;
        if (new File(str, "libbrainsuggestlite.so").exists()) {
            C90727ak.m148185b(str + File.separator + "libbrainsuggestlite.so");
            this.f324357d = true;
        } else {
            C90727ak.m148185b(str + File.separator + "libbrainsuggest.so");
            this.f324357d = false;
        }
        this.f324356c = f;
    }

    public native void clearCache();

    public native String[] getBrainSuggestions(String str, float f, int i);

    public native void initializeBlacklist(String str);

    public native int initializeDecoder(String str);

    public native int initializeDecoder(String str, String str2);
}
