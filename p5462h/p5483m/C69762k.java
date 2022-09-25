package p5462h.p5483m;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.m.k */
/* compiled from: PG */
public final class C69762k implements Serializable {

    /* renamed from: a */
    public static final C69760i f186138a = new C69760i();

    /* renamed from: b */
    public final Pattern f186139b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C69762k(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5462h.p5483m.C69762k.<init>(java.lang.String):void");
    }

    public C69762k(Pattern pattern) {
        C69664n.m101061g(pattern, "nativePattern");
        this.f186139b = pattern;
    }

    private final Object writeReplace() {
        String pattern = this.f186139b.pattern();
        C69664n.m101060f(pattern, "nativePattern.pattern()");
        return new C69761j(pattern, this.f186139b.flags());
    }

    /* renamed from: a */
    public final List mo61433a(CharSequence charSequence, int i) {
        C69664n.m101061g(charSequence, "input");
        Matcher matcher = this.f186139b.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            return C69540x.m100944b(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(i > 0 ? i : 10);
        int i2 = i - 1;
        int i3 = 0;
        do {
            arrayList.add(charSequence.subSequence(i3, matcher.start()).toString());
            i3 = matcher.end();
            if ((i2 >= 0 && arrayList.size() == i2) || !matcher.find()) {
                arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i3, matcher.start()).toString());
            i3 = matcher.end();
            break;
        } while (!matcher.find());
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: b */
    public final boolean mo61434b(CharSequence charSequence) {
        C69664n.m101061g(charSequence, "input");
        return this.f186139b.matcher(charSequence).matches();
    }

    /* renamed from: c */
    public final C69759h mo61435c(CharSequence charSequence) {
        C69664n.m101061g(charSequence, "input");
        Matcher matcher = this.f186139b.matcher(charSequence);
        C69664n.m101060f(matcher, "nativePattern.matcher(input)");
        if (!matcher.matches()) {
            return null;
        }
        return new C69759h(matcher, charSequence);
    }

    /* renamed from: d */
    public final C69759h mo61436d(CharSequence charSequence) {
        C69664n.m101061g(charSequence, "input");
        Matcher matcher = this.f186139b.matcher(charSequence);
        C69664n.m101060f(matcher, "nativePattern.matcher(input)");
        if (!matcher.find(0)) {
            return null;
        }
        return new C69759h(matcher, charSequence);
    }

    public final String toString() {
        String pattern = this.f186139b.toString();
        C69664n.m101060f(pattern, "nativePattern.toString()");
        return pattern;
    }
}
