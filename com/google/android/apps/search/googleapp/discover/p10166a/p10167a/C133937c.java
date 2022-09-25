package com.google.android.apps.search.googleapp.discover.p10166a.p10167a;

import android.net.Uri;
import com.google.android.apps.search.googleapp.urlhandler.C139795f;
import com.google.android.apps.search.googleapp.urlhandler.C139798i;
import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import com.google.android.apps.search.googleapp.urlhandler.C139851q;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.search.googleapp.discover.a.a.c */
/* compiled from: PG */
public final class C133937c {

    /* renamed from: a */
    public final C139795f f364789a;

    /* renamed from: b */
    public final C58833ax f364790b;

    public C133937c(C139795f fVar, C58833ax axVar) {
        this.f364789a = fVar;
        this.f364790b = axVar;
    }

    /* renamed from: a */
    public final void mo111465a(Uri uri, boolean z) {
        C139851q qVar = z ? C139851q.AMP_DISCOVER : C139851q.DISCOVER;
        C139795f fVar = this.f364789a;
        C139798i iVar = (C139798i) C139823j.f380066m.createBuilder();
        iVar.copyOnWrite();
        C139823j jVar = (C139823j) iVar.instance;
        jVar.f380069b = qVar.f380143m;
        jVar.f380068a |= 1;
        C58833ax axVar = this.f364790b;
        iVar.copyOnWrite();
        C139823j jVar2 = (C139823j) iVar.instance;
        jVar2.f380068a |= 1024;
        jVar2.f380079l = axVar.mo56113h();
        iVar.copyOnWrite();
        C139823j jVar3 = (C139823j) iVar.instance;
        jVar3.f380068a |= 512;
        jVar3.f380078k = true;
        fVar.mo115250a(uri, (C139823j) iVar.build());
    }
}
