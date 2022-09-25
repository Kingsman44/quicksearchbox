package com.google.android.apps.search.podcasts.p10550b.p10556f;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97905bd;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97908bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.apps.search.podcasts.b.f.aa */
/* compiled from: PG */
public final /* synthetic */ class C140086aa implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C140097al f380700a;

    public /* synthetic */ C140086aa(C140097al alVar) {
        this.f380700a = alVar;
    }

    public final C60870cx apply(Object obj) {
        C140097al alVar = this.f380700a;
        C140088ac acVar = (C140088ac) obj;
        boolean d = alVar.f380727g.mo115441d();
        C140085a aVar = alVar.f380727g;
        C97905bd bdVar = (C97905bd) C97908bg.f273364e.createBuilder();
        bdVar.copyOnWrite();
        C97908bg bgVar = (C97908bg) bdVar.instance;
        bgVar.f273367b = 0;
        bgVar.f273366a |= 1;
        List e = acVar.mo115447e();
        e.getClass();
        bdVar.mo90842a(e);
        aVar.mo115440c((C97908bg) bdVar.build());
        if (!d) {
            return alVar.mo115463f();
        }
        alVar.f380727g.mo115439b();
        return alVar.mo115459b(acVar.mo115447e());
    }
}
