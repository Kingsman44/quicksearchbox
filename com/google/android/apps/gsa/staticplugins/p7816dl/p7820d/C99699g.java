package com.google.android.apps.gsa.staticplugins.p7816dl.p7820d;

import android.os.Bundle;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99676a;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99677b;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.d.g */
/* compiled from: PG */
public final /* synthetic */ class C99699g implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C99702j f278989a;

    public /* synthetic */ C99699g(C99702j jVar) {
        this.f278989a = jVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C99702j jVar = this.f278989a;
        if (((Boolean) obj).booleanValue()) {
            C58976aa aaVar = C58975e.f156826a;
            C99676a aVar = jVar.f278996d;
            C58833ax axVar = jVar.f278997e;
            String str = jVar.f278998f;
            int i = jVar.f278999g;
            int i2 = jVar.f279000h;
            int i3 = jVar.f279001i;
            Bundle bundle = new Bundle();
            new C23268m(new C23269n()).mo28734c("contentState", axVar, bundle);
            bundle.putString("videoUrl", str);
            bundle.putInt("playerType", Integer.valueOf(i).intValue());
            bundle.putInt("playerMaxWidthPortraitPx", Integer.valueOf(i2).intValue());
            bundle.putInt("playerMaxHeightLandscapePx", Integer.valueOf(i3).intValue());
            ((C99677b) aVar).f278953a.mo28345s("onRestoreContent_com.google.common.base.Optional<android.os.Bundle>_java.lang.String_int_int_int", "PartnerTabContentHostEventsDispatcher", bundle);
        }
    }
}
