package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.f */
/* compiled from: PG */
public final class C108681f extends C83869ac {

    /* renamed from: a */
    private static final C59071e f302279a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.deviceregistration.f");

    /* renamed from: b */
    private final boolean f302280b;

    /* renamed from: c */
    private final C108556ar f302281c;

    public C108681f(boolean z, C108556ar arVar) {
        this.f302280b = z;
        this.f302281c = arVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        return C83875ai.m133537b(new C108654e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        if (this.f302280b) {
            return false;
        }
        if (this.f302281c.mo96984c().mo56113h()) {
            return true;
        }
        C59104x c = f302279a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AddressSeq");
        ((C59052c) ((C59052c) c).mo56372aa(24096)).mo56386p("Skip with no assistant device id.");
        return false;
    }
}
