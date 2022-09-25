package com.google.android.apps.gsa.projection;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.apps.gsa.binaries.satin.app.C74199om;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.projection.p6477a.C84184a;
import com.google.android.apps.gsa.projection.p6478b.C84186a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.assistant.auto.jumpboost.C11446b;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.C11628d;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p681d.C11636b;
import com.google.android.libraries.assistant.auto.jumpboost.p649a.p656f.p657a.C11439a;
import com.google.android.libraries.assistant.auto.jumpboost.p701k.C11830a;
import com.google.android.libraries.assistant.auto.tng.common.p918h.C13265a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.storage.p3304a.p3312f.C42789m;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59326i;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import p5460g.p5461a.C69464a;

/* compiled from: PG */
public class CarAssistantService extends C84193e {

    /* renamed from: a */
    public static final C59071e f229136a = C59071e.m91332i("com.google.android.apps.gsa.projection.CarAssistantService");

    /* renamed from: q */
    private static final C58495hd f229137q = C58495hd.m89902p("--help", "help menu", "--taskgraph", "dump the taskgraph timing data", "<no flags>", "dump all available data");

    /* renamed from: b */
    public Context f229138b;

    /* renamed from: c */
    public C22871g f229139c;

    /* renamed from: d */
    public C84188c f229140d;

    /* renamed from: e */
    public C84184a f229141e;

    /* renamed from: f */
    public C118561t f229142f;

    /* renamed from: g */
    public C11628d f229143g;

    /* renamed from: h */
    public C11636b f229144h;

    /* renamed from: i */
    public C11830a f229145i;

    /* renamed from: j */
    public C13265a f229146j;

    /* renamed from: k */
    public C69464a f229147k;

    /* renamed from: l */
    public C69464a f229148l;

    /* renamed from: m */
    public C69464a f229149m;

    /* renamed from: n */
    public C84186a f229150n;

    /* renamed from: o */
    public C74199om f229151o;

    /* renamed from: p */
    public C11439a f229152p;

    /* renamed from: r */
    private final C84185b f229153r = new C84185b(this);

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C11446b bVar;
        C58528ij H = C58528ij.m90008H(strArr);
        if (H.contains("--help")) {
            C58800sl lA = f229137q.keySet().iterator();
            while (lA.hasNext()) {
                String str = (String) lA.next();
                printWriter.write(str + " : " + ((String) f229137q.get(str)) + "\n");
            }
        } else if (H.contains("--taskgraph") || H.isEmpty()) {
            this.f229146j.mo21002a(printWriter);
            try {
                C11636b bVar2 = this.f229144h;
                try {
                    bVar = (C11446b) bVar2.f37593c.mo45889c(bVar2.f37592b, new C42789m(C11446b.f37230b.getParserForType()));
                } catch (IOException e) {
                    ((C59052c) ((C59052c) ((C59052c) C11636b.f37591a.mo56225c()).mo56382g(e)).mo56372aa(43392)).mo56386p("Could not open file named AssistantAutoProjectedTelemetry.pb");
                    bVar = null;
                }
                if (bVar == null) {
                    ((C59052c) ((C59052c) f229136a.mo56225c()).mo56372aa(7082)).mo56386p("Failed to dump recent CarAssistant sessions to the bug report, failed to load proto file from disk.");
                    return;
                }
                printWriter.println("CarAssistantService dumped the following RecentCarAssistantSessions as a Base64-encoded string:");
                C59326i iVar = C59326i.f157516d;
                byte[] byteArray = bVar.toByteArray();
                printWriter.println(iVar.mo56837l(byteArray, byteArray.length));
            } catch (RuntimeException e2) {
                ((C59052c) ((C59052c) ((C59052c) f229136a.mo56225c()).mo56382g(e2)).mo56372aa(7081)).mo56386p("Failed to dump recent CarAssistant sessions to the bug report.");
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        ((C59052c) ((C59052c) f229136a.mo56224b()).mo56372aa(7080)).mo56386p("onBind()");
        this.f229142f.mo103754e(C118522by.SPEECH_GRAMMAR_COMPILER, C118472ag.f328819i);
        this.f229145i.f38013a = true;
        this.f229138b.sendBroadcast(new Intent("android.car.projection.extra.ACTION_BEGIN_PROJECTION"));
        return this.f229153r;
    }

    public final void onCreate() {
        C74507e.m120466b(13);
        ((C59052c) ((C59052c) f229136a.mo56224b()).mo56372aa(7083)).mo56386p("onCreate()");
        super.onCreate();
    }

    public final void onDestroy() {
        ((C59052c) ((C59052c) f229136a.mo56224b()).mo56372aa(7084)).mo56386p("onDestroy()");
        super.onDestroy();
    }

    public final boolean onUnbind(Intent intent) {
        ((C59052c) ((C59052c) f229136a.mo56224b()).mo56372aa(7085)).mo56386p("onUnbind()");
        super.onUnbind(intent);
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1531;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        C84186a aVar = this.f229150n;
        if (aVar != null) {
            aVar.mo77656b();
        }
        this.f229141e.mo77650a();
        this.f229145i.f38013a = false;
        this.f229138b.sendBroadcast(new Intent("android.car.projection.extra.ACTION_END_PROJECTION"));
        return false;
    }
}
