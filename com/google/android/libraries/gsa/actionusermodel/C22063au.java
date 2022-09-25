package com.google.android.libraries.gsa.actionusermodel;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.p616a.C10989a;
import com.google.android.libraries.gsa.actionusermodel.p1831d.C22131k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3912f.C51206a;
import com.google.assistant.p3897e.p3912f.C51207b;
import com.google.assistant.p3897e.p3912f.C51218m;
import com.google.assistant.p3897e.p3912f.C51220o;
import com.google.assistant.p3897e.p3921j.C52431rm;
import com.google.assistant.p3897e.p3921j.C52628yu;
import com.google.assistant.p3897e.p3921j.C52629yv;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58466gb;
import com.google.common.p4522b.C58468gd;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58723pp;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60945d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C55084fg;
import com.google.p4152bb.p4153a.C55421x;
import com.google.p4184bj.p4193c.p4200e.C55993a;
import com.google.p4184bj.p4193c.p4200e.C55994b;
import com.google.p4184bj.p4193c.p4200e.C55995c;
import com.google.p4184bj.p4193c.p4200e.C55996d;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p4986a.C64654ah;
import com.google.protos.p4985f.p4986a.C64655ai;
import com.google.protos.p4985f.p4986a.C64674ba;
import com.google.protos.p4985f.p4986a.C64708r;
import com.google.protos.p4985f.p4986a.C64710t;
import com.google.protos.p4985f.p5030q.C64988aa;
import com.google.protos.p4985f.p5030q.C64989ab;
import com.google.protos.p4985f.p5030q.C64990ac;
import com.google.protos.p4985f.p5030q.C64991ad;
import com.google.protos.p4985f.p5030q.C64992ae;
import com.google.protos.p4985f.p5030q.C64993af;
import com.google.protos.p4985f.p5030q.C64994ag;
import com.google.protos.p4985f.p5030q.C64995ah;
import com.google.protos.p4985f.p5030q.C64996ai;
import com.google.protos.p4985f.p5030q.C64997aj;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.au */
/* compiled from: PG */
public final class C22063au {

    /* renamed from: a */
    public static final C58468gd f60791a;

    /* renamed from: b */
    private static final C58974d f60792b = C58974d.m91136j();

    static {
        C58466gb gbVar = new C58466gb();
        gbVar.mo55364d("com.google.android.talk", "Hangouts");
        gbVar.mo55364d("com.google.android.apps.googlevoice", "Voice");
        gbVar.mo55364d("com.whatsapp", "Whatsapp");
        gbVar.mo55364d("com.google.android.apps.messaging", "Messages");
        gbVar.mo55364d("com.linkedin.android", "LinkedIn");
        gbVar.mo55364d("com.hike.chat.stickers", "Hike");
        gbVar.mo55364d("com.tencent.mm", "WeChat");
        gbVar.mo55364d("com.vkontakte.android", "VK");
        gbVar.mo55364d("org.telegram.messenger", "Telegram");
        gbVar.mo55364d("me.nextplus.smsfreetext.phonecalls", "Nextplus");
        gbVar.mo55364d("com.viber.voip", "Viber");
        gbVar.mo55364d("com.bbm", "BBM Enterprise");
        gbVar.mo55364d("ch.threema.app", "Threema");
        gbVar.mo55364d("com.samsung.android.messaging", "Samsung Messages");
        gbVar.mo55364d("com.verizon.messaging.vzmsgs", "Verizon Messages");
        gbVar.mo55364d("com.google.android.apps.fireball", "Allo");
        gbVar.mo55364d("com.facebook.orca", "Messenger");
        gbVar.mo55364d("jp.naver.line.android", "LINE");
        gbVar.mo55364d("com.google.android.apps.tachyon", "Duo");
        gbVar.mo55364d("com.android.server.telecom", "Phone");
        gbVar.mo55364d("com.google.android.googlequicksearchbox.sms", "SMS");
        f60791a = gbVar.mo55363c();
    }

    /* renamed from: a */
    public static C51220o m41298a(C51220o oVar) {
        C51218m mVar = (C51218m) C51220o.f133350m.createBuilder(oVar);
        if (!oVar.f133354c.isEmpty()) {
            String b = C10989a.m25986b(oVar.f133354c);
            mVar.copyOnWrite();
            C51220o oVar2 = (C51220o) mVar.instance;
            b.getClass();
            oVar2.f133352a |= 2;
            oVar2.f133354c = b;
        }
        if (!oVar.f133355d.isEmpty()) {
            String b2 = C10989a.m25986b(oVar.f133355d);
            mVar.copyOnWrite();
            C51220o oVar3 = (C51220o) mVar.instance;
            b2.getClass();
            oVar3.f133352a |= 4;
            oVar3.f133355d = b2;
        }
        if (!oVar.f133356e.isEmpty()) {
            C52628yu yuVar = (C52628yu) C52629yv.f138180g.createBuilder();
            String str = oVar.f133356e;
            yuVar.copyOnWrite();
            C52629yv yvVar = (C52629yv) yuVar.instance;
            str.getClass();
            yvVar.f138182a |= 2;
            yvVar.f138184c = str;
            C58833ax a = C10989a.m25985a((C52629yv) yuVar.build());
            if (a.mo56113h()) {
                String str2 = (String) a.mo56107c();
                mVar.copyOnWrite();
                C51220o oVar4 = (C51220o) mVar.instance;
                str2.getClass();
                oVar4.f133352a |= 8;
                oVar4.f133356e = str2;
            } else {
                mVar.copyOnWrite();
                C51220o oVar5 = (C51220o) mVar.instance;
                oVar5.f133352a |= 8;
                oVar5.f133356e = BuildConfig.FLAVOR;
            }
        }
        if (!oVar.f133357f.isEmpty()) {
            String b3 = C10989a.m25986b(oVar.f133357f);
            mVar.copyOnWrite();
            C51220o oVar6 = (C51220o) mVar.instance;
            b3.getClass();
            oVar6.f133352a |= 16;
            oVar6.f133357f = b3;
        }
        if (!oVar.f133360i.isEmpty()) {
            String b4 = C10989a.m25986b(oVar.f133360i);
            mVar.copyOnWrite();
            C51220o oVar7 = (C51220o) mVar.instance;
            b4.getClass();
            oVar7.f133352a |= 128;
            oVar7.f133360i = b4;
        }
        return (C51220o) mVar.build();
    }

    /* renamed from: b */
    static C58485gu m41299b(List list) {
        return (C58485gu) Collection.EL.stream(list).map(C22052aj.f60779a).collect(C58370cn.f155946a);
    }

    /* renamed from: c */
    public static C58485gu m41300c(C58485gu guVar, boolean z) {
        if (!z) {
            return guVar;
        }
        return (C58485gu) Collection.EL.stream(guVar).map(C22050ah.f60777a).collect(C58370cn.f155946a);
    }

    /* renamed from: d */
    public static C58485gu m41301d(C58485gu guVar, List list) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        return atomicBoolean.get() ? (C58485gu) Collection.EL.stream(guVar).map(new C22062at(list, atomicBoolean)).collect(C58370cn.f155946a) : guVar;
    }

    /* renamed from: e */
    static C55084fg m41302e(String str, String str2, boolean z) {
        if (str.equals(str2) || (z && str.equals("com.google.android.googlequicksearchbox.sms"))) {
            return C55084fg.PHONE_NUMBER;
        }
        if ("com.google.android.talk".equals(str)) {
            return C55084fg.GAIA_ID;
        }
        if (f60791a.containsKey(str)) {
            return C55084fg.APP_SPECIFIC_ENDPOINT_ID;
        }
        return C55084fg.PHONE_NUMBER;
    }

    /* renamed from: f */
    public static C64710t m41303f(C63088z zVar) {
        C64710t tVar = C64710t.f175414b;
        if (zVar == null) {
            return tVar;
        }
        try {
            return (C64710t) C62942bv.parseFrom((C62942bv) C64710t.f175414b, zVar, C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C58970a) ((C58970a) ((C58970a) f60792b.mo56225c()).mo56382g(e)).mo56372aa(48198)).mo56386p("Error in parsing OPA Aum ActionUserModel options flag.");
            return tVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0109, code lost:
        if (r1 == 0) goto L_0x010b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0135  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.protos.p4985f.p4986a.C64667au m41304g(com.google.protos.p4985f.p4986a.C64667au r9, boolean r10) {
        /*
            if (r10 == 0) goto L_0x01e6
            com.google.protos.f.a.r r10 = r9.f175285d
            if (r10 != 0) goto L_0x0008
            com.google.protos.f.a.r r10 = com.google.protos.p4985f.p4986a.C64708r.f175399l
        L_0x0008:
            int r0 = r10.f175402b
            r1 = 11
            if (r0 != r1) goto L_0x0013
            java.lang.Object r10 = r10.f175403c
            com.google.protos.f.a.ba r10 = (com.google.protos.p4985f.p4986a.C64674ba) r10
            goto L_0x0015
        L_0x0013:
            com.google.protos.f.a.ba r10 = com.google.protos.p4985f.p4986a.C64674ba.f175306k
        L_0x0015:
            com.google.protobuf.bn r10 = r10.toBuilder()
            com.google.protos.f.a.az r10 = (com.google.protos.p4985f.p4986a.C64672az) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r0 = r10.instance
            com.google.protos.f.a.ba r0 = (com.google.protos.p4985f.p4986a.C64674ba) r0
            int r2 = r0.f175308a
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r0.f175308a = r2
            r2 = 1
            r0.f175316i = r2
            com.google.protos.f.a.r r0 = r9.f175285d
            if (r0 != 0) goto L_0x0031
            com.google.protos.f.a.r r0 = com.google.protos.p4985f.p4986a.C64708r.f175399l
        L_0x0031:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.protos.f.a.q r0 = (com.google.protos.p4985f.p4986a.C64707q) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.protos.f.a.r r3 = (com.google.protos.p4985f.p4986a.C64708r) r3
            com.google.protobuf.bv r4 = r10.build()
            com.google.protos.f.a.ba r4 = (com.google.protos.p4985f.p4986a.C64674ba) r4
            r4.getClass()
            r3.f175403c = r4
            r3.f175402b = r1
            com.google.protobuf.bv r1 = r0.instance
            com.google.protos.f.a.r r1 = (com.google.protos.p4985f.p4986a.C64708r) r1
            com.google.protobuf.cq r1 = r1.f175404d
            int r1 = r1.size()
            r3 = 3
            r4 = 2
            r5 = 0
            if (r1 <= 0) goto L_0x010b
            com.google.protos.f.a.ab r1 = r0.mo59301d()
            int r6 = r1.f175241b
            int r6 = com.google.protos.p4985f.p4986a.C64647aa.m96424a(r6)
            if (r6 != 0) goto L_0x0067
            goto L_0x006b
        L_0x0067:
            if (r6 != r3) goto L_0x006b
            goto L_0x00ed
        L_0x006b:
            java.lang.String r6 = "\\$"
            com.google.common.base.y r6 = com.google.common.base.C58837ba.m90854c(r6)
            com.google.common.base.cf r6 = com.google.common.base.C58869cf.m90937c(r6)
            java.lang.String r7 = r1.f175242c
            java.util.List r6 = r6.mo56155i(r7)
            int r7 = r6.size()
            if (r7 != r2) goto L_0x00a9
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.protos.f.a.y r1 = (com.google.protos.p4985f.p4986a.C64715y) r1
            java.lang.Object r6 = r6.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.google.android.libraries.assistant.p616a.C10989a.m25986b(r6)
            r1.copyOnWrite()
            com.google.protobuf.bv r7 = r1.instance
            com.google.protos.f.a.ab r7 = (com.google.protos.p4985f.p4986a.C64648ab) r7
            r6.getClass()
            int r8 = r7.f175240a
            r8 = r8 | r4
            r7.f175240a = r8
            r7.f175242c = r6
            com.google.protobuf.bv r1 = r1.build()
            com.google.protos.f.a.ab r1 = (com.google.protos.p4985f.p4986a.C64648ab) r1
            goto L_0x00ed
        L_0x00a9:
            int r7 = r6.size()
            if (r7 != r4) goto L_0x00ed
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.protos.f.a.y r1 = (com.google.protos.p4985f.p4986a.C64715y) r1
            java.lang.Object r7 = r6.get(r5)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = com.google.android.libraries.assistant.p616a.C10989a.m25986b(r7)
            java.lang.Object r6 = r6.get(r2)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r7 = "$"
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r1.copyOnWrite()
            com.google.protobuf.bv r7 = r1.instance
            com.google.protos.f.a.ab r7 = (com.google.protos.p4985f.p4986a.C64648ab) r7
            int r8 = r7.f175240a
            r8 = r8 | r4
            r7.f175240a = r8
            r7.f175242c = r6
            com.google.protobuf.bv r1 = r1.build()
            com.google.protos.f.a.ab r1 = (com.google.protos.p4985f.p4986a.C64648ab) r1
        L_0x00ed:
            r0.copyOnWrite()
            com.google.protobuf.bv r6 = r0.instance
            com.google.protos.f.a.r r6 = (com.google.protos.p4985f.p4986a.C64708r) r6
            r1.getClass()
            r6.mo59303a()
            com.google.protobuf.cq r6 = r6.f175404d
            r6.set(r5, r1)
            com.google.protos.f.a.ab r1 = r0.mo59301d()
            int r1 = r1.f175241b
            int r1 = com.google.protos.p4985f.p4986a.C64647aa.m96424a(r1)
            if (r1 != 0) goto L_0x010c
        L_0x010b:
            r1 = 1
        L_0x010c:
            if (r1 == r3) goto L_0x0128
            r3 = 4
            if (r1 == r3) goto L_0x0128
            r3 = 7
            if (r1 != r3) goto L_0x01c3
            com.google.protobuf.bv r10 = r10.instance
            com.google.protos.f.a.ba r10 = (com.google.protos.p4985f.p4986a.C64674ba) r10
            int r10 = r10.f175311d
            com.google.bb.a.fg r10 = com.google.p4152bb.p4153a.C55084fg.m87580a(r10)
            if (r10 != 0) goto L_0x0122
            com.google.bb.a.fg r10 = com.google.p4152bb.p4153a.C55084fg.UNKNOWN_CONTACT_METHOD
        L_0x0122:
            com.google.bb.a.fg r1 = com.google.p4152bb.p4153a.C55084fg.PHONE_NUMBER
            if (r10 != r1) goto L_0x0128
            r10 = 1
            goto L_0x0129
        L_0x0128:
            r10 = 0
        L_0x0129:
            com.google.protobuf.bv r1 = r0.instance
            com.google.protos.f.a.r r1 = (com.google.protos.p4985f.p4986a.C64708r) r1
            com.google.protobuf.cq r1 = r1.f175411k
            int r1 = r1.size()
            if (r5 >= r1) goto L_0x01c3
            if (r10 == 0) goto L_0x0191
            com.google.assistant.e.j.yv r1 = com.google.assistant.p3897e.p3921j.C52629yv.f138180g
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.yu r1 = (com.google.assistant.p3897e.p3921j.C52628yu) r1
            com.google.protos.f.a.ao r3 = r0.mo59298a(r5)
            java.lang.String r3 = r3.f175267b
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.assistant.e.j.yv r6 = (com.google.assistant.p3897e.p3921j.C52629yv) r6
            r3.getClass()
            int r7 = r6.f138182a
            r7 = r7 | r4
            r6.f138182a = r7
            r6.f138184c = r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.yv r1 = (com.google.assistant.p3897e.p3921j.C52629yv) r1
            com.google.common.base.ax r1 = com.google.android.libraries.assistant.p616a.C10989a.m25985a(r1)
            boolean r3 = r1.mo56113h()
            if (r3 == 0) goto L_0x0191
            com.google.protos.f.a.ao r3 = r0.mo59298a(r5)
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.protos.f.a.an r3 = (com.google.protos.p4985f.p4986a.C64660an) r3
            java.lang.Object r1 = r1.mo56107c()
            java.lang.String r1 = (java.lang.String) r1
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.protos.f.a.ao r6 = (com.google.protos.p4985f.p4986a.C64661ao) r6
            r1.getClass()
            int r7 = r6.f175266a
            r7 = r7 | r2
            r6.f175266a = r7
            r6.f175267b = r1
            com.google.protobuf.bv r1 = r3.build()
            com.google.protos.f.a.ao r1 = (com.google.protos.p4985f.p4986a.C64661ao) r1
            r0.mo59302e(r5, r1)
            goto L_0x01bf
        L_0x0191:
            com.google.protos.f.a.ao r1 = r0.mo59298a(r5)
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.protos.f.a.an r1 = (com.google.protos.p4985f.p4986a.C64660an) r1
            com.google.protos.f.a.ao r3 = r0.mo59298a(r5)
            java.lang.String r3 = r3.f175267b
            java.lang.String r3 = com.google.android.libraries.assistant.p616a.C10989a.m25986b(r3)
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.protos.f.a.ao r6 = (com.google.protos.p4985f.p4986a.C64661ao) r6
            r3.getClass()
            int r7 = r6.f175266a
            r7 = r7 | r2
            r6.f175266a = r7
            r6.f175267b = r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.protos.f.a.ao r1 = (com.google.protos.p4985f.p4986a.C64661ao) r1
            r0.mo59302e(r5, r1)
        L_0x01bf:
            int r5 = r5 + 1
            goto L_0x0129
        L_0x01c3:
            com.google.protobuf.bn r9 = r9.toBuilder()
            com.google.protos.f.a.at r9 = (com.google.protos.p4985f.p4986a.C64666at) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.protos.f.a.au r10 = (com.google.protos.p4985f.p4986a.C64667au) r10
            com.google.protobuf.bv r0 = r0.build()
            com.google.protos.f.a.r r0 = (com.google.protos.p4985f.p4986a.C64708r) r0
            r0.getClass()
            r10.f175285d = r0
            int r0 = r10.f175282a
            r0 = r0 | r4
            r10.f175282a = r0
            com.google.protobuf.bv r9 = r9.build()
            com.google.protos.f.a.au r9 = (com.google.protos.p4985f.p4986a.C64667au) r9
        L_0x01e6:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.actionusermodel.C22063au.m41304g(com.google.protos.f.a.au, boolean):com.google.protos.f.a.au");
    }

    /* renamed from: h */
    public static C64993af m41305h(C55421x xVar, String str, String str2, String str3, List list, Optional optional, List list2, C64710t tVar, boolean z, C64708r rVar, boolean z2, boolean z3, boolean z4) {
        C64708r rVar2 = rVar;
        C64992ae aeVar = (C64992ae) C64993af.f176001j.createBuilder();
        aeVar.copyOnWrite();
        C64993af afVar = (C64993af) aeVar.instance;
        afVar.f176004b = xVar.f146230cP;
        afVar.f176003a |= 1;
        aeVar.copyOnWrite();
        C64993af afVar2 = (C64993af) aeVar.instance;
        str.getClass();
        afVar2.f176003a |= 2;
        afVar2.f176005c = str;
        aeVar.copyOnWrite();
        C64993af afVar3 = (C64993af) aeVar.instance;
        str2.getClass();
        afVar3.f176003a |= 4;
        afVar3.f176006d = str2;
        aeVar.copyOnWrite();
        C64993af afVar4 = (C64993af) aeVar.instance;
        str3.getClass();
        afVar4.f176003a |= 8;
        afVar4.f176007e = str3;
        aeVar.copyOnWrite();
        C64993af afVar5 = (C64993af) aeVar.instance;
        C62971cq cqVar = afVar5.f176008f;
        if (!cqVar.mo58948c()) {
            afVar5.f176008f = C62942bv.mutableCopy(cqVar);
        }
        List list3 = list;
        C62947c.addAll((Iterable) list, (List) afVar5.f176008f);
        C64989ab t = m41317t(list2, tVar, z, z2, z3, z4);
        aeVar.copyOnWrite();
        C64993af afVar6 = (C64993af) aeVar.instance;
        t.getClass();
        afVar6.f176011i = t;
        afVar6.f176003a |= 64;
        Objects.requireNonNull(aeVar);
        Optional optional2 = optional;
        optional.ifPresent(new C22059aq(aeVar));
        if (rVar2 != null) {
            aeVar.copyOnWrite();
            C64993af afVar7 = (C64993af) aeVar.instance;
            afVar7.f176010h = rVar2;
            afVar7.f176003a |= 32;
        }
        return (C64993af) aeVar.build();
    }

    /* renamed from: i */
    public static C64995ah m41306i(C55421x xVar, String str, String str2, String str3, String str4, List list, Optional optional, List list2, C64710t tVar, boolean z, C64708r rVar, boolean z2, boolean z3, boolean z4) {
        C64994ag agVar = (C64994ag) C64995ah.f176013k.createBuilder();
        agVar.copyOnWrite();
        C64995ah ahVar = (C64995ah) agVar.instance;
        ahVar.f176016b = xVar.f146230cP;
        ahVar.f176015a |= 1;
        agVar.copyOnWrite();
        C64995ah ahVar2 = (C64995ah) agVar.instance;
        str.getClass();
        ahVar2.f176015a |= 2;
        ahVar2.f176017c = str;
        agVar.copyOnWrite();
        C64995ah ahVar3 = (C64995ah) agVar.instance;
        str2.getClass();
        ahVar3.f176015a |= 4;
        ahVar3.f176018d = str2;
        agVar.copyOnWrite();
        C64995ah ahVar4 = (C64995ah) agVar.instance;
        str3.getClass();
        ahVar4.f176015a |= 8;
        ahVar4.f176019e = str3;
        agVar.copyOnWrite();
        C64995ah ahVar5 = (C64995ah) agVar.instance;
        str4.getClass();
        ahVar5.f176015a |= 16;
        ahVar5.f176020f = str4;
        agVar.copyOnWrite();
        C64995ah ahVar6 = (C64995ah) agVar.instance;
        C62971cq cqVar = ahVar6.f176021g;
        if (!cqVar.mo58948c()) {
            ahVar6.f176021g = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) ahVar6.f176021g);
        C64989ab t = m41317t(list2, tVar, z, z2, z3, z4);
        agVar.copyOnWrite();
        C64995ah ahVar7 = (C64995ah) agVar.instance;
        t.getClass();
        ahVar7.f176024j = t;
        ahVar7.f176015a |= 128;
        Objects.requireNonNull(agVar);
        optional.ifPresent(new C22053ak(agVar));
        if (rVar != null) {
            agVar.copyOnWrite();
            C64995ah ahVar8 = (C64995ah) agVar.instance;
            ahVar8.f176023i = rVar;
            ahVar8.f176015a |= 64;
        }
        return (C64995ah) agVar.build();
    }

    /* renamed from: j */
    static C65768az m41307j(long j, C64655ai aiVar, Optional optional) {
        C65767ay ayVar = (C65767ay) C65768az.f178793f.createBuilder();
        C65138c cVar = (C65138c) C65139d.f176307e.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(j);
        cVar.copyOnWrite();
        C65139d dVar = (C65139d) cVar.instance;
        dVar.f176309a |= 1;
        dVar.f176310b = micros;
        cVar.copyOnWrite();
        C65139d dVar2 = (C65139d) cVar.instance;
        dVar2.f176309a |= 4;
        dVar2.f176312d = 0;
        cVar.copyOnWrite();
        C65139d dVar3 = (C65139d) cVar.instance;
        dVar3.f176309a |= 2;
        dVar3.f176311c = 0;
        C65139d dVar4 = (C65139d) cVar.build();
        ayVar.copyOnWrite();
        C65768az azVar = (C65768az) ayVar.instance;
        dVar4.getClass();
        azVar.f178796b = dVar4;
        azVar.f178795a |= 1;
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        gVar.copyOnWrite();
        ((C63070h) gVar.instance).f170217a = "type.googleapis.com/assistant.action_user_model.AssistantActionHistoryData";
        C63088z byteString = aiVar.toByteString();
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        ayVar.copyOnWrite();
        C65768az azVar2 = (C65768az) ayVar.instance;
        C63070h hVar = (C63070h) gVar.build();
        hVar.getClass();
        azVar2.f178799e = hVar;
        azVar2.f178795a |= 8;
        if (optional.isPresent()) {
            C65139d dVar5 = (C65139d) optional.get();
            ayVar.copyOnWrite();
            C65768az azVar3 = (C65768az) ayVar.instance;
            dVar5.getClass();
            azVar3.f178796b = dVar5;
            azVar3.f178795a |= 1;
            C65139d dVar6 = (C65139d) optional.get();
            ayVar.copyOnWrite();
            C65768az azVar4 = (C65768az) ayVar.instance;
            dVar6.getClass();
            azVar4.f178797c = dVar6;
            azVar4.f178795a |= 2;
        }
        return (C65768az) ayVar.build();
    }

    /* renamed from: k */
    static Optional m41308k(C55421x xVar, Optional optional, String str, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, String str2, C60950i iVar, boolean z) {
        if (C58837ba.m90859h(str)) {
            ((C58970a) ((C58970a) f60792b.mo56226d()).mo56372aa(48200)).mo56386p("lookupName must be non-null.");
            return Optional.empty();
        }
        C51218m mVar = (C51218m) C51220o.f133350m.createBuilder();
        mVar.copyOnWrite();
        C51220o oVar = (C51220o) mVar.instance;
        oVar.f133352a |= 256;
        oVar.f133361j = str;
        Objects.requireNonNull(mVar);
        optional2.ifPresent(new C22047ae(mVar));
        Objects.requireNonNull(mVar);
        optional3.ifPresent(new C22054al(mVar));
        Objects.requireNonNull(mVar);
        optional4.ifPresent(new C22055am(mVar));
        Objects.requireNonNull(mVar);
        optional5.ifPresent(new C22056an(mVar));
        Objects.requireNonNull(mVar);
        optional6.ifPresent(new C22057ao(mVar));
        C55995c cVar = (C55995c) C55996d.f149115h.createBuilder();
        cVar.mo54310c((C51220o) mVar.build());
        if (z) {
            cVar.mo54309b(m41298a((C51220o) mVar.build()));
        }
        if (optional7.isPresent()) {
            String l = m41309l((String) optional7.get(), str2);
            String m = m41310m(l);
            if (l.equals("SMS")) {
                m = "com.google.android.googlequicksearchbox.sms";
            } else if (TextUtils.isEmpty(l)) {
                ((C58970a) ((C58970a) f60792b.mo56226d()).mo56372aa(48199)).mo56389s("Unsupported package name: %s", optional7);
                return Optional.empty();
            }
            C51206a aVar = (C51206a) C51207b.f133303d.createBuilder();
            aVar.copyOnWrite();
            C51207b bVar = (C51207b) aVar.instance;
            l.getClass();
            bVar.f133305a |= 1;
            bVar.f133306b = l;
            aVar.copyOnWrite();
            C51207b bVar2 = (C51207b) aVar.instance;
            m.getClass();
            bVar2.f133305a |= 2;
            bVar2.f133307c = m;
            cVar.mo54308a((C51207b) aVar.build());
        }
        C55993a aVar2 = (C55993a) C55994b.f149106h.createBuilder();
        int i = xVar.f146230cP;
        aVar2.copyOnWrite();
        C55994b bVar3 = (C55994b) aVar2.instance;
        bVar3.f149108a |= 2;
        bVar3.f149110c = i;
        C52431rm rmVar = C52431rm.OPA_AGSA;
        aVar2.copyOnWrite();
        C55994b bVar4 = (C55994b) aVar2.instance;
        bVar4.f149113f = rmVar.f137633ah;
        bVar4.f149108a |= 256;
        C55996d dVar = (C55996d) cVar.build();
        aVar2.copyOnWrite();
        C55994b bVar5 = (C55994b) aVar2.instance;
        dVar.getClass();
        bVar5.f149112e = dVar;
        bVar5.f149108a |= 16;
        Objects.requireNonNull(aVar2);
        optional.ifPresent(new C22058ap(aVar2));
        C64654ah ahVar = (C64654ah) C64655ai.f175254d.createBuilder();
        C55994b bVar6 = (C55994b) aVar2.build();
        ahVar.copyOnWrite();
        C64655ai aiVar = (C64655ai) ahVar.instance;
        bVar6.getClass();
        aiVar.f175257b = bVar6;
        aiVar.f175256a |= 1;
        long a = C60945d.m93096a(iVar.mo57444a());
        ahVar.copyOnWrite();
        C64655ai aiVar2 = (C64655ai) ahVar.instance;
        aiVar2.f175256a |= 2;
        aiVar2.f175258c = a;
        return Optional.m71637of((C64655ai) ahVar.build());
    }

    /* renamed from: l */
    static String m41309l(String str, String str2) {
        if (str.equals(str2)) {
            return "SMS";
        }
        return (String) f60791a.getOrDefault(str, BuildConfig.FLAVOR);
    }

    /* renamed from: m */
    static String m41310m(String str) {
        if (str.equals("SMS")) {
            return "com.google.android.googlequicksearchbox.sms";
        }
        return (String) ((C58723pp) f60791a).f156468c.getOrDefault(str, BuildConfig.FLAVOR);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m41311n(com.google.protos.p4985f.p4986a.C64708r r7) {
        /*
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2 = 1
            r3 = 0
            if (r7 == 0) goto L_0x001e
            int r4 = r7.f175402b
            r5 = 11
            if (r4 != r5) goto L_0x001e
            java.lang.Object r4 = r7.f175403c
            com.google.protos.f.a.ba r4 = (com.google.protos.p4985f.p4986a.C64674ba) r4
            int r5 = r4.f175308a
            r5 = r5 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto L_0x001e
            double r4 = r4.f175317j
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x001e
            r4 = 1
            goto L_0x001f
        L_0x001e:
            r4 = 0
        L_0x001f:
            if (r7 == 0) goto L_0x0031
            int r5 = r7.f175401a
            r6 = 32768(0x8000, float:4.5918E-41)
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0031
            double r5 = r7.f175410j
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x0031
            r7 = 1
            goto L_0x0032
        L_0x0031:
            r7 = 0
        L_0x0032:
            if (r4 != 0) goto L_0x0038
            if (r7 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            return r3
        L_0x0038:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.actionusermodel.C22063au.m41311n(com.google.protos.f.a.r):boolean");
    }

    /* renamed from: o */
    static boolean m41312o(C64708r rVar) {
        return rVar != null && rVar.f175402b == 11 && ((C64674ba) rVar.f175403c).f175313f;
    }

    /* renamed from: p */
    public static C64997aj m41313p(C55421x xVar, String str, String str2, List list, Optional optional, List list2, C64710t tVar, boolean z, C64708r rVar, boolean z2, boolean z3) {
        C64708r rVar2 = rVar;
        C64996ai aiVar = (C64996ai) C64997aj.f176026i.createBuilder();
        aiVar.copyOnWrite();
        C64997aj ajVar = (C64997aj) aiVar.instance;
        ajVar.f176029b = xVar.f146230cP;
        ajVar.f176028a |= 1;
        aiVar.copyOnWrite();
        C64997aj ajVar2 = (C64997aj) aiVar.instance;
        str.getClass();
        ajVar2.f176028a |= 2;
        ajVar2.f176030c = str;
        aiVar.copyOnWrite();
        C64997aj ajVar3 = (C64997aj) aiVar.instance;
        str2.getClass();
        ajVar3.f176028a |= 4;
        ajVar3.f176031d = str2;
        aiVar.copyOnWrite();
        C64997aj ajVar4 = (C64997aj) aiVar.instance;
        C62971cq cqVar = ajVar4.f176032e;
        if (!cqVar.mo58948c()) {
            ajVar4.f176032e = C62942bv.mutableCopy(cqVar);
        }
        List list3 = list;
        C62947c.addAll((Iterable) list, (List) ajVar4.f176032e);
        C64989ab t = m41317t(list2, tVar, z, z2, z3, true);
        aiVar.copyOnWrite();
        C64997aj ajVar5 = (C64997aj) aiVar.instance;
        t.getClass();
        ajVar5.f176035h = t;
        ajVar5.f176028a |= 32;
        Objects.requireNonNull(aiVar);
        Optional optional2 = optional;
        optional.ifPresent(new C22051ai(aiVar));
        if (rVar2 != null) {
            aiVar.copyOnWrite();
            C64997aj ajVar6 = (C64997aj) aiVar.instance;
            ajVar6.f176034g = rVar2;
            ajVar6.f176028a |= 16;
        }
        return (C64997aj) aiVar.build();
    }

    /* renamed from: q */
    static String m41314q(String str, String str2, String str3, C55421x xVar, int i, String str4) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 == 2) {
                return str;
            }
            if (!(i2 == 3 || i2 == 4)) {
                if (i2 != 6) {
                    return BuildConfig.FLAVOR;
                }
                if (xVar != C55421x.GENERIC_SEND_MESSAGE) {
                    return str2;
                }
                return str2 + "$" + m41309l(str3, str4);
            }
        }
        return str2;
    }

    /* renamed from: r */
    public static C64991ad m41315r(C55421x xVar, String str, List list, Optional optional, List list2, C64710t tVar, boolean z, C64708r rVar, boolean z2, boolean z3) {
        C64708r rVar2 = rVar;
        C64990ac acVar = (C64990ac) C64991ad.f175990i.createBuilder();
        acVar.copyOnWrite();
        C64991ad adVar = (C64991ad) acVar.instance;
        adVar.f175993b = xVar.f146230cP;
        adVar.f175992a |= 1;
        acVar.copyOnWrite();
        C64991ad adVar2 = (C64991ad) acVar.instance;
        str.getClass();
        adVar2.f175992a |= 2;
        adVar2.f175994c = str;
        Iterable iterable = (Iterable) Collection.EL.stream(list).map(C22060ar.f60787a).collect(C58370cn.f155946a);
        acVar.copyOnWrite();
        C64991ad adVar3 = (C64991ad) acVar.instance;
        C62971cq cqVar = adVar3.f175995d;
        if (!cqVar.mo58948c()) {
            adVar3.f175995d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) adVar3.f175995d);
        acVar.copyOnWrite();
        C64991ad adVar4 = (C64991ad) acVar.instance;
        adVar4.f175992a |= 16;
        adVar4.f175998g = 0.95d;
        C64989ab t = m41317t(list2, tVar, z, z2, z3, true);
        acVar.copyOnWrite();
        C64991ad adVar5 = (C64991ad) acVar.instance;
        t.getClass();
        adVar5.f175999h = t;
        adVar5.f175992a |= 32;
        Objects.requireNonNull(acVar);
        Optional optional2 = optional;
        optional.ifPresent(new C22061as(acVar));
        if (rVar2 != null) {
            acVar.copyOnWrite();
            C64991ad adVar6 = (C64991ad) acVar.instance;
            adVar6.f175997f = rVar2;
            adVar6.f175992a |= 8;
        }
        return (C64991ad) acVar.build();
    }

    /* renamed from: s */
    public static C60870cx m41316s(C60870cx cxVar, C22131k kVar) {
        return C47633f.m84733g(kVar.mo27362a()).mo51513e(Throwable.class, C22048af.f60775a, C60826bg.f164896a).mo51516i(new C22049ag(cxVar), C60826bg.f164896a);
    }

    /* renamed from: t */
    private static C64989ab m41317t(List list, C64710t tVar, boolean z, boolean z2, boolean z3, boolean z4) {
        C64988aa aaVar = (C64988aa) C64989ab.f175981h.createBuilder();
        aaVar.copyOnWrite();
        C64989ab abVar = (C64989ab) aaVar.instance;
        C62971cq cqVar = abVar.f175984b;
        if (!cqVar.mo58948c()) {
            abVar.f175984b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) abVar.f175984b);
        aaVar.copyOnWrite();
        C64989ab abVar2 = (C64989ab) aaVar.instance;
        abVar2.f175983a |= 2;
        abVar2.f175985c = z;
        aaVar.copyOnWrite();
        C64989ab abVar3 = (C64989ab) aaVar.instance;
        abVar3.f175983a |= 8;
        abVar3.f175987e = z2;
        aaVar.copyOnWrite();
        C64989ab abVar4 = (C64989ab) aaVar.instance;
        abVar4.f175983a |= 4;
        abVar4.f175986d = z3;
        aaVar.copyOnWrite();
        C64989ab abVar5 = (C64989ab) aaVar.instance;
        abVar5.f175983a |= 16;
        abVar5.f175988f = z4;
        if (tVar != null) {
            aaVar.copyOnWrite();
            C64989ab abVar6 = (C64989ab) aaVar.instance;
            abVar6.f175989g = tVar;
            abVar6.f175983a |= 32;
        }
        return (C64989ab) aaVar.build();
    }
}
