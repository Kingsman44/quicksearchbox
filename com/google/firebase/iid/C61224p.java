package com.google.firebase.iid;

import android.util.Pair;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146025e;

/* renamed from: com.google.firebase.iid.p */
/* compiled from: PG */
public final /* synthetic */ class C61224p implements C146025e {

    /* renamed from: a */
    public final /* synthetic */ C61225q f165609a;

    /* renamed from: b */
    public final /* synthetic */ Pair f165610b;

    public /* synthetic */ C61224p(C61225q qVar, Pair pair) {
        this.f165609a = qVar;
        this.f165610b = pair;
    }

    /* renamed from: a */
    public final Object mo37294a(C146006ab abVar) {
        C61225q qVar = this.f165609a;
        Pair pair = this.f165610b;
        synchronized (qVar) {
            qVar.f165611a.remove(pair);
        }
        return abVar;
    }
}
