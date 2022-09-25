package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import com.google.android.apps.search.googleapp.searchwidget.C139030h;
import com.google.android.apps.search.googleapp.searchwidget.C139031i;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.b */
/* compiled from: PG */
public final /* synthetic */ class C138957b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C138977i f377913a;

    public /* synthetic */ C138957b(C138977i iVar) {
        this.f377913a = iVar;
    }

    public final Object apply(Object obj) {
        C138977i iVar = this.f377913a;
        C139031i iVar2 = (C139031i) obj;
        int i = iVar2.f378107h + 1;
        if (((long) i) > iVar.f377967j) {
            C139030h hVar = (C139030h) iVar2.toBuilder();
            hVar.copyOnWrite();
            C139031i iVar3 = (C139031i) hVar.instance;
            iVar3.f378100a |= 32;
            iVar3.f378107h = i;
            return (C139031i) hVar.build();
        }
        C62910ar j = C62948a.m95459j(Math.min(C62948a.m95453d(C138977i.f377960c), C62948a.m95453d(C138977i.f377959b) * ((long) ((int) Math.pow((double) i, 2.0d)))));
        ((C59052c) ((C59052c) C138977i.f377958a.mo56224b()).mo56372aa(41322)).mo56395y("SearchWidgetDoodleContentDownloadWorker:retry, retry: %s, initialMS: %s", i, j);
        C46459k.m82829b(iVar.f377963f.mo50546b(C138977i.m225787a(j)), "SearchWidgetDoodleContentDownloadWorker failed to enqueue.", new Object[0]);
        C139030h hVar2 = (C139030h) iVar2.toBuilder();
        hVar2.copyOnWrite();
        C139031i iVar4 = (C139031i) hVar2.instance;
        iVar4.f378100a |= 32;
        iVar4.f378107h = i;
        return (C139031i) hVar2.build();
    }
}
