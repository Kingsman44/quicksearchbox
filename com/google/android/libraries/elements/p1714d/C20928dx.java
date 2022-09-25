package com.google.android.libraries.elements.p1714d;

import com.facebook.litho.C6405o;
import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21359t;
import com.google.android.libraries.elements.p1705a.p1706a.C20689m;
import com.youtube.p5283a.p5284a.C68044ag;
import com.youtube.p5283a.p5284a.C68045ah;
import com.youtube.p5283a.p5284a.C68069be;
import java.util.List;

/* renamed from: com.google.android.libraries.elements.d.dx */
/* compiled from: PG */
public final /* synthetic */ class C20928dx implements C20870cu {

    /* renamed from: a */
    public final /* synthetic */ C21259bb f58691a;

    /* renamed from: b */
    public final /* synthetic */ C21313t f58692b;

    /* renamed from: c */
    public final /* synthetic */ C21359t f58693c;

    public /* synthetic */ C20928dx(C21259bb bbVar, C21313t tVar, C21359t tVar2) {
        this.f58691a = bbVar;
        this.f58692b = tVar;
        this.f58693c = tVar2;
    }

    /* renamed from: a */
    public final C6405o mo25823a(C6411u uVar, C21319z zVar, Object obj, String str, C68045ah ahVar, C21125o oVar, List list) {
        C21259bb bbVar = this.f58691a;
        C21313t tVar = this.f58692b;
        C21359t tVar2 = this.f58693c;
        C68069be beVar = (C68069be) obj;
        C20921dq dqVar = new C20921dq();
        dqVar.mo26056c(uVar, new C20922dr());
        dqVar.f58654a.f58663G = C20804aq.m39057c(ahVar);
        dqVar.f58655d.set(3);
        dqVar.f58654a.f58666c = list;
        dqVar.f58655d.set(0);
        if (str != null) {
            dqVar.f58654a.f58669f = str;
        }
        dqVar.f58654a.f58670g = bbVar;
        dqVar.f58655d.set(4);
        dqVar.f58654a.f58667d = tVar;
        dqVar.f58655d.set(1);
        dqVar.f58654a.f58660D = new C20689m(beVar);
        dqVar.f58655d.set(8);
        C68044ag agVar = new C68044ag();
        int a = beVar.mo16913a(14);
        C68044ag agVar2 = null;
        if (a != 0) {
            int i = a + beVar.f24703a;
            agVar.mo16917e(i + beVar.f24704b.getInt(i), beVar.f24704b);
        } else {
            agVar = null;
        }
        dqVar.f58654a.f58658B = tVar2.mo26863g(agVar, zVar);
        dqVar.f58655d.set(6);
        C68044ag agVar3 = new C68044ag();
        int a2 = beVar.mo16913a(16);
        if (a2 != 0) {
            int i2 = a2 + beVar.f24703a;
            agVar3.mo16917e(i2 + beVar.f24704b.getInt(i2), beVar.f24704b);
        } else {
            agVar3 = null;
        }
        dqVar.f58654a.f58657A = tVar2.mo26863g(agVar3, zVar);
        dqVar.f58655d.set(5);
        C68044ag agVar4 = new C68044ag();
        int a3 = beVar.mo16913a(18);
        if (a3 != 0) {
            int i3 = a3 + beVar.f24703a;
            agVar4.mo16917e(i3 + beVar.f24704b.getInt(i3), beVar.f24704b);
            agVar2 = agVar4;
        }
        dqVar.f58654a.f58659C = tVar2.mo26863g(agVar2, zVar);
        dqVar.f58655d.set(7);
        dqVar.f58654a.f58668e = zVar;
        dqVar.f58655d.set(2);
        return dqVar;
    }
}
