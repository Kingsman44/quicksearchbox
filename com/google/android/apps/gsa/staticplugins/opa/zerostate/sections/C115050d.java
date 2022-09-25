package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114757k;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114822bs;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114874f;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.p1730f.p1731a.C21378h;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;
import org.p5633c.p5634a.C72210d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.d */
/* compiled from: PG */
public final class C115050d implements C114757k {

    /* renamed from: a */
    public static final C59071e f319364a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.d");

    /* renamed from: b */
    public final Context f319365b;

    /* renamed from: c */
    public final Activity f319366c;

    /* renamed from: d */
    public final C114822bs f319367d;

    /* renamed from: e */
    public final C115061f f319368e;

    /* renamed from: f */
    public final C115023c f319369f;

    /* renamed from: g */
    public final List f319370g = new ArrayList();

    /* renamed from: h */
    public final C58833ax f319371h;

    /* renamed from: i */
    public final C58833ax f319372i;

    /* renamed from: j */
    public TextView f319373j;

    /* renamed from: k */
    public C28293k f319374k;

    /* renamed from: l */
    public final C21378h f319375l;

    /* renamed from: m */
    private final C58881cr f319376m;

    public C115050d(Context context, Activity activity, C21378h hVar, C114822bs bsVar, C58833ax axVar, C58833ax axVar2, C115061f fVar) {
        this.f319365b = context;
        this.f319366c = activity;
        this.f319375l = hVar;
        this.f319367d = bsVar;
        this.f319372i = axVar2;
        this.f319368e = fVar;
        this.f319376m = C58886cw.m90973a(new C114969a(this));
        this.f319369f = new C115023c(this);
        this.f319371h = axVar;
    }

    /* renamed from: a */
    public final View mo101577a() {
        C58976aa aaVar = C58975e.f156826a;
        return (View) this.f319376m.mo6453a();
    }

    /* renamed from: b */
    public final /* synthetic */ C114750d mo101578b(int i) {
        return null;
    }

    /* renamed from: c */
    public final C28293k mo101579c() {
        if (this.f319374k == null) {
            View view = (View) this.f319376m.mo6453a();
        }
        return this.f319374k;
    }

    /* renamed from: d */
    public final void mo101580d() {
        C58976aa aaVar = C58975e.f156826a;
        this.f319375l.mo26883j(this.f319369f);
        this.f319375l.mo26882i(this.f319369f);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo101581e() {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo101582f() {
    }

    /* renamed from: g */
    public final void mo101583g(C58833ax axVar) {
    }

    /* renamed from: h */
    public final void mo101824h() {
        TextView textView = this.f319373j;
        if (textView != null) {
            textView.setText(C114874f.m190405e(this.f319365b, new C72210d(System.currentTimeMillis()), false, false));
        }
    }

    /* renamed from: i */
    public final /* synthetic */ void mo101584i() {
    }
}
