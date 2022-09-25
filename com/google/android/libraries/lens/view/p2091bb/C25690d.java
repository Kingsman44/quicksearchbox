package com.google.android.libraries.lens.view.p2091bb;

import android.graphics.RectF;

/* renamed from: com.google.android.libraries.lens.view.bb.d */
/* compiled from: PG */
final class C25690d extends C25688b {

    /* renamed from: c */
    private final RectF f69833c;

    /* renamed from: d */
    private final boolean f69834d;

    /* renamed from: e */
    private final int f69835e;

    public C25690d(RectF rectF, int i, boolean z) {
        this.f69833c = rectF;
        this.f69835e = i;
        this.f69834d = z;
    }

    /* renamed from: a */
    public final RectF mo30793a() {
        return this.f69833c;
    }

    /* renamed from: c */
    public final boolean mo30794c() {
        return this.f69834d;
    }

    /* renamed from: d */
    public final int mo30795d() {
        return this.f69835e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25688b) {
            C25688b bVar = (C25688b) obj;
            if (this.f69833c.equals(bVar.mo30793a())) {
                int i = this.f69835e;
                int d = bVar.mo30795d();
                if (i != 0) {
                    return i == d && this.f69834d == bVar.mo30794c();
                }
                throw null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.f69833c.hashCode() ^ 1000003) * 1000003;
        int i = this.f69835e;
        if (i != 0) {
            return ((hashCode ^ i) * 1000003) ^ (true != this.f69834d ? 1237 : 1231);
        }
        throw null;
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.f69833c);
        switch (this.f69835e) {
            case 1:
                str = "TEXT";
                break;
            case 2:
                str = "SERVER";
                break;
            case 3:
                str = "GLEAM";
                break;
            case 4:
                str = "REGION_SEARCH";
                break;
            case 5:
                str = "AUTO_SET";
                break;
            case 6:
                str = "SELECTION_STATE";
                break;
            default:
                str = "null";
                break;
        }
        boolean z = this.f69834d;
        return "AreaOfInterest{region=" + valueOf + ", source=" + str + ", isPoint=" + z + "}";
    }
}
