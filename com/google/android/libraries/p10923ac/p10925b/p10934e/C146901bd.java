package com.google.android.libraries.p10923ac.p10925b.p10934e;

import android.util.Pair;
import com.google.android.libraries.p10923ac.p10925b.p10927b.C146770a;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10931a.C146796c;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10931a.C146801h;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146808e;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146815l;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146816m;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146819p;
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
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protos.p4895aw.p4902b.C63982as;
import com.google.protos.p4895aw.p4902b.C63985av;
import com.google.protos.p4895aw.p4902b.C63987ax;
import com.google.protos.p4895aw.p4902b.C63988ay;
import com.google.protos.p4895aw.p4902b.C63989az;
import com.google.protos.p4895aw.p4902b.C63992bb;
import com.google.protos.p4895aw.p4902b.C64010bt;
import com.google.protos.p4895aw.p4902b.C64056dl;
import com.google.protos.p4895aw.p4902b.C64057dm;
import com.google.protos.p4895aw.p4902b.C64058dn;
import com.google.protos.p4895aw.p4902b.C64059do;
import com.google.protos.p4895aw.p4902b.C64060dp;
import dagger.C68214a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.libraries.ac.b.e.bd */
/* compiled from: PG */
public final class C146901bd implements C146856az {

    /* renamed from: a */
    public final C146770a f396536a;

    /* renamed from: b */
    public final C147088k f396537b;

    /* renamed from: c */
    public final C147090m f396538c;

    /* renamed from: d */
    public final C147090m f396539d;

    /* renamed from: e */
    public final C147094q f396540e;

    /* renamed from: f */
    public final C147089l f396541f;

    /* renamed from: g */
    public final C68214a f396542g;

    /* renamed from: h */
    private final C68214a f396543h;

    /* renamed from: i */
    private final C63987ax f396544i;

    /* renamed from: j */
    private final C146900bc f396545j;

    /* renamed from: k */
    private final int f396546k;

    public C146901bd(C68214a aVar, C146770a aVar2, C63987ax axVar, C147088k kVar, C147090m mVar, C147090m mVar2, C147094q qVar, C147089l lVar, C68214a aVar3, C146900bc bcVar, int i) {
        aVar.getClass();
        axVar.getClass();
        kVar.getClass();
        lVar.getClass();
        aVar3.getClass();
        this.f396543h = aVar;
        this.f396536a = aVar2;
        this.f396544i = axVar;
        this.f396537b = kVar;
        this.f396538c = mVar;
        this.f396539d = mVar2;
        this.f396540e = qVar;
        this.f396541f = lVar;
        this.f396542g = aVar3;
        this.f396545j = bcVar;
        this.f396546k = i;
    }

    /* renamed from: n */
    private final C146816m m239409n(byte[] bArr, byte[] bArr2) {
        C63989az azVar = (C63989az) C62942bv.parseFrom((C62942bv) C63989az.f173052d, bArr2);
        byte[] N = azVar.f173056c.mo59174N();
        if (bArr.length == 0 && !this.f396544i.f173050b) {
            bArr = null;
        }
        return new C146808e(N, bArr, azVar.f173055b);
    }

    /* renamed from: a */
    public final C146801h mo123777a(C147077av avVar) {
        long j;
        C63992bb bbVar;
        C64057dm f = mo123783f(avVar);
        if (f == null) {
            return C146801h.f396359a;
        }
        if (((long) this.f396540e.mo123858la(avVar)) != ((long) this.f396546k)) {
            j = -1;
        } else {
            j = this.f396540e.mo123859lb(avVar) / 1000;
        }
        long j2 = j;
        long lc = this.f396540e.mo123860lc(avVar) / 1000;
        if (f.f173198a == 2) {
            bbVar = (C63992bb) f.f173199b;
        } else {
            bbVar = C63992bb.f173057b;
        }
        return new C146796c(j2, lc, bbVar.f173059a / 1000);
    }

    /* renamed from: b */
    public final C146815l mo123778b(C147077av avVar) {
        C64010bt btVar;
        C64060dp le = this.f396540e.mo123862le(avVar);
        int i = le.f173202a;
        if (C64059do.m96345a(i) == 1) {
            return C146815l.m239247b().mo123677a();
        }
        C58838bb.m90868c(i == 1);
        if (le.f173202a == 1) {
            btVar = (C64010bt) le.f173203b;
        } else {
            btVar = C64010bt.f173097b;
        }
        return C146854ax.m239331a(btVar);
    }

    /* renamed from: c */
    public final C147090m mo123779c() {
        return this.f396538c;
    }

    public final void close() {
        C146900bc bcVar = this.f396545j;
        C146770a aVar = this.f396536a;
        synchronized (bcVar.f396527a) {
            long a = bcVar.f396528b.mo57435a(aVar, -1);
            if (a == 0) {
                bcVar.f396527a.remove(aVar);
                bcVar.f396528b.mo57437d(aVar);
                this.f396537b.close();
                this.f396538c.close();
                this.f396539d.close();
                this.f396540e.close();
                this.f396541f.close();
                if (bcVar.f396528b.f165047a.isEmpty()) {
                    bcVar.f396527a.notifyAll();
                }
            } else if (a < 0) {
                String obj = aVar.toString();
                throw new IllegalStateException("Footprints channel [" + obj + "] closed too many times.");
            }
        }
    }

    /* renamed from: d */
    public final C147090m mo123781d() {
        return this.f396539d;
    }

    /* renamed from: e */
    public final C63088z mo123782e(C63088z zVar) {
        if (!zVar.mo59173M() || this.f396544i.f173050b) {
            return zVar;
        }
        return null;
    }

    /* renamed from: f */
    public final C64057dm mo123783f(C147077av avVar) {
        return this.f396540e.mo123861ld(avVar);
    }

    /* renamed from: g */
    public final List mo123784g(C147077av avVar, C146815l lVar, String str) {
        byte[] bArr;
        if (str != null) {
            avVar.mo123888b(new C146899bb(this, str));
        }
        HashSet hashSet = new HashSet();
        C58485gu a = lVar.mo123679a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            C146819p pVar = (C146819p) a.get(i);
            byte[] b = pVar.mo123695b();
            int a2 = pVar.mo123694a();
            if (a2 == 1) {
                byte[] i2 = this.f396537b.mo123878i(avVar, b);
                if (i2 != null) {
                    hashSet.add(m239409n(b, i2));
                }
            } else if (a2 == 2) {
                int length = b.length;
                while (true) {
                    length--;
                    if (length >= 0) {
                        if ((b[length] & 255) != 255) {
                            bArr = Arrays.copyOf(b, length + 1);
                            bArr[length] = (byte) (bArr[length] + 1);
                            break;
                        }
                    } else {
                        bArr = null;
                        break;
                    }
                }
                for (Pair pair : this.f396537b.mo123870b(avVar, b, bArr)) {
                    hashSet.add(m239409n((byte[]) pair.first, (byte[]) pair.second));
                }
            }
        }
        return C58485gu.m89842j(hashSet);
    }

    /* renamed from: h */
    public final void mo123785h(C147078aw awVar) {
        C63982as asVar = (C63982as) C63985av.f173039g.createBuilder();
        asVar.copyOnWrite();
        C63985av avVar = (C63985av) asVar.instance;
        avVar.f173042b = 2;
        avVar.f173041a |= 1;
        this.f396538c.mo123908a(awVar, (C63985av) asVar.build());
        this.f396537b.mo123873d(awVar, C63088z.f170246b, (C63088z) null);
    }

    /* renamed from: i */
    public final void mo123786i(C147078aw awVar, C146815l lVar, long j, int i, long j2, long j3) {
        C147094q qVar = this.f396540e;
        C64058dn dnVar = (C64058dn) C64060dp.f173200c.createBuilder();
        C64010bt e = C146854ax.m239335e(lVar);
        dnVar.copyOnWrite();
        C64060dp dpVar = (C64060dp) dnVar.instance;
        e.getClass();
        dpVar.f173203b = e;
        dpVar.f173202a = 1;
        qVar.mo123864lg(awVar, (C64060dp) dnVar.build());
        this.f396540e.mo123866li(awVar, j);
        this.f396540e.mo123863lf(awVar, i);
        this.f396540e.mo123865lh(awVar, j2);
        this.f396540e.mo123855j(awVar, j3);
        awVar.mo123888b(new C146898ba(this));
    }

    /* renamed from: j */
    public final void mo123787j(C147078aw awVar, C64057dm dmVar) {
        int i = dmVar.f173198a;
        if (C64056dl.m96344b(i) == 3) {
            this.f396540e.mo123856k(awVar, dmVar);
        } else if (C64056dl.m96344b(i) == 1) {
            ((C147256m) this.f396543h.mo27525b()).mo124065h("Sync token is not set and will be initialized", new Object[0]);
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
    public final void mo123788k(C147078aw awVar) {
        this.f396537b.mo123873d(awVar, C63088z.f170246b, (C63088z) null);
        this.f396540e.mo123857l(awVar);
        ((C147085h) this.f396539d).mo123912d(awVar, Long.MAX_VALUE).mo123907a(awVar);
        ((C147085h) this.f396538c).mo123912d(awVar, Long.MAX_VALUE).mo123907a(awVar);
        C147090m mVar = this.f396538c;
        C63982as asVar = (C63982as) C63985av.f173039g.createBuilder();
        asVar.copyOnWrite();
        C63985av avVar = (C63985av) asVar.instance;
        avVar.f173042b = 2;
        avVar.f173041a |= 1;
        mVar.mo123908a(awVar, (C63985av) asVar.build());
    }

    /* renamed from: l */
    public final void mo123789l(C147078aw awVar, C63088z zVar, C63088z zVar2, long j) {
        C63982as asVar = (C63982as) C63985av.f173039g.createBuilder();
        asVar.copyOnWrite();
        C63985av avVar = (C63985av) asVar.instance;
        avVar.f173042b = 1;
        avVar.f173041a |= 1;
        asVar.copyOnWrite();
        C63985av avVar2 = (C63985av) asVar.instance;
        zVar2.getClass();
        avVar2.f173041a |= 2;
        avVar2.f173043c = zVar2;
        if (zVar != null) {
            asVar.copyOnWrite();
            C63985av avVar3 = (C63985av) asVar.instance;
            avVar3.f173041a |= 4;
            avVar3.f173044d = zVar;
        }
        if (j != -1) {
            asVar.copyOnWrite();
            C63985av avVar4 = (C63985av) asVar.instance;
            avVar4.f173041a |= 8;
            avVar4.f173045e = j;
        } else {
            j = -1;
        }
        this.f396538c.mo123908a(awVar, (C63985av) asVar.build());
        C63988ay ayVar = (C63988ay) C63989az.f173052d.createBuilder();
        ayVar.copyOnWrite();
        C63989az azVar = (C63989az) ayVar.instance;
        zVar2.getClass();
        azVar.f173054a |= 2;
        azVar.f173056c = zVar2;
        if (j != -1) {
            ayVar.copyOnWrite();
            C63989az azVar2 = (C63989az) ayVar.instance;
            azVar2.f173054a |= 1;
            azVar2.f173055b = j;
        }
        C147088k kVar = this.f396537b;
        if (zVar == null) {
            zVar = C63088z.f170246b;
        }
        kVar.mo123875f(awVar, zVar, ((C63989az) ayVar.build()).toByteString());
    }

    /* renamed from: m */
    public final C147073ar mo123790m() {
        return this.f396541f.mo123882b();
    }
}
