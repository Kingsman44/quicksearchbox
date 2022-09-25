package com.google.android.libraries.p1969j.p1970a.p1971a.p1972a;

import android.view.View;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.j.a.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C23930h implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C23939q f65426a;

    /* renamed from: b */
    public final /* synthetic */ View.OnClickListener f65427b;

    public /* synthetic */ C23930h(C23939q qVar, View.OnClickListener onClickListener) {
        this.f65426a = qVar;
        this.f65427b = onClickListener;
    }

    public final void onClick(View view) {
        C23939q qVar = this.f65426a;
        View.OnClickListener onClickListener = this.f65427b;
        C23938p pVar = C23938p.CONSENT_DATA_LOADING;
        int ordinal = qVar.f65466n.ordinal();
        if (ordinal == 2) {
            onClickListener.onClick(qVar);
        } else if (ordinal != 3) {
            ((C59052c) ((C59052c) C23939q.f65444a.mo56225c()).mo56372aa(47945)).mo56389s("Positive or negative button clicked during the UI state '%s' which is not allowed.", qVar.f65466n);
        } else {
            Toast.makeText(qVar.getContext(), qVar.getContext().getResources().getString(R.string.please_wait_message), 0).show();
        }
    }
}
