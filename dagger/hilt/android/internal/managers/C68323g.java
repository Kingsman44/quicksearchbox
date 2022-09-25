package dagger.hilt.android.internal.managers;

import android.app.Application;
import android.content.Context;
import dagger.hilt.android.internal.C68299a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: dagger.hilt.android.internal.managers.g */
/* compiled from: PG */
public final class C68323g {
    /* renamed from: a */
    public static Object m98667a(Context context) {
        Application a = C68299a.m98636a(context.getApplicationContext());
        boolean z = a instanceof C68288b;
        Object[] objArr = {a.getClass()};
        if (z) {
            return ((C68288b) a).mo17653jN();
        }
        throw new IllegalArgumentException(String.format("Sting BroadcastReceiver must be attached to an @Sting Application. Found: %s", objArr));
    }
}
