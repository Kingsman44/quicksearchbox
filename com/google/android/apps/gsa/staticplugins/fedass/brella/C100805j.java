package com.google.android.apps.gsa.staticplugins.fedass.brella;

import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100788s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.brella.j */
/* compiled from: PG */
public final /* synthetic */ class C100805j implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ GsaExampleStoreService f281742a;

    /* renamed from: b */
    public final /* synthetic */ String f281743b;

    /* renamed from: c */
    public final /* synthetic */ String f281744c;

    /* renamed from: d */
    public final /* synthetic */ byte[] f281745d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f281746e;

    public /* synthetic */ C100805j(GsaExampleStoreService gsaExampleStoreService, String str, String str2, byte[] bArr, byte[] bArr2) {
        this.f281742a = gsaExampleStoreService;
        this.f281743b = str;
        this.f281744c = str2;
        this.f281745d = bArr;
        this.f281746e = bArr2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        GsaExampleStoreService gsaExampleStoreService = this.f281742a;
        String str = this.f281743b;
        String str2 = this.f281744c;
        byte[] bArr = this.f281745d;
        byte[] bArr2 = this.f281746e;
        C100788s sVar = gsaExampleStoreService.f281715c;
        C59104x b = C100788s.f281704a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "EkhoTrainingWrp");
        ((C59052c) ((C59052c) b).mo56372aa(19538)).mo56386p("getMaterializer()");
        if (sVar.mo92055b()) {
            return sVar.mo92054a(str, str2, bArr, bArr2);
        }
        C59104x b2 = C100788s.f281704a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "EkhoTrainingWrp");
        ((C59052c) ((C59052c) b2).mo56372aa(19539)).mo56386p("getMaterializer(): preconditions failed.");
        return C60856cj.m92900i(Optional.empty());
    }
}
