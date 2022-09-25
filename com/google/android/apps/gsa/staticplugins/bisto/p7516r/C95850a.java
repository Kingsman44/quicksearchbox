package com.google.android.apps.gsa.staticplugins.bisto.p7516r;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.ConcurrentLinkedDeque;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.r.a */
/* compiled from: PG */
public final class C95850a implements AutoCloseable {

    /* renamed from: b */
    private static final C59071e f268407b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.r.a");

    /* renamed from: a */
    public final ConcurrentLinkedDeque f268408a = new ConcurrentLinkedDeque();

    public final void close() {
        while (true) {
            AutoCloseable autoCloseable = (AutoCloseable) this.f268408a.pollLast();
            if (autoCloseable != null) {
                C58976aa aaVar = C58975e.f156826a;
                try {
                    autoCloseable.close();
                } catch (Exception e) {
                    C59104x c = f268407b.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "CloseableRegistry");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(15484)).mo56389s("Failed to close %s", autoCloseable);
                }
            } else {
                return;
            }
        }
    }
}
