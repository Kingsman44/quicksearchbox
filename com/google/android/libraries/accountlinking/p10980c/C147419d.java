package com.google.android.libraries.accountlinking.p10980c;

import android.app.Application;
import androidx.lifecycle.C2352b;
import com.google.android.libraries.accountlinking.activity.C147395w;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.libraries.accountlinking.c.d */
/* compiled from: PG */
public final class C147419d extends C2352b {

    /* renamed from: c */
    private static final C58974d f397944c = C58974d.m91134h("GAL");

    /* renamed from: b */
    public final C147417b f397945b;

    public C147419d(Application application, C147395w wVar) {
        super(application);
        C147416a aVar = null;
        if (wVar.f397894c) {
            ((C58970a) ((C58970a) f397944c.mo56226d()).mo56372aa(42244)).mo56386p("Custom DependencySupplier is missing");
        } else {
            try {
                aVar = new C147416a(application, wVar.f397897f, wVar.f397898g);
            } catch (IllegalStateException unused) {
            }
        }
        this.f397945b = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo639d() {
        C147417b bVar = this.f397945b;
        if (bVar != null) {
            bVar.mo124160a();
        }
    }
}
