package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.chips;

import android.support.p033v7.p040e.C0422d;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65496e;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65497f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.chips.d */
/* compiled from: PG */
public final class C128603d extends C0422d {

    /* renamed from: a */
    final /* synthetic */ C128604e f353588a;

    /* renamed from: b */
    final /* synthetic */ C65497f f353589b;

    public C128603d(C128604e eVar, C65497f fVar) {
        this.f353588a = eVar;
        this.f353589b = fVar;
    }

    /* renamed from: a */
    public final int mo1379a() {
        return this.f353589b.f178059a.size();
    }

    /* renamed from: b */
    public final int mo1380b() {
        return this.f353588a.f353596g.f178059a.size();
    }

    /* renamed from: d */
    public final boolean mo1382d(int i, int i2) {
        return C69664n.m101066l((C65496e) this.f353588a.f353596g.f178059a.get(i), (C65496e) this.f353588a.f353596g.f178059a.get(i2));
    }

    /* renamed from: e */
    public final boolean mo1383e(int i, int i2) {
        C65496e eVar = (C65496e) this.f353588a.f353596g.f178059a.get(i);
        C69664n.m101060f(eVar, "field.getChips(oldPos)");
        C65496e eVar2 = (C65496e) this.f353588a.f353596g.f178059a.get(i2);
        C69664n.m101060f(eVar2, "field.getChips(newPos)");
        String str = eVar.f178053b;
        C69664n.m101060f(str, "left.id");
        if (str.length() != 0) {
            String str2 = eVar2.f178053b;
            C69664n.m101060f(str2, "right.id");
            if (str2.length() != 0) {
                return C69664n.m101066l(eVar.f178053b, eVar2.f178053b);
            }
        }
        return C69664n.m101066l(eVar.f178054c, eVar2.f178054c);
    }
}
