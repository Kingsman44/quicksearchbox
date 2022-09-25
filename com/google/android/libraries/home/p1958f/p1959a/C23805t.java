package com.google.android.libraries.home.p1958f.p1959a;

import java.util.regex.Pattern;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69663m;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69760i;

/* renamed from: com.google.android.libraries.home.f.a.t */
/* compiled from: PG */
final /* synthetic */ class C23805t extends C69663m implements C69626l {
    public C23805t(Object obj) {
        super(1, obj, C69760i.class, "escape", "escape(Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        String str = (String) obj;
        C69664n.m101061g(str, "p0");
        C69760i iVar = (C69760i) this.f186034c;
        C69664n.m101061g(str, "literal");
        String quote = Pattern.quote(str);
        C69664n.m101060f(quote, "quote(literal)");
        return quote;
    }
}
