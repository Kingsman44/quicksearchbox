package p3186j$.time.format;

import com.evernote.android.state.BuildConfig;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import p3186j$.time.chrono.C40961d;
import p3186j$.time.chrono.C40963f;
import p3186j$.time.temporal.ChronoField;
import p3186j$.time.temporal.TemporalField;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.format.B */
class C40969B {

    /* renamed from: a */
    private static final ConcurrentHashMap f107291a = new ConcurrentHashMap(16, 0.75f, 2);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Comparator f107292b = new C40978c();

    /* renamed from: c */
    private static final C40969B f107293c = new C40969B();

    /* renamed from: d */
    public static final /* synthetic */ int f107294d = 0;

    C40969B() {
    }

    /* renamed from: b */
    private static Object m71332b(TemporalField temporalField, Locale locale) {
        Object obj;
        TemporalField temporalField2 = temporalField;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(temporalField2, locale);
        ConcurrentHashMap concurrentHashMap = f107291a;
        Object obj2 = concurrentHashMap.get(simpleImmutableEntry);
        if (obj2 != null) {
            return obj2;
        }
        HashMap hashMap = new HashMap();
        int i = 0;
        if (temporalField2 == ChronoField.ERA) {
            DateFormatSymbols instance = DateFormatSymbols.getInstance(locale);
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            String[] eras = instance.getEras();
            while (i < eras.length) {
                if (!eras[i].isEmpty()) {
                    long j = (long) i;
                    hashMap2.put(Long.valueOf(j), eras[i]);
                    hashMap3.put(Long.valueOf(j), m71333c(eras[i]));
                }
                i++;
            }
            if (!hashMap2.isEmpty()) {
                hashMap.put(C40974G.FULL, hashMap2);
                hashMap.put(C40974G.SHORT, hashMap2);
                hashMap.put(C40974G.NARROW, hashMap3);
            }
            obj = new C40968A(hashMap);
        } else if (temporalField2 == ChronoField.MONTH_OF_YEAR) {
            DateFormatSymbols instance2 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            String[] months = instance2.getMonths();
            for (int i2 = 0; i2 < months.length; i2++) {
                if (!months[i2].isEmpty()) {
                    long j2 = ((long) i2) + 1;
                    hashMap4.put(Long.valueOf(j2), months[i2]);
                    hashMap5.put(Long.valueOf(j2), m71333c(months[i2]));
                }
            }
            if (!hashMap4.isEmpty()) {
                hashMap.put(C40974G.FULL, hashMap4);
                hashMap.put(C40974G.NARROW, hashMap5);
            }
            HashMap hashMap6 = new HashMap();
            String[] shortMonths = instance2.getShortMonths();
            while (i < shortMonths.length) {
                if (!shortMonths[i].isEmpty()) {
                    hashMap6.put(Long.valueOf(((long) i) + 1), shortMonths[i]);
                }
                i++;
            }
            if (!hashMap6.isEmpty()) {
                hashMap.put(C40974G.SHORT, hashMap6);
            }
            obj = new C40968A(hashMap);
        } else if (temporalField2 == ChronoField.DAY_OF_WEEK) {
            DateFormatSymbols instance3 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap7 = new HashMap();
            String[] weekdays = instance3.getWeekdays();
            hashMap7.put(1L, weekdays[2]);
            hashMap7.put(2L, weekdays[3]);
            hashMap7.put(3L, weekdays[4]);
            hashMap7.put(4L, weekdays[5]);
            hashMap7.put(5L, weekdays[6]);
            hashMap7.put(6L, weekdays[7]);
            hashMap7.put(7L, weekdays[1]);
            hashMap.put(C40974G.FULL, hashMap7);
            HashMap hashMap8 = new HashMap();
            hashMap8.put(1L, m71333c(weekdays[2]));
            hashMap8.put(2L, m71333c(weekdays[3]));
            hashMap8.put(3L, m71333c(weekdays[4]));
            hashMap8.put(4L, m71333c(weekdays[5]));
            hashMap8.put(5L, m71333c(weekdays[6]));
            hashMap8.put(6L, m71333c(weekdays[7]));
            hashMap8.put(7L, m71333c(weekdays[1]));
            hashMap.put(C40974G.NARROW, hashMap8);
            HashMap hashMap9 = new HashMap();
            String[] shortWeekdays = instance3.getShortWeekdays();
            hashMap9.put(1L, shortWeekdays[2]);
            hashMap9.put(2L, shortWeekdays[3]);
            hashMap9.put(3L, shortWeekdays[4]);
            hashMap9.put(4L, shortWeekdays[5]);
            hashMap9.put(5L, shortWeekdays[6]);
            hashMap9.put(6L, shortWeekdays[7]);
            hashMap9.put(7L, shortWeekdays[1]);
            hashMap.put(C40974G.SHORT, hashMap9);
            obj = new C40968A(hashMap);
        } else if (temporalField2 == ChronoField.AMPM_OF_DAY) {
            DateFormatSymbols instance4 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap10 = new HashMap();
            HashMap hashMap11 = new HashMap();
            String[] amPmStrings = instance4.getAmPmStrings();
            while (i < amPmStrings.length) {
                if (!amPmStrings[i].isEmpty()) {
                    long j3 = (long) i;
                    hashMap10.put(Long.valueOf(j3), amPmStrings[i]);
                    hashMap11.put(Long.valueOf(j3), m71333c(amPmStrings[i]));
                }
                i++;
            }
            if (!hashMap10.isEmpty()) {
                hashMap.put(C40974G.FULL, hashMap10);
                hashMap.put(C40974G.SHORT, hashMap10);
                hashMap.put(C40974G.NARROW, hashMap11);
            }
            obj = new C40968A(hashMap);
        } else {
            obj = BuildConfig.FLAVOR;
        }
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, obj);
        return concurrentHashMap.get(simpleImmutableEntry);
    }

    /* renamed from: c */
    private static String m71333c(String str) {
        return str.substring(0, Character.charCount(str.codePointAt(0)));
    }

    /* renamed from: d */
    static C40969B m71334d() {
        return f107293c;
    }

    /* renamed from: e */
    public String mo43248e(C40961d dVar, TemporalField temporalField, long j, C40974G g, Locale locale) {
        if (dVar == C40963f.f107281a || !(temporalField instanceof ChronoField)) {
            return mo43249f(temporalField, j, g, locale);
        }
        return null;
    }

    /* renamed from: f */
    public String mo43249f(TemporalField temporalField, long j, C40974G g, Locale locale) {
        Object b = m71332b(temporalField, locale);
        if (b instanceof C40968A) {
            return ((C40968A) b).mo43246a(j, g);
        }
        return null;
    }

    /* renamed from: g */
    public Iterator mo43250g(C40961d dVar, TemporalField temporalField, C40974G g, Locale locale) {
        if (dVar == C40963f.f107281a || !(temporalField instanceof ChronoField)) {
            return mo43251h(temporalField, g, locale);
        }
        return null;
    }

    /* renamed from: h */
    public Iterator mo43251h(TemporalField temporalField, C40974G g, Locale locale) {
        Object b = m71332b(temporalField, locale);
        if (b instanceof C40968A) {
            return ((C40968A) b).mo43247b(g);
        }
        return null;
    }
}
