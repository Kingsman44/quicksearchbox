package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6181i;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.i.a */
/* compiled from: PG */
public final class C78573a extends C78577b {

    /* renamed from: a */
    private final boolean f216332a;

    public C78573a(boolean z) {
        this.f216332a = z;
    }

    /* renamed from: a */
    public final boolean mo73541a() {
        return this.f216332a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C78577b) && this.f216332a == ((C78577b) obj).mo73541a();
    }

    public final int hashCode() {
        return (true != this.f216332a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.f216332a;
        return "KeyboardVisibility{keyboardVisible=" + z + "}";
    }
}
