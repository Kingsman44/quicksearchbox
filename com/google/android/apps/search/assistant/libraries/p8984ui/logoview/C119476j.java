package com.google.android.apps.search.assistant.libraries.p8984ui.logoview;

import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119462a;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119463b;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.j */
/* compiled from: PG */
final class C119476j extends C119456al {
    public C119476j() {
        super("THINKING");
    }

    /* renamed from: a */
    public final void mo104363a(C119463b bVar) {
        C119457am.m198245m(bVar);
    }

    /* renamed from: b */
    public final void mo104364b(C119463b bVar) {
        bVar.mo104385d(0.0f, bVar.f333045b);
        C119462a aVar = bVar.f333045b;
        float f = aVar.f333032b.f332974b;
        C119462a aVar2 = bVar.f333046c;
        float f2 = aVar2.f333032b.f332974b;
        float f3 = bVar.f333047d.f333032b.f332974b;
        C119462a aVar3 = bVar.f333048e;
        float f4 = f3 - f2;
        float f5 = aVar3.f333032b.f332974b - f3;
        if (f2 - f > 1.5707964f) {
            bVar.mo104385d(0.0f, aVar2);
        } else if (f4 > 1.5707964f) {
            bVar.mo104385d(1.5707964f, aVar2);
        } else if (f5 > 1.5707964f) {
            bVar.mo104385d(3.1415927f, aVar3);
        } else {
            bVar.mo104385d(4.712389f, aVar);
        }
        bVar.f333045b.f333032b.mo104357c(4.712389f);
        bVar.f333046c.f333032b.mo104357c(0.0f);
        bVar.f333047d.f333032b.mo104357c(1.5707964f);
        bVar.f333048e.f333032b.mo104357c(3.1415927f);
    }

    /* renamed from: c */
    public final boolean mo104365c(long j, long j2, C119463b bVar) {
        float f;
        C119463b bVar2 = bVar;
        float f2 = ((float) (j2 - j)) / 6000.0f;
        float f3 = f2 - ((float) ((int) f2));
        int i = C119457am.f333015a;
        C119462a aVar = bVar2.f333045b;
        C119462a aVar2 = bVar2.f333046c;
        C119462a aVar3 = bVar2.f333047d;
        C119462a aVar4 = bVar2.f333048e;
        if (f3 < 0.16749999f) {
            aVar.f333032b.mo104357c(4.712389f);
            aVar2.f333032b.mo104357c(0.0f);
            aVar3.f333032b.mo104357c(1.5707964f);
            aVar4.f333032b.mo104357c(3.1415927f);
        } else {
            double d = (double) f3;
            if (d < 0.25d) {
                aVar.f333032b.mo104357c(4.712389f);
                aVar2.f333032b.mo104357c(1.5707964f);
                aVar3.f333032b.mo104357c(2.6179938f);
                aVar4.f333032b.mo104357c(3.6651917f);
            } else if (f3 < 0.4175f) {
                aVar.f333032b.mo104357c(0.0f);
                aVar2.f333032b.mo104357c(1.5707964f);
                aVar3.f333032b.mo104357c(3.1415927f);
                aVar4.f333032b.mo104357c(4.712389f);
            } else if (d < 0.5d) {
                aVar.f333032b.mo104357c(0.5235988f);
                aVar2.f333032b.mo104357c(1.5707964f);
                aVar3.f333032b.mo104357c(4.712389f);
                aVar4.f333032b.mo104357c(5.759587f);
            } else if (f3 < 0.6675f) {
                aVar.f333032b.mo104357c(1.5707964f);
                aVar2.f333032b.mo104357c(3.1415927f);
                aVar3.f333032b.mo104357c(4.712389f);
                aVar4.f333032b.mo104357c(0.0f);
            } else if (d < 0.75d) {
                aVar.f333032b.mo104357c(2.6179938f);
                aVar2.f333032b.mo104357c(3.6651917f);
                aVar3.f333032b.mo104357c(4.712389f);
                aVar4.f333032b.mo104357c(1.5707964f);
            } else if (f3 < 0.9175f) {
                aVar.f333032b.mo104357c(3.1415927f);
                aVar2.f333032b.mo104357c(4.712389f);
                aVar3.f333032b.mo104357c(0.0f);
                aVar4.f333032b.mo104357c(1.5707964f);
            } else if (f3 < 1.0f) {
                aVar.f333032b.mo104357c(4.712389f);
                aVar2.f333032b.mo104357c(5.759587f);
                aVar3.f333032b.mo104357c(0.5235988f);
                aVar4.f333032b.mo104357c(1.5707964f);
            }
            f = 2.0f;
            bVar2.f333051h.mo104391b(f * 3.0f);
            return true;
        }
        f = 1.0f;
        bVar2.f333051h.mo104391b(f * 3.0f);
        return true;
    }
}
