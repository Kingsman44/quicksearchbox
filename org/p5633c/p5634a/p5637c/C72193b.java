package org.p5633c.p5634a.p5637c;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72288l;
import org.p5633c.p5634a.C72296t;
import org.p5633c.p5634a.p5636b.C72156ab;
import org.p5633c.p5634a.p5636b.C72158ad;
import org.p5633c.p5634a.p5636b.C72179o;
import org.p5633c.p5634a.p5636b.C72184t;
import org.p5633c.p5634a.p5636b.C72190z;

/* renamed from: org.c.a.c.b */
/* compiled from: PG */
final class C72193b extends C72192a implements C72199h, C72202k {

    /* renamed from: a */
    static final C72193b f192157a = new C72193b();

    protected C72193b() {
    }

    /* renamed from: a */
    public final long mo63529a(Object obj, C72132a aVar) {
        return ((Calendar) obj).getTime().getTime();
    }

    /* renamed from: b */
    public final C72132a mo63530b(Object obj, C72288l lVar) {
        C72296t tVar;
        if (obj.getClass().getName().endsWith(".BuddhistCalendar")) {
            return C72179o.m106099W(lVar);
        }
        if (!(obj instanceof GregorianCalendar)) {
            return C72156ab.m105789X(lVar);
        }
        long time = ((GregorianCalendar) obj).getGregorianChange().getTime();
        if (time == Long.MIN_VALUE) {
            return C72190z.m106190az(lVar, 4);
        }
        if (time == Long.MAX_VALUE) {
            return C72158ad.m105804az(lVar, 4);
        }
        if (time == C72184t.f192129E.f192450a) {
            tVar = null;
        } else {
            tVar = new C72296t(time);
        }
        return C72184t.m106141Z(lVar, tVar, 4);
    }

    /* renamed from: f */
    public final C72132a mo63534f(Object obj) {
        C72288l lVar;
        Calendar calendar = (Calendar) obj;
        try {
            lVar = C72288l.m106788o(calendar.getTimeZone());
        } catch (IllegalArgumentException unused) {
            lVar = C72288l.m106789p();
        }
        return mo63530b(calendar, lVar);
    }

    /* renamed from: g */
    public final Class mo63536g() {
        return Calendar.class;
    }
}
