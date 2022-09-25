package com.google.android.libraries.onegoogle.accountmenu.p2356d;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.d.e */
/* compiled from: PG */
public abstract class C30464e {
    /* renamed from: g */
    public static C30462c m56760g() {
        C30466g gVar = new C30466g();
        gVar.mo36053f(R.id.og_ai_custom_action);
        gVar.mo36058k(false);
        gVar.mo36056i(90541);
        gVar.mo36049b(C30461b.CUSTOM);
        return gVar;
    }

    /* renamed from: a */
    public abstract int mo36061a();

    /* renamed from: b */
    public abstract int mo36062b();

    /* renamed from: c */
    public abstract Drawable mo36063c();

    /* renamed from: d */
    public abstract View.OnClickListener mo36064d();

    /* renamed from: e */
    public abstract LiveData mo36065e();

    /* renamed from: f */
    public abstract C30461b mo36066f();

    /* renamed from: h */
    public abstract C30462c mo36067h();

    /* renamed from: i */
    public final C30464e mo36068i(View.OnClickListener onClickListener) {
        C30462c h = mo36067h();
        h.mo36055h(onClickListener);
        return h.mo36048a();
    }

    /* renamed from: j */
    public abstract C30465f mo36069j();

    /* renamed from: k */
    public abstract C58833ax mo36070k();

    /* renamed from: l */
    public abstract C58833ax mo36071l();

    /* renamed from: m */
    public abstract String mo36072m();

    /* renamed from: n */
    public abstract boolean mo36073n();

    /* renamed from: o */
    public abstract C30460a mo36074o();
}
