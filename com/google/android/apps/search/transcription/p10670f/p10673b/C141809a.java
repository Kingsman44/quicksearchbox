package com.google.android.apps.search.transcription.p10670f.p10673b;

import android.net.Uri;
import com.google.android.apps.search.transcription.p10666b.C141743b;
import com.google.android.apps.search.transcription.p10670f.C141806ay;
import com.google.android.apps.search.transcription.p10670f.C141921o;

/* renamed from: com.google.android.apps.search.transcription.f.b.a */
/* compiled from: PG */
final class C141809a extends C141831w {

    /* renamed from: a */
    public String f384850a;

    /* renamed from: b */
    public C141806ay f384851b;

    /* renamed from: c */
    public C141921o f384852c;

    /* renamed from: d */
    public Boolean f384853d;

    /* renamed from: e */
    public C141743b f384854e;

    /* renamed from: f */
    public Uri f384855f;

    /* renamed from: g */
    private boolean f384856g;

    /* renamed from: h */
    private int f384857h;

    /* renamed from: i */
    private boolean f384858i;

    /* renamed from: j */
    private byte f384859j;

    public C141809a() {
    }

    public C141809a(C141832x xVar) {
        C141810b bVar = (C141810b) xVar;
        this.f384850a = bVar.f384860a;
        this.f384851b = bVar.f384861b;
        this.f384852c = bVar.f384862c;
        this.f384856g = bVar.f384863d;
        this.f384853d = bVar.f384864e;
        this.f384854e = bVar.f384865f;
        this.f384857h = bVar.f384866g;
        this.f384855f = bVar.f384867h;
        this.f384858i = bVar.f384868i;
        this.f384859j = 7;
    }

    /* renamed from: a */
    public final C141832x mo116762a() {
        if (this.f384859j == 7) {
            return new C141810b(this.f384850a, this.f384851b, this.f384852c, this.f384856g, this.f384853d, this.f384854e, this.f384857h, this.f384855f, this.f384858i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f384859j & 1) == 0) {
            sb.append(" hasStartOfSpeech");
        }
        if ((this.f384859j & 2) == 0) {
            sb.append(" speechLevel");
        }
        if ((this.f384859j & 4) == 0) {
            sb.append(" lastAudioRationaleToastTimestampLoaded");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo116763b(C141743b bVar) {
        this.f384854e = bVar;
    }

    /* renamed from: c */
    public final void mo116764c(Uri uri) {
        this.f384855f = uri;
    }

    /* renamed from: d */
    public final void mo116765d(C141921o oVar) {
        this.f384852c = oVar;
    }

    /* renamed from: e */
    public final void mo116766e(boolean z) {
        this.f384856g = z;
        this.f384859j = (byte) (this.f384859j | 1);
    }

    /* renamed from: f */
    public final void mo116767f(Boolean bool) {
        this.f384853d = bool;
    }

    /* renamed from: g */
    public final void mo116768g(String str) {
        this.f384850a = str;
    }

    /* renamed from: h */
    public final void mo116769h(boolean z) {
        this.f384858i = z;
        this.f384859j = (byte) (this.f384859j | 4);
    }

    /* renamed from: i */
    public final void mo116770i(C141806ay ayVar) {
        this.f384851b = ayVar;
    }

    /* renamed from: j */
    public final void mo116771j(int i) {
        this.f384857h = i;
        this.f384859j = (byte) (this.f384859j | 2);
    }
}
