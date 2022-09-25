package com.google.android.libraries.notifications.data;

import com.google.p4160bf.p4164b.p4165a.C55683w;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C63070h;

/* renamed from: com.google.android.libraries.notifications.data.c */
/* compiled from: PG */
public final class C29789c {

    /* renamed from: a */
    public String f80736a;

    /* renamed from: b */
    public String f80737b;

    /* renamed from: c */
    public String f80738c;

    /* renamed from: d */
    public C63070h f80739d;

    /* renamed from: e */
    public String f80740e;

    /* renamed from: f */
    public int f80741f;

    /* renamed from: g */
    private int f80742g;

    /* renamed from: h */
    private C55564bq f80743h;

    /* renamed from: i */
    private C55683w f80744i;

    /* renamed from: j */
    private C62910ar f80745j;

    /* renamed from: k */
    private byte f80746k;

    public C29789c() {
    }

    public C29789c(C29824o oVar) {
        C29790d dVar = (C29790d) oVar;
        this.f80736a = dVar.f80747a;
        this.f80741f = dVar.f80756j;
        this.f80742g = dVar.f80748b;
        this.f80737b = dVar.f80749c;
        this.f80738c = dVar.f80750d;
        this.f80743h = dVar.f80751e;
        this.f80739d = dVar.f80752f;
        this.f80740e = dVar.f80753g;
        this.f80744i = dVar.f80754h;
        this.f80745j = dVar.f80755i;
        this.f80746k = 1;
    }

    /* renamed from: a */
    public final C29824o mo35015a() {
        String str;
        int i;
        String str2;
        String str3;
        C55564bq bqVar;
        String str4;
        C55683w wVar;
        C62910ar arVar;
        if (this.f80746k == 1 && (str = this.f80736a) != null && (i = this.f80741f) != 0 && (str2 = this.f80737b) != null && (str3 = this.f80738c) != null && (bqVar = this.f80743h) != null && (str4 = this.f80740e) != null && (wVar = this.f80744i) != null && (arVar = this.f80745j) != null) {
            return new C29790d(str, i, this.f80742g, str2, str3, bqVar, this.f80739d, str4, wVar, arVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f80736a == null) {
            sb.append(" actionId");
        }
        if (this.f80741f == 0) {
            sb.append(" builtInActionType");
        }
        if (this.f80746k == 0) {
            sb.append(" iconResourceId");
        }
        if (this.f80737b == null) {
            sb.append(" text");
        }
        if (this.f80738c == null) {
            sb.append(" url");
        }
        if (this.f80743h == null) {
            sb.append(" threadStateUpdate");
        }
        if (this.f80740e == null) {
            sb.append(" replyHintText");
        }
        if (this.f80744i == null) {
            sb.append(" preferenceKey");
        }
        if (this.f80745j == null) {
            sb.append(" snoozeDuration");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo35016b(int i) {
        this.f80742g = i;
        this.f80746k = 1;
    }

    /* renamed from: c */
    public final void mo35017c(C55683w wVar) {
        if (wVar != null) {
            this.f80744i = wVar;
            return;
        }
        throw new NullPointerException("Null preferenceKey");
    }

    /* renamed from: d */
    public final void mo35018d(C62910ar arVar) {
        if (arVar != null) {
            this.f80745j = arVar;
            return;
        }
        throw new NullPointerException("Null snoozeDuration");
    }

    /* renamed from: e */
    public final void mo35019e(C55564bq bqVar) {
        if (bqVar != null) {
            this.f80743h = bqVar;
            return;
        }
        throw new NullPointerException("Null threadStateUpdate");
    }
}
