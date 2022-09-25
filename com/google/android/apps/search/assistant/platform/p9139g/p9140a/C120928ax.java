package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108358ft;
import com.google.assistant.p3931f.p3939c.C52846w;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.g.a.ax */
/* compiled from: PG */
public final class C120928ax extends C120920ap {

    /* renamed from: a */
    public Context f336218a;

    /* renamed from: b */
    public String f336219b;

    /* renamed from: c */
    public ComponentName f336220c;

    /* renamed from: d */
    public C52846w f336221d;

    /* renamed from: e */
    public C108358ft f336222e;

    /* renamed from: f */
    private String f336223f;

    /* renamed from: g */
    private String f336224g;

    /* renamed from: h */
    private boolean f336225h;

    /* renamed from: i */
    private C120924at f336226i;

    /* renamed from: j */
    private boolean f336227j;

    /* renamed from: k */
    private byte f336228k;

    public C120928ax() {
    }

    public C120928ax(C120921aq aqVar) {
        C120929ay ayVar = (C120929ay) aqVar;
        this.f336218a = ayVar.f336229b;
        this.f336219b = ayVar.f336230c;
        this.f336220c = ayVar.f336231d;
        this.f336223f = ayVar.f336232e;
        this.f336224g = ayVar.f336233f;
        this.f336225h = ayVar.f336234g;
        this.f336221d = ayVar.f336235h;
        this.f336226i = ayVar.f336236i;
        this.f336227j = ayVar.f336237j;
        this.f336222e = ayVar.f336238k;
        this.f336228k = 3;
    }

    /* renamed from: a */
    public final Context mo104965a() {
        Context context = this.f336218a;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Property \"context\" has not been set");
    }

    /* renamed from: b */
    public final C120921aq mo104966b() {
        Context context;
        String str;
        String str2;
        String str3;
        C120924at atVar;
        C108358ft ftVar;
        if (this.f336228k == 3 && (context = this.f336218a) != null && (str = this.f336219b) != null && (str2 = this.f336223f) != null && (str3 = this.f336224g) != null && (atVar = this.f336226i) != null && (ftVar = this.f336222e) != null) {
            return new C120929ay(context, str, this.f336220c, str2, str3, this.f336225h, this.f336221d, atVar, this.f336227j, ftVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f336218a == null) {
            sb.append(" context");
        }
        if (this.f336219b == null) {
            sb.append(" packageName");
        }
        if (this.f336223f == null) {
            sb.append(" displayName");
        }
        if (this.f336224g == null) {
            sb.append(" invocationName");
        }
        if ((this.f336228k & 1) == 0) {
            sb.append(" useDefaultTts");
        }
        if (this.f336226i == null) {
            sb.append(" host");
        }
        if ((this.f336228k & 2) == 0) {
            sb.append(" hostProvidedRoundedCornerForced");
        }
        if (this.f336222e == null) {
            sb.append(" callbacks");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: d */
    public final Optional mo104968d() {
        ComponentName componentName = this.f336220c;
        if (componentName == null) {
            return Optional.empty();
        }
        return Optional.m71637of(componentName);
    }

    /* renamed from: e */
    public final Optional mo104969e() {
        String str = this.f336223f;
        if (str == null) {
            return Optional.empty();
        }
        return Optional.m71637of(str);
    }

    /* renamed from: f */
    public final Optional mo104970f() {
        C120924at atVar = this.f336226i;
        if (atVar == null) {
            return Optional.empty();
        }
        return Optional.m71637of(atVar);
    }

    /* renamed from: g */
    public final Optional mo104971g() {
        String str = this.f336224g;
        if (str == null) {
            return Optional.empty();
        }
        return Optional.m71637of(str);
    }

    /* renamed from: h */
    public final String mo104972h() {
        String str = this.f336219b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"packageName\" has not been set");
    }

    /* renamed from: i */
    public final void mo104973i(ComponentName componentName) {
        this.f336220c = componentName;
    }

    /* renamed from: j */
    public final void mo104974j(String str) {
        if (str != null) {
            this.f336223f = str;
            return;
        }
        throw new NullPointerException("Null displayName");
    }

    /* renamed from: k */
    public final void mo104975k(C120924at atVar) {
        this.f336226i = atVar;
    }

    /* renamed from: l */
    public final void mo104976l(boolean z) {
        this.f336227j = z;
        this.f336228k = (byte) (this.f336228k | 2);
    }

    /* renamed from: m */
    public final void mo104977m(String str) {
        if (str != null) {
            this.f336224g = str;
            return;
        }
        throw new NullPointerException("Null invocationName");
    }

    /* renamed from: n */
    public final void mo104978n(String str) {
        if (str != null) {
            this.f336219b = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: o */
    public final void mo104979o(boolean z) {
        this.f336225h = z;
        this.f336228k = (byte) (this.f336228k | 1);
    }
}
