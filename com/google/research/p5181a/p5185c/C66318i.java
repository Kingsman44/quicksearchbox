package com.google.research.p5181a.p5185c;

import com.google.research.p5181a.p5182a.C66278a;
import com.google.research.p5181a.p5182a.C66279b;
import com.google.research.p5181a.p5186d.C66343o;
import com.google.research.p5181a.p5188f.C66376a;
import java.util.List;

/* renamed from: com.google.research.a.c.i */
/* compiled from: PG */
public final class C66318i extends C66316g {

    /* renamed from: a */
    private boolean f180331a = true;

    /* renamed from: b */
    private boolean f180332b = true;

    public C66318i() {
        this.f180330k.clear();
        this.f180330k.put("headset_wired", true);
        this.f180330k.put("headset_bluetooth", true);
    }

    /* renamed from: a */
    public final int mo59505a() {
        return 4;
    }

    /* renamed from: b */
    public final C66316g mo59506b() {
        return new C66318i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C66343o mo59507c(C66278a aVar, C66376a aVar2) {
        C66343o oVar = new C66343o(1, 4);
        List<C66376a> a = C66279b.m96854a(aVar, 5);
        this.f180331a = true;
        this.f180332b = true;
        for (C66376a aVar3 : a) {
            if (aVar2.mo59467j().mo59503c() - aVar3.mo59467j().mo59503c() < 600000) {
                if (aVar3.mo59460c().equals("headset_wired_in")) {
                    oVar.f180409c[0] = 1.0d;
                    this.f180331a = false;
                } else if (aVar3.mo59460c().equals("headset_wired_out")) {
                    oVar.f180409c[1] = 1.0d;
                    this.f180331a = false;
                } else if (aVar3.mo59460c().equals("headset_bluetooth_in")) {
                    oVar.f180409c[2] = 1.0d;
                    this.f180332b = false;
                } else if (aVar3.mo59460c().equals("headset_bluetooth_out")) {
                    oVar.f180409c[3] = 1.0d;
                    this.f180332b = false;
                }
            }
        }
        return oVar;
    }

    public final /* synthetic */ Object clone() {
        return new C66318i();
    }

    /* renamed from: d */
    public final String mo59509d() {
        return "headset";
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo59524m(boolean z) {
        this.f180330k.put("headset_wired", Boolean.valueOf(this.f180331a));
        this.f180330k.put("headset_bluetooth", Boolean.valueOf(this.f180332b));
    }
}
