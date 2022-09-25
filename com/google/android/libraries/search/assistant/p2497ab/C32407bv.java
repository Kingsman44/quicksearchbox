package com.google.android.libraries.search.assistant.p2497ab;

import android.content.Context;
import android.provider.Settings;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.android.libraries.search.assistant.performer.permissions.C36196a;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.android.libraries.search.p3005i.p3007b.C38424a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65813cq;
import java.util.concurrent.Executor;
import p3186j$.time.Instant;
import p5304e.p5305a.p5306a.p5369g.p5373b.p5374a.C68754r;

/* renamed from: com.google.android.libraries.search.assistant.ab.bv */
/* compiled from: PG */
public final class C32407bv implements C32399bn {

    /* renamed from: a */
    public static final C59071e f86857a = C59071e.m91332i("com.google.android.libraries.search.assistant.ab.bv");

    /* renamed from: b */
    public final C38469m f86858b;

    /* renamed from: c */
    public final C32389bd f86859c;

    /* renamed from: d */
    public final C68754r f86860d;

    /* renamed from: e */
    private final Executor f86861e;

    /* renamed from: f */
    private final C38424a f86862f;

    /* renamed from: g */
    private final AccountId f86863g;

    /* renamed from: h */
    private final C60950i f86864h;

    /* renamed from: i */
    private final C46128f f86865i;

    /* renamed from: j */
    private final Context f86866j;

    public C32407bv(Executor executor, C38469m mVar, C38424a aVar, AccountId accountId, C60950i iVar, C32389bd bdVar, C46128f fVar, C68754r rVar, Context context) {
        this.f86861e = executor;
        this.f86858b = mVar;
        this.f86862f = aVar;
        this.f86863g = accountId;
        this.f86864h = iVar;
        this.f86859c = bdVar;
        this.f86865i = fVar;
        this.f86860d = rVar;
        this.f86866j = context;
    }

    /* renamed from: a */
    public final C60870cx mo38054a() {
        if (!this.f86860d.mo60462b()) {
            C58976aa aaVar = C58975e.f156826a;
            return C60856cj.m92900i(false);
        } else if (!C36196a.m64596a("android.permission.READ_CONTACTS", this.f86866j)) {
            C58976aa aaVar2 = C58975e.f156826a;
            return C60856cj.m92900i(false);
        } else {
            String string = Settings.Secure.getString(this.f86866j.getContentResolver(), "assistant");
            if (string == null || !string.equals("com.google.android.googlequicksearchbox/com.google.android.voiceinteraction.GsaVoiceInteractionService")) {
                C59104x d = f86857a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "TopContactUploaderImpl");
                ((C59052c) ((C59052c) d).mo56372aa(52638)).mo56386p("AGSA is not the default Assistant App on the device.");
                return C60856cj.m92900i(false);
            } else if (this.f86863g == null) {
                C59104x d2 = f86857a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "TopContactUploaderImpl");
                ((C59052c) ((C59052c) d2).mo56372aa(52641)).mo56386p("accountId is null.");
                return C60856cj.m92900i(false);
            } else if (this.f86862f == null) {
                C59104x d3 = f86857a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "TopContactUploaderImpl");
                ((C59052c) ((C59052c) d3).mo56372aa(52640)).mo56386p("gellerBatchRefreshExecutor is null.");
                return C60856cj.m92900i(false);
            } else {
                Instant a = this.f86864h.mo57444a();
                C58976aa aaVar3 = C58975e.f156826a;
                return C47633f.m84733g(this.f86865i.mo50215b(this.f86863g)).mo51516i(new C32400bo(this), this.f86861e).mo51515h(new C32401bp(this), this.f86861e).mo51516i(new C32402bq(this, a), this.f86861e).mo51515h(C32403br.f86854a, this.f86861e).mo51513e(GellerException.class, C32404bs.f86855a, this.f86861e);
            }
        }
    }

    /* renamed from: b */
    public final void mo38055b() {
        if (!this.f86860d.mo60462b()) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C60870cx a = this.f86862f.mo41418a(this.f86863g, "assistant", new C58759qy(C65753ak.ASSISTANT_CONTACT_AFFINITY), C65813cq.ON_DEMAND);
        C32406bu buVar = new C32406bu();
        C60856cj.m92911t(a, C47810es.m84974n(buVar), this.f86861e);
    }
}
