package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.assistant.p1528m.p1529a.C18421f;
import com.google.android.libraries.assistant.p1528m.p1529a.C18425j;
import com.google.android.libraries.assistant.p1528m.p1530b.C18432a;
import com.google.android.libraries.assistant.p1528m.p1530b.C18433b;
import com.google.assistant.p3745ab.p3746a.C48178b;
import com.google.assistant.p3745ab.p3746a.C48179c;
import com.google.assistant.p3745ab.p3746a.C48180d;
import com.google.assistant.p3745ab.p3746a.C48184h;
import com.google.assistant.p3745ab.p3746a.C48194r;
import com.google.assistant.p3814ai.p3815a.p3816a.C49170d;
import com.google.assistant.p3814ai.p3815a.p3816a.C49183q;
import com.google.assistant.p3814ai.p3815a.p3816a.C49187u;
import com.google.assistant.p3814ai.p3815a.p3816a.C49188v;
import com.google.assistant.p3897e.p3921j.ams;
import com.google.assistant.p3897e.p3921j.p3926e.C51842bc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.p386ak.C8402r;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.av */
/* compiled from: PG */
public final class C106023av implements C18421f {

    /* renamed from: a */
    final /* synthetic */ C106025ax f295980a;

    public C106023av(C106025ax axVar) {
        this.f295980a = axVar;
    }

    /* renamed from: a */
    public final void mo23925a(boolean z, String str) {
        if (z) {
            this.f295980a.f296017o.clear();
            this.f295980a.f296018p.clear();
        } else if (!this.f295980a.f296017o.containsKey(str)) {
            C59104x d = C106025ax.f295983a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ImmersiveCanvasCtrlr");
            ((C59052c) ((C59052c) d).mo56372aa(24658)).mo56389s("%s is not expected.", str);
            return;
        } else {
            this.f295980a.f296017o.remove(str);
            this.f295980a.f296018p.remove(str);
        }
        this.f295980a.mo95217G();
    }

    /* renamed from: c */
    public final void mo23927c(String str) {
        this.f295980a.f296012j.mo28212l("exitApp", new C106012ak(this, str));
    }

    /* renamed from: d */
    public final void mo23928d() {
        this.f295980a.f296012j.mo28212l("exitContinuousMatchMode", new C106007af(this));
    }

    /* renamed from: e */
    public final void mo23929e(String str) {
        this.f295980a.f296012j.mo28212l("expectIntent", new C106022au(this, str));
    }

    /* renamed from: f */
    public final void mo23930f(String str) {
        C59104x b = C106025ax.f295983a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ImmersiveCanvasCtrlr");
        ((C59052c) ((C59052c) b).mo56372aa(24660)).mo56389s("Get user parameter for paramKey '%s'", str);
        this.f295980a.f296012j.mo28212l("getUserParam", new C106011aj(this, str));
    }

    /* renamed from: g */
    public final void mo23931g(C18425j jVar) {
        int i;
        if (this.f295980a.f296013k.mo79746e(C90014bt.f247399gS)) {
            C51842bc bcVar = this.f295980a.f296024v;
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 1352;
            C48179c cVar = (C48179c) C48194r.f124712g.createBuilder();
            C48178b a = C18432a.m35904a(bcVar);
            cVar.copyOnWrite();
            C48194r rVar = (C48194r) cVar.instance;
            a.getClass();
            rVar.f124715b = a;
            rVar.f124714a |= 1;
            C48180d dVar = (C48180d) C48184h.f124677d.createBuilder();
            C18425j jVar2 = C18425j.URL_LOAD_FAILURE;
            int ordinal = jVar.ordinal();
            if (ordinal == 0) {
                i = 5;
            } else if (ordinal == 1) {
                i = 6;
            } else if (ordinal == 2) {
                i = 7;
            } else {
                throw new AssertionError(jVar);
            }
            dVar.copyOnWrite();
            C48184h hVar = (C48184h) dVar.instance;
            hVar.f124680b = i - 1;
            hVar.f124679a |= 1;
            C48184h hVar2 = (C48184h) dVar.build();
            cVar.copyOnWrite();
            C48194r rVar2 = (C48194r) cVar.instance;
            hVar2.getClass();
            rVar2.f124716c = hVar2;
            rVar2.f124714a |= 2;
            C48194r rVar3 = (C48194r) cVar.build();
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            rVar3.getClass();
            ufVar2.f164235cm = rVar3;
            ufVar2.f164255j |= 8;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
    }

    /* renamed from: h */
    public final void mo23932h(String str, String str2, int i, int i2) {
        if (this.f295980a.f296013k.mo79746e(C90014bt.f247399gS)) {
            C106025ax axVar = this.f295980a;
            C106030bb bbVar = axVar.f296015m;
            C51842bc bcVar = axVar.f296024v;
            C18433b bVar = bbVar.f296037c;
            C106026ay ayVar = new C106026ay(bcVar, str, str2, i, i2);
            long j = bVar.f52324b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (j == -1 || elapsedRealtime - bVar.f52324b >= ((long) bVar.f52323a)) {
                ayVar.run();
                bVar.f52324b = elapsedRealtime;
            }
        }
    }

    /* renamed from: i */
    public final void mo23933i(String str) {
        this.f295980a.f296012j.mo28212l("onStateUpdate", new C106013al(this, str));
    }

    /* renamed from: j */
    public final void mo23934j(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(268435456);
        this.f295980a.f296010h.startActivity(intent);
    }

    /* renamed from: k */
    public final void mo23935k(String str, String str2, boolean z) {
        if (!this.f295980a.f295988E && !str.isEmpty() && str2 != null && !str2.trim().isEmpty()) {
            this.f295980a.f296012j.mo28212l("outputTts", new C106008ag(this, str, z, str2));
        }
    }

    /* renamed from: l */
    public final void mo23936l() {
        this.f295980a.f296019q.clear();
        this.f295980a.mo95217G();
    }

    /* renamed from: m */
    public final void mo23937m(String str) {
        C106025ax axVar = this.f295980a;
        if (!axVar.f295987D) {
            axVar.f296012j.mo28212l("resetUserParam", new C106020as(this, str));
        }
    }

    /* renamed from: n */
    public final void mo23938n(String str) {
        this.f295980a.f296012j.mo28212l("sendTextQuery", new C106009ah(this, str));
    }

    /* renamed from: o */
    public final void mo23939o(String str) {
        C49183q qVar;
        C49183q qVar2;
        C49183q qVar3;
        try {
            C49187u uVar = (C49187u) this.f295980a.f296016n.mo17146d(str, C49187u.class);
            int b = C49188v.m85386b(uVar.f127178d);
            if (b == 0) {
                b = 1;
            }
            if (b == 3 || b == 4) {
                C106025ax axVar = this.f295980a;
                String str2 = uVar.f127177c;
                if (axVar.f296019q.size() + (true ^ axVar.f296019q.containsKey(str2) ? 1 : 0) <= 50) {
                    if (uVar.f127175a == 3) {
                        qVar = (C49183q) uVar.f127176b;
                    } else {
                        qVar = C49183q.f127167b;
                    }
                    int size = qVar.f127169a.size();
                    for (Map.Entry entry : axVar.f296019q.entrySet()) {
                        if (!((String) entry.getKey()).equals(str2)) {
                            C49187u uVar2 = (C49187u) entry.getValue();
                            if (uVar2.f127175a == 3) {
                                qVar3 = (C49183q) uVar2.f127176b;
                            } else {
                                qVar3 = C49183q.f127167b;
                            }
                            size += qVar3.f127169a.size();
                        }
                    }
                    if (size <= 1000) {
                        if (uVar.f127175a == 3) {
                            qVar2 = (C49183q) uVar.f127176b;
                        } else {
                            qVar2 = C49183q.f127167b;
                        }
                        for (C49170d dVar : qVar2.f127169a) {
                            if (dVar.f127146b.size() > 20) {
                                C59104x d = C106025ax.f295983a.mo56226d();
                                d.mo56378ag(C58975e.f156826a, "ImmersiveCanvasCtrlr");
                                ((C59052c) ((C59052c) d).mo56372aa(24694)).mo56387q("Exceeds limit: At most %d synonyms per entry can be overridden.", 20);
                                return;
                            }
                        }
                        this.f295980a.f296019q.put(uVar.f127177c, uVar);
                        this.f295980a.mo95217G();
                        return;
                    }
                    C59104x d2 = C106025ax.f295983a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "ImmersiveCanvasCtrlr");
                    ((C59052c) ((C59052c) d2).mo56372aa(24695)).mo56387q("Exceeds limit: At most %d entries in total can be overridden.", 1000);
                    return;
                }
                C59104x d3 = C106025ax.f295983a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "ImmersiveCanvasCtrlr");
                ((C59052c) ((C59052c) d3).mo56372aa(24696)).mo56387q("Exceeds limit: At most %d types can be overridden.", 50);
                return;
            }
            C59104x d4 = C106025ax.f295983a.mo56226d();
            d4.mo56378ag(C58975e.f156826a, "ImmersiveCanvasCtrlr");
            ((C59052c) ((C59052c) d4).mo56372aa(24662)).mo56386p("Type override mode is unspecified or unexpected.");
        } catch (C8402r e) {
            C59104x c = C106025ax.f295983a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ImmersiveCanvasCtrlr");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(24663)).mo56386p("Failed to deserialize TypeOverrideMessage from json to proto.");
        }
    }

    /* renamed from: p */
    public final void mo23940p(String str, String str2, String str3) {
        C59104x b = C106025ax.f295983a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ImmersiveCanvasCtrlr");
        ((C59052c) ((C59052c) b).mo56372aa(24664)).mo56354G("Set user parameter for paramKey '%s' and paramValue '%s'", str2, str3);
        this.f295980a.f296012j.mo28212l("setUserParam", new C106018aq(this, str, str2, str3));
    }

    /* renamed from: q */
    public final void mo23941q() {
        C106025ax axVar = this.f295980a;
        if (!axVar.f295988E) {
            axVar.f296012j.mo28212l("startMediaSession", new C106019ar(this));
        }
    }

    /* renamed from: r */
    public final void mo23942r() {
        this.f295980a.f296012j.mo28212l("stopMediaSession", new C106016ao(this));
    }

    /* renamed from: s */
    public final void mo23943s() {
        C106025ax axVar = this.f295980a;
        axVar.f296012j.mo28212l("stopTts", new C106021at(axVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23944t(java.lang.String r6) {
        /*
            r5 = this;
            com.google.android.apps.gsa.staticplugins.opa.ac.ax r0 = r5.f295980a
            com.google.android.apps.gsa.search.core.i.t r0 = r0.f296013k
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90041ct.f248689b
            boolean r0 = r0.mo79746e(r1)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            com.google.android.apps.gsa.staticplugins.opa.ac.ax r0 = r5.f295980a
            r0.mo95214D()
            com.google.android.apps.gsa.staticplugins.opa.ac.ax r0 = r5.f295980a
            com.google.android.apps.gsa.search.core.i.t r0 = r0.f296013k
            com.google.android.apps.gsa.shared.m.h r1 = com.google.android.apps.gsa.shared.p7066m.C90041ct.f248699l
            com.google.common.b.gu r0 = r0.mo79750p(r1)
            com.google.android.apps.gsa.staticplugins.opa.ac.ax r1 = r5.f295980a
            com.google.assistant.e.j.e.bc r1 = r1.f296024v
            int r2 = r1.f136000a
            r3 = 1
            r2 = r2 & r3
            if (r2 == 0) goto L_0x00cd
            long r1 = r1.f136001b
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0034
            goto L_0x00cd
        L_0x0034:
            com.google.android.apps.gsa.staticplugins.opa.ac.ax r0 = r5.f295980a
            com.google.android.apps.gsa.staticplugins.opa.chatui.ax r1 = r0.f295986C
            java.lang.String r2 = "ImmersiveCanvasCtrlr"
            if (r1 != 0) goto L_0x004f
            com.google.common.f.e r6 = com.google.android.apps.gsa.staticplugins.opa.p8179ac.C106025ax.f295983a
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r0, r2)
            java.lang.String r0 = "Cannot toggle client wake lock because chatUiCallback is null"
            r1 = 24666(0x605a, float:3.4564E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x004f:
            int r1 = r6.hashCode()
            r4 = -446239562(0xffffffffe566ecb6, float:-6.8156927E22)
            if (r1 == r4) goto L_0x0068
            r4 = 1808577511(0x6bccb3e7, float:4.9494086E26)
            if (r1 == r4) goto L_0x005e
            goto L_0x0072
        L_0x005e:
            java.lang.String r1 = "RELEASE"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0072
            r1 = 1
            goto L_0x0073
        L_0x0068:
            java.lang.String r1 = "ACQUIRE"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0072
            r1 = 0
            goto L_0x0073
        L_0x0072:
            r1 = -1
        L_0x0073:
            if (r1 == 0) goto L_0x00ac
            if (r1 == r3) goto L_0x008a
            com.google.common.f.e r6 = com.google.android.apps.gsa.staticplugins.opa.p8179ac.C106025ax.f295983a
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r0, r2)
            java.lang.String r0 = "Unknown CanvasWakeLock action."
            r1 = 24665(0x6059, float:3.4563E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x008a:
            com.google.android.libraries.gsa.k.g r0 = r0.f296012j
            com.google.android.apps.gsa.staticplugins.opa.ac.an r1 = new com.google.android.apps.gsa.staticplugins.opa.ac.an
            r1.<init>(r5)
            java.lang.String r2 = "release canvas wake lock"
            r0.mo28212l(r2, r1)
            com.google.android.apps.gsa.staticplugins.opa.ac.ax r0 = r5.f295980a
            com.google.android.apps.gsa.search.core.i.t r0 = r0.f296013k
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90041ct.f248690c
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x00cd
            com.google.android.apps.gsa.staticplugins.opa.ac.ax r0 = r5.f295980a
            com.google.android.apps.gsa.staticplugins.opa.ac.bb r1 = r0.f296015m
            com.google.assistant.e.j.e.bc r0 = r0.f296024v
            r1.mo95247a(r0, r6)
            return
        L_0x00ac:
            com.google.android.libraries.gsa.k.g r0 = r0.f296012j
            com.google.android.apps.gsa.staticplugins.opa.ac.am r1 = new com.google.android.apps.gsa.staticplugins.opa.ac.am
            r1.<init>(r5)
            java.lang.String r2 = "acquire canvas wake lock"
            r0.mo28212l(r2, r1)
            com.google.android.apps.gsa.staticplugins.opa.ac.ax r0 = r5.f295980a
            com.google.android.apps.gsa.search.core.i.t r0 = r0.f296013k
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90041ct.f248690c
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x00cd
            com.google.android.apps.gsa.staticplugins.opa.ac.ax r0 = r5.f295980a
            com.google.android.apps.gsa.staticplugins.opa.ac.bb r1 = r0.f296015m
            com.google.assistant.e.j.e.bc r0 = r0.f296024v
            r1.mo95247a(r0, r6)
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8179ac.C106023av.mo23944t(java.lang.String):void");
    }

    /* renamed from: u */
    public final void mo23945u(String str) {
        C59104x b = C106025ax.f295983a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ImmersiveCanvasCtrlr");
        ((C59052c) ((C59052c) b).mo56372aa(24667)).mo56389s("Triggering scene: %s", str);
        this.f295980a.f296012j.mo28212l("triggerScene", new C106010ai(this, str));
    }

    /* renamed from: b */
    public final void mo23926b(String[] strArr, int i, boolean z) {
        strArr.getClass();
        ArrayList arrayList = new ArrayList();
        try {
            for (String d : strArr) {
                arrayList.add((ams) this.f295980a.f296016n.mo17146d(d, ams.class));
            }
            this.f295980a.f296012j.mo28212l("continuousMatchMode", new C106017ap(this, arrayList, i, z));
        } catch (C8402r e) {
            C59104x c = C106025ax.f295983a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ImmersiveCanvasCtrlr");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(24659)).mo56386p("Failed to parse expected phrases in enter continuous match mode");
        }
    }
}
