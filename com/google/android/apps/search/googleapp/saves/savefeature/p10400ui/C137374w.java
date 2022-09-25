package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui;

import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.w */
/* compiled from: PG */
public final /* synthetic */ class C137374w implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C137377z f373661a;

    /* renamed from: b */
    public final /* synthetic */ TextView f373662b;

    public /* synthetic */ C137374w(C137377z zVar, TextView textView) {
        this.f373661a = zVar;
        this.f373662b = textView;
    }

    public final void onClick(View view) {
        C137377z zVar = this.f373661a;
        zVar.f373674i.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(this.f373662b));
        AccountId accountId = zVar.f373667b;
        C137359h hVar = new C137359h();
        C68324h.m98669f(hVar);
        C47247a.m84047b(hVar, accountId);
        hVar.showNow(zVar.f373669d.getChildFragmentManager(), "createListDialog");
    }
}
