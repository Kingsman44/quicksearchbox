package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.bf */
/* compiled from: PG */
public final /* synthetic */ class C102162bf implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C102163bg f284995a;

    /* renamed from: b */
    public final /* synthetic */ int f284996b;

    public /* synthetic */ C102162bf(C102163bg bgVar, int i) {
        this.f284995a = bgVar;
        this.f284996b = i;
    }

    public final void run() {
        C102163bg bgVar = this.f284995a;
        int i = this.f284996b;
        C9439b bVar = C9439b.UNKNOWN_ENTRY;
        int i2 = i - 1;
        if (i2 == 1) {
            bgVar.f284997a.mo92921f(3);
        } else if (i2 == 2 || i2 == 3) {
            bgVar.f284997a.mo92921f(4);
        } else if (i2 != 4) {
            ((C59052c) ((C59052c) C102166bj.f285000a.mo56225c()).mo56372aa(20600)).mo56386p("Should never happen - unknown consenting result");
        } else {
            bgVar.f284997a.mo92921f(6);
        }
    }
}
