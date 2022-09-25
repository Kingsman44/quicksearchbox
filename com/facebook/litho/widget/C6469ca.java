package com.facebook.litho.widget;

import com.facebook.litho.C6154cb;
import com.facebook.litho.C6187dg;
import com.facebook.litho.C6191dk;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.p313c.p318e.C6045e;
import com.facebook.p313c.p318e.C6046f;

/* renamed from: com.facebook.litho.widget.ca */
/* compiled from: PG */
final class C6469ca implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LithoView f19169a;

    public C6469ca(LithoView lithoView) {
        this.f19169a = lithoView;
    }

    public final void run() {
        C6187dg dgVar;
        LithoView lithoView = this.f19169a;
        ComponentTree componentTree = lithoView.f17938n;
        if (componentTree != null && (dgVar = componentTree.f17871B) != null) {
            int size = dgVar.f18304i.size();
            for (int i = 0; i < size; i++) {
                C6154cb cbVar = ((C6045e) dgVar.f18304i.get(i)).f17782i;
                if (cbVar != null) {
                    if (C6046f.f17789b == null) {
                        C6046f.f17789b = new C6191dk();
                    }
                    C6191dk dkVar = C6046f.f17789b;
                    dkVar.f18325a = lithoView;
                    dkVar.f18326b = null;
                    Object[] objArr = new Object[1];
                    cbVar.mo13111fD(dkVar);
                    C6191dk dkVar2 = C6046f.f17789b;
                    dkVar2.f18325a = null;
                    dkVar2.f18326b = null;
                }
            }
        }
    }
}
