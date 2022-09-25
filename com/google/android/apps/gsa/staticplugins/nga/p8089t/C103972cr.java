package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import android.net.Uri;
import com.google.android.apps.gsa.languagepack.br;
import com.google.android.apps.gsa.languagepack.bs;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.storage.p3304a.p3312f.C42790n;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import java.io.IOException;
import java.io.InputStream;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.cr */
/* compiled from: PG */
public final /* synthetic */ class C103972cr implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C104026er f289364a;

    public /* synthetic */ C103972cr(C104026er erVar) {
        this.f289364a = erVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C60870cx cxVar;
        C104026er erVar = this.f289364a;
        C29690f fVar = (C29690f) obj;
        C22871g gVar = erVar.f289448b;
        C104032ex exVar = (C104032ex) erVar.f289461o.mo27525b();
        Optional a = exVar.mo93925a();
        if (a.isPresent()) {
            C28595b bVar = (C28595b) fVar.f80416g.get(0);
            String str = bVar.f77798b;
            if (str.startsWith(((C8476as) a.get()).f29421f)) {
                Uri parse = Uri.parse(bVar.f77799c);
                int i = ((C8476as) a.get()).f29419d;
                try {
                    bs bsVar = (bs) exVar.f289477c.mo27525b();
                    cxVar = C118826c.m197213c(bsVar.i.mo28207g("[NGA] ZipDownloadProcessorTask.processDownloadFile", new br(bsVar, (C8476as) a.get(), (InputStream) exVar.f289479e.mo45889c(parse, new C42790n()))));
                } catch (IOException e) {
                    exVar.f289480f.mo93949b(20, e, "Extract language pack fail.");
                    cxVar = C60856cj.m92899h(e);
                }
            } else {
                ((C58970a) ((C58970a) C104032ex.f289475a.mo56226d()).mo56372aa(21756)).mo56354G("Downloaded language pack id(%s) doesn't match required language pack id(%s).", str, ((C8476as) a.get()).f29421f);
                cxVar = C60856cj.m92899h(new C104031ew("Downloaded language pack doesn't match required language pack id"));
            }
        } else {
            cxVar = C60856cj.m92899h(new C104031ew(String.format("No compatible language pack for the current assistant locale. Locale = %s; Mapped Locale = %s", new Object[]{exVar.mo93927e(), exVar.f289476b.mo93859b().toLanguageTag()})));
        }
        return gVar.mo28209i(cxVar, "[NGA] downloadFileGroup.onLanguagePackDownloadSuccess.transform", new C104005dx(fVar));
    }
}
