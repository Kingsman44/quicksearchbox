package com.google.android.libraries.notifications.p2268e.p2283h.p2284a;

import android.os.Bundle;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29825p;
import com.google.android.libraries.notifications.data.C29826q;
import com.google.android.libraries.notifications.p2268e.p2281g.C29892c;
import com.google.android.libraries.notifications.p2268e.p2281g.C29893d;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55543aw;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/* renamed from: com.google.android.libraries.notifications.e.h.a.q */
/* compiled from: PG */
public final class C29919q extends C29899aa {

    /* renamed from: c */
    private static final Charset f81044c = Charset.forName("UTF-8");

    /* renamed from: d */
    private final C29893d f81045d;

    /* renamed from: e */
    private final C29826q f81046e;

    public C29919q(C29893d dVar, C29826q qVar) {
        this.f81045d = dVar;
        this.f81046e = qVar;
    }

    /* renamed from: e */
    public final String mo35170e() {
        return "RPC_DELETE_USER_SUBSCRIPTION";
    }

    /* renamed from: g */
    public final C29892c mo35217g(Bundle bundle, C55543aw awVar, C29820k kVar) {
        if (kVar == null) {
            return m55364i();
        }
        String h = kVar.mo35009h();
        List<C29825p> b = this.f81046e.mo35097b(h, 4);
        TreeSet treeSet = new TreeSet();
        for (C29825p c : b) {
            treeSet.add(new String(c.mo35038c(), f81044c));
        }
        C29892c c2 = this.f81045d.mo35188c(kVar, new ArrayList(treeSet), awVar);
        if (!c2.mo35205f() || !c2.mo35201d()) {
            this.f81046e.mo35099d(h, b);
        }
        return c2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo35218h() {
        return "DeleteUserSubscriptionCallback";
    }
}
