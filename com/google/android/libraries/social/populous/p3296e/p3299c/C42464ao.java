package com.google.android.libraries.social.populous.p3296e.p3299c;

import com.google.android.libraries.social.populous.core.C42352m;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.social.populous.e.c.ao */
/* compiled from: PG */
public final /* synthetic */ class C42464ao implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C42352m f111392a;

    public /* synthetic */ C42464ao(C42352m mVar) {
        this.f111392a = mVar;
    }

    public final Object apply(Object obj) {
        C42352m mVar = this.f111392a;
        C58485gu guVar = (C58485gu) obj;
        int size = guVar.size();
        int i = 0;
        while (i < size) {
            C42468as asVar = (C42468as) guVar.get(i);
            i++;
            if (C58890d.m90990e(C58837ba.m90858g(asVar.f111399d), C58837ba.m90858g(mVar.f111089a)) && C58890d.m90990e(C58837ba.m90858g(asVar.f111400e), C58837ba.m90858g(mVar.f111090b))) {
                return C58833ax.m90834k(asVar);
            }
        }
        return C58836b.f156633a;
    }
}
