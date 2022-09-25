package com.google.android.libraries.search.assistant.p2517f.p2532b.p2534b;

import android.content.Context;
import com.google.android.libraries.p11012aj.C147596b;
import java.util.Locale;
import p5462h.C69692j;
import p5462h.C69714l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.libraries.search.assistant.f.b.b.g */
/* compiled from: PG */
public final class C32924g {

    /* renamed from: a */
    public final C32923f f88248a;

    public C32924g(Context context) {
        String str;
        Object obj;
        C69664n.m101061g(context, "context");
        String b = C147596b.m240671b();
        if (b != null) {
            int B = C69764m.m101185B(b, ':', 0, 6);
            if (B >= 0) {
                str = b.substring(B + 1);
                C69664n.m101060f(str, "this as java.lang.String).substring(startIndex)");
            } else {
                str = "main";
            }
            try {
                String upperCase = str.toUpperCase(Locale.ROOT);
                C69664n.m101060f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                obj = C32923f.m60929a(upperCase);
            } catch (Throwable th) {
                obj = C69714l.m101133a(th);
            }
            this.f88248a = (C32923f) (true == (obj instanceof C69692j) ? C32923f.OTHER : obj);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
