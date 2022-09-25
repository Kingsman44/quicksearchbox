package com.google.android.libraries.logging.p2185ve.p2188c.p2190b;

import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.libraries.logging.C28260b;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28480t;
import com.google.android.libraries.logging.p2185ve.C28481u;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28314a;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28317d;
import com.google.android.libraries.logging.p2185ve.p2192d.C28350c;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.p4566l.C60213m;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60218r;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.logging.ve.c.b.l */
/* compiled from: PG */
final class C28329l {

    /* renamed from: a */
    public final C60218r f77020a = C28260b.m52825a();

    /* renamed from: b */
    public final List f77021b = new ArrayList();

    /* renamed from: c */
    public final List f77022c;

    /* renamed from: d */
    public final SparseIntArray f77023d;

    /* renamed from: e */
    public final List f77024e;

    /* renamed from: f */
    public final SparseIntArray f77025f;

    /* renamed from: g */
    private final int f77026g;

    public C28329l(int i, int i2) {
        this.f77026g = i;
        this.f77022c = new ArrayList(i2);
        this.f77023d = new SparseIntArray(i2);
        this.f77024e = new ArrayList();
        this.f77025f = new SparseIntArray();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C28481u mo33843a(C28439i iVar, int i) {
        iVar.f77221g = this.f77026g;
        if (i == -1) {
            i = -1;
        }
        int size = this.f77022c.size();
        C28480t tVar = iVar.f77217c;
        int h = iVar.mo33891h();
        tVar.copyOnWrite();
        C28481u uVar = (C28481u) tVar.instance;
        int i2 = h - 1;
        C28481u uVar2 = C28481u.f77286h;
        if (h != 0) {
            uVar.f77291d = i2;
            uVar.f77288a |= 2;
            C60218r rVar = this.f77020a;
            C28480t tVar2 = iVar.f77217c;
            C60214n nVar = ((C28481u) tVar2.instance).f77290c;
            if (nVar == null) {
                nVar = C60214n.f162914g;
            }
            C60213m mVar = (C60213m) nVar.toBuilder();
            mVar.copyOnWrite();
            C60214n nVar2 = (C60214n) mVar.instance;
            rVar.getClass();
            nVar2.f162921f = rVar;
            nVar2.f162916a |= 2048;
            mVar.copyOnWrite();
            C60214n nVar3 = (C60214n) mVar.instance;
            nVar3.f162916a |= 1;
            nVar3.f162917b = size;
            C60214n nVar4 = (C60214n) mVar.build();
            tVar2.copyOnWrite();
            C28481u uVar3 = (C28481u) tVar2.instance;
            nVar4.getClass();
            uVar3.f77290c = nVar4;
            uVar3.f77288a |= 1;
            C28317d dVar = iVar.f77219e;
            if (!dVar.f77002a.isEmpty()) {
                if (Log.isLoggable("GIL", 2)) {
                    Log.v("GIL", "ImpressionSet: ".concat(iVar.toString()));
                }
                for (C28314a e : dVar.f77002a) {
                    e.mo33816e();
                }
            }
            C28481u a = iVar.mo33884a();
            this.f77022c.add(a);
            this.f77023d.append(size, i);
            return a;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo33844b(C28350c cVar) {
        boolean z = true;
        if (cVar.f77067b == 1) {
            if (this.f77023d.valueAt(cVar.mo33864c()) != -1) {
                z = false;
            }
            C58838bb.m90868c(z);
        }
        this.f77021b.add(cVar);
    }
}
