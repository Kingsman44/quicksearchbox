package com.google.android.libraries.onegoogle.accountmanagement.p2350b;

import android.content.Context;
import android.content.res.Resources;
import android.support.p033v7.p040e.C0424f;
import android.support.p033v7.p040e.C0429k;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import androidx.lifecycle.C2333ah;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.disc.C30213m;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.account.particle.C30233g;
import com.google.android.libraries.onegoogle.account.particle.C30238l;
import com.google.android.libraries.onegoogle.accountmanagement.C30253a;
import com.google.android.libraries.onegoogle.accountmanagement.C30282k;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.common.C30922i;
import com.google.android.libraries.onegoogle.p2380c.C30860b;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.onegoogle.accountmanagement.b.p */
/* compiled from: PG */
public final class C30271p extends C0640fb {

    /* renamed from: a */
    public final C30158c f81845a;

    /* renamed from: b */
    public final C58833ax f81846b;

    /* renamed from: c */
    public Object f81847c;

    /* renamed from: d */
    public C58485gu f81848d;

    /* renamed from: e */
    private final C30213m f81849e;

    /* renamed from: f */
    private final C30253a f81850f;

    /* renamed from: g */
    private final C30897z f81851g;

    /* renamed from: h */
    private final C58833ax f81852h;

    /* renamed from: i */
    private final boolean f81853i;

    /* renamed from: j */
    private final C30262g f81854j;

    /* renamed from: k */
    private final List f81855k = new ArrayList();

    /* renamed from: l */
    private final C30922i f81856l;

    /* renamed from: m */
    private final C30282k f81857m = new C30269n(this);

    /* renamed from: n */
    private final int f81858n;

    /* renamed from: o */
    private final C2333ah f81859o = new C30265j(this);

    public C30271p(Context context, C30263h hVar, C30261f fVar, C30922i iVar, C63644b bVar, C30897z zVar, int i, C58833ax axVar) {
        C30272q qVar = (C30272q) hVar;
        this.f81849e = qVar.f81860a;
        this.f81845a = qVar.f81861b;
        C30253a aVar = qVar.f81862c;
        this.f81850f = aVar;
        this.f81846b = qVar.f81866g;
        this.f81853i = qVar.f81864e;
        this.f81851g = zVar;
        this.f81852h = axVar;
        this.f81856l = iVar;
        Context context2 = context;
        C30266k kVar = new C30266k(this, iVar, context);
        C30860b bVar2 = qVar.f81865f;
        bVar.getClass();
        this.f81854j = new C30262g(aVar, bVar2, bVar, zVar, fVar, kVar);
        this.f81858n = i;
    }

    /* renamed from: a */
    public static int m56305a(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_padding_start);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_icon_margin);
        return dimensionPixelSize + dimensionPixelSize2 + dimensionPixelSize2 + resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_icon_size) + resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_title_margin_start);
    }

    /* renamed from: b */
    public final void mo35785b() {
        C19559g.m37304c();
        ArrayList arrayList = new ArrayList(this.f81855k);
        C58485gu guVar = this.f81848d;
        if (((C30233g) ((C58847bk) this.f81852h).f156646a).mo35710e().mo56113h()) {
            C58480gp gpVar = new C58480gp(4);
            C58480gp gpVar2 = new C58480gp(4);
            int size = guVar.size();
            for (int i = 0; i < size; i++) {
                Object obj = guVar.get(i);
                if (((C30238l) ((C30233g) ((C58847bk) this.f81852h).f156646a).mo35710e().mo56107c()).mo35723b(obj) != null) {
                    gpVar.mo55395g(obj);
                } else {
                    gpVar2.mo55395g(obj);
                }
            }
            C58480gp e = C58485gu.m89837e();
            e.mo55396h(gpVar.mo55394f());
            e.mo55396h(gpVar2.mo55394f());
            guVar = e.mo55394f();
        }
        ArrayList arrayList2 = new ArrayList(guVar);
        Object obj2 = this.f81847c;
        if (obj2 != null) {
            arrayList2.remove(obj2);
        }
        C0424f a = C0429k.m1383a(new C30270o(this, arrayList, arrayList2), true);
        this.f81855k.clear();
        this.f81855k.addAll(arrayList2);
        a.mo1399b(this);
    }

    public final int getItemCount() {
        return this.f81855k.size();
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C30253a aVar = this.f81850f;
        ((C30306o) aVar).f81934a.f81880a.add(this.f81857m);
        this.f81847c = this.f81850f.mo35765a();
        this.f81848d = C58485gu.m89842j(((C30306o) this.f81850f).f81934a.mo35794b());
        if (((C30233g) ((C58847bk) this.f81852h).f156646a).mo35710e().mo56113h()) {
            ((C30238l) ((C30233g) ((C58847bk) this.f81852h).f156646a).mo35710e().mo56107c()).mo5704e(((C30233g) ((C58847bk) this.f81852h).f156646a).mo35706a(), this.f81859o);
        }
        mo35785b();
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        this.f81854j.mo35772a((C30258c) ghVar, this.f81855k.get(i));
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C30258c(viewGroup, new ContextThemeWrapper(viewGroup.getContext(), 2132149641), this.f81845a, this.f81849e, this.f81846b, this.f81853i, this.f81852h, this.f81858n, this.f81851g, this.f81856l);
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C30253a aVar = this.f81850f;
        ((C30306o) aVar).f81934a.f81880a.remove(this.f81857m);
        if (((C30233g) ((C58847bk) this.f81852h).f156646a).mo35710e().mo56113h()) {
            ((C30238l) ((C30233g) ((C58847bk) this.f81852h).f156646a).mo35710e().mo56107c()).mo5679j(this.f81859o);
        }
        this.f81855k.clear();
    }

    public final /* synthetic */ void onViewRecycled(C0673gh ghVar) {
        ((C30258c) ghVar).mo35768a();
    }
}
