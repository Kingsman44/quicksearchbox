package com.google.android.apps.search.assistant.verticals.p9880a.p9891g;

import android.app.DirectAction;
import com.google.android.apps.search.assistant.verticals.p9880a.p9884c.C130348b;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.g.a */
/* compiled from: PG */
public final /* synthetic */ class C130392a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C130394c f357327a;

    /* renamed from: b */
    public final /* synthetic */ C18100a f357328b;

    public /* synthetic */ C130392a(C130394c cVar, C18100a aVar) {
        this.f357327a = cVar;
        this.f357328b = aVar;
    }

    public final C60870cx apply(Object obj) {
        C130394c cVar = this.f357327a;
        C18100a aVar = this.f357328b;
        C130348b bVar = (C130348b) obj;
        if (bVar.mo109681e().isPresent()) {
            C60870cx d = cVar.f357333c.mo39116d((DirectAction) bVar.mo109681e().get(), aVar.f51574a);
            C130393b bVar2 = new C130393b(cVar, aVar);
            return C60922j.m93044g(d, C47810es.m84963c(bVar2), cVar.f357332b);
        }
        ((C59052c) ((C59052c) C130394c.f357331a.mo56226d()).mo56372aa(39424)).mo56389s("%s", "supported DirectAction not found in foreground app");
        return C60856cj.m92900i(C36180b.m64579c(C52235kf.NOT_FOUND, "supported DirectAction not found in foreground app"));
    }
}
