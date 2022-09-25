package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import android.os.Process;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.l */
/* compiled from: PG */
final class C90852l extends Thread {

    /* renamed from: a */
    final /* synthetic */ C90853m f254038a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90852l(C90853m mVar, Runnable runnable, String str) {
        super(runnable, str);
        this.f254038a = mVar;
    }

    public final void run() {
        try {
            Process.setThreadPriority(this.f254038a.f254040b);
        } catch (SecurityException e) {
            ((C59052c) ((C59052c) ((C59052c) C90853m.f254039a.mo56226d()).mo56382g(e)).mo56372aa(11374)).mo56387q("Failed to set thread priority %d", this.f254038a.f254040b);
            int i = C90755l.f253831a;
        }
        C90476a aVar = C91018d.f254254a;
        super.run();
    }
}
