package com.google.android.libraries.gsa.monet.internal.p1887a;

import android.view.View;
import com.google.android.libraries.gsa.monet.internal.shared.FeatureStateSnapshot;
import com.google.android.libraries.gsa.monet.internal.shared.HierarchyState;
import com.google.android.libraries.gsa.monet.p1886a.C22937b;
import com.google.android.libraries.gsa.monet.shared.C23084ao;
import com.google.android.libraries.gsa.monet.shared.C23128x;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;

/* renamed from: com.google.android.libraries.gsa.monet.internal.a.n */
/* compiled from: PG */
public final class C22990n implements C22937b {

    /* renamed from: f */
    public static final /* synthetic */ int f63227f = 0;

    /* renamed from: g */
    private static final C23088b f63228g = C23088b.m43271a(new C23129y("monetdemo", "TRANSLATE_APP"), new C23129y("monetcodelab", "codelab"), new C23129y("quartz_jasper", "ENTRY_POINT"), new C23129y("quartz_companion", "ENTRY_POINT"), new C23129y("quartz_standalone", "ENTRY_POINT"), new C23129y("search", "TYPE_SEARCHNOW"));

    /* renamed from: a */
    public final C22994r f63229a;

    /* renamed from: b */
    public final C22995s f63230b;

    /* renamed from: c */
    public final C23084ao f63231c;

    /* renamed from: d */
    public final C23128x f63232d;

    /* renamed from: e */
    public boolean f63233e;

    /* renamed from: h */
    private final C22960ac f63234h;

    /* renamed from: i */
    private final C22970am f63235i;

    public C22990n(C22960ac acVar, C22970am amVar, C22994r rVar, C22995s sVar, C23084ao aoVar, C23128x xVar) {
        this.f63234h = acVar;
        this.f63235i = amVar;
        this.f63229a = rVar;
        this.f63230b = sVar;
        this.f63231c = aoVar;
        this.f63232d = xVar;
    }

    /* renamed from: d */
    private final void m43053d(Runnable runnable) {
        this.f63229a.mo28382d(this.f63234h.mo28340j());
        this.f63230b.mo28390e("DC", new C22986j(this));
        this.f63230b.mo28392g("DC");
        runnable.run();
        C23067b.m43232e(this.f63230b.mo28393h("DC"));
        this.f63229a.mo28385h(this.f63234h.mo28340j(), "DC");
    }

    /* renamed from: a */
    public final View mo28285a() {
        return this.f63234h.mo28340j().mo28297il();
    }

    /* renamed from: b */
    public final void mo28286b(C23129y yVar, ProtoParcelable protoParcelable) {
        if (!this.f63233e) {
            this.f63235i.mo28357e(yVar, protoParcelable);
            if (this.f63230b.mo28387b().isEmpty()) {
                m43053d(new C22988l(this, yVar, protoParcelable));
            }
        }
    }

    /* renamed from: c */
    public final void mo28287c(HierarchyState hierarchyState) {
        if (this.f63230b.mo28387b().isEmpty()) {
            boolean z = false;
            if (!hierarchyState.f63365b.f63444c) {
                C23088b bVar = hierarchyState.f63364a;
                int size = bVar.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    if (((FeatureStateSnapshot) bVar.get(i)).f63362b == null) {
                        i = i2;
                    } else {
                        return;
                    }
                }
            }
            if (!hierarchyState.f63364a.isEmpty() && ((FeatureStateSnapshot) hierarchyState.f63364a.get(0)).mo28454a().f63376b.equals("DC")) {
                z = true;
            }
            C23067b.m43232e(z);
            C23088b bVar2 = hierarchyState.f63364a;
            if (bVar2.size() > 1) {
                FeatureStateSnapshot featureStateSnapshot = (FeatureStateSnapshot) bVar2.get(1);
                if (hierarchyState.f63365b.f63444c || f63228g.contains(new C23129y(featureStateSnapshot.mo28454a().f63377c))) {
                    m43053d(new C22985i(this, hierarchyState));
                    return;
                }
                return;
            }
            throw new IllegalStateException("There is no root feature");
        }
    }
}
