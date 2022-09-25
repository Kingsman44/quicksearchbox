package com.google.android.libraries.web.contrib.contextmenu.p3362a;

import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56758b;

/* renamed from: com.google.android.libraries.web.contrib.contextmenu.a.o */
/* compiled from: PG */
public final /* synthetic */ class C43428o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C43431r f113454a;

    /* renamed from: b */
    public final /* synthetic */ String f113455b;

    public /* synthetic */ C43428o(C43431r rVar, String str) {
        this.f113454a = rVar;
        this.f113455b = str;
    }

    public final C60870cx apply(Object obj) {
        C43431r rVar = this.f113454a;
        String str = this.f113455b;
        if (((C56758b) obj).f151484b) {
            return C2169h.m6027a(new C43427n(rVar, str));
        }
        return C60856cj.m92899h(new IllegalStateException("Failed to start Lens. Lens is not available."));
    }
}
