package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8267ab;
import com.google.p386ak.C8406v;
import com.google.p386ak.p388b.C8328ab;
import com.google.p386ak.p388b.p389a.p390a.C8271a;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.ak.b.a.f */
/* compiled from: PG */
public final class C8306f extends C8266aa {

    /* renamed from: a */
    public static final C8267ab f29094a = new C8305e();

    /* renamed from: b */
    private final List f29095b;

    public C8306f() {
        ArrayList arrayList = new ArrayList();
        this.f29095b = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C8328ab.m23098a()) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", Locale.US));
        }
    }

    /* renamed from: c */
    private final Date m23047c(C8385a aVar) {
        String h = aVar.mo17117h();
        synchronized (this.f29095b) {
            for (DateFormat parse : this.f29095b) {
                try {
                    Date parse2 = parse.parse(h);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                return C8271a.m22983a(h, new ParsePosition(0));
            } catch (ParseException e) {
                String d = aVar.mo17113d(true);
                throw new C8406v("Failed parsing '" + h + "' as Date; at path " + d, e);
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17029a(C8385a aVar) {
        if (aVar.mo17127r() != 9) {
            return m23047c(aVar);
        }
        aVar.mo17123n();
        return null;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17030b(C8387c cVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            cVar.mo17138h();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f29095b.get(0);
        synchronized (this.f29095b) {
            format = dateFormat.format(date);
        }
        cVar.mo17141k(format);
    }
}
