package com.google.android.apps.gsa.staticplugins.actionsui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88508b;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.m */
/* compiled from: PG */
public abstract class C93507m extends C88508b implements C93690o {

    /* renamed from: c */
    public static final C59071e f260977c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actionsui.m");

    /* renamed from: d */
    protected C93498d f260978d;

    public C93507m(Context context, String str) {
        super(context, str);
        View t = mo87752t(getContext(), (LayoutInflater) getContext().getSystemService("layout_inflater"), this);
        t.addOnAttachStateChangeListener(new C93504j(this));
        addView(t);
    }

    /* renamed from: u */
    protected static final void m154032u(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(true != TextUtils.isEmpty(charSequence) ? 0 : 8);
    }

    /* renamed from: e */
    public final void mo82065e() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C93498d mo87828i(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        C93498d dVar = (C93498d) layoutInflater.inflate(R.layout.classic_action_editor, viewGroup, false);
        this.f260978d = dVar;
        dVar.mo87703f(i);
        C89941l.m146512c(this.f260978d, 6728);
        return this.f260978d;
    }

    /* renamed from: ij */
    public final void mo82070ij() {
        if (this.f239232a != null) {
            C93498d dVar = this.f260978d;
            if (dVar != null) {
                dVar.mo87708j(new C93505k(this));
            }
            post(new C93506l(this));
        }
    }

    /* renamed from: j */
    public final void mo87829j() {
        C93498d dVar = this.f260978d;
        if (dVar != null) {
            dVar.mo87698a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo87830k(int i) {
        if (i == 0) {
            ((C93503i) this.f239232a).mo82037B();
        } else if (i == 1) {
            ((C93503i) this.f239232a).mo82045h();
        } else if (i == 2) {
            ((C93503i) this.f239232a).mo82052o(3);
        }
    }

    /* renamed from: l */
    public final void mo87831l(int i) {
        C93498d dVar = this.f260978d;
        if (dVar != null) {
            dVar.mo87699b(i);
        }
    }

    /* renamed from: m */
    public final void mo87832m(int i) {
        boolean z = true;
        if (!(i == 0 || i == 1 || i == 2 || i >= 100)) {
            z = false;
        }
        C58838bb.m90868c(z);
        C93498d dVar = this.f260978d;
        if (dVar != null) {
            dVar.mo87700c(i);
        }
    }

    /* renamed from: n */
    public final void mo87833n(int i) {
        C93498d dVar = this.f260978d;
        if (dVar != null) {
            dVar.mo87701d(i);
        }
    }

    /* renamed from: o */
    public final void mo87834o(int i) {
        C93498d dVar = this.f260978d;
        if (dVar != null) {
            dVar.mo87710l(i);
        }
    }

    /* renamed from: p */
    public final void mo87835p(boolean z) {
        C93498d dVar = this.f260978d;
        if (dVar != null) {
            dVar.mo87704g(z);
        }
    }

    /* renamed from: q */
    public void mo87794q() {
        C93498d dVar = this.f260978d;
        if (dVar != null) {
            dVar.mo87706h();
        }
    }

    /* renamed from: r */
    public final void mo87836r() {
        mo87794q();
    }

    /* renamed from: s */
    public final void mo87837s(long j) {
        C93498d dVar = this.f260978d;
        if (dVar != null) {
            dVar.mo87707i(j);
        }
    }

    public final void setContentDescription(CharSequence charSequence) {
        C93498d dVar = this.f260978d;
        if (dVar != null) {
            dVar.setContentDescription(charSequence);
        } else {
            super.setContentDescription(charSequence);
        }
    }

    /* renamed from: t */
    public abstract View mo87752t(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup);
}
