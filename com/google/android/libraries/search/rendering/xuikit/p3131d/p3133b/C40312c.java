package com.google.android.libraries.search.rendering.xuikit.p3131d.p3133b;

import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.protobuf.C62917ay;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.b.c */
/* compiled from: PG */
public final class C40312c {
    /* renamed from: a */
    public static final C40313d m69964a(String str, C21312s sVar) {
        C69664n.m101061g(sVar, "commandExtensionHandler");
        return new C40314e(str, sVar);
    }

    /* renamed from: b */
    public static final C40313d m69965b(String str, C62917ay ayVar, C69464a aVar) {
        C69664n.m101061g(ayVar, "extension");
        C69664n.m101061g(aVar, "commandExtensionHandlerProvider");
        return new C40316g(str, ayVar, aVar);
    }

    /* renamed from: c */
    public static final C40313d m69966c(String str, C62917ay ayVar, C40323n nVar, Executor executor) {
        C69664n.m101061g(ayVar, "extension");
        C69664n.m101061g(nVar, "commandHandler");
        C69664n.m101061g(executor, "executor");
        return new C40319j(str, ayVar, new C40311b(executor, nVar));
    }

    /* renamed from: d */
    public static final C40313d m69967d(String str, C62917ay ayVar, C69464a aVar) {
        C69664n.m101061g(ayVar, "extension");
        return new C40322m(str, ayVar, aVar);
    }
}
