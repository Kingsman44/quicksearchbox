package com.google.android.gms.mdh.internal;

import android.accounts.Account;
import com.google.android.gms.mdh.C145078l;
import com.google.android.gms.mdh.SyncPolicy;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.tasks.C146014aj;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.mdh.internal.aq */
/* compiled from: PG */
public final class C145050aq implements C145078l {

    /* renamed from: a */
    public final Executor f392098a;

    /* renamed from: b */
    public final Executor f392099b;

    /* renamed from: c */
    public final C145070u f392100c;

    /* renamed from: d */
    public final C145073x f392101d;

    /* renamed from: e */
    public final Account f392102e;

    /* renamed from: f */
    public final int f392103f;

    /* renamed from: g */
    public final int f392104g;

    /* renamed from: h */
    public final Deque f392105h = new ArrayDeque();

    /* renamed from: i */
    public final WeakHashMap f392106i = new WeakHashMap();

    public C145050aq(Executor executor, Executor executor2, C145070u uVar, C145073x xVar, Account account, int i, int i2) {
        this.f392098a = executor;
        this.f392099b = executor2;
        this.f392100c = uVar;
        this.f392101d = xVar;
        this.f392102e = account;
        this.f392103f = i;
        this.f392104g = i2;
    }

    /* renamed from: b */
    public static void m235697b(C146010af afVar, C146006ab abVar) {
        if (abVar.mo122491j()) {
            afVar.f394698a.mo122510x(abVar.mo122488g());
            return;
        }
        Exception f = abVar.mo122487f();
        if (f != null) {
            afVar.f394698a.mo122509w(f);
        }
    }

    /* renamed from: a */
    public final C146006ab mo120577a(SyncPolicy syncPolicy, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter) {
        C146014aj ajVar;
        C146010af afVar = new C146010af();
        synchronized (this.f392105h) {
            C145047an anVar = new C145047an(this, afVar, syncPolicy, timeSeriesFootprintsSubscriptionFilter);
            if (this.f392105h.isEmpty()) {
                anVar.mo120576a();
            }
            this.f392105h.add(anVar);
            ajVar = afVar.f394698a;
        }
        return ajVar;
    }
}
