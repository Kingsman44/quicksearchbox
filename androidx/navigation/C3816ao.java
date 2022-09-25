package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: androidx.navigation.ao */
/* compiled from: PG */
public final class C3816ao {
    @Deprecated

    /* renamed from: l */
    private static final Pattern f12324l = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: a */
    public final String f12325a;

    /* renamed from: b */
    public final String f12326b;

    /* renamed from: c */
    public final String f12327c;

    /* renamed from: d */
    public final List f12328d = new ArrayList();

    /* renamed from: e */
    public final Map f12329e = new LinkedHashMap();

    /* renamed from: f */
    public String f12330f;

    /* renamed from: g */
    public final C69613f f12331g = new C69747m(new C3815an(this));

    /* renamed from: h */
    public boolean f12332h;

    /* renamed from: i */
    public String f12333i;

    /* renamed from: j */
    public final C69613f f12334j = new C69747m(new C3814am(this));

    /* renamed from: k */
    public boolean f12335k;

    public C3816ao(String str, String str2, String str3) {
        String str4 = str;
        this.f12325a = str4;
        this.f12326b = str2;
        this.f12327c = str3;
        if (str4 != null) {
            Uri parse = Uri.parse(str);
            int i = 1;
            int i2 = 0;
            this.f12332h = parse.getQuery() != null;
            StringBuilder sb = new StringBuilder("^");
            if (!f12324l.matcher(str4).find()) {
                sb.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (this.f12332h) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str4);
                if (matcher.find()) {
                    String substring = str4.substring(0, matcher.start());
                    C69664n.m101060f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    C69664n.m101060f(compile, "fillInPattern");
                    this.f12335k = m11031b(substring, sb, compile);
                }
                Iterator<String> it = parse.getQueryParameterNames().iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(next);
                    if (queryParameter != null) {
                        Matcher matcher2 = compile.matcher(queryParameter);
                        C3813al alVar = new C3813al();
                        while (matcher2.find()) {
                            Iterator<String> it2 = it;
                            String group = matcher2.group(i);
                            if (group != null) {
                                alVar.f12321b.add(group);
                                String substring2 = queryParameter.substring(i2, matcher2.start());
                                C69664n.m101060f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                sb2.append(Pattern.quote(substring2));
                                sb2.append("(.+?)?");
                                i2 = matcher2.end();
                                it = it2;
                                i = 1;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        }
                        Iterator<String> it3 = it;
                        if (i2 < queryParameter.length()) {
                            String substring3 = queryParameter.substring(i2);
                            C69664n.m101060f(substring3, "this as java.lang.String).substring(startIndex)");
                            sb2.append(Pattern.quote(substring3));
                        }
                        alVar.f12320a = C69764m.m101231j(sb2.toString(), ".*", "\\E.*\\Q");
                        Map map = this.f12329e;
                        C69664n.m101060f(next, "paramName");
                        map.put(next, alVar);
                        it = it3;
                        i = 1;
                        i2 = 0;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
            } else {
                C69664n.m101060f(compile, "fillInPattern");
                this.f12335k = m11031b(str4, sb, compile);
            }
            this.f12330f = C69764m.m101231j(sb.toString(), ".*", "\\E.*\\Q");
        }
        if (this.f12327c == null) {
            return;
        }
        if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f12327c).matches()) {
            C3812ak akVar = new C3812ak(this.f12327c);
            this.f12333i = C69764m.m101231j("^(" + akVar.f12318a + "|[*]+)/(" + akVar.f12319b + "|[*]+)$", "*|[*]", "[\\s\\S]");
            return;
        }
        throw new IllegalArgumentException("The given mimeType " + this.f12327c + " does not match to required \"type/subtype\" format");
    }

    /* renamed from: b */
    private final boolean m11031b(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !C69764m.m101205y(str, ".*", false);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group != null) {
                this.f12328d.add(group);
                String substring = str.substring(i, matcher.start());
                C69664n.m101060f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(Pattern.quote(substring));
                sb.append("([^/]+?)");
                i = matcher.end();
                z = false;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        if (i < str.length()) {
            String substring2 = str.substring(i);
            C69664n.m101060f(substring2, "this as java.lang.String).substring(startIndex)");
            sb.append(Pattern.quote(substring2));
        }
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        return z;
    }

    /* renamed from: a */
    public final boolean mo8071a(Bundle bundle, String str, String str2, C3886g gVar) {
        if (gVar != null) {
            C3860ca caVar = gVar.f12469a;
            try {
                C69664n.m101061g(str, "key");
                C69664n.m101061g(str2, "value");
                caVar.mo8105c(bundle, str, caVar.mo8103a(str2));
                return false;
            } catch (IllegalArgumentException unused) {
                return true;
            }
        } else {
            bundle.putString(str, str2);
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C3816ao)) {
            C3816ao aoVar = (C3816ao) obj;
            if (!C69664n.m101066l(this.f12325a, aoVar.f12325a) || !C69664n.m101066l(this.f12326b, aoVar.f12326b) || !C69664n.m101066l(this.f12327c, aoVar.f12327c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f12325a;
        int i3 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i4 = i * 31;
        String str2 = this.f12326b;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f12327c;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }
}
