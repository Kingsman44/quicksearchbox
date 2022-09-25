package com.google.android.apps.gsa.staticplugins.accl.performers.p7348i;

import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.p1855h.C22720x;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.i.a */
/* compiled from: PG */
public final class C93189a extends C22538o {

    /* renamed from: a */
    private final C22720x f259896a;

    public C93189a(C22720x xVar) {
        this.f259896a = xVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("photos.DOWNLOAD_PHOTOS")) {
            return this.f259896a.mo27814b(dyVar, C58833ax.m90833j(eVar));
        }
        throw new C22428d(dyVar);
    }
}
