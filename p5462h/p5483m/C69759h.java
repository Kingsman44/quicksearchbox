package p5462h.p5483m;

import java.util.List;
import java.util.regex.Matcher;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.m.h */
/* compiled from: PG */
public final class C69759h {

    /* renamed from: a */
    public final Matcher f186134a;

    /* renamed from: b */
    private List f186135b;

    public C69759h(Matcher matcher, CharSequence charSequence) {
        C69664n.m101061g(matcher, "matcher");
        C69664n.m101061g(charSequence, "input");
        this.f186134a = matcher;
    }

    /* renamed from: a */
    public final List mo61432a() {
        if (this.f186135b == null) {
            this.f186135b = new C69758g(this);
        }
        List list = this.f186135b;
        C69664n.m101058d(list);
        return list;
    }
}
