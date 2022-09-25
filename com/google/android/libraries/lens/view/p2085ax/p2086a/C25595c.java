package com.google.android.libraries.lens.view.p2085ax.p2086a;

import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119096ae;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119097af;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119099ah;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119100ai;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119103al;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p5285d.p5290b.p5291a.p5292a.C68151an;

/* renamed from: com.google.android.libraries.lens.view.ax.a.c */
/* compiled from: PG */
public final /* synthetic */ class C25595c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C25598f f69632a;

    /* renamed from: b */
    public final /* synthetic */ String f69633b;

    public /* synthetic */ C25595c(C25598f fVar, String str) {
        this.f69632a = fVar;
        this.f69633b = str;
    }

    public final C60870cx apply(Object obj) {
        C25598f fVar = this.f69632a;
        String str = this.f69633b;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C119099ah ahVar = (C119099ah) C119100ai.f332220c.createBuilder();
        ahVar.mo104188b(str);
        ahVar.copyOnWrite();
        ((C119100ai) ahVar.instance).f332223b = C68151an.m98490a(3);
        C119097af afVar = (C119097af) C119103al.f332227e.createBuilder();
        C119100ai aiVar = (C119100ai) ahVar.build();
        afVar.copyOnWrite();
        C119103al alVar = (C119103al) afVar.instance;
        aiVar.getClass();
        alVar.f332230b = aiVar;
        alVar.f332229a = 2;
        C60870cx a = ((C119096ae) axVar.mo56107c()).mo104109a((C119103al) afVar.build());
        C25594b bVar = new C25594b(axVar);
        return C60922j.m93044g(a, C47810es.m84963c(bVar), fVar.f69641d);
    }
}
