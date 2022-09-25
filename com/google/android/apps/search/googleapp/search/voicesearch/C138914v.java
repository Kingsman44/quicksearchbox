package com.google.android.apps.search.googleapp.search.voicesearch;

import android.view.View;
import android.widget.AdapterView;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.v */
/* compiled from: PG */
final class C138914v implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ C138859r f377846a;

    public C138914v(C138859r rVar) {
        this.f377846a = rVar;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i == C58485gu.m89842j(this.f377846a.f377695D.f377566b).size()) {
            C46459k.m82829b(this.f377846a.f377719u.mo114611b(true), "Failed to update auto switch selected.", new Object[0]);
            return;
        }
        this.f377846a.f377719u.mo114611b(false);
        String str = (String) this.f377846a.f377695D.f377566b.get(i);
        ArrayList arrayList = new ArrayList(C58485gu.m89842j(this.f377846a.f377695D.f377566b));
        arrayList.remove(str);
        C46459k.m82829b(this.f377846a.f377700b.mo104003f(str, arrayList), "Failed to update spoken and additional spoken languages preference.", new Object[0]);
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
