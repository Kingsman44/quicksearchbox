package com.google.android.libraries.web.contrib.contextmenu.p3362a;

import android.widget.Toast;
import com.google.common.base.C58817ah;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.web.contrib.contextmenu.a.m */
/* compiled from: PG */
public final /* synthetic */ class C43426m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C43432s f113451a;

    public /* synthetic */ C43426m(C43432s sVar) {
        this.f113451a = sVar;
    }

    public final Object apply(Object obj) {
        C43432s sVar = this.f113451a;
        Exception exc = (Exception) obj;
        ((C59052c) ((C59052c) ((C59052c) C43432s.f113463a.mo56226d()).mo56382g(exc)).mo56372aa(54080)).mo56384n();
        Toast.makeText(sVar.f113464b.requireContext(), C58837ba.m90858g(exc.getMessage()), 0).show();
        return true;
    }
}
