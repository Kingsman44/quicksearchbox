package androidx.media3.common;

import android.media.AudioAttributes;
import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.common.f */
/* compiled from: PG */
public final class C2662f {

    /* renamed from: a */
    public final AudioAttributes f7420a;

    public C2662f(C2664h hVar) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(hVar.f7422b).setFlags(0).setUsage(hVar.f7423c);
        int i = C2612ak.f7249a;
        C2660d.m7199a(usage, 1);
        if (C2612ak.f7249a >= 32) {
            C2661e.m7200a(usage, 0);
        }
        this.f7420a = usage.build();
    }
}
