package com.facebook.litho;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: com.facebook.litho.ar */
/* compiled from: PG */
public final class C6107ar {
    /* renamed from: a */
    static Context m15892a(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity) && !(context instanceof Application) && !(context instanceof Service)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }
}
