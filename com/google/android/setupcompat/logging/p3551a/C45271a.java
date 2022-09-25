package com.google.android.setupcompat.logging.p3551a;

/* renamed from: com.google.android.setupcompat.logging.a.a */
/* compiled from: PG */
public final class C45271a {

    /* renamed from: a */
    public String f118255a = "Unknown";

    /* renamed from: b */
    public String f118256b = "Unknown";

    /* renamed from: a */
    public static String m80653a(String str, boolean z) {
        if (!"VisibleUsingXml".equals(str) && !"Visible".equals(str) && !"Invisible".equals(str)) {
            throw new IllegalStateException("Illegal visibility state: ".concat(String.valueOf(str)));
        } else if (z) {
            if ("Invisible".equals(str)) {
                return "Invisible_to_Visible";
            }
            return str;
        } else if ("VisibleUsingXml".equals(str)) {
            return "VisibleUsingXml_to_Invisible";
        } else {
            return "Visible".equals(str) ? "Visible_to_Invisible" : str;
        }
    }

    /* renamed from: d */
    public static final String m80654d(boolean z, boolean z2) {
        return z ? true != z2 ? "Visible" : "VisibleUsingXml" : "Invisible";
    }

    /* renamed from: b */
    public final void mo49165b(boolean z, boolean z2) {
        this.f118255a = this.f118255a.equals("Unknown") ? m80654d(z, z2) : this.f118255a;
    }

    /* renamed from: c */
    public final void mo49166c(boolean z, boolean z2) {
        this.f118256b = this.f118256b.equals("Unknown") ? m80654d(z, z2) : this.f118256b;
    }
}
