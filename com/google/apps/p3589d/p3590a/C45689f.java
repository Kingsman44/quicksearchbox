package com.google.apps.p3589d.p3590a;

import com.google.apps.p3589d.p3591b.C45719j;
import com.google.apps.p3589d.p3600k.C45946k;

/* renamed from: com.google.apps.d.a.f */
/* compiled from: PG */
final class C45689f extends C45682aa {

    /* renamed from: b */
    private final C45719j f120181b;

    /* renamed from: c */
    private final C45719j f120182c;

    /* renamed from: d */
    private final C45946k f120183d;

    /* renamed from: e */
    private final C45946k f120184e;

    /* renamed from: f */
    private final C45698o f120185f;

    public C45689f(C45719j jVar, C45719j jVar2, C45946k kVar, C45946k kVar2, C45698o oVar) {
        if (jVar != null) {
            this.f120181b = jVar;
            if (jVar2 != null) {
                this.f120182c = jVar2;
                if (kVar != null) {
                    this.f120183d = kVar;
                    if (kVar2 != null) {
                        this.f120184e = kVar2;
                        if (oVar != null) {
                            this.f120185f = oVar;
                            return;
                        }
                        throw new NullPointerException("Null canvasTransform");
                    }
                    throw new NullPointerException("Null renderBounds");
                }
                throw new NullPointerException("Null typesetBounds");
            }
            throw new NullPointerException("Null glyphs");
        }
        throw new NullPointerException("Null lines");
    }

    /* renamed from: a */
    public final C45698o mo49737a() {
        return this.f120185f;
    }

    /* renamed from: b */
    public final C45719j mo49738b() {
        return this.f120182c;
    }

    /* renamed from: c */
    public final C45719j mo49739c() {
        return this.f120181b;
    }

    /* renamed from: d */
    public final C45946k mo49740d() {
        return this.f120184e;
    }

    /* renamed from: e */
    public final C45946k mo49741e() {
        return this.f120183d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45682aa) {
            C45682aa aaVar = (C45682aa) obj;
            return this.f120181b.equals(aaVar.mo49739c()) && this.f120182c.equals(aaVar.mo49738b()) && this.f120183d.equals(aaVar.mo49741e()) && this.f120184e.equals(aaVar.mo49740d()) && this.f120185f.equals(aaVar.mo49737a());
        }
    }

    public final int hashCode() {
        return ((((((((this.f120181b.f120220a.hashCode() ^ 1000003) * 1000003) ^ this.f120182c.f120220a.hashCode()) * 1000003) ^ this.f120183d.hashCode()) * 1000003) ^ this.f120184e.hashCode()) * 1000003) ^ this.f120185f.hashCode();
    }

    public final String toString() {
        String obj = this.f120181b.toString();
        String obj2 = this.f120182c.toString();
        String obj3 = this.f120183d.toString();
        String obj4 = this.f120184e.toString();
        String obj5 = this.f120185f.toString();
        return "RenderGeometry{lines=" + obj + ", glyphs=" + obj2 + ", typesetBounds=" + obj3 + ", renderBounds=" + obj4 + ", canvasTransform=" + obj5 + "}";
    }
}
