package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import com.google.android.apps.gsa.search.core.p6519al.p6598bl.C84885a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90374h;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.aeq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.s */
/* compiled from: PG */
public final class C93180s extends C22538o {

    /* renamed from: a */
    public static final C59071e f259880a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.h.s");

    /* renamed from: b */
    public final C84885a f259881b;

    /* renamed from: c */
    public final C22871g f259882c;

    /* renamed from: d */
    public final C90374h f259883d;

    /* renamed from: e */
    public final C86124t f259884e;

    public C93180s(C22871g gVar, C90374h hVar, C86124t tVar, C84885a aVar) {
        this.f259881b = aVar;
        this.f259882c = gVar;
        this.f259883d = hVar;
        this.f259884e = tVar;
    }

    /* renamed from: b */
    public static C52070ec m153253b(String str, boolean z) {
        ((C59052c) ((C59052c) f259880a.mo56225c()).mo56372aa(13379)).mo56389s("Mark As Read Failed: %s", str);
        if (z) {
            return C22402a.f61894b;
        }
        return C22402a.m41822b(C52235kf.INTERNAL, str);
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if ("notification.MARK_AS_READ".equals(dyVar.f135936b)) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            aeq aeq = (aeq) m41992m(dwVar, "mark_notification_as_read_args", aeq.f134947f.getParserForType());
            if ((aeq.f134949a & 1) != 0) {
                C60870cx h = C60922j.m93045h(this.f259883d.mo84076a(aeq.f134950b), new C93178q(this, aeq), C60826bg.f164896a);
                C90476a aVar = C91018d.f254254a;
                return h;
            }
            throw new C22534k();
        }
        throw new C22428d(dyVar);
    }
}
