package p3186j$.time.format;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import p3186j$.time.ZoneId;
import p3186j$.time.chrono.C40961d;
import p3186j$.time.chrono.C40963f;
import p3186j$.time.temporal.ChronoField;
import p3186j$.time.temporal.TemporalAccessor;
import p3186j$.time.temporal.TemporalField;
import p3186j$.util.Objects;

/* renamed from: j$.time.format.x */
final class C40999x {

    /* renamed from: a */
    private DateTimeFormatter f107390a;

    /* renamed from: b */
    private boolean f107391b = true;

    /* renamed from: c */
    private boolean f107392c = true;

    /* renamed from: d */
    private final ArrayList f107393d;

    /* renamed from: e */
    private ArrayList f107394e;

    C40999x(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f107393d = arrayList;
        this.f107394e = null;
        this.f107390a = dateTimeFormatter;
        arrayList.add(new C40971D());
    }

    /* renamed from: c */
    static boolean m71455c(char c, char c2) {
        return c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    /* renamed from: e */
    private C40971D m71456e() {
        ArrayList arrayList = this.f107393d;
        return (C40971D) arrayList.get(arrayList.size() - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43319a(C40992q qVar) {
        if (this.f107394e == null) {
            this.f107394e = new ArrayList();
        }
        this.f107394e.add(qVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo43320b(char c, char c2) {
        if (!this.f107391b) {
            return m71455c(c, c2);
        }
        if (c == c2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C40999x mo43321d() {
        C40999x xVar = new C40999x(this.f107390a);
        xVar.f107391b = this.f107391b;
        xVar.f107392c = this.f107392c;
        return xVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo43322f(boolean z) {
        ArrayList arrayList = this.f107393d;
        arrayList.remove(z ? arrayList.size() - 2 : arrayList.size() - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C40970C mo43323g() {
        return this.f107390a.mo43259c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C40961d mo43324h() {
        C40961d dVar = m71456e().f107298c;
        if (dVar != null) {
            return dVar;
        }
        C40961d b = this.f107390a.mo43258b();
        return b == null ? C40963f.f107281a : b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Locale mo43325i() {
        return this.f107390a.mo43260d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final Long mo43326j(ChronoField chronoField) {
        return (Long) m71456e().f107296a.get(chronoField);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo43327k() {
        return this.f107391b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo43328l() {
        return this.f107392c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo43329m(boolean z) {
        this.f107391b = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo43330n(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        m71456e().f107297b = zoneId;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final int mo43331o(TemporalField temporalField, long j, int i, int i2) {
        Objects.requireNonNull(temporalField, "field");
        Long l = (Long) m71456e().f107296a.put(temporalField, Long.valueOf(j));
        return (l == null || l.longValue() == j) ? i2 : i ^ -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo43332p() {
        m71456e().getClass();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo43333q(boolean z) {
        this.f107392c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo43334r() {
        ArrayList arrayList = this.f107393d;
        C40971D e = m71456e();
        e.getClass();
        C40971D d = new C40971D();
        d.f107296a.putAll(e.f107296a);
        d.f107297b = e.f107297b;
        d.f107298c = e.f107298c;
        arrayList.add(d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean mo43335s(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 > charSequence.length() || i2 + i3 > charSequence2.length()) {
            return false;
        }
        if (this.f107391b) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (charSequence.charAt(i + i4) != charSequence2.charAt(i2 + i4)) {
                    return false;
                }
            }
            return true;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            char charAt = charSequence.charAt(i + i5);
            char charAt2 = charSequence2.charAt(i2 + i5);
            if (charAt != charAt2 && Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final TemporalAccessor mo43336t(C40972E e, Set set) {
        C40971D e2 = m71456e();
        e2.f107298c = mo43324h();
        ZoneId zoneId = e2.f107297b;
        if (zoneId == null) {
            zoneId = this.f107390a.mo43261e();
        }
        e2.f107297b = zoneId;
        e2.mo43256m(e, set);
        return e2;
    }

    public final String toString() {
        return m71456e().toString();
    }
}
