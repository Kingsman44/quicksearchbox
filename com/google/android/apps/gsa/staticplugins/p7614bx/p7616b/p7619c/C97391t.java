package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7619c;

import android.app.Activity;
import android.support.p033v7.app.C0359at;
import com.google.android.apps.gsa.shared.monet.p7114f.C90324b;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.c.t */
/* compiled from: PG */
final class C97391t extends C90324b {

    /* renamed from: a */
    final /* synthetic */ C97359ab f271965a;

    public C97391t(C97359ab abVar) {
        this.f271965a = abVar;
    }

    /* renamed from: b */
    public final void mo84007b() {
        C0359at e = this.f271965a.mo90661e();
        if (e != null) {
            e.dismissAllowingStateLoss();
        }
        C97376e eVar = this.f271965a.f271894h;
        if (eVar != null) {
            eVar.dismissAllowingStateLoss();
            this.f271965a.f271894h = null;
        }
        if (!((Boolean) ((C97369al) this.f271965a.f271888b).f271933d.f63720e).booleanValue() && ((Boolean) ((C97369al) this.f271965a.f271888b).f271937h.f63720e).booleanValue() && this.f271965a.f271889c.mo56113h()) {
            ((Activity) this.f271965a.f271889c.mo56107c()).finish();
        }
    }

    /* renamed from: e */
    public final void mo84010e() {
        if (((Boolean) ((C97369al) this.f271965a.f271888b).f271933d.f63720e).booleanValue()) {
            ((Activity) this.f271965a.f271889c.mo56107c()).finish();
        }
    }
}
