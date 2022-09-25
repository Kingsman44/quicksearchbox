package com.google.android.apps.search.googleapp.discover.p10195j;

import android.content.Context;
import android.icu.text.MeasureFormat;
import android.icu.text.RelativeDateTimeFormatter;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.icu.util.ULocale;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.discover.p10195j.p10198c.C134431a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3099a.p3101b.C39914a;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3099a.p3101b.C39915b;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3099a.p3101b.C39916c;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3099a.p3101b.C39917d;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3099a.p3101b.C39918e;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3099a.p3101b.C39919f;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3099a.p3101b.C39920g;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3099a.p3101b.C39921h;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3099a.p3101b.C39924k;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3099a.p3101b.C39927n;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57325h;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4909b.p4911b.C64118c;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4909b.p4911b.C64120e;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4909b.p4911b.C64123h;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4909b.p4911b.C64124i;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4909b.p4911b.C64126k;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4909b.p4911b.C64128m;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4909b.p4911b.C64129n;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.time.LocalDate;
import p3186j$.time.ZoneOffset;
import p3186j$.time.temporal.ChronoUnit;
import p3186j$.util.Collection;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.k */
/* compiled from: PG */
public final class C134439k implements C39927n {

    /* renamed from: a */
    private static final Duration f366151a = Duration.ofDays(365);

    /* renamed from: b */
    private static final Duration f366152b;

    /* renamed from: c */
    private static final Duration f366153c;

    /* renamed from: d */
    private static final Duration f366154d = Duration.ofDays(1);

    /* renamed from: e */
    private static final Duration f366155e = Duration.ofHours(1);

    /* renamed from: f */
    private static final Duration f366156f = Duration.ofMinutes(1);

    /* renamed from: g */
    private final boolean f366157g;

    /* renamed from: h */
    private final boolean f366158h;

    /* renamed from: i */
    private final Context f366159i;

    /* renamed from: j */
    private final C39924k f366160j;

    static {
        Duration ofDays = Duration.ofDays(7);
        f366152b = ofDays;
        f366153c = ofDays.multipliedBy(8);
    }

    public C134439k(Context context, C58485gu guVar) {
        this.f366157g = guVar.contains(C57325h.DUPLO_UI);
        this.f366158h = guVar.contains(C57325h.ICU_CLIENT_TIMESTAMPS);
        this.f366159i = context;
        this.f366160j = new C39924k(context);
    }

    /* renamed from: b */
    public final String mo42085b(Instant instant, Instant instant2, C64129n nVar) {
        String str;
        C58485gu guVar;
        C64120e eVar;
        C64120e eVar2;
        C58724pq pqVar;
        C64124i iVar;
        C64124i iVar2;
        if (!this.f366158h) {
            return mo42084a(instant, instant2);
        }
        C39924k kVar = this.f366160j;
        int[] iArr = C39921h.f104945a;
        C64126k a = C64126k.m96360a(nVar.f173383d);
        if (a == null) {
            a = C64126k.TIMESTAMP_FORMAT_UNKNOWN;
        }
        if (iArr[a.ordinal()] != 1) {
            ULocale a2 = kVar.mo42083a();
            C64128m a3 = C64128m.m96362a(nVar.f173384e);
            if (a3 == null) {
                a3 = C64128m.WIDTH_UNKNOWN;
            }
            if (nVar.f173381b == 6) {
                iVar = (C64124i) nVar.f173382c;
            } else {
                iVar = C64124i.f173360c;
            }
            C64118c a4 = C64118c.m96356a(iVar.f173363b);
            if (a4 == null) {
                a4 = C64118c.CAPITALIZATION_UNKNOWN;
            }
            RelativeDateTimeFormatter relativeDateTimeFormatter = (RelativeDateTimeFormatter) Map.EL.computeIfAbsent(kVar.f104957h, new C39915b(a2, a3, a4), C39916c.f104940a);
            Duration between = Duration.between(instant, instant2);
            Duration abs = between.abs();
            LocalDate localDate = instant2.atZone(ZoneOffset.UTC).toLocalDate();
            LocalDate localDate2 = instant.atZone(ZoneOffset.UTC).toLocalDate();
            if (nVar.f173381b == 6) {
                iVar2 = (C64124i) nVar.f173382c;
            } else {
                iVar2 = C64124i.f173360c;
            }
            C64123h a5 = C64123h.m96358a(iVar2.f173362a);
            if (a5 == null) {
                a5 = C64123h.STYLE_UNKNOWN;
            }
            str = abs.compareTo(C39924k.f104950a) >= 0 ? C39924k.m69349b(ChronoUnit.YEARS.between(localDate2, localDate), RelativeDateTimeFormatter.RelativeUnit.YEARS, a5, relativeDateTimeFormatter) : abs.compareTo(C39924k.f104952c) >= 0 ? C39924k.m69349b(ChronoUnit.MONTHS.between(localDate2, localDate), RelativeDateTimeFormatter.RelativeUnit.MONTHS, a5, relativeDateTimeFormatter) : abs.compareTo(C39924k.f104951b) >= 0 ? C39924k.m69349b(between.toDays() / 7, RelativeDateTimeFormatter.RelativeUnit.WEEKS, a5, relativeDateTimeFormatter) : abs.compareTo(C39924k.f104953d) >= 0 ? C39924k.m69349b(between.toDays(), RelativeDateTimeFormatter.RelativeUnit.DAYS, a5, relativeDateTimeFormatter) : abs.compareTo(C39924k.f104954e) >= 0 ? C39924k.m69349b(between.toHours(), RelativeDateTimeFormatter.RelativeUnit.HOURS, a5, relativeDateTimeFormatter) : abs.compareTo(C39924k.f104955f) >= 0 ? C39924k.m69349b(between.toMinutes(), RelativeDateTimeFormatter.RelativeUnit.MINUTES, a5, relativeDateTimeFormatter) : nVar.f173385f ? relativeDateTimeFormatter.format(RelativeDateTimeFormatter.Direction.PLAIN, RelativeDateTimeFormatter.AbsoluteUnit.NOW) : C39924k.m69349b(between.toSeconds(), RelativeDateTimeFormatter.RelativeUnit.SECONDS, a5, relativeDateTimeFormatter);
        } else {
            Duration abs2 = Duration.between(instant, instant2).abs();
            java.util.Map map = kVar.f104958i;
            ULocale a6 = kVar.mo42083a();
            C64128m a7 = C64128m.m96362a(nVar.f173384e);
            if (a7 == null) {
                a7 = C64128m.WIDTH_UNKNOWN;
            }
            MeasureFormat measureFormat = (MeasureFormat) Map.EL.computeIfAbsent(map, new C39914a(a6, a7), C39917d.f104941a);
            if (abs2.compareTo(C39924k.f104952c) > 0) {
                LocalDate localDate3 = instant2.atZone(ZoneOffset.UTC).toLocalDate();
                LocalDate localDate4 = instant.atZone(ZoneOffset.UTC).toLocalDate();
                guVar = C58485gu.m89847o(new Measure(Long.valueOf(ChronoUnit.YEARS.between(localDate3, localDate4)), MeasureUnit.YEAR), new Measure(Long.valueOf(ChronoUnit.MONTHS.between(localDate3, localDate4) % 12), MeasureUnit.MONTH));
            } else {
                boolean z = nVar.f173385f;
                C58480gp e = C58485gu.m89837e();
                e.mo55395g(new Measure(Long.valueOf(abs2.toDays() / 7), MeasureUnit.WEEK));
                e.mo55395g(new Measure(Long.valueOf(abs2.toDays() % 7), MeasureUnit.DAY));
                e.mo55395g(new Measure(Long.valueOf(abs2.toHours() % 24), MeasureUnit.HOUR));
                e.mo55395g(new Measure(Long.valueOf(abs2.toMinutes() % 60), MeasureUnit.MINUTE));
                if (!z) {
                    e.mo55395g(new Measure(Long.valueOf(abs2.toSeconds() % 60), MeasureUnit.SECOND));
                }
                guVar = e.mo55394f();
            }
            if (nVar.f173381b == 7) {
                eVar = (C64120e) nVar.f173382c;
            } else {
                eVar = C64120e.f173349c;
            }
            int i = eVar.f173351a;
            if (i > 0) {
                int i2 = 0;
                while (true) {
                    pqVar = (C58724pq) guVar;
                    if (i2 >= pqVar.f156474d || ((Measure) guVar.get(i2)).getNumber().intValue() > 0) {
                        guVar = guVar.subList(i2, Math.min(i + i2, pqVar.f156474d));
                    } else {
                        i2++;
                    }
                }
                guVar = guVar.subList(i2, Math.min(i + i2, pqVar.f156474d));
            }
            C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).filter(C39918e.f104942a).collect(C58370cn.f155946a);
            if (!guVar2.isEmpty()) {
                String formatMeasures = measureFormat.formatMeasures((Measure[]) guVar2.toArray(new Measure[0]));
                if (Collection.EL.stream(guVar2).anyMatch(C39920g.f104944a)) {
                    C64128m a8 = C64128m.m96362a(nVar.f173384e);
                    if (a8 == null) {
                        a8 = C64128m.WIDTH_UNKNOWN;
                    }
                    if (a8.equals(C64128m.WIDTH_NARROW) && kVar.mo42083a().getLanguage().equals("en")) {
                        str = formatMeasures.replace("m", "mo");
                    }
                }
                str = formatMeasures;
            } else if (nVar.f173385f) {
                ULocale a9 = kVar.mo42083a();
                C64128m a10 = C64128m.m96362a(nVar.f173384e);
                if (a10 == null) {
                    a10 = C64128m.WIDTH_UNKNOWN;
                }
                if (nVar.f173381b == 7) {
                    eVar2 = (C64120e) nVar.f173382c;
                } else {
                    eVar2 = C64120e.f173349c;
                }
                C64118c a11 = C64118c.m96356a(eVar2.f173352b);
                if (a11 == null) {
                    a11 = C64118c.CAPITALIZATION_UNKNOWN;
                }
                str = ((RelativeDateTimeFormatter) Map.EL.computeIfAbsent(kVar.f104957h, new C39915b(a9, a10, a11), C39919f.f104943a)).format(RelativeDateTimeFormatter.Direction.PLAIN, RelativeDateTimeFormatter.AbsoluteUnit.NOW);
            } else {
                str = measureFormat.format(new Measure(0, MeasureUnit.SECOND));
            }
        }
        if (nVar.f173387h) {
            str = str.replace(".", BuildConfig.FLAVOR);
        }
        if ((nVar.f173380a & 8) == 0) {
            return str;
        }
        return String.format(nVar.f173386g, new Object[]{str});
    }

    /* renamed from: a */
    public final String mo42084a(Instant instant, Instant instant2) {
        if (this.f366157g) {
            Duration between = Duration.between(instant2, instant);
            LocalDate localDate = instant2.atZone(ZoneOffset.UTC).toLocalDate();
            LocalDate localDate2 = instant.atZone(ZoneOffset.UTC).toLocalDate();
            if (between.compareTo(f366156f) < 0) {
                return this.f366159i.getResources().getString(R.string.DUPLO_NOW_LABEL);
            }
            if (between.compareTo(f366155e) < 0) {
                return this.f366159i.getResources().getString(R.string.DUPLO_MINUTES_LABEL, new Object[]{Long.valueOf(between.toMinutes())});
            } else if (between.compareTo(f366154d) < 0) {
                return this.f366159i.getResources().getString(R.string.DUPLO_HOURS_LABEL, new Object[]{Long.valueOf(between.toHours())});
            } else if (between.compareTo(f366152b) < 0) {
                return this.f366159i.getResources().getString(R.string.DUPLO_DAYS_LABEL, new Object[]{Long.valueOf(ChronoUnit.DAYS.between(localDate, localDate2))});
            } else if (between.compareTo(f366153c) < 0) {
                return this.f366159i.getResources().getString(R.string.DUPLO_WEEKS_LABEL, new Object[]{Long.valueOf(ChronoUnit.WEEKS.between(localDate, localDate2))});
            } else if (between.compareTo(f366151a) < 0) {
                return this.f366159i.getResources().getString(R.string.DUPLO_MONTHS_LABEL, new Object[]{Long.valueOf(ChronoUnit.MONTHS.between(localDate, localDate2))});
            } else {
                return this.f366159i.getResources().getString(R.string.DUPLO_YEARS_LABEL, new Object[]{Long.valueOf(ChronoUnit.YEARS.between(localDate, localDate2))});
            }
        } else {
            return C134431a.m218149a(this.f366159i, Duration.between(instant2, instant));
        }
    }
}
