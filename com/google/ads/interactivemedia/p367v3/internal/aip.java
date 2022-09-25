package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.impl.data.C6731ax;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aip */
/* compiled from: PG */
public final class aip extends agt {

    /* renamed from: a */
    public static final agu f20707a = new aio();

    /* renamed from: b */
    private final List f20708b;

    public aip() {
        ArrayList arrayList = new ArrayList();
        this.f20708b = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (ahs.m18747b()) {
            arrayList.add(C6731ax.m18028d(2, 2));
        }
    }

    /* renamed from: b */
    private final synchronized Date m18775b(String str) {
        for (DateFormat parse : this.f20708b) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return akv.m18859a(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new agq(str, e);
        }
    }

    /* renamed from: a */
    public final synchronized void write(ald ald, Date date) {
        if (date == null) {
            ald.mo14851g();
        } else {
            ald.mo14855k(((DateFormat) this.f20708b.get(0)).format(date));
        }
    }

    public final /* bridge */ /* synthetic */ Object read(alb alb) {
        if (alb.mo14838p() != 9) {
            return m18775b(alb.mo14829g());
        }
        alb.mo14831i();
        return null;
    }
}
