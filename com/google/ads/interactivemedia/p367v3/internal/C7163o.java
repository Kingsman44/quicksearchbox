package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.google.ads.interactivemedia.v3.internal.o */
/* compiled from: PG */
public final class C7163o extends ContentObserver {

    /* renamed from: a */
    private final Context f23172a;

    /* renamed from: b */
    private final AudioManager f23173b;

    /* renamed from: c */
    private float f23174c;

    /* renamed from: d */
    private final C7379w f23175d;

    /* renamed from: e */
    private final C6904ek f23176e;

    public C7163o(Handler handler, Context context, C6904ek ekVar, C7379w wVar, byte[] bArr, byte[] bArr2) {
        super(handler);
        this.f23172a = context;
        this.f23173b = (AudioManager) context.getSystemService("audio");
        this.f23176e = ekVar;
        this.f23175d = wVar;
    }

    /* renamed from: c */
    private final float m21305c() {
        int streamVolume = this.f23173b.getStreamVolume(3);
        int streamMaxVolume = this.f23173b.getStreamMaxVolume(3);
        float f = 0.0f;
        if (streamMaxVolume > 0 && streamVolume > 0) {
            float f2 = ((float) streamVolume) / ((float) streamMaxVolume);
            f = 1.0f;
            return f2 > 1.0f ? f : f2;
        }
    }

    /* renamed from: d */
    private final void m21306d() {
        this.f23175d.mo16707e(this.f23174c);
    }

    /* renamed from: a */
    public final void mo16220a() {
        this.f23174c = m21305c();
        m21306d();
        this.f23172a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public final void mo16221b() {
        this.f23172a.getContentResolver().unregisterContentObserver(this);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float c = m21305c();
        if (c != this.f23174c) {
            this.f23174c = c;
            m21306d();
        }
    }
}
