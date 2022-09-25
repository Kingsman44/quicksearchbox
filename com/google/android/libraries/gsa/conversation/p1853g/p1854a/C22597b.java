package com.google.android.libraries.gsa.conversation.p1853g.p1854a;

import com.google.android.libraries.gsa.conversation.p1858i.C22724a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.gsa.conversation.g.a.b */
/* compiled from: PG */
final class C22597b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f62251a;

    /* renamed from: b */
    final /* synthetic */ C63010eb f62252b;

    /* renamed from: c */
    final /* synthetic */ int f62253c;

    /* renamed from: d */
    final /* synthetic */ String f62254d;

    /* renamed from: e */
    final /* synthetic */ C22724a f62255e;

    public C22597b(SettableFuture settableFuture, C63010eb ebVar, int i, String str, C22724a aVar) {
        this.f62251a = settableFuture;
        this.f62252b = ebVar;
        this.f62253c = i;
        this.f62254d = str;
        this.f62255e = aVar;
    }

    /* renamed from: c */
    private final void m42088c(Throwable th) {
        int i = this.f62253c;
        if (i > 0) {
            this.f62251a.mo57358p(C22598c.m42091a(this.f62254d, this.f62252b, i - 1, this.f62255e));
            return;
        }
        ((C59052c) ((C59052c) ((C59052c) C22598c.f62256a.mo56225c()).mo56382g(th)).mo56372aa(48386)).mo56389s("Failed to read content for: %s", this.f62254d);
        this.f62251a.mo57357o(th);
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        m42088c(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            this.f62251a.mo57356n(C58836b.f156633a);
            return;
        }
        try {
            this.f62251a.mo57356n(C58833ax.m90834k((MessageLite) this.f62252b.mo59010i((byte[]) axVar.mo56107c())));
        } catch (C62974ct e) {
            m42088c(e);
        }
    }
}
