package com.google.apps.tiktok.p3643g;

import android.content.Context;
import android.content.Intent;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.apps.tiktok.g.o */
/* compiled from: PG */
public class C47099o extends C47098n {
    protected C47099o(Class cls) {
        super(cls, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C60870cx mo51007d(Context context, Intent intent, Class cls) {
        try {
            return C60856cj.m92900i(C47266f.m84076a(context, cls));
        } catch (IllegalStateException e) {
            return C60856cj.m92899h(new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e));
        }
    }
}
