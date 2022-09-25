package com.google.android.apps.gsa.search.core.service.p6859i.p6861b.p6862a.p6863a;

import com.google.android.apps.gsa.search.core.service.p6856h.C86744b;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.search.core.service.i.b.a.a.j */
/* compiled from: PG */
public final /* synthetic */ class C86762j implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C86763k f234347a;

    /* renamed from: b */
    public final /* synthetic */ C86744b f234348b;

    /* renamed from: c */
    public final /* synthetic */ boolean f234349c;

    public /* synthetic */ C86762j(C86763k kVar, C86744b bVar, boolean z) {
        this.f234347a = kVar;
        this.f234348b = bVar;
        this.f234349c = z;
    }

    public final void run() {
        C86763k kVar = this.f234347a;
        C86744b bVar = this.f234348b;
        try {
            kVar.mo80377b(bVar, this.f234349c);
        } catch (Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C86763k.f234350a.mo56225c()).mo56382g(th)).mo56372aa(8563)).mo56389s("Error occurred while unloading worker [%s]", bVar.mo80349ia());
        }
    }
}
