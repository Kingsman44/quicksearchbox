package com.google.android.apps.search.googleapp.p10117aa.p10121d;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.net.p4726a.p4727a.C62722b;
import p5535j.p5536a.p5545c.p5554e.C71164a;
import p5535j.p5536a.p5545c.p5554e.C71165b;

/* renamed from: com.google.android.apps.search.googleapp.aa.d.a */
/* compiled from: PG */
public final class C133118a {

    /* renamed from: a */
    public static final C59071e f362913a = C59071e.m91332i("com.google.android.apps.search.googleapp.aa.d.a");

    /* renamed from: b */
    public final C37215b f362914b;

    /* renamed from: c */
    public boolean f362915c = false;

    /* renamed from: d */
    public int f362916d = 0;

    /* renamed from: e */
    public int f362917e = 0;

    public C133118a(C37215b bVar) {
        this.f362914b = bVar;
    }

    /* renamed from: a */
    public final void mo110981a(C37252a aVar) {
        C71164a aVar2 = (C71164a) C71165b.f189854e.createBuilder();
        int i = this.f362916d;
        aVar2.copyOnWrite();
        C71165b bVar = (C71165b) aVar2.instance;
        bVar.f189857a |= 1;
        bVar.f189858b = i;
        int i2 = this.f362917e;
        aVar2.copyOnWrite();
        C71165b bVar2 = (C71165b) aVar2.instance;
        bVar2.f189857a |= 2;
        bVar2.f189859c = i2;
        C37215b bVar3 = this.f362914b;
        ((C37253b) aVar).mo40792p(C71165b.f189855f, (C71165b) aVar2.build());
        bVar3.mo19974a(aVar);
        this.f362915c = false;
        this.f362916d = 0;
        this.f362917e = 0;
    }

    /* renamed from: b */
    public final void mo110982b() {
        ((C59052c) ((C59052c) f362913a.mo56224b()).mo56372aa(41415)).mo56386p("#logGoogleAppBrowserBackPress");
        this.f362916d++;
    }

    /* renamed from: c */
    public final void mo110983c() {
        if (this.f362915c) {
            mo110981a(C37182a.f97778aJ.mo40805c(C62722b.OK));
        }
    }
}
