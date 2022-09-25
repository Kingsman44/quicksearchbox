package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p746b;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.gsa.p8883x.C118826c;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.f.b.e */
/* compiled from: PG */
public final /* synthetic */ class C12121e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C12127k f38748a;

    /* renamed from: b */
    public final /* synthetic */ boolean f38749b;

    public /* synthetic */ C12121e(C12127k kVar, boolean z) {
        this.f38748a = kVar;
        this.f38749b = z;
    }

    public final void run() {
        C12127k kVar = this.f38748a;
        boolean z = this.f38749b;
        if (!kVar.f38768f) {
            if (z) {
                kVar.f38768f = true;
                kVar.f38764b.mo20339gQ(true);
                C2164c cVar = kVar.f38767e;
                if (cVar != null) {
                    cVar.mo5437b(C118826c.f331422a);
                }
                kVar.f38765c.mo20427b();
            } else {
                kVar.f38765c.mo20430e();
            }
            kVar.f38769g = z;
        }
    }
}
