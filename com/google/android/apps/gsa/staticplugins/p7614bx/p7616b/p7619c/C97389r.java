package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7619c;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7618b.C97349a;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.c.r */
/* compiled from: PG */
public final /* synthetic */ class C97389r implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C97359ab f271963a;

    public /* synthetic */ C97389r(C97359ab abVar) {
        this.f271963a = abVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C97359ab abVar = this.f271963a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (abVar.f271889c.mo56113h() && abVar.f271890d.mo56113h() && booleanValue) {
            Fragment c = ((FragmentManager) abVar.f271890d.mo56107c()).f634a.mo671c("RestrictedAccountLogoutDialogFragment");
            if (c != null) {
                C0154a aVar = new C0154a((FragmentManager) abVar.f271890d.mo56107c());
                aVar.mo516m(c);
                aVar.mo509f();
            }
            C97349a aVar2 = abVar.f271891e;
            Objects.requireNonNull(aVar2);
            C97381j jVar = new C97381j(aVar2);
            C97372ao aoVar = new C97372ao();
            aoVar.f271945a = jVar;
            aoVar.showNow((FragmentManager) abVar.f271890d.mo56107c(), "RestrictedAccountLogoutDialogFragment");
        }
    }
}
