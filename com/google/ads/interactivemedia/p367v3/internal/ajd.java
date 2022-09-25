package com.google.ads.interactivemedia.p367v3.internal;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ajd */
/* compiled from: PG */
public final class ajd extends agt {

    /* renamed from: a */
    public static final agu f20753a = new ajc();

    /* renamed from: b */
    private final DateFormat f20754b = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: a */
    public final synchronized Date read(alb alb) {
        if (alb.mo14838p() == 9) {
            alb.mo14831i();
            return null;
        }
        try {
            return new Date(this.f20754b.parse(alb.mo14829g()).getTime());
        } catch (ParseException e) {
            throw new agq((Throwable) e);
        }
    }

    /* renamed from: b */
    public final synchronized void write(ald ald, Date date) {
        ald.mo14855k(date == null ? null : this.f20754b.format(date));
    }
}
