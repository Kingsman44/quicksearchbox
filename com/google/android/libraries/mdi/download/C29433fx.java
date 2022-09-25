package com.google.android.libraries.mdi.download;

import android.net.Uri;
import com.google.android.libraries.mdi.C28597c;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63070h;
import java.io.IOException;

/* renamed from: com.google.android.libraries.mdi.download.fx */
/* compiled from: PG */
public final /* synthetic */ class C29433fx implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ boolean f79788a;

    /* renamed from: b */
    public final /* synthetic */ C42813k f79789b;

    /* renamed from: c */
    public final /* synthetic */ C28597c f79790c;

    /* renamed from: d */
    public final /* synthetic */ C29328dl f79791d;

    public /* synthetic */ C29433fx(boolean z, C42813k kVar, C28597c cVar, C29328dl dlVar) {
        this.f79788a = z;
        this.f79789b = kVar;
        this.f79790c = cVar;
        this.f79791d = dlVar;
    }

    public final C60870cx apply(Object obj) {
        C63070h hVar;
        boolean z = this.f79788a;
        C42813k kVar = this.f79789b;
        C28597c cVar = this.f79790c;
        C29328dl dlVar = this.f79791d;
        Uri uri = (Uri) obj;
        if (uri == null) {
            C28736bn bnVar = new C28736bn();
            bnVar.f78062a = C28737bo.DOWNLOADED_FILE_NOT_FOUND_ERROR;
            bnVar.f78063b = "getDataFileUri() resolved to null";
            return C60856cj.m92899h(bnVar.mo34334a());
        }
        if (!z) {
            try {
                if (kVar.mo45895i(uri)) {
                    String path = uri.getPath();
                    if (path != null) {
                        cVar.mo34274a(C29647hr.m54609u(kVar, uri, path));
                    }
                    return C60856cj.m92900i(cVar);
                }
            } catch (IOException e) {
                C29045l.m53947s(e, "Failed to list files under directory:".concat(uri.toString()));
            }
        }
        String str = dlVar.f79473b;
        int i = dlVar.f79475d;
        int i2 = dlVar.f79480i;
        String uri2 = uri.toString();
        if ((dlVar.f79472a & 8192) != 0) {
            hVar = dlVar.f79487p;
            if (hVar == null) {
                hVar = C63070h.f170215c;
            }
        } else {
            hVar = null;
        }
        cVar.mo34275b(C29647hr.m54607o(str, i, i2, uri2, hVar));
        return C60856cj.m92900i(cVar);
    }
}
