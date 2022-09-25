package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9282a;

import androidx.p104d.p105a.C2164c;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.C122872ec;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122095d;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122099h;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122101j;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122103l;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122105n;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122106o;
import com.google.common.p4526f.C59052c;
import java.util.Locale;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.a.f */
/* compiled from: PG */
public final /* synthetic */ class C122556f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C122563m f339686a;

    /* renamed from: b */
    public final /* synthetic */ C122095d f339687b;

    public /* synthetic */ C122556f(C122563m mVar, C122095d dVar) {
        this.f339686a = mVar;
        this.f339687b = dVar;
    }

    public final void run() {
        C122101j jVar;
        String str;
        C122103l lVar;
        C122563m mVar = this.f339686a;
        C122095d dVar = this.f339687b;
        C122562l lVar2 = (C122562l) mVar.f339707d.remove(dVar.f338741d);
        if (lVar2 == null) {
            ((C59052c) mVar.f339706c.mo105765d().mo56372aa(34926)).mo56389s("Received response for unknown request id `%s`.", dVar.f338741d);
            mVar.f339705b.mo20122b(Status.f186906d.mo61677b(String.format("Received response for unknown request id `%s`.", new Object[]{dVar.f338741d})).asException());
            return;
        }
        int i = dVar.f338739b;
        int i2 = i != 0 ? i != 2 ? i != 3 ? 0 : 2 : 1 : 3;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            C2164c cVar = lVar2.f339703b;
            if (i == 2) {
                jVar = (C122101j) dVar.f338740c;
            } else {
                jVar = C122101j.f338749c;
            }
            cVar.mo5437b(jVar);
        } else if (i3 == 1) {
            C2164c cVar2 = lVar2.f339703b;
            Locale locale = Locale.ENGLISH;
            Object[] objArr = new Object[2];
            C122099h hVar = lVar2.f339702a.f338734d;
            if (hVar == null) {
                hVar = C122099h.f338744c;
            }
            if ((hVar.f338746a & 1) != 0) {
                C122106o oVar = hVar.f338747b;
                if (oVar == null) {
                    oVar = C122106o.f338758c;
                }
                int a = C122105n.m201640a(oVar.f338760a);
                int i4 = a - 1;
                if (a == 0) {
                    throw null;
                } else if (i4 == 0) {
                    C122106o oVar2 = hVar.f338747b;
                    if (oVar2 == null) {
                        oVar2 = C122106o.f338758c;
                    }
                    str = oVar2.f338760a == 1 ? (String) oVar2.f338761b : BuildConfig.FLAVOR;
                } else if (i4 == 1) {
                    C122106o oVar3 = hVar.f338747b;
                    if (oVar3 == null) {
                        oVar3 = C122106o.f338758c;
                    }
                    str = "generic: " + (oVar3.f338760a == 2 ? ((Integer) oVar3.f338761b).intValue() : 0);
                } else if (i4 == 2) {
                    str = "<context type not set>";
                } else {
                    throw new AssertionError();
                }
            } else {
                str = "<no context key>";
            }
            objArr[0] = str;
            if (dVar.f338739b == 3) {
                lVar = (C122103l) dVar.f338740c;
            } else {
                lVar = C122103l.f338754c;
            }
            objArr[1] = lVar.f338757b;
            cVar2.mo5439d(new C122872ec("InStreamContextFetcher", String.format(locale, "Context fetching failed for request %s with message %s", objArr)));
        } else if (i3 == 2) {
            lVar2.f339703b.mo5439d(new C122872ec("InStreamContextFetcher", "Response is not set"));
        }
    }
}
