package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p835b;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12865i;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12788a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p856a.C12875h;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1320d.C16783a;
import com.google.android.libraries.gsa.conversation.clientop.C22407c;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.ada;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.net.URISyntaxException;
import java.util.concurrent.Executor;
import p3186j$.nio.charset.StandardCharsets;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.x */
/* compiled from: PG */
public final class C12751x extends C22538o {

    /* renamed from: a */
    public static final C59071e f39886a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.x");

    /* renamed from: b */
    public final C68214a f39887b;

    /* renamed from: c */
    public final Context f39888c;

    /* renamed from: d */
    public final C12989g f39889d;

    /* renamed from: e */
    public final C69464a f39890e;

    /* renamed from: f */
    public final C69464a f39891f;

    /* renamed from: g */
    private final C35470f f39892g;

    /* renamed from: h */
    private final Executor f39893h;

    /* renamed from: i */
    private final Executor f39894i;

    /* renamed from: j */
    private final Optional f39895j;

    /* renamed from: k */
    private final Optional f39896k;

    /* renamed from: l */
    private final C16783a f39897l;

    public C12751x(C68214a aVar, Context context, Executor executor, C12991i iVar, Optional optional, Executor executor2, Optional optional2, C16783a aVar2, C69464a aVar3, C69464a aVar4, C35470f fVar) {
        this.f39887b = aVar;
        this.f39888c = context;
        this.f39893h = executor;
        C12989g a = C12989g.m29225a(iVar.f40385d);
        this.f39889d = a == null ? C12989g.UNKNOWN : a;
        this.f39895j = optional;
        this.f39894i = executor2;
        this.f39896k = optional2;
        this.f39897l = aVar2;
        this.f39890e = aVar3;
        this.f39891f = aVar4;
        this.f39892g = fVar;
    }

    /* renamed from: c */
    private static Intent m29009c(ada ada, C22434e eVar) {
        C51058ev evVar;
        String str;
        C51058ev evVar2;
        C51098gh ghVar = ada.f134868b;
        if (ghVar == null) {
            ghVar = C51098gh.f133009e;
        }
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        if ((evVar.f132943a & 32) != 0) {
            C51098gh ghVar2 = ada.f134868b;
            if (ghVar2 == null) {
                ghVar2 = C51098gh.f133009e;
            }
            if (ghVar2.f133012b == 1) {
                evVar2 = (C51058ev) ghVar2.f133013c;
            } else {
                evVar2 = C51058ev.f132941o;
            }
            str = evVar2.f132949g;
        } else {
            byte[] bArr = ((C22407c) eVar).f61900b;
            str = bArr.length > 0 ? new String(bArr, StandardCharsets.UTF_8) : null;
        }
        if (str == null) {
            return null;
        }
        try {
            return Intent.parseUri(str, 0);
        } catch (URISyntaxException unused) {
            ((C59052c) ((C59052c) f39886a.mo56226d()).mo56372aa(44425)).mo56386p("Unable to open provider: intent.");
            return null;
        }
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C51058ev evVar;
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        Optional b = C12875h.m29134b(dwVar, "open_provider_args", ada.f134865f.getParserForType());
        if (!"provider.OPEN".equals(dyVar.f135936b) || b.isEmpty()) {
            ((C59052c) ((C59052c) f39886a.mo56226d()).mo56372aa(44431)).mo56386p("Invalid provider.OPEN client op");
            return C60856cj.m92900i(C12788a.f39966a);
        }
        ada ada = (ada) b.get();
        C51098gh ghVar = ada.f134868b;
        if (ghVar == null) {
            ghVar = C51098gh.f133009e;
        }
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        String str = evVar.f132944b;
        Intent c = m29009c(ada, eVar);
        if (!C58837ba.m90859h(str) || (((Boolean) this.f39891f.mo17428b()).booleanValue() && c != null)) {
            Intent intent = new Intent("android.media.browse.MediaBrowserService");
            intent.setPackage(str);
            C12744q qVar = new C12744q(this, intent);
            C60870cx m = C60856cj.m92904m(C47810es.m84978r(qVar), this.f39894i);
            C12745r rVar = C12745r.f39875a;
            C60870cx g = C60922j.m93044g(m, C47810es.m84963c(rVar), this.f39893h);
            Intent action = new Intent().setAction("android.intent.action.MAIN");
            action.addCategory("android.intent.category.LAUNCHER");
            action.setPackage(str);
            C12746s sVar = new C12746s(this, action);
            C60870cx m2 = C60856cj.m92904m(C47810es.m84978r(sVar), this.f39894i);
            C12747t tVar = C12747t.f39878a;
            C60870cx g2 = C60922j.m93044g(m2, C47810es.m84963c(tVar), this.f39893h);
            return C47638k.m84751b(g, g2).mo51521b(new C12748u(this, g, g2, str, c), this.f39894i);
        }
        ((C59052c) ((C59052c) f39886a.mo56226d()).mo56372aa(44432)).mo56386p("Invalid provider.OPEN client op");
        return C60856cj.m92900i(C12788a.f39966a);
    }

    /* renamed from: b */
    public final C60870cx mo20772b(Intent intent, String str) {
        C52070ec ecVar;
        if (intent == null) {
            return C60856cj.m92900i(C12788a.f39970e);
        }
        if (str != null) {
            intent.setPackage(str);
        }
        if (this.f39895j.isPresent()) {
            ((C15481g) this.f39895j.get()).mo22352b(C37179a.f97459ae);
        }
        if (!this.f39896k.isPresent() || this.f39889d == C12989g.MORRIS) {
            ((C59052c) ((C59052c) f39886a.mo56224b()).mo56372aa(44429)).mo56386p("Starting activity");
            return C47633f.m84733g(this.f39892g.mo20101f(intent)).mo51515h(new C12749v(this), this.f39893h).mo51513e(Exception.class, new C12750w(intent), this.f39893h);
        }
        ((C59052c) ((C59052c) f39886a.mo56224b()).mo56372aa(44430)).mo56386p("Updating appOpenArgs");
        ((C12865i) this.f39896k.get()).mo20750c(this.f39897l.mo23011b(intent));
        if (((Boolean) this.f39890e.mo17428b()).booleanValue()) {
            ecVar = C12788a.f39969d;
        } else {
            ecVar = C12788a.f39968c;
        }
        return C60856cj.m92900i(ecVar);
    }
}
