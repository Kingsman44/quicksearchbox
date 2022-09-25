package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a;

import android.text.TextUtils;
import com.google.android.apps.auto.p450a.C8958d;
import com.google.android.apps.auto.p450a.C8960f;
import com.google.android.apps.auto.p450a.C8963i;
import com.google.android.apps.auto.p450a.p451a.C8915h;
import com.google.android.apps.auto.p450a.p451a.C8917j;
import com.google.android.apps.auto.p450a.p451a.C8919l;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p681d.C11636b;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p685g.C11652a;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.C11792c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a.C12112a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a.C12113b;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12985c;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12987e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12993k;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.p880a.C12967c;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13041c;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13042d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13044f;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13056r;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1018d.p1021c.C13678d;
import com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p960b.C13428n;
import com.google.android.libraries.assistant.auto.tng.p945f.p953c.p961c.C13436d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.notification.p2709a.C34837a;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35608aa;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3050b.C39227c;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
import p5460g.p5461a.C69464a;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.ai */
/* compiled from: PG */
public final class C11760ai implements C11792c {

    /* renamed from: a */
    public static final C58974d f37857a = C58974d.m91134h("DodgeboostRequestFctry");

    /* renamed from: b */
    public static final String f37858b = C39227c.m68658b(C39226b.TAG_ASSISTANT_AUTO_TNG_COMMS);

    /* renamed from: c */
    public final C11652a f37859c;

    /* renamed from: d */
    public final C34837a f37860d;

    /* renamed from: e */
    public final Executor f37861e;

    /* renamed from: f */
    public final C21370a f37862f;

    /* renamed from: g */
    public final C69464a f37863g;

    /* renamed from: h */
    public final C11636b f37864h;

    /* renamed from: i */
    public final Map f37865i;

    /* renamed from: j */
    public C8915h f37866j;

    /* renamed from: k */
    public C8963i f37867k;

    /* renamed from: l */
    public C60870cx f37868l;

    /* renamed from: m */
    public C13056r f37869m;

    /* renamed from: n */
    public String f37870n;

    /* renamed from: o */
    private final C69464a f37871o;

    /* renamed from: p */
    private final C69464a f37872p;

    /* renamed from: q */
    private final C69464a f37873q;

    /* renamed from: r */
    private final C13436d f37874r;

    /* renamed from: s */
    private final List f37875s;

    /* renamed from: t */
    private final C69615a f37876t;

    public C11760ai(C11652a aVar, C34837a aVar2, Executor executor, C69464a aVar3, C21370a aVar4, C69464a aVar5, C69464a aVar6, C11636b bVar, Map map, C69464a aVar7, C13436d dVar, C13678d dVar2, C13044f fVar, List list) {
        this.f37859c = aVar;
        this.f37860d = aVar2;
        this.f37861e = executor;
        this.f37871o = aVar3;
        this.f37862f = aVar4;
        this.f37863g = aVar5;
        this.f37872p = aVar6;
        this.f37864h = bVar;
        this.f37865i = map;
        this.f37873q = aVar7;
        this.f37874r = dVar;
        this.f37875s = list;
        this.f37876t = new C11758ag(fVar, dVar2);
    }

    /* renamed from: a */
    public final C12985c mo20135a() {
        C12989g gVar = C12989g.AUTO_PROJECTED;
        String str = this.f37870n;
        if (str == null) {
            C69664n.m101065k("requestSource");
            str = null;
        }
        return C12967c.m29204a(gVar, str, this.f37862f.mo26871c());
    }

    /* renamed from: b */
    public final C12986d mo20136b(C12985c cVar) {
        C12991i iVar = ((C12986d) cVar.instance).f40370d;
        if (iVar == null) {
            iVar = C12991i.f40380k;
        }
        C69664n.m101060f(iVar, "requestBuilder.assistantRequestConfig");
        C62934bn builder = iVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C12993k a = C69664n.m101061g((C12987e) builder, "builder");
        C62940bt btVar = C13042d.f40481n;
        C69664n.m101060f(btVar, "aapAssistantRequestConfigExtension");
        C8915h hVar = this.f37866j;
        C8963i iVar2 = null;
        if (hVar == null) {
            C69664n.m101065k("sessionConfig");
            hVar = null;
        }
        String str = hVar.f30935e;
        C12112a aVar = (C12112a) C12113b.f38724h.createBuilder();
        C8915h hVar2 = this.f37866j;
        if (hVar2 == null) {
            C69664n.m101065k("sessionConfig");
            hVar2 = null;
        }
        String str2 = hVar2.f30935e;
        aVar.copyOnWrite();
        C12113b bVar = (C12113b) aVar.instance;
        str2.getClass();
        bVar.f38727b = 5;
        bVar.f38728c = str2;
        C8915h hVar3 = this.f37866j;
        if (hVar3 == null) {
            C69664n.m101065k("sessionConfig");
            hVar3 = null;
        }
        int i = hVar3.f30936f;
        aVar.copyOnWrite();
        C12113b bVar2 = (C12113b) aVar.instance;
        bVar2.f38726a |= 32;
        bVar2.f38729d = i;
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "newBuilder()\n        .se…ingRate)\n        .build()");
        C12113b bVar3 = (C12113b) build;
        C13041c cVar2 = (C13041c) C13042d.f40480m.createBuilder();
        cVar2.copyOnWrite();
        C13042d dVar = (C13042d) cVar2.instance;
        bVar3.getClass();
        dVar.f40484b = bVar3;
        int i2 = 1;
        dVar.f40483a |= 1;
        cVar2.copyOnWrite();
        C13042d dVar2 = (C13042d) cVar2.instance;
        dVar2.f40483a |= 2;
        dVar2.f40485c = true;
        C13044f fVar = (C13044f) this.f37876t.mo5672a();
        cVar2.copyOnWrite();
        C13042d dVar3 = (C13042d) cVar2.instance;
        fVar.getClass();
        dVar3.f40486d = fVar;
        dVar3.f40483a |= 4;
        C13056r rVar = this.f37869m;
        if (rVar == null) {
            C69664n.m101065k("requestMetadata");
            rVar = null;
        }
        boolean z = rVar.f40530b;
        cVar2.copyOnWrite();
        C13042d dVar4 = (C13042d) cVar2.instance;
        dVar4.f40483a |= 64;
        dVar4.f40491i = z;
        cVar2.mo20875a(this.f37875s);
        cVar2.copyOnWrite();
        C13042d dVar5 = (C13042d) cVar2.instance;
        dVar5.f40483a |= 256;
        dVar5.f40493k = true;
        C8915h hVar4 = this.f37866j;
        if (hVar4 == null) {
            C69664n.m101065k("sessionConfig");
            hVar4 = null;
        }
        int a2 = C8917j.m23517a(hVar4.f30934d);
        if (a2 == 0) {
            a2 = 1;
        }
        cVar2.copyOnWrite();
        C13042d dVar6 = (C13042d) cVar2.instance;
        dVar6.f40494l = a2 - 1;
        dVar6.f40483a |= 512;
        C8915h hVar5 = this.f37866j;
        if (hVar5 == null) {
            C69664n.m101065k("sessionConfig");
            hVar5 = null;
        }
        int b = C8919l.m23519b(hVar5.f30933c);
        if (b != 0 && b == 2) {
            C13056r rVar2 = this.f37869m;
            if (rVar2 == null) {
                C69664n.m101065k("requestMetadata");
                rVar2 = null;
            }
            if ((rVar2.f40529a & 2) != 0) {
                C13056r rVar3 = this.f37869m;
                if (rVar3 == null) {
                    C69664n.m101065k("requestMetadata");
                    rVar3 = null;
                }
                boolean z2 = rVar3.f40531c;
                cVar2.copyOnWrite();
                C13042d dVar7 = (C13042d) cVar2.instance;
                dVar7.f40483a |= 128;
                dVar7.f40492j = z2;
            }
        }
        Object b2 = this.f37871o.mo17428b();
        C69664n.m101060f(b2, "isForegroundSearchEnabled.get()");
        if (((Boolean) b2).booleanValue()) {
            C8915h hVar6 = this.f37866j;
            if (hVar6 == null) {
                C69664n.m101065k("sessionConfig");
                hVar6 = null;
            }
            int b3 = C8919l.m23519b(hVar6.f30933c);
            if (b3 != 0 && b3 == 2) {
                C8963i iVar3 = this.f37867k;
                if (iVar3 == null) {
                    C69664n.m101065k("stateSnapshot");
                    iVar3 = null;
                }
                if (iVar3.f31054a.size() > 0) {
                    C8963i iVar4 = this.f37867k;
                    if (iVar4 == null) {
                        C69664n.m101065k("stateSnapshot");
                        iVar4 = null;
                    }
                    String str3 = ((C8958d) iVar4.f31054a.get(0)).f31048b;
                    C69664n.m101060f(str3, "it");
                    if (str3.length() > 0) {
                        cVar2.copyOnWrite();
                        C13042d dVar8 = (C13042d) cVar2.instance;
                        str3.getClass();
                        dVar8.f40483a |= 8;
                        dVar8.f40487e = str3;
                    }
                }
            }
        }
        C8963i iVar5 = this.f37867k;
        if (iVar5 == null) {
            C69664n.m101065k("stateSnapshot");
            iVar5 = null;
        }
        String str4 = (String) Collections.unmodifiableMap(iVar5.f31055b).get(1);
        if (str4 != null) {
            cVar2.copyOnWrite();
            C13042d dVar9 = (C13042d) cVar2.instance;
            dVar9.f40483a |= 16;
            dVar9.f40488f = str4;
        }
        Map map = C11762ak.f37889a;
        C8963i iVar6 = this.f37867k;
        if (iVar6 == null) {
            C69664n.m101065k("stateSnapshot");
        } else {
            iVar2 = iVar6;
        }
        List list = this.f37875s;
        C69664n.m101061g(iVar2, "gearheadStateSnapshot");
        JSONObject jSONObject = new JSONObject();
        if (iVar2.f31054a.size() > 0) {
            Map map2 = C11762ak.f37889a;
            int a3 = C8960f.m23522a(((C8958d) iVar2.f31054a.get(0)).f31047a);
            if (a3 != 0) {
                i2 = a3;
            }
            String str5 = (String) map2.get(Integer.valueOf(i2 - 1));
            if (str5 != null) {
                C11762ak.m27432a(jSONObject, "FACET_TYPE", str5);
            }
        }
        if (iVar2.f31055b.size() > 0) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : C11762ak.f37889a.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                String str6 = (String) entry.getValue();
                String str7 = (String) Collections.unmodifiableMap(iVar2.f31055b).get(Integer.valueOf(intValue));
                if (!TextUtils.isEmpty(str7)) {
                    C11762ak.m27432a(jSONObject2, str6, str7);
                }
            }
            C11762ak.m27432a(jSONObject, "DEFAULT_PACKAGES", jSONObject2);
        }
        if (!list.isEmpty()) {
            C11762ak.m27432a(jSONObject, "APP_WHITELIST", new JSONArray(list));
        }
        String jSONObject3 = jSONObject.toString();
        C69664n.m101060f(jSONObject3, "stateSnapshotToJson(gear…dAppAllowlist).toString()");
        cVar2.copyOnWrite();
        C13042d dVar10 = (C13042d) cVar2.instance;
        jSONObject3.getClass();
        dVar10.f40483a |= 32;
        dVar10.f40489g = jSONObject3;
        C62942bv build2 = cVar2.build();
        C69664n.m101060f(build2, "configBuilder.build()");
        a.mo20867b(btVar, (C13042d) build2);
        C12991i a4 = a.mo20866a();
        cVar.copyOnWrite();
        C12986d dVar11 = (C12986d) cVar.instance;
        a4.getClass();
        dVar11.f40370d = a4;
        dVar11.f40367a |= 128;
        C62942bv build3 = cVar.build();
        C69664n.m101060f(build3, "requestBuilder.build()");
        return (C12986d) build3;
    }

    /* renamed from: c */
    public final C60870cx mo20137c(String str, C69630p pVar) {
        C60870cx e = mo20139e();
        Object obj = ((Map) ((C69464a) C69505av.m100865g(this.f37865i, C12989g.AUTO_PROJECTED)).mo17428b()).get(C13428n.UNREAD);
        C69664n.m101058d(obj);
        C60870cx a = C47638k.m84751b(e, ((C35608aa) obj).mo21082b(e)).mo51520a(new C11757af(e), this.f37861e);
        return C47633f.m84733g(a).mo51516i(new C11789y(this), this.f37861e).mo51515h(new C11790z(str, pVar, a), this.f37861e).mo51515h(new C11752aa(this), this.f37861e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0027, code lost:
        if (((java.lang.Boolean) r0).booleanValue() != false) goto L_0x0029;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20138d(boolean r7) {
        /*
            r6 = this;
            g.a.a r0 = r6.f37873q
            java.lang.Object r0 = r0.mo17428b()
            java.lang.String r1 = "enableMessageGraphForTap…sageActionsProvider.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 == 0) goto L_0x007e
            if (r7 == 0) goto L_0x0029
            g.a.a r0 = r6.f37872p
            java.lang.Object r0 = r0.mo17428b()
            java.lang.String r2 = "enableAutoplayMessagesOnDeviceProjected.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x007e
        L_0x0029:
            com.google.common.util.concurrent.cx r0 = r6.mo20139e()
            com.google.apps.tiktok.tracing.contrib.b.f r0 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r0)
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.ad r2 = com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11755ad.f37848a
            java.util.concurrent.Executor r3 = r6.f37861e
            com.google.apps.tiktok.tracing.contrib.b.f r0 = r0.mo51515h(r2, r3)
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.ab r2 = new com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.ab
            r2.<init>(r6)
            java.util.concurrent.Executor r3 = r6.f37861e
            com.google.apps.tiktok.tracing.contrib.b.f r2 = r0.mo51516i(r2, r3)
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.ac r3 = com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11754ac.f37847a
            java.util.concurrent.Executor r4 = r6.f37861e
            com.google.apps.tiktok.tracing.contrib.b.f r2 = r2.mo51515h(r3, r4)
            com.google.android.libraries.assistant.auto.tng.f.c.c.d r3 = r6.f37874r
            com.google.android.libraries.assistant.auto.tng.f.c.c.a r4 = new com.google.android.libraries.assistant.auto.tng.f.c.c.a
            r4.<init>(r0, r2)
            long r2 = r3.mo21090a(r4)
            if (r1 == r7) goto L_0x005b
            r7 = 2
            goto L_0x005c
        L_0x005b:
            r7 = 4
        L_0x005c:
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.g r0 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g.AUTO_PROJECTED
            java.lang.String r1 = r6.f37870n
            if (r1 != 0) goto L_0x0068
            java.lang.String r1 = "requestSource"
            p5462h.p5473f.p5475b.C69664n.m101065k(r1)
            r1 = 0
        L_0x0068:
            com.google.android.libraries.f.a r4 = r6.f37862f
            long r4 = r4.mo26871c()
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.c r0 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.p880a.C12967c.m29204a(r0, r1, r4)
            com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.p880a.C12967c.m29208e(r0, r7, r2)
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.d r7 = r6.mo20136b(r0)
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92900i(r7)
            goto L_0x008e
        L_0x007e:
            if (r1 == r7) goto L_0x0083
            java.lang.String r0 = "TapToRead"
            goto L_0x0085
        L_0x0083:
            java.lang.String r0 = "AutoRead"
        L_0x0085:
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.ae r1 = new com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.ae
            r1.<init>(r6, r7)
            com.google.common.util.concurrent.cx r7 = r6.mo20137c(r0, r1)
        L_0x008e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11760ai.mo20138d(boolean):com.google.common.util.concurrent.cx");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0051  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20139e() {
        /*
            r6 = this;
            com.google.android.apps.auto.a.a.h r0 = r6.f37866j
            java.lang.String r1 = "sessionConfig"
            r2 = 0
            if (r0 != 0) goto L_0x000b
            p5462h.p5473f.p5475b.C69664n.m101065k(r1)
            r0 = r2
        L_0x000b:
            int r0 = r0.f30933c
            int r0 = com.google.android.apps.auto.p450a.p451a.C8919l.m23519b(r0)
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x0016
            goto L_0x001b
        L_0x0016:
            r5 = 3
            if (r0 != r5) goto L_0x001b
        L_0x0019:
            r0 = 1
            goto L_0x0032
        L_0x001b:
            com.google.android.apps.auto.a.a.h r0 = r6.f37866j
            if (r0 != 0) goto L_0x0023
            p5462h.p5473f.p5475b.C69664n.m101065k(r1)
            r0 = r2
        L_0x0023:
            int r0 = r0.f30933c
            int r0 = com.google.android.apps.auto.p450a.p451a.C8919l.m23519b(r0)
            if (r0 != 0) goto L_0x002d
        L_0x002b:
            r0 = 0
            goto L_0x0032
        L_0x002d:
            r5 = 9
            if (r0 != r5) goto L_0x002b
            goto L_0x0019
        L_0x0032:
            com.google.android.apps.auto.a.a.h r5 = r6.f37866j
            if (r5 != 0) goto L_0x003a
            p5462h.p5473f.p5475b.C69664n.m101065k(r1)
            r5 = r2
        L_0x003a:
            int r1 = r5.f30933c
            int r1 = com.google.android.apps.auto.p450a.p451a.C8919l.m23519b(r1)
            if (r1 != 0) goto L_0x0044
        L_0x0042:
            r3 = 0
            goto L_0x0047
        L_0x0044:
            r5 = 4
            if (r1 != r5) goto L_0x0042
        L_0x0047:
            com.google.common.util.concurrent.cx r1 = r6.f37868l
            if (r1 != 0) goto L_0x0051
            java.lang.String r1 = "messagesFuture"
            p5462h.p5473f.p5475b.C69664n.m101065k(r1)
            goto L_0x0052
        L_0x0051:
            r2 = r1
        L_0x0052:
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.ah r1 = new com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.ah
            r1.<init>(r0, r3, r6)
            java.util.concurrent.Executor r0 = r6.f37861e
            com.google.common.util.concurrent.s r1 = com.google.apps.tiktok.tracing.C47810es.m84966f(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r2, r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a.C11760ai.mo20139e():com.google.common.util.concurrent.cx");
    }
}
