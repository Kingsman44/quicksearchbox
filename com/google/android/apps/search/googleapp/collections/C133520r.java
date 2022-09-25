package com.google.android.apps.search.googleapp.collections;

import android.net.Uri;
import com.google.android.apps.search.googleapp.collections.p10143b.C133504e;
import com.google.android.apps.search.googleapp.urlhandler.C139795f;
import com.google.android.apps.search.googleapp.urlhandler.C139798i;
import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import com.google.android.apps.search.googleapp.urlhandler.C139851q;
import com.google.android.libraries.web.contrib.requestblock.C43714a;
import com.google.android.libraries.web.p3353c.C43367l;

/* renamed from: com.google.android.apps.search.googleapp.collections.r */
/* compiled from: PG */
public final /* synthetic */ class C133520r implements C43714a {

    /* renamed from: a */
    public final /* synthetic */ C133521s f363795a;

    public /* synthetic */ C133520r(C133521s sVar) {
        this.f363795a = sVar;
    }

    /* renamed from: a */
    public final void mo32340a(C43367l lVar) {
        C133504e eVar = this.f363795a.f363806k;
        String str = lVar.f113296b;
        C139795f fVar = eVar.f363766a;
        Uri a = eVar.f363767b.mo111205a(Uri.parse(str));
        C139798i iVar = (C139798i) C139823j.f380066m.createBuilder();
        C139851q qVar = C139851q.COLLECTIONS;
        iVar.copyOnWrite();
        C139823j jVar = (C139823j) iVar.instance;
        jVar.f380069b = qVar.f380143m;
        jVar.f380068a |= 1;
        iVar.copyOnWrite();
        C139823j jVar2 = (C139823j) iVar.instance;
        jVar2.f380068a |= 1024;
        jVar2.f380079l = true;
        boolean z = eVar.f363768c;
        iVar.copyOnWrite();
        C139823j jVar3 = (C139823j) iVar.instance;
        jVar3.f380068a |= 128;
        jVar3.f380076i = !z;
        fVar.mo115250a(a, (C139823j) iVar.build());
    }
}
