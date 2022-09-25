package com.google.android.libraries.gsa.conversation.p1853g;

import com.google.common.base.C58833ax;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.gsa.conversation.g.ak */
/* compiled from: PG */
public final /* synthetic */ class C22624ak implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C22654bn f62325a;

    /* renamed from: b */
    public final /* synthetic */ String f62326b;

    public /* synthetic */ C22624ak(C22654bn bnVar, String str) {
        this.f62325a = bnVar;
        this.f62326b = str;
    }

    public final void run() {
        C22654bn bnVar = this.f62325a;
        String str = this.f62326b;
        if (bnVar.f62408f.mo27801b() && !bnVar.f62408f.mo27803d()) {
            if (bnVar.f62414l.isEmpty()) {
                bnVar.f62415m = C58833ax.m90834k(str);
            }
            Iterator it = bnVar.f62414l.iterator();
            while (it.hasNext()) {
                ((C22653bm) it.next()).mo27761h(str);
            }
        }
    }
}
