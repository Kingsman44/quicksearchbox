package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p853l;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12865i;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12788a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p856a.C12875h;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.C16626a;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16698n;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16724al;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p981b.C13547a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16345as;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16347au;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.C16408a;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3926e.C51936ep;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.l.x */
/* compiled from: PG */
public final class C12830x extends C22538o {

    /* renamed from: a */
    public static final C59071e f40040a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.l.x");

    /* renamed from: b */
    public final C12865i f40041b;

    /* renamed from: c */
    public final C16698n f40042c;

    /* renamed from: d */
    public final C16724al f40043d;

    /* renamed from: e */
    public final C69464a f40044e;

    /* renamed from: f */
    public final C15481g f40045f;

    /* renamed from: g */
    public final C12991i f40046g;

    /* renamed from: h */
    private final C58833ax f40047h;

    /* renamed from: i */
    private final C69464a f40048i;

    /* renamed from: j */
    private final C69464a f40049j;

    /* renamed from: k */
    private final ScheduledExecutorService f40050k;

    /* renamed from: l */
    private final Optional f40051l;

    /* renamed from: m */
    private final Boolean f40052m;

    public C12830x(C12865i iVar, C16698n nVar, C16724al alVar, C58833ax axVar, C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6, ScheduledExecutorService scheduledExecutorService, C15481g gVar, C12991i iVar2, Optional optional) {
        this.f40041b = iVar;
        this.f40042c = nVar;
        this.f40043d = alVar;
        this.f40047h = axVar;
        this.f40048i = aVar;
        this.f40049j = aVar2;
        this.f40044e = aVar3;
        this.f40050k = scheduledExecutorService;
        this.f40045f = gVar;
        this.f40046g = iVar2;
        this.f40051l = optional;
        boolean z = true;
        if (!((Boolean) aVar6.mo17428b()).booleanValue() && (!((Boolean) aVar4.mo17428b()).booleanValue() || !((Boolean) aVar5.mo17428b()).booleanValue())) {
            z = false;
        }
        this.f40052m = Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C60870cx cxVar;
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        Optional b = C12875h.m29134b(dwVar, "show_native_form_args", C51953ff.f136315l.getParserForType());
        if (b.isEmpty()) {
            ((C59052c) ((C59052c) f40040a.mo56226d()).mo56372aa(44478)).mo56386p("Failed to get client op args");
            return C60856cj.m92900i(C12788a.f39966a);
        }
        C51953ff ffVar = (C51953ff) b.get();
        boolean z = true;
        if (!mo20803b(ffVar) || !this.f40051l.isPresent()) {
            boolean equals = ffVar.f136321e.equals("REPLY_INTENT_SELECTION");
            if (!this.f40052m.booleanValue() || !this.f40043d.f48919s) {
                z = equals;
            } else if ((!ffVar.f136321e.equals("REPLY_INTENT_SELECTION") && !ffVar.f136321e.equals("SET_MESSAGE")) || !Collection.EL.stream(ffVar.f136319c).flatMap(C12819m.f40027a).anyMatch(C12820n.f40028a)) {
                z = false;
            }
            if (!z || !((Boolean) this.f40048i.mo17428b()).booleanValue() || !this.f40047h.mo56113h()) {
                cxVar = C60856cj.m92900i(new C16626a().mo22941a());
            } else {
                this.f40045f.mo22352b(C37179a.f97533bz);
                cxVar = C60846c.m92878g(C60922j.m93044g(C60856cj.m92908q(((C13547a) this.f40047h.mo56107c()).mo21164b(), ((Long) this.f40049j.mo17428b()).longValue(), TimeUnit.MILLISECONDS, this.f40050k), C47810es.m84963c(new C12822p(this)), this.f40050k), Throwable.class, C47810es.m84963c(new C12823q(this)), this.f40050k);
            }
        } else {
            C51936ep a = C51936ep.m86435a(ffVar.f136323g);
            if (a == null) {
                a = C51936ep.DEFAULT;
            }
            int i = true != a.equals(C51936ep.CALL) ? 9 : 8;
            C16345as asVar = (C16345as) C16347au.f48122b.createBuilder();
            asVar.mo22888a(C58495hd.m89900n(Integer.valueOf(i - 1), 6));
            cxVar = C60846c.m92878g(C60922j.m93044g(((C16408a) this.f40051l.get()).mo22915a(BuildConfig.FLAVOR, (C16347au) asVar.build()), C47810es.m84963c(new C12818l(i)), this.f40050k), Throwable.class, C47810es.m84963c(C12821o.f40029a), this.f40050k);
        }
        return C60922j.m93044g(cxVar, C47810es.m84963c(new C12824r(this, b, dyVar)), this.f40050k);
    }

    /* renamed from: b */
    public final boolean mo20803b(C51953ff ffVar) {
        if (!this.f40043d.f48916p) {
            return false;
        }
        C51936ep a = C51936ep.m86435a(ffVar.f136323g);
        if (a == null) {
            a = C51936ep.DEFAULT;
        }
        if (!a.equals(C51936ep.CALL)) {
            C51936ep a2 = C51936ep.m86435a(ffVar.f136323g);
            if (a2 == null) {
                a2 = C51936ep.DEFAULT;
            }
            if (!a2.equals(C51936ep.MESSAGE)) {
                return false;
            }
        }
        return Collection.EL.stream(ffVar.f136319c).flatMap(C12825s.f40035a).flatMap(C12826t.f40036a).anyMatch(C12827u.f40037a);
    }
}
