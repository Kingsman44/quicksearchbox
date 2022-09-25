package com.google.android.libraries.search.assistant.proactive;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.C124184c;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.C124211d;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124185a;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124186b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32881e;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.search.assistant.proactive.bc */
/* compiled from: PG */
public final /* synthetic */ class C36235bc implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C36240bh f94645a;

    public /* synthetic */ C36235bc(C36240bh bhVar) {
        this.f94645a = bhVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C36240bh bhVar = this.f94645a;
        C124211d dVar = bhVar.f94662l;
        if (dVar != null) {
            return C60856cj.m92900i(dVar);
        }
        C124184c cVar = bhVar.f94652b;
        C124185a aVar = (C124185a) C124186b.f342938c.createBuilder();
        C32881e eVar = bhVar.f94663m;
        eVar.getClass();
        C32849cq b = eVar.mo38265b();
        aVar.copyOnWrite();
        b.getClass();
        ((C124186b) aVar.instance).f342940a = b;
        return cVar.mo106322a((C124186b) aVar.build(), new C36238bf(), bhVar.f94656f);
    }
}
