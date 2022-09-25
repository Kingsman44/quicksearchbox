package com.google.android.apps.gsa.shared.p7033d.p7035b.p7036a;

import android.net.Uri;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.libraries.assistant.hotword.p1516b.C18342a;
import com.google.android.libraries.assistant.hotword.p1516b.C18343b;
import com.google.android.libraries.assistant.hotword.p1516b.C18346e;
import com.google.android.libraries.assistant.hotword.p1516b.C18348g;
import com.google.android.libraries.assistant.hotword.p1516b.C18349h;
import com.google.android.libraries.assistant.hotword.p1516b.C18350i;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34036az;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34038ba;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34045bh;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34230am;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34239av;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c.C34421k;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34666c;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34684d;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34696f;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34697g;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34699i;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34701k;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2682f.C34632v;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2683g.C34638a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.speech.p5218j.C67027ii;
import com.google.speech.p5218j.C67030il;
import com.google.speech.p5218j.C67047jb;
import com.google.speech.p5218j.C67048jc;
import com.google.speech.p5218j.C67049jd;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67051jf;
import com.google.speech.p5218j.C67052jg;
import com.google.speech.p5218j.C67071jz;
import com.google.speech.p5218j.C67073ka;
import com.google.speech.p5218j.C67088kp;
import com.google.speech.p5218j.C67091ks;
import com.google.speech.p5218j.C67170o;
import com.google.speech.p5218j.C67171p;
import com.google.speech.p5218j.C67172q;
import com.google.speech.p5218j.C67175t;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.gsa.shared.d.b.a.o */
/* compiled from: PG */
public final class C89712o implements C89700c, C34421k {

    /* renamed from: a */
    public static final C59071e f242854a = C59071e.m91331h();

    /* renamed from: b */
    public final C69585o f242855b;

    /* renamed from: c */
    public final C34632v f242856c;

    /* renamed from: d */
    public final AtomicBoolean f242857d = new AtomicBoolean();

    /* renamed from: e */
    public final AtomicBoolean f242858e = new AtomicBoolean();

    /* renamed from: f */
    public final C34638a f242859f;

    /* renamed from: g */
    public final C34239av f242860g;

    /* renamed from: h */
    private final C71422aw f242861h;

    /* renamed from: i */
    private final C34230am f242862i;

    public C89712o(C34230am amVar, C34239av avVar, C34638a aVar, C71422aw awVar, C69585o oVar, C34632v vVar) {
        C69664n.m101061g(aVar, "legacyHotwordHelper");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(vVar, "hotwordSuppressionRequirement");
        this.f242862i = amVar;
        this.f242860g = avVar;
        this.f242859f = aVar;
        this.f242861h = awVar;
        this.f242855b = oVar;
        this.f242856c = vVar;
    }

    /* renamed from: a */
    public final void mo83606a(HotwordResult hotwordResult, Uri uri) {
        int i;
        if (!this.f242858e.get()) {
            C67051jf jfVar = (C67051jf) C67052jg.f182269e.createBuilder();
            C67027ii iiVar = (C67027ii) C67030il.f182195e.createBuilder();
            float a = hotwordResult.mo84681a();
            iiVar.copyOnWrite();
            C67030il ilVar = (C67030il) iiVar.instance;
            ilVar.f182197a |= 2;
            ilVar.f182199c = a;
            float b = hotwordResult.mo84682b();
            iiVar.copyOnWrite();
            C67030il ilVar2 = (C67030il) iiVar.instance;
            ilVar2.f182197a |= 1;
            ilVar2.f182198b = b;
            jfVar.copyOnWrite();
            C67052jg jgVar = (C67052jg) jfVar.instance;
            C67030il ilVar3 = (C67030il) iiVar.build();
            ilVar3.getClass();
            jgVar.f182273c = ilVar3;
            jgVar.f182271a |= 1;
            C67047jb jbVar = (C67047jb) C67048jc.f182253h.createBuilder();
            float c = hotwordResult.mo84683c();
            jbVar.copyOnWrite();
            C67048jc jcVar = (C67048jc) jbVar.instance;
            jcVar.f182255a |= 4;
            jcVar.f182258d = c;
            boolean D = hotwordResult.mo84679D();
            jbVar.copyOnWrite();
            C67048jc jcVar2 = (C67048jc) jbVar.instance;
            jcVar2.f182255a |= 8;
            jcVar2.f182259e = D;
            String x = hotwordResult.mo84707x();
            if (x != null) {
                jbVar.copyOnWrite();
                C67048jc jcVar3 = (C67048jc) jbVar.instance;
                jcVar3.f182255a |= 64;
                jcVar3.f182261g = x;
            }
            String y = hotwordResult.mo84708y();
            if (y != null) {
                jbVar.copyOnWrite();
                C67048jc jcVar4 = (C67048jc) jbVar.instance;
                jcVar4.f182255a |= 2;
                jcVar4.f182257c = y;
            }
            C67170o oVar = (C67170o) C67171p.f182575e.createBuilder();
            C67172q qVar = (C67172q) C67175t.f182588e.createBuilder();
            int e = hotwordResult.mo84685e();
            qVar.copyOnWrite();
            C67175t tVar = (C67175t) qVar.instance;
            tVar.f182590a |= 4;
            tVar.f182593d = e;
            int i2 = hotwordResult.mo84691i();
            qVar.copyOnWrite();
            C67175t tVar2 = (C67175t) qVar.instance;
            tVar2.f182590a |= 2;
            tVar2.f182592c = i2;
            oVar.copyOnWrite();
            C67171p pVar = (C67171p) oVar.instance;
            C67175t tVar3 = (C67175t) qVar.build();
            tVar3.getClass();
            pVar.f182579c = tVar3;
            pVar.f182577a |= 2;
            if (hotwordResult.mo84698p().mo56113h()) {
                C63088z A = C63088z.m96139A((byte[]) hotwordResult.mo84698p().mo56107c());
                oVar.copyOnWrite();
                C67171p pVar2 = (C67171p) oVar.instance;
                pVar2.f182577a |= 1;
                pVar2.f182578b = A;
            }
            C67071jz jzVar = (C67071jz) C67073ka.f182324f.createBuilder();
            jzVar.copyOnWrite();
            C67073ka kaVar = (C67073ka) jzVar.instance;
            C67171p pVar3 = (C67171p) oVar.build();
            pVar3.getClass();
            kaVar.f182327b = pVar3;
            kaVar.f182326a |= 1;
            C67088kp kpVar = (C67088kp) C67091ks.f182386h.createBuilder();
            boolean A2 = hotwordResult.mo84676A();
            kpVar.copyOnWrite();
            C67091ks ksVar = (C67091ks) kpVar.instance;
            ksVar.f182388a |= 1;
            ksVar.f182389b = A2;
            float d = hotwordResult.mo84684d();
            kpVar.copyOnWrite();
            C67091ks ksVar2 = (C67091ks) kpVar.instance;
            ksVar2.f182388a |= 4;
            ksVar2.f182391d = d;
            boolean z = hotwordResult.mo84709z();
            kpVar.copyOnWrite();
            C67091ks ksVar3 = (C67091ks) kpVar.instance;
            ksVar3.f182388a |= 8;
            ksVar3.f182392e = z;
            int intValue = ((Integer) hotwordResult.mo84699q().mo56108d(new C89698a(hotwordResult))).intValue();
            C18349h hVar = (C18349h) C18350i.f52041d.createBuilder();
            C18346e eVar = (C18346e) C18348g.f52035e.createBuilder();
            int i3 = hotwordResult.mo84691i();
            eVar.copyOnWrite();
            C18348g gVar = (C18348g) eVar.instance;
            gVar.f52037a |= 1;
            gVar.f52038b = i3;
            eVar.copyOnWrite();
            C18348g gVar2 = (C18348g) eVar.instance;
            gVar2.f52037a |= 2;
            gVar2.f52039c = intValue;
            int f = hotwordResult.mo84687f();
            if (f == 1 || f == 2) {
                i = 2;
            } else {
                ((C59052c) ((C59052c) C89699b.f242839a.mo56225c()).mo56372aa(10185)).mo56387q("Unsupported encoding format: %d", f);
                i = 1;
            }
            eVar.copyOnWrite();
            C18348g gVar3 = (C18348g) eVar.instance;
            gVar3.f52040d = i - 1;
            gVar3.f52037a |= 4;
            hVar.copyOnWrite();
            C18350i iVar = (C18350i) hVar.instance;
            C18348g gVar4 = (C18348g) eVar.build();
            gVar4.getClass();
            iVar.f52045c = gVar4;
            iVar.f52043a |= 4;
            String uri2 = uri.toString();
            hVar.copyOnWrite();
            C18350i iVar2 = (C18350i) hVar.instance;
            uri2.getClass();
            iVar2.f52043a |= 2;
            iVar2.f52044b = uri2;
            C18350i iVar3 = (C18350i) hVar.build();
            C18342a aVar = (C18342a) C18343b.f52029d.createBuilder();
            C67049jd jdVar = (C67049jd) C67050je.f182262f.createBuilder();
            jdVar.copyOnWrite();
            C67050je jeVar = (C67050je) jdVar.instance;
            C67052jg jgVar2 = (C67052jg) jfVar.build();
            jgVar2.getClass();
            jeVar.f182268e = jgVar2;
            jeVar.f182264a |= 8;
            jdVar.copyOnWrite();
            C67050je jeVar2 = (C67050je) jdVar.instance;
            C67048jc jcVar5 = (C67048jc) jbVar.build();
            jcVar5.getClass();
            jeVar2.f182265b = jcVar5;
            jeVar2.f182264a |= 1;
            jdVar.copyOnWrite();
            C67050je jeVar3 = (C67050je) jdVar.instance;
            C67073ka kaVar2 = (C67073ka) jzVar.build();
            kaVar2.getClass();
            jeVar3.f182266c = kaVar2;
            jeVar3.f182264a |= 2;
            jdVar.copyOnWrite();
            C67050je jeVar4 = (C67050je) jdVar.instance;
            C67091ks ksVar4 = (C67091ks) kpVar.build();
            ksVar4.getClass();
            jeVar4.f182267d = ksVar4;
            jeVar4.f182264a |= 4;
            aVar.copyOnWrite();
            C18343b bVar = (C18343b) aVar.instance;
            C67050je jeVar5 = (C67050je) jdVar.build();
            jeVar5.getClass();
            bVar.f52033c = jeVar5;
            bVar.f52031a |= 2;
            aVar.copyOnWrite();
            C18343b bVar2 = (C18343b) aVar.instance;
            iVar3.getClass();
            bVar2.f52032b = iVar3;
            bVar2.f52031a |= 1;
            C18343b bVar3 = (C18343b) aVar.build();
            C69664n.m101060f(bVar3, "hotwordEventConverter.convert(hotwordResult, uri)");
            C34666c cVar = (C34666c) C34684d.f92090g.createBuilder();
            C69664n.m101060f(cVar, "newBuilder()");
            C34701k a2 = C69664n.m101061g(cVar, "builder");
            a2.mo39467b(C34043bf.ENTRYPOINT_LEGACY_HOTWORD);
            C34036az azVar = (C34036az) C34038ba.f90707h.createBuilder();
            C69664n.m101060f(azVar, "newBuilder()");
            C34045bh a3 = C69664n.m101061g(azVar, "builder");
            C69664n.m101061g(bVar3, "value");
            C34036az azVar2 = a3.f90745a;
            azVar2.copyOnWrite();
            C34038ba baVar = (C34038ba) azVar2.instance;
            bVar3.getClass();
            baVar.f90711c = bVar3;
            baVar.f90709a = 2 | baVar.f90709a;
            a2.mo39469d(a3.mo39195a());
            C34696f fVar = (C34696f) C34697g.f92115a.createBuilder();
            C69664n.m101060f(fVar, "newBuilder()");
            C34699i a4 = C69664n.m101061g(fVar, "builder");
            C62940bt btVar = C89703f.f242841d;
            C69664n.m101060f(btVar, "legacyHotwordInvocationInputExtras");
            C89702e eVar2 = (C89702e) C89703f.f242840c.createBuilder();
            C69664n.m101060f(eVar2, "newBuilder()");
            C69664n.m101061g(eVar2, "builder");
            C69664n.m101061g(bVar3, "value");
            eVar2.copyOnWrite();
            C89703f fVar2 = (C89703f) eVar2.instance;
            bVar3.getClass();
            fVar2.f242844b = bVar3;
            fVar2.f242843a |= 1;
            C62942bv build = eVar2.build();
            C69664n.m101060f(build, "_builder.build()");
            a4.mo39465b(btVar, (C89703f) build);
            a2.mo39468c(a4.mo39464a());
            C60856cj.m92911t(this.f242862i.mo39276a(a2.mo39466a()), C47810es.m84974n(new C89711n(this, uri)), C60826bg.f164896a);
            return;
        }
        C34638a aVar2 = this.f242859f;
        String uri3 = uri.toString();
        C69664n.m101060f(uri3, "uri.toString()");
        aVar2.mo39455a(uri3);
        C59052c cVar2 = (C59052c) f242854a.mo56224b();
        cVar2.mo56379ah(new C59094n(10188));
        cVar2.mo56386p("Legacy hotword invocation suppressed.");
    }

    /* renamed from: b */
    public final boolean mo83607b() {
        return this.f242857d.get();
    }

    /* renamed from: c */
    public final C60870cx mo39256c() {
        return C71663i.m104692e(this.f242861h, (C71424ay) null, new C89710m(this, (C69577g) null), 3);
    }
}
