package com.google.android.apps.gsa.nga.engine.p5891ab;

import com.google.android.apps.gsa.nga.engine.grammar.C76123a;
import com.google.android.apps.gsa.nga.engine.grammar.GinaCompiledPatterns;
import com.google.android.libraries.gsa.p1876k.C22870f;

/* renamed from: com.google.android.apps.gsa.nga.engine.ab.d */
/* compiled from: PG */
public final /* synthetic */ class C74758d implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ c f208872a;

    public /* synthetic */ C74758d(c cVar) {
        this.f208872a = cVar;
    }

    public final void run() {
        c cVar = this.f208872a;
        synchronized (cVar) {
            C76123a aVar = cVar.b;
            if (aVar != null) {
                ((GinaCompiledPatterns) aVar).f211063b.close();
                cVar.b = null;
            }
            C76123a aVar2 = cVar.c;
            if (aVar2 != null) {
                ((GinaCompiledPatterns) aVar2).f211063b.close();
                cVar.c = null;
            }
        }
    }
}
