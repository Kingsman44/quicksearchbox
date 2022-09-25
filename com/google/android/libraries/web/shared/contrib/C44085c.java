package com.google.android.libraries.web.shared.contrib;

import com.google.android.libraries.web.p3345b.p3346a.C43230a;
import com.google.android.libraries.web.p3345b.p3346a.C43231b;
import com.google.android.libraries.web.p3407g.C43773b;
import com.google.android.libraries.web.p3408h.C43786b;
import com.google.android.libraries.web.p3428m.C43945v;
import com.google.android.libraries.web.postmessage.PostMessageConfig;
import com.google.android.libraries.web.shared.keys.ParcelableCallbackKeyMultimap;
import com.google.common.p4522b.C58506ho;
import com.google.common.p4522b.C58512hu;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.shared.contrib.c */
/* compiled from: PG */
public final class C44085c {

    /* renamed from: a */
    public boolean f114764a;

    /* renamed from: b */
    public boolean f114765b;

    /* renamed from: c */
    public boolean f114766c;

    /* renamed from: d */
    public final C43230a f114767d;

    /* renamed from: e */
    public final C43230a f114768e;

    /* renamed from: f */
    private final Set f114769f = new LinkedHashSet();

    /* renamed from: g */
    private final Map f114770g;

    public C44085c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f114770g = linkedHashMap;
        this.f114767d = C43231b.m76217a(linkedHashMap, C43773b.class);
        this.f114768e = C43231b.m76217a(linkedHashMap, C43945v.class);
        C43231b.m76217a(linkedHashMap, C43786b.class);
    }

    /* renamed from: a */
    public final WebFeatureConfig mo47056a() {
        C58506ho hoVar = new C58506ho();
        for (Map.Entry entry : this.f114770g.entrySet()) {
            hoVar.mo55458l((Class) entry.getKey(), (C43230a) entry.getValue());
        }
        C58512hu g = hoVar.mo55453g();
        C69664n.m101060f(g, "builder<Class<*>, Class<…s) } }\n          .build()");
        return new WebFeatureConfig(this.f114764a, C69540x.m100846ab(this.f114769f), this.f114765b, this.f114766c, new ParcelableCallbackKeyMultimap(g));
    }

    /* renamed from: b */
    public final void mo47057b(Class cls, Class cls2) {
        C69664n.m101061g(cls2, "callbackKey");
        C43231b.m76217a(this.f114770g, cls).add(cls2);
    }

    /* renamed from: c */
    public final void mo47058c(PostMessageConfig postMessageConfig) {
        C69664n.m101061g(postMessageConfig, "config");
        this.f114769f.add(postMessageConfig);
    }
}
