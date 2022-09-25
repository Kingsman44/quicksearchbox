package com.google.android.apps.gsa.staticplugins.opa.morris2;

import android.text.TextUtils;
import androidx.lifecycle.C2333ah;
import com.google.android.libraries.assistant.p1467d.p1471b.C17823i;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.g */
/* compiled from: PG */
public final /* synthetic */ class C109642g implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C109710m f305352a;

    public /* synthetic */ C109642g(C109710m mVar) {
        this.f305352a = mVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C17823i iVar;
        C109710m mVar = this.f305352a;
        String str = (String) obj;
        if (mVar.f305629d.r()) {
            iVar = mVar.f305629d.c();
        } else {
            iVar = (C17823i) mVar.f305629d.b().mo3842a();
        }
        C58976aa aaVar = C58975e.f156826a;
        if (TextUtils.isEmpty(str) && iVar != null && iVar != C17823i.UNKNOWN && iVar != C17823i.STOPPED) {
            mVar.f305633h.mo21431e(C37182a.f98083fx.mo40813g());
            mVar.mo98036k(str);
        }
    }
}
