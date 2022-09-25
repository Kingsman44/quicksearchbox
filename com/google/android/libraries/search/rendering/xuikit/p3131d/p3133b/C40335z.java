package com.google.android.libraries.search.rendering.xuikit.p3131d.p3133b;

import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21269bl;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q;
import java.util.Map;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.b.z */
/* compiled from: PG */
public final class C40335z {

    /* renamed from: a */
    public final C69464a f105939a;

    /* renamed from: b */
    public final C69464a f105940b;

    /* renamed from: c */
    public final C69464a f105941c;

    /* renamed from: d */
    private final C69464a f105942d;

    /* renamed from: e */
    private final C69464a f105943e;

    /* renamed from: f */
    private final C69464a f105944f;

    /* renamed from: g */
    private final C69464a f105945g;

    /* renamed from: h */
    private final C69464a f105946h;

    public C40335z(C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6, C69464a aVar7, C69464a aVar8) {
        C69664n.m101061g(aVar, "dataStoreProvider");
        C69664n.m101061g(aVar2, "commandExtensionResolverProvider");
        C69664n.m101061g(aVar3, "propertiesConverterFlatProvider");
        C69664n.m101061g(aVar4, "typefaceProviderProvider");
        C69664n.m101061g(aVar5, "elementsErrorLoggerProvider");
        C69664n.m101061g(aVar6, "drawableRequesterFactoryProvider");
        C69664n.m101061g(aVar7, "styleRunExtensionConvertersProvider");
        C69664n.m101061g(aVar8, "XUiKitComponentRegistriesProvider");
        this.f105942d = aVar;
        this.f105943e = aVar2;
        this.f105944f = aVar3;
        this.f105939a = aVar4;
        this.f105945g = aVar5;
        this.f105940b = aVar6;
        this.f105941c = aVar7;
        this.f105946h = aVar8;
    }

    /* renamed from: a */
    public final C21313t mo42396a() {
        Object b = this.f105943e.mo17428b();
        C69664n.m101060f(b, "commandExtensionResolverProvider.get()");
        return (C21313t) b;
    }

    /* renamed from: b */
    public final C21232ab mo42397b() {
        Object b = this.f105942d.mo17428b();
        C69664n.m101060f(b, "dataStoreProvider.get()");
        return (C21232ab) b;
    }

    /* renamed from: c */
    public final C21259bb mo42398c() {
        Object b = this.f105945g.mo17428b();
        C69664n.m101060f(b, "elementsErrorLoggerProvider.get()");
        return (C21259bb) b;
    }

    /* renamed from: d */
    public final C21269bl mo42399d() {
        Object b = this.f105944f.mo17428b();
        C69664n.m101060f(b, "propertiesConverterFlatProvider.get()");
        return (C21269bl) b;
    }

    /* renamed from: e */
    public final C40327r mo42400e(Class cls) {
        C40327r rVar;
        C40325p pVar = (C40325p) this.f105946h.mo17428b();
        synchronized (pVar.f105928b) {
            Map map = pVar.f105928b;
            Object obj = map.get(cls);
            if (obj == null) {
                C40364q qVar = (C40364q) pVar.f105927a.f105933a.mo17428b();
                qVar.getClass();
                obj = new C40327r(qVar);
                map.put(cls, obj);
            }
            rVar = (C40327r) obj;
        }
        return rVar;
    }
}
