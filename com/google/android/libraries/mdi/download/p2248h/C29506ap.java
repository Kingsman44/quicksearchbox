package com.google.android.libraries.mdi.download.p2248h;

import android.net.Uri;
import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.p2230c.C28776k;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.mdi.download.h.ap */
/* compiled from: PG */
public final /* synthetic */ class C29506ap implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ String f79959a;

    /* renamed from: b */
    public final /* synthetic */ Uri f79960b;

    /* renamed from: c */
    public final /* synthetic */ AtomicReference f79961c;

    public /* synthetic */ C29506ap(String str, Uri uri, AtomicReference atomicReference) {
        this.f79959a = str;
        this.f79960b = uri;
        this.f79961c = atomicReference;
    }

    public final C60870cx apply(Object obj) {
        String str = this.f79959a;
        Uri uri = this.f79960b;
        AtomicReference atomicReference = this.f79961c;
        C28776k kVar = (C28776k) obj;
        if (kVar.mo34373b()) {
            C29045l.m53937i("%s: Manifest file on server changed during download, download failed; urlToDownload = %s; manifestFileUri = %s", "ManifestFileGroupPopulator", str, uri);
            C28736bn bnVar = new C28736bn();
            bnVar.f78062a = C28737bo.MANIFEST_FILE_GROUP_POPULATOR_CONTENT_CHANGED_DURING_DOWNLOAD_ERROR;
            bnVar.f78063b = "Manifest file on server changed during download.";
            return C60856cj.m92899h(bnVar.mo34334a());
        }
        atomicReference.set(C29514ax.m54502f(str, 3, kVar.mo34372a()));
        return C60866ct.f164955a;
    }
}
