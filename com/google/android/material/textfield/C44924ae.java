package com.google.android.material.textfield;

import android.support.p033v7.widget.C0613eb;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.google.android.material.textfield.ae */
/* compiled from: PG */
final class C44924ae implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C44926ag f117366a;

    public C44924ae(C44926ag agVar) {
        this.f117366a = agVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object obj;
        View view2 = null;
        if (i < 0) {
            C0613eb ebVar = this.f117366a.f117370a;
            if (!ebVar.f2366q.isShowing()) {
                obj = null;
            } else {
                obj = ebVar.f2354e.getSelectedItem();
            }
        } else {
            obj = this.f117366a.getAdapter().getItem(i);
        }
        this.f117366a.mo48521a(obj);
        AdapterView.OnItemClickListener onItemClickListener = this.f117366a.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                C0613eb ebVar2 = this.f117366a.f117370a;
                if (ebVar2.f2366q.isShowing()) {
                    view2 = ebVar2.f2354e.getSelectedView();
                }
                view = view2;
                i = this.f117366a.f117370a.mo2822o();
                C0613eb ebVar3 = this.f117366a.f117370a;
                if (!ebVar3.f2366q.isShowing()) {
                    j = Long.MIN_VALUE;
                } else {
                    j = ebVar3.f2354e.getSelectedItemId();
                }
            }
            onItemClickListener.onItemClick(this.f117366a.f117370a.f2354e, view, i, j);
        }
        this.f117366a.f117370a.mo1575m();
    }
}
