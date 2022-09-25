package com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.e */
/* compiled from: PG */
public final class C111242e extends C111251n {

    /* renamed from: a */
    public String f309557a;

    /* renamed from: b */
    public String f309558b;

    /* renamed from: c */
    private boolean f309559c;

    /* renamed from: d */
    private byte f309560d;

    public C111242e() {
    }

    public C111242e(C111252o oVar) {
        C111243f fVar = (C111243f) oVar;
        this.f309557a = fVar.f309561a;
        this.f309558b = fVar.f309562b;
        this.f309559c = fVar.f309563c;
        this.f309560d = 1;
    }

    /* renamed from: a */
    public final C111252o mo99068a() {
        String str;
        String str2;
        if (this.f309560d == 1 && (str = this.f309557a) != null && (str2 = this.f309558b) != null) {
            return new C111243f(str, str2, this.f309559c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f309557a == null) {
            sb.append(" message");
        }
        if (this.f309558b == null) {
            sb.append(" expandedMessage");
        }
        if (this.f309560d == 0) {
            sb.append(" isExpanded");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo99069b(boolean z) {
        this.f309559c = z;
        this.f309560d = 1;
    }
}
