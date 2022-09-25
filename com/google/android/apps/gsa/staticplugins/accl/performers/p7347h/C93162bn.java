package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6491a.C84347af;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90374h;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.conversation.p1855h.C22720x;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.aeo;
import com.google.assistant.p3897e.p3921j.afd;
import com.google.assistant.p3897e.p3921j.aff;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.bn */
/* compiled from: PG */
public final class C93162bn extends C22538o {

    /* renamed from: a */
    public static final C59071e f259835a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.h.bn");

    /* renamed from: b */
    public final Context f259836b;

    /* renamed from: c */
    public final C86124t f259837c;

    /* renamed from: d */
    public final C68214a f259838d;

    /* renamed from: e */
    public final C84347af f259839e;

    /* renamed from: f */
    private final C22871g f259840f;

    /* renamed from: g */
    private final C90374h f259841g;

    /* renamed from: h */
    private final C22720x f259842h;

    public C93162bn(Context context, C22720x xVar, C22871g gVar, C90374h hVar, C68214a aVar, C86124t tVar, C84347af afVar) {
        this.f259836b = context;
        this.f259840f = gVar;
        this.f259841g = hVar;
        this.f259838d = aVar;
        this.f259842h = xVar;
        this.f259837c = tVar;
        this.f259839e = afVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("notification.SHOW_CARD")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            afd afd = (afd) m41992m(dwVar, "notification_show_card_args", afd.f134990d.getParserForType());
            int i = afd.f134992a;
            if (i != 3 && i != 2 && i != 1) {
                throw new C22534k();
            } else if (i == 3) {
                C60870cx cxVar = this.f259841g.f252405a;
                cxVar.getClass();
                return C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i(C90877ak.m148471e(cxVar, 6, TimeUnit.SECONDS, this.f259840f)), new C93161bm(this, afd, eVar), C60826bg.f164896a), Exception.class, C93160bl.f259831a, C60826bg.f164896a);
            } else {
                if (i == 2) {
                    if ((((aff) afd.f134993b).f134997a & 1) != 0) {
                        this.f259842h.mo27820i(dyVar, C58833ax.m90833j(eVar));
                    } else {
                        throw new C22534k();
                    }
                } else if ((((aeo) afd.f134993b).f134944a & 1) != 0) {
                    this.f259842h.mo27820i(dyVar, C58833ax.m90833j(eVar));
                } else {
                    throw new C22534k();
                }
                return C60856cj.m92900i(C22402a.f61894b);
            }
        } else {
            throw new C22428d(dyVar);
        }
    }
}
