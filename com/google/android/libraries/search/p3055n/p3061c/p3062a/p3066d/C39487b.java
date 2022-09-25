package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3066d;

import android.net.Uri;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92513g;
import com.google.android.libraries.storage.p3304a.p3312f.C42787k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.n.c.a.d.b */
/* compiled from: PG */
public final /* synthetic */ class C39487b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C39493h f104001a;

    /* renamed from: b */
    public final /* synthetic */ String f104002b;

    public /* synthetic */ C39487b(C39493h hVar, String str) {
        this.f104001a = hVar;
        this.f104002b = str;
    }

    public final Object call() {
        byte[] bArr;
        IOException iOException;
        C39493h hVar = this.f104001a;
        String str = this.f104002b;
        Uri parse = Uri.parse(str);
        try {
            bArr = (byte[]) hVar.f104014c.mo45889c(parse, new C42787k());
            iOException = null;
        } catch (IOException e) {
            C59104x c = C39493h.f104012a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "HotwordInfoProvider");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(53683)).mo56389s("Cannot open the storage with the provided modelUri: %s. Will try using this as an asset filepath, but hotword model may break. Did MDD delete this model?", parse);
            IOException iOException2 = e;
            bArr = C92513g.m152179h(hVar.f104013b, str);
            iOException = iOException2;
        }
        if (iOException != null && bArr == null) {
            throw iOException;
        } else if (bArr != null) {
            return bArr;
        } else {
            throw new Exception(String.format("Mobstore dereference of hotword model failed: %s", new Object[]{parse}));
        }
    }
}
