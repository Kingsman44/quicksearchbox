package com.google.android.libraries.search.assistant.p2716p.p2723c.p2726b.p2727a;

import com.google.android.libraries.assistant.gallium.framework.p1509c.p1510a.C18230a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protos.p4985f.p5030q.C65123co;
import com.google.protos.p4985f.p5030q.C65126cr;
import java.util.Collections;

/* renamed from: com.google.android.libraries.search.assistant.p.c.b.a.a */
/* compiled from: PG */
public final class C34974a implements C18230a {

    /* renamed from: a */
    private static final C59071e f92665a = C59071e.m91332i("com.google.android.libraries.search.assistant.p.c.b.a.a");

    /* renamed from: b */
    private final C18230a f92666b;

    /* renamed from: c */
    private final boolean f92667c;

    /* renamed from: d */
    private final C65126cr f92668d;

    public C34974a(C18230a aVar, boolean z, C65126cr crVar) {
        this.f92666b = aVar;
        this.f92667c = z;
        this.f92668d = crVar;
    }

    /* renamed from: a */
    public final C65123co mo23733a(int i) {
        C65123co coVar;
        if (!this.f92667c || (coVar = (C65123co) Collections.unmodifiableMap(this.f92668d.f176291a).get(Integer.valueOf(i))) == null) {
            return this.f92666b.mo23733a(i);
        }
        ((C59052c) ((C59052c) f92665a.mo56224b()).mo56372aa(51216)).mo56395y("Overridden flag returned %d %s", i, coVar);
        return coVar;
    }
}
