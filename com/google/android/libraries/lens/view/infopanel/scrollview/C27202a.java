package com.google.android.libraries.lens.view.infopanel.scrollview;

/* renamed from: com.google.android.libraries.lens.view.infopanel.scrollview.a */
/* compiled from: PG */
final class C27202a extends C27203b {

    /* renamed from: a */
    private final int f74373a;

    public C27202a(int i) {
        this.f74373a = i;
    }

    /* renamed from: a */
    public final int mo32641a() {
        return this.f74373a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C27203b) && this.f74373a == ((C27203b) obj).mo32641a();
    }

    public final int hashCode() {
        return this.f74373a ^ 1000003;
    }

    public final String toString() {
        int i = this.f74373a;
        return "RelativePosition{viewTop=" + i + "}";
    }
}
