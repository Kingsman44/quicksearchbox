package com.google.android.apps.gsa.nga.engine.p6246w;

import android.content.res.Resources;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6311ah.C80631b;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52395qd;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.assistant.p3897e.p3921j.C52405qn;
import com.google.assistant.p3897e.p3921j.C52406qo;
import com.google.assistant.p3897e.p3921j.C52407qp;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58506ho;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import p3186j$.time.DateTimeException;
import p3186j$.time.DayOfWeek;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.time.LocalDate;
import p3186j$.time.LocalTime;
import p3186j$.time.ZoneId;
import p3186j$.time.ZonedDateTime;
import p3186j$.time.format.DateTimeFormatter;
import p3186j$.time.format.DateTimeFormatterBuilder;
import p3186j$.time.temporal.ChronoUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.nga.engine.w.e */
/* compiled from: PG */
public final class C79402e {

    /* renamed from: a */
    public static final DateTimeFormatter f218035a = new DateTimeFormatterBuilder().appendOptional(DateTimeFormatter.ISO_LOCAL_DATE_TIME).optionalStart().appendOffset("+HH:MM", "+00:00").optionalEnd().optionalStart().appendOffset("+HHMM", "+0000").optionalEnd().optionalStart().appendOffset("+HH", "Z").optionalEnd().toFormatter();

    /* renamed from: e */
    private static final C58974d f218036e = C58974d.m91136j();

    /* renamed from: b */
    public final C60950i f218037b;

    /* renamed from: c */
    public final C69464a f218038c;

    /* renamed from: d */
    public final C81515c f218039d;

    static {
        C58490gz gzVar = new C58490gz(4);
        C58506ho hoVar = new C58506ho();
        hoVar.mo55458l(new C58759qy(DayOfWeek.FRIDAY), Arrays.asList(new String[]{"DJ", "IR"}));
        hoVar.mo55458l(new C58759qy(DayOfWeek.SUNDAY), Arrays.asList(new String[]{"GQ", "IN", "TH", "UG"}));
        hoVar.mo55458l(C58528ij.m90011K(DayOfWeek.THURSDAY, DayOfWeek.FRIDAY), Arrays.asList(new String[]{"AF"}));
        hoVar.mo55458l(C58528ij.m90011K(DayOfWeek.FRIDAY, DayOfWeek.SUNDAY), Arrays.asList(new String[]{"BN"}));
        hoVar.mo55458l(C58528ij.m90011K(DayOfWeek.FRIDAY, DayOfWeek.SATURDAY), C58528ij.m90015O("AE", "DZ", "BH", "BD", "EG", "IQ", "IL", "JO", "KW", "LY"));
        hoVar.mo55458l(C58528ij.m90011K(DayOfWeek.FRIDAY, DayOfWeek.SATURDAY), C58528ij.m90015O("MV", "MR", "OM", "PS", "QA", "SA", "SD", "SY", "YE"));
        gzVar.mo55432k(hoVar.mo55453g().mo55425f().mo54948A());
        gzVar.mo55427f(false);
    }

    public C79402e(C81515c cVar, C60950i iVar, C69464a aVar) {
        this.f218039d = cVar;
        this.f218037b = iVar;
        this.f218038c = aVar;
    }

    /* renamed from: a */
    public static int m127434a(DayOfWeek dayOfWeek) {
        return dayOfWeek.getValue() % 7;
    }

    /* renamed from: b */
    public static C52407qp m127435b(Instant instant) {
        C52406qo qoVar = (C52406qo) C52407qp.f137523d.createBuilder();
        long epochSecond = instant.getEpochSecond();
        qoVar.copyOnWrite();
        C52407qp qpVar = (C52407qp) qoVar.instance;
        qpVar.f137525a |= 1;
        qpVar.f137526b = epochSecond;
        int nano = instant.getNano();
        qoVar.copyOnWrite();
        C52407qp qpVar2 = (C52407qp) qoVar.instance;
        qpVar2.f137525a |= 2;
        qpVar2.f137527c = nano;
        return (C52407qp) qoVar.build();
    }

    /* renamed from: c */
    public static DayOfWeek m127436c(int i) {
        if (i <= 0) {
            i = 7;
        }
        return DayOfWeek.m71130of(i);
    }

    /* renamed from: d */
    public static Instant m127437d(C52407qp qpVar) {
        return Instant.ofEpochSecond(qpVar.f137526b, (long) qpVar.f137527c);
    }

    /* renamed from: e */
    public static LocalDate m127438e(C52395qd qdVar) {
        C52393qb qbVar = qdVar.f137488b;
        if (qbVar == null) {
            qbVar = C52393qb.f137479e;
        }
        return LocalDate.m71157of(qbVar.f137482b, qbVar.f137483c, qbVar.f137484d);
    }

    /* renamed from: i */
    private final ZoneId m127439i(C52395qd qdVar) {
        try {
            if ((qdVar.f137487a & 4) != 0) {
                C52405qn qnVar = qdVar.f137490d;
                if (qnVar == null) {
                    qnVar = C52405qn.f137519c;
                }
                return ZoneId.m71280of(qnVar.f137522b);
            }
        } catch (DateTimeException e) {
            ((C58970a) ((C58970a) ((C58970a) f218036e.mo56226d()).mo56382g(e)).mo56372aa(3978)).mo56386p("Extracting the timezone from the zone-id failed, falling back to local time zone.");
        }
        C80631b bVar = (C80631b) this.f218038c.mo17428b();
        return ZoneId.systemDefault();
    }

    /* renamed from: f */
    public final ZonedDateTime mo74014f(C52395qd qdVar) {
        C52403ql qlVar = qdVar.f137489c;
        if (qlVar == null) {
            qlVar = C52403ql.f137512f;
        }
        return ZonedDateTime.m71296of(m127438e(qdVar), LocalTime.m71212of(qlVar.f137515b, qlVar.f137516c, qlVar.f137517d), m127439i(qdVar));
    }

    /* renamed from: g */
    public final ZonedDateTime mo74015g() {
        Instant a = this.f218037b.mo57444a();
        C80631b bVar = (C80631b) this.f218038c.mo17428b();
        return a.atZone(ZoneId.systemDefault());
    }

    /* renamed from: h */
    public final String mo74016h(Locale locale, Duration duration, ChronoUnit chronoUnit) {
        Locale locale2 = locale;
        Duration duration2 = duration;
        ChronoUnit chronoUnit2 = chronoUnit;
        if (chronoUnit.getDuration().compareTo(Duration.ofSeconds(1)) < 0 || chronoUnit.getDuration().compareTo(Duration.ofDays(1)) > 0) {
            throw new IllegalArgumentException("minGranularity needs to be at least seconds and at most days");
        }
        Resources resources = this.f218039d.mo75121a(locale2).getResources();
        String[] stringArray = resources.getStringArray(R.array.nga_productivity_duration_description);
        long between = chronoUnit2.between(Instant.EPOCH, Instant.EPOCH.plus(duration2));
        if (between < 1) {
            return String.format(stringArray[0], new Object[]{mo74016h(locale2, Duration.m71141of(1, chronoUnit2), chronoUnit2)});
        }
        Duration of = Duration.m71141of(between, chronoUnit2);
        if (!duration2.minus(of).isZero()) {
            of = of.plus(1, chronoUnit2);
        }
        int days = (int) of.toDays();
        long j = (long) days;
        Duration minusDays = of.minusDays(j);
        int hours = (int) minusDays.toHours();
        long j2 = (long) hours;
        Duration minusHours = minusDays.minusHours(j2);
        int minutes = (int) minusHours.toMinutes();
        long j3 = (long) minutes;
        int seconds = (int) minusHours.minusMinutes(j3).getSeconds();
        int i = days > 0 ? 1 : 0;
        int i2 = hours > 0 ? 1 : 0;
        return String.format(stringArray[i | ((seconds > 0 ? 1 : 0) << 3) | ((minutes > 0 ? 1 : 0) << 2) | (i2 + i2)], new Object[]{BuildConfig.FLAVOR, resources.getQuantityString(R.plurals.nga_productivity_days, days, new Object[]{NumberFormat.getInstance().format(j)}), resources.getQuantityString(R.plurals.nga_productivity_hours, hours, new Object[]{NumberFormat.getInstance().format(j2)}), resources.getQuantityString(R.plurals.nga_productivity_minutes, minutes, new Object[]{NumberFormat.getInstance().format(j3)}), resources.getQuantityString(R.plurals.nga_productivity_seconds, seconds, new Object[]{NumberFormat.getInstance().format((long) seconds)})});
    }
}
