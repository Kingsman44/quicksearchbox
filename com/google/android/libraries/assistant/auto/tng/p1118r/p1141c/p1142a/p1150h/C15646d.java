package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1150h;

import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.ondevice.p705a.C11836c;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.C15593a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15658j;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15666r;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15668t;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15670b;
import com.google.android.libraries.gsa.conversation.clientop.C22535l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.acz;
import com.google.assistant.p3897e.p3921j.ada;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p5124m.p5125a.C65603f;
import dagger.C68214a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.a.h.d */
/* compiled from: PG */
public final class C15646d implements C15593a {

    /* renamed from: a */
    public static final C59071e f46763a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.r.c.a.h.d");

    /* renamed from: b */
    public final Executor f46764b;

    /* renamed from: c */
    public final C69464a f46765c;

    /* renamed from: d */
    public final C11836c f46766d;

    /* renamed from: e */
    private final C69464a f46767e;

    /* renamed from: f */
    private final C68214a f46768f;

    /* renamed from: g */
    private final C69464a f46769g;

    public C15646d(C69464a aVar, C69464a aVar2, C69464a aVar3, C68214a aVar4, C11836c cVar, Executor executor) {
        this.f46767e = aVar;
        this.f46768f = aVar4;
        this.f46766d = cVar;
        this.f46764b = executor;
        this.f46765c = aVar2;
        this.f46769g = aVar3;
    }

    /* renamed from: a */
    public final C15668t mo22414a(C15666r rVar) {
        C15643a aVar = new C15643a(this, rVar);
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(aVar), this.f46764b);
        C15658j jVar = new C15658j();
        jVar.f46787a = n;
        return jVar.mo22491a();
    }

    /* renamed from: b */
    public final C60870cx mo22459b(String str, String str2) {
        C58833ax axVar;
        C51058ev evVar;
        C58528ij F = C58528ij.m90006F(((C65603f) this.f46769g.mo17428b()).f178307a);
        if (!F.isEmpty()) {
            if (str2 == null || !F.contains(C58890d.m90988c(str2))) {
                C58800sl lA = F.iterator();
                while (lA.hasNext()) {
                    if (((String) lA.next()).contains(C58890d.m90988c(str))) {
                        return C60922j.m93044g(this.f46766d.mo20177a(R.string.punt_open_unsafe_for_drving_app), C47810es.m84963c(C15644b.f46761a), this.f46764b);
                    }
                }
            } else {
                return C60922j.m93044g(this.f46766d.mo20177a(R.string.punt_open_unsafe_for_drving_app), C47810es.m84963c(C15644b.f46761a), this.f46764b);
            }
        }
        if (str2 == null) {
            Intent action = new Intent().setAction("android.intent.action.MAIN");
            action.addCategory("android.intent.category.LAUNCHER");
            PackageManager packageManager = (PackageManager) this.f46768f.mo27525b();
            List a = C22535l.m41989a(C22535l.m41990b(action, packageManager), packageManager);
            if (((Boolean) this.f46767e.mo17428b()).booleanValue()) {
                a.addAll(C22535l.m41991c(new Intent().setAction("android.media.browse.MediaBrowserService"), (PackageManager) this.f46768f.mo27525b()));
            }
            String c = C58890d.m90988c(str);
            Iterator it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    axVar = C58836b.f156633a;
                    break;
                }
                C51098gh ghVar = (C51098gh) it.next();
                if (ghVar.f133012b == 1) {
                    evVar = (C51058ev) ghVar.f133013c;
                } else {
                    evVar = C51058ev.f132941o;
                }
                if (C58890d.m90988c(evVar.f132948f).equals(c)) {
                    axVar = C58833ax.m90834k(ghVar);
                    break;
                }
            }
        } else {
            C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
            C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
            esVar.copyOnWrite();
            C51058ev evVar2 = (C51058ev) esVar.instance;
            evVar2.f132943a |= 1;
            evVar2.f132944b = str2;
            esVar.copyOnWrite();
            C51058ev evVar3 = (C51058ev) esVar.instance;
            str.getClass();
            evVar3.f132943a |= 16;
            evVar3.f132948f = str;
            ggVar.copyOnWrite();
            C51098gh ghVar2 = (C51098gh) ggVar.instance;
            C51058ev evVar4 = (C51058ev) esVar.build();
            evVar4.getClass();
            ghVar2.f133013c = evVar4;
            ghVar2.f133012b = 1;
            axVar = C58833ax.m90834k((C51098gh) ggVar.build());
        }
        if (!axVar.mo56113h()) {
            return C60922j.m93044g(this.f46766d.mo20177a(R.string.punt_open_app), C47810es.m84963c(C15644b.f46761a), this.f46764b);
        }
        acz acz = (acz) ada.f134865f.createBuilder();
        C51098gh ghVar3 = (C51098gh) axVar.mo56107c();
        acz.copyOnWrite();
        ada ada = (ada) acz.instance;
        ghVar3.getClass();
        ada.f134868b = ghVar3;
        ada.f134867a |= 1;
        C51809dy a2 = C15670b.m32466a("provider.OPEN", "open_provider_args", "assistant.api.client_op.OpenProviderArgs", acz.build());
        return C60922j.m93044g(this.f46766d.mo20178b(R.string.opening_app, str), C47810es.m84963c(new C15645c(a2)), this.f46764b);
    }
}
