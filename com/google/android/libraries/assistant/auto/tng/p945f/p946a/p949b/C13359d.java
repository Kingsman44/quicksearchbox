package com.google.android.libraries.assistant.auto.tng.p945f.p946a.p949b;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.binaries.satin.app.amw;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12801n;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.search.assistant.performer.communication.C35568c;
import com.google.android.libraries.search.assistant.performer.communication.C35778x;
import com.google.android.libraries.search.assistant.performer.communication.C35779y;
import com.google.android.libraries.search.assistant.performer.communication.p2735c.C35571c;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.android.libraries.search.assistant.performer.permissions.C36197b;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52289mf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62974ct;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p5304e.p5305a.p5306a.p5369g.p5373b.p5374a.C68754r;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.a.b.d */
/* compiled from: PG */
public final class C13359d extends C22538o {

    /* renamed from: b */
    public static final /* synthetic */ int f41091b = 0;

    /* renamed from: c */
    private static final C59071e f41092c = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.f.a.b.d");

    /* renamed from: a */
    public final Optional f41093a;

    /* renamed from: d */
    private final Executor f41094d;

    /* renamed from: e */
    private final C35779y f41095e;

    /* renamed from: f */
    private final C35470f f41096f;

    /* renamed from: g */
    private final C36197b f41097g;

    /* renamed from: h */
    private final C12801n f41098h;

    /* renamed from: i */
    private final C15481g f41099i;

    /* renamed from: j */
    private final C69464a f41100j;

    /* renamed from: k */
    private final amw f41101k;

    public C13359d(Executor executor, C35779y yVar, C35470f fVar, C36197b bVar, C12801n nVar, C15481g gVar, Optional optional, C69464a aVar, amw amw) {
        this.f41094d = executor;
        this.f41095e = yVar;
        this.f41096f = fVar;
        this.f41097g = bVar;
        this.f41098h = nVar;
        this.f41099i = gVar;
        this.f41093a = optional;
        this.f41100j = aVar;
        this.f41101k = amw;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        Optional optional;
        this.f41099i.mo22352b(C37179a.f97569ci);
        C35779y yVar = this.f41095e;
        C39226b bVar = C39226b.TAG_ASSISTANT_AUTO_TNG_COMMS;
        C36197b bVar2 = this.f41097g;
        C35571c a = this.f41101k.mo65972a(this.f41099i.mo22351a());
        C46877q qVar = (C46877q) yVar.f93730a.mo17428b();
        qVar.getClass();
        Context context = (Context) yVar.f93731b.mo17428b();
        context.getClass();
        C60888db dbVar = (C60888db) yVar.f93732c.mo17428b();
        dbVar.getClass();
        PackageManager packageManager = (PackageManager) yVar.f93733d.mo17428b();
        packageManager.getClass();
        Optional optional2 = (Optional) yVar.f93735f.mo17428b();
        optional2.getClass();
        C68754r rVar = (C68754r) yVar.f93736g.mo17428b();
        rVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        C35778x xVar = new C35778x(qVar, context, dbVar, packageManager, optional2, rVar, bVar, bVar2, a);
        try {
            optional = C36183e.m64585c(dyVar, "call_client_op_args", C52289mf.f137258j.getParserForType());
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f41092c.mo56225c()).mo56382g(e)).mo56372aa(44769)).mo56386p("Error parsing proto");
            optional = Optional.empty();
        }
        if (optional.isEmpty()) {
            ((C59052c) ((C59052c) f41092c.mo56226d()).mo56372aa(44768)).mo56389s("call Args does not exist, canceling the call request for clientOp: %s.", dyVar.f135936b);
            mo21045b(C62722b.INVALID_ARGUMENT);
            return C60856cj.m92900i(C36180b.m64578b(C52235kf.INVALID_ARGUMENT));
        }
        C52289mf mfVar = (C52289mf) optional.get();
        C35470f fVar = this.f41096f;
        Boolean bool = (Boolean) this.f41100j.mo17428b();
        if (bool != null) {
            xVar.f93726h = new C35568c(bool).f93386a.booleanValue();
            C60870cx c = xVar.mo39834c(mfVar, fVar);
            if (this.f41093a.isPresent()) {
                C52289mf mfVar2 = (C52289mf) optional.get();
                C13358c cVar = new C13358c(this);
                C60856cj.m92911t(c, C47810es.m84974n(cVar), this.f41094d);
            }
            C60870cx d = this.f41098h.mo20801d(c);
            C13356a aVar = new C13356a(this);
            return C47638k.m84751b(c, C60922j.m93044g(d, C47810es.m84963c(aVar), this.f41094d)).mo51521b(new C13357b(c), this.f41094d);
        }
        throw new NullPointerException("Null enableTrackPhoneCallUsageTime");
    }

    /* renamed from: b */
    public final void mo21045b(C62722b bVar) {
        C15481g gVar = this.f41099i;
        C37252a c = C37179a.f97570cj.mo40779c();
        c.mo40781e(bVar);
        gVar.mo22353c(c, Optional.empty());
    }
}
