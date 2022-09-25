package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import android.net.Uri;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3312f.C42790n;
import com.google.assistant.p3793ae.p3794a.C48774f;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.bi */
/* compiled from: PG */
public final /* synthetic */ class C103936bi implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C103943bp f289268a;

    public /* synthetic */ C103936bi(C103943bp bpVar) {
        this.f289268a = bpVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C103943bp bpVar = this.f289268a;
        C29690f fVar = (C29690f) obj;
        if (fVar == null) {
            return C48774f.f126206b;
        }
        for (C28595b bVar : fVar.f80416g) {
            if (bVar.f77798b.equals("configs")) {
                InputStream inputStream = (InputStream) ((C42813k) bpVar.f289287e.mo27525b()).mo45889c(Uri.parse(bVar.f77799c), new C42790n());
                try {
                    C48774f fVar2 = (C48774f) C62942bv.parseFrom((C62942bv) C48774f.f126206b, inputStream, C62921ba.f169869a);
                    if (inputStream == null) {
                        return fVar2;
                    }
                    inputStream.close();
                    return fVar2;
                } catch (Throwable th) {
                    C103925ay.m171864a(th, th);
                }
            }
        }
        return C48774f.f126206b;
        throw th;
    }
}
