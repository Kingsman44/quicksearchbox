package com.google.p4479cg.p4480a;

import com.google.common.base.C58838bb;
import com.google.p4479cg.C58071c;
import com.google.p4479cg.C58072d;
import com.google.p4479cg.C58074f;
import com.google.p4479cg.C58075g;
import com.google.p4479cg.C58080l;
import com.google.p4479cg.C58081m;
import com.google.p4479cg.C58083o;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.time.Duration;
import p3186j$.time.ZoneId;

/* renamed from: com.google.cg.a.a */
/* compiled from: PG */
public final class C58064a {

    /* renamed from: a */
    private static final Duration f155209a = Duration.ofHours(18);

    /* renamed from: b */
    private static final C58081m f155210b;

    static {
        C58080l lVar = (C58080l) C58081m.f155254e.createBuilder();
        lVar.copyOnWrite();
        ((C58081m) lVar.instance).f155256a = 24;
        f155210b = (C58081m) lVar.build();
    }

    /* renamed from: a */
    public static void m88817a(C58075g gVar) {
        C62910ar arVar;
        C58083o oVar;
        C58071c cVar = (C58071c) C58072d.f155218d.createBuilder();
        int i = gVar.f155231c;
        cVar.copyOnWrite();
        ((C58072d) cVar.instance).f155220a = i;
        int i2 = gVar.f155232d;
        cVar.copyOnWrite();
        ((C58072d) cVar.instance).f155221b = i2;
        int i3 = gVar.f155233e;
        cVar.copyOnWrite();
        ((C58072d) cVar.instance).f155222c = i3;
        C58072d dVar = (C58072d) cVar.build();
        int i4 = gVar.f155232d;
        boolean z = true;
        C58838bb.m90880o(i4 > 0 && gVar.f155233e > 0, "Date must include month and day (year = %s, month = %s, day = %s)", Integer.valueOf(gVar.f155231c), Integer.valueOf(i4), Integer.valueOf(gVar.f155233e));
        C58066c.m88821c(dVar);
        C58080l lVar = (C58080l) C58081m.f155254e.createBuilder();
        int i5 = gVar.f155234f;
        lVar.copyOnWrite();
        ((C58081m) lVar.instance).f155256a = i5;
        int i6 = gVar.f155235g;
        lVar.copyOnWrite();
        ((C58081m) lVar.instance).f155257b = i6;
        int i7 = gVar.f155236h;
        lVar.copyOnWrite();
        ((C58081m) lVar.instance).f155258c = i7;
        int i8 = gVar.f155237i;
        lVar.copyOnWrite();
        ((C58081m) lVar.instance).f155259d = i8;
        C58081m mVar = (C58081m) lVar.build();
        if (!mVar.equals(f155210b) && mVar.f155258c != 60) {
            C58069f.m88830b(mVar);
        }
        C58074f fVar = C58074f.UTC_OFFSET;
        int ordinal = C58074f.m88831a(gVar.f155229a).ordinal();
        if (ordinal == 0) {
            if (gVar.f155229a == 8) {
                arVar = (C62910ar) gVar.f155230b;
            } else {
                arVar = C62910ar.f169858c;
            }
            C62948a.m95465p(arVar);
            Duration d = C62950b.m95473d(arVar);
            C58838bb.m90873h(((long) d.getNano()) == 0, "UTC offset must be integral seconds (is %s).", d);
            Duration duration = f155209a;
            if (d.compareTo(duration) > 0 || d.compareTo(Duration.ZERO.minus(duration)) < 0) {
                z = false;
            }
            C58838bb.m90873h(z, "UTC offset must be between -18:00 and +18:00 (is %s).", d);
        } else if (ordinal == 1) {
            if (gVar.f155229a == 9) {
                oVar = (C58083o) gVar.f155230b;
            } else {
                oVar = C58083o.f155260b;
            }
            C58838bb.m90869d(ZoneId.getAvailableZoneIds().contains(oVar.f155262a), "Invalid time zone");
        } else if (ordinal != 2) {
            throw new AssertionError(C58074f.m88831a(gVar.f155229a));
        }
    }
}
