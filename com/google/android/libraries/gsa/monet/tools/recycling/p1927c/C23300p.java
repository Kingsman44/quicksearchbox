package com.google.android.libraries.gsa.monet.tools.recycling.p1927c;

import android.content.Context;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0654fp;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.recycling.shared.C23308a;

/* renamed from: com.google.android.libraries.gsa.monet.tools.recycling.c.p */
/* compiled from: PG */
public abstract class C23300p extends C23296l {

    /* renamed from: J */
    protected final C23292h f63793J;

    /* renamed from: K */
    public final C23299o f63794K = new C23299o();

    /* renamed from: L */
    public final C23308a f63795L;

    /* renamed from: a */
    private RecyclerView f63796a;

    /* renamed from: b */
    private final C23286b f63797b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23300p(C22945j jVar, C23306v vVar) {
        super(jVar, vVar);
        C23308a aVar = new C23308a();
        C23298n nVar = new C23298n(this);
        this.f63797b = nVar;
        this.f63795L = aVar;
        this.f63793J = new C23292h(this, jVar, aVar);
        this.f63765E = nVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public ViewGroup.LayoutParams mo28798B() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public final View mo28291aa() {
        return mo28799ab(mo28804x());
    }

    /* renamed from: ab */
    public final RecyclerView mo28799ab(Context context) {
        RecyclerView jr = mo28803jr(context);
        this.f63796a = jr;
        jr.setAdapter(this.f63793J);
        this.f63796a.setLayoutParams(mo28798B());
        this.f63796a.setOverScrollMode(2);
        this.f63796a.setTag("RecyclerView");
        RecyclerView recyclerView = this.f63796a;
        recyclerView.mRecycler.mo3036m(this.f63794K);
        this.f63796a.setLayoutManager(mo28801jp(context));
        return this.f63796a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ac */
    public final void mo28800ac() {
        this.f63793J.f63776c = true;
    }

    /* renamed from: im */
    public void mo28298im() {
        RecyclerView recyclerView = this.f63796a;
        if (recyclerView != null) {
            recyclerView.setAdapter((C0640fb) null);
        }
    }

    /* renamed from: ix */
    public void mo28300ix() {
        RecyclerView recyclerView = this.f63796a;
        if (recyclerView != null && recyclerView.mAdapter == null) {
            recyclerView.setAdapter(this.f63793J);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: jp */
    public C0653fo mo28801jp(Context context) {
        return new LinearLayoutManager(context, 1, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: jq */
    public C0654fp mo28802jq() {
        return new C0654fp(-1, -2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: jr */
    public RecyclerView mo28803jr(Context context) {
        return new RecyclerView(context);
    }

    /* renamed from: js */
    public void mo28301js() {
        this.f63794K.mo3020e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract Context mo28804x();
}
