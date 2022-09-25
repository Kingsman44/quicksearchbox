package com.google.android.apps.search.assistant.libraries.p8984ui.transcription;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58837ba;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.transcription.b */
/* compiled from: PG */
public final class C119494b {

    /* renamed from: a */
    public final String f333096a;

    /* renamed from: b */
    public final String f333097b;

    public C119494b(String str, int i) {
        if (i >= str.length()) {
            this.f333096a = str;
            this.f333097b = BuildConfig.FLAVOR;
            return;
        }
        int i2 = i + 1;
        this.f333096a = str.substring(0, i2);
        this.f333097b = str.substring(i2);
    }

    public C119494b(String str) {
        this.f333096a = C58837ba.m90858g(BuildConfig.FLAVOR);
        this.f333097b = C58837ba.m90858g(str);
    }
}
