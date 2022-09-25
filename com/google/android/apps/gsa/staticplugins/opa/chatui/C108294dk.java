package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105958h;
import com.google.common.p4522b.C58480gp;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.dk */
/* compiled from: PG */
final class C108294dk implements Callable {

    /* renamed from: a */
    final /* synthetic */ List f301253a;

    /* renamed from: b */
    final /* synthetic */ List f301254b;

    public C108294dk(List list, List list2) {
        this.f301253a = list;
        this.f301254b = list2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C58480gp gpVar = new C58480gp(4);
        for (int i = 0; i < this.f301253a.size(); i++) {
            C108232bc bcVar = (C108232bc) this.f301253a.get(i);
            C105958h hVar = (C105958h) C90877ak.m148472f((Future) this.f301254b.get(i));
            if (hVar != null) {
                long j = bcVar.f301035q;
                hVar.copyOnWrite();
                C105930ak akVar = (C105930ak) hVar.instance;
                C105930ak akVar2 = C105930ak.f295754i;
                akVar.f295756a |= 65536;
                akVar.f295759d = j;
                String str = bcVar.f301037s;
                if (str != null) {
                    hVar.copyOnWrite();
                    C105930ak akVar3 = (C105930ak) hVar.instance;
                    akVar3.f295756a |= C89885b.S3REQUEST_VALUE;
                    akVar3.f295760e = str;
                }
                gpVar.mo55395g((C105930ak) hVar.build());
            }
        }
        return gpVar.mo55394f();
    }
}
