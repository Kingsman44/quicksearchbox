package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: com.google.ads.interactivemedia.v3.internal.akb */
/* compiled from: PG */
final class akb extends agt {
    public final /* bridge */ /* synthetic */ Object read(alb alb) {
        if (alb.mo14838p() == 9) {
            alb.mo14831i();
            return null;
        }
        alb.mo14824c();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (alb.mo14838p() != 4) {
            String f = alb.mo14828f();
            int l = alb.mo14834l();
            if ("year".equals(f)) {
                i = l;
            } else if ("month".equals(f)) {
                i2 = l;
            } else if ("dayOfMonth".equals(f)) {
                i3 = l;
            } else if ("hourOfDay".equals(f)) {
                i4 = l;
            } else if ("minute".equals(f)) {
                i5 = l;
            } else if ("second".equals(f)) {
                i6 = l;
            }
        }
        alb.mo14826d();
        return new GregorianCalendar(i, i2, i3, i4, i5, i6);
    }

    public final /* bridge */ /* synthetic */ void write(ald ald, Object obj) {
        Calendar calendar = (Calendar) obj;
        if (calendar == null) {
            ald.mo14851g();
            return;
        }
        ald.mo14845c();
        ald.mo14849f("year");
        ald.mo14852h((long) calendar.get(1));
        ald.mo14849f("month");
        ald.mo14852h((long) calendar.get(2));
        ald.mo14849f("dayOfMonth");
        ald.mo14852h((long) calendar.get(5));
        ald.mo14849f("hourOfDay");
        ald.mo14852h((long) calendar.get(11));
        ald.mo14849f("minute");
        ald.mo14852h((long) calendar.get(12));
        ald.mo14849f("second");
        ald.mo14852h((long) calendar.get(13));
        ald.mo14848e();
    }
}
