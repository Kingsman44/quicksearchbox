package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7609e;

import android.content.Context;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.Snackbar;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.e.d */
/* compiled from: PG */
public final class C97209d extends CoordinatorLayout {

    /* renamed from: i */
    final /* synthetic */ String f271598i;

    /* renamed from: j */
    final /* synthetic */ String f271599j;

    /* renamed from: k */
    final /* synthetic */ View.OnClickListener f271600k;

    /* renamed from: l */
    final /* synthetic */ C97211f f271601l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97209d(C97211f fVar, Context context, String str, String str2, View.OnClickListener onClickListener) {
        super(context);
        this.f271601l = fVar;
        this.f271598i = str;
        this.f271599j = str2;
        this.f271600k = onClickListener;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C97211f fVar = this.f271601l;
        String str = this.f271598i;
        String str2 = this.f271599j;
        View.OnClickListener onClickListener = this.f271600k;
        Snackbar q = Snackbar.m79661q((Context) null, this, str, 0);
        q.mo48348m(new C97210e(fVar, this));
        q.mo48352s(str2, onClickListener);
        q.mo48343h();
    }
}
