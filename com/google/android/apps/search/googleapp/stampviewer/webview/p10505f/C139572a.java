package com.google.android.apps.search.googleapp.stampviewer.webview.p10505f;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.f.a */
/* compiled from: PG */
final class C139572a extends C139605t {

    /* renamed from: a */
    private final int f379438a;

    public C139572a(int i) {
        if (i != 0) {
            this.f379438a = i;
            return;
        }
        throw new NullPointerException("Null action");
    }

    /* renamed from: a */
    public final int mo115071a() {
        return this.f379438a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C139605t) && this.f379438a == ((C139605t) obj).mo115071a();
    }

    public final int hashCode() {
        return this.f379438a ^ 1000003;
    }

    public final String toString() {
        int i = this.f379438a;
        String str = i != 1 ? i != 2 ? i != 3 ? "REPORT" : "FEEDBACK" : "HELP" : "SHARE";
        return "OverflowMenuItemClickEvent{action=" + str + "}";
    }
}
