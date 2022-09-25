package com.facebook.litho.widget;

import android.os.SystemClock;
import androidx.core.p098j.C2043bi;
import com.facebook.litho.C6154cb;
import com.facebook.litho.C6227ea;
import com.facebook.litho.LithoView;

/* renamed from: com.facebook.litho.widget.cb */
/* compiled from: PG */
final class C6470cb implements C6227ea {

    /* renamed from: a */
    final /* synthetic */ LithoView f19170a;

    /* renamed from: b */
    final /* synthetic */ C6471cc f19171b;

    public C6470cb(C6471cc ccVar, LithoView lithoView) {
        this.f19171b = ccVar;
        this.f19170a = lithoView;
    }

    /* renamed from: a */
    public final void mo13191a() {
        int childAdapterPosition = this.f19171b.f19172a.f19224q.getChildAdapterPosition(this.f19170a);
        if (childAdapterPosition != -1) {
            C6474cf cfVar = this.f19171b.f19172a;
            SystemClock.uptimeMillis();
            C6548m mVar = (C6548m) cfVar.f19203a.get(childAdapterPosition);
            C6154cb d = mVar.mo13632d().mo13522d();
            if (d != null && mVar.f19499a.get() == 0) {
                C2043bi.m5520N(cfVar.f19224q, new C6473ce(d));
                mVar.f19499a.set(2);
            }
            this.f19170a.f17943s = null;
        }
    }
}
