package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.ssb.service.SsbService;
import com.google.assistant.p3897e.p3902c.p3907c.C51075fl;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.p3926e.C52036ih;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.ch */
/* compiled from: PG */
public final /* synthetic */ class C92985ch implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C52036ih f259382a;

    public /* synthetic */ C92985ch(C52036ih ihVar) {
        this.f259382a = ihVar;
    }

    public final void run() {
        C51075fl flVar;
        C51075fl flVar2;
        C52036ih ihVar = this.f259382a;
        int i = C92987cj.f259384a;
        C51098gh ghVar = ihVar.f136578c;
        if (ghVar == null) {
            ghVar = C51098gh.f133009e;
        }
        if (ghVar.f133012b == 3) {
            flVar = (C51075fl) ghVar.f133013c;
        } else {
            flVar = C51075fl.f132982e;
        }
        String str = flVar.f132985b;
        C51098gh ghVar2 = ihVar.f136578c;
        if (ghVar2 == null) {
            ghVar2 = C51098gh.f133009e;
        }
        if (ghVar2.f133012b == 3) {
            flVar2 = (C51075fl) ghVar2.f133013c;
        } else {
            flVar2 = C51075fl.f132982e;
        }
        SsbService.m80862e(str, flVar2.f132986c);
    }
}
