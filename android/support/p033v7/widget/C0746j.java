package android.support.p033v7.widget;

import android.content.Context;
import android.support.p033v7.view.menu.C0450ad;
import android.support.p033v7.view.menu.C0460an;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.j */
/* compiled from: PG */
public final class C0746j extends C0450ad {

    /* renamed from: d */
    final /* synthetic */ ActionMenuPresenter f2608d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0746j(ActionMenuPresenter actionMenuPresenter, Context context, C0460an anVar, View view) {
        super(context, anVar, view, false, R.attr.actionOverflowMenuStyle);
        this.f2608d = actionMenuPresenter;
        if (!anVar.f1587n.mo1710o()) {
            View view2 = actionMenuPresenter.f1769h;
            this.f1553a = view2 == null ? (View) actionMenuPresenter.f1595f : view2;
        }
        mo1538e(actionMenuPresenter.f1775n);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo1536c() {
        ActionMenuPresenter actionMenuPresenter = this.f2608d;
        actionMenuPresenter.f1773l = null;
        actionMenuPresenter.f1776o = 0;
        super.mo1536c();
    }
}
