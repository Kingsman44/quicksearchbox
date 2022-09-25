package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87440d;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.ab */
/* compiled from: PG */
public abstract class C93524ab implements C87440d {

    /* renamed from: a */
    protected final LayoutInflater f261155a;

    /* renamed from: b */
    protected final ViewGroup f261156b;

    /* renamed from: c */
    protected final C88511e f261157c;

    /* renamed from: d */
    public final C93602cz f261158d;

    /* renamed from: e */
    protected final C93545aw f261159e;

    /* renamed from: f */
    protected final Context f261160f;

    public C93524ab(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, C88511e eVar, C93602cz czVar, C93545aw awVar) {
        this.f261160f = context;
        this.f261155a = layoutInflater;
        this.f261156b = viewGroup;
        this.f261157c = eVar;
        this.f261158d = czVar;
        this.f261159e = awVar;
    }

    /* renamed from: p */
    protected static final boolean m154253p(int i) {
        return i == 2;
    }

    /* renamed from: o */
    public C93666w mo87938o(Argument argument) {
        C93666w wVar = (C93666w) argument.mo81281p(this);
        if (wVar != null) {
            wVar.f261454t = new C93667x(this, wVar);
            wVar.f261451q = this.f261159e;
            wVar.f261444j = this.f261158d;
            wVar.mo88129p(argument);
            wVar.f261448n = C58833ax.m90834k(this.f261158d.mo88011F(wVar.getContext()));
        }
        return wVar;
    }
}
