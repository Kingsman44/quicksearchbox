package com.google.android.apps.gsa.staticplugins.webview;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.a */
/* compiled from: PG */
final class C118108a extends C118218dy {

    /* renamed from: a */
    public C58833ax f327750a = C58836b.f156633a;

    /* renamed from: b */
    private List f327751b;

    /* renamed from: a */
    public final C118219dz mo103513a() {
        List list = this.f327751b;
        if (list != null) {
            return new C118137b(list, this.f327750a);
        }
        throw new IllegalStateException("Missing required properties: history");
    }

    /* renamed from: b */
    public final void mo103514b(List list) {
        if (list != null) {
            this.f327751b = list;
            return;
        }
        throw new NullPointerException("Null history");
    }
}
