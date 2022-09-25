package com.google.android.libraries.onegoogle.accountmenu;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.onegoogle.account.disc.C30176ad;
import com.google.android.libraries.onegoogle.account.disc.C30190ar;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.j */
/* compiled from: PG */
public final /* synthetic */ class C30783j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SelectedAccountDisc f83078a;

    /* renamed from: b */
    public final /* synthetic */ View.OnClickListener f83079b;

    public /* synthetic */ C30783j(SelectedAccountDisc selectedAccountDisc, View.OnClickListener onClickListener) {
        this.f83078a = selectedAccountDisc;
        this.f83079b = onClickListener;
    }

    public final void onClick(View view) {
        SelectedAccountDisc selectedAccountDisc = this.f83078a;
        View.OnClickListener onClickListener = this.f83079b;
        View.OnClickListener onClickListener2 = selectedAccountDisc.f81903d;
        if (onClickListener2 != null) {
            onClickListener2.onClick(view);
        }
        C30305n nVar = selectedAccountDisc.f81906g;
        if (nVar != null) {
            nVar.mo35864o().mo35826f(C28442l.m53142h(), view);
        }
        C30190ar arVar = selectedAccountDisc.f81907h;
        if (arVar != null) {
            C58485gu guVar = arVar.f81630a;
            int i = ((C58724pq) guVar).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                ((C30176ad) guVar.get(i2)).mo35627a();
            }
        }
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
