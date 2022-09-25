package com.google.apps.tiktok.dataservice.p3638c;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58815af;
import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;
import java.util.List;

/* renamed from: com.google.apps.tiktok.dataservice.c.l */
/* compiled from: PG */
public final class C46755l extends C0640fb {

    /* renamed from: a */
    public final C58815af f122108a;

    /* renamed from: b */
    public final C46745b f122109b;

    /* renamed from: c */
    private final C58817ah f122110c;

    /* renamed from: d */
    private final C58817ah f122111d;

    /* renamed from: e */
    private List f122112e;

    /* renamed from: f */
    private final C46744a f122113f;

    public C46755l(C58817ah ahVar, C58817ah ahVar2, C58815af afVar, C46745b bVar, C46744a aVar) {
        this.f122110c = ahVar;
        this.f122111d = ahVar2;
        this.f122108a = afVar;
        this.f122109b = bVar;
        this.f122113f = aVar;
    }

    /* renamed from: a */
    public final void mo50772a(List list) {
        C19559g.m37304c();
        List list2 = this.f122112e;
        this.f122112e = list;
        if (list2 == null && list != null) {
            this.mObservable.mo2882d(0, list.size());
            return;
        } else if (list2 != null && list == null) {
            this.mObservable.mo2883e(0, list2.size());
            return;
        } else if (list2 == null || this.f122108a == null || this.f122109b == null) {
            this.mObservable.mo2879a();
            return;
        } else if (C47831fm.m85027v()) {
            C47558bi a = C47831fm.m85006a("RecyclerView Data Diff");
            try {
                this.f122109b.mo50766a(list2, list, this.f122108a, this);
                a.close();
                return;
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        } else {
            this.f122109b.mo50766a(list2, list, this.f122108a, this);
            return;
        }
        throw th;
    }

    public final int getItemCount() {
        List list = this.f122112e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final long getItemId(int i) {
        C58817ah ahVar;
        List list = this.f122112e;
        if (list == null || (ahVar = this.f122111d) == null) {
            return -1;
        }
        return (long) ahVar.apply(list.get(i)).hashCode();
    }

    public final int getItemViewType(int i) {
        C46744a aVar = this.f122113f;
        C46756m mVar = (C46756m) this.f122110c.apply(this.f122112e.get(i));
        Integer num = (Integer) aVar.f122085a.get(mVar);
        if (num == null) {
            int i2 = aVar.f122087c;
            aVar.f122087c = i2 + 1;
            num = Integer.valueOf(i2);
            aVar.f122085a.put(mVar, num);
            aVar.f122086b.put(num.intValue(), mVar);
        }
        return num.intValue();
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        boolean z = true;
        if (recyclerView.mHasFixedSize && getItemCount() <= 0 && (layoutParams.height == -2 || layoutParams.width == -2)) {
            z = false;
        }
        C58838bb.m90884s(z, "RecyclerViews that use WRAP_CONTENT with setHasFixedSize(true) won't resize on new data. If you have static data, you should set it on the adapter before setAdapter().");
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C46754k kVar = (C46754k) ghVar;
        C46756m a = this.f122113f.mo50765a(kVar.mItemViewType);
        try {
            a.mo18114b(kVar.f122107a, this.f122112e.get(i));
        } catch (ClassCastException e) {
            throw new IllegalStateException(String.format("Attempting to bind data with an incompatible ViewBinder class (%s). Check that your ViewBinder function is correct.", new Object[]{a}), e);
        }
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        C46756m a = this.f122113f.mo50765a(i);
        C58838bb.m90866a(a, "No ViewBinder for the provided viewType");
        return new C46754k(a.mo18113a(viewGroup));
    }

    public final /* bridge */ /* synthetic */ void onViewRecycled(C0673gh ghVar) {
        C46754k kVar = (C46754k) ghVar;
        this.f122113f.mo50765a(kVar.mItemViewType).mo50773c(kVar.f122107a);
    }
}
