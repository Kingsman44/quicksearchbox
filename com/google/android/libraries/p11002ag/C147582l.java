package com.google.android.libraries.p11002ag;

import com.evernote.android.state.BuildConfig;
import java.io.Serializable;

/* renamed from: com.google.android.libraries.ag.l */
/* compiled from: PG */
public final class C147582l implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public int f398369a = 0;

    /* renamed from: b */
    public long f398370b = 0;

    /* renamed from: c */
    public boolean f398371c;

    /* renamed from: d */
    public String f398372d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f398373e;

    /* renamed from: f */
    public boolean f398374f = false;

    /* renamed from: g */
    public boolean f398375g;

    /* renamed from: h */
    public int f398376h = 1;

    /* renamed from: i */
    public String f398377i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f398378j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public int f398379k = 5;

    /* renamed from: a */
    public final boolean mo124346a(C147582l lVar) {
        if (lVar == null) {
            return false;
        }
        if (this == lVar) {
            return true;
        }
        return this.f398369a == lVar.f398369a && this.f398370b == lVar.f398370b && this.f398372d.equals(lVar.f398372d) && this.f398374f == lVar.f398374f && this.f398376h == lVar.f398376h && this.f398377i.equals(lVar.f398377i) && this.f398379k == lVar.f398379k && this.f398378j.equals(lVar.f398378j);
    }

    /* renamed from: b */
    public final void mo124347b(String str) {
        str.getClass();
        this.f398371c = true;
        this.f398372d = str;
    }

    /* renamed from: c */
    public final void mo124348c() {
        this.f398373e = true;
        this.f398374f = true;
    }

    /* renamed from: d */
    public final void mo124349d(int i) {
        this.f398375g = true;
        this.f398376h = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C147582l) && mo124346a((C147582l) obj);
    }

    public final int hashCode() {
        int hashCode = (((((((((((this.f398369a + 2173) * 53) + Long.valueOf(this.f398370b).hashCode()) * 53) + this.f398372d.hashCode()) * 53) + (true != this.f398374f ? 1237 : 1231)) * 53) + this.f398376h) * 53) + this.f398377i.hashCode()) * 53;
        int i = this.f398379k;
        if (i != 0) {
            return ((((hashCode + i) * 53) + this.f398378j.hashCode()) * 53) + 1237;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Country Code: ");
        sb.append(this.f398369a);
        sb.append(" National Number: ");
        sb.append(this.f398370b);
        if (this.f398373e && this.f398374f) {
            sb.append(" Leading Zero(s): true");
        }
        if (this.f398375g) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.f398376h);
        }
        if (this.f398371c) {
            sb.append(" Extension: ");
            sb.append(this.f398372d);
        }
        return sb.toString();
    }
}
