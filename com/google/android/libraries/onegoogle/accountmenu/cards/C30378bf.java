package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.content.Context;
import android.support.p033v7.p040e.C0432n;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2333ah;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.LiveData;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmanagement.C30253a;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmanagement.C30282k;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.features.C30635r;
import com.google.android.libraries.onegoogle.common.C30922i;
import com.google.android.libraries.onegoogle.common.C30930q;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.bf */
/* compiled from: PG */
public final class C30378bf extends C0640fb implements C30419ct {

    /* renamed from: a */
    public final C0432n f82118a = new C0432n(Integer.class, new C30375bc(this));

    /* renamed from: b */
    public C58485gu f82119b;

    /* renamed from: c */
    private final Context f82120c;

    /* renamed from: d */
    private final C30253a f82121d;

    /* renamed from: e */
    private final LiveData f82122e;

    /* renamed from: f */
    private final C30922i f82123f;

    /* renamed from: g */
    private final C30897z f82124g;

    /* renamed from: h */
    private final C30420cu f82125h;

    /* renamed from: i */
    private final C2333ah f82126i;

    /* renamed from: j */
    private final C30635r f82127j;

    /* renamed from: k */
    private C2391v f82128k;

    /* renamed from: l */
    private C58485gu f82129l;

    /* renamed from: m */
    private final C30282k f82130m = new C30376bd(this);

    public C30378bf(Context context, C30253a aVar, LiveData liveData, C30922i iVar, C30897z zVar, int i, C30635r rVar) {
        this.f82120c = context;
        this.f82127j = rVar;
        this.f82125h = new C30420cu(context, i);
        this.f82121d = aVar;
        this.f82122e = liveData;
        this.f82119b = C58485gu.m89845m();
        this.f82123f = iVar;
        this.f82124g = zVar;
        this.f82129l = C58485gu.m89845m();
        this.f82126i = new C30374bb(this, aVar);
    }

    /* renamed from: d */
    private final void m56566d(C58485gu guVar) {
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            ((C30365at) guVar.get(i2)).mo35943c(this.f82128k);
        }
    }

    /* renamed from: a */
    public final C58833ax mo35949a(int i) {
        C30365at atVar = (C30365at) this.f82129l.get(i);
        return atVar instanceof C30398bz ? ((C30398bz) atVar).f82169x : C58836b.f156633a;
    }

    /* renamed from: b */
    public final void mo35950b(Object obj) {
        C58480gp gpVar = new C58480gp(4);
        C58485gu guVar = this.f82119b;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C30365at a = ((C30354ai) guVar.get(i)).mo35931a().mo35811a(obj);
            if (a != null) {
                a.f82094i = this.f82123f;
                a.mo35944l();
                gpVar.mo55395g(a);
            }
        }
        C58485gu f = gpVar.mo55394f();
        m56566d(this.f82129l);
        this.f82118a.mo1405b();
        this.f82129l = f;
        for (int i2 = 0; i2 < ((C58724pq) f).f156474d; i2++) {
            ((C30365at) f.get(i2)).mo35942b(this.f82128k, new C30377be(this, i2));
        }
        this.mObservable.mo2879a();
    }

    /* renamed from: c */
    public final int mo35951c(RecyclerView recyclerView, View view) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = 1;
        if (childAdapterPosition == -1) {
            return 1;
        }
        C58833ax a = mo35949a(((Integer) this.f82118a.mo1404a(childAdapterPosition)).intValue());
        if (a.mo56111f() == C30395bw.ALWAYS_HIDE_DIVIDER_CARD) {
            return 1;
        }
        if (childAdapterPosition > 0 && a.equals(mo35949a(((Integer) this.f82118a.mo1404a(childAdapterPosition - 1)).intValue())) && a.mo56113h()) {
            int ordinal = ((C30395bw) a.mo56107c()).ordinal();
            if (!(ordinal == 0 || ordinal == 1 || ordinal == 2)) {
                i = 3;
                if (ordinal != 3) {
                    return 2;
                }
            }
            return i;
        }
        return 2;
    }

    public final int getItemCount() {
        return this.f82118a.f1440c;
    }

    public final int getItemViewType(int i) {
        int i2;
        C30365at atVar = (C30365at) this.f82129l.get(((Integer) this.f82118a.mo1404a(i)).intValue());
        if (atVar instanceof C30358am) {
            i2 = 4;
        } else if ((atVar instanceof C30393bu) || (atVar instanceof C30386bn)) {
            i2 = 2;
        } else if (atVar instanceof C30437e) {
            i2 = 3;
        } else if (atVar instanceof C30398bz) {
            i2 = 1;
        } else {
            throw new IllegalArgumentException("Unsupported card type");
        }
        return i2 - 1;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        recyclerView.addItemDecoration$ar$ds(this.f82125h);
        this.f82128k = C30930q.m57727a(recyclerView);
        C30253a aVar = this.f82121d;
        ((C30306o) aVar).f81934a.f81880a.add(this.f82130m);
        C30282k kVar = this.f82130m;
        ((C30376bd) kVar).f82115a.mo35950b(C30281j.m56319c(((C30306o) this.f82121d).f81934a.f81883d));
        this.f82122e.mo5704e(this.f82128k, this.f82126i);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C30373ba baVar = (C30373ba) ghVar;
        baVar.mo35937a(this.f82128k, (C30365at) this.f82129l.get(((Integer) this.f82118a.mo1404a(i)).intValue()));
        View view = baVar.itemView;
        Integer num = (Integer) view.getTag(R.id.og_card_highlight_id_tag);
        if (num != null) {
            this.f82127j.mo36287c(this.f82128k, view, num.intValue());
        }
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = this.f82120c;
        C30897z zVar = this.f82124g;
        int i2 = new int[]{1, 2, 3, 4}[i];
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 != 0) {
                if (i3 == 1) {
                    return new C30387bo(viewGroup, context, zVar);
                }
                if (i3 != 2) {
                    if (i3 == 3) {
                        return new C30359an(viewGroup, context, zVar);
                    }
                    throw new IllegalArgumentException("Unsupported card type");
                }
            }
            return new C30417cr(viewGroup, context, zVar);
        }
        throw null;
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C30253a aVar = this.f82121d;
        ((C30306o) aVar).f81934a.f81880a.remove(this.f82130m);
        recyclerView.removeItemDecoration(this.f82125h);
        this.f82122e.mo5679j(this.f82126i);
        m56566d(this.f82129l);
        this.f82118a.mo1405b();
    }

    public final /* synthetic */ void onViewRecycled(C0673gh ghVar) {
        ((C30373ba) ghVar).mo35947c(this.f82128k);
    }
}
