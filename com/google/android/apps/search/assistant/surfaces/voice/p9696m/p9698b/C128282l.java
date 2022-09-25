package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9698b;

import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9504a.C126879a;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127406c;
import com.google.android.libraries.search.assistant.performer.communication.C35546be;
import com.google.android.libraries.search.assistant.performer.communication.ChatMessageExecutor;
import com.google.android.libraries.search.assistant.performer.communication.p2740e.C35697e;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52321nk;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.b.l */
/* compiled from: PG */
public final class C128282l implements C35472h {

    /* renamed from: b */
    private static final C59071e f352843b = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.m.b.l");

    /* renamed from: a */
    public final ChatMessageExecutor f352844a;

    /* renamed from: c */
    private final Executor f352845c;

    /* renamed from: d */
    private final AccountId f352846d;

    /* renamed from: e */
    private final C46128f f352847e;

    public C128282l(C35546be beVar, C126879a aVar, AccountId accountId, C46128f fVar, C35697e eVar, C37215b bVar, Executor executor) {
        this.f352844a = beVar.mo39697a(aVar, eVar, bVar);
        this.f352846d = accountId;
        this.f352847e = fVar;
        this.f352845c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        try {
            C36183e.m64586d(dyVar, "chat_message.SEND");
            C60870cx b = this.f352847e.mo50215b(this.f352846d);
            C128281k kVar = new C128281k(this, (C52321nk) C36183e.m64584b(dyVar, "chat_args", C52321nk.f137326j.getParserForType()));
            return C60922j.m93045h(b, C47810es.m84966f(kVar), this.f352845c);
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) f352843b.mo56225c()).mo56382g(e)).mo56372aa(37839)).mo56386p("failed to execute message client op");
            return C60856cj.m92900i(C127406c.m208360b(C52235kf.INTERNAL, "MessagePerformer Failed"));
        }
    }
}
