package androidx.media3.exoplayer.p150j;

import android.os.SystemClock;
import androidx.media3.exoplayer.p151k.C3246l;

/* renamed from: androidx.media3.exoplayer.j.ai */
/* compiled from: PG */
public final class C3202ai {
    /* renamed from: a */
    public static C3246l m9387a(C3197ad adVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int j = adVar.mo7032j();
        int i = 0;
        for (int i2 = 0; i2 < j; i2++) {
            if (adVar.mo7040r(i2, elapsedRealtime)) {
                i++;
            }
        }
        return new C3246l(1, 0, j, i);
    }
}
