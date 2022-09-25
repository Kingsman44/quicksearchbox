package com.google.android.libraries.onegoogle.accountmenu.features.education;

import com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db.C30578e;
import com.google.protos.p4868ao.p4871b.p4872a.C63655i;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.m */
/* compiled from: PG */
public final /* synthetic */ class C30595m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30601s f82648a;

    /* renamed from: b */
    public final /* synthetic */ boolean f82649b;

    /* renamed from: c */
    public final /* synthetic */ int f82650c;

    public /* synthetic */ C30595m(C30601s sVar, int i, boolean z) {
        this.f82648a = sVar;
        this.f82650c = i;
        this.f82649b = z;
    }

    public final void run() {
        C30601s sVar = this.f82648a;
        int i = this.f82650c;
        boolean z = this.f82649b;
        C30578e eVar = sVar.f82669e;
        String a = C63655i.m96270a(i);
        if (i != 0) {
            eVar.mo36273g(a, z);
            return;
        }
        throw null;
    }
}
