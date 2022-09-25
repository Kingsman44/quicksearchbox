package com.google.android.libraries.onegoogle.popovercontainer;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;

/* renamed from: com.google.android.libraries.onegoogle.popovercontainer.r */
/* compiled from: PG */
public final /* synthetic */ class C31056r implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C31036ak f83646a;

    public /* synthetic */ C31056r(C31036ak akVar) {
        this.f83646a = akVar;
    }

    public final void onClick(View view) {
        C31036ak akVar = this.f83646a;
        C31031af afVar = akVar.f83605i;
        if (afVar != null) {
            ((C31041c) afVar).f83622d.mo35826f(C28442l.m53142h(), view);
        }
        akVar.dismiss();
    }
}
