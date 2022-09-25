package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Iterator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.eo */
/* compiled from: PG */
final class C6908eo {

    /* renamed from: a */
    private final Context f22027a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Handler f22028b;

    /* renamed from: c */
    private final C6905el f22029c;

    /* renamed from: d */
    private final AudioManager f22030d;

    /* renamed from: e */
    private final C6907en f22031e;

    /* renamed from: f */
    private int f22032f = 3;

    /* renamed from: g */
    private int f22033g;

    /* renamed from: h */
    private boolean f22034h;

    /* renamed from: i */
    private boolean f22035i;

    public C6908eo(Context context, Handler handler, C6905el elVar) {
        Context applicationContext = context.getApplicationContext();
        this.f22027a = applicationContext;
        this.f22028b = handler;
        this.f22029c = elVar;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        ary.m19466s(audioManager);
        this.f22030d = audioManager;
        this.f22033g = audioManager.getStreamVolume(3);
        this.f22034h = m20306h(audioManager, this.f22032f);
        C6907en enVar = new C6907en(this);
        this.f22031e = enVar;
        applicationContext.registerReceiver(enVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m20305g() {
        int streamVolume = this.f22030d.getStreamVolume(this.f22032f);
        boolean h = m20306h(this.f22030d, this.f22032f);
        if (this.f22033g != streamVolume || this.f22034h != h) {
            this.f22033g = streamVolume;
            this.f22034h = h;
            Iterator it = ((C6902ei) this.f22029c).f21990a.f22006h.iterator();
            while (it.hasNext()) {
                ((C7026iy) it.next()).mo16049b();
            }
        }
    }

    /* renamed from: h */
    private static boolean m20306h(AudioManager audioManager, int i) {
        if (aeu.f20466a >= 23) {
            return audioManager.isStreamMute(i);
        }
        return audioManager.getStreamVolume(i) == 0;
    }

    /* renamed from: a */
    public final void mo15827a(int i) {
        if (this.f22032f != 3) {
            this.f22032f = 3;
            m20305g();
            C6902ei eiVar = (C6902ei) this.f22029c;
            C7025ix L = C6903ej.m20271af(eiVar.f21990a.f22012n);
            if (!L.equals(eiVar.f21990a.f21998H)) {
                eiVar.f21990a.f21998H = L;
                Iterator it = eiVar.f21990a.f22006h.iterator();
                while (it.hasNext()) {
                    ((C7026iy) it.next()).mo16048a();
                }
            }
        }
    }

    /* renamed from: b */
    public final int mo15828b() {
        if (aeu.f20466a >= 28) {
            return this.f22030d.getStreamMinVolume(this.f22032f);
        }
        return 0;
    }

    /* renamed from: c */
    public final int mo15829c() {
        return this.f22030d.getStreamMaxVolume(this.f22032f);
    }

    /* renamed from: d */
    public final void mo15830d() {
        if (!this.f22035i) {
            this.f22027a.unregisterReceiver(this.f22031e);
            this.f22035i = true;
        }
    }
}
