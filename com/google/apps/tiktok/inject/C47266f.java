package com.google.apps.tiktok.inject;

import android.content.Context;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.apps.tiktok.inject.f */
/* compiled from: PG */
public final class C47266f {
    /* renamed from: a */
    public static Object m84076a(Context context, Class cls) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof C68288b) {
            try {
                return cls.cast(((C68288b) applicationContext).mo17653jN());
            } catch (ClassCastException e) {
                throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e);
            }
        } else {
            throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(String.valueOf(applicationContext.getClass()))));
        }
    }
}
