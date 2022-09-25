package com.google.android.apps.gsa.staticplugins.opa.p8205am;

import com.google.android.apps.gsa.assistant.shared.k.a.a;
import com.google.android.apps.gsa.assistant.shared.k.a.d;
import com.google.android.apps.gsa.assistant.shared.k.a.g;
import com.google.android.apps.gsa.assistant.shared.k.a.h;
import com.google.android.apps.gsa.shared.util.p7171i.C91042a;
import com.google.common.base.C58817ah;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.am.h */
/* compiled from: PG */
public final /* synthetic */ class C106383h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f296735a;

    public /* synthetic */ C106383h(String str) {
        this.f296735a = str;
    }

    public final Object apply(Object obj) {
        h hVar;
        d dVar = (d) obj;
        String num = Integer.toString(C91042a.m148717a(this.f296735a));
        a builder = dVar.toBuilder();
        if (!builder.a(num) || (hVar = (h) Collections.unmodifiableMap(Collections.unmodifiableMap(builder.instance.b)).get(num)) == null) {
            a builder2 = dVar.toBuilder();
            g createBuilder = h.e.createBuilder();
            createBuilder.copyOnWrite();
            h hVar2 = createBuilder.instance;
            hVar2.a |= 1;
            hVar2.b = 1;
            builder2.d(num, createBuilder.build());
            return builder2.build();
        }
        int i = (hVar.a & 1) != 0 ? hVar.b : 0;
        a builder3 = dVar.toBuilder();
        g builder4 = hVar.toBuilder();
        builder4.copyOnWrite();
        h hVar3 = builder4.instance;
        hVar3.a |= 1;
        hVar3.b = i + 1;
        builder3.d(num, builder4.build());
        return builder3.build();
    }
}
