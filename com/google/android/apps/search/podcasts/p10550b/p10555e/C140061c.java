package com.google.android.apps.search.podcasts.p10550b.p10555e;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97884aj;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97885ak;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.podcasts.b.e.c */
/* compiled from: PG */
public final /* synthetic */ class C140061c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C140084z f380646a;

    /* renamed from: b */
    public final /* synthetic */ List f380647b;

    public /* synthetic */ C140061c(C140084z zVar, List list) {
        this.f380646a = zVar;
        this.f380647b = list;
    }

    public final void accept(Object obj) {
        long j;
        C97885ak akVar;
        C140084z zVar = this.f380646a;
        C140083y yVar = (C140083y) obj;
        boolean z = false;
        for (C140641b bVar : this.f380647b) {
            C140646b bVar2 = bVar.f381974a;
            if (bVar2 == null) {
                bVar2 = C140646b.f381993r;
            }
            String str = bVar2.f382001g;
            String str2 = bVar.f381975b;
            C140074p pVar = (C140074p) yVar.f380682a.f380669a.get(str);
            if (pVar == null || (akVar = (C97885ak) pVar.f380666a.get(str2)) == null) {
                j = 0;
            } else {
                j = akVar.f273310d ? -1 : akVar.f273309c;
            }
            if (j != 0) {
                C97884aj ajVar = (C97884aj) C97885ak.f273305g.createBuilder();
                String str3 = bVar.f381975b;
                ajVar.copyOnWrite();
                C97885ak akVar2 = (C97885ak) ajVar.instance;
                str3.getClass();
                akVar2.f273307a |= 1;
                akVar2.f273308b = str3;
                ajVar.copyOnWrite();
                C97885ak akVar3 = (C97885ak) ajVar.instance;
                akVar3.f273307a |= 4;
                akVar3.f273310d = false;
                ajVar.copyOnWrite();
                C97885ak akVar4 = (C97885ak) ajVar.instance;
                akVar4.f273307a |= 32;
                akVar4.f273312f = 0.0f;
                ajVar.copyOnWrite();
                C97885ak akVar5 = (C97885ak) ajVar.instance;
                akVar5.f273307a |= 2;
                akVar5.f273309c = 0;
                long b = yVar.f380683b.mo26870b();
                ajVar.copyOnWrite();
                C97885ak akVar6 = (C97885ak) ajVar.instance;
                akVar6.f273307a |= 16;
                akVar6.f273311e = b;
                yVar.mo115431c((C97885ak) ajVar.build(), bVar);
                z = true;
            }
        }
        if (z) {
            yVar.f380682a.mo115427c();
            C140082x xVar = zVar.f380693d;
            yVar.getClass();
            xVar.mo115429a(yVar);
            zVar.mo115437f();
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
