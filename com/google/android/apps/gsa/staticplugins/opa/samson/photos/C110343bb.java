package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.p4715m.p4716a.p4720b.p4721a.C62687o;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.bb */
/* compiled from: PG */
public final /* synthetic */ class C110343bb implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C110343bb f307553a = new C110343bb();

    private /* synthetic */ C110343bb() {
    }

    public final Object apply(Object obj) {
        String str;
        C62687o oVar = (C62687o) obj;
        String a = C110345bd.m183747a(oVar);
        C110385o oVar2 = new C110385o();
        boolean z = false;
        oVar2.mo98595a(false);
        if (a != null) {
            oVar2.f307653a = a;
            if ((oVar.f169246a & C89885b.HTTP_VALUE) != 0) {
                z = true;
            }
            oVar2.mo98595a(z);
            if ((oVar.f169246a & 1073741824) != 0) {
                C62687o oVar3 = oVar.f169250e;
                if (oVar3 == null) {
                    oVar3 = C62687o.f169244f;
                }
                oVar2.f307655c = C58833ax.m90834k(C110345bd.m183747a(oVar3));
            }
            if (oVar2.f307656d == 1 && (str = oVar2.f307653a) != null) {
                return new C110386p(str, oVar2.f307654b, oVar2.f307655c);
            }
            StringBuilder sb = new StringBuilder();
            if (oVar2.f307653a == null) {
                sb.append(" primaryPhotoUrl");
            }
            if (oVar2.f307656d == 0) {
                sb.append(" isPortrait");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        throw new NullPointerException("Null primaryPhotoUrl");
    }
}
