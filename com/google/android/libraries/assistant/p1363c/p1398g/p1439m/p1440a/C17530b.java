package com.google.android.libraries.assistant.p1363c.p1398g.p1439m.p1440a;

import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17477am;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17484at;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17485au;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17508k;
import com.google.android.libraries.assistant.p1363c.p1398g.p1441n.C17537a;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.libraries.assistant.c.g.m.a.b */
/* compiled from: PG */
public final /* synthetic */ class C17530b implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C17508k f50561a;

    /* renamed from: b */
    public final /* synthetic */ C17485au f50562b;

    /* renamed from: c */
    public final /* synthetic */ C17537a f50563c;

    /* renamed from: d */
    public final /* synthetic */ C17537a f50564d;

    /* renamed from: e */
    public final /* synthetic */ C17477am f50565e;

    public /* synthetic */ C17530b(C17508k kVar, C17485au auVar, C17537a aVar, C17537a aVar2, C17477am amVar) {
        this.f50561a = kVar;
        this.f50562b = auVar;
        this.f50563c = aVar;
        this.f50564d = aVar2;
        this.f50565e = amVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        int i;
        C17508k kVar = this.f50561a;
        C17485au auVar = this.f50562b;
        C17537a aVar = this.f50563c;
        C17537a aVar2 = this.f50564d;
        C17477am amVar = this.f50565e;
        C17484at a = C17484at.m34786a(auVar.f50486d);
        if (a == null) {
            a = C17484at.UNKNOWN_MODE;
        }
        if (a == C17484at.SERVER) {
            int i2 = auVar.f50484b;
            if (i2 == 3 || i2 == 4) {
                return aVar2.mo23383a(auVar, amVar, kVar);
            }
        } else {
            C17484at a2 = C17484at.m34786a(auVar.f50486d);
            if (a2 == null) {
                a2 = C17484at.UNKNOWN_MODE;
            }
            if (a2 == C17484at.CLIENT && ((i = auVar.f50484b) == 2 || i == 3)) {
                return aVar.mo23383a(auVar, amVar, kVar);
            }
        }
        throw new IllegalStateException("Unsupported SynthesisRequest/SynthesizeMode. Only TtsServiceRequest and NlgServiceRequest are supported in SERVER mode. Only markup Text and TtsServiceRequest are supported in CLIENT mode.");
    }
}
