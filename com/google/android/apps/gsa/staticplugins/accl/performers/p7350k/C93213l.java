package com.google.android.apps.gsa.staticplugins.accl.performers.p7350k;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.search.assistant.libraries.dictation.starter.C119320c;
import com.google.android.apps.search.assistant.libraries.dictation.starter.p8963b.p8964a.C119314a;
import com.google.android.apps.search.assistant.verticals.p9880a.p9881a.p9882a.C130324a;
import com.google.android.libraries.gsa.conversation.clientop.C22371a;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63033ey;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64734m;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.k.l */
/* compiled from: PG */
public final class C93213l extends C22538o {

    /* renamed from: a */
    public static final C58974d f259947a = C58974d.m91136j();

    /* renamed from: b */
    public final Optional f259948b;

    /* renamed from: c */
    public final C86124t f259949c;

    /* renamed from: d */
    public final C60888db f259950d;

    /* renamed from: e */
    public final C93205d f259951e;

    /* renamed from: f */
    public final Context f259952f;

    /* renamed from: g */
    private final Optional f259953g;

    /* renamed from: h */
    private final C93215m f259954h;

    /* renamed from: i */
    private final C86034c f259955i;

    /* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.k.l$a */
    /* compiled from: PG */
    public interface C93214a {
        /* renamed from: bi */
        C130324a mo87570bi();
    }

    public C93213l(Optional optional, Optional optional2, C93215m mVar, C86124t tVar, C60888db dbVar, C93205d dVar, Context context, C86034c cVar) {
        this.f259948b = optional;
        this.f259953g = optional2;
        this.f259954h = mVar;
        this.f259949c = tVar;
        this.f259950d = dbVar;
        this.f259951e = dVar;
        this.f259952f = context;
        this.f259955i = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C60870cx cxVar;
        boolean equals;
        String str = null;
        if (!this.f259949c.mo79746e(C90126fx.f251772pc)) {
            ((C58970a) ((C58970a) f259947a.mo56226d()).mo56372aa(13456)).mo56386p("failure: TNG:Dictation is disabled.");
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.UNIMPLEMENTED, (String) null));
        } else if (!this.f259948b.isEmpty()) {
            try {
                C51807dw dwVar = dyVar.f135938d;
                if (dwVar == null) {
                    dwVar = C51807dw.f135930b;
                }
                str = ((C63033ey) m41992m(dwVar, "__nga_idempotency_key__", C63033ey.f170139b.getParserForType())).f170141a;
            } catch (C62974ct e) {
                ((C58970a) ((C58970a) ((C58970a) f259947a.mo56226d()).mo56382g(e)).mo56372aa(13457)).mo56389s("malformed %s argument", "__nga_idempotency_key__");
            } catch (C22371a unused) {
            }
            C93215m mVar = this.f259954h;
            if (str != null) {
                loop0:
                while (true) {
                    String str2 = (String) mVar.f259956a.get();
                    equals = str.equals(str2);
                    AtomicReference atomicReference = mVar.f259956a;
                    while (true) {
                        if (atomicReference.compareAndSet(str2, str)) {
                            break loop0;
                        } else if (atomicReference.get() != str2) {
                        }
                    }
                }
                if (equals) {
                    return C60856cj.m92900i(C22402a.m41822b(C52235kf.INTERNAL, "duplicate ClientOp"));
                }
            }
            if (this.f259953g.isPresent()) {
                ((C119314a) this.f259953g.get()).mo104286a(true != this.f259949c.mo79746e(C90126fx.f251773pd) ? 1 : 2);
            } else {
                ((C58970a) ((C58970a) f259947a.mo56226d()).mo56372aa(13453)).mo56386p("Ignoring dev-app flags.");
            }
            C51807dw dwVar2 = dyVar.f135938d;
            if (dwVar2 == null) {
                dwVar2 = C51807dw.f135930b;
            }
            C64735n nVar = (C64735n) m41992m(dwVar2, "start_dictation_args", C64735n.f175467n.getParserForType());
            int i = nVar.f175481m;
            int a = C64734m.m96450a(i);
            if (a == 0) {
                a = 1;
            }
            int i2 = a - 2;
            if (i2 == -1 || i2 == 0 || i2 == 1) {
                return C60922j.m93045h(C60922j.m93044g(this.f259955i.mo79697b(), new C93210i(this), this.f259950d), new C93207f(this, nVar), C60826bg.f164896a);
            }
            int a2 = C64734m.m96450a(i);
            if (a2 == 0) {
                a2 = 1;
            }
            int i3 = a2 - 2;
            if (i3 == -1 || i3 == 0 || i3 == 1) {
                cxVar = ((C119320c) this.f259948b.get()).mo104283c(nVar);
            } else if (i3 != 2) {
                C60870cx c = ((C119320c) this.f259948b.get()).mo104283c(nVar);
                C60870cx d = ((C119320c) this.f259948b.get()).mo104284d(nVar);
                cxVar = C47638k.m84753d(c, d).mo51520a(new C93211j(c, d), C60826bg.f164896a);
            } else {
                cxVar = ((C119320c) this.f259948b.get()).mo104284d(nVar);
            }
            return C60922j.m93044g(cxVar, new C93208g(nVar), C60826bg.f164896a);
        } else {
            ((C58970a) ((C58970a) f259947a.mo56226d()).mo56372aa(13455)).mo56386p("failure: TNG:Dictation is not compiled in.");
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.UNIMPLEMENTED, (String) null));
        }
    }
}
