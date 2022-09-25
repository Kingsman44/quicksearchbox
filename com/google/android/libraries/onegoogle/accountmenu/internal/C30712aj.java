package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p033v7.app.C0359at;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmanagement.C30282k;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.common.C30923j;
import com.google.android.libraries.onegoogle.common.C30928o;
import com.google.android.libraries.onegoogle.common.C30929p;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.aj */
/* compiled from: PG */
public abstract class C30712aj extends C0359at implements C30928o {

    /* renamed from: a */
    final C30929p f82920a = new C30929p(this);

    /* renamed from: b */
    protected C30305n f82921b;

    /* renamed from: c */
    protected C30718ap f82922c;

    /* renamed from: d */
    public final C30282k f82923d = new C30711ai(this);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Dialog mo36407a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C30718ap mo36408b(Context context);

    /* renamed from: c */
    public final void mo36409c(C30305n nVar) {
        C58838bb.m90884s(this.f82921b == null, "Initialize may only be called once");
        this.f82921b = nVar;
        this.f82920a.mo36609b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo36410d(C58485gu guVar) {
    }

    public final void dismiss() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* renamed from: e */
    public final boolean mo36411e() {
        return this.f82921b != null;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return mo36407a();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C30718ap b = mo36408b(C30923j.m57716b(requireContext()));
        this.f82922c = b;
        b.setId(R.id.og_dialog_fragment_account_menu);
        this.f82922c.f82934f = new C30707ae(this);
        this.f82920a.mo36610c(new C30708af(this));
        return this.f82922c;
    }

    public final void onDestroy() {
        this.f82922c = null;
        super.onDestroy();
    }

    public final void onPause() {
        super.onPause();
        C30305n nVar = this.f82921b;
        if (nVar != null) {
            C30306o i = nVar.mo35858i();
            i.f81934a.f81880a.remove(this.f82923d);
        }
    }

    public void onResume() {
        super.onResume();
        this.f82920a.mo36610c(new C30706ad(this));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f82922c.setSaveFromParentEnabled(true);
    }
}
