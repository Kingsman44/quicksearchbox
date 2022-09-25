package com.google.android.libraries.web.weblayer.contrib.microphone.internal;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.search.p2904c.p2908b.C37363a;
import com.google.android.libraries.search.p2904c.p2908b.C37381e;
import com.google.android.libraries.search.p2904c.p2908b.C37382f;
import com.google.android.libraries.search.p2904c.p2908b.C37388l;
import com.google.android.libraries.search.p2904c.p2908b.C37390n;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import org.chromium.weblayer.C72569ae;
import org.chromium.weblayer.C72571ag;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.microphone.internal.d */
/* compiled from: PG */
public final class C44216d extends C72569ae implements C37363a {

    /* renamed from: a */
    public final C72571ag f114998a;

    /* renamed from: b */
    public C2164c f114999b;

    /* renamed from: c */
    public boolean f115000c;

    /* renamed from: d */
    public final /* synthetic */ C44217e f115001d;

    public C44216d(C44217e eVar, C72571ag agVar) {
        this.f115001d = eVar;
        this.f114998a = agVar;
    }

    /* renamed from: c */
    public final C58833ax mo24473c(C37388l lVar) {
        return C58836b.f156633a;
    }

    /* renamed from: d */
    public final /* synthetic */ C60870cx mo24474d() {
        return C60856cj.m92900i(C37381e.AUDIO_ADAPTER_CONNECT_STATUS_SUCCESS);
    }

    /* renamed from: e */
    public final /* synthetic */ C60870cx mo24475e(boolean z) {
        return C60856cj.m92900i(C37382f.AUDIO_ADAPTER_DISCONNECT_STATUS_SUCCESS);
    }

    /* renamed from: f */
    public final C60870cx mo24476f(C37390n nVar) {
        return C2169h.m6027a(new C44214b(this));
    }
}
