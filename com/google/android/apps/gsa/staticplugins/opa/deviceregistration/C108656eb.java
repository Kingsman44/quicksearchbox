package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.util.JsonWriter;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89018ap;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C50121li;
import com.google.assistant.p3861at.C50242pv;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60321oe;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.io.StringWriter;
import java.net.InetAddress;
import java.net.URL;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.eb */
/* compiled from: PG */
final class C108656eb extends C84036z {

    /* renamed from: a */
    final /* synthetic */ C108660ef f302208a;

    /* renamed from: b */
    private final C60870cx f302209b;

    public C108656eb(C108660ef efVar, C60870cx cxVar) {
        this.f302208a = efVar;
        this.f302209b = cxVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        if (!this.f302209b.isDone() || this.f302209b.isCancelled()) {
            ((C59052c) ((C59052c) C108660ef.f302215a.mo56225c()).mo56372aa(24189)).mo56386p("Send link request fails. Show error screen.");
            this.f302208a.f302222h = 4;
            return C58485gu.m89846n(C83875ai.m133537b(new C108634dg()));
        }
        try {
            C50242pv pvVar = (C50242pv) C90877ak.m148472f(this.f302209b);
            C108660ef efVar = this.f302208a;
            C108741i iVar = efVar.f302216b.f302004l;
            iVar.getClass();
            C108735h a = iVar.mo97098a();
            a.mo97090b(pvVar.f130648e);
            C49875cf a2 = C49875cf.m85755a(pvVar.f130649f);
            if (a2 == null) {
                a2 = C49875cf.UNKNOWN;
            }
            a.mo97091c(a2);
            a.mo97092d(pvVar.f130650g);
            C108741i a3 = a.mo97089a();
            C108556ar arVar = efVar.f302216b;
            C50121li liVar = arVar.f302006n;
            arVar.f302004l = a3;
            if ((pvVar.f130644a & 4) != 0) {
                C108741i iVar2 = this.f302208a.f302216b.f302004l;
                iVar2.getClass();
                if (!iVar2.mo97113q()) {
                    C89949q.m146525j(C108607cg.m180627a(13), (C60321oe) null, (C63196b) null, (String) null);
                    this.f302208a.f302221g.mo97061e();
                    return C58485gu.m89845m();
                }
                InetAddress p = iVar2.mo97112p();
                p.getClass();
                String j = C108741i.m180855j(p);
                if (j == null) {
                    C59052c cVar = (C59052c) ((C59052c) C108660ef.f302215a.mo56225c()).mo56372aa(24193);
                    InetAddress p2 = iVar2.mo97112p();
                    p2.getClass();
                    cVar.mo56389s("Failed to get hostname for IP address: %s", p2.getHostAddress());
                    this.f302208a.f302222h = 4;
                    return C58485gu.m89846n(C83875ai.m133537b(new C108634dg()));
                }
                C89356b b = this.f302208a.f302223i.mo78026b("DeviceSetupRequestHelper", C118575h.GRAPH_NETWORK_REQUEST, C118575h.LEGACY_HTTP);
                C108660ef efVar2 = this.f302208a;
                Integer c = iVar2.mo97100c();
                c.getClass();
                int intValue = c.intValue();
                String o = iVar2.mo97111o();
                o.getClass();
                URL url = new URL("http", j, intValue, o);
                C89019aq d = C89020ar.m144759d();
                d.f241236b = url;
                d.f241245k = 30;
                d.mo82990b("Content-Type", "application/json");
                C89020ar a4 = d.mo82989a();
                StringWriter stringWriter = new StringWriter();
                JsonWriter jsonWriter = new JsonWriter(stringWriter);
                jsonWriter.beginObject();
                jsonWriter.name("command").value("action.device.command.AUTH_CODE_DELIVERY");
                jsonWriter.name("authCode").value(pvVar.f130647d);
                jsonWriter.name("successScreenOut");
                jsonWriter.beginObject();
                jsonWriter.name("type").value("HTML");
                jsonWriter.name("data").value(pvVar.f130651h);
                jsonWriter.endObject();
                jsonWriter.name("failureScreenOut");
                jsonWriter.beginObject();
                jsonWriter.name("type").value("HTML");
                jsonWriter.name("data").value(pvVar.f130652i);
                jsonWriter.endObject();
                jsonWriter.endObject();
                C60870cx a5 = this.f302208a.f302219e.mo80852a(b, C89066v.f241382a, new C89018ap(a4, C89009ag.m144715a(ByteBuffer.wrap(stringWriter.toString().getBytes()), efVar2.f302220f)));
                return C58485gu.m89847o(this.f302208a.f302218d.mo77487a(a5, C108655ea.f302207a), new C108658ed(this.f302208a, a5, pvVar.f130648e));
            }
            ((C59052c) ((C59052c) C108660ef.f302215a.mo56226d()).mo56372aa(24194)).mo56389s("No oauth code in LinkAssistantDeviceUiResponse: %s", pvVar.f130645b);
            this.f302208a.f302222h = 4;
            return C58485gu.m89846n(C83875ai.m133537b(new C108634dg()));
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) C108660ef.f302215a.mo56225c()).mo56382g(e)).mo56372aa(24192)).mo56386p("Get link response fails. Show error screen.");
            this.f302208a.f302222h = 4;
            return C58485gu.m89846n(C83875ai.m133537b(new C108634dg()));
        }
    }
}
