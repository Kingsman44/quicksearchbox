package com.google.android.apps.gsa.staticplugins.p7415au;

import androidx.p060c.C0984n;
import com.google.android.libraries.gsa.p1876k.C22869e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.au.f */
/* compiled from: PG */
public final /* synthetic */ class C94136f implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C94137g f262999a;

    public /* synthetic */ C94136f(C94137g gVar) {
        this.f262999a = gVar;
    }

    public final void run() {
        C0984n nVar;
        int i;
        int i2;
        C94137g gVar = this.f262999a;
        synchronized (gVar.f263002c) {
            List<String> list = gVar.f263001b;
            nVar = new C0984n(0);
            for (String str : list) {
                if (nVar.containsKey(str)) {
                    Integer num = (Integer) nVar.get(str);
                    num.getClass();
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                nVar.put(str, Integer.valueOf(i2 + 1));
            }
            gVar.f263001b.clear();
            gVar.f263003f = false;
        }
        for (i = 0; i < nVar.f3122d; i++) {
            int intValue = ((Integer) nVar.mo3708h(i)).intValue();
            gVar.f263000a.a((String) nVar.mo3702e(i), intValue);
        }
    }
}
