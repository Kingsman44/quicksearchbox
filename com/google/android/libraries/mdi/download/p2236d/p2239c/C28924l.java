package com.google.android.libraries.mdi.download.p2236d.p2239c;

import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.c.l */
/* compiled from: PG */
public final /* synthetic */ class C28924l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29398ev f78568a;

    public /* synthetic */ C28924l(C29398ev evVar) {
        this.f78568a = evVar;
    }

    public final C60870cx apply(Object obj) {
        C29398ev evVar = this.f78568a;
        if (((Boolean) obj).booleanValue()) {
            return C60866ct.f164955a;
        }
        C29045l.m53936h("%s: Unable to write back download info for file entry with %s", "DownloaderCallbackImpl", evVar);
        C28736bn bnVar = new C28736bn();
        bnVar.f78062a = C28737bo.UNABLE_TO_UPDATE_FILE_STATE_ERROR;
        return C60856cj.m92899h(bnVar.mo34334a());
    }
}
