package com.google.android.libraries.assistant.accessory.p618b;

/* renamed from: com.google.android.libraries.assistant.accessory.b.c */
/* compiled from: PG */
public final class C10998c extends C11002g {

    /* renamed from: a */
    public Integer f36149a;

    /* renamed from: b */
    public String f36150b;

    /* renamed from: c */
    public Integer f36151c;

    /* renamed from: d */
    public Integer f36152d;

    /* renamed from: e */
    public String f36153e;

    /* renamed from: f */
    public Integer f36154f;

    /* renamed from: g */
    public Integer f36155g;

    /* renamed from: h */
    private String f36156h;

    public C10998c() {
    }

    public C10998c(C11003h hVar) {
        C10999d dVar = (C10999d) hVar;
        this.f36149a = dVar.f36157a;
        this.f36156h = dVar.f36158b;
        this.f36150b = dVar.f36159c;
        this.f36151c = dVar.f36160d;
        this.f36152d = dVar.f36161e;
        this.f36153e = dVar.f36162f;
        this.f36154f = dVar.f36163g;
        this.f36155g = dVar.f36164h;
    }

    /* renamed from: a */
    public final C11003h mo19378a() {
        String str;
        Integer num;
        Integer num2 = this.f36149a;
        if (num2 != null && (str = this.f36156h) != null && (num = this.f36155g) != null) {
            return new C10999d(num2, str, this.f36150b, this.f36151c, this.f36152d, this.f36153e, this.f36154f, num);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f36149a == null) {
            sb.append(" remotePeerAction");
        }
        if (this.f36156h == null) {
            sb.append(" deviceId");
        }
        if (this.f36155g == null) {
            sb.append(" order");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo19379b(String str) {
        if (str != null) {
            this.f36156h = str;
            return;
        }
        throw new NullPointerException("Null deviceId");
    }

    /* renamed from: c */
    public final void mo19380c(int i) {
        this.f36155g = Integer.valueOf(i);
    }

    /* renamed from: d */
    public final void mo19381d(int i) {
        this.f36154f = Integer.valueOf(i);
    }

    /* renamed from: e */
    public final void mo19382e() {
        this.f36149a = 5;
    }
}
