package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import androidx.work.C4634o;
import com.google.android.apps.search.googleapp.searchwidget.C139030h;
import com.google.android.apps.search.googleapp.searchwidget.C139031i;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.ae */
/* compiled from: PG */
public final /* synthetic */ class C138935ae implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C138937ag f377877a;

    public /* synthetic */ C138935ae(C138937ag agVar) {
        this.f377877a = agVar;
    }

    public final Object apply(Object obj) {
        C138937ag agVar = this.f377877a;
        C139031i iVar = (C139031i) obj;
        int i = iVar.f378108i + 1;
        if (((long) i) > agVar.f377884f) {
            C139030h hVar = (C139030h) iVar.toBuilder();
            hVar.copyOnWrite();
            C139031i iVar2 = (C139031i) hVar.instance;
            iVar2.f378100a |= 64;
            iVar2.f378108i = i;
            return (C139031i) hVar.build();
        }
        C62910ar j = C62948a.m95459j(Math.min(C62948a.m95453d(C138937ag.f377881c), C62948a.m95453d(C138937ag.f377880b) * ((long) ((int) Math.pow((double) i, 2.0d)))));
        ((C59052c) ((C59052c) C138937ag.f377879a.mo56224b()).mo56372aa(41331)).mo56395y("SearchWidgetDoodleScheduleDownloadWorker:retry, retry: %s, initialMS: %s", i, j);
        C46578l lVar = agVar.f377883e;
        C46582p j2 = C46586t.m83063j(C138937ag.class);
        C46570d dVar = (C46570d) j2;
        dVar.f121757f = C58833ax.m90834k(new C46574h("com.google.android.apps.search.googleapp.searchwidget.doodle.SearchWidgetDoodleScheduleDownloadWorker", C4634o.REPLACE));
        dVar.f121754c = new C46573g(C62948a.m95453d(j), TimeUnit.MILLISECONDS);
        C46459k.m82829b(lVar.mo50546b(j2.mo50561a()), "SearchWidgetDoodleScheduleDownloadWorker failed to enqueue.", new Object[0]);
        C139030h hVar2 = (C139030h) iVar.toBuilder();
        hVar2.copyOnWrite();
        C139031i iVar3 = (C139031i) hVar2.instance;
        iVar3.f378100a |= 64;
        iVar3.f378108i = i;
        return (C139031i) hVar2.build();
    }
}
