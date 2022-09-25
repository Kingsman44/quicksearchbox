package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.p9349a;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.C124235b;
import com.google.common.p4526f.C59052c;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.b.a.l */
/* compiled from: PG */
public final /* synthetic */ class C124226l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C124234t f343011a;

    /* renamed from: b */
    public final /* synthetic */ String f343012b;

    public /* synthetic */ C124226l(C124234t tVar, String str) {
        this.f343011a = tVar;
        this.f343012b = str;
    }

    public final void run() {
        C124234t tVar = this.f343011a;
        String str = this.f343012b;
        Iterator it = tVar.f343028g.iterator();
        while (it.hasNext()) {
            C124235b bVar = (C124235b) it.next();
            if (bVar.mo106333h().equals(str)) {
                tVar.f343028g.remove(bVar);
                ((C59052c) ((C59052c) C124234t.f343022a.mo56224b()).mo56372aa(36128)).mo56352E("Connection(%s) removed, total(%d).", bVar.mo106333h(), tVar.f343028g.size());
            }
        }
        tVar.mo106341d();
    }
}
