package com.google.android.apps.search.podcasts.p10550b.p10555e;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97884aj;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97885ak;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.podcasts.b.e.k */
/* compiled from: PG */
public final /* synthetic */ class C140069k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C140084z f380659a;

    /* renamed from: b */
    public final /* synthetic */ List f380660b;

    public /* synthetic */ C140069k(C140084z zVar, List list) {
        this.f380659a = zVar;
        this.f380660b = list;
    }

    public final void accept(Object obj) {
        C140084z zVar = this.f380659a;
        C140083y yVar = (C140083y) obj;
        boolean z = false;
        for (C140641b bVar : this.f380660b) {
            C140646b bVar2 = bVar.f381974a;
            if (bVar2 == null) {
                bVar2 = C140646b.f381993r;
            }
            String str = bVar2.f382001g;
            String str2 = bVar.f381975b;
            if (!yVar.f380682a.mo115428d(str, str2)) {
                C97884aj ajVar = (C97884aj) C97885ak.f273305g.createBuilder();
                ajVar.copyOnWrite();
                C97885ak akVar = (C97885ak) ajVar.instance;
                str2.getClass();
                akVar.f273307a |= 1;
                akVar.f273308b = str2;
                long b = yVar.f380682a.mo115426b(str, str2);
                ajVar.copyOnWrite();
                C97885ak akVar2 = (C97885ak) ajVar.instance;
                akVar2.f273307a |= 2;
                akVar2.f273309c = b;
                ajVar.copyOnWrite();
                C97885ak akVar3 = (C97885ak) ajVar.instance;
                akVar3.f273307a |= 4;
                akVar3.f273310d = true;
                long b2 = yVar.f380683b.mo26870b();
                ajVar.copyOnWrite();
                C97885ak akVar4 = (C97885ak) ajVar.instance;
                akVar4.f273307a |= 16;
                akVar4.f273311e = b2;
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
