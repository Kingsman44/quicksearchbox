package com.google.android.apps.gsa.searchbox.client.gsa.p6951a;

import android.util.Pair;
import android.util.SparseArray;
import com.google.common.base.C58833ax;
import com.google.p4017at.p4060h.p4073d.p4074a.C54229ar;
import java.util.Observable;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.a.f */
/* compiled from: PG */
public final class C88633f extends Observable {

    /* renamed from: a */
    private String f239613a;

    /* renamed from: b */
    private final SparseArray f239614b = new SparseArray();

    /* renamed from: c */
    private final SparseArray f239615c = new SparseArray();

    /* renamed from: d */
    private final SparseArray f239616d = new SparseArray();

    /* renamed from: a */
    public final synchronized Pair mo82294a(int i) {
        return new Pair(this.f239613a, new C88639l((C54229ar) this.f239614b.get(i), ((Long) C58833ax.m90833j((Long) this.f239615c.get(i)).mo56109e(0L)).longValue(), ((Long) C58833ax.m90833j((Long) this.f239616d.get(i)).mo56109e(0L)).longValue()));
    }

    /* renamed from: b */
    public final void mo82295b(int i, String str, C54229ar arVar, long j, long j2) {
        synchronized (this) {
            this.f239613a = str;
            this.f239614b.put(i, arVar);
            this.f239615c.put(i, Long.valueOf(j));
            this.f239616d.put(i, Long.valueOf(j2));
        }
        setChanged();
        notifyObservers(Integer.valueOf(i));
    }
}
