package com.google.android.libraries.mdi.download.p2230c.p2232b;

import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.p2230c.C28781p;
import com.google.android.libraries.mdi.download.p2230c.C28783r;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.storage.p3304a.p3312f.C42790n;
import com.google.android.libraries.storage.p3304a.p3312f.C42796t;
import com.google.common.p4541l.C59332o;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.android.libraries.mdi.download.c.b.b */
/* compiled from: PG */
public final /* synthetic */ class C28756b implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C28757c f78171a;

    /* renamed from: b */
    public final /* synthetic */ C28783r f78172b;

    /* renamed from: c */
    public final /* synthetic */ C28781p f78173c;

    public /* synthetic */ C28756b(C28757c cVar, C28783r rVar, C28781p pVar) {
        this.f78171a = cVar;
        this.f78172b = rVar;
        this.f78173c = pVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        InputStream inputStream;
        OutputStream outputStream;
        C28757c cVar = this.f78171a;
        C28783r rVar = this.f78172b;
        C28781p pVar = this.f78173c;
        try {
            int b = rVar.mo34405a().mo34359b();
            int i = b - 1;
            if (b != 0) {
                if (i == 0) {
                    inputStream = rVar.mo34405a().mo34358a().mo59041m();
                } else if (i == 1) {
                    inputStream = (InputStream) cVar.f78174a.mo45889c(rVar.mo34405a().mo34362c(), new C42790n());
                } else {
                    throw new IllegalStateException("unreachable");
                }
                try {
                    outputStream = (OutputStream) cVar.f78174a.mo45889c(pVar.mo34397b(), new C42796t());
                    C59332o.m92211b(inputStream, outputStream);
                    outputStream.flush();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return C60866ct.f164955a;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            } else {
                throw null;
            }
            throw th;
        } catch (IOException e) {
            C29045l.m53938j(e, "%s: Unable to copy file content.", "InlineFileDownloader");
            C28736bn bnVar = new C28736bn();
            bnVar.f78064c = e;
            bnVar.f78062a = C28737bo.INLINE_FILE_IO_ERROR;
            return C60856cj.m92899h(bnVar.mo34334a());
        } catch (Throwable th2) {
            C28754a.m53636a(th, th2);
        }
    }
}
