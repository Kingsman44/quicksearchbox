package com.google.p386ak.p388b.p392c;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8267ab;
import com.google.p386ak.C8406v;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.google.ak.b.c.b */
/* compiled from: PG */
final class C8353b extends C8266aa {

    /* renamed from: a */
    static final C8267ab f29181a = new C8352a();

    /* renamed from: b */
    private final DateFormat f29182b = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17030b(C8387c cVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            cVar.mo17138h();
            return;
        }
        synchronized (this) {
            format = this.f29182b.format(date);
        }
        cVar.mo17141k(format);
    }

    /* renamed from: c */
    public final Date mo17029a(C8385a aVar) {
        java.util.Date parse;
        if (aVar.mo17127r() == 9) {
            aVar.mo17123n();
            return null;
        }
        String h = aVar.mo17117h();
        try {
            synchronized (this) {
                parse = this.f29182b.parse(h);
            }
            return new Date(parse.getTime());
        } catch (ParseException e) {
            String d = aVar.mo17113d(true);
            throw new C8406v("Failed parsing '" + h + "' as SQL Date; at path " + d, e);
        }
    }
}
