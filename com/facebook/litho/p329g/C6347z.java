package com.facebook.litho.p329g;

import com.facebook.litho.C6154cb;
import com.facebook.litho.C6168cp;
import com.facebook.litho.C6192dl;
import com.facebook.litho.C6349gb;
import com.facebook.litho.p329g.p331b.C6313o;
import com.facebook.litho.p329g.p331b.C6314p;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.litho.g.z */
/* compiled from: PG */
public final class C6347z extends C6154cb {

    /* renamed from: a */
    private final WeakReference f18787a;

    public C6347z(C6346y yVar) {
        super((C6168cp) null, -1, (Object[]) null);
        this.f18787a = new WeakReference(yVar);
    }

    /* renamed from: fD */
    public final /* bridge */ /* synthetic */ void mo13111fD(Object obj) {
        C6332k kVar = (C6332k) obj;
        C6346y yVar = (C6346y) this.f18787a.get();
        if (yVar != null) {
            int i = kVar.f18727b;
            C6285a aVar = yVar.f18776i;
            if (aVar != null) {
                boolean z = kVar.f18726a;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                } else if (i2 == 1) {
                    ((C6314p) aVar).mo13321a(C6313o.LOADED);
                } else if (i2 == 2) {
                    C6314p pVar = (C6314p) aVar;
                    pVar.mo13321a(C6313o.LOADED);
                    pVar.f18683a.mo13574b();
                } else if (i2 == 3) {
                    C6314p pVar2 = (C6314p) aVar;
                    pVar2.mo13321a(C6313o.LOADED);
                    pVar2.f18683a.mo13574b();
                }
            }
            if (!C6349gb.m17046b()) {
                ((C6192dl) yVar.f18769b).post(new C6338q());
            }
        }
    }
}
