package com.facebook.litho.widget;

import java.util.HashMap;
import java.util.Map;
import p3186j$.util.DesugarCollections;

/* renamed from: com.facebook.litho.widget.a */
/* compiled from: PG */
public class C6414a {

    /* renamed from: a */
    public Map f19038a;

    /* renamed from: a */
    public final void mo13493a(String str, Object obj) {
        if (this.f19038a == null) {
            this.f19038a = DesugarCollections.synchronizedMap(new HashMap());
        }
        this.f19038a.put(str, obj);
    }

    /* renamed from: b */
    public final void mo13494b(boolean z) {
        mo13493a("is_full_span", Boolean.valueOf(z));
    }

    /* renamed from: c */
    public final void mo13495c(boolean z) {
        mo13493a("is_sticky", Boolean.valueOf(z));
    }

    /* renamed from: d */
    public final void mo13496d(int i) {
        mo13493a("span_size", Integer.valueOf(i));
    }
}
