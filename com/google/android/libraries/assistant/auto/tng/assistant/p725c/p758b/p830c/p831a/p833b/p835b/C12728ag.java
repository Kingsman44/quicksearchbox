package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p835b;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.C12154a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p757b.C12171c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p757b.C12174f;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12865i;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.C12717a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12788a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p856a.C12874g;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p856a.C12875h;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p856a.C12878k;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p874f.p875a.C12962c;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13034av;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13037ay;
import com.google.android.libraries.assistant.p1363c.p1398g.C17331a;
import com.google.android.libraries.assistant.p1363c.p1398g.C17360b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1402b.p1403a.C17361a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17521x;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17522y;
import com.google.android.libraries.gsa.conversation.clientop.C22407c;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.aos;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4449cd.p4456g.C57981b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.speech.p5224k.p5225a.C67190ah;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5535j.p5536a.p5543b.C70967n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.ag */
/* compiled from: PG */
public final class C12728ag extends C22538o {

    /* renamed from: c */
    public static final /* synthetic */ int f39826c = 0;

    /* renamed from: d */
    private static final C59071e f39827d = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.ag");

    /* renamed from: a */
    public final C12865i f39828a;

    /* renamed from: b */
    public final Optional f39829b;

    /* renamed from: e */
    private final Executor f39830e;

    /* renamed from: f */
    private final C12154a f39831f;

    /* renamed from: g */
    private final int f39832g;

    /* renamed from: h */
    private final C12962c f39833h;

    /* renamed from: i */
    private final C17361a f39834i;

    public C12728ag(Executor executor, C12865i iVar, C12154a aVar, C17361a aVar2, int i, C12962c cVar, Optional optional) {
        this.f39830e = executor;
        this.f39828a = iVar;
        this.f39831f = aVar;
        this.f39834i = aVar2;
        this.f39832g = i;
        this.f39833h = cVar;
        this.f39829b = optional;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        Optional optional;
        C22407c cVar = (C22407c) eVar;
        C12874g gVar = null;
        if (cVar.f61903e.mo56113h() && (cVar.f61903e.mo56107c() instanceof C12717a)) {
            gVar = ((C12717a) cVar.f61903e.mo56107c()).f39812a;
        }
        Optional ofNullable = Optional.ofNullable(gVar);
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        Optional b = C12875h.m29134b(dwVar, "speech_output_args", aos.f135519e.getParserForType());
        if (!"tts.OUTPUT".equals(dyVar.f135936b) || b.isEmpty()) {
            ((C59052c) ((C59052c) f39827d.mo56226d()).mo56372aa(44438)).mo56386p("Invalid tts client op");
            return C60856cj.m92900i(C12788a.f39966a);
        }
        aos aos = (aos) b.get();
        if ((aos.f135521a & 2) != 0) {
            C52230ka kaVar = aos.f135523c;
            if (kaVar == null) {
                kaVar = C52230ka.f137057d;
            }
            if (!"speech.s3.TtsServiceRequest".equals(kaVar.f137060b)) {
                return C60856cj.m92900i(C12788a.m29055b(C52235kf.INVALID_ARGUMENT, "SpeechOutpurArgs has StructuredTts, but it's not TtsServiceRequest"));
            }
            String str = kaVar.f137060b;
            try {
                C67190ah ahVar = (C67190ah) C62942bv.parseFrom((C62942bv) C67190ah.f182619q, kaVar.f137061c, C62921ba.m95368a());
                C12171c cVar2 = (C12171c) C12174f.f38872d.createBuilder();
                cVar2.copyOnWrite();
                C12174f fVar = (C12174f) cVar2.instance;
                ahVar.getClass();
                fVar.f38875b = ahVar;
                fVar.f38874a |= 1;
                if (ofNullable.isPresent() && ((C12874g) ofNullable.get()).mo20818b() == 1 && ((C12874g) ofNullable.get()).mo20817a().mo20823b() == 2) {
                    optional = Optional.m71637of(((C12874g) ofNullable.get()).mo20817a().mo20827c());
                } else {
                    optional = Optional.empty();
                }
                if (optional.isPresent() && ((C12878k) optional.get()).mo20831a() == 2) {
                    cVar2.copyOnWrite();
                    C12174f fVar2 = (C12174f) cVar2.instance;
                    fVar2.f38876c = 2;
                    fVar2.f38874a |= 2;
                }
                C60870cx a = this.f39831f.mo20461b((C12174f) cVar2.build(), C70967n.STRUCTURED_TTS).mo20381a();
                if (this.f39829b.isPresent()) {
                    C60856cj.m92911t(a, C47810es.m84974n(new C12727af(this)), this.f39830e);
                }
                C12865i iVar = this.f39828a;
                C13034av avVar = (C13034av) C13037ay.f40467c.createBuilder();
                avVar.copyOnWrite();
                C13037ay ayVar = (C13037ay) avVar.instance;
                ayVar.f40470b = 1;
                ayVar.f40469a = 1 | ayVar.f40469a;
                iVar.mo20754g((C13037ay) avVar.build());
                return C60922j.m93044g(a, C47810es.m84963c(new C12724ac(this, aos)), this.f39830e);
            } catch (C62974ct unused) {
                return C60856cj.m92900i(C12788a.m29055b(C52235kf.INVALID_ARGUMENT, "Cannot parse TtsServiceRequest data"));
            }
        } else if (ofNullable.isEmpty() || ((C12874g) ofNullable.get()).mo20818b() != 1) {
            ((C59052c) ((C59052c) f39827d.mo56226d()).mo56372aa(44439)).mo56386p("Invalid tts client op metadata");
            return C60856cj.m92900i(C12788a.f39966a);
        } else {
            C57981b a2 = ((C12874g) ofNullable.get()).mo20817a().mo20822a();
            C17361a aVar = this.f39834i;
            C17521x xVar = (C17521x) C17522y.f50535c.createBuilder();
            int i = this.f39832g;
            xVar.copyOnWrite();
            C17522y yVar = (C17522y) xVar.instance;
            yVar.f50537a |= 1;
            yVar.f50538b = i;
            C17360b b2 = aVar.mo23307b(a2, (C17522y) xVar.build());
            C17331a b3 = b2.mo23303b();
            this.f39833h.mo20856a(b3, C70967n.ONLINE_RESPONSE);
            C60870cx a3 = b3.mo23275a();
            Objects.requireNonNull(b2);
            a3.mo4106b(C47810es.m84977q(new C12722aa(b2)), this.f39830e);
            C12865i iVar2 = this.f39828a;
            C13034av avVar2 = (C13034av) C13037ay.f40467c.createBuilder();
            avVar2.copyOnWrite();
            C13037ay ayVar2 = (C13037ay) avVar2.instance;
            ayVar2.f40470b = 1;
            ayVar2.f40469a = 1 | ayVar2.f40469a;
            iVar2.mo20754g((C13037ay) avVar2.build());
            C60870cx h = C60922j.m93045h(b3.mo23275a(), C47810es.m84966f(C12725ad.f39823a), this.f39830e);
            if (this.f39829b.isPresent()) {
                C60856cj.m92911t(h, C47810es.m84974n(new C12726ae(this)), this.f39830e);
            }
            return C60922j.m93044g(h, C47810es.m84963c(new C12723ab(this, aos)), this.f39830e);
        }
    }
}
