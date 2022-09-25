package com.google.android.libraries.lens.ondevice.p2034k;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.lens.ondevice.nativeapi.LodeResourceHolder;
import com.google.android.libraries.lens.ondevice.p2017a.C24266a;
import com.google.android.libraries.lens.ondevice.p2018b.p2019a.C24272d;
import com.google.android.libraries.lens.ondevice.p2023c.C24291a;
import com.google.android.libraries.lens.ondevice.p2026f.p2029b.C24473a;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.android.libraries.lens.ondevice.p2037n.C24796g;
import com.google.android.libraries.lens.ondevice.p2037n.C24797h;
import com.google.android.libraries.lens.ondevice.p2037n.C24800k;
import com.google.android.libraries.lens.ondevice.p2037n.C24801l;
import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.p1657ba.p1664c.p1668c.C19668f;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1670b.C19653a;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1670b.C19654b;
import com.google.common.base.C58833ax;
import com.google.lens.p4701g.C62348k;
import com.google.lens.p4701g.C62349l;
import com.google.lens.p4701g.C62350m;
import com.google.lens.p4701g.C62351n;

@C24266a(mo29795a = "EmbeddingEngine")
/* renamed from: com.google.android.libraries.lens.ondevice.k.u */
/* compiled from: PG */
public final class C24751u implements C24650eg {

    /* renamed from: a */
    final C24754x f67636a;

    /* renamed from: b */
    private final int f67637b;

    public C24751u(C24754x xVar, C26244b bVar) {
        this.f67636a = xVar;
        int b = (int) bVar.mo31456b(C26239a.EMBEDDING_MODEL);
        this.f67637b = b != 0 ? b != 1 ? b != 2 ? b != 3 ? 0 : 5 : 4 : 3 : 2;
    }

    /* renamed from: a */
    public final C58833ax mo29949a(C24795f fVar) {
        C24796g gVar = (C24796g) C24797h.f67760b.createBuilder();
        gVar.mo30004a(C24473a.m45545d(C24754x.m45908a(this.f67637b), 1));
        C24797h hVar = (C24797h) gVar.build();
        C24800k kVar = (C24800k) C24801l.f67766c.createBuilder();
        kVar.copyOnWrite();
        C24801l lVar = (C24801l) kVar.instance;
        hVar.getClass();
        lVar.f67769b = hVar;
        lVar.f67768a |= 2;
        return C58833ax.m90834k((C24801l) kVar.build());
    }

    /* renamed from: b */
    public final void mo29950b(Context context, LodeResourceHolder lodeResourceHolder, C24803n nVar, C24795f fVar) {
        C24754x xVar = this.f67636a;
        String a = C24754x.m45908a(this.f67637b);
        String f = C24473a.m45547f(nVar, a);
        if (!TextUtils.isEmpty(f)) {
            C19668f b = C24291a.m45355b(f);
            C62349l lVar = fVar.f67756h;
            if (lVar == null) {
                lVar = C62349l.f168317c;
            }
            C19654b bVar = lVar.f168320b;
            if (bVar == null) {
                bVar = C19654b.f54669d;
            }
            C19653a aVar = (C19653a) bVar.toBuilder();
            aVar.copyOnWrite();
            C19654b bVar2 = (C19654b) aVar.instance;
            b.getClass();
            bVar2.f54672b = b;
            bVar2.f54671a |= 8;
            C19654b bVar3 = (C19654b) aVar.build();
            C62348k kVar = (C62348k) C62349l.f168317c.createBuilder();
            kVar.copyOnWrite();
            C62349l lVar2 = (C62349l) kVar.instance;
            bVar3.getClass();
            lVar2.f168320b = bVar3;
            lVar2.f168319a |= 1;
            C62349l lVar3 = (C62349l) kVar.build();
            C62350m mVar = (C62350m) C62351n.f168321c.createBuilder();
            mVar.copyOnWrite();
            C62351n nVar2 = (C62351n) mVar.instance;
            lVar3.getClass();
            nVar2.f168324b = lVar3;
            nVar2.f168323a = 7;
            xVar.f67642a.mo30015f(context, (C62351n) mVar.build());
            return;
        }
        throw new C24272d(a);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo29951c() {
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo29952d(C24795f fVar) {
        return false;
    }
}
