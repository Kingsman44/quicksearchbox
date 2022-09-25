package com.google.android.apps.search.assistant.surfaces.bisto.p9404e.p9406b;

import android.net.Uri;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124664cc;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124685cx;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29683w;
import com.google.android.libraries.mdi.download.C29686x;
import com.google.android.libraries.mdi.download.p2230c.C28779n;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60888db;
import java.io.File;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.e.b.c */
/* compiled from: PG */
public final class C124748c extends C124664cc {

    /* renamed from: a */
    private final C29409fd f344151a;

    /* renamed from: b */
    private final C60888db f344152b;

    public C124748c(C29409fd fdVar, C60888db dbVar) {
        this.f344151a = fdVar;
        this.f344152b = dbVar;
    }

    /* renamed from: b */
    public final void mo106579b(C124685cx cxVar, C70862aj ajVar) {
        C28779n nVar;
        C58833ax axVar;
        Uri uri;
        String str;
        C28779n nVar2;
        C58485gu guVar;
        String str2;
        C124685cx cxVar2 = cxVar;
        C70862aj ajVar2 = ajVar;
        Uri fromFile = Uri.fromFile(new File(cxVar2.f343982a));
        C29409fd fdVar = this.f344151a;
        C29683w wVar = new C29683w();
        wVar.f80381e = -1;
        wVar.f80386j = (byte) (wVar.f80386j | 1);
        C58485gu m = C58485gu.m89845m();
        if (m != null) {
            wVar.f80382f = m;
            wVar.f80386j = (byte) (wVar.f80386j | 2);
            wVar.mo34805b(true);
            wVar.mo34804a(C28779n.f78234a);
            if (fromFile != null) {
                wVar.f80377a = fromFile;
                String str3 = cxVar2.f343983b;
                if (str3 != null) {
                    wVar.f80378b = str3;
                    if (cxVar2.f343984c) {
                        nVar = C28779n.f78236c;
                    } else {
                        nVar = C28779n.f78235b;
                    }
                    wVar.mo34804a(nVar);
                    wVar.mo34805b(false);
                    wVar.f80380d = C58833ax.m90834k(new C124747b(ajVar2));
                    String str4 = wVar.f80383g;
                    if (str4 == null) {
                        axVar = C58836b.f156633a;
                    } else {
                        axVar = C58833ax.m90834k(str4);
                    }
                    if (!axVar.mo56113h()) {
                        String str5 = wVar.f80378b;
                        if (str5 != null) {
                            wVar.f80383g = str5;
                        } else {
                            throw new IllegalStateException("Property \"urlToDownload\" has not been set");
                        }
                    }
                    if (wVar.f80386j != 7 || (uri = wVar.f80377a) == null || (str = wVar.f80378b) == null || (nVar2 = wVar.f80379c) == null || (guVar = wVar.f80382f) == null || (str2 = wVar.f80383g) == null) {
                        StringBuilder sb = new StringBuilder();
                        if (wVar.f80377a == null) {
                            sb.append(" destinationFileUri");
                        }
                        if (wVar.f80378b == null) {
                            sb.append(" urlToDownload");
                        }
                        if (wVar.f80379c == null) {
                            sb.append(" downloadConstraints");
                        }
                        if ((wVar.f80386j & 1) == 0) {
                            sb.append(" trafficTag");
                        }
                        if (wVar.f80382f == null) {
                            sb.append(" extraHttpHeaders");
                        }
                        if ((wVar.f80386j & 2) == 0) {
                            sb.append(" fileSizeBytes");
                        }
                        if (wVar.f80383g == null) {
                            sb.append(" notificationContentTitle");
                        }
                        if ((wVar.f80386j & 4) == 0) {
                            sb.append(" showDownloadedNotification");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                    C60846c.m92879h(C60838bs.m92859i(fdVar.mo34716e(new C29686x(uri, str, nVar2, wVar.f80380d, wVar.f80381e, guVar, str2, wVar.f80384h, wVar.f80385i))), Exception.class, new C124746a(ajVar2), this.f344152b);
                    return;
                }
                throw new NullPointerException("Null urlToDownload");
            }
            throw new NullPointerException("Null destinationFileUri");
        }
        throw new NullPointerException("Null extraHttpHeaders");
    }
}
