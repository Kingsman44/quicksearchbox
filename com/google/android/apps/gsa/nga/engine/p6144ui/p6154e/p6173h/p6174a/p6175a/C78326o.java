package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6175a;

import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82444fk;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82445fl;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.a.o */
/* compiled from: PG */
public final /* synthetic */ class C78326o implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C78335x f215642a;

    /* renamed from: b */
    public final /* synthetic */ String f215643b;

    public /* synthetic */ C78326o(C78335x xVar, String str) {
        this.f215642a = xVar;
        this.f215643b = str;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C78335x xVar = this.f215642a;
        String str = this.f215643b;
        Exception exc = (Exception) obj;
        if (exc instanceof TimeoutException) {
            C83305i iVar = xVar.f215665i;
            if (str != null) {
                iVar.mo75579d(new C82444fk("NGA_UI_SUGGESTION_INVOCATION_COLLECTION_TIMEOUT", str));
                if (xVar.f215665i.mo75578c() != null) {
                    C83305i iVar2 = xVar.f215665i;
                    String c = iVar2.mo75578c();
                    if (c != null) {
                        iVar2.mo75579d(new C82445fl("NGA_UI_SUGGESTION_INVOCATION_COLLECTION_TIMEOUT_PER_DEVICE", c, str));
                    } else {
                        throw new NullPointerException("Null deviceModel");
                    }
                }
            } else {
                throw new NullPointerException("Null providerName");
            }
        }
        ((C59052c) ((C59052c) ((C59052c) C78335x.f215657a.mo56226d()).mo56382g(exc)).mo56372aa(5119)).mo56389s("Failed to collect data from %s", str);
    }
}
