package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.util.Log;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bf */
/* compiled from: PG */
final class C6818bf {

    /* renamed from: a */
    private final AudioManager f21585a;

    /* renamed from: b */
    private final C6816bd f21586b;

    /* renamed from: c */
    private C6817be f21587c;

    /* renamed from: d */
    private C6966gs f21588d;

    /* renamed from: e */
    private int f21589e;

    /* renamed from: f */
    private int f21590f;

    /* renamed from: g */
    private float f21591g = 1.0f;

    /* renamed from: h */
    private AudioFocusRequest f21592h;

    public C6818bf(Context context, Handler handler, C6817be beVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        ary.m19467t(audioManager);
        this.f21585a = audioManager;
        this.f21587c = beVar;
        this.f21586b = new C6816bd(this, handler);
        this.f21589e = 0;
    }

    /* renamed from: e */
    static /* synthetic */ void m19709e(C6818bf bfVar, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                bfVar.m19711g(3);
                return;
            }
            bfVar.m19712h(0);
            bfVar.m19711g(2);
        } else if (i == -1) {
            bfVar.m19712h(-1);
            bfVar.m19710f();
        } else if (i != 1) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown focus change type: ");
            sb.append(i);
            Log.w("AudioFocusManager", sb.toString());
        } else {
            bfVar.m19711g(1);
            bfVar.m19712h(1);
        }
    }

    /* renamed from: f */
    private final void m19710f() {
        if (this.f21589e != 0) {
            if (aeu.f20466a >= 26) {
                AudioFocusRequest audioFocusRequest = this.f21592h;
                if (audioFocusRequest != null) {
                    this.f21585a.abandonAudioFocusRequest(audioFocusRequest);
                }
            } else {
                this.f21585a.abandonAudioFocus(this.f21586b);
            }
            m19711g(0);
        }
    }

    /* renamed from: g */
    private final void m19711g(int i) {
        if (this.f21589e != i) {
            this.f21589e = i;
            float f = i == 3 ? 0.2f : 1.0f;
            if (this.f21591g != f) {
                this.f21591g = f;
                C6817be beVar = this.f21587c;
                if (beVar != null) {
                    ((C6902ei) beVar).f21990a.m20270ae(1, 2, Float.valueOf(((C6902ei) beVar).f21990a.f21994D * ((C6902ei) beVar).f21990a.f22011m.mo15495a()));
                }
            }
        }
    }

    /* renamed from: h */
    private final void m19712h(int i) {
        C6817be beVar = this.f21587c;
        if (beVar != null) {
            C6902ei eiVar = (C6902ei) beVar;
            boolean j = eiVar.f21990a.mo15822j();
            eiVar.f21990a.m20268ac(j, i, C6903ej.m20272ag(j, i));
        }
    }

    /* renamed from: a */
    public final float mo15495a() {
        return this.f21591g;
    }

    /* renamed from: b */
    public final void mo15496b(C6966gs gsVar) {
        if (!aeu.m18533c((Object) null, (Object) null)) {
            this.f21588d = null;
            this.f21590f = 0;
            ary.m19463p(true, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }

    /* renamed from: c */
    public final int mo15497c(boolean z, int i) {
        int i2;
        if (i == 1 || this.f21590f != 1) {
            m19710f();
            return z ? 1 : -1;
        } else if (!z) {
            return -1;
        } else {
            if (this.f21589e != 1) {
                if (aeu.f20466a >= 26) {
                    AudioFocusRequest audioFocusRequest = this.f21592h;
                    if (audioFocusRequest != null) {
                        i2 = this.f21585a.requestAudioFocus(audioFocusRequest);
                    } else {
                        new AudioFocusRequest.Builder(this.f21590f);
                        ary.m19467t((Object) null);
                        throw null;
                    }
                } else {
                    AudioManager audioManager = this.f21585a;
                    C6816bd bdVar = this.f21586b;
                    ary.m19467t((Object) null);
                    i2 = audioManager.requestAudioFocus(bdVar, 3, this.f21590f);
                }
                if (i2 == 1) {
                    m19711g(1);
                } else {
                    m19711g(0);
                    return -1;
                }
            }
            return 1;
        }
    }

    /* renamed from: d */
    public final void mo15498d() {
        this.f21587c = null;
        m19710f();
    }
}
