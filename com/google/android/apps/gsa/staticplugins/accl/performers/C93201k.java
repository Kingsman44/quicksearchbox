package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.p1855h.C22720x;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.k */
/* compiled from: PG */
public final class C93201k extends C22538o {

    /* renamed from: a */
    public static final C59071e f259914a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.k");

    /* renamed from: b */
    public final C68214a f259915b;

    /* renamed from: c */
    private final C22720x f259916c;

    /* renamed from: d */
    private final C22871g f259917d;

    public C93201k(C22720x xVar, C22871g gVar, C68214a aVar) {
        this.f259916c = xVar;
        this.f259917d = gVar;
        this.f259915b = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C60870cx b = this.f259916c.mo27814b(dyVar, C58833ax.m90833j(eVar));
        C90875ai.m148465b(new C93188i(this), b, this.f259917d, "Display photos").mo85223a(C93190j.f259897a);
        return b;
    }
}
