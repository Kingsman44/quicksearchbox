package com.google.android.libraries.lens.view.gallery;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import com.google.android.libraries.lens.view.gallery.p2111d.C26363i;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.gallery.ab */
/* compiled from: PG */
final class C26298ab {

    /* renamed from: a */
    public float f71466a = 1.0f;

    /* renamed from: b */
    public float f71467b = 1.0f;

    /* renamed from: c */
    final /* synthetic */ C26299ac f71468c;

    public C26298ab(C26299ac acVar) {
        this.f71468c = acVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31500a() {
        C26363i iVar;
        C0673gh findViewHolderForAdapterPosition;
        float f = this.f71466a * this.f71467b;
        View view = this.f71468c.f71473E;
        if (view != null) {
            view.setAlpha(f);
        }
        C26299ac acVar = this.f71468c;
        if (acVar.f71474F != null && (iVar = acVar.f71469A) != null) {
            C58833ax a = iVar.mo31554a();
            if (a.mo56113h() && (findViewHolderForAdapterPosition = this.f71468c.f71474F.findViewHolderForAdapterPosition(((Integer) a.mo56107c()).intValue())) != null) {
                findViewHolderForAdapterPosition.itemView.setAlpha(f);
            }
        }
    }
}
