package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108820ad;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108861br;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.cx */
/* compiled from: PG */
public final class C108624cx extends C83869ac {

    /* renamed from: a */
    private static final C59071e f302158a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.deviceregistration.cx");

    /* renamed from: b */
    private final bm f302159b;

    public C108624cx(bm bmVar) {
        this.f302159b = bmVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        if (!this.f302159b.q()) {
            return C83875ai.m133537b(new C108820ad());
        }
        if (!this.f302159b.t()) {
            return C83875ai.m133537b(new C108861br());
        }
        C59104x c = f302158a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "eligibilitySeq");
        ((C59052c) ((C59052c) c).mo56372aa(24176)).mo56386p("Opa not eligible with unexpected error");
        return C83875ai.f228524a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        return !this.f302159b.u();
    }
}
