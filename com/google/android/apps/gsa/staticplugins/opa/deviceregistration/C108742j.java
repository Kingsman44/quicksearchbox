package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.assistant.p3861at.C49875cf;
import java.net.InetAddress;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.j */
/* compiled from: PG */
final class C108742j extends C108735h {

    /* renamed from: a */
    public String f302389a;

    /* renamed from: b */
    public String f302390b;

    /* renamed from: c */
    public String f302391c;

    /* renamed from: d */
    public String f302392d;

    /* renamed from: e */
    public String f302393e;

    /* renamed from: f */
    public String f302394f;

    /* renamed from: g */
    public String f302395g;

    /* renamed from: h */
    public String f302396h;

    /* renamed from: i */
    public String f302397i;

    /* renamed from: j */
    public String f302398j;

    /* renamed from: k */
    private InetAddress f302399k;

    /* renamed from: l */
    private Integer f302400l;

    /* renamed from: m */
    private boolean f302401m;

    /* renamed from: n */
    private String f302402n;

    /* renamed from: o */
    private C49875cf f302403o;

    /* renamed from: p */
    private byte f302404p;

    public C108742j() {
    }

    public C108742j(C108741i iVar) {
        C108743k kVar = (C108743k) iVar;
        this.f302389a = kVar.f302405b;
        this.f302390b = kVar.f302406c;
        this.f302391c = kVar.f302407d;
        this.f302392d = kVar.f302408e;
        this.f302399k = kVar.f302409f;
        this.f302400l = kVar.f302410g;
        this.f302393e = kVar.f302411h;
        this.f302394f = kVar.f302412i;
        this.f302395g = kVar.f302413j;
        this.f302396h = kVar.f302414k;
        this.f302397i = kVar.f302415l;
        this.f302398j = kVar.f302416m;
        this.f302401m = kVar.f302417n;
        this.f302402n = kVar.f302418o;
        this.f302403o = kVar.f302419p;
        this.f302404p = 1;
    }

    /* renamed from: a */
    public final C108741i mo97089a() {
        String str;
        String str2;
        String str3;
        if (this.f302404p != 1 || (str = this.f302396h) == null || (str2 = this.f302397i) == null || (str3 = this.f302398j) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f302396h == null) {
                sb.append(" clientId");
            }
            if (this.f302397i == null) {
                sb.append(" deviceModelId");
            }
            if (this.f302398j == null) {
                sb.append(" certificate");
            }
            if (this.f302404p == 0) {
                sb.append(" voiceMatchSupported");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new C108743k(this.f302389a, this.f302390b, this.f302391c, this.f302392d, this.f302399k, this.f302400l, this.f302393e, this.f302394f, this.f302395g, str, str2, str3, this.f302401m, this.f302402n, this.f302403o);
    }

    /* renamed from: b */
    public final void mo97090b(String str) {
        this.f302402n = str;
    }

    /* renamed from: c */
    public final void mo97091c(C49875cf cfVar) {
        this.f302403o = cfVar;
    }

    /* renamed from: d */
    public final void mo97092d(String str) {
        this.f302391c = str;
    }

    /* renamed from: e */
    public final void mo97093e(InetAddress inetAddress) {
        this.f302399k = inetAddress;
    }

    /* renamed from: f */
    public final void mo97094f(Integer num) {
        this.f302400l = num;
    }

    /* renamed from: g */
    public final void mo97095g(boolean z) {
        this.f302401m = z;
        this.f302404p = 1;
    }
}
