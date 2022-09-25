package com.google.android.apps.gsa.shared.p6968aa;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.shared.aa.z */
/* compiled from: PG */
public final /* synthetic */ class C89070z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f241386a;

    /* renamed from: b */
    public final /* synthetic */ File f241387b;

    public /* synthetic */ C89070z(C60870cx cxVar, File file) {
        this.f241386a = cxVar;
        this.f241387b = file;
    }

    public final void run() {
        C60870cx cxVar = this.f241386a;
        File file = this.f241387b;
        if (C90877ak.m148478l(cxVar) && !file.delete()) {
            ((C59052c) ((C59052c) C89009ag.f241206a.mo56225c()).mo56372aa(10636)).mo56389s("Failed to delete %s", file);
        }
    }
}
