package android.support.p033v7.widget;

import android.content.Context;
import android.support.p033v7.view.menu.C0450ad;
import android.support.p033v7.view.menu.C0477q;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.o */
/* compiled from: PG */
final class C0769o extends C0450ad {

    /* renamed from: d */
    final /* synthetic */ ActionMenuPresenter f2659d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0769o(ActionMenuPresenter actionMenuPresenter, Context context, C0477q qVar, View view) {
        super(context, qVar, view, true, R.attr.actionOverflowMenuStyle);
        this.f2659d = actionMenuPresenter;
        this.f1554b = 8388613;
        mo1538e(actionMenuPresenter.f1775n);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo1536c() {
        C0477q qVar = this.f2659d.f1592c;
        if (qVar != null) {
            qVar.mo1657g(true);
        }
        this.f2659d.f1772k = null;
        super.mo1536c();
    }
}
