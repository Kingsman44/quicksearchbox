package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.assistant.p3994s.p3995a.C53306j;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.a */
/* compiled from: PG */
public final class C124044a extends C124054ai {

    /* renamed from: a */
    private C53306j f342620a;

    /* renamed from: b */
    private int f342621b;

    /* renamed from: c */
    private String f342622c;

    /* renamed from: d */
    private byte f342623d;

    /* renamed from: a */
    public final C124055aj mo106245a() {
        C53306j jVar;
        String str;
        if (this.f342623d == 1 && (jVar = this.f342620a) != null && (str = this.f342622c) != null) {
            return new C124072b(jVar, this.f342621b, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f342620a == null) {
            sb.append(" clientType");
        }
        if (this.f342623d == 0) {
            sb.append(" dataType");
        }
        if (this.f342622c == null) {
            sb.append(" dataId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo106246b(C53306j jVar) {
        if (jVar != null) {
            this.f342620a = jVar;
            return;
        }
        throw new NullPointerException("Null clientType");
    }

    /* renamed from: c */
    public final void mo106247c(String str) {
        if (str != null) {
            this.f342622c = str;
            return;
        }
        throw new NullPointerException("Null dataId");
    }

    /* renamed from: d */
    public final void mo106248d(int i) {
        this.f342621b = i;
        this.f342623d = 1;
    }
}
