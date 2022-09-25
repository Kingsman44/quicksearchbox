package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9282a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.C122872ec;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122859d;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.C122091a;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122099h;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122106o;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.a.j */
/* compiled from: PG */
public final /* synthetic */ class C122560j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122561k f339692a;

    /* renamed from: b */
    public final /* synthetic */ C122859d f339693b;

    /* renamed from: c */
    public final /* synthetic */ String f339694c;

    /* renamed from: d */
    public final /* synthetic */ C122099h f339695d;

    public /* synthetic */ C122560j(C122561k kVar, C122859d dVar, String str, C122099h hVar) {
        this.f339692a = kVar;
        this.f339693b = dVar;
        this.f339694c = str;
        this.f339695d = hVar;
    }

    public final C60870cx apply(Object obj) {
        String str;
        C122561k kVar = this.f339692a;
        C122859d dVar = this.f339693b;
        String str2 = this.f339694c;
        C122099h hVar = this.f339695d;
        Throwable th = (Throwable) obj;
        ((C59052c) ((C59052c) dVar.mo105766e().mo56382g(th)).mo56372aa(34920)).mo56389s("Fetching client context failed %s", str2);
        if ((hVar.f338746a & 1) != 0) {
            if (th instanceof C122872ec) {
                str = ((C122872ec) th).f340336b;
            } else {
                str = th.toString();
            }
            synchronized (kVar) {
                List list = kVar.f339697b;
                C122106o oVar = hVar.f338747b;
                if (oVar == null) {
                    oVar = C122106o.f338758c;
                }
                list.add(new C122091a(oVar, str));
            }
        }
        return C60856cj.m92899h(th);
    }
}
