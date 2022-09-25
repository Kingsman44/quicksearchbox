package com.google.android.libraries.elements.p1728g;

import com.facebook.litho.C6405o;
import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.C21265bh;
import com.google.android.libraries.elements.interfaces.C21266bi;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.interfaces.ImageFormatHint;
import com.google.android.libraries.elements.internal.C21341b;
import com.google.android.libraries.elements.internal.C21357r;
import com.google.android.libraries.elements.internal.C21359t;
import com.google.android.libraries.elements.p1705a.p1706a.C20682f;
import com.google.android.libraries.elements.p1705a.p1706a.C20684h;
import com.google.android.libraries.elements.p1714d.C20870cu;
import com.google.android.libraries.elements.p1714d.C21125o;
import com.google.android.libraries.elements.p1714d.p1717c.C20848e;
import com.youtube.p5283a.p5284a.C68037a;
import com.youtube.p5283a.p5284a.C68044ag;
import com.youtube.p5283a.p5284a.C68045ah;
import com.youtube.p5283a.p5284a.C68051an;
import com.youtube.p5283a.p5284a.C68053ap;
import java.util.List;

/* renamed from: com.google.android.libraries.elements.g.k */
/* compiled from: PG */
public final /* synthetic */ class C21183k implements C20870cu {

    /* renamed from: a */
    public final /* synthetic */ C21181i f59431a;

    public /* synthetic */ C21183k(C21181i iVar) {
        this.f59431a = iVar;
    }

    /* renamed from: a */
    public final C6405o mo25823a(C6411u uVar, C21319z zVar, Object obj, String str, C68045ah ahVar, C21125o oVar, List list) {
        C21319z zVar2 = zVar;
        C21181i iVar = this.f59431a;
        C68053ap apVar = (C68053ap) obj;
        C21259bb bbVar = iVar.f59422a;
        boolean z = iVar.f59423b;
        C21265bh bhVar = iVar.f59424c;
        C21266bi biVar = iVar.f59425d;
        C21313t tVar = iVar.f59426e;
        float f = iVar.f59427f;
        C20848e eVar = iVar.f59429h;
        boolean z2 = iVar.f59428g;
        C20684h hVar = new C20684h(apVar);
        C68051an i = hVar.f57969a.mo60127i();
        C20682f fVar = i != null ? new C20682f(i) : null;
        if (fVar != null) {
            C21177e eVar2 = new C21177e();
            eVar2.mo26207c(uVar, new C21179g());
            eVar2.f59401a.f59419f = fVar;
            eVar2.f59402d.set(0);
            eVar2.f59401a.f59410D = bbVar;
            eVar2.f59402d.set(4);
            eVar2.f59401a.f59412F = z;
            eVar2.f59402d.set(5);
            if (hVar.defaultImage() != null) {
                eVar2.f59401a.f59417d = hVar.defaultImage();
            }
            if (hVar.errorImage() != null) {
                eVar2.f59401a.f59418e = hVar.errorImage();
            }
            if (bhVar != null) {
                eVar2.f59401a.f59420g = bhVar;
            }
            if (biVar != null) {
                eVar2.f59401a.f59407A = biVar;
            }
            if (fVar.imageFormatHint() == ImageFormatHint.IMAGE_FORMAT_ANIMATED_GIF || fVar.imageFormatHint() == ImageFormatHint.IMAGE_FORMAT_ANIMATED_WEBP) {
                C21359t tVar2 = new C21359t(bbVar);
                C68044ag agVar = new C68044ag();
                int a = apVar.mo16913a(14);
                if (a != 0) {
                    int i2 = a + apVar.f24703a;
                    agVar.mo16917e(i2 + apVar.f24704b.getInt(i2), apVar.f24704b);
                } else {
                    agVar = null;
                }
                C21357r g = tVar2.mo26863g(agVar, zVar2);
                C68044ag agVar2 = new C68044ag();
                int a2 = apVar.mo16913a(16);
                if (a2 != 0) {
                    int i3 = a2 + apVar.f24703a;
                    agVar2.mo16917e(i3 + apVar.f24704b.getInt(i3), apVar.f24704b);
                } else {
                    agVar2 = null;
                }
                C21357r g2 = tVar2.mo26863g(agVar2, zVar2);
                eVar2.f59401a.f59415b = new C21341b(g != null ? g.mo26862a() : null, g2 != null ? g2.mo26862a() : null, tVar, apVar);
            }
            int a3 = apVar.mo16913a(10);
            eVar2.f59401a.f59409C = a3 != 0 ? apVar.f24704b.getInt(a3 + apVar.f24703a) : 0;
            eVar2.f59402d.set(3);
            C21179g gVar = eVar2.f59401a;
            gVar.f59416c = zVar2;
            gVar.f59408B = f;
            eVar2.f59402d.set(1);
            C68037a aVar = new C68037a();
            Boolean valueOf = Boolean.valueOf(C21359t.m40386l(ahVar, aVar, 168774763, C21180h.f59421a) && "primary_image".equals(aVar.mo60081g()));
            C21179g gVar2 = eVar2.f59401a;
            gVar2.f59414a = valueOf;
            gVar2.f59413G = eVar;
            eVar2.f59402d.set(2);
            eVar2.f59401a.f59411E = z2;
            return eVar2;
        }
        throw new C21260bc("ImageType.image missing");
    }
}
