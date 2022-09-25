package com.google.android.apps.search.googleapp.stampviewer.p10490d;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.d.a */
/* compiled from: PG */
public final class C139362a extends C139379e {

    /* renamed from: a */
    private String f378974a;

    /* renamed from: b */
    private boolean f378975b;

    /* renamed from: c */
    private byte f378976c;

    /* renamed from: a */
    public final C139380f mo114928a() {
        String str;
        if (this.f378976c == 1 && (str = this.f378974a) != null) {
            return new C139364b(str, this.f378975b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f378974a == null) {
            sb.append(" storyUrl");
        }
        if (this.f378976c == 0) {
            sb.append(" isHearted");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo114929b(boolean z) {
        this.f378975b = z;
        this.f378976c = 1;
    }

    /* renamed from: c */
    public final void mo114930c(String str) {
        if (str != null) {
            this.f378974a = str;
            return;
        }
        throw new NullPointerException("Null storyUrl");
    }
}
