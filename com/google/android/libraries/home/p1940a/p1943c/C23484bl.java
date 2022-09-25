package com.google.android.libraries.home.p1940a.p1943c;

import java.util.Collection;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.bl */
/* compiled from: PG */
public final class C23484bl implements C23571er {

    /* renamed from: a */
    public static final C23483bk f64220a = new C23483bk();

    /* renamed from: b */
    private final C23482bj f64221b;

    /* renamed from: c */
    private final C23478bf f64222c;

    /* renamed from: d */
    private final C23480bh f64223d;

    /* renamed from: e */
    private final C23550dx f64224e;

    /* renamed from: f */
    private final C23424b f64225f;

    public C23484bl() {
        C23481bi biVar = C23482bj.f64218b;
        throw null;
    }

    public C23484bl(C23482bj bjVar, C23478bf bfVar, C23480bh bhVar, C23550dx dxVar, C23424b bVar) {
        C69664n.m101061g(bjVar, "lockUnlockParameter");
        C69664n.m101061g(bfVar, "isJammedParameter");
        C69664n.m101061g(bhVar, "lockStateChangedTimeParameter");
        C69664n.m101061g(dxVar, "proximityTokenParameter");
        C69664n.m101061g(bVar, "actorNameParameter");
        this.f64221b = bjVar;
        this.f64222c = bfVar;
        this.f64223d = bhVar;
        this.f64224e = dxVar;
        this.f64225f = bVar;
    }

    /* renamed from: a */
    public final C23574eu mo28848a() {
        return C23574eu.LOCK_UNLOCK;
    }

    /* renamed from: b */
    public final Collection mo28849b() {
        return C69540x.m100947e(this.f64221b, this.f64222c, this.f64223d, this.f64224e, this.f64225f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23484bl)) {
            return false;
        }
        C23484bl blVar = (C23484bl) obj;
        return C69664n.m101066l(this.f64221b, blVar.f64221b) && C69664n.m101066l(this.f64222c, blVar.f64222c) && C69664n.m101066l(this.f64223d, blVar.f64223d) && C69664n.m101066l(this.f64224e, blVar.f64224e) && C69664n.m101066l(this.f64225f, blVar.f64225f);
    }

    public final int hashCode() {
        return (((((((this.f64221b.hashCode() * 31) + this.f64222c.hashCode()) * 31) + this.f64223d.hashCode()) * 31) + this.f64224e.hashCode()) * 31) + this.f64225f.hashCode();
    }

    public final String toString() {
        C23482bj bjVar = this.f64221b;
        C23478bf bfVar = this.f64222c;
        C23480bh bhVar = this.f64223d;
        C23550dx dxVar = this.f64224e;
        C23424b bVar = this.f64225f;
        return "HomeAutomationLockUnlockTrait(lockUnlockParameter=" + bjVar + ", isJammedParameter=" + bfVar + ", lockStateChangedTimeParameter=" + bhVar + ", proximityTokenParameter=" + dxVar + ", actorNameParameter=" + bVar + ")";
    }
}
