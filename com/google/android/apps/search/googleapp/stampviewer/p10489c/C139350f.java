package com.google.android.apps.search.googleapp.stampviewer.p10489c;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.c.f */
/* compiled from: PG */
public final class C139350f extends C139357m {

    /* renamed from: a */
    private final boolean f378971a;

    /* renamed from: b */
    private final boolean f378972b;

    public C139350f(boolean z, boolean z2) {
        this.f378971a = z;
        this.f378972b = z2;
    }

    /* renamed from: a */
    public final boolean mo114923a() {
        return this.f378972b;
    }

    /* renamed from: b */
    public final boolean mo114924b() {
        return this.f378971a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C139357m) {
            C139357m mVar = (C139357m) obj;
            return this.f378971a == mVar.mo114924b() && this.f378972b == mVar.mo114923a();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.f378971a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.f378972b) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.f378971a;
        boolean z2 = this.f378972b;
        return "SelectDocumentEvent{next=" + z + ", isAutoAdvancing=" + z2 + "}";
    }
}
