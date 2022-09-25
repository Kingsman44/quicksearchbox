package com.google.android.libraries.p1969j.p1970a.p1974b;

import android.accounts.Account;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.C2363bk;
import androidx.lifecycle.C2368bp;
import com.google.android.libraries.onegoogle.accountmenu.p2358f.C30491d;
import com.google.android.libraries.onegoogle.accountmenu.p2358f.C30492e;
import com.google.android.libraries.p1969j.p1970a.p1971a.p1972a.C23928f;
import com.google.android.libraries.p1969j.p1970a.p1971a.p1972a.C23929g;
import com.google.android.libraries.p1969j.p1970a.p1971a.p1972a.C23932j;
import com.google.android.libraries.p1969j.p1970a.p1971a.p1972a.C23939q;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import com.google.p4184bj.p4193c.p4197c.C55960bg;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.j.a.b.o */
/* compiled from: PG */
public class C23965o extends C23928f {

    /* renamed from: a */
    private Account f65524a;

    /* renamed from: b */
    private C55912b f65525b;

    /* renamed from: c */
    private C55960bg f65526c;

    /* renamed from: d */
    protected C23971u f65527d;

    /* renamed from: e */
    public C23939q f65528e;

    /* renamed from: f */
    public C23953c f65529f;

    /* renamed from: g */
    private final AtomicBoolean f65530g = new AtomicBoolean(false);

    /* renamed from: b */
    private final void m44552b(int i) {
        if (!this.f65530g.getAndSet(true)) {
            this.f65529f.mo29366b(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29375a(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: jO */
    public final void mo29334jO() {
        m44552b(12);
    }

    /* renamed from: m */
    public final void mo29376m(Account account, C55912b bVar, C55960bg bgVar) {
        C58838bb.m90866a(account, "No account provided.");
        C58838bb.m90866a(bVar, "No setting provided.");
        C58838bb.m90866a(bgVar, "No uiFlowId provided.");
        Bundle bundle = new Bundle();
        bundle.putParcelable("Account", account);
        bundle.putSerializable("SettingId", bVar);
        bundle.putSerializable("FlowId", bgVar);
        setArguments(bundle);
    }

    /* renamed from: n */
    public final void mo29377n() {
        this.f65529f.mo29366b(15);
    }

    /* renamed from: o */
    public final void mo29378o() {
        this.f65529f.mo29366b(6);
        this.f65527d.mo29380a(C23968r.CONSENT_DATA_LOADING);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        Account account = (Account) getArguments().getParcelable("Account");
        this.f65524a = account;
        C58838bb.m90866a(account, "No account provided. Did you call setArguments() before attaching the fragment?");
        C55912b bVar = (C55912b) getArguments().getSerializable("SettingId");
        this.f65525b = bVar;
        C58838bb.m90866a(bVar, "No setting provided. Did you call setArguments() before attaching the fragment?");
        C55960bg bgVar = (C55960bg) getArguments().getSerializable("FlowId");
        this.f65526c = bgVar;
        C58838bb.m90866a(bgVar, "No uiFlowId provided. Did you call setArguments() before attaching the fragment?");
        C23971u uVar = (C23971u) new C2368bp(getViewModelStore(), (C2363bk) new C23969s(getActivity().getApplication(), this.f65524a, this.f65525b, this.f65526c)).mo5770a(C23971u.class);
        this.f65527d = uVar;
        uVar.f65547b.mo5704e(this, new C23960j(this));
        this.f65529f = C23952b.m44541a(context, Integer.valueOf(this.f65527d.f65550e), this.f65526c, this.f65524a, this.f65525b);
    }

    public void onCancel(DialogInterface dialogInterface) {
        m44552b(11);
        mo29375a(this.f65527d.f65547b.mo3842a() == C23968r.CONSENT_DATA_LOADING_FAILED ? 4 : 3);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C23939q qVar = (C23939q) view;
        this.f65528e = qVar;
        qVar.mo29350f(new C23961k(this));
        this.f65528e.mo29348d(new C23962l(this));
        this.f65528e.f65458f.setOnClickListener(new C23929g(new C23963m(this)));
        C23939q qVar2 = this.f65528e;
        Account account = this.f65527d.f65551f;
        C30491d k = C30492e.m56873k();
        k.mo36110b(account.name);
        C60856cj.m92911t(qVar2.f65464l.mo36638b(account.name), new C23932j(qVar2, k.mo36109a()), C60826bg.f164896a);
    }
}
