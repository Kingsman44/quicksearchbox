package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3861at.acz;
import com.google.common.base.C58887cx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.bb */
/* compiled from: PG */
public final /* synthetic */ class C108570bb implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C108570bb f302021a = new C108570bb();

    private /* synthetic */ C108570bb() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Exception exc = (Exception) obj;
        C59104x d = C108578bj.f302033a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "DeviceDiscoverySeq");
        ((C59052c) ((C59052c) d).mo56372aa(24142)).mo56389s("Could not Sync Home Automation Provider (%s)", exc.getMessage());
        C89949q.m146525j(C108607cg.m180627a(10), (C60321oe) null, (C63196b) null, (String) null);
        if (exc instanceof CancellationException) {
            return C60856cj.m92898g();
        }
        C58887cx.m90980g(exc);
        return C60856cj.m92900i(acz.f129010n);
    }
}
