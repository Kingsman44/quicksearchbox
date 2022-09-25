package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n;

import android.content.Context;
import com.google.android.apps.gsa.opa.smartspace.C83735ag;
import com.google.android.apps.gsa.opa.smartspace.C83736ah;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83776s;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9956c.C131193k;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.C131258a;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9980m.C131428a;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9980m.C131432e;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.p10016j.C131757a;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.bx */
/* compiled from: PG */
public final class C131495bx implements C131258a {

    /* renamed from: a */
    public final C58974d f359340a;

    /* renamed from: b */
    public final C131481bj f359341b;

    /* renamed from: c */
    public final C60887da f359342c;

    /* renamed from: d */
    public final C131428a f359343d;

    /* renamed from: e */
    public final Context f359344e;

    /* renamed from: f */
    public final C131432e f359345f;

    /* renamed from: g */
    public final C131757a f359346g;

    /* renamed from: h */
    public final boolean f359347h;

    /* renamed from: i */
    private final C131193k f359348i;

    /* renamed from: j */
    private final boolean f359349j;

    /* renamed from: k */
    private final boolean f359350k;

    public C131495bx(C130603a aVar, C131481bj bjVar, C60887da daVar, C131428a aVar2, Context context, C131432e eVar, C131193k kVar, boolean z, boolean z2, boolean z3, C131757a aVar3) {
        this.f359340a = aVar.mo109740b(this);
        this.f359341b = bjVar;
        this.f359342c = daVar;
        this.f359343d = aVar2;
        this.f359344e = context;
        this.f359345f = eVar;
        this.f359348i = kVar;
        this.f359349j = z;
        this.f359350k = z2;
        this.f359346g = aVar3;
        this.f359347h = z3;
    }

    /* renamed from: d */
    public final C58485gu mo110138d() {
        return C58485gu.m89846n(C50794cr.SHOPPING_LIST);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C60870cx mo110139e(C106596h hVar, C53715bm bmVar, Object obj) {
        Optional optional = (Optional) obj;
        if (this.f359349j) {
            return this.f359348i.mo110114a(C50794cr.SHOPPING_LIST, this.f359350k, true, hVar.f297214i, optional, new C131490bs(this), new C131491bt(this));
        }
        ((C58970a) ((C58970a) this.f359340a.mo56224b()).mo56372aa(39299)).mo56386p("Shopping list feature disabled.");
        return C60856cj.m92900i(Optional.empty());
    }

    /* renamed from: a */
    public static Optional m213920a(C83776s sVar) {
        int i = sVar.f228335a;
        if ((i & 4) != 0) {
            C83735ag agVar = (C83735ag) C83736ah.f228222c.createBuilder();
            String str = sVar.f228338d;
            agVar.copyOnWrite();
            C83736ah ahVar = (C83736ah) agVar.instance;
            str.getClass();
            ahVar.f228224a = 1;
            ahVar.f228225b = str;
            return Optional.m71637of((C83736ah) agVar.build());
        } else if ((i & 1) == 0) {
            return Optional.empty();
        } else {
            C83735ag agVar2 = (C83735ag) C83736ah.f228222c.createBuilder();
            String str2 = sVar.f228336b;
            agVar2.copyOnWrite();
            C83736ah ahVar2 = (C83736ah) agVar2.instance;
            str2.getClass();
            ahVar2.f228224a = 2;
            ahVar2.f228225b = str2;
            return Optional.m71637of((C83736ah) agVar2.build());
        }
    }
}
