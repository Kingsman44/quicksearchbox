package com.google.android.libraries.search.p2904c.p2966s;

import android.media.AudioPlaybackConfiguration;
import android.os.Build;
import android.os.Parcel;

/* renamed from: com.google.android.libraries.search.c.s.a */
/* compiled from: PG */
public final class C37968a {
    /* renamed from: a */
    public static boolean m67027a(AudioPlaybackConfiguration audioPlaybackConfiguration) {
        Parcel obtain = Parcel.obtain();
        audioPlaybackConfiguration.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        int i = 5;
        if ((!Build.VERSION.CODENAME.equals("REL") || Build.VERSION.SDK_INT < 31) && (Build.VERSION.CODENAME.length() != 1 || Build.VERSION.CODENAME.charAt(0) < 'S' || Build.VERSION.CODENAME.charAt(0) > 'Z')) {
            i = 4;
        }
        for (int i2 = 0; i2 < i; i2++) {
            obtain.readInt();
        }
        if (obtain.readInt() == 2) {
            return true;
        }
        return false;
    }
}
