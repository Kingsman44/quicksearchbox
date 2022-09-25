package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p780c.p783b.p784a.p785a.p786a;

import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.Iterator;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.c.b.a.a.a.c */
/* compiled from: PG */
public final class C12302c extends C68247h {

    /* renamed from: a */
    private final C68283d f39093a;

    /* renamed from: c */
    private final C68283d f39094c;

    /* renamed from: d */
    private final C68283d f39095d;

    public C12302c(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C12302c.class), aVar);
        this.f39093a = C68236af.m98549d(dVar);
        this.f39094c = C68236af.m98549d(dVar2);
        this.f39095d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C52078ek ekVar;
        List list = (List) obj;
        C52081en enVar = (C52081en) list.get(0);
        boolean z = true;
        boolean booleanValue = ((Boolean) list.get(2)).booleanValue();
        if (!((C58833ax) list.get(1)).mo56113h()) {
            Iterator it = enVar.f136684d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = Boolean.valueOf(booleanValue);
                    break;
                }
                C52083ep epVar = (C52083ep) it.next();
                if (epVar.f136692b == 3) {
                    ekVar = (C52078ek) epVar.f136693c;
                } else {
                    ekVar = C52078ek.f136671f;
                }
                if (ekVar.f136674b == 5) {
                    break;
                }
            }
        }
        return C60856cj.m92900i(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39093a.mo60297gq(), this.f39094c.mo60297gq(), this.f39095d.mo60297gq());
    }
}
