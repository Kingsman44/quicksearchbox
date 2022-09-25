package com.google.android.libraries.elements.p1714d;

import com.facebook.litho.C6405o;
import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21359t;
import com.google.android.libraries.elements.p1714d.p1715a.C20784i;
import com.google.android.libraries.elements.p1714d.p1719e.p1720a.C20975g;
import com.youtube.p5283a.p5284a.C68044ag;
import com.youtube.p5283a.p5284a.C68045ah;
import com.youtube.p5283a.p5284a.C68093o;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.elements.d.i */
/* compiled from: PG */
public final /* synthetic */ class C21119i implements C20870cu {

    /* renamed from: a */
    public final /* synthetic */ C20975g f59203a;

    /* renamed from: b */
    public final /* synthetic */ C69464a f59204b;

    /* renamed from: c */
    public final /* synthetic */ C21313t f59205c;

    /* renamed from: d */
    public final /* synthetic */ C21259bb f59206d;

    /* renamed from: e */
    public final /* synthetic */ C21359t f59207e;

    /* renamed from: f */
    public final /* synthetic */ C20784i f59208f;

    public /* synthetic */ C21119i(C20975g gVar, C69464a aVar, C21313t tVar, C21259bb bbVar, C21359t tVar2, C20784i iVar) {
        this.f59203a = gVar;
        this.f59204b = aVar;
        this.f59205c = tVar;
        this.f59206d = bbVar;
        this.f59207e = tVar2;
        this.f59208f = iVar;
    }

    /* renamed from: a */
    public final C6405o mo25823a(C6411u uVar, C21319z zVar, Object obj, String str, C68045ah ahVar, C21125o oVar, List list) {
        C20975g gVar = this.f59203a;
        C69464a aVar = this.f59204b;
        C21313t tVar = this.f59205c;
        C21259bb bbVar = this.f59206d;
        C21359t tVar2 = this.f59207e;
        C20784i iVar = this.f59208f;
        C68093o oVar2 = (C68093o) obj;
        C21075f fVar = new C21075f();
        fVar.mo26134c(uVar, new C21118h());
        fVar.f59078a.f59190G = gVar;
        fVar.f59079d.set(9);
        fVar.f59078a.f59199d = zVar;
        fVar.f59079d.set(3);
        fVar.f59078a.f59197b = oVar2;
        fVar.f59079d.set(1);
        fVar.f59078a.f59196a = list;
        fVar.f59079d.set(0);
        if (oVar != null) {
            fVar.f59078a.f59194K = oVar;
        }
        AtomicReference v = zVar.mo26822v();
        C21118h hVar = fVar.f59078a;
        hVar.f59188E = v;
        hVar.f59189F = aVar;
        if (str != null) {
            hVar.f59200e = str;
        }
        hVar.f59198c = tVar;
        fVar.f59079d.set(2);
        fVar.f59078a.f59184A = bbVar;
        fVar.f59079d.set(5);
        C68044ag agVar = new C68044ag();
        int a = oVar2.mo16913a(24);
        C68044ag agVar2 = null;
        if (a != 0) {
            int i = a + oVar2.f24703a;
            agVar.mo16917e(i + oVar2.f24704b.getInt(i), oVar2.f24704b);
        } else {
            agVar = null;
        }
        fVar.f59078a.f59186C = tVar2.mo26863g(agVar, zVar);
        fVar.f59079d.set(7);
        C68044ag agVar3 = new C68044ag();
        int a2 = oVar2.mo16913a(30);
        if (a2 != 0) {
            int i2 = a2 + oVar2.f24703a;
            agVar3.mo16917e(i2 + oVar2.f24704b.getInt(i2), oVar2.f24704b);
        } else {
            agVar3 = null;
        }
        fVar.f59078a.f59185B = tVar2.mo26863g(agVar3, zVar);
        fVar.f59079d.set(6);
        C68044ag agVar4 = new C68044ag();
        int a3 = oVar2.mo16913a(32);
        if (a3 != 0) {
            int i3 = a3 + oVar2.f24703a;
            agVar4.mo16917e(i3 + oVar2.f24704b.getInt(i3), oVar2.f24704b);
            agVar2 = agVar4;
        }
        fVar.f59078a.f59187D = tVar2.mo26863g(agVar2, zVar);
        fVar.f59079d.set(8);
        fVar.f59078a.f59195L = iVar;
        fVar.f59079d.set(4);
        return fVar;
    }
}
