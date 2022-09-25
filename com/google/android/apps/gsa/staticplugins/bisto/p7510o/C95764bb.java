package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import androidx.core.content.C1882h;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.bb */
/* compiled from: PG */
public final class C95764bb extends PhoneStateListener implements AutoCloseable {

    /* renamed from: b */
    private static final C59071e f268130b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.o.bb");

    /* renamed from: a */
    public volatile int f268131a = 0;

    /* renamed from: c */
    private final Context f268132c;

    /* renamed from: d */
    private final Set f268133d = new HashSet();

    public C95764bb(Context context, C95850a aVar) {
        this.f268132c = context;
        C58976aa aaVar = C58975e.f156826a;
        aVar.f268408a.add(this);
    }

    /* renamed from: a */
    public final void mo89754a(C95763ba baVar) {
        this.f268133d.add(baVar);
    }

    /* renamed from: b */
    public final void mo89755b(int i) {
        TelephonyManager telephonyManager = (TelephonyManager) this.f268132c.getSystemService("phone");
        if (telephonyManager == null) {
            C59104x c = f268130b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PhoneCallStateListener");
            ((C59052c) ((C59052c) c).mo56372aa(15313)).mo56386p("No TelephonyManager");
            return;
        }
        try {
            if (C1882h.m5137c(this.f268132c, "android.permission.READ_PHONE_STATE") == 0) {
                telephonyManager.listen(this, i);
                return;
            }
            C59104x b = f268130b.mo56224b();
            b.mo56378ag(C58975e.f156826a, "PhoneCallStateListener");
            ((C59052c) ((C59052c) b).mo56372aa(15311)).mo56386p("Calling telephoneManager.listen() when we do not have phone state read permissions");
        } catch (SecurityException e) {
            C59104x d = f268130b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PhoneCallStateListener");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(15312)).mo56387q("SecurityException establishing phone call listener for event=%d", i);
        }
    }

    /* renamed from: c */
    public final void mo89756c(C95763ba baVar) {
        this.f268133d.remove(baVar);
    }

    public final void close() {
        this.f268133d.clear();
        mo89755b(0);
    }

    public final void onCallStateChanged(int i, String str) {
        super.onCallStateChanged(i, str);
        if (i != this.f268131a) {
            C59104x b = f268130b.mo56224b();
            b.mo56378ag(C58975e.f156826a, "PhoneCallStateListener");
            ((C59052c) ((C59052c) b).mo56372aa(15314)).mo56387q("Got new call state: %d", i);
            int i2 = this.f268131a;
            this.f268131a = i;
            Iterator it = new HashSet(this.f268133d).iterator();
            while (it.hasNext()) {
                ((C95763ba) it.next()).mo89753d(i2, i);
            }
        }
    }
}
