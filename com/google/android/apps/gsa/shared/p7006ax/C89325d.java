package com.google.android.apps.gsa.shared.p7006ax;

import com.google.assistant.p3861at.C49875cf;

/* renamed from: com.google.android.apps.gsa.shared.ax.d */
/* compiled from: PG */
public final class C89325d extends C89327f {

    /* renamed from: a */
    public String f242170a;

    /* renamed from: b */
    public String f242171b;

    /* renamed from: c */
    public String f242172c;

    /* renamed from: d */
    public String f242173d;

    /* renamed from: e */
    public String f242174e;

    /* renamed from: f */
    public String f242175f;

    /* renamed from: g */
    private boolean f242176g;

    /* renamed from: h */
    private int f242177h;

    /* renamed from: i */
    private C49875cf f242178i;

    /* renamed from: j */
    private byte f242179j;

    /* renamed from: a */
    public final C89328g mo83258a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C49875cf cfVar;
        if (this.f242179j == 3 && (str = this.f242170a) != null && (str2 = this.f242171b) != null && (str3 = this.f242172c) != null && (str4 = this.f242173d) != null && (str5 = this.f242174e) != null && (str6 = this.f242175f) != null && (cfVar = this.f242178i) != null) {
            return new C89326e(str, str2, str3, str4, str5, this.f242176g, str6, this.f242177h, cfVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f242170a == null) {
            sb.append(" libassistantId");
        }
        if (this.f242171b == null) {
            sb.append(" deviceName");
        }
        if (this.f242172c == null) {
            sb.append(" clientId");
        }
        if (this.f242173d == null) {
            sb.append(" deviceModelId");
        }
        if (this.f242174e == null) {
            sb.append(" certificate");
        }
        if ((this.f242179j & 1) == 0) {
            sb.append(" voiceMatchSupported");
        }
        if (this.f242175f == null) {
            sb.append(" locale");
        }
        if ((this.f242179j & 2) == 0) {
            sb.append(" numSignedInUsers");
        }
        if (this.f242178i == null) {
            sb.append(" assistantDeviceType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo83259b(C49875cf cfVar) {
        if (cfVar != null) {
            this.f242178i = cfVar;
            return;
        }
        throw new NullPointerException("Null assistantDeviceType");
    }

    /* renamed from: c */
    public final void mo83260c(String str) {
        if (str != null) {
            this.f242171b = str;
            return;
        }
        throw new NullPointerException("Null deviceName");
    }

    /* renamed from: d */
    public final void mo83261d(int i) {
        this.f242177h = i;
        this.f242179j = (byte) (this.f242179j | 2);
    }

    /* renamed from: e */
    public final void mo83262e(boolean z) {
        this.f242176g = z;
        this.f242179j = (byte) (this.f242179j | 1);
    }
}
