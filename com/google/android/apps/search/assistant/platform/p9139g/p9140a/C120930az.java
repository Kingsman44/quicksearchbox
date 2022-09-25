package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

/* renamed from: com.google.android.apps.search.assistant.platform.g.a.az */
/* compiled from: PG */
public final class C120930az extends C120922ar {

    /* renamed from: a */
    public C120924at f336239a;

    /* renamed from: b */
    public C120946bo f336240b;

    /* renamed from: c */
    public int f336241c;

    /* renamed from: d */
    private int f336242d;

    /* renamed from: e */
    private byte f336243e;

    /* renamed from: a */
    public final C120923as mo104991a() {
        int i;
        if (this.f336243e == 1 && (i = this.f336241c) != 0) {
            return new C120932ba(this.f336242d, i, this.f336239a, this.f336240b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f336243e == 0) {
            sb.append(" appWidgetId");
        }
        if (this.f336241c == 0) {
            sb.append(" resultCode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo104992b(int i) {
        this.f336242d = i;
        this.f336243e = 1;
    }
}
