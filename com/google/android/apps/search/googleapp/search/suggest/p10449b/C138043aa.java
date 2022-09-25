package com.google.android.apps.search.googleapp.search.suggest.p10449b;

import com.google.android.apps.search.googleapp.search.suggest.p10452d.C138076c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4552o.amt;
import com.google.common.p4552o.aoa;
import com.google.common.p4552o.aob;
import com.google.common.p4552o.apd;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.b.aa */
/* compiled from: PG */
public final class C138043aa implements C138048e {

    /* renamed from: a */
    public final boolean f375609a;

    /* renamed from: b */
    public final C21370a f375610b;

    /* renamed from: c */
    public final C138076c f375611c;

    /* renamed from: d */
    public final C138052i f375612d;

    public C138043aa(boolean z, C21370a aVar, C138076c cVar, C138052i iVar) {
        this.f375609a = z;
        this.f375610b = aVar;
        this.f375611c = cVar;
        this.f375612d = iVar;
    }

    /* renamed from: a */
    public final void mo114093a() {
        this.f375612d.mo114099c();
    }

    /* renamed from: b */
    public final /* synthetic */ void mo114094b(C138047d dVar) {
    }

    /* renamed from: c */
    public final void mo114095c(amt amt) {
        if (this.f375609a) {
            C138036a aVar = (C138036a) this.f375612d.mo114097a();
            if (aVar.f375592a != 0) {
                aoa aoa = (aoa) aob.f159424i.createBuilder();
                String str = aVar.f375594c;
                aoa.copyOnWrite();
                aob aob = (aob) aoa.instance;
                aob.f159426a |= 8;
                aob.f159430e = str;
                int i = aVar.f375593b;
                aoa.copyOnWrite();
                aob aob2 = (aob) aoa.instance;
                aob2.f159426a |= 2;
                aob2.f159428c = i;
                int i2 = aVar.f375592a;
                aoa.copyOnWrite();
                aob aob3 = (aob) aoa.instance;
                aob3.f159426a |= 4;
                aob3.f159429d = i2;
                aob aob4 = (aob) aoa.build();
                amt.copyOnWrite();
                apd apd = (apd) amt.instance;
                apd apd2 = apd.f159555aA;
                aob4.getClass();
                apd.f159609az = aob4;
                apd.f159611c |= 8388608;
            }
        }
    }
}
