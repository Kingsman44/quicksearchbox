package p3186j$.time;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import p3186j$.time.temporal.C41022m;
import p3186j$.time.temporal.TemporalAccessor;
import p3186j$.time.zone.C41028c;
import p3186j$.time.zone.C41032g;
import p3186j$.util.Map;
import p3186j$.util.Objects;

/* renamed from: j$.time.ZoneId */
public abstract class ZoneId implements Serializable {

    /* renamed from: a */
    public static final Map f107266a = Map.CC.m71634a(Map.CC.entry("ACT", "Australia/Darwin"), Map.CC.entry("AET", "Australia/Sydney"), Map.CC.entry("AGT", "America/Argentina/Buenos_Aires"), Map.CC.entry("ART", "Africa/Cairo"), Map.CC.entry("AST", "America/Anchorage"), Map.CC.entry("BET", "America/Sao_Paulo"), Map.CC.entry("BST", "Asia/Dhaka"), Map.CC.entry("CAT", "Africa/Harare"), Map.CC.entry("CNT", "America/St_Johns"), Map.CC.entry("CST", "America/Chicago"), Map.CC.entry("CTT", "Asia/Shanghai"), Map.CC.entry("EAT", "Africa/Addis_Ababa"), Map.CC.entry("ECT", "Europe/Paris"), Map.CC.entry("IET", "America/Indiana/Indianapolis"), Map.CC.entry("IST", "Asia/Kolkata"), Map.CC.entry("JST", "Asia/Tokyo"), Map.CC.entry("MIT", "Pacific/Apia"), Map.CC.entry("NET", "Asia/Yerevan"), Map.CC.entry("NST", "Pacific/Auckland"), Map.CC.entry("PLT", "Asia/Karachi"), Map.CC.entry("PNT", "America/Phoenix"), Map.CC.entry("PRT", "America/Puerto_Rico"), Map.CC.entry("PST", "America/Los_Angeles"), Map.CC.entry("SST", "Pacific/Guadalcanal"), Map.CC.entry("VST", "Asia/Ho_Chi_Minh"), Map.CC.entry("EST", "-05:00"), Map.CC.entry("MST", "-07:00"), Map.CC.entry("HST", "-10:00"));

    ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != C41008m.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static Set<String> getAvailableZoneIds() {
        return new HashSet(C41032g.m71614a());
    }

    /* renamed from: m */
    public static ZoneId m71278m(TemporalAccessor temporalAccessor) {
        ZoneId zoneId = (ZoneId) temporalAccessor.mo43002l(C41022m.m71572f());
        if (zoneId != null) {
            return zoneId;
        }
        String valueOf = String.valueOf(temporalAccessor);
        String name = temporalAccessor.getClass().getName();
        throw new DateTimeException("Unable to obtain ZoneId from TemporalAccessor: " + valueOf + " of type " + name);
    }

    /* renamed from: o */
    public static ZoneId m71279o(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (str.equals("GMT") || str.equals("UTC") || str.equals("UT")) {
            if (zoneOffset.mo43201q() != 0) {
                str = str.concat(zoneOffset.getId());
            }
            return new C41008m(str, C41028c.m71605j(zoneOffset));
        }
        throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
    }

    /* renamed from: of */
    public static ZoneId m71280of(String str) {
        int i;
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.m71283r(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            i = 3;
        } else if (!str.startsWith("UT")) {
            return C41008m.m71485p(str);
        } else {
            i = 2;
        }
        String substring = str.substring(0, i);
        if (str.length() == i) {
            return m71279o(substring, ZoneOffset.UTC);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return C41008m.m71485p(str);
        }
        try {
            ZoneOffset r = ZoneOffset.m71283r(str.substring(i));
            ZoneOffset zoneOffset = ZoneOffset.UTC;
            return m71279o(substring, r);
        } catch (DateTimeException e) {
            throw new DateTimeException("Invalid ID for offset-based ZoneId: ".concat(str), e);
        }
    }

    public static ZoneId systemDefault() {
        String id = TimeZone.getDefault().getID();
        java.util.Map map = f107266a;
        Objects.requireNonNull(id, "zoneId");
        Objects.requireNonNull(map, "aliasMap");
        return m71280of((String) Objects.requireNonNullElse((String) map.get(id), id));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return getId().equals(((ZoneId) obj).getId());
        }
        return false;
    }

    public abstract String getId();

    public int hashCode() {
        return getId().hashCode();
    }

    /* renamed from: n */
    public abstract C41028c mo43198n();

    public String toString() {
        return getId();
    }
}
