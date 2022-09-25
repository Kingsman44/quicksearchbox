package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6085f;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80053ag;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.f.b */
/* compiled from: PG */
public final /* synthetic */ class C76879b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f212310a;

    public /* synthetic */ C76879b(String str) {
        this.f212310a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f212310a;
        C58485gu guVar = (C58485gu) obj;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C80047aa aaVar = (C80047aa) guVar.get(i);
            if (aaVar.f219657a == 10 && ((C80053ag) aaVar.f219658b).f219679c.contains("/collection/personal_face_labels") && aaVar.f219662f.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
