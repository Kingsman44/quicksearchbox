package com.google.android.libraries.lens.view.infopanel.p2140b.p2141a;

import android.content.Context;
import android.graphics.Typeface;
import android.support.p033v7.widget.AppCompatImageView;
import androidx.core.content.C1878d;
import com.facebook.litho.C6276fs;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.facebook.litho.C6564z;
import com.facebook.litho.p323b.C6117a;
import com.facebook.litho.p323b.C6118b;
import com.facebook.litho.p323b.C6119c;
import com.facebook.litho.p333i.C6396a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2057ag.C25101c;
import com.google.android.libraries.lens.view.p2057ag.C25102d;
import com.google.android.p3545q.p3546a.C45203a;
import com.google.android.p3545q.p3546a.C45204b;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.infopanel.b.a.b */
/* compiled from: PG */
public final class C27012b extends C6407q {
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: a */
    C25102d f73644a;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: b */
    String f73645b;

    public C27012b() {
        super("MathLatexView");
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final int mo12793K() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final Object mo12797P(Context context) {
        return new AppCompatImageView(context);
    }

    /* renamed from: X */
    public final void mo12804X(C6411u uVar, C6564z zVar, int i, int i2, C6276fs fsVar) {
        C25102d dVar = this.f73644a;
        String str = this.f73645b;
        C58833ax axVar = (C58833ax) dVar.mo30257a(C58833ax.m90834k(C25101c.ELEMENTS_MATH_FONT_MEASURE)).mo3842a();
        AppCompatImageView appCompatImageView = new AppCompatImageView(uVar.f19009b);
        if (axVar.mo56113h()) {
            C45204b.m80490a(appCompatImageView, str, (Typeface) axVar.mo56107c(), (C45203a) null);
        } else {
            C45204b.m80490a(appCompatImageView, str, Typeface.defaultFromStyle(0), (C45203a) null);
        }
        appCompatImageView.measure(C6396a.m17149a(i), C6396a.m17149a(i2));
        fsVar.f18535a = appCompatImageView.getMeasuredWidth();
        fsVar.f18536b = appCompatImageView.getMeasuredHeight();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final void mo12805Y(C6411u uVar, Object obj) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) obj;
        C25102d dVar = this.f73644a;
        String str = this.f73645b;
        C58833ax axVar = (C58833ax) dVar.mo30257a(C58833ax.m90834k(C25101c.ELEMENTS_MATH_FONT_RENDERED)).mo3842a();
        appCompatImageView.setColorFilter(C1878d.m5128a(uVar.f19009b, R.color.text_color_primary));
        if (axVar.mo56113h()) {
            C45204b.m80490a(appCompatImageView, str, (Typeface) axVar.mo56107c(), (C45203a) null);
        } else {
            C45204b.m80490a(appCompatImageView, str, Typeface.defaultFromStyle(0), (C45203a) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final void mo12806Z(C6411u uVar) {
        this.f73644a.mo30258b(C25101c.MATH_EDITOR_FRAGMENT);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo13057a(Object obj) {
        return mo13057a((C6407q) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: af */
    public final boolean mo12815af() {
        return true;
    }

    /* renamed from: ao */
    public final int mo12824ao() {
        return 3;
    }

    /* renamed from: f */
    public final boolean mo13115f(C6407q qVar) {
        if (this == qVar) {
            return true;
        }
        if (qVar == null || getClass() != qVar.getClass()) {
            return false;
        }
        C27012b bVar = (C27012b) qVar;
        C25102d dVar = this.f73644a;
        if (dVar == null ? bVar.f73644a != null : !dVar.equals(bVar.f73644a)) {
            return false;
        }
        String str = this.f73645b;
        return str == null ? bVar.f73645b == null : str.equals(bVar.f73645b);
    }
}
