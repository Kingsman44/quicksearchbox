package com.google.android.libraries.web.browser.internal;

import com.google.android.libraries.web.base.C43257h;
import com.google.common.base.C58817ah;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.browser.internal.r */
/* compiled from: PG */
public final class C43306r implements C58817ah {

    /* renamed from: a */
    public static final C43306r f113149a = new C43306r();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C43257h hVar = (C43257h) obj;
        C69664n.m101061g(hVar, "params");
        if (!hVar.mo46363l()) {
            return hVar;
        }
        throw new IllegalArgumentException("triggerRequestBlockCallbacks is not supported with asynchronous navigations.");
    }
}
