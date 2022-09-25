package com.google.android.libraries.logging.p2185ve;

import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28314a;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28316c;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28317d;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.p4566l.C60213m;
import com.google.common.p4552o.p4566l.C60214n;

/* renamed from: com.google.android.libraries.logging.ve.i */
/* compiled from: PG */
public final class C28439i {

    /* renamed from: a */
    public static final C28413f f77215a = C28296a.f76981a;

    /* renamed from: b */
    public static final C28413f f77216b = C28311b.f76998a;

    /* renamed from: c */
    public final C28480t f77217c;

    /* renamed from: d */
    public final C28413f f77218d;

    /* renamed from: e */
    public final C28317d f77219e;

    /* renamed from: f */
    public C28316c f77220f;

    /* renamed from: g */
    public int f77221g = -1;

    public C28439i(C28480t tVar, C28413f fVar, C28317d dVar) {
        this.f77217c = tVar;
        this.f77218d = fVar;
        this.f77219e = dVar;
    }

    /* renamed from: a */
    public final C28481u mo33884a() {
        return (C28481u) this.f77217c.build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo33885b() {
        boolean m = this.f77220f.mo33829m();
        if (m) {
            this.f77219e.mo33834b(this);
        }
        this.f77217c.clear();
        if (m) {
            this.f77219e.mo33833a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo33886c() {
        this.f77220f.mo33822e();
        C58838bb.m90883r(!this.f77220f.mo33829m());
        this.f77220f = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo33887d(C28439i iVar) {
        boolean z = false;
        C58838bb.m90883r(iVar.f77220f == null);
        C58838bb.m90883r(!mo33888e());
        if (this.f77218d == iVar.f77218d) {
            z = true;
        }
        C58838bb.m90883r(z);
        boolean m = this.f77220f.mo33829m();
        if (m) {
            this.f77219e.mo33834b(this);
        }
        this.f77217c.clear();
        this.f77217c.mergeFrom((C28481u) iVar.f77217c.build());
        if (m) {
            this.f77219e.mo33833a(this);
        }
    }

    /* renamed from: e */
    public final boolean mo33888e() {
        C60214n nVar = ((C28481u) this.f77217c.instance).f77290c;
        if (nVar == null) {
            nVar = C60214n.f162914g;
        }
        return (nVar.f162916a & 8) != 0;
    }

    /* renamed from: f */
    public final boolean mo33889f() {
        C60214n nVar = ((C28481u) this.f77217c.instance).f77290c;
        if (nVar == null) {
            nVar = C60214n.f162914g;
        }
        return (nVar.f162916a & 2048) != 0;
    }

    /* renamed from: g */
    public final void mo33890g() {
        C28317d dVar = this.f77219e;
        if (!dVar.f77002a.isEmpty()) {
            if (Log.isLoggable("GIL", 2)) {
                Log.v("GIL", "ImpressionCleared: ".concat(toString()));
            }
            for (C28314a a : dVar.f77002a) {
                a.mo33812a(this);
            }
        }
        C28480t tVar = this.f77217c;
        C60214n nVar = ((C28481u) tVar.instance).f77290c;
        if (nVar == null) {
            nVar = C60214n.f162914g;
        }
        C60213m mVar = (C60213m) nVar.toBuilder();
        mVar.copyOnWrite();
        C60214n nVar2 = (C60214n) mVar.instance;
        nVar2.f162921f = null;
        nVar2.f162916a &= -2049;
        mVar.copyOnWrite();
        C60214n nVar3 = (C60214n) mVar.instance;
        nVar3.f162916a &= -2;
        nVar3.f162917b = -1;
        C60214n nVar4 = (C60214n) mVar.build();
        tVar.copyOnWrite();
        C28481u uVar = (C28481u) tVar.instance;
        nVar4.getClass();
        uVar.f77290c = nVar4;
        uVar.f77288a |= 1;
    }

    /* renamed from: h */
    public final int mo33891h() {
        return this.f77220f.mo33831r();
    }

    /* renamed from: i */
    public final void mo33892i(int i) {
        if (i != 1) {
            i = 2;
        }
        this.f77220f.mo33832s(i);
    }

    public final String toString() {
        C28316c cVar = this.f77220f;
        String concat = cVar != null ? ".".concat(String.valueOf(cVar.getClass().getSimpleName())) : BuildConfig.FLAVOR;
        C60214n nVar = ((C28481u) this.f77217c.instance).f77290c;
        if (nVar == null) {
            nVar = C60214n.f162914g;
        }
        int i = nVar.f162918c;
        String hexString = Integer.toHexString(hashCode());
        return "CVE" + concat + "#" + i + " [" + hexString + "]";
    }
}
