package com.google.android.apps.search.assistant.verticals.automation.routines.p10031f.p10032a;

import com.google.android.apps.search.assistant.verticals.automation.routines.p10021a.p10022a.C131847h;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10023b.p10024a.C131849b;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10025c.p10026a.C131851a;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10028d.C131861d;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10028d.C131867j;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10028d.C131872o;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10034g.C131900f;
import com.google.android.libraries.search.location.C38716v;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46788de;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3861at.aff;
import com.google.assistant.p3861at.afl;
import com.google.assistant.p3861at.afm;
import com.google.assistant.p3861at.afp;
import com.google.assistant.p3861at.afq;
import com.google.assistant.p3861at.afy;
import com.google.assistant.p3879aw.p3881b.C50603f;
import com.google.assistant.p3879aw.p3881b.C50605h;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.p4624a.p4625a.C61284a;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.f.a.n */
/* compiled from: PG */
public final class C131893n extends C131867j {

    /* renamed from: a */
    public static final C59071e f360160a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.automation.routines.f.a.n");

    /* renamed from: b */
    public final C131847h f360161b;

    /* renamed from: c */
    public final C38716v f360162c;

    /* renamed from: d */
    public final Executor f360163d;

    /* renamed from: e */
    public final C131849b f360164e;

    /* renamed from: f */
    public final C131851a f360165f;

    /* renamed from: g */
    private final AccountId f360166g;

    /* renamed from: h */
    private final C46175b f360167h;

    /* renamed from: i */
    private final C46723bg f360168i;

    public C131893n(C131847h hVar, AccountId accountId, C46175b bVar, C46723bg bgVar, C131849b bVar2, C131851a aVar, C38716v vVar, Executor executor) {
        this.f360161b = hVar;
        this.f360166g = accountId;
        this.f360167h = bVar;
        this.f360168i = bgVar;
        this.f360164e = bVar2;
        this.f360165f = aVar;
        this.f360162c = vVar;
        this.f360163d = executor;
    }

    /* renamed from: d */
    private final C60870cx m214357d() {
        return C47633f.m84733g(this.f360168i.mo50750c(this.f360167h.mo50244a(this.f360166g), C46788de.DONT_CARE)).mo51515h(C131882c.f360137a, this.f360163d);
    }

    /* renamed from: b */
    public final void mo110343b(C131861d dVar, C70862aj ajVar) {
        C59071e eVar = f360160a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(39487)).mo56386p("#deleteGeofence(Info)");
        if (this.f360161b.f360068b) {
            String str = dVar.f360095b;
            if ((dVar.f360094a & 1) == 0 || str.isEmpty()) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Workflow ID must be non-empty");
                ((C59052c) ((C59052c) ((C59052c) eVar.mo56225c()).mo56382g(illegalArgumentException)).mo56372aa(39488)).mo56386p("Invalid request");
                ajVar.mo20122b(new C70761fa(Status.f186906d.mo61678e(illegalArgumentException), (C70334de) null, true));
                return;
            }
            C60870cx d = m214357d();
            C47633f g = C47633f.m84733g(C47638k.m84751b(d).mo51521b(new C131884e(this, dVar, d, str), this.f360163d));
            C131892m mVar = new C131892m(ajVar);
            C60856cj.m92911t(g.f164926b, C47810es.m84974n(mVar), this.f360163d);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Location based triggers not enabled");
        ((C59052c) ((C59052c) ((C59052c) eVar.mo56225c()).mo56382g(illegalStateException)).mo56372aa(39489)).mo56386p("Invalid request");
        ajVar.mo20122b(new C70761fa(Status.f186915m.mo61678e(illegalStateException), (C70334de) null, true));
    }

    /* renamed from: c */
    public final void mo110344c(C131872o oVar, C70862aj ajVar) {
        Optional empty;
        int a;
        C70862aj ajVar2 = ajVar;
        C59071e eVar = f360160a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(39491)).mo56386p("#updateGeofence(Info)");
        if (this.f360161b.f360068b) {
            afy afy = oVar.f360117b;
            if (afy == null) {
                afy = afy.f129188g;
            }
            afy afy2 = afy;
            Iterator it = afy2.f129192c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    empty = Optional.empty();
                    break;
                }
                afm afm = (afm) it.next();
                int a2 = afl.m85741a(afm.f129162a);
                if (a2 != 0 && a2 == 6) {
                    for (afq afq : afm.f129163b) {
                        if (afq.f129170c && (a = afp.m85742a(afq.f129169b)) != 0 && a == 5) {
                            try {
                                C63070h hVar = afq.f129171d;
                                if (hVar == null) {
                                    hVar = C63070h.f170215c;
                                }
                                C63010eb parserForType = C50605h.f131667c.getParserForType();
                                String str = hVar.f170217a;
                                if (str.startsWith("type.googleapis.com/")) {
                                    String substring = str.substring(20);
                                    C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
                                    jzVar.copyOnWrite();
                                    C52230ka kaVar = (C52230ka) jzVar.instance;
                                    substring.getClass();
                                    kaVar.f137059a |= 1;
                                    kaVar.f137060b = substring;
                                    C63088z zVar = hVar.f170218b;
                                    jzVar.copyOnWrite();
                                    C52230ka kaVar2 = (C52230ka) jzVar.instance;
                                    zVar.getClass();
                                    kaVar2.f137059a |= 2;
                                    kaVar2.f137061c = zVar;
                                    C52230ka kaVar3 = (C52230ka) jzVar.build();
                                    if (kaVar3.f137060b.equals("assistant.verticals.voice_shortcut.proto.LocationTriggerEventUi")) {
                                        C50605h hVar2 = (C50605h) parserForType.mo59008g(kaVar3.f137061c);
                                        C131900f.m214364a(hVar2);
                                        empty = Optional.m71637of(hVar2);
                                    } else {
                                        throw new C62974ct(String.format("Bad protobuf type: got '%s', expected '%s'", new Object[]{kaVar3.f137060b, "assistant.verticals.voice_shortcut.proto.LocationTriggerEventUi"}));
                                    }
                                } else {
                                    throw new C62974ct(String.format("Malformed type url doesn't start with '%s': %s", new Object[]{"type.googleapis.com/", new C61301b(C61284a.NO_USER_DATA, str)}));
                                }
                            } catch (C62974ct e) {
                                ((C59052c) ((C59052c) ((C59052c) C131900f.f360171a.mo56225c()).mo56382g(e)).mo56372aa(39495)).mo56386p("Unpacking location trigger payload failed");
                            } catch (IllegalArgumentException e2) {
                                ((C59052c) ((C59052c) ((C59052c) C131900f.f360171a.mo56226d()).mo56382g(e2)).mo56372aa(39496)).mo56384n();
                            }
                        }
                    }
                    continue;
                }
            }
            C50605h hVar3 = (C50605h) empty.orElse(null);
            if (hVar3 == null) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Workflow does not contain valid location trigger");
                ((C59052c) ((C59052c) ((C59052c) f360160a.mo56225c()).mo56382g(illegalArgumentException)).mo56372aa(39492)).mo56386p("Invalid request");
                ajVar2.mo20122b(new C70761fa(Status.f186906d.mo61678e(illegalArgumentException), (C70334de) null, true));
                return;
            }
            C50603f fVar = hVar3.f131670b;
            if (fVar == null) {
                fVar = C50603f.f131661e;
            }
            aff aff = fVar.f131666d;
            if (aff == null) {
                aff = aff.f129149e;
            }
            int i = aff.f129151a;
            boolean z = ((i & 4) == 0 || (i & 8) == 0) ? false : true;
            C60870cx n = C60856cj.m92905n(C47810es.m84965e(new C131888i(this, z, aff)), this.f360163d);
            C47633f h = C47633f.m84733g(n).mo51515h(new C131889j(z, afy2, hVar3, aff), this.f360163d);
            C60870cx d = m214357d();
            C60856cj.m92911t(C47633f.m84733g(C47638k.m84751b(n, h, d).mo51521b(new C131890k(this, oVar, h, d, n, hVar3), this.f360163d)).f164926b, C47810es.m84974n(new C131891l(ajVar2)), this.f360163d);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Location based triggers not enabled");
        ((C59052c) ((C59052c) ((C59052c) eVar.mo56225c()).mo56382g(illegalStateException)).mo56372aa(39493)).mo56386p("Invalid request");
        ajVar2.mo20122b(new C70761fa(Status.f186915m.mo61678e(illegalStateException), (C70334de) null, true));
    }
}
