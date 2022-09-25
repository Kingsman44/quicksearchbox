package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import android.net.Uri;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90996e;
import com.google.android.apps.gsa.sidekick.main.entry.C91307al;
import com.google.android.apps.gsa.sidekick.main.entry.C91340br;
import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.s */
/* compiled from: PG */
public final /* synthetic */ class C98137s implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C98064as f274045a;

    /* renamed from: b */
    public final /* synthetic */ Uri f274046b;

    public /* synthetic */ C98137s(C98064as asVar, Uri uri) {
        this.f274045a = asVar;
        this.f274046b = uri;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C98064as asVar = this.f274045a;
        Uri uri = this.f274046b;
        C118826c cVar = (C118826c) obj;
        asVar.f273820p.mo85270f("internalHandleExpiredNotifications", C90996e.f254198a);
        C91307al alVar = (C91307al) asVar.f273818n.mo17428b();
        return asVar.mo90923r("handleExpiredNotifications", asVar.mo90921p(new C91340br(alVar, uri, asVar.f273807c), true), alVar);
    }
}
