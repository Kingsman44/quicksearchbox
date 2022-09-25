package com.google.android.libraries.elements.p1714d;

import com.facebook.litho.C6405o;
import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21236af;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21296cl;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21359t;
import com.youtube.p5283a.p5284a.C68042ae;
import com.youtube.p5283a.p5284a.C68044ag;
import com.youtube.p5283a.p5284a.C68045ah;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.elements.d.dm */
/* compiled from: PG */
public final /* synthetic */ class C20917dm implements C20870cu {

    /* renamed from: a */
    public final /* synthetic */ C21359t f58638a;

    /* renamed from: b */
    public final /* synthetic */ C21313t f58639b;

    /* renamed from: c */
    public final /* synthetic */ C21296cl f58640c;

    /* renamed from: d */
    public final /* synthetic */ C21259bb f58641d;

    /* renamed from: e */
    public final /* synthetic */ C21236af f58642e;

    /* renamed from: f */
    public final /* synthetic */ Map f58643f;

    public /* synthetic */ C20917dm(C21359t tVar, C21313t tVar2, C21296cl clVar, C21259bb bbVar, C21236af afVar, Map map) {
        this.f58638a = tVar;
        this.f58639b = tVar2;
        this.f58640c = clVar;
        this.f58641d = bbVar;
        this.f58642e = afVar;
        this.f58643f = map;
    }

    /* renamed from: a */
    public final C6405o mo25823a(C6411u uVar, C21319z zVar, Object obj, String str, C68045ah ahVar, C21125o oVar, List list) {
        C21359t tVar = this.f58638a;
        C21313t tVar2 = this.f58639b;
        C21296cl clVar = this.f58640c;
        C21259bb bbVar = this.f58641d;
        C21236af afVar = this.f58642e;
        Map map = this.f58643f;
        C68042ae aeVar = (C68042ae) obj;
        C20911dg dgVar = new C20911dg();
        dgVar.mo26054c(uVar, new C20913di());
        C68044ag agVar = new C68044ag();
        int a = aeVar.mo16913a(28);
        C68044ag agVar2 = null;
        if (a != 0) {
            int i = a + aeVar.f24703a;
            agVar.mo16917e(i + aeVar.f24704b.getInt(i), aeVar.f24704b);
        } else {
            agVar = null;
        }
        dgVar.f58623a.f58634f = tVar.mo26863g(agVar, zVar);
        dgVar.f58624d.set(5);
        C68044ag agVar3 = new C68044ag();
        int a2 = aeVar.mo16913a(30);
        if (a2 != 0) {
            int i2 = a2 + aeVar.f24703a;
            agVar3.mo16917e(i2 + aeVar.f24704b.getInt(i2), aeVar.f24704b);
            agVar2 = agVar3;
        }
        dgVar.f58623a.f58629a = tVar.mo26863g(agVar2, zVar);
        dgVar.f58624d.set(0);
        dgVar.f58623a.f58630b = tVar2;
        dgVar.f58624d.set(1);
        dgVar.f58623a.f58633e = aeVar;
        dgVar.f58624d.set(4);
        dgVar.f58623a.f58628B = clVar;
        dgVar.f58624d.set(8);
        dgVar.f58623a.f58635g = bbVar;
        dgVar.f58624d.set(6);
        dgVar.f58623a.f58631c = zVar;
        dgVar.f58624d.set(2);
        dgVar.f58623a.f58632d = afVar.mo26208a();
        dgVar.f58624d.set(3);
        dgVar.f58623a.f58627A = map;
        dgVar.f58624d.set(7);
        return dgVar;
    }
}
