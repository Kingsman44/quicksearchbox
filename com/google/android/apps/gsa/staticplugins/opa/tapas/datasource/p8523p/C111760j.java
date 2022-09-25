package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8523p;

import android.net.Uri;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p.j */
/* compiled from: PG */
final class C111760j implements Comparator {

    /* renamed from: a */
    final /* synthetic */ C111761k f310646a;

    public C111760j(C111761k kVar) {
        this.f310646a = kVar;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C113415ez ezVar = (C113415ez) obj;
        C113415ez ezVar2 = (C113415ez) obj2;
        Uri uri = (Uri) this.f310646a.f310651d.get(ezVar);
        Uri uri2 = (Uri) this.f310646a.f310651d.get(ezVar2);
        if (!(uri == null || uri2 == null)) {
            List<String> pathSegments = uri.getPathSegments();
            List<String> pathSegments2 = uri2.getPathSegments();
            if (pathSegments != null && pathSegments.isEmpty()) {
                return -1;
            }
            if (pathSegments != null && pathSegments2.isEmpty()) {
                return 1;
            }
        }
        return Double.compare(ezVar2.mo100202b(), ezVar.mo100202b());
    }
}
