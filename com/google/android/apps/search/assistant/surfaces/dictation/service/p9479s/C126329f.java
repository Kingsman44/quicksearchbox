package com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s;

import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119297s;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119299u;
import java.util.Locale;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.s.f */
/* compiled from: PG */
public final class C126329f extends C126349z {

    /* renamed from: a */
    public String f347998a;

    /* renamed from: b */
    private Locale f347999b;

    /* renamed from: c */
    private C119299u f348000c;

    /* renamed from: d */
    private Duration f348001d;

    /* renamed from: e */
    private C119297s f348002e;

    /* renamed from: f */
    private long f348003f;

    /* renamed from: g */
    private byte f348004g;

    public C126329f() {
    }

    public C126329f(C126292aa aaVar) {
        C126330g gVar = (C126330g) aaVar;
        this.f347999b = gVar.f348005a;
        this.f347998a = gVar.f348006b;
        this.f348000c = gVar.f348007c;
        this.f348001d = gVar.f348008d;
        this.f348002e = gVar.f348009e;
        this.f348003f = gVar.f348010f;
        this.f348004g = 1;
    }

    /* renamed from: a */
    public final C126292aa mo107546a() {
        Locale locale;
        String str;
        C119299u uVar;
        Duration duration;
        C119297s sVar;
        if (this.f348004g == 1 && (locale = this.f347999b) != null && (str = this.f347998a) != null && (uVar = this.f348000c) != null && (duration = this.f348001d) != null && (sVar = this.f348002e) != null) {
            return new C126330g(locale, str, uVar, duration, sVar, this.f348003f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f347999b == null) {
            sb.append(" initialSpokenLocale");
        }
        if (this.f347998a == null) {
            sb.append(" initialText");
        }
        if (this.f348000c == null) {
            sb.append(" initialStickiness");
        }
        if (this.f348001d == null) {
            sb.append(" idleTimeout");
        }
        if (this.f348002e == null) {
            sb.append(" requester");
        }
        if (this.f348004g == 0) {
            sb.append(" dictationId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo107547b(long j) {
        this.f348003f = j;
        this.f348004g = 1;
    }

    /* renamed from: c */
    public final void mo107548c(Duration duration) {
        if (duration != null) {
            this.f348001d = duration;
            return;
        }
        throw new NullPointerException("Null idleTimeout");
    }

    /* renamed from: d */
    public final void mo107549d(Locale locale) {
        if (locale != null) {
            this.f347999b = locale;
            return;
        }
        throw new NullPointerException("Null initialSpokenLocale");
    }

    /* renamed from: e */
    public final void mo107550e(C119299u uVar) {
        if (uVar != null) {
            this.f348000c = uVar;
            return;
        }
        throw new NullPointerException("Null initialStickiness");
    }

    /* renamed from: f */
    public final void mo107551f(C119297s sVar) {
        if (sVar != null) {
            this.f348002e = sVar;
            return;
        }
        throw new NullPointerException("Null requester");
    }
}
