package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: com.google.ak.b.a.aj */
/* compiled from: PG */
final class C8281aj extends C8266aa {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17029a(C8385a aVar) {
        if (aVar.mo17127r() == 9) {
            aVar.mo17123n();
            return null;
        }
        aVar.mo17120k();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (aVar.mo17127r() != 4) {
            String f = aVar.mo17115f();
            int c = aVar.mo17111c();
            if ("year".equals(f)) {
                i = c;
            } else if ("month".equals(f)) {
                i2 = c;
            } else if ("dayOfMonth".equals(f)) {
                i3 = c;
            } else if ("hourOfDay".equals(f)) {
                i4 = c;
            } else if ("minute".equals(f)) {
                i5 = c;
            } else if ("second".equals(f)) {
                i6 = c;
            }
        }
        aVar.mo17122m();
        return new GregorianCalendar(i, i2, i3, i4, i5, i6);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17030b(C8387c cVar, Object obj) {
        Calendar calendar = (Calendar) obj;
        if (calendar == null) {
            cVar.mo17138h();
            return;
        }
        cVar.mo17133d();
        cVar.mo17137g("year");
        cVar.mo17139i((long) calendar.get(1));
        cVar.mo17137g("month");
        cVar.mo17139i((long) calendar.get(2));
        cVar.mo17137g("dayOfMonth");
        cVar.mo17139i((long) calendar.get(5));
        cVar.mo17137g("hourOfDay");
        cVar.mo17139i((long) calendar.get(11));
        cVar.mo17137g("minute");
        cVar.mo17139i((long) calendar.get(12));
        cVar.mo17137g("second");
        cVar.mo17139i((long) calendar.get(13));
        cVar.mo17135f();
    }
}
