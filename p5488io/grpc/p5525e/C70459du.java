package p5488io.grpc.p5525e;

import com.google.android.libraries.p10983ae.p10984a.C147476u;
import com.google.common.base.C58838bb;
import com.google.p3723ar.imp.view.C48004n;
import java.util.concurrent.TimeUnit;
import p5488io.grpc.C70291ct;

/* renamed from: io.grpc.e.du */
/* compiled from: PG */
final class C70459du implements C70291ct {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo61977a(String str) {
        C58838bb.m90869d(str.length() > 0, "empty timeout");
        C58838bb.m90869d(str.length() <= 9, "bad timeout format");
        long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
        char charAt = str.charAt(str.length() - 1);
        if (charAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(parseLong));
        }
        if (charAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(parseLong));
        }
        if (charAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(parseLong));
        }
        if (charAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(parseLong));
        }
        if (charAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(parseLong));
        }
        if (charAt == 'n') {
            return Long.valueOf(parseLong);
        }
        throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", new Object[]{Character.valueOf(charAt)}));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ String mo61978b(Object obj) {
        Long l = (Long) obj;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (l.longValue() < 0) {
            throw new IllegalArgumentException("Timeout too small");
        } else if (l.longValue() < 100000000) {
            new StringBuilder().append(l);
            return String.valueOf(l).concat(C48004n.f124238a);
        } else if (l.longValue() < 100000000000L) {
            return timeUnit.toMicros(l.longValue()) + C147476u.f398081a;
        } else if (l.longValue() < 100000000000000L) {
            return timeUnit.toMillis(l.longValue()) + "m";
        } else if (l.longValue() < 100000000000000000L) {
            return timeUnit.toSeconds(l.longValue()) + "S";
        } else if (l.longValue() < 6000000000000000000L) {
            return timeUnit.toMinutes(l.longValue()) + "M";
        } else {
            return timeUnit.toHours(l.longValue()) + "H";
        }
    }
}
