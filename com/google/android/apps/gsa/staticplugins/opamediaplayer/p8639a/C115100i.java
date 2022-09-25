package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8639a;

import android.content.Context;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.C90757ba;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4552o.amo;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.a.i */
/* compiled from: PG */
public final class C115100i {
    /* renamed from: a */
    public static C87673aa m190787a(Context context, C22871g gVar, C90476a aVar, String str) {
        C88486g gVar2 = new C88486g();
        gVar2.f239201c = amo.OPA_MEDIA_PLAYER;
        gVar2.f239204f = str;
        return new C87673aa(context, (C87682aj) null, (C90757ba) null, new ClientConfig(gVar2), gVar, aVar);
    }
}
