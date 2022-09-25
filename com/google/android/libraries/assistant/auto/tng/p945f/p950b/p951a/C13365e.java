package com.google.android.libraries.assistant.auto.tng.p945f.p950b.p951a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12801n;
import com.google.android.libraries.assistant.auto.tng.common.p897a.C13213i;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.search.assistant.performer.communication.C35546be;
import com.google.android.libraries.search.assistant.performer.communication.ChatMessageExecutor;
import com.google.android.libraries.search.assistant.performer.communication.p2740e.C35697e;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52321nk;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62974ct;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.b.a.e */
/* compiled from: PG */
public final class C13365e extends C22538o {

    /* renamed from: c */
    public static final /* synthetic */ int f41107c = 0;

    /* renamed from: d */
    private static final C59071e f41108d = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.f.b.a.e");

    /* renamed from: a */
    public final ChatMessageExecutor f41109a;

    /* renamed from: b */
    public final Set f41110b;

    /* renamed from: e */
    private final C13213i f41111e;

    /* renamed from: f */
    private final AccountId f41112f;

    /* renamed from: g */
    private final Executor f41113g;

    /* renamed from: h */
    private final C15481g f41114h;

    /* renamed from: i */
    private final C12801n f41115i;

    public C13365e(C13213i iVar, AccountId accountId, C35470f fVar, Executor executor, C15481g gVar, C12801n nVar, C35546be beVar, Set set, C35697e eVar) {
        this.f41111e = iVar;
        this.f41112f = accountId;
        this.f41113g = executor;
        this.f41114h = gVar;
        this.f41115i = nVar;
        this.f41110b = set;
        this.f41109a = beVar.mo39697a(fVar, eVar, gVar.mo22351a());
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        Optional optional;
        this.f41114h.mo22352b(C37179a.f97565ce);
        try {
            optional = C36183e.m64585c(dyVar, "chat_args", C52321nk.f137326j.getParserForType());
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f41108d.mo56225c()).mo56382g(e)).mo56372aa(44772)).mo56386p("Problems parsing proto");
            optional = Optional.empty();
        }
        if (optional.isEmpty()) {
            ((C59052c) ((C59052c) f41108d.mo56226d()).mo56372aa(44771)).mo56389s("ChatMessageArgs does not exist, ignoring the send request for clientOp: %s.", dyVar.f135936b);
            mo21048b(C62722b.INVALID_ARGUMENT);
            return C60856cj.m92900i(C36180b.m64578b(C52235kf.INVALID_ARGUMENT));
        }
        C60870cx b = this.f41111e.mo20979b(this.f41112f);
        C13361a aVar = new C13361a(this, (C52321nk) optional.get());
        C60870cx h = C60922j.m93045h(b, C47810es.m84966f(aVar), this.f41113g);
        C13364d dVar = new C13364d(this);
        C60856cj.m92911t(h, C47810es.m84974n(dVar), this.f41113g);
        C60870cx d = this.f41115i.mo20801d(h);
        C13362b bVar = new C13362b(this);
        return C47638k.m84751b(h, C60922j.m93044g(d, C47810es.m84963c(bVar), this.f41113g)).mo51521b(new C13363c(h), this.f41113g);
    }

    /* renamed from: b */
    public final void mo21048b(C62722b bVar) {
        C15481g gVar = this.f41114h;
        C37252a c = C37179a.f97566cf.mo40779c();
        c.mo40781e(bVar);
        gVar.mo22353c(c, Optional.empty());
    }
}
