package com.google.android.apps.gsa.staticplugins.p7537bk;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bk.i */
/* compiled from: PG */
public final /* synthetic */ class C96650i implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C96651j f270393a;

    /* renamed from: b */
    public final /* synthetic */ Uri f270394b;

    /* renamed from: c */
    public final /* synthetic */ C89356b f270395c;

    public /* synthetic */ C96650i(C96651j jVar, Uri uri, C89356b bVar) {
        this.f270393a = jVar;
        this.f270394b = uri;
        this.f270395c = bVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C96651j jVar = this.f270393a;
        Uri uri = this.f270394b;
        C89356b bVar = this.f270395c;
        int f = C96651j.m160159f(uri);
        C96647f fVar = (C96647f) jVar.f270400g.mo27525b();
        C89020ar e = C96651j.m160158e(C96651j.m160157c(uri), f);
        C90748e.m148224b();
        C58976aa aaVar = C58975e.f156826a;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
            ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
            if (e == null) {
                try {
                    parcelFileDescriptor2.closeWithError("Invalid request");
                    return parcelFileDescriptor;
                } catch (IOException e2) {
                    C59104x c = C96647f.f270385a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "ImageInMemoryGraph");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(20749)).mo56386p("Unable to close pipe");
                    return parcelFileDescriptor;
                }
            } else {
                fVar.f270387c.mo28212l("NetworkImageLoader.loadAndTransfer", new C96646e(fVar, e, parcelFileDescriptor2, bVar, f));
                return parcelFileDescriptor;
            }
        } catch (IOException e3) {
            C59104x c2 = C96647f.f270385a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "ImageInMemoryGraph");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e3)).mo56372aa(20745)).mo56389s("fetchInMemory failed %s.", uri);
            return null;
        }
    }
}
