package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9573y;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.C127369n;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32798at;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32838cf;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.assistant.p3897e.p3917i.p3918a.C51491jr;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5129p.p5131b.C65798cb;
import com.google.protos.p5129p.p5131b.C65804ch;
import com.google.protos.p5129p.p5131b.C65806cj;
import java.util.Iterator;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.y.c */
/* compiled from: PG */
public final class C127278c implements C127369n {

    /* renamed from: a */
    public static final C33476a f350533a = new C33476a("assistant.api.params.PrivacySettingsParams", C51491jr.f134160c);

    /* renamed from: b */
    public static final C32836cd f350534b;

    /* renamed from: c */
    private static final C59071e f350535c = C59071e.m91331h();

    /* renamed from: d */
    private final C38469m f350536d;

    /* renamed from: e */
    private final C71422aw f350537e;

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a = C69664n.m101061g(ccVar, "builder");
        a.mo38320c();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a2 = C69664n.m101061g(ajVar, "builder");
        a2.mo38300c("privacy_settings_params");
        a.mo38319b(a2.mo38298a());
        f350534b = a.mo38318a();
    }

    public C127278c(C38469m mVar, C71422aw awVar) {
        C69664n.m101061g(mVar, "gellerAccessor");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f350536d = mVar;
        this.f350537e = awVar;
    }

    /* renamed from: c */
    private final boolean m208204c(C58485gu guVar, C65806cj cjVar) {
        Boolean bool;
        Object obj;
        C65804ch chVar;
        Iterator it = guVar.iterator();
        while (true) {
            bool = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C65806cj a = C65806cj.m96809a(((C65798cb) obj).f178859d);
            if (a == null) {
                a = C65806cj.UNKNOWN_SETTING_TYPE;
            }
            if (a.equals(cjVar)) {
                break;
            }
        }
        C65798cb cbVar = (C65798cb) obj;
        if (cbVar != null) {
            if (cbVar.f178857b == 3) {
                chVar = (C65804ch) cbVar.f178858c;
            } else {
                chVar = C65804ch.f178869c;
            }
            if (chVar != null) {
                bool = Boolean.valueOf(chVar.f178872b);
            }
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: a */
    public final C60870cx mo107986a(C127289i iVar, C32810be beVar) {
        C69664n.m101061g(iVar, "queryContext");
        C69664n.m101061g(beVar, "request");
        return C71663i.m104692e(this.f350537e, (C71424ay) null, new C127276a(this, (C69577g) null), 3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.google.android.apps.search.assistant.surfaces.voice.d.c.y.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.google.android.apps.search.assistant.surfaces.voice.d.c.y.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: com.google.android.apps.search.assistant.surfaces.voice.d.c.y.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006d A[Catch:{ GellerException -> 0x0100 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00f8 A[Catch:{ GellerException -> 0x0100 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108009b(p5462h.p5466c.C69577g r11) {
        /*
            r10 = this;
            java.lang.String r0 = "_builder.build()"
            java.lang.String r1 = "builder"
            java.lang.String r2 = "newBuilder()"
            boolean r3 = r11 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9573y.C127277b
            if (r3 == 0) goto L_0x0019
            r3 = r11
            com.google.android.apps.search.assistant.surfaces.voice.d.c.y.b r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9573y.C127277b) r3
            int r4 = r3.f350532d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f350532d = r4
            goto L_0x001e
        L_0x0019:
            com.google.android.apps.search.assistant.surfaces.voice.d.c.y.b r3 = new com.google.android.apps.search.assistant.surfaces.voice.d.c.y.b
            r3.<init>(r10, r11)
        L_0x001e:
            java.lang.Object r11 = r3.f350530b
            h.c.a.a r4 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r5 = r3.f350532d
            r6 = 1
            if (r5 == 0) goto L_0x0037
            if (r5 != r6) goto L_0x002f
            java.lang.Object r3 = r3.f350529a
            p5462h.C69714l.m101134b(r11)     // Catch:{ GellerException -> 0x0100 }
            goto L_0x0058
        L_0x002f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0037:
            p5462h.C69714l.m101134b(r11)
            com.google.android.libraries.search.i.m r11 = r10.f350536d     // Catch:{ GellerException -> 0x0100 }
            com.google.protos.p.b.ak r5 = com.google.protos.p5129p.p5131b.C65753ak.PRIVACY_SETTINGS     // Catch:{ GellerException -> 0x0100 }
            com.google.protos.ap.a.a.ac r7 = com.google.protos.p4874ap.p4875a.p4876a.C63662ac.f172144a     // Catch:{ GellerException -> 0x0100 }
            com.google.protos.p.b.cb r8 = com.google.protos.p5129p.p5131b.C65798cb.f178854e     // Catch:{ GellerException -> 0x0100 }
            r9 = 0
            com.google.common.util.concurrent.cx r11 = r11.mo41431b(r5, r9, r7, r8)     // Catch:{ GellerException -> 0x0100 }
            java.lang.String r5 = "gellerAccessor\n         …ultInstance()\n          )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r5)     // Catch:{ GellerException -> 0x0100 }
            r3.f350529a = r10     // Catch:{ GellerException -> 0x0100 }
            r3.f350532d = r6     // Catch:{ GellerException -> 0x0100 }
            java.lang.Object r11 = kotlinx.coroutines.p5578d.C71663i.m104690c(r11, r3)     // Catch:{ GellerException -> 0x0100 }
            if (r11 != r4) goto L_0x0057
            return r4
        L_0x0057:
            r3 = r10
        L_0x0058:
            com.google.common.b.gu r11 = (com.google.common.p4522b.C58485gu) r11     // Catch:{ GellerException -> 0x0100 }
            r11.size()     // Catch:{ GellerException -> 0x0100 }
            java.lang.String r4 = "privacySettingsStates"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r4)     // Catch:{ GellerException -> 0x0100 }
            com.google.protos.p.b.cj r4 = com.google.protos.p5129p.p5131b.C65806cj.DASHER_POLICY     // Catch:{ GellerException -> 0x0100 }
            r5 = r3
            com.google.android.apps.search.assistant.surfaces.voice.d.c.y.c r5 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9573y.C127278c) r5     // Catch:{ GellerException -> 0x0100 }
            boolean r4 = r5.m208204c(r11, r4)     // Catch:{ GellerException -> 0x0100 }
            if (r4 == 0) goto L_0x00f8
            com.google.assistant.e.i.a.jr r4 = com.google.assistant.p3897e.p3917i.p3918a.C51491jr.f134160c     // Catch:{ GellerException -> 0x0100 }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ GellerException -> 0x0100 }
            com.google.assistant.e.i.a.jq r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51490jq) r4     // Catch:{ GellerException -> 0x0100 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r2)     // Catch:{ GellerException -> 0x0100 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r1)     // Catch:{ GellerException -> 0x0100 }
            com.google.assistant.e.i.a.jt r5 = com.google.assistant.p3897e.p3917i.p3918a.C51493jt.f134164e     // Catch:{ GellerException -> 0x0100 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ GellerException -> 0x0100 }
            com.google.assistant.e.i.a.js r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51492js) r5     // Catch:{ GellerException -> 0x0100 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)     // Catch:{ GellerException -> 0x0100 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r1)     // Catch:{ GellerException -> 0x0100 }
            com.google.protos.p.b.cj r1 = com.google.protos.p5129p.p5131b.C65806cj.SEARCH_AND_ASSISTANT_WORKSPACE     // Catch:{ GellerException -> 0x0100 }
            r2 = r3
            com.google.android.apps.search.assistant.surfaces.voice.d.c.y.c r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9573y.C127278c) r2     // Catch:{ GellerException -> 0x0100 }
            boolean r1 = r2.m208204c(r11, r1)     // Catch:{ GellerException -> 0x0100 }
            r5.copyOnWrite()     // Catch:{ GellerException -> 0x0100 }
            com.google.protobuf.bv r2 = r5.instance     // Catch:{ GellerException -> 0x0100 }
            com.google.assistant.e.i.a.jt r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51493jt) r2     // Catch:{ GellerException -> 0x0100 }
            int r7 = r2.f134166a     // Catch:{ GellerException -> 0x0100 }
            r7 = r7 | r6
            r2.f134166a = r7     // Catch:{ GellerException -> 0x0100 }
            r2.f134167b = r1     // Catch:{ GellerException -> 0x0100 }
            com.google.protos.p.b.cj r1 = com.google.protos.p5129p.p5131b.C65806cj.SEARCH_AND_ASSISTANT_WORKSPACE_PRIVATE_DEVICE     // Catch:{ GellerException -> 0x0100 }
            r2 = r3
            com.google.android.apps.search.assistant.surfaces.voice.d.c.y.c r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9573y.C127278c) r2     // Catch:{ GellerException -> 0x0100 }
            boolean r1 = r2.m208204c(r11, r1)     // Catch:{ GellerException -> 0x0100 }
            r5.copyOnWrite()     // Catch:{ GellerException -> 0x0100 }
            com.google.protobuf.bv r2 = r5.instance     // Catch:{ GellerException -> 0x0100 }
            com.google.assistant.e.i.a.jt r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51493jt) r2     // Catch:{ GellerException -> 0x0100 }
            int r7 = r2.f134166a     // Catch:{ GellerException -> 0x0100 }
            r7 = r7 | 2
            r2.f134166a = r7     // Catch:{ GellerException -> 0x0100 }
            r2.f134168c = r1     // Catch:{ GellerException -> 0x0100 }
            com.google.protos.p.b.cj r1 = com.google.protos.p5129p.p5131b.C65806cj.SEARCH_AND_ASSISTANT_WORKSPACE_ANY_DEVICE     // Catch:{ GellerException -> 0x0100 }
            com.google.android.apps.search.assistant.surfaces.voice.d.c.y.c r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9573y.C127278c) r3     // Catch:{ GellerException -> 0x0100 }
            boolean r11 = r3.m208204c(r11, r1)     // Catch:{ GellerException -> 0x0100 }
            r5.copyOnWrite()     // Catch:{ GellerException -> 0x0100 }
            com.google.protobuf.bv r1 = r5.instance     // Catch:{ GellerException -> 0x0100 }
            com.google.assistant.e.i.a.jt r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51493jt) r1     // Catch:{ GellerException -> 0x0100 }
            int r2 = r1.f134166a     // Catch:{ GellerException -> 0x0100 }
            r2 = r2 | 4
            r1.f134166a = r2     // Catch:{ GellerException -> 0x0100 }
            r1.f134169d = r11     // Catch:{ GellerException -> 0x0100 }
            com.google.protobuf.bv r11 = r5.build()     // Catch:{ GellerException -> 0x0100 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r0)     // Catch:{ GellerException -> 0x0100 }
            com.google.assistant.e.i.a.jt r11 = (com.google.assistant.p3897e.p3917i.p3918a.C51493jt) r11     // Catch:{ GellerException -> 0x0100 }
            java.lang.String r1 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r1)     // Catch:{ GellerException -> 0x0100 }
            r4.copyOnWrite()     // Catch:{ GellerException -> 0x0100 }
            com.google.protobuf.bv r1 = r4.instance     // Catch:{ GellerException -> 0x0100 }
            com.google.assistant.e.i.a.jr r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51491jr) r1     // Catch:{ GellerException -> 0x0100 }
            r11.getClass()     // Catch:{ GellerException -> 0x0100 }
            r1.f134163b = r11     // Catch:{ GellerException -> 0x0100 }
            int r11 = r1.f134162a     // Catch:{ GellerException -> 0x0100 }
            r11 = r11 | r6
            r1.f134162a = r11     // Catch:{ GellerException -> 0x0100 }
            com.google.protobuf.bv r11 = r4.build()     // Catch:{ GellerException -> 0x0100 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r0)     // Catch:{ GellerException -> 0x0100 }
            com.google.assistant.e.i.a.jr r11 = (com.google.assistant.p3897e.p3917i.p3918a.C51491jr) r11     // Catch:{ GellerException -> 0x0100 }
            goto L_0x00ff
        L_0x00f8:
            com.google.assistant.e.i.a.jr r11 = com.google.assistant.p3897e.p3917i.p3918a.C51491jr.f134160c     // Catch:{ GellerException -> 0x0100 }
            java.lang.String r0 = "{\n        PrivacySetting…DefaultInstance()\n      }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r0)     // Catch:{ GellerException -> 0x0100 }
        L_0x00ff:
            return r11
        L_0x0100:
            r11 = move-exception
            com.google.net.a.a.b r0 = r11.f60397a
            com.google.net.a.a.b r1 = com.google.net.p4726a.p4727a.C62722b.INVALID_ARGUMENT
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0124
            com.google.common.f.e r11 = f350535c
            com.google.common.f.x r11 = r11.mo56224b()
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 37279(0x919f, float:5.2239E-41)
            r0.<init>(r1)
            r11.mo56379ah(r0)
            java.lang.String r0 = "Account invalid, skip checking privacy settings"
            r11.mo56386p(r0)
            goto L_0x0142
        L_0x0124:
            com.google.common.f.e r0 = f350535c
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.x r11 = r0.mo56382g(r11)
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 37278(0x919e, float:5.2238E-41)
            r0.<init>(r1)
            r11.mo56379ah(r0)
            java.lang.String r0 = "GellerException while checking privacy settings"
            r11.mo56386p(r0)
        L_0x0142:
            com.google.assistant.e.i.a.jr r11 = com.google.assistant.p3897e.p3917i.p3918a.C51491jr.f134160c
            java.lang.String r0 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9573y.C127278c.mo108009b(h.c.g):java.lang.Object");
    }
}
