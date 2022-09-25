package com.google.android.apps.gsa.staticplugins.p7850dq.p7852b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90125fw;
import com.google.android.libraries.gsa.p1833c.p1834a.C22229ba;
import com.google.assistant.p3897e.p3921j.C52582xb;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70334de;

/* renamed from: com.google.android.apps.gsa.staticplugins.dq.b.d */
/* compiled from: PG */
public final /* synthetic */ class C99956d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C52582xb f279608a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f279609b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f279610c;

    /* renamed from: d */
    public final /* synthetic */ String f279611d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f279612e;

    /* renamed from: f */
    public final /* synthetic */ C86124t f279613f;

    public /* synthetic */ C99956d(C52582xb xbVar, C60870cx cxVar, C60870cx cxVar2, String str, C60870cx cxVar3, C86124t tVar) {
        this.f279608a = xbVar;
        this.f279609b = cxVar;
        this.f279610c = cxVar2;
        this.f279611d = str;
        this.f279612e = cxVar3;
        this.f279613f = tVar;
    }

    public final Object call() {
        C52582xb xbVar = this.f279608a;
        C60870cx cxVar = this.f279609b;
        C60870cx cxVar2 = this.f279610c;
        String str = this.f279611d;
        C60870cx cxVar3 = this.f279612e;
        C86124t tVar = this.f279613f;
        C22229ba baVar = (C22229ba) cxVar.get();
        String str2 = (String) cxVar2.get();
        C70334de deVar = new C70334de();
        deVar.mo62033h(new C70290cs("X-Android-Package", C70334de.f187481c), str);
        deVar.mo62033h(new C70290cs("X-Android-Cert", C70334de.f187481c), (String) cxVar3.get());
        C58833ax a = C99958f.m165629a(tVar, xbVar);
        if (!tVar.mo79746e(C90125fw.f250893J) || a.mo56113h()) {
            ((C59052c) ((C59052c) C99958f.f279615a.mo56224b()).mo56372aa(33155)).mo56386p("Using API key");
            deVar.mo62033h(new C70290cs("X-Goog-Api-Key", C70334de.f187481c), (String) a.mo56109e(tVar.mo79758x(C90125fw.f250910a)));
        } else {
            ((C59052c) ((C59052c) C99958f.f279615a.mo56224b()).mo56372aa(33156)).mo56386p("Using OAuth token");
            baVar.f61375c = str2;
        }
        baVar.f61374b = deVar;
        return baVar.mo27490a();
    }
}
