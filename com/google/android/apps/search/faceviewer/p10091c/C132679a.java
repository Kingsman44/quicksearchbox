package com.google.android.apps.search.faceviewer.p10091c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.logging.p3034a.C38768q;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.p4552o.p4560f.C59771a;
import com.google.common.p4552o.p4560f.C59772b;
import com.google.p363ad.p364a.C6684h;
import com.google.p363ad.p364a.C6685i;
import com.google.p363ad.p364a.C6694r;
import com.google.p363ad.p364a.C6702z;

/* renamed from: com.google.android.apps.search.faceviewer.c.a */
/* compiled from: PG */
public final class C132679a extends C10662f {

    /* renamed from: c */
    private final C38768q f362062c;

    public C132679a(C38768q qVar) {
        this.f362062c = qVar;
    }

    /* renamed from: a */
    public final void mo18697a(C6685i iVar) {
        C6702z zVar = (C6702z) iVar.instance;
        if (zVar.f20010b == 5) {
            C6684h hVar = (C6684h) zVar.f20011c;
            C6694r rVar = hVar.f19964c;
            if (rVar == null) {
                rVar = C6694r.f19986j;
            }
            if ((rVar.f19988a & 128) != 0) {
                C6694r rVar2 = hVar.f19964c;
                if (rVar2 == null) {
                    rVar2 = C6694r.f19986j;
                }
                if (rVar2.f19996i < 3000) {
                    return;
                }
            }
        }
        C59771a aVar = (C59771a) C59772b.f161506c.createBuilder();
        C6702z zVar2 = (C6702z) iVar.build();
        aVar.copyOnWrite();
        C59772b bVar = (C59772b) aVar.instance;
        zVar2.getClass();
        bVar.f161510b = zVar2;
        bVar.f161509a |= 1;
        this.f362062c.mo41590b(C59743a.FACEVIEWER_LOG_EVENT, C59772b.f161507d, (C59772b) aVar.build());
    }
}
