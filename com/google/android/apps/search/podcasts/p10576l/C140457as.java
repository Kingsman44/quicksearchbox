package com.google.android.apps.search.podcasts.p10576l;

import androidx.core.p097i.C1970e;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97875aa;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97904bc;
import com.google.common.base.C58817ah;
import com.google.protos.p4757ac.p4758a.C63110i;
import com.google.protos.p4757ac.p4758a.C63111j;
import com.google.protos.p4757ac.p4758a.C63113l;

/* renamed from: com.google.android.apps.search.podcasts.l.as */
/* compiled from: PG */
public final /* synthetic */ class C140457as implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C140457as f381535a = new C140457as();

    private /* synthetic */ C140457as() {
    }

    public final Object apply(Object obj) {
        C97904bc bcVar = (C97904bc) obj;
        C140509u uVar = C140509u.AUTOPLAY_DEFAULT;
        C97875aa aaVar = bcVar.f273362d;
        if (aaVar == null) {
            aaVar = C97875aa.f273287b;
        }
        if (aaVar.f273289a != 5) {
            int i = bcVar.f273359a;
            if (!((i & 2) == 0 || (i & 1) == 0)) {
                C97875aa aaVar2 = bcVar.f273362d;
                if ((aaVar2 == null ? C97875aa.f273287b : aaVar2).f273289a == 2) {
                    uVar = C140509u.AUTOPLAY_SHOW;
                } else {
                    if (aaVar2 == null) {
                        aaVar2 = C97875aa.f273287b;
                    }
                    if (aaVar2.f273289a == 3) {
                        uVar = C140509u.AUTOPLAY_DOWNLOAD;
                    }
                }
                C63111j jVar = bcVar.f273361c;
                if (jVar == null) {
                    jVar = C63111j.f170348p;
                }
                C63110i iVar = (C63110i) jVar.toBuilder();
                C63113l lVar = bcVar.f273360b;
                if (lVar == null) {
                    lVar = C63113l.f170365p;
                }
                iVar.copyOnWrite();
                C63111j jVar2 = (C63111j) iVar.instance;
                lVar.getClass();
                jVar2.f170360k = lVar;
                jVar2.f170350a |= 512;
                return new C1970e((C63111j) iVar.build(), uVar);
            }
        }
        return new C1970e(C63111j.f170348p, uVar);
    }
}
