package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3099a.p3101b;

import android.content.Context;
import android.icu.text.NumberFormat;
import android.icu.text.RelativeDateTimeFormatter;
import android.icu.util.ULocale;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4909b.p4911b.C64123h;
import java.util.Map;
import p3186j$.time.Duration;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.a.b.k */
/* compiled from: PG */
public final class C39924k {

    /* renamed from: a */
    public static final Duration f104950a = Duration.ofDays(365);

    /* renamed from: b */
    public static final Duration f104951b;

    /* renamed from: c */
    public static final Duration f104952c;

    /* renamed from: d */
    public static final Duration f104953d = Duration.ofDays(1);

    /* renamed from: e */
    public static final Duration f104954e = Duration.ofHours(1);

    /* renamed from: f */
    public static final Duration f104955f = Duration.ofMinutes(1);

    /* renamed from: g */
    public static final NumberFormat f104956g = NumberFormat.getIntegerInstance();

    /* renamed from: h */
    public final Map f104957h = new ConcurrentHashMap();

    /* renamed from: i */
    public final Map f104958i = new ConcurrentHashMap();

    /* renamed from: j */
    private final Context f104959j;

    static {
        Duration ofDays = Duration.ofDays(7);
        f104951b = ofDays;
        f104952c = ofDays.multipliedBy(8);
    }

    public C39924k(Context context) {
        this.f104959j = context;
    }

    /* renamed from: b */
    public static String m69349b(long j, RelativeDateTimeFormatter.RelativeUnit relativeUnit, C64123h hVar, RelativeDateTimeFormatter relativeDateTimeFormatter) {
        RelativeDateTimeFormatter.RelativeDateTimeUnit relativeDateTimeUnit;
        int i = C39921h.f104946b[hVar.ordinal()];
        if (i == 1) {
            double d = (double) j;
            switch (C39921h.f104947c[relativeUnit.ordinal()]) {
                case 1:
                    relativeDateTimeUnit = RelativeDateTimeFormatter.RelativeDateTimeUnit.YEAR;
                    break;
                case 2:
                    relativeDateTimeUnit = RelativeDateTimeFormatter.RelativeDateTimeUnit.MONTH;
                    break;
                case 3:
                    relativeDateTimeUnit = RelativeDateTimeFormatter.RelativeDateTimeUnit.WEEK;
                    break;
                case 4:
                    relativeDateTimeUnit = RelativeDateTimeFormatter.RelativeDateTimeUnit.DAY;
                    break;
                case 5:
                    relativeDateTimeUnit = RelativeDateTimeFormatter.RelativeDateTimeUnit.HOUR;
                    break;
                case 6:
                    relativeDateTimeUnit = RelativeDateTimeFormatter.RelativeDateTimeUnit.MINUTE;
                    break;
                case 7:
                    relativeDateTimeUnit = RelativeDateTimeFormatter.RelativeDateTimeUnit.SECOND;
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Unsupported unit: %s", new Object[]{relativeUnit}));
            }
            return relativeDateTimeFormatter.format(d, relativeDateTimeUnit);
        } else if (i == 2 || i == 3) {
            return relativeDateTimeFormatter.format(Math.abs((double) j), j < 0 ? RelativeDateTimeFormatter.Direction.LAST : RelativeDateTimeFormatter.Direction.NEXT, relativeUnit);
        } else {
            throw new AssertionError("Exhaustive switch");
        }
    }

    /* renamed from: a */
    public final ULocale mo42083a() {
        return ULocale.forLocale(this.f104959j.getResources().getConfiguration().locale);
    }
}
