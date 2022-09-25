package androidx.media3.exoplayer.p138b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import androidx.media3.common.p136b.C2612ak;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import java.util.Arrays;

/* renamed from: androidx.media3.exoplayer.b.b */
/* compiled from: PG */
public final class C2806b {

    /* renamed from: a */
    public static final C2806b f7833a = new C2806b(new int[]{2}, 8);

    /* renamed from: b */
    public static final C58495hd f7834b;

    /* renamed from: c */
    private static final C2806b f7835c = new C2806b(new int[]{2, 5, 6}, 8);

    /* renamed from: d */
    private final int[] f7836d;

    /* renamed from: e */
    private final int f7837e;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(5, 6);
        gzVar.mo55429h(17, 6);
        gzVar.mo55429h(7, 6);
        gzVar.mo55429h(18, 6);
        gzVar.mo55429h(6, 8);
        gzVar.mo55429h(8, 8);
        gzVar.mo55429h(14, 8);
        f7834b = gzVar.mo55427f(true);
    }

    public C2806b(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f7836d = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f7836d = new int[0];
        }
        this.f7837e = i;
    }

    /* renamed from: b */
    public static C2806b m7751b(Context context) {
        Intent B = C2612ak.m6919B(context, (BroadcastReceiver) null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        if (("Amazon".equals(C2612ak.f7251c) || "Xiaomi".equals(C2612ak.f7251c)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return f7835c;
        }
        if (C2612ak.m6959ai(context) || C2612ak.m6954ad(context)) {
            return new C2806b(C2783a.m7650b(), 8);
        }
        if (B == null || B.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return f7833a;
        }
        return new C2806b(B.getIntArrayExtra("android.media.extra.ENCODINGS"), B.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair mo6546a(androidx.media3.common.C2680x r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.f7496n
            r0.getClass()
            java.lang.String r1 = r6.f7493k
            int r0 = androidx.media3.common.C2598ay.m6802a(r0, r1)
            com.google.common.b.hd r1 = f7834b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.containsKey(r2)
            r2 = 0
            if (r1 != 0) goto L_0x0019
            return r2
        L_0x0019:
            r1 = 18
            if (r0 != r1) goto L_0x0027
            boolean r0 = r5.mo6547c(r1)
            if (r0 != 0) goto L_0x0025
            r0 = 6
            goto L_0x0032
        L_0x0025:
            r0 = 18
        L_0x0027:
            r3 = 8
            if (r0 != r3) goto L_0x0032
            boolean r3 = r5.mo6547c(r3)
            if (r3 != 0) goto L_0x0032
            r0 = 7
        L_0x0032:
            boolean r3 = r5.mo6547c(r0)
            if (r3 != 0) goto L_0x0039
            return r2
        L_0x0039:
            int r3 = r6.f7477A
            r4 = -1
            if (r3 == r4) goto L_0x0047
            if (r0 != r1) goto L_0x0041
            goto L_0x0047
        L_0x0041:
            int r6 = r5.f7837e
            if (r3 > r6) goto L_0x0046
            goto L_0x0054
        L_0x0046:
            return r2
        L_0x0047:
            int r6 = r6.f7478B
            if (r6 != r4) goto L_0x004e
            r6 = 48000(0xbb80, float:6.7262E-41)
        L_0x004e:
            int r1 = androidx.media3.common.p136b.C2612ak.f7249a
            int r3 = androidx.media3.exoplayer.p138b.C2783a.m7649a(r0, r6)
        L_0x0054:
            int r6 = androidx.media3.common.p136b.C2612ak.f7249a
            int r6 = androidx.media3.common.p136b.C2612ak.m6983h(r3)
            if (r6 != 0) goto L_0x005d
            return r2
        L_0x005d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            android.util.Pair r6 = android.util.Pair.create(r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p138b.C2806b.mo6546a(androidx.media3.common.x):android.util.Pair");
    }

    /* renamed from: c */
    public final boolean mo6547c(int i) {
        return Arrays.binarySearch(this.f7836d, i) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2806b)) {
            return false;
        }
        C2806b bVar = (C2806b) obj;
        return Arrays.equals(this.f7836d, bVar.f7836d) && this.f7837e == bVar.f7837e;
    }

    public final int hashCode() {
        return this.f7837e + (Arrays.hashCode(this.f7836d) * 31);
    }

    public final String toString() {
        int i = this.f7837e;
        String arrays = Arrays.toString(this.f7836d);
        return "AudioCapabilities[maxChannelCount=" + i + ", supportedEncodings=" + arrays + "]";
    }
}
