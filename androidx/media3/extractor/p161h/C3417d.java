package androidx.media3.extractor.p161h;

import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3330ae;

/* renamed from: androidx.media3.extractor.h.d */
/* compiled from: PG */
final class C3417d {

    /* renamed from: a */
    public final int f10464a;

    /* renamed from: b */
    public int f10465b;

    /* renamed from: c */
    public int f10466c;

    /* renamed from: d */
    public long f10467d;

    /* renamed from: e */
    private final boolean f10468e;

    /* renamed from: f */
    private final C2604ac f10469f;

    /* renamed from: g */
    private final C2604ac f10470g;

    /* renamed from: h */
    private int f10471h;

    /* renamed from: i */
    private int f10472i;

    public C3417d(C2604ac acVar, C2604ac acVar2, boolean z) {
        this.f10470g = acVar;
        this.f10469f = acVar2;
        this.f10468e = z;
        acVar2.mo6131A(12);
        this.f10464a = acVar2.mo6141i();
        acVar.mo6131A(12);
        this.f10472i = acVar.mo6141i();
        C3330ae.m9645b(acVar.mo6134b() != 1 ? false : true, "first_chunk must be 1");
        this.f10465b = -1;
    }

    /* renamed from: a */
    public final boolean mo7386a() {
        long j;
        int i = this.f10465b + 1;
        this.f10465b = i;
        if (i == this.f10464a) {
            return false;
        }
        if (this.f10468e) {
            j = this.f10469f.mo6147o();
        } else {
            j = this.f10469f.mo6146n();
        }
        this.f10467d = j;
        if (this.f10465b == this.f10471h) {
            this.f10466c = this.f10470g.mo6141i();
            C2604ac acVar = this.f10470g;
            acVar.mo6131A(acVar.f7235b + 4);
            int i2 = -1;
            int i3 = this.f10472i - 1;
            this.f10472i = i3;
            if (i3 > 0) {
                i2 = -1 + this.f10470g.mo6141i();
            }
            this.f10471h = i2;
        }
        return true;
    }
}
