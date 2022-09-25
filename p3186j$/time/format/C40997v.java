package p3186j$.time.format;

import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Set;
import p3186j$.time.DateTimeException;
import p3186j$.time.ZoneId;
import p3186j$.time.ZoneOffset;
import p3186j$.time.temporal.C41023n;
import p3186j$.time.temporal.ChronoField;
import p3186j$.time.zone.C41032g;

/* renamed from: j$.time.format.v */
class C40997v implements C40982g {

    /* renamed from: c */
    private static volatile AbstractMap.SimpleImmutableEntry f107381c;

    /* renamed from: d */
    private static volatile AbstractMap.SimpleImmutableEntry f107382d;

    /* renamed from: a */
    private final C41023n f107383a;

    /* renamed from: b */
    private final String f107384b;

    C40997v(C41023n nVar, String str) {
        this.f107383a = nVar;
        this.f107384b = str;
    }

    /* renamed from: c */
    private static int m71449c(C40999x xVar, CharSequence charSequence, int i, int i2, C40988m mVar) {
        String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
        if (i2 < charSequence.length() && charSequence.charAt(i2) != '0' && !xVar.mo43320b(charSequence.charAt(i2), 'Z')) {
            C40999x d = xVar.mo43321d();
            int d2 = mVar.mo43295d(d, charSequence, i2);
            if (d2 < 0) {
                try {
                    if (mVar == C40988m.f107353e) {
                        return i ^ -1;
                    }
                    xVar.mo43330n(ZoneId.m71280of(upperCase));
                    return i2;
                } catch (DateTimeException unused) {
                    return i ^ -1;
                }
            } else {
                xVar.mo43330n(ZoneId.m71279o(upperCase, ZoneOffset.m71285t((int) d.mo43326j(ChronoField.OFFSET_SECONDS).longValue())));
                return d2;
            }
        } else {
            xVar.mo43330n(ZoneId.m71280of(upperCase));
            return i2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C40991p mo43317a(C40999x xVar) {
        Set a = C41032g.m71614a();
        int size = a.size();
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = xVar.mo43327k() ? f107381c : f107382d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = xVar.mo43327k() ? f107381c : f107382d;
                    if (simpleImmutableEntry2 == null || ((Integer) simpleImmutableEntry2.getKey()).intValue() != size) {
                        simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), C40991p.m71429g(a, xVar));
                        if (xVar.mo43327k()) {
                            f107381c = simpleImmutableEntry2;
                        } else {
                            f107382d = simpleImmutableEntry2;
                        }
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
        return (C40991p) simpleImmutableEntry.getValue();
    }

    /* renamed from: b */
    public boolean mo43294b(C41001z zVar, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) zVar.mo43344f(this.f107383a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.getId());
        return true;
    }

    /* renamed from: d */
    public final int mo43295d(C40999x xVar, CharSequence charSequence, int i) {
        int i2;
        int length = charSequence.length();
        if (i > length) {
            throw new IndexOutOfBoundsException();
        } else if (i == length) {
            return i ^ -1;
        } else {
            char charAt = charSequence.charAt(i);
            if (charAt == '+' || charAt == '-') {
                return m71449c(xVar, charSequence, i, i, C40988m.f107353e);
            }
            int i3 = i + 2;
            if (length >= i3) {
                char charAt2 = charSequence.charAt(i + 1);
                if (xVar.mo43320b(charAt, 'U') && xVar.mo43320b(charAt2, 'T')) {
                    int i4 = i + 3;
                    return (length < i4 || !xVar.mo43320b(charSequence.charAt(i3), 'C')) ? m71449c(xVar, charSequence, i, i3, C40988m.f107354f) : m71449c(xVar, charSequence, i, i4, C40988m.f107354f);
                } else if (xVar.mo43320b(charAt, 'G') && length >= (i2 = i + 3) && xVar.mo43320b(charAt2, 'M') && xVar.mo43320b(charSequence.charAt(i3), 'T')) {
                    int i5 = i + 4;
                    if (length < i5 || !xVar.mo43320b(charSequence.charAt(i2), '0')) {
                        return m71449c(xVar, charSequence, i, i2, C40988m.f107354f);
                    }
                    xVar.mo43330n(ZoneId.m71280of("GMT0"));
                    return i5;
                }
            }
            C40991p a = mo43317a(xVar);
            ParsePosition parsePosition = new ParsePosition(i);
            String d = a.mo43314d(charSequence, parsePosition);
            if (d != null) {
                xVar.mo43330n(ZoneId.m71280of(d));
                return parsePosition.getIndex();
            } else if (!xVar.mo43320b(charAt, 'Z')) {
                return i ^ -1;
            } else {
                xVar.mo43330n(ZoneOffset.UTC);
                return i + 1;
            }
        }
    }

    public final String toString() {
        return this.f107384b;
    }
}
