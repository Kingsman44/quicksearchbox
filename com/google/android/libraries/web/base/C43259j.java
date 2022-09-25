package com.google.android.libraries.web.base;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.web.p3345b.p3346a.C43230a;
import com.google.android.libraries.web.p3345b.p3346a.C43231b;
import com.google.android.libraries.web.p3404e.C43763a;
import com.google.android.libraries.web.p3407g.C43773b;
import com.google.android.libraries.web.p3408h.C43786b;
import com.google.android.libraries.web.p3428m.C43945v;
import com.google.android.libraries.web.postmessage.PostMessageConfig;
import com.google.android.libraries.web.shared.contrib.WebFeature;
import com.google.android.libraries.web.shared.keys.ParcelableCallbackKeyMultimap;
import com.google.common.p4522b.C58506ho;
import com.google.common.p4522b.C58512hu;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.base.j */
/* compiled from: PG */
public final class C43259j {

    /* renamed from: a */
    public boolean f113058a = true;

    /* renamed from: b */
    public boolean f113059b;

    /* renamed from: c */
    public C43271v f113060c;

    /* renamed from: d */
    public Integer f113061d;

    /* renamed from: e */
    public String f113062e;

    /* renamed from: f */
    public boolean f113063f;

    /* renamed from: g */
    public boolean f113064g;

    /* renamed from: h */
    public boolean f113065h;

    /* renamed from: i */
    public boolean f113066i;

    /* renamed from: j */
    public boolean f113067j;

    /* renamed from: k */
    public int f113068k;

    /* renamed from: l */
    public boolean f113069l;

    /* renamed from: m */
    public final List f113070m = new ArrayList();

    /* renamed from: n */
    public final Map f113071n;

    /* renamed from: o */
    public final C43230a f113072o;

    /* renamed from: p */
    private String f113073p = BuildConfig.FLAVOR;

    /* renamed from: q */
    private final String f113074q = BuildConfig.FLAVOR;

    /* renamed from: r */
    private final Set f113075r = new LinkedHashSet();

    /* renamed from: s */
    private final List f113076s = new ArrayList();

    public C43259j() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f113071n = linkedHashMap;
        this.f113072o = C43231b.m76217a(linkedHashMap, C43773b.class);
        C43231b.m76217a(linkedHashMap, C43945v.class);
        C43231b.m76217a(linkedHashMap, C43786b.class);
        C43231b.m76217a(linkedHashMap, C43763a.class);
    }

    /* renamed from: f */
    private final void m76326f(Map map, WebFeature webFeature, Set set, Map map2, WebFeature webFeature2) {
        for (WebFeature webFeature3 : webFeature.mo41577b()) {
            if (!set.contains(webFeature3.mo41578c())) {
                Class cls = (Class) map2.get(webFeature3.mo41578c());
                if (cls == null) {
                    map2.put(webFeature3.mo41578c(), webFeature2.mo41578c());
                    Class c = webFeature3.mo41578c();
                    C69664n.m101060f(webFeature3, "includedFeature");
                    map.put(c, webFeature3);
                    m76326f(map, webFeature3, set, map2, webFeature);
                } else {
                    Class c2 = webFeature3.mo41578c();
                    Class c3 = webFeature2.mo41578c();
                    throw new IllegalArgumentException(c2 + " is being included both by " + cls + " and " + c3 + ". Please remove one or the other feature.");
                }
            } else {
                Class c4 = webFeature3.mo41578c();
                Class c5 = webFeature2.mo41578c();
                throw new IllegalArgumentException(c4 + " is being included both by the top-level WebConfig and " + c5 + ". Please remove one or the other.");
            }
        }
    }

    /* renamed from: a */
    public final WebConfig mo46371a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (WebFeature webFeature : this.f113070m) {
            C69685i iVar = new C69685i(webFeature.mo41578c(), webFeature);
            linkedHashMap.put(iVar.f186052a, iVar.f186053b);
        }
        Set keySet = linkedHashMap.keySet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (WebFeature webFeature2 : linkedHashMap.values()) {
            m76326f(linkedHashMap2, webFeature2, keySet, linkedHashMap3, webFeature2);
        }
        linkedHashMap.putAll(linkedHashMap2);
        C58506ho hoVar = new C58506ho();
        for (Map.Entry entry : this.f113071n.entrySet()) {
            hoVar.mo55458l((Class) entry.getKey(), (C43230a) entry.getValue());
        }
        C58512hu g = hoVar.mo55453g();
        C69664n.m101060f(g, "builder<Class<*>, Class<…s) } }\n          .build()");
        Set ab = C69540x.m100846ab(this.f113075r);
        boolean z = this.f113058a;
        boolean z2 = this.f113059b;
        C43271v vVar = this.f113060c;
        String str = this.f113073p;
        String str2 = this.f113074q;
        Integer num = this.f113061d;
        String str3 = this.f113062e;
        boolean z3 = this.f113063f;
        boolean z4 = this.f113064g;
        boolean z5 = this.f113065h;
        boolean z6 = this.f113066i;
        boolean z7 = this.f113067j;
        int i = this.f113068k;
        List list = this.f113076s;
        boolean z8 = this.f113069l;
        Map q = C69505av.m100875q(linkedHashMap);
        ParcelableCallbackKeyMultimap parcelableCallbackKeyMultimap = r2;
        ParcelableCallbackKeyMultimap parcelableCallbackKeyMultimap2 = new ParcelableCallbackKeyMultimap(g);
        return new WebConfig(ab, z, z2, vVar, str, str2, num, str3, z3, z4, z5, z6, false, z7, i, list, z8, q, parcelableCallbackKeyMultimap);
    }

    /* renamed from: b */
    public final void mo46372b(WebFeature... webFeatureArr) {
        for (WebFeature c : webFeatureArr) {
            mo46373c(c);
        }
    }

    /* renamed from: c */
    public final void mo46373c(WebFeature webFeature) {
        C69664n.m101061g(webFeature, "feature");
        this.f113070m.add(webFeature);
    }

    /* renamed from: d */
    public final void mo46374d(PostMessageConfig postMessageConfig) {
        C69664n.m101061g(postMessageConfig, "config");
        this.f113075r.add(postMessageConfig);
    }

    /* renamed from: e */
    public final void mo46375e(String str) {
        C69664n.m101061g(str, "value");
        this.f113073p = str;
    }
}
