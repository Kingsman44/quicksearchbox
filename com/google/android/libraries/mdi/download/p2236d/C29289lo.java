package com.google.android.libraries.mdi.download.p2236d;

import android.net.Uri;
import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.android.libraries.mdi.download.p2236d.p2239c.C28927o;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.lo */
/* compiled from: PG */
public final /* synthetic */ class C29289lo implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29290lp f79382a;

    /* renamed from: b */
    public final /* synthetic */ C29402ez f79383b;

    /* renamed from: c */
    public final /* synthetic */ C29328dl f79384c;

    public /* synthetic */ C29289lo(C29290lp lpVar, C29402ez ezVar, C29328dl dlVar) {
        this.f79382a = lpVar;
        this.f79383b = ezVar;
        this.f79384c = dlVar;
    }

    public final C60870cx apply(Object obj) {
        C29290lp lpVar = this.f79382a;
        C29402ez ezVar = this.f79383b;
        C29328dl dlVar = this.f79384c;
        Uri uri = (Uri) obj;
        if (uri != null) {
            if (!ezVar.f79716d) {
                C28927o.m53848c(lpVar.f79389e, dlVar, uri, dlVar.f79477f);
            } else if (!lpVar.f79389e.mo45894h(uri)) {
                C28736bn bnVar = new C28736bn();
                bnVar.f78062a = C28737bo.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                throw bnVar.mo34334a();
            }
            return C60866ct.f164955a;
        }
        C28736bn bnVar2 = new C28736bn();
        bnVar2.f78062a = C28737bo.DOWNLOADED_FILE_NOT_FOUND_ERROR;
        throw bnVar2.mo34334a();
    }
}
