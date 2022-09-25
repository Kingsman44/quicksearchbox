package com.google.android.libraries.assistant.auto.tng.common.p918h;

import com.google.apps.tiktok.p3633d.p3634a.C46669g;
import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59071e;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.h.d */
/* compiled from: PG */
public final /* synthetic */ class C13268d implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C13268d f40959a = new C13268d();

    private /* synthetic */ C13268d() {
    }

    public final Object apply(Object obj) {
        List<AbstractMap.SimpleEntry> list = (List) obj;
        C59071e eVar = C13270f.f40961a;
        LinkedHashMap l = C58662ni.m90353l(list.size());
        for (AbstractMap.SimpleEntry simpleEntry : list) {
            if (simpleEntry.getValue() != C46675m.f121943k && !((C46669g) simpleEntry.getValue()).mo50689c()) {
                C58528ij ijVar = C13270f.f40962b;
                if (((C58759qy) ijVar).f156534a.equals(((C46669g) simpleEntry.getValue()).mo50687a())) {
                    l.put((String) simpleEntry.getKey(), (C46669g) simpleEntry.getValue());
                }
            }
        }
        return C58495hd.m89898l(l);
    }
}
