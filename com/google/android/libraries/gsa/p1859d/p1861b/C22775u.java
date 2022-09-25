package com.google.android.libraries.gsa.p1859d.p1861b;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.PrintWriter;

/* renamed from: com.google.android.libraries.gsa.d.b.u */
/* compiled from: PG */
public final class C22775u extends C22772r {

    /* renamed from: f */
    final /* synthetic */ C22776v f62705f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22775u(C22776v vVar, C22774t tVar) {
        super(vVar, tVar, 2, "SearchOverlayCallback");
        this.f62705f = vVar;
    }

    /* renamed from: a */
    public final void mo28069a(PrintWriter printWriter) {
        printWriter.println("    SearchOverlayCallback");
        super.mo28069a(printWriter);
    }

    /* renamed from: b */
    public final C22768n mo28071b(Configuration configuration, Bundle bundle, String str) {
        C22776v vVar = this.f62705f;
        C22774t tVar = this.f62690b;
        return vVar.mo28097d(configuration, tVar.f62696b, tVar.f62697c, false, bundle, str);
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 6 || message.arg1 != 1) {
            return super.handleMessage(message);
        }
        C58976aa aaVar = C58975e.f156826a;
        return true;
    }
}
