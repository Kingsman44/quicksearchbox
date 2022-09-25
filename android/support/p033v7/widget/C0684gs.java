package android.support.p033v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.gs */
/* compiled from: PG */
final class C0684gs implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C0687gv f2503a;

    public C0684gs(C0687gv gvVar) {
        this.f2503a = gvVar;
    }

    public final void onClick(View view) {
        ((C0685gt) view).f2504a.mo1277f();
        int childCount = this.f2503a.f2513b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f2503a.f2513b.getChildAt(i);
            childAt.setSelected(childAt == view);
        }
    }
}
