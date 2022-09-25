package com.google.android.libraries.mdi.download.p2230c;

import android.net.Uri;
import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C28738bp;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.net.MalformedURLException;

/* renamed from: com.google.android.libraries.mdi.download.c.t */
/* compiled from: PG */
public final class C28785t implements C28782q {

    /* renamed from: a */
    private final C58495hd f78238a;

    public C28785t(C28784s sVar) {
        this.f78238a = C58495hd.m89898l(sVar.f78237a);
    }

    /* renamed from: a */
    public final C60870cx mo34370a(C28775j jVar) {
        try {
            return mo34410c(jVar.mo34366b()).mo34370a(jVar);
        } catch (C28738bp e) {
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: b */
    public final C60870cx mo34371b(C28781p pVar) {
        try {
            return mo34410c(pVar.mo34402f()).mo34371b(pVar);
        } catch (C28738bp e) {
            return C60856cj.m92899h(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C28782q mo34410c(String str) {
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String scheme = parse.getScheme();
                if (scheme != null) {
                    C28782q qVar = (C28782q) this.f78238a.get(scheme);
                    if (qVar != null) {
                        return qVar;
                    }
                    C29045l.m53936h("%s: No registered downloader supports the download url scheme, scheme = %s", "MultiSchemeFileDownloader", scheme);
                    C28736bn bnVar = new C28736bn();
                    bnVar.f78062a = C28737bo.UNSUPPORTED_DOWNLOAD_URL_SCHEME;
                    throw bnVar.mo34334a();
                }
                throw new MalformedURLException("URL contained no scheme.");
            }
            throw new MalformedURLException("Could not parse URL.");
        } catch (MalformedURLException e) {
            C29045l.m53936h("%s: The download url is malformed, url = %s", "MultiSchemeFileDownloader", str);
            C28736bn bnVar2 = new C28736bn();
            bnVar2.f78062a = C28737bo.MALFORMED_DOWNLOAD_URL;
            bnVar2.f78064c = e;
            throw bnVar2.mo34334a();
        }
    }
}
