package com.google.android.libraries.mdi.download.p2236d.p2239c;

import android.net.Uri;
import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C29390en;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.c.c */
/* compiled from: PG */
public final /* synthetic */ class C28915c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C28917e f78535a;

    /* renamed from: b */
    public final /* synthetic */ Uri f78536b;

    public /* synthetic */ C28915c(C28917e eVar, Uri uri) {
        this.f78535a = eVar;
        this.f78536b = uri;
    }

    public final C60870cx apply(Object obj) {
        C28917e eVar = this.f78535a;
        Uri uri = this.f78536b;
        Void voidR = (Void) obj;
        C42813k kVar = eVar.f78543c;
        if (C28927o.m53847b(kVar, uri).equals(eVar.f78545e.f79477f)) {
            return C28925m.m53840d(C29390en.DOWNLOAD_COMPLETE, eVar.f78545e, eVar.f78555o, eVar.f78542b, eVar.f78553m);
        }
        C29045l.m53936h("%s: Final file checksum verification failed. %s.", "DeltaFileDownloaderCallbackImpl", uri);
        C28736bn bnVar = new C28736bn();
        bnVar.f78062a = C28737bo.FINAL_FILE_CHECKSUM_MISMATCH_ERROR;
        return C60856cj.m92899h(bnVar.mo34334a());
    }
}
