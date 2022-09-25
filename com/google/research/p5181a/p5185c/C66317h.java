package com.google.research.p5181a.p5185c;

import com.google.research.p5181a.C66298ac;
import com.google.research.p5181a.p5182a.C66278a;
import com.google.research.p5181a.p5186d.C66343o;
import com.google.research.p5181a.p5188f.C66376a;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.research.a.c.h */
/* compiled from: PG */
public final class C66317h extends C66310a {
    public C66317h() {
        this.f180321d = 200;
    }

    /* renamed from: a */
    public final int mo59505a() {
        return this.f180321d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C66343o mo59507c(C66278a aVar, C66376a aVar2) {
        C66343o oVar = new C66343o(1, this.f180321d);
        Long valueOf = Long.valueOf(aVar2.mo59467j().mo59503c());
        boolean[] zArr = new boolean[this.f180321d];
        int i = aVar.f180248b;
        while (true) {
            i--;
            if (i < 0) {
                break;
            }
            C66376a aVar3 = (C66376a) aVar.mo59448a(i);
            if (aVar3.mo59467j().mo59503c() < valueOf.longValue() - 600000) {
                break;
            }
            int e = mo59510e(aVar3.mo59460c(), aVar3.mo59467j().mo59503c());
            if (!zArr[e]) {
                oVar.f180409c[e] = (double) ((C66298ac) aVar3.mo59467j().f180317a.instance).f180303g;
                zArr[e] = true;
            }
        }
        return oVar;
    }

    /* renamed from: d */
    public final String mo59509d() {
        return "foreground_time";
    }

    /* renamed from: n */
    public final C66317h mo59511f() {
        C66317h hVar = new C66317h(this.f180321d);
        for (Map.Entry entry : this.f180318a.entrySet()) {
            hVar.f180318a.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : this.f180319b.entrySet()) {
            hVar.f180319b.put(entry2.getKey(), entry2.getValue());
        }
        boolean[] zArr = this.f180320c;
        hVar.f180320c = Arrays.copyOf(zArr, zArr.length);
        hVar.f180329j = this.f180329j;
        return hVar;
    }

    public C66317h(int i) {
        super(i);
    }
}
