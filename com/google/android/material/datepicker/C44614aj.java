package com.google.android.material.datepicker;

import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.aj */
/* compiled from: PG */
final class C44614aj implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ MaterialCalendarGridView f116251a;

    /* renamed from: b */
    final /* synthetic */ C44616al f116252b;

    public C44614aj(C44616al alVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f116252b = alVar;
        this.f116251a = materialCalendarGridView;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C44613ai a = this.f116251a.mo47811a();
        if (i >= a.mo47847b() && i <= a.mo47848c()) {
            C44642o oVar = this.f116252b.f116255a;
            long longValue = this.f116251a.mo47811a().getItem(i).longValue();
            if (oVar.f116305a.f116319b.f116190c.mo47798a(longValue)) {
                oVar.f116305a.f116318a.mo47804f(longValue);
                Iterator it = oVar.f116305a.f116260i.iterator();
                while (it.hasNext()) {
                    ((C44617am) it.next()).mo47836b(oVar.f116305a.f116318a.mo47800b());
                }
                oVar.f116305a.f116323f.mAdapter.mObservable.mo2879a();
                RecyclerView recyclerView = oVar.f116305a.f116322e;
                if (recyclerView != null) {
                    recyclerView.mAdapter.mObservable.mo2879a();
                }
            }
        }
    }
}
