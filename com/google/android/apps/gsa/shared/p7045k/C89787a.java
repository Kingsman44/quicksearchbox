package com.google.android.apps.gsa.shared.p7045k;

import com.google.assistant.p3861at.C49875cf;
import java.net.InetAddress;

/* renamed from: com.google.android.apps.gsa.shared.k.a */
/* compiled from: PG */
public final class C89787a extends C89808d {

    /* renamed from: a */
    public String f243014a;

    /* renamed from: b */
    public String f243015b;

    /* renamed from: c */
    public String f243016c;

    /* renamed from: d */
    private InetAddress f243017d;

    /* renamed from: e */
    private C49875cf f243018e;

    /* renamed from: f */
    private boolean f243019f;

    /* renamed from: g */
    private boolean f243020g;

    /* renamed from: h */
    private boolean f243021h;

    /* renamed from: i */
    private int f243022i;

    /* renamed from: j */
    private byte f243023j;

    /* renamed from: k */
    private int f243024k;

    public C89787a() {
    }

    public C89787a(C89809e eVar) {
        C89797b bVar = (C89797b) eVar;
        this.f243014a = bVar.f243059a;
        this.f243017d = bVar.f243060b;
        this.f243015b = bVar.f243061c;
        this.f243016c = bVar.f243062d;
        this.f243024k = bVar.f243068j;
        this.f243018e = bVar.f243063e;
        this.f243019f = bVar.f243064f;
        this.f243020g = bVar.f243065g;
        this.f243021h = bVar.f243066h;
        this.f243022i = bVar.f243067i;
        this.f243023j = 15;
    }

    /* renamed from: a */
    public final C89809e mo83632a() {
        String str;
        InetAddress inetAddress;
        String str2;
        String str3;
        int i;
        C49875cf cfVar;
        if (this.f243023j == 15 && (str = this.f243014a) != null && (inetAddress = this.f243017d) != null && (str2 = this.f243015b) != null && (str3 = this.f243016c) != null && (i = this.f243024k) != 0 && (cfVar = this.f243018e) != null) {
            return new C89797b(str, inetAddress, str2, str3, i, cfVar, this.f243019f, this.f243020g, this.f243021h, this.f243022i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f243014a == null) {
            sb.append(" deviceId");
        }
        if (this.f243017d == null) {
            sb.append(" ipAddress");
        }
        if (this.f243015b == null) {
            sb.append(" modelName");
        }
        if (this.f243016c == null) {
            sb.append(" friendlyName");
        }
        if (this.f243024k == 0) {
            sb.append(" type");
        }
        if (this.f243018e == null) {
            sb.append(" deviceType");
        }
        if ((this.f243023j & 1) == 0) {
            sb.append(" avocadoCapable");
        }
        if ((this.f243023j & 2) == 0) {
            sb.append(" useHttps");
        }
        if ((this.f243023j & 4) == 0) {
            sb.append(" isMultiZoneGroup");
        }
        if ((this.f243023j & 8) == 0) {
            sb.append(" version");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo83633b(boolean z) {
        this.f243019f = z;
        this.f243023j = (byte) (this.f243023j | 1);
    }

    /* renamed from: c */
    public final void mo83634c(String str) {
        if (str != null) {
            this.f243014a = str;
            return;
        }
        throw new NullPointerException("Null deviceId");
    }

    /* renamed from: d */
    public final void mo83635d(C49875cf cfVar) {
        if (cfVar != null) {
            this.f243018e = cfVar;
            return;
        }
        throw new NullPointerException("Null deviceType");
    }

    /* renamed from: e */
    public final void mo83636e(InetAddress inetAddress) {
        if (inetAddress != null) {
            this.f243017d = inetAddress;
            return;
        }
        throw new NullPointerException("Null ipAddress");
    }

    /* renamed from: f */
    public final void mo83637f(boolean z) {
        this.f243021h = z;
        this.f243023j = (byte) (this.f243023j | 4);
    }

    /* renamed from: g */
    public final void mo83638g(boolean z) {
        this.f243020g = z;
        this.f243023j = (byte) (this.f243023j | 2);
    }

    /* renamed from: h */
    public final void mo83639h(int i) {
        this.f243022i = i;
        this.f243023j = (byte) (this.f243023j | 8);
    }

    /* renamed from: i */
    public final void mo83640i(int i) {
        this.f243024k = i;
    }
}
