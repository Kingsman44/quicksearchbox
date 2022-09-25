package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.am.h.bb;
import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80912h;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80913i;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.ct */
/* compiled from: PG */
public final /* synthetic */ class C77075ct implements C80912h {

    /* renamed from: a */
    public final /* synthetic */ C77089dg f212710a;

    /* renamed from: b */
    public final /* synthetic */ C77140u f212711b;

    /* renamed from: c */
    public final /* synthetic */ C80303ay f212712c;

    /* renamed from: d */
    public final /* synthetic */ df f212713d;

    /* renamed from: e */
    public final /* synthetic */ C58485gu f212714e;

    public /* synthetic */ C77075ct(C77089dg dgVar, C77140u uVar, C80303ay ayVar, df dfVar, C58485gu guVar) {
        this.f212710a = dgVar;
        this.f212711b = uVar;
        this.f212712c = ayVar;
        this.f212713d = dfVar;
        this.f212714e = guVar;
    }

    /* renamed from: a */
    public final Object mo72387a(Object obj) {
        C77089dg dgVar = this.f212710a;
        C77140u uVar = this.f212711b;
        C80303ay ayVar = this.f212712c;
        df dfVar = this.f212713d;
        C58485gu guVar = this.f212714e;
        C58485gu guVar2 = (C58485gu) obj;
        if (guVar2.isEmpty()) {
            ((C58970a) ((C58970a) C77089dg.f212747a.mo56224b()).mo56372aa(3808)).mo56389s("Cannot send message to any of contactIds %s", dfVar.a());
            uVar.mo72409e().ifPresent(new C77049bu(uVar, dfVar, guVar));
            return C80913i.m128773b(Optional.empty());
        }
        return C80913i.m128774c(dgVar.f212751e.c(bb.c, df.c(dfVar.b(), guVar2), uVar.mo72412h(), ayVar));
    }
}
