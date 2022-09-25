package com.google.android.libraries.geller.portable;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.protos.p4985f.p5030q.p5032b.C65077x;

/* renamed from: com.google.android.libraries.geller.portable.ac */
/* compiled from: PG */
final class C21937ac implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f60519a;

    /* renamed from: b */
    final /* synthetic */ C65077x f60520b;

    /* renamed from: c */
    final /* synthetic */ Geller f60521c;

    public C21937ac(Geller geller, String str, C65077x xVar) {
        this.f60521c = geller;
        this.f60519a = str;
        this.f60520b = xVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) Geller.f60378a.mo56225c()).mo56382g(th)).mo56372aa(48022)).mo56386p("Unexpected failure invoking storageOperationsCallback.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (((Long) obj).longValue() > 0) {
            this.f60521c.f60384f.onDeletion(this.f60519a, this.f60520b.toByteArray());
        }
    }
}
