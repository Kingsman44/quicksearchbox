package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.go */
/* compiled from: PG */
public final /* synthetic */ class C109078go implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C109258hw f303690a;

    /* renamed from: b */
    public final /* synthetic */ List f303691b;

    public /* synthetic */ C109078go(C109258hw hwVar, List list) {
        this.f303690a = hwVar;
        this.f303691b = list;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C109258hw hwVar = this.f303690a;
        List list = this.f303691b;
        ((Optional) obj).ifPresent(new C109200hg(hwVar, list));
        hwVar.f304280c.mo95406aq(list, false, 2, false);
    }
}
