package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5964av.p5967c.p5969b.C75113bn;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78264n;
import com.google.android.apps.gsa.nga.engine.warmactions.call.C79507c;
import com.google.android.apps.gsa.nga.engine.warmactions.call.p6251a.C79499b;
import com.google.android.apps.gsa.nga.shared.p6363s.C81457f;
import com.google.android.apps.gsa.nga.shared.p6363s.C81465n;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52132gk;
import com.google.assistant.p3897e.p3921j.C52136go;
import com.google.assistant.p3897e.p3921j.C52137gp;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C63088z;
import com.google.speech.p5230n.p5231a.C67369f;
import com.google.speech.p5230n.p5231a.C67370g;
import com.google.speech.p5230n.p5231a.C67371h;
import com.google.speech.p5230n.p5231a.C67372i;
import com.google.speech.p5230n.p5231a.C67373j;
import com.google.speech.p5230n.p5231a.C67374k;
import com.google.speech.p5230n.p5231a.C67375l;
import com.google.speech.p5230n.p5231a.C67376m;
import com.google.speech.p5230n.p5232b.C67401aq;
import com.google.speech.p5230n.p5232b.C67402ar;
import dagger.C68214a;
import java.util.Locale;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.n */
/* compiled from: PG */
public final class C79705n implements C79688bq {

    /* renamed from: a */
    static final C51809dy f218576a;

    /* renamed from: b */
    static final C51809dy f218577b;

    /* renamed from: c */
    static final C51809dy f218578c = t.b(false);

    /* renamed from: d */
    static final C51809dy f218579d = t.b(true);

    /* renamed from: h */
    private static final C58974d f218580h = C58974d.m91136j();

    /* renamed from: i */
    private static final Duration f218581i = Duration.ofSeconds(2);

    /* renamed from: e */
    public final C79646ab f218582e;

    /* renamed from: f */
    public final C78264n f218583f;

    /* renamed from: g */
    public final C75113bn f218584g;

    /* renamed from: j */
    private final Context f218585j;

    /* renamed from: k */
    private final C91142g f218586k;

    /* renamed from: l */
    private final C79507c f218587l;

    /* renamed from: m */
    private final AudioManager f218588m;

    /* renamed from: n */
    private final C81515c f218589n;

    /* renamed from: o */
    private final C76092h f218590o;

    /* renamed from: p */
    private final C22871g f218591p;

    /* renamed from: q */
    private final C22871g f218592q;

    /* renamed from: r */
    private final C81457f f218593r;

    /* renamed from: s */
    private final C79499b f218594s;

    /* renamed from: t */
    private final C68214a f218595t;

    static {
        C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
        dxVar.copyOnWrite();
        C51809dy dyVar = (C51809dy) dxVar.instance;
        dyVar.f135935a |= 1;
        dyVar.f135936b = "call.PICKUP";
        f218576a = (C51809dy) dxVar.build();
        C51808dx dxVar2 = (C51808dx) C51809dy.f135933f.createBuilder();
        dxVar2.copyOnWrite();
        C51809dy dyVar2 = (C51809dy) dxVar2.instance;
        dyVar2.f135935a |= 1;
        dyVar2.f135936b = "call.REJECT";
        f218577b = (C51809dy) dxVar2.build();
    }

    public C79705n(Context context, C91142g gVar, C76092h hVar, C79646ab abVar, C75113bn bnVar, C79507c cVar, C81515c cVar2, AudioManager audioManager, C90821bm bmVar, C22871g gVar2, C81465n nVar, C78264n nVar2, C79499b bVar, C68214a aVar) {
        this.f218585j = context;
        this.f218586k = gVar;
        this.f218590o = hVar;
        this.f218582e = abVar;
        this.f218584g = bnVar;
        this.f218587l = cVar;
        this.f218589n = cVar2;
        this.f218588m = audioManager;
        this.f218592q = gVar2;
        this.f218583f = nVar2;
        this.f218594s = bVar;
        this.f218595t = aVar;
        C22871g a = bmVar.mo85163a(C79703l.class);
        this.f218591p = a;
        this.f218593r = nVar.mo75094a(a, C79699h.f218571a);
    }

    /* renamed from: c */
    static final C51809dy m127795c(C52136go goVar, int i) {
        C52132gk gkVar = (C52132gk) C52137gp.f136808f.createBuilder();
        gkVar.copyOnWrite();
        C52137gp gpVar = (C52137gp) gkVar.instance;
        gpVar.f136813d = goVar.f136807g;
        gpVar.f136810a |= 4;
        gkVar.copyOnWrite();
        C52137gp gpVar2 = (C52137gp) gkVar.instance;
        gpVar2.f136812c = 0;
        gpVar2.f136810a |= 2;
        gkVar.copyOnWrite();
        C52137gp gpVar3 = (C52137gp) gkVar.instance;
        gpVar3.f136810a |= 1;
        gpVar3.f136811b = i;
        gkVar.copyOnWrite();
        C52137gp gpVar4 = (C52137gp) gkVar.instance;
        gpVar4.f136810a |= 16;
        gpVar4.f136814e = true;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_op.UpdateVolumeArgs";
        C63088z byteString = ((C52137gp) gkVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        return t.a("device.UPDATE_VOLUME", "device_setting_params", (C52230ka) jzVar.build());
    }

    /* renamed from: d */
    private final int m127796d(int i) {
        return Math.round((((float) this.f218588m.getStreamVolume(i)) * 100.0f) / ((float) this.f218588m.getStreamMaxVolume(i)));
    }

    /* renamed from: e */
    private final C79704m m127797e(C58528ij ijVar) {
        int d;
        int d2;
        C58480gp e = C58485gu.m89837e();
        C58480gp e2 = C58485gu.m89837e();
        if (ijVar.contains(C52136go.RINGTONE) && (d2 = m127796d(2)) > 0) {
            e.mo55395g(m127795c(C52136go.RINGTONE, 0));
            e2.mo55395g(m127795c(C52136go.RINGTONE, d2));
        }
        if (ijVar.contains(C52136go.MEDIA) && (d = m127796d(3)) < 60) {
            e.mo55395g(m127795c(C52136go.MEDIA, 60));
            e2.mo55395g(m127795c(C52136go.MEDIA, d));
        }
        return new C79695d(e.mo55394f(), e2.mo55394f());
    }

    /* renamed from: f */
    private final C51809dy m127798f(String str, Locale locale) {
        if (!this.f218586k.mo85405j(C90126fx.f251473jV)) {
            return t.g(str, locale.toLanguageTag());
        }
        C67375l lVar = (C67375l) C67376m.f183139e.createBuilder();
        C67373j jVar = (C67373j) C67374k.f183133d.createBuilder();
        jVar.copyOnWrite();
        C67374k kVar = (C67374k) jVar.instance;
        str.getClass();
        kVar.f183135a |= 4;
        kVar.f183136b = str;
        lVar.mo59845a(jVar);
        C67376m mVar = (C67376m) lVar.build();
        C67369f fVar = (C67369f) C67372i.f183129b.createBuilder();
        C67370g gVar = (C67370g) C67371h.f183124c.createBuilder();
        gVar.copyOnWrite();
        C67371h hVar = (C67371h) gVar.instance;
        mVar.getClass();
        hVar.f183127b = mVar;
        hVar.f183126a = 2;
        fVar.mo59843a(gVar);
        C67372i iVar = (C67372i) fVar.build();
        C67401aq aqVar = (C67401aq) C67402ar.f183192d.createBuilder();
        aqVar.copyOnWrite();
        C67402ar arVar = (C67402ar) aqVar.instance;
        iVar.getClass();
        arVar.f183196c = iVar;
        arVar.f183194a |= 1;
        return t.f((C67402ar) aqVar.build(), locale.toLanguageTag());
    }

    /* renamed from: g */
    private final Locale m127799g() {
        return this.f218590o.mo72021b().mo72039e();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo74176b(com.google.android.apps.gsa.nga.engine.warmactions.p6258j.C79690bs r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.mo74198f()
            int r1 = r0.hashCode()
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case -1412808770: goto L_0x002e;
                case 117694: goto L_0x0024;
                case 1542349558: goto L_0x001a;
                case 2092627105: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0038
        L_0x0010:
            java.lang.String r1 = "silence"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            r0 = 3
            goto L_0x0039
        L_0x001a:
            java.lang.String r1 = "decline"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0024:
            java.lang.String r1 = "who"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            r0 = 2
            goto L_0x0039
        L_0x002e:
            java.lang.String r1 = "answer"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            r0 = 0
            goto L_0x0039
        L_0x0038:
            r0 = -1
        L_0x0039:
            if (r0 == 0) goto L_0x0054
            if (r0 == r5) goto L_0x0054
            if (r0 == r4) goto L_0x0053
            if (r0 == r3) goto L_0x0053
            com.google.common.f.a.d r0 = f218580h
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r7 = r7.mo74198f()
            r1 = 5730(0x1662, float:8.03E-42)
            java.lang.String r2 = "#MWW Unsupported call command: %s."
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r1)).mo56389s(r2, r7)
            return r5
        L_0x0053:
            return r2
        L_0x0054:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.warmactions.p6258j.C79705n.mo74176b(com.google.android.apps.gsa.nga.engine.warmactions.j.bs):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo74177h(com.google.android.apps.gsa.nga.engine.warmactions.p6258j.C79690bs r17) {
        /*
            r16 = this;
            r0 = r16
            r17.mo74199g()
            r17.mo74198f()
            com.google.android.apps.gsa.nga.shared.aa.e.n r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n.f220656k
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.nga.shared.aa.e.l r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.gsa.nga.shared.aa.e.n r2 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n) r2
            r3 = 3
            int r4 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80403p.m128150a(r3)
            r2.f220664g = r4
            java.lang.String r2 = r17.mo74198f()
            int r4 = r2.hashCode()
            r5 = 0
            r6 = 2
            r7 = 1
            switch(r4) {
                case -1412808770: goto L_0x004b;
                case 117694: goto L_0x0041;
                case 1542349558: goto L_0x0037;
                case 2092627105: goto L_0x002d;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x0055
        L_0x002d:
            java.lang.String r4 = "silence"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0055
            r2 = 3
            goto L_0x0056
        L_0x0037:
            java.lang.String r4 = "decline"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0055
            r2 = 1
            goto L_0x0056
        L_0x0041:
            java.lang.String r4 = "who"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0055
            r2 = 2
            goto L_0x0056
        L_0x004b:
            java.lang.String r4 = "answer"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0055
            r2 = 0
            goto L_0x0056
        L_0x0055:
            r2 = -1
        L_0x0056:
            if (r2 == 0) goto L_0x0333
            if (r2 == r7) goto L_0x02d7
            if (r2 == r6) goto L_0x0211
            if (r2 == r3) goto L_0x0081
            com.google.common.f.a.d r1 = f218580h
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1
            r2 = 5728(0x1660, float:8.027E-42)
            com.google.common.f.x r1 = r1.mo56372aa(r2)
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1
            java.lang.String r2 = r17.mo74199g()
            java.lang.String r3 = r17.mo74198f()
            java.lang.String r4 = "#MWW Unsupported call query: %s [command: %s]."
            r1.mo56354G(r4, r2, r3)
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
            goto L_0x050e
        L_0x0081:
            r2 = 149587(0x24853, float:2.09616E-40)
            r1.mo74319k(r2)
            com.google.android.apps.gsa.nga.engine.warmactions.call.a.b r2 = r0.f218594s
            j$.util.Optional r2 = r2.mo74101e()
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0099
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
            goto L_0x050e
        L_0x0099:
            com.google.protos.f.q.fc r3 = com.google.protos.p4985f.p5030q.C65196fc.f176453l
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.protos.f.q.ez r3 = (com.google.protos.p4985f.p5030q.C65192ez) r3
            com.google.android.apps.gsa.nga.engine.warmactions.j.v r4 = new com.google.android.apps.gsa.nga.engine.warmactions.j.v
            r4.<init>()
            com.google.assistant.e.j.dy r5 = com.google.android.apps.gsa.nga.engine.warmactions.p6258j.C79714w.f218612a
            java.lang.Object r2 = r2.get()
            java.lang.Long r2 = (java.lang.Long) r2
            long r8 = r2.longValue()
            com.google.assistant.f.c.w r2 = com.google.assistant.p3931f.p3939c.C52846w.f138653b
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.f.c.p r2 = (com.google.assistant.p3931f.p3939c.C52839p) r2
            com.google.assistant.f.c.v r10 = com.google.assistant.p3931f.p3939c.C52845v.f138648d
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.f.c.q r10 = (com.google.assistant.p3931f.p3939c.C52840q) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.assistant.f.c.v r11 = (com.google.assistant.p3931f.p3939c.C52845v) r11
            java.lang.String r12 = "actions.intent.SILENCE_CALL_NOTIFICATION"
            r11.f138650a = r12
            com.google.assistant.f.c.s r11 = com.google.assistant.p3931f.p3939c.C52842s.f138640d
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.f.c.r r11 = (com.google.assistant.p3931f.p3939c.C52841r) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.assistant.f.c.s r12 = (com.google.assistant.p3931f.p3939c.C52842s) r12
            java.lang.String r13 = "callNotification.forCall.identifier"
            r12.f138642a = r13
            com.google.assistant.f.c.u r12 = com.google.assistant.p3931f.p3939c.C52844u.f138645b
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.assistant.f.c.t r12 = (com.google.assistant.p3931f.p3939c.C52843t) r12
            com.google.assistant.f.c.ah r13 = com.google.assistant.p3931f.p3939c.C52818ah.f138576e
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.assistant.f.c.af r13 = (com.google.assistant.p3931f.p3939c.C52816af) r13
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r13.copyOnWrite()
            com.google.protobuf.bv r9 = r13.instance
            com.google.assistant.f.c.ah r9 = (com.google.assistant.p3931f.p3939c.C52818ah) r9
            r8.getClass()
            r9.f138579b = r6
            r9.f138580c = r8
            com.google.protobuf.bv r8 = r13.build()
            com.google.assistant.f.c.ah r8 = (com.google.assistant.p3931f.p3939c.C52818ah) r8
            r12.copyOnWrite()
            com.google.protobuf.bv r9 = r12.instance
            com.google.assistant.f.c.u r9 = (com.google.assistant.p3931f.p3939c.C52844u) r9
            r8.getClass()
            r9.f138647a = r8
            com.google.protobuf.bv r8 = r12.build()
            com.google.assistant.f.c.u r8 = (com.google.assistant.p3931f.p3939c.C52844u) r8
            r11.copyOnWrite()
            com.google.protobuf.bv r9 = r11.instance
            com.google.assistant.f.c.s r9 = (com.google.assistant.p3931f.p3939c.C52842s) r9
            r8.getClass()
            com.google.protobuf.cq r12 = r9.f138644c
            boolean r13 = r12.mo58948c()
            if (r13 != 0) goto L_0x0132
            com.google.protobuf.cq r12 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r12)
            r9.f138644c = r12
        L_0x0132:
            com.google.protobuf.cq r9 = r9.f138644c
            r9.add(r8)
            com.google.protobuf.bv r8 = r11.build()
            com.google.assistant.f.c.s r8 = (com.google.assistant.p3931f.p3939c.C52842s) r8
            r10.copyOnWrite()
            com.google.protobuf.bv r9 = r10.instance
            com.google.assistant.f.c.v r9 = (com.google.assistant.p3931f.p3939c.C52845v) r9
            r8.getClass()
            r9.mo53929a()
            com.google.protobuf.cq r9 = r9.f138652c
            r9.add(r8)
            com.google.protobuf.bv r8 = r10.build()
            com.google.assistant.f.c.v r8 = (com.google.assistant.p3931f.p3939c.C52845v) r8
            r2.mo53925a(r8)
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.f.c.w r2 = (com.google.assistant.p3931f.p3939c.C52846w) r2
            com.google.assistant.e.j.ady r8 = com.google.assistant.p3897e.p3921j.ady.f134912f
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.j.adx r8 = (com.google.assistant.p3897e.p3921j.adx) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.e.j.ady r9 = (com.google.assistant.p3897e.p3921j.ady) r9
            int r10 = r9.f134914a
            r10 = r10 | 8
            r9.f134914a = r10
            java.lang.String r10 = "com.google.android.dialer"
            r9.f134916c = r10
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.e.j.ady r9 = (com.google.assistant.p3897e.p3921j.ady) r9
            int r10 = r9.f134914a
            r10 = r10 | r7
            r9.f134914a = r10
            java.lang.String r10 = "com.android.dialer.remoteactions.RemoteActionsService"
            r9.f134915b = r10
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.e.j.ady r9 = (com.google.assistant.p3897e.p3921j.ady) r9
            int r10 = r9.f134914a
            r10 = r10 | 128(0x80, float:1.794E-43)
            r9.f134914a = r10
            r9.f134918e = r7
            com.google.protobuf.bt r9 = com.google.assistant.p3795af.p3796a.p3797a.C48775a.f126212d
            r8.mo58885m(r9, r2)
            com.google.protobuf.bv r2 = r8.build()
            com.google.assistant.e.j.ady r2 = (com.google.assistant.p3897e.p3921j.ady) r2
            com.google.assistant.e.j.ka r8 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.j.jz r8 = (com.google.assistant.p3897e.p3921j.C52228jz) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.e.j.ka r9 = (com.google.assistant.p3897e.p3921j.C52230ka) r9
            int r10 = r9.f137059a
            r7 = r7 | r10
            r9.f137059a = r7
            java.lang.String r7 = "assistant.api.client_op.ProviderBindAppActionsServiceArgs"
            r9.f137060b = r7
            com.google.protobuf.z r2 = r2.toByteString()
            r8.copyOnWrite()
            com.google.protobuf.bv r7 = r8.instance
            com.google.assistant.e.j.ka r7 = (com.google.assistant.p3897e.p3921j.C52230ka) r7
            r2.getClass()
            int r9 = r7.f137059a
            r6 = r6 | r9
            r7.f137059a = r6
            r7.f137061c = r2
            com.google.protobuf.bv r2 = r8.build()
            com.google.assistant.e.j.ka r2 = (com.google.assistant.p3897e.p3921j.C52230ka) r2
            java.lang.String r6 = "provider.BIND_APP_ACTIONS_SERVICE"
            java.lang.String r7 = "provider_bind_app_actions_service_args"
            com.google.assistant.e.j.dy r2 = com.google.android.apps.gsa.nga.engine.am.t.a(r6, r7, r2)
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89847o(r5, r2)
            r4.mo74213b(r2)
            com.google.assistant.e.j.en r2 = r4.mo74212a()
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.protos.f.q.fc r4 = (com.google.protos.p4985f.p5030q.C65196fc) r4
            r2.getClass()
            r4.f176461g = r2
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.gsa.nga.shared.aa.e.n r2 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n) r2
            com.google.protobuf.bv r3 = r3.build()
            com.google.protos.f.q.fc r3 = (com.google.protos.p4985f.p5030q.C65196fc) r3
            r3.getClass()
            r2.f220666i = r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.nga.shared.aa.e.n r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n) r1
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x050e
        L_0x0211:
            r2 = 149588(0x24854, float:2.09617E-40)
            r1.mo74319k(r2)
            com.google.assistant.e.j.go r2 = com.google.assistant.p3897e.p3921j.C52136go.MEDIA
            com.google.common.b.qy r3 = new com.google.common.b.qy
            r3.<init>(r2)
            com.google.android.apps.gsa.nga.engine.warmactions.j.m r2 = r0.m127797e(r3)
            java.util.ArrayDeque r3 = new java.util.ArrayDeque
            com.google.android.apps.gsa.nga.engine.warmactions.j.d r2 = (com.google.android.apps.gsa.nga.engine.warmactions.p6258j.C79695d) r2
            com.google.common.b.gu r4 = r2.f218553a
            r3.<init>(r4)
            java.util.Locale r4 = r16.m127799g()
            com.google.android.apps.gsa.nga.engine.warmactions.call.a.b r6 = r0.f218594s
            j$.util.Optional r6 = r6.mo74100d()
            com.google.android.apps.gsa.nga.engine.warmactions.call.a.b r7 = r0.f218594s
            j$.util.Optional r7 = r7.mo74099b()
            boolean r7 = r7.isPresent()
            if (r7 == 0) goto L_0x0251
            com.google.android.apps.gsa.nga.shared.u.c r7 = r0.f218589n
            java.lang.Object[] r5 = new java.lang.Object[r5]
            android.content.Context r7 = r7.mo75121a(r4)
            r8 = 2132083820(0x7f15046c, float:1.9807793E38)
            java.lang.String r5 = r7.getString(r8, r5)
            goto L_0x0260
        L_0x0251:
            com.google.android.apps.gsa.nga.shared.u.c r7 = r0.f218589n
            java.lang.Object[] r5 = new java.lang.Object[r5]
            android.content.Context r7 = r7.mo75121a(r4)
            r8 = 2132083839(0x7f15047f, float:1.9807832E38)
            java.lang.String r5 = r7.getString(r8, r5)
        L_0x0260:
            java.lang.Object r5 = r6.orElse(r5)
            java.lang.String r5 = (java.lang.String) r5
            com.google.assistant.e.j.dy r4 = r0.m127798f(r5, r4)
            r3.add(r4)
            com.google.assistant.e.j.dy r4 = com.google.android.apps.gsa.nga.engine.warmactions.p6258j.C79714w.f218612a
            r3.add(r4)
            com.google.common.b.gu r2 = r2.f218554b
            r3.addAll(r2)
            com.google.android.apps.gsa.shared.util.v.g r2 = r0.f218586k
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251458jG
            boolean r2 = r2.mo85405j(r4)
            if (r2 == 0) goto L_0x0299
            dagger.a r2 = r0.f218595t
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.nga.engine.warmactions.a.aq r2 = (com.google.android.apps.gsa.nga.engine.warmactions.p6248a.C79421aq) r2
            boolean r2 = r2.mo74047d()
            if (r2 == 0) goto L_0x0299
            com.google.assistant.e.j.dy r2 = f218578c
            r3.addFirst(r2)
            com.google.assistant.e.j.dy r2 = f218579d
            r3.addLast(r2)
        L_0x0299:
            com.google.protos.f.q.fc r2 = com.google.protos.p4985f.p5030q.C65196fc.f176453l
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.protos.f.q.ez r2 = (com.google.protos.p4985f.p5030q.C65192ez) r2
            com.google.android.apps.gsa.nga.engine.warmactions.j.v r4 = new com.google.android.apps.gsa.nga.engine.warmactions.j.v
            r4.<init>()
            r4.mo74214c(r3)
            com.google.assistant.e.j.en r3 = r4.mo74212a()
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.protos.f.q.fc r4 = (com.google.protos.p4985f.p5030q.C65196fc) r4
            r3.getClass()
            r4.f176461g = r3
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.gsa.nga.shared.aa.e.n r3 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n) r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.protos.f.q.fc r2 = (com.google.protos.p4985f.p5030q.C65196fc) r2
            r2.getClass()
            r3.f220666i = r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.nga.shared.aa.e.n r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n) r1
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x050e
        L_0x02d7:
            r2 = 65955(0x101a3, float:9.2423E-41)
            r1.mo74319k(r2)
            com.google.android.apps.gsa.shared.util.v.g r2 = r0.f218586k
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251466jO
            boolean r2 = r2.mo85405j(r3)
            if (r2 == 0) goto L_0x02ed
            com.google.assistant.e.j.dy r2 = f218577b
            com.google.android.apps.gsa.nga.shared.p6358n.C81442m.m129557s(r1, r2)
            goto L_0x0327
        L_0x02ed:
            com.google.protos.f.q.fc r2 = com.google.protos.p4985f.p5030q.C65196fc.f176453l
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.protos.f.q.ez r2 = (com.google.protos.p4985f.p5030q.C65192ez) r2
            com.google.android.apps.gsa.nga.engine.warmactions.j.v r3 = new com.google.android.apps.gsa.nga.engine.warmactions.j.v
            r3.<init>()
            com.google.assistant.e.j.dy r4 = com.google.android.apps.gsa.nga.engine.warmactions.p6258j.C79714w.f218612a
            com.google.assistant.e.j.dy r5 = f218577b
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89847o(r4, r5)
            r3.mo74213b(r4)
            com.google.assistant.e.j.en r3 = r3.mo74212a()
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.protos.f.q.fc r4 = (com.google.protos.p4985f.p5030q.C65196fc) r4
            r3.getClass()
            r4.f176461g = r3
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.gsa.nga.shared.aa.e.n r3 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n) r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.protos.f.q.fc r2 = (com.google.protos.p4985f.p5030q.C65196fc) r2
            r2.getClass()
            r3.f220666i = r2
        L_0x0327:
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.nga.shared.aa.e.n r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n) r1
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x050e
        L_0x0333:
            com.google.android.apps.gsa.nga.engine.ui.e.e.n r2 = r0.f218583f
            com.google.android.apps.gsa.nga.engine.warmactions.a r3 = new com.google.android.apps.gsa.nga.engine.warmactions.a
            com.google.android.apps.gsa.nga.engine.warmactions.g.ab r4 = com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79569ab.f218316f
            r3.<init>(r4, r6)
            r2.mo73250a(r3)
            com.google.android.apps.gsa.nga.engine.warmactions.c.j r2 = r17.mo74194b()
            com.google.android.apps.gsa.nga.engine.warmactions.g r2 = r2.mo74081b()
            com.google.android.apps.gsa.nga.engine.warmactions.g.ab r2 = r2.mo74017a()
            int r3 = r2.f218318a
            r3 = r3 & 8
            if (r3 == 0) goto L_0x035c
            com.google.protobuf.ar r2 = r2.f218322e
            if (r2 != 0) goto L_0x0357
            com.google.protobuf.ar r2 = com.google.protobuf.C62910ar.f169858c
        L_0x0357:
            j$.time.Duration r2 = com.google.protobuf.p4750c.C62950b.m95473d(r2)
            goto L_0x035e
        L_0x035c:
            j$.time.Duration r2 = f218581i
        L_0x035e:
            com.google.android.libraries.gsa.k.g r3 = r0.f218592q
            long r8 = r2.toMillis()
            com.google.android.apps.gsa.nga.engine.warmactions.j.k r2 = new com.google.android.apps.gsa.nga.engine.warmactions.j.k
            r2.<init>(r0)
            java.lang.String r4 = "[NGA][WA] stop answering"
            r3.mo28213m(r4, r8, r2)
            com.google.android.libraries.gsa.k.g r2 = r0.f218591p
            com.google.android.apps.gsa.nga.shared.s.f r3 = r0.f218593r
            com.google.android.apps.gsa.shared.util.c.bp r4 = r3.f222871a
            com.google.common.util.concurrent.cx r3 = r3.mo75091b(r4)
            com.google.android.apps.gsa.nga.engine.warmactions.k.d r4 = new com.google.android.apps.gsa.nga.engine.warmactions.k.d
            java.lang.String r6 = "MWW answer execution callback"
            r4.<init>(r6)
            java.lang.String r6 = "[NGA][WA] CallsExecutor.executeAnswer.callback"
            r2.mo28211k(r3, r6, r4)
            r2 = 65954(0x101a2, float:9.2421E-41)
            r1.mo74319k(r2)
            com.google.android.apps.gsa.nga.engine.warmactions.call.c r2 = r0.f218587l
            r2.mo74111b()
            com.google.protos.f.q.fc r2 = com.google.protos.p4985f.p5030q.C65196fc.f176453l
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.protos.f.q.ez r2 = (com.google.protos.p4985f.p5030q.C65192ez) r2
            com.google.assistant.e.j.go r3 = com.google.assistant.p3897e.p3921j.C52136go.RINGTONE
            com.google.assistant.e.j.go r4 = com.google.assistant.p3897e.p3921j.C52136go.MEDIA
            com.google.common.b.ij r3 = com.google.common.p4522b.C58528ij.m90011K(r3, r4)
            com.google.android.apps.gsa.nga.engine.warmactions.j.m r3 = r0.m127797e(r3)
            com.google.android.apps.gsa.nga.engine.warmactions.j.v r4 = new com.google.android.apps.gsa.nga.engine.warmactions.j.v
            r4.<init>()
            com.google.android.apps.gsa.shared.util.v.g r6 = r0.f218586k
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251458jG
            boolean r6 = r6.mo85405j(r8)
            if (r6 == 0) goto L_0x03bf
            dagger.a r6 = r0.f218595t
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.nga.engine.warmactions.a.aq r6 = (com.google.android.apps.gsa.nga.engine.warmactions.p6248a.C79421aq) r6
            boolean r6 = r6.mo74047d()
            goto L_0x03c0
        L_0x03bf:
            r6 = 0
        L_0x03c0:
            if (r6 == 0) goto L_0x03cb
            com.google.assistant.e.j.dy r8 = f218578c
            com.google.common.b.gu r8 = com.google.common.p4522b.C58485gu.m89846n(r8)
            r4.mo74213b(r8)
        L_0x03cb:
            com.google.android.apps.gsa.nga.engine.warmactions.j.d r3 = (com.google.android.apps.gsa.nga.engine.warmactions.p6258j.C79695d) r3
            com.google.common.b.gu r8 = r3.f218553a
            r4.mo74213b(r8)
            java.util.Locale r8 = r16.m127799g()
            com.google.android.apps.gsa.nga.shared.u.c r9 = r0.f218589n
            java.lang.Object[] r5 = new java.lang.Object[r5]
            android.content.Context r9 = r9.mo75121a(r8)
            r10 = 2132083818(0x7f15046a, float:1.980779E38)
            java.lang.String r5 = r9.getString(r10, r5)
            com.google.assistant.e.j.dy r5 = r0.m127798f(r5, r8)
            android.net.Uri$Builder r8 = new android.net.Uri$Builder
            r8.<init>()
            java.lang.String r9 = "android.resource"
            android.net.Uri$Builder r8 = r8.scheme(r9)
            android.content.Context r9 = r0.f218585j
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2132017153(0x7f140001, float:1.9672576E38)
            java.lang.String r9 = r9.getResourcePackageName(r10)
            android.net.Uri$Builder r8 = r8.encodedAuthority(r9)
            java.lang.String r9 = java.lang.Integer.toString(r10)
            android.net.Uri$Builder r8 = r8.appendEncodedPath(r9)
            android.net.Uri r8 = r8.build()
            java.lang.String r8 = r8.toString()
            com.google.speech.n.b.ar r9 = com.google.speech.p5230n.p5232b.C67402ar.f183192d
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.speech.n.b.aq r9 = (com.google.speech.p5230n.p5232b.C67401aq) r9
            com.google.protobuf.bt r10 = com.google.speech.p5224k.p5225a.C67215bf.f182681c
            com.google.speech.k.a.bf r11 = com.google.speech.p5224k.p5225a.C67215bf.f182680b
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.speech.k.a.be r11 = (com.google.speech.p5224k.p5225a.C67214be) r11
            com.google.speech.k.a.bd r12 = com.google.speech.p5224k.p5225a.C67213bd.f182675c
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.speech.k.a.bc r12 = (com.google.speech.p5224k.p5225a.C67212bc) r12
            com.google.speech.k.a.at r13 = com.google.speech.p5224k.p5225a.C67202at.f182655c
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.speech.k.a.as r13 = (com.google.speech.p5224k.p5225a.C67201as) r13
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.speech.k.a.at r14 = (com.google.speech.p5224k.p5225a.C67202at) r14
            r8.getClass()
            int r15 = r14.f182657a
            r7 = r7 | r15
            r14.f182657a = r7
            r14.f182658b = r8
            r12.copyOnWrite()
            com.google.protobuf.bv r7 = r12.instance
            com.google.speech.k.a.bd r7 = (com.google.speech.p5224k.p5225a.C67213bd) r7
            com.google.protobuf.bv r8 = r13.build()
            com.google.speech.k.a.at r8 = (com.google.speech.p5224k.p5225a.C67202at) r8
            r8.getClass()
            r7.f182678b = r8
            r8 = 6
            r7.f182677a = r8
            r11.copyOnWrite()
            com.google.protobuf.bv r7 = r11.instance
            com.google.speech.k.a.bf r7 = (com.google.speech.p5224k.p5225a.C67215bf) r7
            com.google.protobuf.bv r8 = r12.build()
            com.google.speech.k.a.bd r8 = (com.google.speech.p5224k.p5225a.C67213bd) r8
            r8.getClass()
            com.google.protobuf.cq r12 = r7.f182683a
            boolean r13 = r12.mo58948c()
            if (r13 != 0) goto L_0x047b
            com.google.protobuf.cq r12 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r12)
            r7.f182683a = r12
        L_0x047b:
            com.google.protobuf.cq r7 = r7.f182683a
            r7.add(r8)
            com.google.protobuf.bv r7 = r11.build()
            com.google.speech.k.a.bf r7 = (com.google.speech.p5224k.p5225a.C67215bf) r7
            r9.mo58885m(r10, r7)
            com.google.protobuf.bv r7 = r9.build()
            com.google.speech.n.b.ar r7 = (com.google.speech.p5230n.p5232b.C67402ar) r7
            java.util.Locale r8 = r16.m127799g()
            java.lang.String r8 = r8.toLanguageTag()
            com.google.assistant.e.j.dy r7 = com.google.android.apps.gsa.nga.engine.am.t.f(r7, r8)
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89847o(r5, r7)
            r4.mo74214c(r5)
            if (r6 == 0) goto L_0x04ad
            com.google.assistant.e.j.dy r5 = f218579d
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89846n(r5)
            r4.mo74213b(r5)
        L_0x04ad:
            com.google.android.apps.gsa.shared.util.v.g r5 = r0.f218586k
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251473jV
            boolean r5 = r5.mo85405j(r6)
            if (r5 == 0) goto L_0x04c8
            com.google.assistant.e.j.dy r5 = com.google.android.apps.gsa.nga.engine.warmactions.p6258j.C79714w.f218612a
            com.google.assistant.e.j.dy r6 = f218576a
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89847o(r5, r6)
            r4.mo74213b(r5)
            com.google.common.b.gu r3 = r3.f218554b
            r4.mo74213b(r3)
            goto L_0x04e2
        L_0x04c8:
            com.google.common.b.gp r5 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.common.b.gu r3 = r3.f218554b
            r5.mo55396h(r3)
            com.google.assistant.e.j.dy r3 = com.google.android.apps.gsa.nga.engine.warmactions.p6258j.C79714w.f218612a
            r5.mo55395g(r3)
            com.google.assistant.e.j.dy r3 = f218576a
            r5.mo55395g(r3)
            com.google.common.b.gu r3 = r5.mo55394f()
            r4.mo74213b(r3)
        L_0x04e2:
            com.google.assistant.e.j.en r3 = r4.mo74212a()
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.protos.f.q.fc r4 = (com.google.protos.p4985f.p5030q.C65196fc) r4
            r3.getClass()
            r4.f176461g = r3
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.gsa.nga.shared.aa.e.n r3 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n) r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.protos.f.q.fc r2 = (com.google.protos.p4985f.p5030q.C65196fc) r2
            r2.getClass()
            r3.f220666i = r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.nga.shared.aa.e.n r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n) r1
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
        L_0x050e:
            com.google.android.apps.gsa.nga.engine.warmactions.j.i r2 = new com.google.android.apps.gsa.nga.engine.warmactions.j.i
            r3 = r17
            r2.<init>(r0, r3)
            j$.util.Optional r1 = r1.map(r2)
            com.google.android.apps.gsa.nga.engine.warmactions.j.j r2 = com.google.android.apps.gsa.nga.engine.warmactions.p6258j.C79701j.f218574a
            java.lang.Object r1 = r1.orElseGet(r2)
            com.google.common.util.concurrent.cx r1 = (com.google.common.util.concurrent.C60870cx) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.warmactions.p6258j.C79705n.mo74177h(com.google.android.apps.gsa.nga.engine.warmactions.j.bs):com.google.common.util.concurrent.cx");
    }
}
