package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87439c;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.base.C58881cr;
import com.google.common.base.C58885cv;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.w */
/* compiled from: PG */
public abstract class C93666w extends LinearLayout {

    /* renamed from: Zm */
    private final C87439c f261443Zm;

    /* renamed from: j */
    protected C93595cs f261444j;

    /* renamed from: k */
    public C93665v f261445k;

    /* renamed from: l */
    public CharSequence f261446l;

    /* renamed from: m */
    public Argument f261447m;

    /* renamed from: n */
    public C58833ax f261448n;

    /* renamed from: o */
    public boolean f261449o;

    /* renamed from: p */
    public boolean f261450p;

    /* renamed from: q */
    protected C93545aw f261451q;

    /* renamed from: r */
    public boolean f261452r;

    /* renamed from: s */
    public boolean f261453s;

    /* renamed from: t */
    public C58881cr f261454t;

    /* renamed from: u */
    public boolean f261455u;

    public C93666w(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: e */
    public abstract void mo87731e(boolean z);

    /* renamed from: f */
    public abstract void mo87732f();

    /* renamed from: ig */
    public boolean mo87740ig() {
        if (!this.f261447m.mo81264D()) {
            return this.f261447m.mo81263C() && !mo88130s();
        }
        return true;
    }

    /* renamed from: l */
    public final Resources mo88127l() {
        C58833ax axVar = this.f261448n;
        if (axVar != null) {
            return (Resources) ((C58847bk) axVar).f156646a;
        }
        return super.getResources();
    }

    /* renamed from: m */
    public CharSequence mo88098m() {
        return this.f261446l;
    }

    /* renamed from: n */
    public List mo87858n() {
        return new ArrayList();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo88128o() {
        C93665v vVar = this.f261445k;
        if (vVar != null) {
            vVar.mo87849j();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Argument argument = this.f261447m;
        if (argument != null) {
            argument.mo81271K(this.f261443Zm);
        }
    }

    /* renamed from: p */
    public final void mo88129p(Argument argument) {
        this.f261447m = argument;
        argument.mo81270J(this.f261443Zm);
        mo87912r(this.f261447m.mo81277l());
    }

    /* renamed from: q */
    public void mo87882q(boolean z) {
        this.f261449o = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo87912r(int i) {
        C89941l.m146512c(this, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final boolean mo88130s() {
        return !TextUtils.isEmpty(this.f261446l);
    }

    /* renamed from: t */
    public boolean mo87916t() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo88131u() {
        C58881cr crVar = this.f261454t;
        return crVar != null && ((Boolean) crVar.mo6453a()).booleanValue();
    }

    public C93666w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C93666w(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f261443Zm = new C93664u(this);
        this.f261446l = null;
        this.f261450p = false;
        this.f261452r = false;
        this.f261453s = false;
        this.f261454t = new C58885cv(false);
    }
}
