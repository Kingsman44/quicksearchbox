package org.p5633c.p5634a;

import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.p5633c.p5634a.p5636b.C72156ab;

/* renamed from: org.c.a.i */
/* compiled from: PG */
public final class C72285i {

    /* renamed from: a */
    public static volatile Map f192411a;

    /* renamed from: b */
    public static volatile C72284h f192412b;

    /* renamed from: c */
    private static final C72284h f192413c;

    static {
        C72284h hVar = new C72284h();
        f192413c = hVar;
        f192412b = hVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("UT", C72288l.f192416b);
        linkedHashMap.put("UTC", C72288l.f192416b);
        linkedHashMap.put("GMT", C72288l.f192416b);
        m106779g(linkedHashMap, "EST", "America/New_York");
        m106779g(linkedHashMap, "EDT", "America/New_York");
        m106779g(linkedHashMap, "CST", "America/Chicago");
        m106779g(linkedHashMap, "CDT", "America/Chicago");
        m106779g(linkedHashMap, "MST", "America/Denver");
        m106779g(linkedHashMap, "MDT", "America/Denver");
        m106779g(linkedHashMap, "PST", "America/Los_Angeles");
        m106779g(linkedHashMap, "PDT", "America/Los_Angeles");
        f192411a = Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: a */
    public static final long m106773a(C72149ag agVar) {
        if (agVar == null) {
            return System.currentTimeMillis();
        }
        return agVar.mo63409mr();
    }

    /* renamed from: b */
    public static final DateFormatSymbols m106774b(Locale locale) {
        try {
            return (DateFormatSymbols) DateFormatSymbols.class.getMethod("getInstance", new Class[]{Locale.class}).invoke((Object) null, new Object[]{locale});
        } catch (Exception unused) {
            return new DateFormatSymbols(locale);
        }
    }

    /* renamed from: c */
    public static final C72132a m106775c(C72132a aVar) {
        return aVar == null ? C72156ab.m105788W() : aVar;
    }

    /* renamed from: d */
    public static final C72132a m106776d(C72149ag agVar) {
        if (agVar == null) {
            return C72156ab.m105788W();
        }
        C72132a ms = agVar.mo63410ms();
        return ms == null ? C72156ab.m105788W() : ms;
    }

    /* renamed from: e */
    public static final C72288l m106777e(C72288l lVar) {
        return lVar == null ? C72288l.m106789p() : lVar;
    }

    /* renamed from: f */
    public static final C72146ad m106778f(C72146ad adVar) {
        return adVar == null ? C72146ad.m105763e() : adVar;
    }

    /* renamed from: g */
    private static void m106779g(Map map, String str, String str2) {
        try {
            map.put(str, C72288l.m106786m(str2));
        } catch (RuntimeException unused) {
        }
    }
}
