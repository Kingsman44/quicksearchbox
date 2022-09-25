package com.google.android.apps.gsa.searchplate;

import android.view.KeyEvent;
import android.widget.TextView;
import com.google.android.apps.gsa.searchplate.p6963a.C88893c;

/* renamed from: com.google.android.apps.gsa.searchplate.r */
/* compiled from: PG */
public final /* synthetic */ class C88955r implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ SearchPlate f240994a;

    public /* synthetic */ C88955r(SearchPlate searchPlate) {
        this.f240994a = searchPlate;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C88893c cVar = this.f240994a.f240752y;
        if (cVar != null) {
            return cVar.mo17644n(i);
        }
        return false;
    }
}
