package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6083d;

import com.google.android.apps.gsa.nga.engine.p6246w.C79402e;
import com.google.assistant.p3897e.p3921j.C52395qd;
import com.google.common.p4580v.C60950i;
import p3186j$.time.LocalDate;
import p3186j$.time.ZoneId;
import p3186j$.time.temporal.ChronoField;
import p3186j$.time.temporal.ChronoUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.d.v */
/* compiled from: PG */
public final class C76871v {

    /* renamed from: a */
    public static final ChronoField[] f212297a = {ChronoField.HOUR_OF_DAY, ChronoField.DAY_OF_WEEK, ChronoField.DAY_OF_MONTH, ChronoField.DAY_OF_YEAR};

    /* renamed from: b */
    public static final ChronoUnit[] f212298b = {ChronoUnit.DAYS, ChronoUnit.WEEKS, ChronoUnit.MONTHS, ChronoUnit.YEARS};

    /* renamed from: c */
    private final C60950i f212299c;

    public C76871v(C60950i iVar) {
        this.f212299c = iVar;
    }

    /* renamed from: b */
    static Optional m123491b(C52395qd qdVar) {
        LocalDate e = C79402e.m127438e(qdVar);
        LocalDate plusDays = e.plusDays(1);
        String c = m123492c(e);
        String c2 = m123492c(plusDays);
        return Optional.m71637of("after:" + c + " before:" + c2);
    }

    /* renamed from: c */
    public static String m123492c(LocalDate localDate) {
        int year = localDate.getYear();
        int value = localDate.getMonth().getValue();
        int dayOfMonth = localDate.getDayOfMonth();
        return year + "/" + value + "/" + dayOfMonth;
    }

    /* renamed from: a */
    public final LocalDate mo72340a() {
        return this.f212299c.mo57446c(ZoneId.systemDefault()).mo43126j();
    }
}
