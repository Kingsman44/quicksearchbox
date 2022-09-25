package com.google.android.apps.gsa.nga.engine.p6056o.p6095g;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.gsa.nga.engine.ai.a.a.bx;
import com.google.android.apps.gsa.nga.engine.p5897ae.C74798j;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80387q;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80389s;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4535g.C59203do;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.g.aj */
/* compiled from: PG */
public final class C77385aj implements C77388am {

    /* renamed from: a */
    private static final C58974d f213399a = C58974d.m91136j();

    /* renamed from: b */
    private final C80388r f213400b;

    /* renamed from: c */
    private final C80388r f213401c;

    /* renamed from: d */
    private final List f213402d = C77375a.f213389a;

    public C77385aj(C74798j jVar, bx bxVar, C74965n nVar) {
        C80389s sVar;
        boolean a = bxVar.a(nVar.mo71342q());
        C80387q qVar = (C80387q) C80388r.f220587p.createBuilder();
        boolean s = nVar.mo71344s();
        qVar.copyOnWrite();
        ((C80388r) qVar.instance).f220600l = s;
        qVar.copyOnWrite();
        ((C80388r) qVar.instance).f220589a = true;
        boolean e = jVar.mo71181e();
        qVar.copyOnWrite();
        ((C80388r) qVar.instance).f220596h = e;
        qVar.copyOnWrite();
        ((C80388r) qVar.instance).f220590b = true;
        qVar.copyOnWrite();
        ((C80388r) qVar.instance).f220603o = true;
        qVar.copyOnWrite();
        ((C80388r) qVar.instance).f220591c = 1.0d;
        qVar.copyOnWrite();
        ((C80388r) qVar.instance).f220602n = a;
        qVar.copyOnWrite();
        ((C80388r) qVar.instance).f220601m = true;
        qVar.copyOnWrite();
        ((C80388r) qVar.instance).f220597i = 3.0d;
        qVar.copyOnWrite();
        ((C80388r) qVar.instance).f220598j = 2.0d;
        qVar.copyOnWrite();
        ((C80388r) qVar.instance).f220592d = 1.0d;
        if (nVar.mo71340o().isPresent()) {
            sVar = C80389s.APP_FOREGROUND;
        } else {
            sVar = C80389s.APP_BACKGROUND;
        }
        double a2 = mo72537a(sVar);
        qVar.copyOnWrite();
        ((C80388r) qVar.instance).f220593e = a2;
        qVar.copyOnWrite();
        ((C80388r) qVar.instance).f220594f = 1.0d;
        qVar.copyOnWrite();
        ((C80388r) qVar.instance).f220595g = 2.147483647E9d;
        qVar.copyOnWrite();
        ((C80388r) qVar.instance).f220599k = Integer.MAX_VALUE;
        this.f213401c = (C80388r) qVar.build();
        C80387q qVar2 = (C80387q) C80388r.f220587p.createBuilder();
        qVar2.copyOnWrite();
        ((C80388r) qVar2.instance).f220589a = false;
        qVar2.copyOnWrite();
        ((C80388r) qVar2.instance).f220590b = false;
        qVar2.copyOnWrite();
        ((C80388r) qVar2.instance).f220603o = false;
        qVar2.copyOnWrite();
        ((C80388r) qVar2.instance).f220591c = C59203do.f157270a;
        qVar2.copyOnWrite();
        ((C80388r) qVar2.instance).f220602n = false;
        qVar2.copyOnWrite();
        ((C80388r) qVar2.instance).f220601m = false;
        qVar2.copyOnWrite();
        ((C80388r) qVar2.instance).f220592d = C59203do.f157270a;
        qVar2.copyOnWrite();
        ((C80388r) qVar2.instance).f220593e = C59203do.f157270a;
        qVar2.copyOnWrite();
        ((C80388r) qVar2.instance).f220594f = C59203do.f157270a;
        qVar2.copyOnWrite();
        ((C80388r) qVar2.instance).f220595g = C59203do.f157270a;
        qVar2.copyOnWrite();
        ((C80388r) qVar2.instance).f220599k = LinearLayoutManager.INVALID_OFFSET;
        this.f213400b = (C80388r) qVar2.build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final double mo72537a(C80389s sVar) {
        List list = this.f213402d;
        double d = (double) ((C58724pq) list).f156474d;
        int indexOf = list.indexOf(sVar);
        if (indexOf >= 0) {
            double d2 = (double) indexOf;
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d);
            return (d - d2) / d;
        }
        ((C58970a) ((C58970a) f213399a.mo56225c()).mo56372aa(3881)).mo56387q("Rank key %s not found in list", sVar.getNumber());
        return C59203do.f157270a;
    }

    /* renamed from: b */
    public final double mo72538b(C80515d dVar) {
        C80515d dVar2 = C80515d.UNKNOWN;
        switch (dVar.ordinal()) {
            case 0:
            case 1:
            case 10:
            case 11:
                return C59203do.f157270a;
            case 2:
                return 0.3d;
            case 3:
                return 0.5d;
            case 4:
                return 0.2d;
            case 5:
                return 0.4d;
            case 6:
                return 0.1d;
            case 7:
                return 0.05d;
            case 8:
                return 0.01d;
            case 9:
                return 0.25d;
            default:
                ((C58970a) ((C58970a) f213399a.mo56225c()).mo56372aa(3882)).mo56387q("Origin %s has no score assigned.", dVar.getNumber());
                return C59203do.f157270a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0264, code lost:
        if (r1.f220541k != false) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x02de, code lost:
        if (r1 == com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f.GENIE) goto L_0x02e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x02fe, code lost:
        if (r1 == com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f.NORMALIZER) goto L_0x0300;
     */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r mo72539c(com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80386p r13) {
        /*
            r12 = this;
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r0 = r12.f213401c
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.android.apps.gsa.nga.shared.aa.e.b.q r0 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80387q) r0
            com.google.android.apps.gsa.nga.shared.aa.e.b.o r1 = r13.f220581b
            if (r1 == 0) goto L_0x0028
            double r1 = r1.f220576a
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r3 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r3
            r3.f220591c = r1
            com.google.android.apps.gsa.nga.shared.aa.e.b.o r1 = r13.f220581b
            if (r1 != 0) goto L_0x001d
            com.google.android.apps.gsa.nga.shared.aa.e.b.o r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80385o.f220574c
        L_0x001d:
            boolean r1 = r1.f220577b
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r2 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r2
            r2.f220600l = r1
        L_0x0028:
            com.google.android.apps.gsa.nga.shared.aa.e.b.m r1 = r13.f220582c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0081
            double r4 = r1.f220571b
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r1
            r1.f220592d = r4
            boolean r1 = r1.f220600l
            if (r1 == 0) goto L_0x0053
            com.google.android.apps.gsa.nga.shared.aa.e.b.m r1 = r13.f220582c
            if (r1 != 0) goto L_0x0043
            com.google.android.apps.gsa.nga.shared.aa.e.b.m r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80383m.f220568e
        L_0x0043:
            int r1 = r1.f220570a
            com.google.android.apps.gsa.nga.shared.aa.n.f r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f.m128187a(r1)
            if (r1 != 0) goto L_0x004d
            com.google.android.apps.gsa.nga.shared.aa.n.f r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f.UNRECOGNIZED
        L_0x004d:
            com.google.android.apps.gsa.nga.shared.aa.n.f r4 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f.ORIGINAL
            if (r1 != r4) goto L_0x0053
            r1 = 1
            goto L_0x0054
        L_0x0053:
            r1 = 0
        L_0x0054:
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r4 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r4
            r4.f220600l = r1
            boolean r1 = r4.f220602n
            if (r1 == 0) goto L_0x0077
            com.google.android.apps.gsa.nga.shared.aa.e.b.m r1 = r13.f220582c
            if (r1 != 0) goto L_0x0067
            com.google.android.apps.gsa.nga.shared.aa.e.b.m r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80383m.f220568e
        L_0x0067:
            int r1 = r1.f220570a
            com.google.android.apps.gsa.nga.shared.aa.n.f r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f.m128187a(r1)
            if (r1 != 0) goto L_0x0071
            com.google.android.apps.gsa.nga.shared.aa.n.f r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f.UNRECOGNIZED
        L_0x0071:
            com.google.android.apps.gsa.nga.shared.aa.n.f r4 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f.ORIGINAL
            if (r1 != r4) goto L_0x0077
            r1 = 1
            goto L_0x0078
        L_0x0077:
            r1 = 0
        L_0x0078:
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r4 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r4
            r4.f220602n = r1
        L_0x0081:
            com.google.android.apps.gsa.nga.shared.aa.e.b.g r1 = r13.f220583d
            if (r1 == 0) goto L_0x0120
            boolean r4 = r1.f220550a
            if (r4 == 0) goto L_0x00c5
            int r4 = r1.f220551b
            com.google.android.apps.gsa.nga.shared.aa.n.d r4 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d.m128185a(r4)
            if (r4 != 0) goto L_0x0093
            com.google.android.apps.gsa.nga.shared.aa.n.d r4 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d.UNRECOGNIZED
        L_0x0093:
            com.google.android.apps.gsa.nga.shared.aa.n.d r5 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d.CANTEEN
            boolean r4 = r4.equals(r5)
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r5 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r5
            r5.f220601m = r4
            int r4 = r1.f220551b
            com.google.android.apps.gsa.nga.shared.aa.n.d r4 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d.m128185a(r4)
            if (r4 != 0) goto L_0x00ac
            com.google.android.apps.gsa.nga.shared.aa.n.d r4 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d.UNRECOGNIZED
        L_0x00ac:
            double r4 = r12.mo72538b(r4)
            r0.copyOnWrite()
            com.google.protobuf.bv r6 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r6 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r6
            r6.f220594f = r4
            double r4 = r1.f220552c
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r1
            r1.f220595g = r4
            goto L_0x00e8
        L_0x00c5:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r1
            r1.f220601m = r3
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r1 = r12.f213400b
            double r4 = r1.f220594f
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r1
            r1.f220594f = r4
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r1 = r12.f213400b
            double r4 = r1.f220595g
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r1
            r1.f220595g = r4
        L_0x00e8:
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r1
            boolean r1 = r1.f220600l
            if (r1 == 0) goto L_0x00fc
            com.google.android.apps.gsa.nga.shared.aa.e.b.g r1 = r13.f220583d
            if (r1 != 0) goto L_0x00f6
            com.google.android.apps.gsa.nga.shared.aa.e.b.g r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80377g.f220548e
        L_0x00f6:
            boolean r1 = r1.f220550a
            if (r1 != 0) goto L_0x00fc
            r1 = 1
            goto L_0x00fd
        L_0x00fc:
            r1 = 0
        L_0x00fd:
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r4 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r4
            r4.f220600l = r1
            boolean r1 = r4.f220602n
            if (r1 == 0) goto L_0x0116
            com.google.android.apps.gsa.nga.shared.aa.e.b.g r1 = r13.f220583d
            if (r1 != 0) goto L_0x0110
            com.google.android.apps.gsa.nga.shared.aa.e.b.g r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80377g.f220548e
        L_0x0110:
            boolean r1 = r1.f220550a
            if (r1 != 0) goto L_0x0116
            r1 = 1
            goto L_0x0117
        L_0x0116:
            r1 = 0
        L_0x0117:
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r4 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r4
            r4.f220602n = r1
        L_0x0120:
            com.google.android.apps.gsa.nga.shared.aa.e.b.c r1 = r13.f220580a
            if (r1 == 0) goto L_0x0271
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r4 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r4
            boolean r4 = r4.f220596h
            if (r4 == 0) goto L_0x0132
            boolean r1 = r1.f220538h
            if (r1 == 0) goto L_0x0132
            r1 = 1
            goto L_0x0133
        L_0x0132:
            r1 = 0
        L_0x0133:
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r4 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r4
            r4.f220596h = r1
            com.google.android.apps.gsa.nga.shared.aa.e.b.c r1 = r13.f220580a
            if (r1 != 0) goto L_0x0142
            com.google.android.apps.gsa.nga.shared.aa.e.b.c r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80373c.f220529m
        L_0x0142:
            boolean r4 = r1.f220531a
            if (r4 == 0) goto L_0x021b
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r4 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r4
            r4.f220589a = r2
            boolean r1 = r1.f220537g
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r4 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r4
            r1 = r1 ^ r2
            r4.f220590b = r1
            com.google.android.apps.gsa.nga.shared.aa.e.b.m r1 = r13.f220582c
            if (r1 == 0) goto L_0x0165
            boolean r1 = r1.f220573d
            if (r1 == 0) goto L_0x0165
            r1 = 1
            goto L_0x0166
        L_0x0165:
            r1 = 0
        L_0x0166:
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r4 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r4
            r4.f220603o = r1
            com.google.android.apps.gsa.nga.shared.aa.e.b.g r1 = r13.f220583d
            if (r1 != 0) goto L_0x0175
            com.google.android.apps.gsa.nga.shared.aa.e.b.g r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80377g.f220548e
        L_0x0175:
            int r1 = r1.f220551b
            com.google.android.apps.gsa.nga.shared.aa.n.d r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d.m128185a(r1)
            if (r1 != 0) goto L_0x017f
            com.google.android.apps.gsa.nga.shared.aa.n.d r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d.UNRECOGNIZED
        L_0x017f:
            com.google.android.apps.gsa.nga.shared.aa.n.d r4 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d.APP_SEARCH_CLASSIFIER
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x018b
            com.google.android.apps.gsa.nga.shared.aa.e.b.s r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80389s.IN_APP_SEARCH
            goto L_0x020d
        L_0x018b:
            com.google.android.apps.gsa.nga.shared.aa.e.b.g r1 = r13.f220583d
            if (r1 != 0) goto L_0x0191
            com.google.android.apps.gsa.nga.shared.aa.e.b.g r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80377g.f220548e
        L_0x0191:
            com.google.android.apps.gsa.nga.shared.aa.e.b.e r1 = r1.f220553d
            if (r1 != 0) goto L_0x0197
            com.google.android.apps.gsa.nga.shared.aa.e.b.e r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80375e.f220543c
        L_0x0197:
            com.google.protobuf.cq r1 = r1.f220546b
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)
            com.google.android.apps.gsa.nga.engine.o.g.ag r4 = com.google.android.apps.gsa.nga.engine.p6056o.p6095g.C77382ag.f213396a
            j$.util.stream.Stream r1 = r1.filter(r4)
            com.google.android.apps.gsa.nga.engine.o.g.ah r4 = com.google.android.apps.gsa.nga.engine.p6056o.p6095g.C77383ah.f213397a
            j$.util.stream.Stream r1 = r1.filter(r4)
            j$.util.Optional r1 = r1.findFirst()
            com.google.android.apps.gsa.nga.engine.o.g.ai r4 = com.google.android.apps.gsa.nga.engine.p6056o.p6095g.C77384ai.f213398a
            j$.util.Optional r1 = r1.map(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            java.lang.Object r1 = r1.orElse(r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x01c6
            com.google.android.apps.gsa.nga.shared.aa.e.b.s r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80389s.DEEPLINK_IN_FOREGROUND_APP_SEARCH
            goto L_0x020d
        L_0x01c6:
            com.google.android.apps.gsa.nga.shared.aa.e.b.c r1 = r13.f220580a
            if (r1 != 0) goto L_0x01cc
            com.google.android.apps.gsa.nga.shared.aa.e.b.c r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80373c.f220529m
        L_0x01cc:
            boolean r4 = r1.f220536f
            if (r4 == 0) goto L_0x01d3
            com.google.android.apps.gsa.nga.shared.aa.e.b.s r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80389s.DICTATION
            goto L_0x020d
        L_0x01d3:
            boolean r4 = r1.f220542l
            if (r4 == 0) goto L_0x01da
            com.google.android.apps.gsa.nga.shared.aa.e.b.s r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80389s.AUTOBOT_SEARCH_ON_SITE
            goto L_0x020d
        L_0x01da:
            boolean r4 = r1.f220537g
            if (r4 == 0) goto L_0x01e1
            com.google.android.apps.gsa.nga.shared.aa.e.b.s r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80389s.CLOUD_HANDOVER
            goto L_0x020d
        L_0x01e1:
            boolean r4 = r1.f220534d
            if (r4 == 0) goto L_0x01ef
            boolean r1 = r1.f220535e
            if (r1 == 0) goto L_0x01ec
            com.google.android.apps.gsa.nga.shared.aa.e.b.s r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80389s.OPEN_URL_SEARCH
            goto L_0x020d
        L_0x01ec:
            com.google.android.apps.gsa.nga.shared.aa.e.b.s r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80389s.OPEN_URL
            goto L_0x020d
        L_0x01ef:
            boolean r4 = r1.f220532b
            if (r4 == 0) goto L_0x01fd
            boolean r1 = r1.f220535e
            if (r1 == 0) goto L_0x01fa
            com.google.android.apps.gsa.nga.shared.aa.e.b.s r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80389s.APP_FOREGROUND_SEARCH
            goto L_0x020d
        L_0x01fa:
            com.google.android.apps.gsa.nga.shared.aa.e.b.s r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80389s.APP_FOREGROUND
            goto L_0x020d
        L_0x01fd:
            boolean r4 = r1.f220533c
            if (r4 == 0) goto L_0x020b
            boolean r1 = r1.f220535e
            if (r1 == 0) goto L_0x0208
            com.google.android.apps.gsa.nga.shared.aa.e.b.s r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80389s.APP_BACKGROUND_SEARCH
            goto L_0x020d
        L_0x0208:
            com.google.android.apps.gsa.nga.shared.aa.e.b.s r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80389s.APP_BACKGROUND
            goto L_0x020d
        L_0x020b:
            com.google.android.apps.gsa.nga.shared.aa.e.b.s r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80389s.DEFAULT_KEY
        L_0x020d:
            double r4 = r12.mo72537a(r1)
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r1
            r1.f220593e = r4
            goto L_0x023a
        L_0x021b:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r1
            r1.f220601m = r3
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r1
            r1.f220589a = r3
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r1 = r12.f213400b
            double r4 = r1.f220593e
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r1
            r1.f220593e = r4
        L_0x023a:
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r1
            boolean r1 = r1.f220600l
            if (r1 == 0) goto L_0x024e
            com.google.android.apps.gsa.nga.shared.aa.e.b.c r1 = r13.f220580a
            if (r1 != 0) goto L_0x0248
            com.google.android.apps.gsa.nga.shared.aa.e.b.c r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80373c.f220529m
        L_0x0248:
            boolean r1 = r1.f220540j
            if (r1 == 0) goto L_0x024e
            r1 = 1
            goto L_0x024f
        L_0x024e:
            r1 = 0
        L_0x024f:
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r4 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r4
            r4.f220600l = r1
            boolean r1 = r4.f220602n
            if (r1 == 0) goto L_0x0267
            com.google.android.apps.gsa.nga.shared.aa.e.b.c r1 = r13.f220580a
            if (r1 != 0) goto L_0x0262
            com.google.android.apps.gsa.nga.shared.aa.e.b.c r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80373c.f220529m
        L_0x0262:
            boolean r1 = r1.f220541k
            if (r1 == 0) goto L_0x0267
            goto L_0x0268
        L_0x0267:
            r2 = 0
        L_0x0268:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r1
            r1.f220602n = r2
        L_0x0271:
            com.google.android.apps.gsa.nga.shared.aa.e.b.m r1 = r13.f220582c
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r8 = 4613937818241073152(0x4008000000000000, double:3.0)
            if (r1 == 0) goto L_0x02e1
            int r1 = r1.f220570a
            com.google.android.apps.gsa.nga.shared.aa.n.f r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f.m128187a(r1)
            if (r1 != 0) goto L_0x0285
            com.google.android.apps.gsa.nga.shared.aa.n.f r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f.UNRECOGNIZED
        L_0x0285:
            com.google.android.apps.gsa.nga.shared.aa.e.b.g r2 = r13.f220583d
            if (r2 == 0) goto L_0x02dc
            com.google.android.apps.gsa.nga.shared.aa.e.b.e r2 = r2.f220553d
            if (r2 != 0) goto L_0x028f
            com.google.android.apps.gsa.nga.shared.aa.e.b.e r2 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80375e.f220543c
        L_0x028f:
            com.google.android.apps.gsa.nga.shared.aa.n.f r10 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f.GENIE
            if (r1 == r10) goto L_0x029c
            java.lang.String r10 = r2.f220545a
            boolean r10 = com.google.android.apps.gsa.nga.engine.understanding.C79158p.m127102c(r10)
            if (r10 == 0) goto L_0x029c
            goto L_0x02e1
        L_0x029c:
            com.google.android.apps.gsa.nga.shared.aa.n.f r10 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f.GENIE
            if (r1 == r10) goto L_0x02a9
            java.lang.String r10 = r2.f220545a
            boolean r10 = com.google.android.apps.gsa.nga.engine.understanding.C79158p.m127101b(r10)
            if (r10 == 0) goto L_0x02a9
            goto L_0x02e1
        L_0x02a9:
            com.google.android.apps.gsa.nga.shared.aa.n.f r10 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f.GENIE
            if (r1 == r10) goto L_0x02b6
            java.lang.String r10 = r2.f220545a
            boolean r10 = com.google.android.apps.gsa.nga.engine.understanding.C79158p.m127100a(r10)
            if (r10 == 0) goto L_0x02b6
            goto L_0x02e1
        L_0x02b6:
            com.google.android.apps.gsa.nga.shared.aa.n.f r8 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f.GENIE
            if (r1 == r8) goto L_0x02d0
            com.google.android.apps.gsa.nga.shared.aa.e.b.m r9 = r13.f220582c
            if (r9 != 0) goto L_0x02c0
            com.google.android.apps.gsa.nga.shared.aa.e.b.m r9 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80383m.f220568e
        L_0x02c0:
            boolean r9 = r9.f220573d
            if (r9 == 0) goto L_0x02d0
            com.google.android.apps.gsa.nga.shared.aa.e.b.c r9 = r13.f220580a
            r10 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            if (r9 == 0) goto L_0x02ce
            boolean r9 = r9.f220537g
            if (r9 == 0) goto L_0x02d0
        L_0x02ce:
            r8 = r10
            goto L_0x02e1
        L_0x02d0:
            if (r1 != r8) goto L_0x02d3
            goto L_0x02e0
        L_0x02d3:
            java.lang.String r1 = "Turn_off_device"
            java.lang.String r2 = r2.f220545a
            r1.equals(r2)
            r8 = r4
            goto L_0x02e1
        L_0x02dc:
            com.google.android.apps.gsa.nga.shared.aa.n.f r2 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f.GENIE
            if (r1 != r2) goto L_0x02e1
        L_0x02e0:
            r8 = r6
        L_0x02e1:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r1
            r1.f220597i = r8
            com.google.android.apps.gsa.nga.shared.aa.e.b.m r1 = r13.f220582c
            if (r1 == 0) goto L_0x0300
            com.google.android.apps.gsa.nga.shared.aa.e.b.g r2 = r13.f220583d
            if (r2 == 0) goto L_0x0300
            int r1 = r1.f220570a
            com.google.android.apps.gsa.nga.shared.aa.n.f r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f.m128187a(r1)
            if (r1 != 0) goto L_0x02fc
            com.google.android.apps.gsa.nga.shared.aa.n.f r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f.UNRECOGNIZED
        L_0x02fc:
            com.google.android.apps.gsa.nga.shared.aa.n.f r2 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f.NORMALIZER
            if (r1 != r2) goto L_0x0301
        L_0x0300:
            r4 = r6
        L_0x0301:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r1
            r1.f220598j = r4
            com.google.android.apps.gsa.nga.shared.aa.e.b.g r1 = r13.f220583d
            if (r1 != 0) goto L_0x0310
            com.google.android.apps.gsa.nga.shared.aa.e.b.g r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80377g.f220548e
        L_0x0310:
            int r1 = r1.f220551b
            com.google.android.apps.gsa.nga.shared.aa.n.d r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d.m128185a(r1)
            if (r1 != 0) goto L_0x031a
            com.google.android.apps.gsa.nga.shared.aa.n.d r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d.UNRECOGNIZED
        L_0x031a:
            com.google.android.apps.gsa.nga.shared.aa.n.d r2 = com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d.CANTEEN
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0323
            goto L_0x0368
        L_0x0323:
            com.google.android.apps.gsa.nga.shared.aa.e.b.c r1 = r13.f220580a
            if (r1 != 0) goto L_0x0329
            com.google.android.apps.gsa.nga.shared.aa.e.b.c r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80373c.f220529m
        L_0x0329:
            boolean r1 = r1.f220534d
            if (r1 == 0) goto L_0x0337
            r0.copyOnWrite()
            com.google.protobuf.bv r13 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r13 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r13
            r13.f220601m = r3
            goto L_0x0368
        L_0x0337:
            com.google.android.apps.gsa.nga.shared.aa.e.b.g r13 = r13.f220583d
            if (r13 != 0) goto L_0x033d
            com.google.android.apps.gsa.nga.shared.aa.e.b.g r13 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80377g.f220548e
        L_0x033d:
            com.google.android.apps.gsa.nga.shared.aa.e.b.e r13 = r13.f220553d
            if (r13 != 0) goto L_0x0343
            com.google.android.apps.gsa.nga.shared.aa.e.b.e r13 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80375e.f220543c
        L_0x0343:
            java.lang.String r13 = r13.f220545a
            java.lang.String r1 = "Reply_to_message"
            boolean r13 = com.google.android.apps.gsa.nga.engine.understanding.C79330v.m127278c(r13, r1)
            if (r13 == 0) goto L_0x0368
            r0.copyOnWrite()
            com.google.protobuf.bv r13 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r13 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r13
            r13.f220601m = r3
            double r1 = r13.f220593e
            r0.copyOnWrite()
            com.google.protobuf.bv r13 = r0.instance
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r13 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r13
            r3 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r1 = r1 * r3
            r13.f220593e = r1
        L_0x0368:
            com.google.protobuf.bv r13 = r0.build()
            com.google.android.apps.gsa.nga.shared.aa.e.b.r r13 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r) r13
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6056o.p6095g.C77385aj.mo72539c(com.google.android.apps.gsa.nga.shared.aa.e.b.p):com.google.android.apps.gsa.nga.shared.aa.e.b.r");
    }
}
