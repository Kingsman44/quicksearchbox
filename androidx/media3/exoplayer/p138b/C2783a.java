package androidx.media3.exoplayer.p138b;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import androidx.media3.common.p136b.C2612ak;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4575r.C60757n;

/* renamed from: androidx.media3.exoplayer.b.a */
/* compiled from: PG */
final class C2783a {

    /* renamed from: a */
    private static final AudioAttributes f7692a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    /* renamed from: a */
    public static int m7649a(int i, int i2) {
        for (int i3 = 8; i3 > 0; i3--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(C2612ak.m6983h(i3)).build(), f7692a)) {
                return i3;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static int[] m7650b() {
        C58480gp e = C58485gu.m89837e();
        C58800sl lA = C2806b.f7834b.keySet().iterator();
        while (lA.hasNext()) {
            int intValue = ((Integer) lA.next()).intValue();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f7692a)) {
                e.mo55395g(Integer.valueOf(intValue));
            }
        }
        e.mo55395g(2);
        return C60757n.m92752m(e.mo55394f());
    }
}
