package com.google.android.apps.gsa.plugins.nativeresults.canvas;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.shared.p6928f.C87550f;
import com.google.android.libraries.componentview.services.application.C20610cj;
import com.google.common.p4522b.C58459fv;
import com.google.common.p4522b.C58743qi;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.z */
/* compiled from: PG */
public final class C84154z implements C20610cj {

    /* renamed from: a */
    public final C58743qi f229097a = new C58459fv();

    /* renamed from: a */
    public final void mo25491a(String str, Map map) {
        if (map != null) {
            String str2 = (String) map.get("CardId");
            if (!TextUtils.isEmpty(str2) && this.f229097a.mo54919w(str2)) {
                for (C87550f a : this.f229097a.mo54986h(str2)) {
                    a.mo81667a(str, map);
                }
            }
        }
    }
}
