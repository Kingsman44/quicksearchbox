package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.media3.common.C2664h;
import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.exoplayer.f */
/* compiled from: PG */
final class C2997f {

    /* renamed from: a */
    public float f8661a = 1.0f;

    /* renamed from: b */
    public C2845bo f8662b;

    /* renamed from: c */
    private final AudioManager f8663c;

    /* renamed from: d */
    private final C2963e f8664d;

    /* renamed from: e */
    private C2664h f8665e;

    /* renamed from: f */
    private int f8666f;

    /* renamed from: g */
    private int f8667g;

    /* renamed from: h */
    private AudioFocusRequest f8668h;

    public C2997f(Context context, Handler handler, C2845bo boVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f8663c = audioManager;
        this.f8662b = boVar;
        this.f8664d = new C2963e(this, handler);
        this.f8666f = 0;
    }

    /* renamed from: a */
    public final int mo6922a(boolean z, int i) {
        if (i == 1 || this.f8667g != 1) {
            mo6923b();
            return z ? 1 : -1;
        } else if (!z) {
            return -1;
        } else {
            if (this.f8666f != 1) {
                int i2 = C2612ak.f7249a;
                if (this.f8668h == null) {
                    AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(this.f8667g);
                    boolean f = mo6927f();
                    C2664h hVar = this.f8665e;
                    hVar.getClass();
                    this.f8668h = builder.setAudioAttributes(hVar.mo6330a().f7420a).setWillPauseWhenDucked(f).setOnAudioFocusChangeListener(this.f8664d).build();
                }
                if (this.f8663c.requestAudioFocus(this.f8668h) == 1) {
                    mo6926e(1);
                } else {
                    mo6926e(0);
                    return -1;
                }
            }
            return 1;
        }
    }

    /* renamed from: b */
    public final void mo6923b() {
        if (this.f8666f != 0) {
            int i = C2612ak.f7249a;
            AudioFocusRequest audioFocusRequest = this.f8668h;
            if (audioFocusRequest != null) {
                this.f8663c.abandonAudioFocusRequest(audioFocusRequest);
            }
            mo6926e(0);
        }
    }

    /* renamed from: c */
    public final void mo6924c(int i) {
        C2845bo boVar = this.f8662b;
        if (boVar != null) {
            boolean O = boVar.f7944a.mo5987O();
            boVar.f7944a.mo6597aN(O, i, C2848br.m7824ay(O, i));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r7.f7422b == 1) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        r3 = 1;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6925d(androidx.media3.common.C2664h r7) {
        /*
            r6 = this;
            androidx.media3.common.h r0 = r6.f8665e
            boolean r0 = androidx.media3.common.p136b.C2612ak.m6951aa(r0, r7)
            if (r0 != 0) goto L_0x0045
            r6.f8665e = r7
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L_0x0010
        L_0x000e:
            r3 = 0
            goto L_0x0039
        L_0x0010:
            int r2 = r7.f7423c
            r3 = 3
            r4 = 2
            java.lang.String r5 = "AudioFocusManager"
            switch(r2) {
                case 0: goto L_0x0033;
                case 1: goto L_0x0038;
                case 2: goto L_0x0031;
                case 3: goto L_0x000e;
                case 4: goto L_0x0031;
                case 5: goto L_0x0039;
                case 6: goto L_0x0039;
                case 7: goto L_0x0039;
                case 8: goto L_0x0039;
                case 9: goto L_0x0039;
                case 10: goto L_0x0039;
                case 11: goto L_0x002d;
                case 12: goto L_0x0039;
                case 13: goto L_0x0039;
                case 14: goto L_0x0038;
                case 15: goto L_0x0019;
                case 16: goto L_0x002b;
                default: goto L_0x0019;
            }
        L_0x0019:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r3 = "Unidentified audio usage: "
            r7.<init>(r3)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r5, r7)
            goto L_0x000e
        L_0x002b:
            r3 = 4
            goto L_0x0039
        L_0x002d:
            int r7 = r7.f7422b
            if (r7 != r1) goto L_0x0039
        L_0x0031:
            r3 = 2
            goto L_0x0039
        L_0x0033:
            java.lang.String r7 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            androidx.media3.common.p136b.C2633u.m7050e(r5, r7)
        L_0x0038:
            r3 = 1
        L_0x0039:
            r6.f8667g = r3
            if (r3 == r1) goto L_0x003f
            if (r3 != 0) goto L_0x0040
        L_0x003f:
            r0 = 1
        L_0x0040:
            java.lang.String r7 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            androidx.media3.common.p136b.C2601a.m6831c(r0, r7)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C2997f.mo6925d(androidx.media3.common.h):void");
    }

    /* renamed from: e */
    public final void mo6926e(int i) {
        if (this.f8666f != i) {
            this.f8666f = i;
            float f = i == 3 ? 0.2f : 1.0f;
            if (this.f8661a != f) {
                this.f8661a = f;
                C2845bo boVar = this.f8662b;
                if (boVar != null) {
                    boVar.f7944a.mo6592aI();
                }
            }
        }
    }

    /* renamed from: f */
    public final boolean mo6927f() {
        C2664h hVar = this.f8665e;
        return hVar != null && hVar.f7422b == 1;
    }
}
