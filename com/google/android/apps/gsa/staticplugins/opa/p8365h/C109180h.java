package com.google.android.apps.gsa.staticplugins.opa.p8365h;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.h.h */
/* compiled from: PG */
public final /* synthetic */ class C109180h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C109191s f304001a;

    /* renamed from: b */
    public final /* synthetic */ int f304002b;

    public /* synthetic */ C109180h(C109191s sVar, int i) {
        this.f304001a = sVar;
        this.f304002b = i;
    }

    public final void run() {
        C109191s sVar = this.f304001a;
        int i = this.f304002b;
        int decrementAndGet = sVar.f304027i.decrementAndGet();
        ((C58970a) ((C58970a) sVar.f304019a.mo56224b()).mo56372aa(23872)).mo56393w("handleMessage(): id:%d, DEC to %d", i, decrementAndGet);
        C2164c cVar = (C2164c) sVar.f304030l.remove(Integer.valueOf(i));
        if (cVar != null) {
            cVar.mo5437b(C118826c.f331422a);
        } else {
            ((C58970a) ((C58970a) sVar.f304019a.mo56226d()).mo56372aa(23873)).mo56387q("handleMessage(): no completer for id:%d", i);
        }
        if (decrementAndGet == 0) {
            sVar.mo97658c();
        }
    }
}
