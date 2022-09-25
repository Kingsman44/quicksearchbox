package com.google.android.apps.gsa.nga.engine.p6029g;

import com.google.android.apps.gsa.nga.engine.p5973ax.p5976e.C75177b;
import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;
import com.google.common.p4522b.C58485gu;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.g.a */
/* compiled from: PG */
public final class C76024a extends C76089e {

    /* renamed from: a */
    public C75177b f210867a;

    /* renamed from: b */
    private boolean f210868b;

    /* renamed from: c */
    private boolean f210869c;

    /* renamed from: d */
    private Optional f210870d = Optional.empty();

    /* renamed from: e */
    private Locale f210871e;

    /* renamed from: f */
    private C120124o f210872f;

    /* renamed from: g */
    private C58485gu f210873g;

    /* renamed from: h */
    private byte f210874h;

    /* renamed from: a */
    public final C76090f mo72008a() {
        Locale locale;
        C120124o oVar;
        C75177b bVar;
        C58485gu guVar;
        if (this.f210874h == 3 && (locale = this.f210871e) != null && (oVar = this.f210872f) != null && (bVar = this.f210867a) != null && (guVar = this.f210873g) != null) {
            return new C76075b(this.f210868b, this.f210869c, this.f210870d, locale, oVar, bVar, guVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f210874h & 1) == 0) {
            sb.append(" ngaEnabled");
        }
        if ((this.f210874h & 2) == 0) {
            sb.append(" ngaOnDeviceEnabled");
        }
        if (this.f210871e == null) {
            sb.append(" primaryAssistantLocale");
        }
        if (this.f210872f == null) {
            sb.append(" currentPlatformVariance");
        }
        if (this.f210867a == null) {
            sb.append(" tngFlags");
        }
        if (this.f210873g == null) {
            sb.append(" assistantLocales");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo72009b(C58485gu guVar) {
        if (guVar != null) {
            this.f210873g = guVar;
            return;
        }
        throw new NullPointerException("Null assistantLocales");
    }

    /* renamed from: c */
    public final void mo72010c(C120124o oVar) {
        if (oVar != null) {
            this.f210872f = oVar;
            return;
        }
        throw new NullPointerException("Null currentPlatformVariance");
    }

    /* renamed from: d */
    public final void mo72011d(boolean z) {
        this.f210868b = z;
        this.f210874h = (byte) (this.f210874h | 1);
    }

    /* renamed from: e */
    public final void mo72012e(boolean z) {
        this.f210869c = z;
        this.f210874h = (byte) (this.f210874h | 2);
    }

    /* renamed from: f */
    public final void mo72013f(Optional optional) {
        if (optional != null) {
            this.f210870d = optional;
            return;
        }
        throw new NullPointerException("Null primaryAccount");
    }

    /* renamed from: g */
    public final void mo72014g(Locale locale) {
        if (locale != null) {
            this.f210871e = locale;
            return;
        }
        throw new NullPointerException("Null primaryAssistantLocale");
    }
}
