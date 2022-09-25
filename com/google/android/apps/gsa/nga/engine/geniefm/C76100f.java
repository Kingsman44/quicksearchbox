package com.google.android.apps.gsa.nga.engine.geniefm;

import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.p6260x.C79850ah;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.storage.p3304a.p3312f.C42790n;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4541l.C59332o;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.nga.engine.geniefm.f */
/* compiled from: PG */
public final /* synthetic */ class C76100f implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C76103i f210984a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f210985b;

    public /* synthetic */ C76100f(C76103i iVar, C58495hd hdVar) {
        this.f210984a = iVar;
        this.f210985b = hdVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        Uri uri;
        C76103i iVar = this.f210984a;
        C58495hd hdVar = this.f210985b;
        ((C58970a) ((C58970a) C76103i.f210989a.mo56224b()).mo56372aa(3892)).mo56386p("Loading GenieFM resources from URIs");
        C79850ah b = iVar.f210993e.mo74251b(23);
        try {
            GenieFmWrapper genieFmWrapper = iVar.f210991c;
            genieFmWrapper.f210978b.mo72960b();
            genieFmWrapper.nativeStartLoadingResources();
            Uri uri2 = (Uri) hdVar.get("i18n_resources.binarypb");
            if (uri2 != null) {
                InputStream inputStream = (InputStream) iVar.f210992d.mo45889c(uri2, new C42790n());
                try {
                    iVar.f210991c.nativeLoadI18nResources(C59332o.m92213d(inputStream));
                } catch (IOException e) {
                    ((C58970a) ((C58970a) ((C58970a) GenieFmWrapper.f210977a.mo56225c()).mo56382g(e)).mo56372aa(3898)).mo56386p("Failed to load i18n resources");
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            Uri uri3 = (Uri) hdVar.get("vertical_resources.binarypb");
            if (uri3 != null) {
                InputStream inputStream2 = (InputStream) iVar.f210992d.mo45889c(uri3, new C42790n());
                try {
                    iVar.f210991c.nativeLoadVerticalResources(C59332o.m92213d(inputStream2));
                } catch (IOException e2) {
                    ((C58970a) ((C58970a) ((C58970a) GenieFmWrapper.f210977a.mo56225c()).mo56382g(e2)).mo56372aa(3901)).mo56386p("Failed to load vertical resources");
                } catch (Throwable th2) {
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    throw th2;
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
            }
            Uri uri4 = (Uri) hdVar.get("patterns.binarypb");
            if (uri4 != null) {
                InputStream inputStream3 = (InputStream) iVar.f210992d.mo45889c(uri4, new C42790n());
                try {
                    iVar.f210991c.nativeLoadTpatPatterns(C59332o.m92213d(inputStream3));
                } catch (IOException e3) {
                    ((C58970a) ((C58970a) ((C58970a) GenieFmWrapper.f210977a.mo56225c()).mo56382g(e3)).mo56372aa(3900)).mo56386p("Failed to load TPAT patterns");
                } catch (Throwable th3) {
                    if (inputStream3 != null) {
                        inputStream3.close();
                    }
                    throw th3;
                }
                if (inputStream3 != null) {
                    inputStream3.close();
                }
            }
            Uri uri5 = (Uri) hdVar.get("rule_map.binarypb");
            if (uri5 != null) {
                InputStream inputStream4 = (InputStream) iVar.f210992d.mo45889c(uri5, new C42790n());
                try {
                    iVar.f210991c.nativeLoadGpatRuleMap(C59332o.m92213d(inputStream4));
                } catch (IOException e4) {
                    ((C58970a) ((C58970a) ((C58970a) GenieFmWrapper.f210977a.mo56225c()).mo56382g(e4)).mo56372aa(3897)).mo56386p("Failed to load GPAT rule map");
                } catch (Throwable th4) {
                    if (inputStream4 != null) {
                        inputStream4.close();
                    }
                    throw th4;
                }
                if (inputStream4 != null) {
                    inputStream4.close();
                }
            }
            if (hdVar.containsKey("postag_counts_nga.binarypb") && (uri = (Uri) hdVar.get("postag_counts_nga.binarypb")) != null) {
                InputStream inputStream5 = (InputStream) iVar.f210992d.mo45889c(uri, new C42790n());
                try {
                    iVar.f210991c.nativeLoadPosTagsCounts(C59332o.m92213d(inputStream5));
                } catch (IOException e5) {
                    ((C58970a) ((C58970a) ((C58970a) GenieFmWrapper.f210977a.mo56225c()).mo56382g(e5)).mo56372aa(3899)).mo56386p("Failed to load postag counts");
                } catch (Throwable th5) {
                    if (inputStream5 != null) {
                        inputStream5.close();
                    }
                    throw th5;
                }
                if (inputStream5 != null) {
                    inputStream5.close();
                }
            }
            iVar.f210991c.nativeFinishLoadingResources();
            iVar.f210994f.set(true);
            C118826c cVar = C118826c.f331422a;
            if (b != null) {
                b.mo74255b();
            }
            return cVar;
        } catch (Throwable th6) {
            if (b != null) {
                try {
                    b.mo74255b();
                } catch (Throwable th7) {
                    C76096b.m122682a(th6, th7);
                }
            }
            throw th6;
        }
    }
}
