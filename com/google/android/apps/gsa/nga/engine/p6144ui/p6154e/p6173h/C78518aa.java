package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.aa */
/* compiled from: PG */
public final class C78518aa extends C78530am {

    /* renamed from: a */
    public C78534aq f216257a;

    /* renamed from: b */
    public C78531an f216258b;

    /* renamed from: c */
    public C78538au f216259c;

    /* renamed from: a */
    public final C78540aw mo73434a() {
        if (this.f216257a != null && this.f216258b != null && this.f216259c != null) {
            return new C78519ab(this.f216257a, this.f216258b, this.f216259c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f216257a == null) {
            sb.append(" singleContent");
        }
        if (this.f216258b == null) {
            sb.append(" doubleContent");
        }
        if (this.f216259c == null) {
            sb.append(" topContent");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
