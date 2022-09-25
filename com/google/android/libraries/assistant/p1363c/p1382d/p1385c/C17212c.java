package com.google.android.libraries.assistant.p1363c.p1382d.p1385c;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p5462h.p5463a.C69497an;
import p5462h.p5472e.C69606j;
import p5462h.p5472e.C69607k;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;
import p5462h.p5482l.C69731k;
import p5462h.p5482l.C69734n;

/* renamed from: com.google.android.libraries.assistant.c.d.c.c */
/* compiled from: PG */
final class C17212c extends C69665o implements C69615a {

    /* renamed from: a */
    public static final C17212c f49957a = new C17212c();

    public C17212c() {
        super(0);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        int i = C17213d.f49958a;
        String property = System.getProperty("user.dir");
        if (property == null || property.length() == 0) {
            return C69497an.f185919a;
        }
        File file = new File(property);
        C69607k kVar = C69607k.TOP_DOWN;
        C69664n.m101061g(kVar, "direction");
        C69664n.m101061g(kVar, "direction");
        C69731k h = C69734n.m101140h(new C69606j(file, kVar), C17211b.f49956a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator a = h.mo5191a();
        while (a.hasNext()) {
            File file2 = (File) a.next();
            String name = file2.getName();
            C69664n.m101060f(name, "it.name");
            linkedHashMap.put(name, file2.getAbsolutePath());
        }
        return linkedHashMap;
    }
}
