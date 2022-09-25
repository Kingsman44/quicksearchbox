package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.util.JsonWriter;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89018ap;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.assistant.p3861at.C50245py;
import com.google.assistant.p3861at.C50246pz;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;
import java.io.StringWriter;
import java.net.InetAddress;
import java.net.URL;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.bh */
/* compiled from: PG */
final class C108576bh extends C84036z {

    /* renamed from: a */
    final /* synthetic */ C108578bj f302027a;

    /* renamed from: b */
    private final C108741i f302028b;

    /* renamed from: c */
    private final C60870cx f302029c;

    public C108576bh(C108578bj bjVar, C108741i iVar, C60870cx cxVar) {
        this.f302027a = bjVar;
        this.f302028b = iVar;
        this.f302029c = cxVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        if (!this.f302029c.isDone() || (((C60873d) this.f302029c).value instanceof C60873d.C60875b)) {
            C59104x c = C108578bj.f302033a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DeviceDiscoverySeq");
            ((C59052c) ((C59052c) c).mo56372aa(24131)).mo56386p("Send link request fails. Show error screen.");
            this.f302027a.f302045m = 6;
            return C58485gu.m89846n(C83875ai.m133537b(new C108634dg()));
        }
        try {
            C50246pz pzVar = (C50246pz) ((C58833ax) C90877ak.m148472f(this.f302029c)).mo56107c();
            C50245py a = C50245py.m85795a(pzVar.f130662a);
            if (a == null) {
                a = C50245py.NO_ERROR;
            }
            if (a != C50245py.NO_ERROR) {
                C59104x c2 = C108578bj.f302033a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "DeviceDiscoverySeq");
                C59052c cVar = (C59052c) ((C59052c) c2).mo56372aa(24134);
                C50245py a2 = C50245py.m85795a(pzVar.f130662a);
                if (a2 == null) {
                    a2 = C50245py.NO_ERROR;
                }
                cVar.mo56389s("LinkDeviceConfirmationUi error: %s", a2);
                this.f302027a.f302045m = 6;
                return C58485gu.m89846n(C83875ai.m133537b(new C108634dg()));
            }
            InetAddress p = this.f302028b.mo97112p();
            p.getClass();
            String j = C108741i.m180855j(p);
            if (j == null) {
                C59104x c3 = C108578bj.f302033a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "DeviceDiscoverySeq");
                C59052c cVar2 = (C59052c) ((C59052c) c3).mo56372aa(24133);
                InetAddress p2 = this.f302028b.mo97112p();
                p2.getClass();
                cVar2.mo56389s("Failed to get hostname for IP address: %s", p2.getHostAddress());
                this.f302027a.f302045m = 6;
                return C58485gu.m89846n(C83875ai.m133537b(new C108634dg()));
            }
            C89356b a3 = this.f302027a.f302046n.mo78025a("DeviceSetupRequestHelper", 131, 200);
            C108578bj bjVar = this.f302027a;
            C108741i iVar = this.f302028b;
            Integer c4 = iVar.mo97100c();
            c4.getClass();
            int intValue = c4.intValue();
            String o = iVar.mo97111o();
            o.getClass();
            URL url = new URL("http", j, intValue, o);
            C58976aa aaVar = C58975e.f156826a;
            C89019aq d = C89020ar.m144759d();
            d.f241236b = url;
            d.f241245k = 30;
            d.mo82990b("Content-Type", "application/json");
            C89020ar a4 = d.mo82989a();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginObject();
            jsonWriter.name("command").value("action.device.command.VERIFY");
            jsonWriter.name("screenOut");
            jsonWriter.beginObject();
            jsonWriter.name("type").value("HTML");
            jsonWriter.name("data").value(pzVar.f130663b);
            jsonWriter.endObject();
            jsonWriter.endObject();
            C60870cx a5 = this.f302027a.f302040h.mo80852a(a3, C89066v.f241382a, new C89018ap(a4, C89009ag.m144715a(ByteBuffer.wrap(stringWriter.toString().getBytes()), bjVar.f302041i)));
            return C58485gu.m89847o(this.f302027a.f302038f.mo77487a(a5, C108575bg.f302026a), new C108577bi(this.f302027a, pzVar, a5));
        } catch (Exception e) {
            C59104x c5 = C108578bj.f302033a.mo56225c();
            c5.mo56378ag(C58975e.f156826a, "DeviceDiscoverySeq");
            ((C59052c) ((C59052c) c5).mo56372aa(24132)).mo56389s("SendConfirmationToOemDeviceSequence exception: %s", e.getMessage());
            this.f302027a.f302045m = 6;
            return C58485gu.m89846n(C83875ai.m133537b(new C108634dg()));
        }
    }
}
