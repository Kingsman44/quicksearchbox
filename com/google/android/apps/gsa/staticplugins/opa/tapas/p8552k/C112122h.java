package com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k;

import android.net.Uri;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.storage.p3304a.p3312f.C42788l;
import com.google.common.util.concurrent.C60856cj;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.k.h */
/* compiled from: PG */
public final /* synthetic */ class C112122h implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C112127m f311348a;

    /* renamed from: b */
    public final /* synthetic */ String f311349b;

    public /* synthetic */ C112122h(C112127m mVar, String str) {
        this.f311348a = mVar;
        this.f311349b = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Optional optional;
        C112127m mVar = this.f311348a;
        String str = this.f311349b;
        C29690f fVar = (C29690f) obj;
        if (fVar == null) {
            mVar.mo99407h(1, "Missing client file group %s", "tapas_cortex");
            return C60856cj.m92900i(Optional.empty());
        }
        try {
            Iterator it = fVar.f80416g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    C112127m.f311355a.mo105240i("tapas_mdd_suggestions_file_not_found");
                    mVar.mo99407h(1, "Tapas suggestions %s file not found.", str);
                    optional = Optional.empty();
                    break;
                }
                C28595b bVar = (C28595b) it.next();
                if (bVar.f77798b.equals(str)) {
                    mVar.mo99407h(2, "Loading %s from MDD with version=%d", str, Integer.valueOf(fVar.f80414e));
                    optional = Optional.m71637of((File) mVar.f311360e.mo45889c(Uri.parse(bVar.f77799c), new C42788l()));
                    break;
                }
            }
        } catch (IOException unused) {
            mVar.mo99407h(1, "Error opening MDD file %s.", str);
            optional = Optional.empty();
        }
        return C60856cj.m92900i(optional);
    }
}
