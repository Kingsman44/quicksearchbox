package com.google.android.apps.gsa.staticplugins.p7898ee.p7899a.p7902c;

import com.google.android.apps.gsa.staticplugins.p7898ee.p7899a.p7901b.C100463d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.ee.a.c.c */
/* compiled from: PG */
public final /* synthetic */ class C100467c implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C100470f f280857a;

    public /* synthetic */ C100467c(C100470f fVar) {
        this.f280857a = fVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C100470f fVar = this.f280857a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C100463d dVar = C100463d.INTERNAL_ERROR;
            int ordinal = ((C100463d) axVar.mo56107c()).ordinal();
            if (ordinal == 0) {
                fVar.mo91932e(false);
            } else if (ordinal == 1) {
                fVar.mo91932e(true);
            }
        } else {
            fVar.f280862c.findViewById(R.id.error_layout).setVisibility(8);
            fVar.f280861b.setVisibility(0);
        }
    }
}
