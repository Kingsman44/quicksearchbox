package com.google.android.apps.gsa.staticplugins.searchboxroot;

import android.os.Bundle;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89206k;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.w */
/* compiled from: PG */
final class C117041w implements C89206k {

    /* renamed from: a */
    public final Object f324931a = new Object();

    /* renamed from: b */
    public Bundle f324932b = null;

    /* renamed from: a */
    public final Bundle mo82386a(String str) {
        Bundle bundle;
        synchronized (this.f324931a) {
            Bundle bundle2 = this.f324932b;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
                if (bundle != null) {
                }
            } else {
                C59104x d = C117042x.f324933a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "sb.r.SbWorkerImpl");
                ((C59052c) ((C59052c) d).mo56372aa(32436)).mo56386p("Storage attempt without an active bundle. This breaks logging.");
                int i = C90755l.f253831a;
                this.f324932b = new Bundle();
                ClassLoader classLoader = C117042x.f324934b;
                if (classLoader != null) {
                    this.f324932b.setClassLoader(classLoader);
                }
            }
            bundle = new Bundle();
            this.f324932b.putBundle(str, bundle);
        }
        return bundle;
    }

    /* renamed from: b */
    public final Object mo82387b() {
        return this.f324931a;
    }
}
