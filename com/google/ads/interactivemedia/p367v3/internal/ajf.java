package com.google.ads.interactivemedia.p367v3.internal;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ajf */
/* compiled from: PG */
public final class ajf extends agt {

    /* renamed from: a */
    public static final agu f20755a = new aje();

    /* renamed from: b */
    private final DateFormat f20756b = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: a */
    public final synchronized Time read(alb alb) {
        if (alb.mo14838p() == 9) {
            alb.mo14831i();
            return null;
        }
        try {
            return new Time(this.f20756b.parse(alb.mo14829g()).getTime());
        } catch (ParseException e) {
            throw new agq((Throwable) e);
        }
    }

    /* renamed from: b */
    public final synchronized void write(ald ald, Time time) {
        ald.mo14855k(time == null ? null : this.f20756b.format(time));
    }
}
