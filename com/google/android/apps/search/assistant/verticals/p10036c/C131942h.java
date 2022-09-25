package com.google.android.apps.search.assistant.verticals.p10036c;

import android.content.Context;
import android.os.Build;
import android.view.contentcapture.ContentCaptureManager;

/* renamed from: com.google.android.apps.search.assistant.verticals.c.h */
/* compiled from: PG */
final class C131942h extends C131941g {

    /* renamed from: a */
    public final ContentCaptureManager f360251a;

    public C131942h(Context context) {
        this.f360251a = Build.VERSION.SDK_INT >= 30 ? (ContentCaptureManager) context.getSystemService(ContentCaptureManager.class) : null;
    }
}
