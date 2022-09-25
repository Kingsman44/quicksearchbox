package p5462h.p5483m;

import java.io.Serializable;
import java.util.regex.Pattern;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.m.j */
/* compiled from: PG */
final class C69761j implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final String f186136a;

    /* renamed from: b */
    private final int f186137b;

    public C69761j(String str, int i) {
        C69664n.m101061g(str, "pattern");
        this.f186136a = str;
        this.f186137b = i;
    }

    private final Object readResolve() {
        Pattern compile = Pattern.compile(this.f186136a, this.f186137b);
        C69664n.m101060f(compile, "compile(pattern, flags)");
        return new C69762k(compile);
    }
}
