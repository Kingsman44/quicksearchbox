package com.google.android.libraries.storage.protostore;

import android.net.Uri;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3306b.C42737a;
import com.google.android.libraries.storage.p3304a.p3312f.C42796t;
import com.google.android.libraries.storage.protostore.p3316a.C42873a;
import com.google.android.libraries.storage.protostore.p3316a.C42874b;
import com.google.apps.tiktok.tracing.C47524aj;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.libraries.storage.protostore.cl */
/* compiled from: PG */
public final /* synthetic */ class C42944cl implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C42966db f112339a;

    public /* synthetic */ C42944cl(C42966db dbVar) {
        this.f112339a = dbVar;
    }

    public final C60870cx apply(Object obj) {
        OutputStream outputStream;
        C42966db dbVar = this.f112339a;
        Uri uri = (Uri) C60856cj.m92909r(dbVar.f112379b);
        Uri a = C42874b.m75731a(uri, ".tmp");
        try {
            C47524aj ajVar = dbVar.f112387j;
            String str = dbVar.f112378a;
            C47558bi b = ajVar.mo51389b("Write " + str);
            try {
                C42737a aVar = new C42737a();
                try {
                    C42813k kVar = dbVar.f112382e;
                    C42796t tVar = new C42796t();
                    tVar.f112061a = new C42737a[]{aVar};
                    outputStream = (OutputStream) kVar.mo45889c(a, tVar);
                    ((MessageLite) obj).writeTo(outputStream);
                    aVar.mo45839b();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (b != null) {
                        b.close();
                    }
                    dbVar.f112382e.mo45893g(a, uri);
                    synchronized (dbVar.f112388k) {
                        dbVar.f112390m = obj;
                    }
                    return C60866ct.f164955a;
                } catch (IOException e) {
                    throw C42873a.m75728a(dbVar.f112382e, uri, e);
                } catch (Throwable th) {
                    C42942cj.m75834a(th, th);
                }
                throw th;
            } catch (Throwable th2) {
                if (b != null) {
                    b.close();
                }
                throw th2;
            }
        } catch (IOException e2) {
            if (dbVar.f112382e.mo45894h(a)) {
                try {
                    dbVar.f112382e.mo45892f(a);
                } catch (IOException e3) {
                    C42942cj.m75834a(e2, e3);
                }
            }
            throw e2;
        } catch (Throwable th3) {
            C42942cj.m75834a(th2, th3);
        }
    }
}
