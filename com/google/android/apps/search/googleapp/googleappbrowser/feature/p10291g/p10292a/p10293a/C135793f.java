package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g.p10292a.p10293a;

import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g.p10292a.C135802e;
import com.google.android.libraries.web.p3353c.C43369n;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63033ey;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.g.a.a.f */
/* compiled from: PG */
public final /* synthetic */ class C135793f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C135794g f369874a;

    public /* synthetic */ C135793f(C135794g gVar) {
        this.f369874a = gVar;
    }

    public final C60870cx apply(Object obj) {
        C135794g gVar = this.f369874a;
        C43376u uVar = (C43376u) obj;
        C43369n a = C43369n.m76519a(uVar.f113330c);
        if (a == null) {
            a = C43369n.UNSPECIFIED;
        }
        if (a != C43369n.SUCCESS) {
            return C60856cj.m92900i(C135802e.f369899e);
        }
        C60870cx e = gVar.f369879e.mo50345e(C63033ey.m95859a(uVar.f113329b));
        C135790c cVar = C135790c.f369871a;
        return C60922j.m93044g(e, C47810es.m84963c(cVar), gVar.f369880f);
    }
}
