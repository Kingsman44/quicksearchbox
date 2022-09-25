package com.google.android.apps.gsa.staticplugins.accl.performers.p7342c;

import com.google.android.apps.gsa.assist.p507f.p508a.C9414c;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.c.ba */
/* compiled from: PG */
public final class C92953ba extends C22538o {

    /* renamed from: a */
    private final C22695ah f259302a;

    /* renamed from: b */
    private final C9414c f259303b;

    public C92953ba(C22695ah ahVar, C9414c cVar) {
        this.f259302a = ahVar;
        this.f259303b = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if ((dyVar.f135935a & 1) == 0 || !"device.TAKE_SCREENSHOT".equals(dyVar.f135936b)) {
            throw new C22428d(dyVar);
        }
        if (this.f259302a.mo27807a(this.f259303b.mo17671a())) {
            return C60856cj.m92900i(C22402a.f61893a);
        }
        return C60856cj.m92900i(C22402a.m41822b(C52235kf.ABORTED, "Share activity failed to start"));
    }
}
