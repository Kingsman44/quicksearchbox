package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.p9349a;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.C124235b;
import com.google.assistant.p3741aa.p3742a.p3743a.C48160h;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.b.a.j */
/* compiled from: PG */
public final /* synthetic */ class C124224j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C124234t f343008a;

    /* renamed from: b */
    public final /* synthetic */ C48160h f343009b;

    public /* synthetic */ C124224j(C124234t tVar, C48160h hVar) {
        this.f343008a = tVar;
        this.f343009b = hVar;
    }

    public final void run() {
        C124234t tVar = this.f343008a;
        C48160h hVar = this.f343009b;
        Iterator it = tVar.f343028g.iterator();
        while (it.hasNext()) {
            ((C124235b) it.next()).mo106334i(hVar);
        }
    }
}
