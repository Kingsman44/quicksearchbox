package com.google.apps.tiktok.tracing;

import android.content.Context;
import android.content.ContextWrapper;
import android.support.p031v4.app.C0167am;

/* renamed from: com.google.apps.tiktok.tracing.ak */
/* compiled from: PG */
public final class C47525ak {
    /* renamed from: a */
    public static boolean m84586a(Context context) {
        if (context == null) {
            return true;
        }
        if (context instanceof C0167am) {
            if (!((C0167am) context).mo545jw().mo461ab()) {
                return true;
            }
            return false;
        } else if (context instanceof ContextWrapper) {
            return m84586a(((ContextWrapper) context).getBaseContext());
        } else {
            return true;
        }
    }
}
