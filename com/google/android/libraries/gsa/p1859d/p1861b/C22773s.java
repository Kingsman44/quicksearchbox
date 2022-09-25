package com.google.android.libraries.gsa.p1859d.p1861b;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.PrintWriter;

/* renamed from: com.google.android.libraries.gsa.d.b.s */
/* compiled from: PG */
public final class C22773s extends C22772r {

    /* renamed from: f */
    final /* synthetic */ C22776v f62694f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22773s(C22776v vVar, C22774t tVar) {
        super(vVar, tVar, 3, "MinusOneCallback");
        this.f62694f = vVar;
    }

    /* renamed from: a */
    public final void mo28069a(PrintWriter printWriter) {
        printWriter.println("    MinusOneOverlayCallback");
        super.mo28069a(printWriter);
    }

    /* renamed from: b */
    public final C22768n mo28071b(Configuration configuration, Bundle bundle, String str) {
        C22776v vVar = this.f62694f;
        C22774t tVar = this.f62690b;
        return vVar.mo28097d(configuration, tVar.f62696b, tVar.f62697c, true, bundle, str);
    }

    public final boolean handleMessage(Message message) {
        if (!super.handleMessage(message)) {
            int i = message.what;
            if (i != 3) {
                if (i == 4) {
                    if (this.f62692d != null) {
                        this.f62691c.mo28121a("MSG_ON_SCROLL");
                        C22768n nVar = this.f62692d;
                        float floatValue = ((Float) message.obj).floatValue();
                        long when = message.getWhen();
                        C58976aa aaVar = C58975e.f156826a;
                        if (nVar.f62673au) {
                            int measuredWidth = (int) (((float) nVar.f62669aq.getMeasuredWidth()) * floatValue);
                            nVar.f62671as = measuredWidth;
                            nVar.mo28037W(2, measuredWidth, when);
                        }
                    } else {
                        this.f62691c.mo28121a("MSG_ON_SCROLL: empty view");
                    }
                    return true;
                } else if (i == 5) {
                    if (this.f62692d != null) {
                        this.f62691c.mo28121a("MSG_END_SCROLL");
                        C22768n nVar2 = this.f62692d;
                        long when2 = message.getWhen();
                        C58976aa aaVar2 = C58975e.f156826a;
                        if (nVar2.f62673au) {
                            nVar2.mo28037W(1, nVar2.f62671as, when2);
                        }
                        nVar2.f62673au = false;
                    } else {
                        this.f62691c.mo28121a("MSG_END_SCROLL: empty view");
                    }
                    return true;
                } else if (i != 9) {
                    return false;
                } else {
                    if (this.f62692d != null) {
                        this.f62691c.mo28121a("MSG_UPDATE_CLIENT_OPTIONS");
                        Bundle bundle = (Bundle) message.obj;
                        this.f62694f.mo28102j(bundle);
                        this.f62692d.mo28023E(bundle);
                    } else {
                        this.f62691c.mo28121a("MSG_UPDATE_CLIENT_OPTIONS: empty view");
                    }
                    return true;
                }
            } else if (this.f62692d != null) {
                this.f62691c.mo28121a("MSG_START_SCROLL");
                C22768n nVar3 = this.f62692d;
                long when3 = message.getWhen();
                C58976aa aaVar3 = C58975e.f156826a;
                if (!nVar3.mo28045ae()) {
                    C22754ad adVar = nVar3.f62669aq;
                    if (adVar.f62614e < adVar.f62633x) {
                        adVar.f62627r.mo28121a("resetPanel");
                        adVar.mo27972n(0);
                        nVar3.f62673au = true;
                        nVar3.f62671as = 0;
                        nVar3.f62669aq.f62630u = true;
                        long j = -30 + when3;
                        nVar3.f62672at = j;
                        nVar3.mo28037W(0, 0, j);
                        nVar3.mo28037W(2, nVar3.f62671as, when3);
                    }
                }
                this.f62694f.f62708c.mo27919H(this.f62692d.f62659ag, 2);
            } else {
                this.f62691c.mo28121a("MSG_START_SCROLL: empty view");
            }
        }
        return true;
    }
}
