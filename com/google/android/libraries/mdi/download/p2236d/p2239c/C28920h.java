package com.google.android.libraries.mdi.download.p2236d.p2239c;

import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.c.h */
/* compiled from: PG */
public final /* synthetic */ class C28920h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29398ev f78562a;

    public /* synthetic */ C28920h(C29398ev evVar) {
        this.f78562a = evVar;
    }

    public final C60870cx apply(Object obj) {
        C29398ev evVar = this.f78562a;
        C29402ez ezVar = (C29402ez) obj;
        if (ezVar != null) {
            return C60856cj.m92900i(ezVar);
        }
        C29045l.m53936h("%s: Shared file not found, newFileKey = %s", "DownloaderCallbackImpl", evVar);
        C28736bn bnVar = new C28736bn();
        bnVar.f78062a = C28737bo.SHARED_FILE_NOT_FOUND_ERROR;
        return C60856cj.m92899h(bnVar.mo34334a());
    }
}
