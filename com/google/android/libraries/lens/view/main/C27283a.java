package com.google.android.libraries.lens.view.main;

import com.google.android.libraries.lens.p2014e.C24199ab;
import com.google.android.libraries.lens.p2014e.C24203af;
import com.google.android.libraries.lens.view.p2081au.C25560j;
import com.google.android.libraries.lens.view.session.C27777bm;

/* renamed from: com.google.android.libraries.lens.view.main.a */
/* compiled from: PG */
final class C27283a extends C27393ea {

    /* renamed from: a */
    public final C24203af f74650a;

    /* renamed from: b */
    public final C24199ab f74651b;

    /* renamed from: c */
    public final C25560j f74652c;

    /* renamed from: d */
    public final C27777bm f74653d;

    public C27283a(C24203af afVar, C24199ab abVar, C25560j jVar, C27777bm bmVar) {
        if (afVar != null) {
            this.f74650a = afVar;
            if (abVar != null) {
                this.f74651b = abVar;
                if (jVar != null) {
                    this.f74652c = jVar;
                    if (bmVar != null) {
                        this.f74653d = bmVar;
                        return;
                    }
                    throw new NullPointerException("Null userSelection");
                }
                throw new NullPointerException("Null prefetchImage");
            }
            throw new NullPointerException("Null lensResult");
        }
        throw new NullPointerException("Null queryId");
    }

    /* renamed from: a */
    public final C24199ab mo32818a() {
        return this.f74651b;
    }

    /* renamed from: b */
    public final C24203af mo32819b() {
        return this.f74650a;
    }

    /* renamed from: c */
    public final C27777bm mo32820c() {
        return this.f74653d;
    }

    /* renamed from: d */
    public final C25560j mo32821d() {
        return this.f74652c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27393ea) {
            C27393ea eaVar = (C27393ea) obj;
            return this.f74650a.equals(eaVar.mo32819b()) && this.f74651b.equals(eaVar.mo32818a()) && this.f74652c.equals(eaVar.mo32821d()) && this.f74653d.equals(eaVar.mo32820c());
        }
    }

    public final int hashCode() {
        return ((((((this.f74650a.hashCode() ^ 1000003) * 1000003) ^ this.f74651b.hashCode()) * 1000003) ^ this.f74652c.hashCode()) * 1000003) ^ this.f74653d.hashCode();
    }

    public final String toString() {
        String obj = this.f74650a.toString();
        String obj2 = this.f74651b.toString();
        String obj3 = this.f74652c.toString();
        String obj4 = this.f74653d.toString();
        return "InfoPanelResult{queryId=" + obj + ", lensResult=" + obj2 + ", prefetchImage=" + obj3 + ", userSelection=" + obj4 + "}";
    }
}
