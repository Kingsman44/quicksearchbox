package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7471e;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.e.b */
/* compiled from: PG */
public final /* synthetic */ class C94941b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C94942c f265578a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f265579b;

    public /* synthetic */ C94941b(C94942c cVar, byte[] bArr) {
        this.f265578a = cVar;
        this.f265579b = bArr;
    }

    public final void run() {
        C94942c cVar = this.f265578a;
        byte[] bArr = this.f265579b;
        OutputStream outputStream = cVar.f265587g;
        if (outputStream == null) {
            C59104x b = C94942c.f265580a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AudioHandler");
            ((C59052c) ((C59052c) b).mo56372aa(17663)).mo56386p("No output channel");
            return;
        }
        try {
            outputStream.write(bArr);
        } catch (IOException unused) {
            C59104x b2 = C94942c.f265580a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "AudioHandler");
            ((C59052c) ((C59052c) b2).mo56372aa(17662)).mo56386p("Error writing to output channel");
            cVar.mo88852a();
        }
    }
}
