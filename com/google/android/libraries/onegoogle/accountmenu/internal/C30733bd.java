package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.app.Dialog;
import android.os.Bundle;
import android.support.p033v7.app.C0359at;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.p2345a.C30156a;
import com.google.android.libraries.onegoogle.account.policyfooter.C30241a;
import com.google.android.libraries.onegoogle.account.policyfooter.C30243c;
import com.google.android.libraries.onegoogle.account.policyfooter.C30245e;
import com.google.android.libraries.onegoogle.account.policyfooter.C30246f;
import com.google.android.libraries.onegoogle.account.policyfooter.PolicyFooterView;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.features.C30639v;
import com.google.android.libraries.onegoogle.accountmenu.features.p2364e.C30545a;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30464e;
import com.google.android.libraries.onegoogle.common.C30923j;
import com.google.android.libraries.onegoogle.common.C30928o;
import com.google.android.libraries.onegoogle.common.C30929p;
import com.google.android.libraries.onegoogle.p2380c.C30860b;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;
import java.util.ArrayList;
import java.util.Iterator;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.bd */
/* compiled from: PG */
public final class C30733bd extends C0359at implements C30928o {

    /* renamed from: a */
    public View f82957a;

    /* renamed from: b */
    public int f82958b = -1;

    /* renamed from: c */
    public C30305n f82959c;

    /* renamed from: d */
    private C30738bi f82960d;

    /* renamed from: e */
    private final C30929p f82961e = new C30929p(this);

    /* renamed from: c */
    private final void m57420c() {
        C30738bi biVar;
        C30305n nVar = this.f82959c;
        if (nVar != null && (biVar = this.f82960d) != null) {
            nVar.mo35864o().mo35821a(biVar, 75244);
            C30738bi biVar2 = this.f82960d;
            C30305n nVar2 = this.f82959c;
            C30730ba baVar = new C30730ba(this);
            C58838bb.m90868c(nVar2.mo35860k().mo36181n().mo56113h());
            C58838bb.m90868c(nVar2.mo35866q().mo56113h());
            C30545a aVar = (C30545a) nVar2.mo35860k().mo36181n().mo56107c();
            ((TextView) biVar2.findViewById(R.id.incognito_text)).setText(R.string.og_turn_off_incognito_mode);
            ((ImageView) biVar2.findViewById(R.id.incognito_icon)).setImageDrawable(C30545a.m57051a(biVar2.getContext(), biVar2.f82970c));
            biVar2.findViewById(R.id.incognito_action_list_item).setOnClickListener(new C30734be(biVar2, nVar2, baVar));
            C30243c cVar = new C30243c(nVar2.mo35852b());
            C30639v e = nVar2.mo35860k().mo36172e();
            C58833ax c = e.mo36334c();
            Objects.requireNonNull(cVar);
            C58833ax d = e.mo36335d();
            Objects.requireNonNull(cVar);
            C30897z o = nVar2.mo35864o();
            PolicyFooterView policyFooterView = biVar2.f82969b;
            C30245e j = C30246f.m56249j();
            ((C30241a) j).f81756a = C30737bh.f82967a;
            C30860b m = nVar2.mo35862m();
            C63644b bVar = biVar2.f82968a;
            j.mo35735d(m);
            j.mo35736e(bVar);
            j.mo35739h(o);
            j.mo35737f((C30156a) c.mo56109e(new C30735bf(cVar)));
            j.mo35738g((C30156a) d.mo56109e(new C30736bg(cVar)));
            j.mo35756i(e.mo36333b(), e.mo36332a());
            policyFooterView.mo35729c(j.mo35732a());
            ArrayList arrayList = new ArrayList();
            C58485gu c2 = nVar2.mo35859j().mo36091c();
            int size = c2.size();
            for (int i = 0; i < size; i++) {
                C30464e eVar = (C30464e) c2.get(i);
                if (eVar.mo36073n()) {
                    arrayList.add(eVar);
                }
            }
            if (!arrayList.isEmpty()) {
                LinearLayout linearLayout = (LinearLayout) biVar2.findViewById(R.id.content_layout);
                View findViewById = linearLayout.findViewById(R.id.common_actions_divider);
                findViewById.setVisibility(0);
                int indexOfChild = linearLayout.indexOfChild(findViewById) + 1;
                Iterator it = arrayList.iterator();
                while (true) {
                    int i2 = indexOfChild;
                    if (it.hasNext()) {
                        C30704ab abVar = new C30704ab(biVar2.getContext(), linearLayout, baVar, biVar2.f82970c, o);
                        abVar.mo36401b((C30464e) it.next());
                        indexOfChild = i2 + 1;
                        linearLayout.addView(abVar.itemView, i2);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo36434a(C30305n nVar) {
        C58838bb.m90884s(this.f82959c == null, "Initialize may only be called once");
        this.f82959c = nVar;
        m57420c();
        this.f82961e.mo36609b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo36435b() {
        if (getDialog() != null && getDialog().isShowing()) {
            C30738bi biVar = this.f82960d;
            Dialog dialog = getDialog();
            Objects.requireNonNull(dialog);
            biVar.post(new C30732bc(dialog));
        }
    }

    public final void dismiss() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* renamed from: e */
    public final boolean mo36411e() {
        return this.f82959c != null;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f82958b = getArguments().getInt("$OneGoogle$AnchorId", -1);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        C30746bq bqVar = new C30746bq(getContext());
        bqVar.mo36448j(getActivity(), this.f82958b, this.f82957a);
        return bqVar;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C30738bi biVar = new C30738bi(C30923j.m57716b(requireContext()));
        this.f82960d = biVar;
        biVar.setId(R.id.og_dialog_fragment_incognito_off_account_menu);
        m57420c();
        return this.f82960d;
    }

    public final void onDestroy() {
        this.f82960d = null;
        super.onDestroy();
    }

    public final void onResume() {
        super.onResume();
        this.f82961e.mo36610c(new C30731bb(this));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f82960d.setSaveFromParentEnabled(true);
    }
}
