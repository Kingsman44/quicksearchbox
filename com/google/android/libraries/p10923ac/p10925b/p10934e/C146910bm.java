package com.google.android.libraries.p10923ac.p10925b.p10934e;

import android.util.Pair;
import com.google.android.libraries.p10923ac.p10925b.p10927b.C146770a;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10931a.C146796c;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10931a.C146801h;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146808e;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146811h;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146816m;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146821r;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147073ar;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147077av;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147078aw;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147085h;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147088k;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147089l;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147090m;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147094q;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4575r.C60761r;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protos.p4895aw.p4902b.C63988ay;
import com.google.protos.p4895aw.p4902b.C63989az;
import com.google.protos.p4895aw.p4902b.C63992bb;
import com.google.protos.p4895aw.p4902b.C63995be;
import com.google.protos.p4895aw.p4902b.C63998bh;
import com.google.protos.p4895aw.p4902b.C64056dl;
import com.google.protos.p4895aw.p4902b.C64057dm;
import com.google.protos.p4895aw.p4902b.C64058dn;
import com.google.protos.p4895aw.p4902b.C64059do;
import com.google.protos.p4895aw.p4902b.C64060dp;
import com.google.protos.p4895aw.p4902b.C64066dv;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.libraries.ac.b.e.bm */
/* compiled from: PG */
public final class C146910bm implements C146907bj {

    /* renamed from: a */
    public final C146770a f396571a;

    /* renamed from: b */
    public final C147088k f396572b;

    /* renamed from: c */
    public final C147090m f396573c;

    /* renamed from: d */
    public final C147090m f396574d;

    /* renamed from: e */
    public final C147094q f396575e;

    /* renamed from: f */
    public final C147089l f396576f;

    /* renamed from: g */
    public final C68214a f396577g;

    /* renamed from: h */
    private final C68214a f396578h;

    /* renamed from: i */
    private final C146909bl f396579i;

    /* renamed from: j */
    private final int f396580j;

    public C146910bm(C68214a aVar, C146770a aVar2, C147088k kVar, C147090m mVar, C147090m mVar2, C147094q qVar, C147089l lVar, C68214a aVar3, C146909bl blVar, int i) {
        this.f396578h = aVar;
        this.f396571a = aVar2;
        this.f396572b = kVar;
        this.f396573c = mVar;
        this.f396574d = mVar2;
        this.f396575e = qVar;
        this.f396576f = lVar;
        this.f396577g = aVar3;
        this.f396579i = blVar;
        this.f396580j = i;
    }

    /* renamed from: o */
    private final C58485gu m239444o(C147077av avVar, long j, long j2) {
        C58480gp gpVar = new C58480gp(4);
        for (Pair pair : this.f396572b.mo123870b(avVar, m239445p(j), m239445p(j2))) {
            C63989az azVar = (C63989az) C62942bv.parseFrom((C62942bv) C63989az.f173052d, (byte[]) pair.second);
            gpVar.mo55395g(new C146808e(azVar.f173056c.mo59174N(), (byte[]) null, azVar.f173055b));
        }
        return gpVar.mo55394f();
    }

    /* renamed from: p */
    private static byte[] m239445p(long j) {
        return C60761r.m92760f((j - Long.MIN_VALUE) ^ -1);
    }

    /* renamed from: a */
    public final long mo123795a(C147077av avVar) {
        return this.f396575e.mo123860lc(avVar);
    }

    /* renamed from: b */
    public final C146801h mo123796b(C147077av avVar) {
        long j;
        C63992bb bbVar;
        C64057dm f = mo123801f(avVar);
        if (f == null) {
            return C146801h.f396359a;
        }
        if (((long) this.f396575e.mo123858la(avVar)) != ((long) this.f396580j)) {
            j = -1;
        } else {
            j = this.f396575e.mo123859lb(avVar) / 1000;
        }
        long j2 = j;
        long a = mo123795a(avVar) / 1000;
        if (f.f173198a == 2) {
            bbVar = (C63992bb) f.f173199b;
        } else {
            bbVar = C63992bb.f173057b;
        }
        return new C146796c(j2, a, bbVar.f173059a / 1000);
    }

    /* renamed from: c */
    public final C146821r mo123797c(C147077av avVar) {
        C64066dv dvVar;
        C64060dp le = this.f396575e.mo123862le(avVar);
        int i = le.f173202a;
        boolean z = false;
        if (C64059do.m96345a(i) == 1) {
            return new C146811h(0, (Long) null, (Long) null);
        }
        if (i == 2) {
            z = true;
        }
        C58838bb.m90868c(z);
        if (le.f173202a == 2) {
            dvVar = (C64066dv) le.f173203b;
        } else {
            dvVar = C64066dv.f173213e;
        }
        return C146854ax.m239333c(dvVar);
    }

    public final void close() {
        C146909bl blVar = this.f396579i;
        C146770a aVar = this.f396571a;
        synchronized (blVar.f396563a) {
            long a = blVar.f396564b.mo57435a(aVar, -1);
            if (a == 0) {
                blVar.f396563a.remove(aVar);
                blVar.f396564b.mo57437d(aVar);
                this.f396572b.close();
                this.f396573c.close();
                this.f396574d.close();
                this.f396575e.close();
                this.f396576f.close();
                if (blVar.f396564b.f165047a.isEmpty()) {
                    blVar.f396563a.notifyAll();
                }
            } else if (a < 0) {
                String obj = aVar.toString();
                throw new IllegalStateException("Footprints channel [" + obj + "] closed too many times.");
            }
        }
    }

    /* renamed from: d */
    public final C147090m mo123799d() {
        return this.f396573c;
    }

    /* renamed from: e */
    public final C147090m mo123800e() {
        return this.f396574d;
    }

    /* renamed from: f */
    public final C64057dm mo123801f(C147077av avVar) {
        return this.f396575e.mo123861ld(avVar);
    }

    /* renamed from: g */
    public final void mo123802g(C147078aw awVar) {
        C63995be beVar = (C63995be) C63998bh.f173067f.createBuilder();
        beVar.copyOnWrite();
        C63998bh bhVar = (C63998bh) beVar.instance;
        bhVar.f173070b = 2;
        bhVar.f173069a |= 1;
        this.f396573c.mo123908a(awVar, (C63998bh) beVar.build());
        this.f396572b.mo123874e(awVar, new byte[0], (byte[]) null);
    }

    /* renamed from: h */
    public final void mo123803h(C147078aw awVar, long j, long j2) {
        C58485gu o = m239444o(awVar, j, j2);
        int size = o.size();
        for (int i = 0; i < size; i++) {
            C147090m mVar = this.f396573c;
            C63995be beVar = (C63995be) C63998bh.f173067f.createBuilder();
            beVar.copyOnWrite();
            C63998bh bhVar = (C63998bh) beVar.instance;
            bhVar.f173070b = 3;
            bhVar.f173069a |= 1;
            long a = ((C146816m) o.get(i)).mo123683a();
            beVar.copyOnWrite();
            C63998bh bhVar2 = (C63998bh) beVar.instance;
            bhVar2.f173069a |= 4;
            bhVar2.f173072d = a;
            mVar.mo123908a(awVar, (C63998bh) beVar.build());
        }
        this.f396572b.mo123874e(awVar, m239445p(j), m239445p(j2));
    }

    /* renamed from: i */
    public final void mo123804i(C147078aw awVar, C146821r rVar, long j, int i, long j2, long j3) {
        C147094q qVar = this.f396575e;
        C64058dn dnVar = (C64058dn) C64060dp.f173200c.createBuilder();
        C64066dv f = C146854ax.m239336f(rVar);
        dnVar.copyOnWrite();
        C64060dp dpVar = (C64060dp) dnVar.instance;
        f.getClass();
        dpVar.f173203b = f;
        dpVar.f173202a = 2;
        qVar.mo123864lg(awVar, (C64060dp) dnVar.build());
        this.f396575e.mo123866li(awVar, j);
        this.f396575e.mo123863lf(awVar, i);
        this.f396575e.mo123865lh(awVar, j2);
        this.f396575e.mo123855j(awVar, j3);
        awVar.mo123888b(new C146908bk(this));
    }

    /* renamed from: j */
    public final void mo123805j(C147078aw awVar, C64057dm dmVar) {
        int i = dmVar.f173198a;
        if (C64056dl.m96344b(i) == 3) {
            this.f396575e.mo123856k(awVar, dmVar);
        } else if (C64056dl.m96344b(i) == 1) {
            ((C147256m) this.f396578h.mo27525b()).mo124065h("Sync token is not set and will be initialized", new Object[0]);
        } else {
            int b = C64056dl.m96344b(i);
            String a = C64056dl.m96343a(b);
            if (b != 0) {
                throw new IllegalArgumentException("Invalid sync token " + a + ", expected FOOTPRINTS");
            }
            throw null;
        }
    }

    /* renamed from: k */
    public final void mo123806k(C147078aw awVar) {
        this.f396572b.mo123873d(awVar, C63088z.f170246b, (C63088z) null);
        this.f396575e.mo123857l(awVar);
        ((C147085h) this.f396574d).mo123912d(awVar, Long.MAX_VALUE).mo123907a(awVar);
        ((C147085h) this.f396573c).mo123912d(awVar, Long.MAX_VALUE).mo123907a(awVar);
        C147090m mVar = this.f396573c;
        C63995be beVar = (C63995be) C63998bh.f173067f.createBuilder();
        beVar.copyOnWrite();
        C63998bh bhVar = (C63998bh) beVar.instance;
        bhVar.f173070b = 2;
        bhVar.f173069a |= 1;
        mVar.mo123908a(awVar, (C63998bh) beVar.build());
    }

    /* renamed from: l */
    public final void mo123807l(C147078aw awVar, C63088z zVar, long j) {
        C63995be beVar = (C63995be) C63998bh.f173067f.createBuilder();
        beVar.copyOnWrite();
        C63998bh bhVar = (C63998bh) beVar.instance;
        bhVar.f173070b = 1;
        bhVar.f173069a |= 1;
        beVar.copyOnWrite();
        C63998bh bhVar2 = (C63998bh) beVar.instance;
        zVar.getClass();
        bhVar2.f173069a |= 2;
        bhVar2.f173071c = zVar;
        beVar.copyOnWrite();
        C63998bh bhVar3 = (C63998bh) beVar.instance;
        bhVar3.f173069a |= 4;
        bhVar3.f173072d = j;
        this.f396573c.mo123908a(awVar, (C63998bh) beVar.build());
        C147088k kVar = this.f396572b;
        byte[] p = m239445p(j);
        C63988ay ayVar = (C63988ay) C63989az.f173052d.createBuilder();
        ayVar.copyOnWrite();
        C63989az azVar = (C63989az) ayVar.instance;
        zVar.getClass();
        azVar.f173054a |= 2;
        azVar.f173056c = zVar;
        ayVar.copyOnWrite();
        C63989az azVar2 = (C63989az) ayVar.instance;
        azVar2.f173054a = 1 | azVar2.f173054a;
        azVar2.f173055b = j;
        kVar.mo123876g(awVar, p, ((C63989az) ayVar.build()).toByteArray());
    }

    /* renamed from: m */
    public final C147073ar mo123808m() {
        return this.f396576f.mo123882b();
    }

    /* renamed from: n */
    public final List mo123809n(C147077av avVar, long j, long j2) {
        return m239444o(avVar, j, j2);
    }
}
