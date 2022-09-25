package p3186j$.time;

import p3186j$.time.zone.C41028c;
import p3186j$.time.zone.C41029d;
import p3186j$.time.zone.C41032g;
import p3186j$.util.Objects;

/* renamed from: j$.time.m */
final class C41008m extends ZoneId {

    /* renamed from: b */
    private final String f107410b;

    /* renamed from: c */
    private final transient C41028c f107411c;

    C41008m(String str, C41028c cVar) {
        this.f107410b = str;
        this.f107411c = cVar;
    }

    /* renamed from: p */
    static C41008m m71485p(String str) {
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i == 0) && ((charAt < '0' || charAt > '9' || i == 0) && ((charAt != '~' || i == 0) && ((charAt != '.' || i == 0) && ((charAt != '_' || i == 0) && ((charAt != '+' || i == 0) && (charAt != '-' || i == 0))))))))) {
                    throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                return new C41008m(str, C41032g.m71615b(str, true));
            } catch (C41029d e) {
                throw e;
            }
        } else {
            throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
        }
    }

    public final String getId() {
        return this.f107410b;
    }

    /* renamed from: n */
    public final C41028c mo43198n() {
        C41028c cVar = this.f107411c;
        return cVar != null ? cVar : C41032g.m71615b(this.f107410b, false);
    }
}
