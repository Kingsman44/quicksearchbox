package com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8927e;

import android.media.MediaPlayer;
import android.util.Log;

/* renamed from: com.google.android.apps.h.a.a.a.e.a */
/* compiled from: PG */
public final class C119122a {

    /* renamed from: a */
    public static boolean f332260a;

    static {
        boolean z;
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("data:audio/ogg;base64,T2dnUwACAAAAAAAAAAAAAAAAAAAAAENewaEBE09wdXNIZWFkAQE4AcBdAAAAAABPZ2dTAAAAAAAAAAAAAAAAAAABAAAASsI48gErT3B1c1RhZ3MbAAAAR29vZ2xlIFNwZWVjaCB1c2luZyBsaWJvcHVzAAAAAE9nZ1MABAguAAAAAAAAAAAAAAIAAABjOreTDBEJCQgICAgICAgIEUgL7tYZvzA1CUVeNGf/Ko5ASAhr8c7sqWRcSAfJecUTKsc0SAfJcifhPlNIB8lyJ+E+U0gHyXnFEve8SAfJecUS97xIB8lyJ+E+U0gHyXIn4T5TSAfJecUS97xIB8l5xRL3vEgH93DwrJ3kCjRIuC7yimvq");
            mediaPlayer.prepare();
            Log.i("MediaSupport", "Opus is supported.");
            mediaPlayer.release();
            z = true;
        } catch (Exception unused) {
            Log.i("MediaSupport", "Opus is unsupported.");
            mediaPlayer.release();
            z = false;
        } catch (Throwable th) {
            mediaPlayer.release();
            throw th;
        }
        f332260a = z;
    }
}
