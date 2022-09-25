package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.ao */
/* compiled from: PG */
public final /* synthetic */ class C95337ao implements C95352bc {

    /* renamed from: a */
    public final /* synthetic */ C95345aw f266732a;

    /* renamed from: b */
    public final /* synthetic */ C95393cq f266733b;

    /* renamed from: c */
    public final /* synthetic */ int f266734c;

    /* renamed from: d */
    public final /* synthetic */ C95354be f266735d;

    /* renamed from: e */
    public final /* synthetic */ SettableFuture f266736e;

    public /* synthetic */ C95337ao(C95345aw awVar, C95393cq cqVar, int i, C95354be beVar, SettableFuture settableFuture) {
        this.f266732a = awVar;
        this.f266733b = cqVar;
        this.f266734c = i;
        this.f266735d = beVar;
        this.f266736e = settableFuture;
    }

    /* renamed from: E */
    public final boolean mo89254E(String str, int i, int i2, byte[] bArr) {
        C95345aw awVar = this.f266732a;
        C95393cq cqVar = this.f266733b;
        int i3 = this.f266734c;
        C95354be beVar = this.f266735d;
        SettableFuture settableFuture = this.f266736e;
        if (!awVar.f266748b.equals(str)) {
            return false;
        }
        int e = cqVar.mo89335e();
        if (e == 0) {
            throw null;
        } else if (e != i || i3 != i2) {
            return false;
        } else {
            try {
                C58833ax a = beVar.mo89287a(bArr);
                if (!a.mo56113h()) {
                    return false;
                }
                settableFuture.mo57356n(a.mo56107c());
                return true;
            } catch (C95351bb | RuntimeException e2) {
                settableFuture.mo57357o(e2);
            }
        }
    }
}
