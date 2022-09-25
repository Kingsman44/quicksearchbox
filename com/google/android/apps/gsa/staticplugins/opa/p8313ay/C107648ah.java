package com.google.android.apps.gsa.staticplugins.opa.p8313ay;

import android.text.Spanned;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.OpaEditText;
import com.google.android.libraries.searchbox.p3203ui.p3204a.C41703c;
import com.google.android.libraries.searchbox.p3203ui.p3204a.C41704d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ay.ah */
/* compiled from: PG */
final class C107648ah implements C41704d {

    /* renamed from: a */
    final /* synthetic */ C107656ap f299480a;

    public C107648ah(C107656ap apVar) {
        this.f299480a = apVar;
    }

    /* renamed from: a */
    public final CharSequence mo44287a() {
        return this.f299480a.mo96184m().getText();
    }

    /* renamed from: b */
    public final void mo44288b() {
    }

    /* renamed from: c */
    public final void mo44289c() {
        this.f299480a.mo96184m().setInputType(32769);
        this.f299480a.mo96195w();
        C107656ap apVar = this.f299480a;
        apVar.f299496E = false;
        apVar.f299497F = false;
    }

    /* renamed from: d */
    public final void mo44290d(C41703c cVar) {
        this.f299480a.f299498G = cVar;
    }

    /* renamed from: f */
    public final void mo44291f(Spanned spanned) {
    }

    /* renamed from: g */
    public final void mo44292g(CharSequence charSequence) {
        OpaEditText m = this.f299480a.mo96184m();
        m.setText(charSequence);
        m.setSelection(m.getText().length());
    }

    /* renamed from: h */
    public final void mo44293h() {
    }

    /* renamed from: i */
    public final boolean mo44294i() {
        return false;
    }
}
