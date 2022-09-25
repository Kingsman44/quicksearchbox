package com.google.android.apps.gsa.staticplugins.p8163o.p8165b;

import androidx.media3.common.C2651bm;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62910ar;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.b.k */
/* compiled from: PG */
public final /* synthetic */ class C105816k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C105823r f295199a;

    /* renamed from: b */
    public final /* synthetic */ List f295200b;

    public /* synthetic */ C105816k(C105823r rVar, List list) {
        this.f295199a = rVar;
        this.f295200b = list;
    }

    public final void run() {
        C105823r rVar = this.f295199a;
        List list = this.f295200b;
        if (!rVar.f295214h) {
            for (int i = 0; i < Math.min(rVar.f295210d.size(), list.size()); i++) {
                C105830y yVar = (C105830y) rVar.f295210d.get(i);
                C62910ar arVar = (C62910ar) list.get(i);
                if (yVar.f295230c.mo56113h() && (yVar.f295230c.mo56107c() instanceof C105829x)) {
                    C105829x xVar = (C105829x) yVar.f295230c.mo56107c();
                    if (!xVar.f295226b.equals(arVar)) {
                        yVar.f295230c = C58833ax.m90834k(new C105829x(xVar.f295227d, arVar));
                        yVar.mo6952y((C2651bm) yVar.f295230c.mo56107c());
                    }
                }
            }
        }
    }
}
