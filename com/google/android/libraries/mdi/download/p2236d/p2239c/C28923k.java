package com.google.android.libraries.mdi.download.p2236d.p2239c;

import com.google.android.libraries.mdi.download.C29390en;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29401ey;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.android.libraries.mdi.download.p2236d.C29293ls;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.c.k */
/* compiled from: PG */
public final /* synthetic */ class C28923k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29390en f78565a;

    /* renamed from: b */
    public final /* synthetic */ C29293ls f78566b;

    /* renamed from: c */
    public final /* synthetic */ C29398ev f78567c;

    public /* synthetic */ C28923k(C29390en enVar, C29293ls lsVar, C29398ev evVar) {
        this.f78565a = enVar;
        this.f78566b = lsVar;
        this.f78567c = evVar;
    }

    public final C60870cx apply(Object obj) {
        C29390en enVar = this.f78565a;
        C29293ls lsVar = this.f78566b;
        C29398ev evVar = this.f78567c;
        C29402ez ezVar = (C29402ez) obj;
        C29401ey eyVar = (C29401ey) ezVar.toBuilder();
        eyVar.copyOnWrite();
        C29402ez ezVar2 = (C29402ez) eyVar.instance;
        ezVar2.f79715c = enVar.f79678h;
        ezVar2.f79713a |= 2;
        if (enVar.equals(C29390en.CORRUPTED)) {
            int i = ezVar.f79719g;
            eyVar.copyOnWrite();
            C29402ez ezVar3 = (C29402ez) eyVar.instance;
            ezVar3.f79713a |= 32;
            ezVar3.f79719g = i + 1;
        }
        return lsVar.mo34622g(evVar, (C29402ez) eyVar.build());
    }
}
