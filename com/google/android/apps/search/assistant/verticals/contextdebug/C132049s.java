package com.google.android.apps.search.assistant.verticals.contextdebug;

import android.util.Base64;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.assistant.p2566g.C33406aa;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.monitoring.feedback.C47465c;
import com.google.apps.tiktok.monitoring.feedback.C47474k;
import com.google.apps.tiktok.monitoring.feedback.C47475l;
import com.google.apps.tiktok.monitoring.feedback.C47477n;
import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50534b;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50536d;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50544l;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50547o;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50548p;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50552t;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50553u;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50555w;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50556x;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63088z;
import org.json.JSONException;
import org.json.JSONObject;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.contextdebug.s */
/* compiled from: PG */
public final /* synthetic */ class C132049s implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ C132052v f360418a;

    public /* synthetic */ C132049s(C132052v vVar) {
        this.f360418a = vVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        Optional optional;
        C60870cx cxVar;
        C132052v vVar = this.f360418a;
        ((C59052c) ((C59052c) C132052v.f360422a.mo56224b()).mo56372aa(39507)).mo56389s("Got message: %s", jSONObject);
        try {
            optional = Optional.m71637of(jSONObject.getString("request"));
        } catch (JSONException unused) {
            ((C59052c) ((C59052c) C132052v.f360422a.mo56224b()).mo56372aa(39506)).mo56386p("No request in data");
            optional = Optional.empty();
        }
        Optional flatMap = optional.flatMap(C132047q.f360416a);
        if (flatMap.isEmpty()) {
            C50548p pVar = (C50548p) C50556x.f131574g.createBuilder();
            pVar.copyOnWrite();
            C50556x xVar = (C50556x) pVar.instance;
            xVar.f131580e = 1;
            xVar.f131576a |= 8;
            C46459k.m82829b(C132052v.m214503b(oVar, (C50556x) pVar.build()), "Error sending data to WebX", new Object[0]);
            return;
        }
        C50547o oVar2 = (C50547o) flatMap.get();
        if ((oVar2.f131556a & 1) != 0) {
            String str = oVar2.f131559d;
            C50544l lVar = oVar2.f131557b;
            if (lVar == null) {
                lVar = C50544l.f131546d;
            }
            vVar.f360435n = oVar;
            C132040j jVar = vVar.f360430i;
            if (!jVar.f360405e) {
                cxVar = C60856cj.m92900i(C33406aa.f89467c);
            } else {
                cxVar = C60922j.m93045h(jVar.f360404d.mo50246c(jVar.f360402b), C47810es.m84966f(new C132039i(jVar, lVar)), jVar.f360401a);
            }
            C46459k.m82829b(C60922j.m93045h(cxVar, C47810es.m84966f(new C132044n(vVar, lVar, str)), vVar.f360431j), "Error sending DebugData", new Object[0]);
            ((C19567d) vVar.f360434m.f103041m.mo6453a()).mo24822a(1, new Object[0]);
        }
        if ((oVar2.f131556a & 2) != 0) {
            String str2 = oVar2.f131559d;
            C50536d dVar = oVar2.f131558c;
            if (dVar == null) {
                dVar = C50536d.f131526e;
            }
            C47477n nVar = vVar.f360427f.f360406a;
            C47474k g = C47475l.m84477g();
            g.mo51309c((dVar.f131528a & 2) != 0 ? dVar.f131531d : "com.google.android.googlequicksearchbox.CONTEXT_DEBUG_FEEDBACK");
            g.mo51310d(false);
            ((C47465c) g).f123250b = C58833ax.m90834k(dVar.f131530c);
            for (C50534b bVar : dVar.f131529b) {
                if (!bVar.f131524a.isEmpty()) {
                    String encodeToString = Base64.encodeToString(bVar.toByteArray(), 0);
                    String str3 = bVar.f131524a;
                    C46663a aVar = new C46663a();
                    aVar.mo50686d(C46667e.TEXT);
                    aVar.f121916a = C63088z.m96143E(encodeToString);
                    aVar.mo50684b(true);
                    g.mo51333f(str3, aVar.mo50683a());
                }
            }
            nVar.mo51336a(g.mo51332e());
            C50548p pVar2 = (C50548p) C50556x.f131574g.createBuilder();
            C50555w wVar = C50555w.f131572a;
            pVar2.copyOnWrite();
            C50556x xVar2 = (C50556x) pVar2.instance;
            wVar.getClass();
            xVar2.f131578c = wVar;
            xVar2.f131576a |= 2;
            pVar2.copyOnWrite();
            C50556x xVar3 = (C50556x) pVar2.instance;
            str2.getClass();
            xVar3.f131576a |= 16;
            xVar3.f131581f = str2;
            C46459k.m82829b(C132052v.m214503b(oVar, (C50556x) pVar2.build()), "Error sending message to the sender", new Object[0]);
        }
        if ((oVar2.f131556a & 4) != 0) {
            String str4 = oVar2.f131559d;
            C50548p pVar3 = (C50548p) C50556x.f131574g.createBuilder();
            C50552t tVar = (C50552t) C50553u.f131568c.createBuilder();
            boolean z = vVar.f360425d;
            tVar.copyOnWrite();
            C50553u uVar = (C50553u) tVar.instance;
            uVar.f131570a = 1 | uVar.f131570a;
            uVar.f131571b = z;
            pVar3.copyOnWrite();
            C50556x xVar4 = (C50556x) pVar3.instance;
            C50553u uVar2 = (C50553u) tVar.build();
            uVar2.getClass();
            xVar4.f131579d = uVar2;
            xVar4.f131576a |= 4;
            pVar3.copyOnWrite();
            C50556x xVar5 = (C50556x) pVar3.instance;
            str4.getClass();
            xVar5.f131576a |= 16;
            xVar5.f131581f = str4;
            C46459k.m82829b(C132052v.m214503b(oVar, (C50556x) pVar3.build()), "Error sending message to the sender", new Object[0]);
        }
    }
}
