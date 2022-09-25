package com.google.android.libraries.onegoogle.accountmenu.p2377h;

import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2333ah;
import androidx.lifecycle.LiveData;
import androidx.p119j.p120a.p121a.C2300b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmanagement.C30282k;
import com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView;
import com.google.android.libraries.onegoogle.accountmanagement.p2350b.C30271p;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30356ak;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30378bf;
import com.google.android.libraries.onegoogle.accountmenu.features.C30635r;
import com.google.android.libraries.onegoogle.accountmenu.features.C30636s;
import com.google.android.libraries.onegoogle.accountmenu.features.p2362c.C30523a;
import com.google.android.libraries.onegoogle.accountmenu.internal.MyAccountChip;
import com.google.android.libraries.onegoogle.common.C30901aa;
import com.google.android.libraries.onegoogle.common.C30908ah;
import com.google.android.libraries.onegoogle.common.C30922i;
import com.google.android.libraries.onegoogle.common.C30938y;
import com.google.android.libraries.onegoogle.common.C30939z;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30872ae;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h.ar */
/* compiled from: PG */
public final class C30669ar extends LinearLayout implements C30872ae {

    /* renamed from: u */
    public static final /* synthetic */ int f82783u = 0;

    /* renamed from: v */
    private static final String f82784v;

    /* renamed from: w */
    private static final String f82785w;

    /* renamed from: a */
    public final MyAccountChip f82786a;

    /* renamed from: b */
    public final SelectedAccountView f82787b;

    /* renamed from: c */
    public final RecyclerView f82788c;

    /* renamed from: d */
    public final RecyclerView f82789d;

    /* renamed from: e */
    public final ViewGroup f82790e;

    /* renamed from: f */
    public final C2332ag f82791f = new C2332ag(C58485gu.m89845m());

    /* renamed from: g */
    public final C2333ah f82792g;

    /* renamed from: h */
    public final C2332ag f82793h = new C2332ag(C30356ak.m56540d().mo35932a());

    /* renamed from: i */
    public boolean f82794i;

    /* renamed from: j */
    public C30897z f82795j;

    /* renamed from: k */
    public boolean f82796k;

    /* renamed from: l */
    public C30635r f82797l;

    /* renamed from: m */
    public C58833ax f82798m;

    /* renamed from: n */
    public C30922i f82799n;

    /* renamed from: o */
    public C30939z f82800o;

    /* renamed from: p */
    public C30636s f82801p;

    /* renamed from: q */
    public C30305n f82802q;

    /* renamed from: r */
    public C63644b f82803r;

    /* renamed from: s */
    public C58833ax f82804s;

    /* renamed from: t */
    public final C30282k f82805t = new C30668aq(this);

    static {
        Class<C30669ar> cls = C30669ar.class;
        f82784v = String.valueOf(cls.getName()).concat(".superState");
        f82785w = String.valueOf(cls.getName()).concat(".collapsed");
    }

    public C30669ar(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.has_selected_content, this);
        setOrientation(1);
        this.f82786a = (MyAccountChip) findViewById(R.id.my_account_chip);
        SelectedAccountView selectedAccountView = (SelectedAccountView) findViewById(R.id.selected_account_view);
        this.f82787b = selectedAccountView;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.accounts);
        this.f82788c = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.account_management_actions);
        this.f82789d = recyclerView2;
        recyclerView.setFocusable(false);
        recyclerView2.setFocusable(false);
        this.f82790e = (ViewGroup) findViewById(R.id.og_critical_alert_container);
        selectedAccountView.f81793e.setDuration(200);
        selectedAccountView.f81793e.setInterpolator(new C2300b());
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(200);
        layoutTransition.setInterpolator(2, new C2300b());
        layoutTransition.setInterpolator(3, new C2300b());
        layoutTransition.setInterpolator(1, new C2300b());
        layoutTransition.setInterpolator(0, new C2300b());
        setLayoutTransition(layoutTransition);
        this.f82792g = new C30661aj(this);
    }

    /* renamed from: e */
    public static void m57320e(RecyclerView recyclerView, C0640fb fbVar) {
        recyclerView.getScrollingChildHelper().mo5279a(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        C30908ah.m57698a(recyclerView, fbVar);
    }

    /* renamed from: f */
    public static void m57321f(C0640fb fbVar, RecyclerView recyclerView, C0648fj fjVar) {
        if (fbVar.getItemCount() <= 0) {
            int i = 0;
            while (i < recyclerView.mItemDecorations.size()) {
                if (!recyclerView.getItemDecorationAt(i).equals(fjVar)) {
                    i++;
                } else {
                    return;
                }
            }
            recyclerView.addItemDecoration$ar$ds(fjVar);
            return;
        }
        recyclerView.removeItemDecoration(fjVar);
    }

    /* renamed from: a */
    public final C30378bf mo36363a(LiveData liveData, int i) {
        Context context = getContext();
        C30306o i2 = this.f82802q.mo35858i();
        if (liveData == null) {
            liveData = new C2332ag(C58485gu.m89845m());
        }
        return new C30378bf(context, i2, liveData, this.f82799n, this.f82795j, i, this.f82797l);
    }

    /* renamed from: b */
    public final void mo35630b(C30897z zVar) {
        zVar.mo35822b(this.f82787b, 90784);
        zVar.mo35822b(this.f82787b.f81789a, 111271);
    }

    /* renamed from: c */
    public final void mo36364c(boolean z) {
        C19559g.m37304c();
        this.f82794i = z;
        RecyclerView recyclerView = this.f82788c;
        int i = true != z ? 0 : 8;
        recyclerView.setVisibility(i);
        this.f82789d.setVisibility(i);
        SelectedAccountView selectedAccountView = this.f82787b;
        boolean z2 = !z;
        if (z2 != selectedAccountView.f81795g) {
            selectedAccountView.f81795g = z2;
            selectedAccountView.mo35764d(z2);
            if (z2) {
                selectedAccountView.f81793e.start();
            } else {
                selectedAccountView.f81793e.reverse();
            }
        }
    }

    /* renamed from: g */
    public final void mo36365g(C30305n nVar, C30271p pVar, C30378bf bfVar) {
        int i;
        View.OnClickListener onClickListener;
        C19559g.m37304c();
        C58833ax m = nVar.mo35860k().mo36180m();
        boolean z = true;
        if (m.mo56113h()) {
            C58833ax axVar = ((C30523a) m.mo56107c()).f82450a;
            i = 2;
        } else {
            i = (!nVar.mo35860k().mo36171d().mo36153b().mo56113h() || (pVar.getItemCount() <= 0 && bfVar.f82118a.f1440c <= 0)) ? 3 : 1;
        }
        SelectedAccountView selectedAccountView = this.f82787b;
        int i2 = 8;
        selectedAccountView.f81791c.setVisibility(i == 2 ? 0 : 8);
        selectedAccountView.f81790b.setVisibility(i == 1 ? 0 : 8);
        FrameLayout frameLayout = selectedAccountView.f81792d;
        if (i != 3) {
            i2 = 0;
        }
        frameLayout.setVisibility(i2);
        selectedAccountView.mo33195b();
        SelectedAccountView selectedAccountView2 = this.f82787b;
        int i3 = i - 1;
        if (i3 == 0) {
            onClickListener = new C30657af(this);
        } else if (i3 != 1) {
            onClickListener = null;
        } else {
            C58838bb.m90883r(this.f82798m.mo56113h());
            C30901aa aaVar = new C30901aa(new C30658ag(this));
            aaVar.f83316d = this.f82799n.mo35755b();
            aaVar.f83317e = this.f82799n.mo35754a();
            aaVar.mo36586a(this.f82800o, 56);
            onClickListener = new C30938y(aaVar);
        }
        selectedAccountView2.setOnClickListener(onClickListener);
        SelectedAccountView selectedAccountView3 = this.f82787b;
        if (i == 3) {
            z = false;
        }
        selectedAccountView3.setClickable(z);
    }

    /* renamed from: lk */
    public final void mo35632lk(C30897z zVar) {
        zVar.mo35825e(this.f82787b.f81789a);
        zVar.mo35825e(this.f82787b);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        this.f82786a.f82886a.mo36594b(View.MeasureSpec.getSize(i));
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Parcelable parcelable2 = bundle.getParcelable(f82784v);
            mo36364c(bundle.getBoolean(f82785w));
            parcelable = parcelable2;
        }
        super.onRestoreInstanceState(parcelable);
        this.f82796k = true;
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f82784v, super.onSaveInstanceState());
        bundle.putBoolean(f82785w, this.f82794i);
        return bundle;
    }
}
