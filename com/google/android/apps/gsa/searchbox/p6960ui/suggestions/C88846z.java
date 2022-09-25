package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.android.libraries.gsa.util.C23341f;
import com.google.android.libraries.searchbox.shared.response.Response;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.z */
/* compiled from: PG */
public final /* synthetic */ class C88846z implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C88760ae f240547a;

    public /* synthetic */ C88846z(C88760ae aeVar) {
        this.f240547a = aeVar;
    }

    public final void run() {
        String str;
        C88760ae aeVar = this.f240547a;
        Response k = aeVar.mo82489k();
        String str2 = null;
        String str3 = k != null ? k.f108861a : null;
        String obj = aeVar.f240122b.mo82429a().toString();
        if (obj == null) {
            str = null;
        } else {
            str = C23341f.m43778e(obj);
        }
        if (str3 != null) {
            str2 = C23341f.m43778e(str3);
        }
        if (!C90772bp.m148275B(str, str2)) {
            aeVar.mo82493o();
            aeVar.f240126f.mo44289c();
        }
    }
}
