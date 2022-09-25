package com.google.android.libraries.search.feedback.p2997a;

import com.google.apps.tiktok.experiments.phenotype.C46990dc;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.search.feedback.a.g */
/* compiled from: PG */
public final class C38319g implements C46675m {

    /* renamed from: a */
    public static final /* synthetic */ int f101493a = 0;

    /* renamed from: b */
    private final C46990dc f101494b;

    /* renamed from: c */
    private final C46990dc f101495c;

    public C38319g(C46990dc dcVar, C46990dc dcVar2) {
        this.f101494b = dcVar;
        this.f101495c = dcVar2;
    }

    /* renamed from: a */
    public final C60870cx mo20647a(C46677o oVar) {
        if (!oVar.mo50698b().contains(C46667e.TEXT)) {
            return C60856cj.m92900i(f121943k);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f101494b.mo50962a());
        arrayList.add(this.f101495c.mo50962a());
        C60870cx o = C60856cj.m92906o(arrayList);
        C38313a aVar = C38313a.f101487a;
        C60870cx g = C60922j.m93044g(o, C47810es.m84963c(aVar), C60826bg.f164896a);
        C38314b bVar = C38314b.f101488a;
        return C60922j.m93044g(g, C47810es.m84963c(bVar), C60826bg.f164896a);
    }
}
