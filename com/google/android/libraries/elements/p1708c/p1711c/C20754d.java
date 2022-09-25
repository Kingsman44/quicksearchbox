package com.google.android.libraries.elements.p1708c.p1711c;

import com.facebook.litho.C6405o;
import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21359t;
import com.google.android.libraries.elements.p1714d.C20870cu;
import com.google.android.libraries.elements.p1714d.C21125o;
import com.youtube.p5283a.p5284a.C68044ag;
import com.youtube.p5283a.p5284a.C68045ah;
import com.youtube.p5283a.p5284a.C68082d;
import java.util.List;

/* renamed from: com.google.android.libraries.elements.c.c.d */
/* compiled from: PG */
public final /* synthetic */ class C20754d implements C20870cu {

    /* renamed from: a */
    public final /* synthetic */ C21259bb f58087a;

    /* renamed from: b */
    public final /* synthetic */ C21313t f58088b;

    public /* synthetic */ C20754d(C21259bb bbVar, C21313t tVar) {
        this.f58087a = bbVar;
        this.f58088b = tVar;
    }

    /* renamed from: a */
    public final C6405o mo25823a(C6411u uVar, C21319z zVar, Object obj, String str, C68045ah ahVar, C21125o oVar, List list) {
        C21259bb bbVar = this.f58087a;
        C21313t tVar = this.f58088b;
        C68082d dVar = (C68082d) obj;
        if (dVar.mo60209i() == null) {
            throw new C21260bc("AnimatedVectorType.animation missing");
        } else if (dVar.mo60209i().mo60210g() == null && dVar.mo60209i().mo60211h() == null) {
            throw new C21260bc("AnimatedVectorType.animation doesn't have url or jsonStr.");
        } else {
            C21359t tVar2 = new C21359t(bbVar);
            C20752b bVar = new C20752b();
            bVar.mo25822c(uVar, new C20753c());
            bVar.f58076a.f58080a = tVar;
            bVar.f58077d.set(0);
            bVar.f58076a.f58081b = zVar;
            bVar.f58077d.set(1);
            bVar.f58076a.f58086g = dVar;
            bVar.f58077d.set(5);
            bVar.f58076a.f58083d = bbVar;
            bVar.f58077d.set(2);
            bVar.f58076a.f58079A = oVar;
            C68044ag agVar = new C68044ag();
            int a = dVar.mo16913a(24);
            C68044ag agVar2 = null;
            if (a != 0) {
                int i = a + dVar.f24703a;
                agVar.mo16917e(i + dVar.f24704b.getInt(i), dVar.f24704b);
            } else {
                agVar = null;
            }
            bVar.f58076a.f58084e = tVar2.mo26863g(agVar, zVar);
            bVar.f58077d.set(3);
            C68044ag agVar3 = new C68044ag();
            int a2 = dVar.mo16913a(22);
            if (a2 != 0) {
                int i2 = a2 + dVar.f24703a;
                agVar3.mo16917e(i2 + dVar.f24704b.getInt(i2), dVar.f24704b);
                agVar2 = agVar3;
            }
            bVar.f58076a.f58085f = tVar2.mo26863g(agVar2, zVar);
            bVar.f58077d.set(4);
            bVar.f58076a.f58082c = str;
            return bVar;
        }
    }
}
