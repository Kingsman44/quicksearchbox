package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.c */
/* compiled from: PG */
public final class C16128c extends C16076ab {

    /* renamed from: a */
    public String f47607a;

    /* renamed from: b */
    private long f47608b;

    /* renamed from: c */
    private long f47609c;

    /* renamed from: d */
    private long f47610d;

    /* renamed from: e */
    private long f47611e;

    /* renamed from: f */
    private long f47612f;

    /* renamed from: g */
    private long f47613g;

    /* renamed from: h */
    private long f47614h;

    /* renamed from: i */
    private byte f47615i;

    public C16128c() {
    }

    public C16128c(C16077ac acVar) {
        C16155d dVar = (C16155d) acVar;
        this.f47607a = dVar.f47648a;
        this.f47608b = dVar.f47649b;
        this.f47609c = dVar.f47650c;
        this.f47610d = dVar.f47651d;
        this.f47611e = dVar.f47652e;
        this.f47612f = dVar.f47653f;
        this.f47613g = dVar.f47654g;
        this.f47614h = dVar.f47655h;
        this.f47615i = Byte.MAX_VALUE;
    }

    /* renamed from: a */
    public final C16077ac mo22688a() {
        String str;
        if (this.f47615i != Byte.MAX_VALUE || (str = this.f47607a) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f47607a == null) {
                sb.append(" candidateSuggestionId");
            }
            if ((this.f47615i & 1) == 0) {
                sb.append(" clickCount");
            }
            if ((this.f47615i & 2) == 0) {
                sb.append(" showCount");
            }
            if ((this.f47615i & 4) == 0) {
                sb.append(" lastClickTimestamp");
            }
            if ((this.f47615i & 8) == 0) {
                sb.append(" lastShowTimestamp");
            }
            if ((this.f47615i & 16) == 0) {
                sb.append(" lastClearedTimestamp");
            }
            if ((this.f47615i & 32) == 0) {
                sb.append(" dismissalCount");
            }
            if ((this.f47615i & 64) == 0) {
                sb.append(" lastDismissalTimestamp");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        long j = this.f47608b;
        long j2 = this.f47609c;
        long j3 = this.f47610d;
        long j4 = this.f47611e;
        long j5 = this.f47612f;
        return new C16155d(str, j, j2, j3, j4, j5, this.f47613g, this.f47614h);
    }

    /* renamed from: b */
    public final void mo22689b(String str) {
        if (str != null) {
            this.f47607a = str;
            return;
        }
        throw new NullPointerException("Null candidateSuggestionId");
    }

    /* renamed from: c */
    public final void mo22690c(long j) {
        this.f47608b = j;
        this.f47615i = (byte) (this.f47615i | 1);
    }

    /* renamed from: d */
    public final void mo22691d(long j) {
        this.f47613g = j;
        this.f47615i = (byte) (this.f47615i | 32);
    }

    /* renamed from: e */
    public final void mo22692e(long j) {
        this.f47612f = j;
        this.f47615i = (byte) (this.f47615i | 16);
    }

    /* renamed from: f */
    public final void mo22693f(long j) {
        this.f47610d = j;
        this.f47615i = (byte) (this.f47615i | 4);
    }

    /* renamed from: g */
    public final void mo22694g(long j) {
        this.f47614h = j;
        this.f47615i = (byte) (this.f47615i | 64);
    }

    /* renamed from: h */
    public final void mo22695h(long j) {
        this.f47611e = j;
        this.f47615i = (byte) (this.f47615i | 8);
    }

    /* renamed from: i */
    public final void mo22696i(long j) {
        this.f47609c = j;
        this.f47615i = (byte) (this.f47615i | 2);
    }
}
