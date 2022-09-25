package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.gsa.n.g.a;
import com.google.android.apps.gsa.n.g.u;
import com.google.android.apps.gsa.nga.api.C74720bx;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6491a.C84349ah;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90918bo;
import com.google.android.apps.gsa.speech.audio.C92138a;
import com.google.android.apps.gsa.speech.audio.C92199j;
import com.google.android.apps.gsa.speech.audio.C92200k;
import com.google.android.apps.gsa.speech.audio.C92202m;
import com.google.android.apps.gsa.staticplugins.nga.p8067j.C103357g;
import com.google.android.apps.gsa.staticplugins.nga.p8078q.C103458a;
import com.google.android.apps.gsa.staticplugins.nga.p8078q.C103459b;
import com.google.android.libraries.gsa.conversation.clientop.C22407c;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.p1852f.C22585l;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p590as.p591a.C10770d;
import com.google.android.libraries.search.p3005i.p3007b.C38424a;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52068ea;
import com.google.assistant.p3897e.p3921j.C52069eb;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58847bk;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p4988b.p4990b.C64746l;
import com.google.protos.p4985f.p4988b.p4990b.C64747m;
import com.google.protos.p4985f.p4988b.p4990b.C64748n;
import com.google.protos.p4985f.p4988b.p4990b.C64752r;
import com.google.protos.p4985f.p5021l.C64950a;
import com.google.protos.p4985f.p5021l.C64951b;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.speech.p5208h.C66675i;
import com.google.speech.p5208h.C66676j;
import com.google.speech.p5208h.C66677k;
import com.google.speech.p5208h.C66678l;
import com.google.speech.recognizer.p5233a.C67451at;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.bm */
/* compiled from: PG */
public final class C93029bm extends C22538o {

    /* renamed from: a */
    public static final C58974d f259491a = C58974d.m91136j();

    /* renamed from: b */
    public final C22871g f259492b;

    /* renamed from: c */
    public final C38424a f259493c;

    /* renamed from: d */
    public final AtomicBoolean f259494d = new AtomicBoolean(false);

    /* renamed from: e */
    public final C86034c f259495e;

    /* renamed from: f */
    public final C93020bd f259496f;

    /* renamed from: g */
    private final Context f259497g;

    /* renamed from: h */
    private final C86124t f259498h;

    /* renamed from: i */
    private final a f259499i;

    /* renamed from: j */
    private final u f259500j;

    /* renamed from: k */
    private final C86054o f259501k;

    /* renamed from: l */
    private final com.google.android.apps.gsa.c.b.a f259502l;

    /* renamed from: m */
    private final C74720bx f259503m;

    /* renamed from: o */
    private final C103459b f259504o;

    public C93029bm(Context context, C22871g gVar, com.google.android.apps.gsa.c.b.a aVar, C86124t tVar, C58833ax axVar, C58833ax axVar2, C93020bd bdVar, a aVar2, u uVar, C38424a aVar3, C86054o oVar, C86034c cVar) {
        this.f259497g = context;
        this.f259492b = gVar;
        this.f259502l = aVar;
        this.f259498h = tVar;
        this.f259503m = (C74720bx) axVar.mo56111f();
        this.f259504o = (C103459b) ((C58847bk) axVar2).f156646a;
        this.f259496f = bdVar;
        this.f259499i = aVar2;
        this.f259500j = uVar;
        this.f259493c = aVar3;
        this.f259501k = oVar;
        this.f259495e = cVar;
    }

    /* renamed from: c */
    public static C52070ec m153091c(C64752r rVar) {
        C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
        C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
        C52235kf kfVar = C52235kf.OK;
        kdVar.copyOnWrite();
        C52236kg kgVar = (C52236kg) kdVar.instance;
        kgVar.f137092b = kfVar.f137088t;
        kgVar.f137091a |= 1;
        dzVar.copyOnWrite();
        C52070ec ecVar = (C52070ec) dzVar.instance;
        C52236kg kgVar2 = (C52236kg) kdVar.build();
        kgVar2.getClass();
        ecVar.f136654b = kgVar2;
        ecVar.f136653a |= 1;
        C52068ea eaVar = (C52068ea) C52069eb.f136648b.createBuilder();
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "slice_audio_result";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        C63088z byteString = rVar.toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar.f137059a |= 2;
        kaVar.f137061c = byteString;
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        kaVar2.f137059a |= 1;
        kaVar2.f137060b = "assistant.api.client_op.SliceAudioResult";
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        eaVar.mo53779a(kbVar);
        dzVar.copyOnWrite();
        C52070ec ecVar2 = (C52070ec) dzVar.instance;
        C52069eb ebVar = (C52069eb) eaVar.build();
        ebVar.getClass();
        ecVar2.f136655c = ebVar;
        ecVar2.f136653a |= 2;
        return (C52070ec) dzVar.build();
    }

    /* renamed from: e */
    private static C58833ax m153092e(C22434e eVar) {
        C22407c cVar = (C22407c) eVar;
        C84349ah ahVar = null;
        if (cVar.f61902d.mo56113h() && ((C22585l) cVar.f61902d.mo56107c()).f62228b.mo56113h()) {
            C84349ah ahVar2 = (C84349ah) ((C22585l) cVar.f61902d.mo56107c()).f62228b.mo56107c();
            if (ahVar2 instanceof C84349ah) {
                ahVar = ahVar2;
            }
        }
        if (ahVar == null) {
            ((C58970a) ((C58970a) f259491a.mo56226d()).mo56372aa(13213)).mo56386p("no QueryBasedRequestMetadata available, can not fetch audio recording.");
            return C58836b.f156633a;
        }
        Query query = ahVar.f229566a;
        if (query != null) {
            return C58833ax.m90834k(Long.valueOf(query.f252749G));
        }
        ((C58970a) ((C58970a) f259491a.mo56226d()).mo56372aa(13212)).mo56386p("no request is set in the query.");
        return C58836b.f156633a;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C60870cx cxVar;
        C60870cx cxVar2;
        if (dyVar.f135936b.equals("audio.SLICE_AUDIO")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C64747m mVar = (C64747m) m41992m(dwVar, "slice_audio_args", C64747m.f175510f.getParserForType());
            C74720bx bxVar = this.f259503m;
            if (bxVar == null || !bxVar.mo71089f().a() || !this.f259498h.mo79746e(C90126fx.f251044bQ)) {
                C22871g gVar = this.f259492b;
                C58833ax e = m153092e(eVar);
                if (!e.mo56113h()) {
                    cxVar = C60856cj.m92900i(C58836b.f156633a);
                } else {
                    C58833ax a = this.f259502l.a(((Long) e.mo56107c()).longValue());
                    if (a.mo56113h()) {
                        cxVar = C90918bo.m148514a((C60870cx) a.mo56107c());
                    } else {
                        cxVar = C60856cj.m92900i(C58836b.f156633a);
                    }
                }
                return gVar.mo28210j(cxVar, "Slice Audio", new C93022bf(this, mVar));
            }
            C22871g gVar2 = this.f259492b;
            C58833ax e2 = m153092e(eVar);
            if (!e2.mo56113h()) {
                cxVar2 = C60856cj.m92900i(C58836b.f156633a);
            } else {
                C103459b bVar = this.f259504o;
                long longValue = ((Long) e2.mo56107c()).longValue();
                SettableFuture settableFuture = new SettableFuture();
                bVar.f288325a.f288119a.mo93771e(new C103357g(longValue, new C103458a(settableFuture)));
                cxVar2 = C90877ak.m148471e(settableFuture, 5, TimeUnit.SECONDS, bVar.f288326b);
            }
            return gVar2.mo28210j(cxVar2, "Slice NGA Audio", new C93023bg(this, mVar));
        }
        throw new C22428d(dyVar);
    }

    /* renamed from: b */
    public final C92199j mo87525b(int i, int i2, com.google.android.apps.gsa.c.a.a aVar, C58833ax axVar) {
        if (this.f259498h.mo79746e(C90025cd.f248139C)) {
            axVar = C58833ax.m90834k(C10770d.OGGOPUS);
        }
        C90476a aVar2 = C91018d.f254254a;
        C92138a.m151256a(aVar);
        return C92200k.m151400d(this.f259497g, aVar, i, i2, axVar);
    }

    /* renamed from: d */
    public final C60870cx mo87526d(C64747m mVar, C92199j jVar) {
        C60870cx cxVar;
        C64746l lVar = mVar.f175516e;
        if (lVar == null) {
            lVar = C64746l.f175506b;
        }
        if (lVar.f175508a.isEmpty()) {
            C64748n nVar = (C64748n) C64752r.f175524d.createBuilder();
            String uri = ((C92202m) jVar).f257053a.toString();
            nVar.copyOnWrite();
            C64752r rVar = (C64752r) nVar.instance;
            uri.getClass();
            rVar.f175526a = 1 | rVar.f175526a;
            rVar.f175527b = uri;
            return C60856cj.m92900i(m153091c((C64752r) nVar.build()));
        }
        C22871g gVar = this.f259492b;
        C64746l lVar2 = mVar.f175516e;
        if (lVar2 == null) {
            lVar2 = C64746l.f175506b;
        }
        String str = lVar2.f175508a;
        String F = this.f259501k.mo79659F();
        if (TextUtils.isEmpty(F)) {
            this.f259494d.set(true);
            cxVar = C60866ct.f164955a;
        } else {
            a aVar = this.f259499i;
            C64950a aVar2 = (C64950a) C64951b.f175899d.createBuilder();
            C66677k kVar = (C66677k) C66678l.f181384f.createBuilder();
            C92202m mVar2 = (C92202m) jVar;
            C67451at atVar = mVar2.f257057e;
            kVar.copyOnWrite();
            C66678l lVar3 = (C66678l) kVar.instance;
            lVar3.f181389b = atVar.f183321p;
            lVar3.f181388a |= 1;
            int i = mVar2.f257056d;
            kVar.copyOnWrite();
            C66678l lVar4 = (C66678l) kVar.instance;
            lVar4.f181388a |= 2;
            lVar4.f181390c = (float) i;
            aVar2.copyOnWrite();
            C64951b bVar = (C64951b) aVar2.instance;
            C66678l lVar5 = (C66678l) kVar.build();
            lVar5.getClass();
            bVar.f175902b = lVar5;
            bVar.f175901a |= 1;
            C66675i iVar = (C66675i) C66676j.f181378c.createBuilder();
            C63088z zVar = mVar2.f257054b;
            iVar.copyOnWrite();
            C66676j jVar2 = (C66676j) iVar.instance;
            jVar2.f181382a = 1 | jVar2.f181382a;
            jVar2.f181383b = zVar;
            aVar2.copyOnWrite();
            C64951b bVar2 = (C64951b) aVar2.instance;
            C66676j jVar3 = (C66676j) iVar.build();
            jVar3.getClass();
            bVar2.f175903c = jVar3;
            bVar2.f175901a |= 2;
            cxVar = this.f259492b.mo28210j(this.f259500j.d(F, C65753ak.ASSISTANT_EPHEMERAL_AUDIO, aVar.b("type.googleapis.com/assistant.memory.AssistantEphemeralFootprintAudio", ((C64951b) aVar2.build()).toByteString(), str), false), "Triggers an immediate sync to Geller", new C93026bj(this));
        }
        return gVar.mo28209i(cxVar, "Uploaded sliced audio to Geller", new C93027bk(this, jVar));
    }
}
