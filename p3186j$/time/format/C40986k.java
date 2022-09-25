package p3186j$.time.format;

import com.evernote.android.state.BuildConfig;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p3186j$.time.chrono.C40959b;
import p3186j$.time.chrono.C40961d;
import p3186j$.util.Objects;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.format.k */
final class C40986k implements C40982g {

    /* renamed from: c */
    private static final ConcurrentHashMap f107343c = new ConcurrentHashMap(16, 0.75f, 2);

    /* renamed from: a */
    private final FormatStyle f107344a = null;

    /* renamed from: b */
    private final FormatStyle f107345b;

    C40986k(FormatStyle formatStyle) {
        this.f107345b = formatStyle;
    }

    /* renamed from: a */
    private DateTimeFormatter m71404a(Locale locale, C40961d dVar) {
        DateFormat dateFormat;
        boolean z;
        dVar.getClass();
        String locale2 = locale.toString();
        FormatStyle formatStyle = this.f107344a;
        String valueOf = String.valueOf(formatStyle);
        FormatStyle formatStyle2 = this.f107345b;
        String str = "ISO|" + locale2 + "|" + valueOf + String.valueOf(formatStyle2);
        ConcurrentHashMap concurrentHashMap = f107343c;
        DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) concurrentHashMap.get(str);
        if (dateTimeFormatter != null) {
            return dateTimeFormatter;
        }
        int i = DateTimeFormatterBuilder.f107315j;
        Objects.requireNonNull(locale, "locale");
        Objects.requireNonNull(dVar, "chrono");
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
        }
        if (formatStyle2 == null) {
            dateFormat = DateFormat.getDateInstance(formatStyle.ordinal(), locale);
        } else if (formatStyle == null) {
            dateFormat = DateFormat.getTimeInstance(formatStyle2.ordinal(), locale);
        } else {
            dateFormat = DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale);
        }
        if (dateFormat instanceof SimpleDateFormat) {
            String pattern = ((SimpleDateFormat) dateFormat).toPattern();
            if (pattern == null) {
                pattern = null;
            } else {
                int i2 = 0;
                boolean z2 = true;
                if (pattern.indexOf(66) != -1) {
                    z = true;
                } else {
                    z = false;
                }
                if (pattern.indexOf(98) == -1) {
                    z2 = false;
                }
                if (z || z2) {
                    StringBuilder sb = new StringBuilder(pattern.length());
                    char c = ' ';
                    while (i2 < pattern.length()) {
                        char charAt = pattern.charAt(i2);
                        if (charAt == ' ' ? i2 == 0 || !(c == 'B' || c == 'b') : !(charAt == 'B' || charAt == 'b')) {
                            sb.append(charAt);
                        }
                        i2++;
                        c = charAt;
                    }
                    int length = sb.length() - 1;
                    if (length >= 0 && sb.charAt(length) == ' ') {
                        sb.deleteCharAt(length);
                    }
                    pattern = sb.toString();
                }
            }
            DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendPattern(pattern).toFormatter(locale);
            DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) concurrentHashMap.putIfAbsent(str, formatter);
            if (dateTimeFormatter2 != null) {
                return dateTimeFormatter2;
            }
            return formatter;
        }
        throw new UnsupportedOperationException("Can't determine pattern from ".concat(String.valueOf(dateFormat)));
    }

    /* renamed from: b */
    public final boolean mo43294b(C41001z zVar, StringBuilder sb) {
        m71404a(zVar.mo43341c(), C40959b.m71322b(zVar.mo43342d())).mo43264h(false).mo43294b(zVar, sb);
        return true;
    }

    /* renamed from: d */
    public final int mo43295d(C40999x xVar, CharSequence charSequence, int i) {
        return m71404a(xVar.mo43325i(), xVar.mo43324h()).mo43264h(false).mo43295d(xVar, charSequence, i);
    }

    public final String toString() {
        Object obj = BuildConfig.FLAVOR;
        Object obj2 = this.f107344a;
        if (obj2 == null) {
            obj2 = obj;
        }
        String valueOf = String.valueOf(obj2);
        Object obj3 = this.f107345b;
        if (obj3 != null) {
            obj = obj3;
        }
        String valueOf2 = String.valueOf(obj);
        return "Localized(" + valueOf + "," + valueOf2 + ")";
    }
}
