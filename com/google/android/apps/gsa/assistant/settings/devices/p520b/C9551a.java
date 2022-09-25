package com.google.android.apps.gsa.assistant.settings.devices.p520b;

import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.devices.p517a.C9529d;
import com.google.android.apps.gsa.assistant.settings.devices.p517a.C9531f;
import com.google.android.apps.gsa.assistant.settings.devices.p517a.C9532g;
import com.google.android.apps.gsa.assistant.settings.devices.p517a.C9534i;
import com.google.android.apps.gsa.assistant.settings.features.at.a;
import com.google.android.apps.gsa.assistant.settings.features.at.c;
import com.google.android.apps.gsa.assistant.settings.features.p5698at.C72856b;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.assistant.p3861at.C49875cf;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.Map;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.b.a */
/* compiled from: PG */
public final class C9551a {

    /* renamed from: a */
    private static final C59071e f33092a = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.devices.b.a");

    /* renamed from: a */
    public static C72856b m24214a(Map map, Map map2, Bundle bundle) {
        int i = bundle.getInt("assistant_surface", 0);
        String string = bundle.getString("assistant_device_id", BuildConfig.FLAVOR);
        C9529d dVar = (C9529d) map2.get(C49875cf.m85755a(i));
        if (dVar != null) {
            c d = C72856b.m107584d();
            c cVar = d;
            cVar.d = 2;
            C9531f fVar = (C9531f) C9532g.f33041d.createBuilder();
            fVar.copyOnWrite();
            C9532g gVar = (C9532g) fVar.instance;
            gVar.f33043a |= 1;
            gVar.f33044b = i;
            fVar.copyOnWrite();
            C9532g gVar2 = (C9532g) fVar.instance;
            string.getClass();
            gVar2.f33043a = 2 | gVar2.f33043a;
            gVar2.f33045c = string;
            C9534i iVar = new C9534i();
            C68324h.m98669f(iVar);
            C47243l.m84039a(iVar, (C9532g) fVar.build());
            cVar.b = Optional.m71637of(iVar);
            d.c(dVar.mo17850c());
            return d.a();
        }
        C69464a aVar = (C69464a) map.get(C49875cf.m85755a(i));
        if (aVar == null) {
            ((C59052c) ((C59052c) f33092a.mo56225c()).mo56372aa(444)).mo56387q("Error: could not find device settings page for type %d", i);
            c d2 = C72856b.m107584d();
            d2.d = 2;
            return d2.a();
        }
        C72856b bVar = (C72856b) aVar.mo17428b();
        C58838bb.m90862C(bVar, "Error: device info provider returned null for device type %s", i);
        a c = bVar.mo64550c();
        c.i(2);
        return c.a();
    }
}
