package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import com.google.android.apps.gsa.search.core.p6519al.p6598bl.C84885a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90374h;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
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
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.afb;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.bh */
/* compiled from: PG */
public final class C93156bh extends C22538o {

    /* renamed from: a */
    public static final C59071e f259823a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.h.bh");

    /* renamed from: b */
    public final C84885a f259824b;

    /* renamed from: c */
    public final C22720x f259825c;

    /* renamed from: d */
    private final C22871g f259826d;

    /* renamed from: e */
    private final C90374h f259827e;

    /* renamed from: f */
    private final C86124t f259828f;

    public C93156bh(C22720x xVar, C22871g gVar, C90374h hVar, C86124t tVar, C84885a aVar) {
        this.f259824b = aVar;
        this.f259826d = gVar;
        this.f259827e = hVar;
        this.f259825c = xVar;
        this.f259828f = tVar;
    }

    /* renamed from: b */
    public static C52070ec m153228b(String str) {
        return C22402a.m41822b(C52235kf.INTERNAL, "Reply to notification failed. Error: ".concat(str));
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("notification.REPLY")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            afb afb = (afb) m41992m(dwVar, "notification_reply_args", afb.f134984e.getParserForType());
            if ((afb.f134986a & 1) != 0 && !afb.f134988c.isEmpty()) {
                return C60846c.m92878g(C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i(C90877ak.m148471e(C60922j.m93045h(this.f259827e.mo84076a(afb.f134987b), new C93152bd(this, afb), C60826bg.f164896a), this.f259828f.mo79743a(C90014bt.f247505iS), TimeUnit.SECONDS, this.f259826d)), new C93155bg(this, dyVar, eVar), C60826bg.f164896a), TimeoutException.class, C93153be.f259818a, C60826bg.f164896a), Exception.class, C93154bf.f259819a, C60826bg.f164896a);
            }
            throw new C22534k();
        }
        throw new C22428d(dyVar);
    }
}
