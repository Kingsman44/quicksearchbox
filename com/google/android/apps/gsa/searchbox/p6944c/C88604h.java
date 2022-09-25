package com.google.android.apps.gsa.searchbox.p6944c;

import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.android.libraries.searchbox.root.p3199a.C41631e;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.c.h */
/* compiled from: PG */
public final /* synthetic */ class C88604h implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C88607k f239453a;

    /* renamed from: b */
    public final /* synthetic */ List f239454b;

    /* renamed from: c */
    public final /* synthetic */ C41631e f239455c;

    public /* synthetic */ C88604h(C88607k kVar, List list, C41631e eVar) {
        this.f239453a = kVar;
        this.f239454b = list;
        this.f239455c = eVar;
    }

    public final void run() {
        C41642a aVar;
        C88607k kVar = this.f239453a;
        List list = this.f239454b;
        C41631e eVar = this.f239455c;
        synchronized (kVar) {
            aVar = kVar.f239476h;
            kVar.f239476h = null;
            kVar.f239477i = null;
        }
        if (aVar != null) {
            kVar.mo82263l(aVar, list, eVar);
        }
    }
}
