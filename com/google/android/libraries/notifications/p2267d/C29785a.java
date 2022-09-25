package com.google.android.libraries.notifications.p2267d;

import android.content.Context;
import com.google.android.apps.common.p469a.C9017a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.notifications.d.a */
/* compiled from: PG */
public final class C29785a {

    /* renamed from: a */
    private static volatile C29786b f80712a;

    /* renamed from: a */
    public static C29786b m54946a(Context context) {
        Context applicationContext = context.getApplicationContext();
        try {
            if (applicationContext instanceof C68288b) {
                return (C29786b) ((C68288b) applicationContext).mo17653jN();
            }
            if (applicationContext instanceof C9017a) {
                return (C29786b) ((C9017a) applicationContext).mo17311a();
            }
            throw new IllegalStateException("Unable to get ChimeComponent from host app. Did you mean for your application to extend GeneratedComponentManager or HasComponent or to use jcga.libraries.notifications.injection.Chime#set(ChimeComponent)?");
        } catch (ClassCastException unused) {
        }
    }
}
