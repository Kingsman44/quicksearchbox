package com.google.android.libraries.lens.ondevice.p2034k;

import android.content.Context;
import com.google.android.libraries.lens.ondevice.nativeapi.LodeResourceHolder;
import com.google.android.libraries.lens.ondevice.p2037n.C24790aw;
import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.k.he */
/* compiled from: PG */
public final class C24729he extends C68247h {

    /* renamed from: a */
    private final C68283d f67595a;

    /* renamed from: c */
    private final C68283d f67596c;

    /* renamed from: d */
    private final C68283d f67597d;

    /* renamed from: e */
    private final C68283d f67598e;

    /* renamed from: f */
    private final C68283d f67599f;

    /* renamed from: g */
    private final C68283d f67600g;

    public C24729he(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C24729he.class), aVar);
        this.f67595a = C68236af.m98549d(dVar);
        this.f67596c = C68236af.m98549d(dVar2);
        this.f67597d = C68236af.m98549d(dVar3);
        this.f67598e = C68236af.m98549d(dVar4);
        this.f67599f = C68236af.m98549d(dVar5);
        this.f67600g = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        boolean z = false;
        Context context = (Context) list.get(0);
        LodeResourceHolder lodeResourceHolder = (LodeResourceHolder) list.get(1);
        C24555at atVar = (C24555at) list.get(2);
        C24735hk hkVar = (C24735hk) list.get(3);
        C24803n nVar = (C24803n) list.get(4);
        C58833ax axVar = (C58833ax) list.get(5);
        if (axVar.mo56113h() && ((C24790aw) axVar.mo56107c()).f67738e) {
            if (C24725ha.m45862f(hkVar, (C24790aw) axVar.mo56107c())) {
                C24725ha.m45863g(context, atVar, hkVar, nVar, (C24790aw) axVar.mo56107c());
            }
            z = true;
        }
        return C60856cj.m92900i(Boolean.valueOf(z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f67595a.mo60297gq(), this.f67596c.mo60297gq(), this.f67597d.mo60297gq(), this.f67598e.mo60297gq(), this.f67599f.mo60297gq(), this.f67600g.mo60297gq());
    }
}
