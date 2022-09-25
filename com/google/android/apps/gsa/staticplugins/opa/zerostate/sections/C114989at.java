package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114757k;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114821br;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114822bs;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114870dm;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.at */
/* compiled from: PG */
public abstract class C114989at implements C114757k {

    /* renamed from: a */
    protected final Context f319149a;

    /* renamed from: b */
    protected final C91097g f319150b;

    /* renamed from: c */
    protected final C114822bs f319151c;

    /* renamed from: d */
    protected final List f319152d = new ArrayList();

    /* renamed from: e */
    protected final C58833ax f319153e;

    /* renamed from: f */
    protected View f319154f;

    /* renamed from: g */
    protected C28293k f319155g;

    public C114989at(Context context, C114822bs bsVar, C91097g gVar, C58833ax axVar) {
        this.f319149a = context;
        this.f319151c = bsVar;
        this.f319150b = gVar;
        this.f319153e = axVar;
    }

    /* renamed from: a */
    public abstract View mo101577a();

    /* renamed from: b */
    public final /* synthetic */ C114750d mo101578b(int i) {
        return null;
    }

    /* renamed from: c */
    public final C28293k mo101579c() {
        if (this.f319155g == null) {
            mo101577a();
        }
        return this.f319155g;
    }

    /* renamed from: d */
    public final void mo101580d() {
        C58976aa aaVar = C58975e.f156826a;
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

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo101802h(View view) {
        C114822bs bsVar = this.f319151c;
        C91097g gVar = this.f319150b;
        view.setOnClickListener(new C89943l(new C114870dm(bsVar.f318593c, this.f319153e, new C114821br(bsVar, gVar), gVar)));
    }

    /* renamed from: i */
    public final /* synthetic */ void mo101584i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo101803j() {
        C28292j jVar = new C28292j(54802);
        jVar.f76976d = true;
        View view = this.f319154f;
        view.getClass();
        C28295m.m52919e(view, jVar);
        this.f319155g = C28293k.m52907d(jVar, this.f319152d);
    }
}
