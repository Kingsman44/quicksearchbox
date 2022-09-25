package com.google.android.apps.gsa.staticplugins.bubble;

import android.view.View;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88463m;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88473w;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88474x;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c.C97010o;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c.C97015t;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97040c;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.b */
/* compiled from: PG */
public final /* synthetic */ class C96946b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C96968f f270964a;

    /* renamed from: b */
    public final /* synthetic */ C97040c f270965b;

    public /* synthetic */ C96946b(C96968f fVar, C97040c cVar) {
        this.f270964a = fVar;
        this.f270965b = cVar;
    }

    public final void onClick(View view) {
        C96968f fVar = this.f270964a;
        C97040c cVar = this.f270965b;
        C88463m mVar = (C88463m) C88474x.f239172h.createBuilder();
        mVar.copyOnWrite();
        C88474x xVar = (C88474x) mVar.instance;
        xVar.f239176c = 1;
        xVar.f239174a |= 2;
        C88473w wVar = C88473w.PIET;
        mVar.copyOnWrite();
        C88474x xVar2 = (C88474x) mVar.instance;
        xVar2.f239175b = wVar.f239171d;
        xVar2.f239174a |= 1;
        mVar.copyOnWrite();
        C88474x xVar3 = (C88474x) mVar.instance;
        xVar3.f239174a |= 16;
        xVar3.f239179f = 73483;
        C62940bt btVar = C97015t.f271115m;
        C97010o oVar = (C97010o) C97015t.f271114l.createBuilder();
        C63088z b = cVar.mo90393b();
        oVar.copyOnWrite();
        C97015t tVar = (C97015t) oVar.instance;
        b.getClass();
        tVar.f271117a |= 4;
        tVar.f271120d = b;
        mVar.mo58885m(btVar, (C97015t) oVar.build());
        fVar.mo90387b((C88474x) mVar.build());
    }
}
