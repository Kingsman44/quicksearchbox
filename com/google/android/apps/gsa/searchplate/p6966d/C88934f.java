package com.google.android.apps.gsa.searchplate.p6966d;

/* renamed from: com.google.android.apps.gsa.searchplate.d.f */
/* compiled from: PG */
public final class C88934f {

    /* renamed from: a */
    public int f240912a = 0;

    /* renamed from: b */
    public boolean f240913b = false;

    /* renamed from: c */
    public boolean f240914c = false;

    /* renamed from: d */
    public boolean f240915d = false;

    /* renamed from: e */
    public CharSequence f240916e = null;

    /* renamed from: f */
    public CharSequence f240917f = null;

    /* renamed from: g */
    public int f240918g = 1;

    /* renamed from: a */
    public final C88932d mo82813a() {
        if (!mo82814b()) {
            return C88932d.NOT;
        }
        if (this.f240915d) {
            return C88932d.UNFOCUSED;
        }
        if (this.f240917f != null) {
            return C88932d.SEPARATOR;
        }
        if (this.f240914c) {
            return C88932d.SUGGESTION;
        }
        return C88932d.UNSURE;
    }

    /* renamed from: b */
    public final boolean mo82814b() {
        return this.f240916e != null;
    }
}
