package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.view.View;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2333ah;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.onegoogle.common.C30901aa;
import com.google.android.libraries.onegoogle.common.C30922i;
import com.google.android.libraries.onegoogle.common.C30931r;
import com.google.android.libraries.onegoogle.common.C30938y;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.at */
/* compiled from: PG */
public class C30365at {

    /* renamed from: b */
    public final C2332ag f82087b;

    /* renamed from: c */
    final C2332ag f82088c;

    /* renamed from: d */
    public final C2332ag f82089d;

    /* renamed from: e */
    final C2332ag f82090e;

    /* renamed from: f */
    public final C2332ag f82091f;

    /* renamed from: g */
    final int f82092g;

    /* renamed from: h */
    public View.OnClickListener f82093h;

    /* renamed from: i */
    public C30922i f82094i;

    /* renamed from: j */
    public C58833ax f82095j;

    C30365at() {
        this(105607);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35927a(C2391v vVar) {
    }

    /* renamed from: b */
    public void mo35942b(C2391v vVar, C2333ah ahVar) {
        this.f82087b.mo5704e(vVar, ahVar);
    }

    /* renamed from: c */
    public void mo35943c(C2391v vVar) {
        this.f82087b.mo5707k(vVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo35928d() {
    }

    /* renamed from: l */
    public final void mo35944l() {
        C2332ag agVar = this.f82088c;
        C30901aa aaVar = new C30901aa(this.f82093h);
        aaVar.f83316d = new C30362aq(this);
        aaVar.f83317e = new C30363ar(this);
        aaVar.f83314b = this.f82095j;
        C30931r.m57728a(agVar, C58833ax.m90834k(new C30938y(aaVar)));
    }

    public C30365at(int i) {
        this.f82087b = new C2332ag(true);
        this.f82088c = new C2332ag(C58836b.f156633a);
        this.f82089d = new C2332ag(C58836b.f156633a);
        this.f82090e = new C2332ag(false);
        this.f82091f = new C2332ag(C58836b.f156633a);
        this.f82093h = C30361ap.f82084a;
        this.f82094i = new C30364as();
        this.f82095j = C58836b.f156633a;
        this.f82092g = i;
    }
}
