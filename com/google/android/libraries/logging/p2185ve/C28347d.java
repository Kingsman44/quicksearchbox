package com.google.android.libraries.logging.p2185ve;

import android.util.Log;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28314a;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28317d;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.p4566l.C60213m;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;

/* renamed from: com.google.android.libraries.logging.ve.d */
/* compiled from: PG */
public class C28347d {

    /* renamed from: a */
    public final C28480t f77062a = ((C28480t) C28481u.f77286h.createBuilder());

    /* renamed from: b */
    public final C60213m f77063b;

    /* renamed from: c */
    public C28439i f77064c = null;

    /* renamed from: d */
    private C28413f f77065d = C28439i.f77215a;

    protected C28347d(C28427h hVar) {
        this.f77063b = hVar.f77198a;
        m53021a(((C60214n) hVar.f77198a.instance).f162918c);
    }

    /* renamed from: a */
    private final void m53021a(int i) {
        C28480t tVar = this.f77062a;
        long j = ((C28481u) tVar.instance).f77293f;
        tVar.copyOnWrite();
        C28481u uVar = (C28481u) tVar.instance;
        uVar.f77288a |= 8;
        uVar.f77293f = j + ((long) i);
    }

    /* renamed from: b */
    private final void m53022b(int i) {
        C28480t tVar = this.f77062a;
        long j = ((C28481u) tVar.instance).f77294g;
        tVar.copyOnWrite();
        C28481u uVar = (C28481u) tVar.instance;
        uVar.f77288a |= 16;
        uVar.f77294g = j + ((long) i);
    }

    /* renamed from: e */
    public final C28439i mo33857e(C28317d dVar) {
        C58838bb.m90884s(this.f77064c == null, "Cannot create CVE twice.");
        C28480t tVar = this.f77062a;
        C60213m mVar = this.f77063b;
        tVar.copyOnWrite();
        C28481u uVar = (C28481u) tVar.instance;
        C60214n nVar = (C60214n) mVar.build();
        C28481u uVar2 = C28481u.f77286h;
        nVar.getClass();
        uVar.f77290c = nVar;
        uVar.f77288a = 1 | uVar.f77288a;
        C28439i iVar = new C28439i((C28480t) ((C28481u) this.f77062a.build()).toBuilder(), this.f77065d, dVar);
        this.f77064c = iVar;
        C28317d dVar2 = iVar.f77219e;
        if (!dVar2.f77002a.isEmpty()) {
            if (Log.isLoggable("GIL", 2)) {
                Log.v("GIL", "Instrumented: ".concat(String.valueOf(String.valueOf(iVar))));
            }
            for (C28314a f : dVar2.f77002a) {
                f.mo33817f();
            }
        }
        return this.f77064c;
    }

    /* renamed from: f */
    public final void mo33858f(C28353e eVar) {
        C28439i iVar = this.f77064c;
        boolean z = false;
        C58838bb.m90887v(iVar == null, "CVE %s has already been built.", iVar);
        C60214n nVar = ((C28481u) this.f77062a.instance).f77290c;
        if (nVar == null) {
            nVar = C60214n.f162914g;
        }
        if ((nVar.f162916a & 2048) != 0) {
            z = true;
        }
        C58838bb.m90883r(!z);
        if (!this.f77062a.mo58882j(eVar.f77079a)) {
            C28480t tVar = this.f77062a;
            int i = ((C62940bt) eVar.f77079a).f169971d.f169964b;
            tVar.copyOnWrite();
            C28481u uVar = (C28481u) tVar.instance;
            C62961ch chVar = uVar.f77289b;
            if (!chVar.mo58948c()) {
                uVar.f77289b = C62942bv.mutableCopy(chVar);
            }
            uVar.f77289b.mo58916g(i);
        }
        this.f77062a.mo58885m(eVar.f77079a, eVar.f77080b);
        m53021a(((C62940bt) eVar.f77079a).f169971d.f169964b);
        m53021a(eVar.f77079a.hashCode());
        m53021a(eVar.f77080b.hashCode());
    }

    /* renamed from: g */
    public final void mo33859g(C28423g gVar) {
        C28439i iVar = this.f77064c;
        C58838bb.m90887v(iVar == null, "CVE %s has already been built.", iVar);
        this.f77062a.mo58885m(gVar.f77192a, gVar.f77193b);
        m53022b(((C62940bt) gVar.f77192a).f169971d.f169964b);
        m53022b(gVar.f77192a.hashCode());
        m53022b(gVar.f77193b.hashCode());
    }

    /* renamed from: h */
    public final void mo33860h(int i) {
        C28439i iVar = this.f77064c;
        boolean z = false;
        C58838bb.m90887v(iVar == null, "CVE %s has already been built.", iVar);
        if ((((C60214n) this.f77063b.instance).f162916a & 2048) != 0 || i == 3) {
            z = true;
        }
        C58838bb.m90883r(z);
        C28480t tVar = this.f77062a;
        tVar.copyOnWrite();
        C28481u uVar = (C28481u) tVar.instance;
        C28481u uVar2 = C28481u.f77286h;
        uVar.f77291d = i - 1;
        uVar.f77288a |= 2;
    }

    /* renamed from: i */
    public final void mo33861i(C28413f fVar) {
        C28439i iVar = this.f77064c;
        C58838bb.m90887v(iVar == null, "CVE %s has already been built.", iVar);
        this.f77065d = fVar;
    }
}
