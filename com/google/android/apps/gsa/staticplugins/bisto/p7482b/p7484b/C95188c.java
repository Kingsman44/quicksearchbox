package com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b;

import android.media.AudioAttributes;
import android.media.SoundPool;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.b.b.c */
/* compiled from: PG */
public final class C95188c {

    /* renamed from: a */
    public static final int[] f266323a;

    /* renamed from: b */
    final SoundPool f266324b = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(13).setContentType(4).setFlags(1).build()).build();

    /* renamed from: c */
    private final C69464a f266325c;

    static {
        int[] iArr = new int[11];
        f266323a = iArr;
        iArr[1] = R.raw.action_window_close;
        iArr[0] = R.raw.action_window_open;
        iArr[2] = R.raw.action_confirm;
        iArr[3] = R.raw.drop;
        iArr[4] = R.raw.default_notification_chime;
        iArr[5] = R.raw.generic_failure;
        iArr[6] = R.raw.thinking;
        iArr[7] = R.raw.tap;
        iArr[8] = R.raw.close_mic;
        iArr[9] = R.raw.open_mic;
        iArr[10] = R.raw.startup;
    }

    public C95188c(C69464a aVar) {
        this.f266325c = aVar;
    }

    /* renamed from: a */
    public final void mo89096a(int i) {
        C58976aa aaVar = C58975e.f156826a;
        ((C95186al) this.f266325c.mo17428b()).mo89093d(i, new C95187b());
    }

    /* renamed from: b */
    public final void mo89097b() {
        this.f266324b.play(f266323a[7], 1.0f, 1.0f, 0, 0, 1.0f);
    }
}
