package com.google.p386ak.p388b.p392c;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8267ab;
import com.google.p386ak.C8406v;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.google.ak.b.c.d */
/* compiled from: PG */
final class C8355d extends C8266aa {

    /* renamed from: a */
    static final C8267ab f29183a = new C8354c();

    /* renamed from: b */
    private final DateFormat f29184b = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17030b(C8387c cVar, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            cVar.mo17138h();
            return;
        }
        synchronized (this) {
            format = this.f29184b.format(time);
        }
        cVar.mo17141k(format);
    }

    /* renamed from: c */
    public final Time mo17029a(C8385a aVar) {
        Time time;
        if (aVar.mo17127r() == 9) {
            aVar.mo17123n();
            return null;
        }
        String h = aVar.mo17117h();
        try {
            synchronized (this) {
                time = new Time(this.f29184b.parse(h).getTime());
            }
            return time;
        } catch (ParseException e) {
            String d = aVar.mo17113d(true);
            throw new C8406v("Failed parsing '" + h + "' as SQL Time; at path " + d, e);
        }
    }
}
