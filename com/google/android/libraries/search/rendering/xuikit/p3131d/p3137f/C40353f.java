package com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f;

import android.content.Context;
import com.google.android.libraries.elements.p1729h.C21198aa;
import com.google.android.libraries.elements.p1729h.C21199ab;
import com.google.android.libraries.elements.p1729h.C21200ac;
import com.google.android.libraries.elements.p1729h.C21203af;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.f.f */
/* compiled from: PG */
public final class C40353f implements C21203af {

    /* renamed from: b */
    public static final C59071e f105984b = C59071e.m91331h();

    /* renamed from: c */
    private static final Map f105985c = C69505av.m100867i(new C69685i(C21199ab.COMPONENT_MATERIALIZATION.f59483m, C40352e.COMPONENT_MATERIALIZATION_COUNTER), new C69685i(C21199ab.TEMPLATE_FETCHING.f59483m, C40352e.TEMPLATE_FETCHING_COUNTER), new C69685i(C21199ab.TEMPLATE_RESOLUTION.f59483m, C40352e.TEMPLATE_RESOLUTION_COUNTER), new C69685i(C21199ab.PB_TO_FB.f59483m, C40352e.PB_TO_FB_COUNTER), new C69685i(C21199ab.FIRST_ROOT_PREPARATION.f59483m, C40352e.FIRST_ROOT_PREPARATION_COUNTER), new C69685i(C21199ab.FIRST_ROOT_MATERIALIZATION.f59483m, C40352e.FIRST_ROOT_MATERIALIZATION_COUNTER), new C69685i(C21199ab.FIRST_ROOT_MEASUREMENT.f59483m, C40352e.FIRST_ROOT_MEASUREMENT_COUNTER), new C69685i(C21199ab.ROOT_MOUNTING.f59483m, C40352e.ROOT_MOUNTING_COUNTER), new C69685i(C21199ab.COMMAND_EXECUTION.f59483m, C40352e.COMMAND_EXECUTION_COUNTER));

    /* renamed from: d */
    private static final Map f105986d = C69505av.m100867i(new C69685i("yoga", C40352e.NATIVE_LIBRARY_CHECK_YOGA_COUNTER), new C69685i("elements", C40352e.NATIVE_LIBRARY_CHECK_ELEMENTS_COUNTER));

    /* renamed from: e */
    private static final Map f105987e = C69505av.m100867i(new C69685i("yoga", C40352e.NATIVE_LIBRARY_LOAD_YOGA_COUNTER), new C69685i("elements", C40352e.NATIVE_LIBRARY_LOAD_ELEMENTS_COUNTER));

    /* renamed from: f */
    private final C40358k f105988f;

    /* renamed from: g */
    private final C21203af f105989g;

    /* renamed from: h */
    private final Context f105990h;

    public C40353f(C40358k kVar, C21203af afVar, Context context) {
        C69664n.m101061g(afVar, "delegate");
        C69664n.m101061g(context, "context");
        this.f105988f = kVar;
        this.f105989g = afVar;
        this.f105990h = context;
    }

    /* renamed from: f */
    private final void m70011f(C21200ac acVar) {
        Long l;
        C40352e eVar = (C40352e) f105985c.get(acVar.mo26237f());
        if (eVar == null) {
            C21198aa a = acVar.mo26232a();
            String j = a != null ? a.mo26231j() : null;
            String f = acVar.mo26237f();
            if (C69664n.m101066l(f, C21199ab.NATIVE_LIBRARY_CHECK.f59483m)) {
                eVar = (C40352e) f105986d.get(j);
            } else {
                eVar = C69664n.m101066l(f, C21199ab.NATIVE_LIBRARY_LOAD.f59483m) ? (C40352e) f105987e.get(j) : null;
            }
        }
        if (eVar != null) {
            C40358k kVar = this.f105988f;
            Long e = acVar.mo26236e();
            Long c = acVar.mo26234c();
            if (e == null || c == null) {
                l = acVar.mo26235d();
            } else {
                l = Long.valueOf(c.longValue() - e.longValue());
            }
            C69664n.m101061g(this.f105990h, "context");
            if (l != null) {
                kVar.mo42418e(eVar.f105983n, l.longValue());
                return;
            }
            C59052c cVar = (C59052c) f105984b.mo56226d();
            cVar.mo56374ac(1, TimeUnit.MINUTES);
            String str = eVar.f105983n;
            cVar.mo56379ah(new C59094n(53328));
            cVar.mo56389s("Null duration for counter %s", str);
            return;
        }
        C59052c cVar2 = (C59052c) f105984b.mo56226d();
        cVar2.mo56374ac(1, TimeUnit.MINUTES);
        cVar2.mo56379ah(new C59094n(53329));
        cVar2.mo56389s("No counter name for %s", acVar);
    }

    /* renamed from: a */
    public final int mo26242a() {
        return this.f105989g.mo26242a();
    }

    /* renamed from: b */
    public final String mo26243b() {
        return this.f105989g.mo26243b();
    }

    /* renamed from: c */
    public final void mo26244c(String str) {
        this.f105989g.mo26244c(str);
    }

    /* renamed from: d */
    public final void mo26245d(String str, int i, C21200ac acVar) {
        if (acVar != null) {
            m70011f(acVar);
        }
        this.f105989g.mo26245d(str, i, acVar);
    }

    /* renamed from: e */
    public final int mo26246e(String str, C21200ac acVar) {
        if (acVar != null) {
            m70011f(acVar);
        }
        return this.f105989g.mo26246e(str, acVar);
    }
}
