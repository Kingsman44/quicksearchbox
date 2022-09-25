package com.google.android.apps.gsa.shared.util.debug.p7163a.p7164a;

import android.util.Base64;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.p8884a.C118823a;
import com.google.android.apps.gsa.p8883x.p8884a.C118824b;
import com.google.android.apps.gsa.shared.util.p7158b.C90745b;
import com.google.common.base.C58831av;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58710pc;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59980id;
import com.google.common.p4552o.C59982if;
import com.google.common.p4552o.C59988il;
import com.google.common.p4552o.C59991io;
import com.google.protobuf.MessageLite;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.a.x */
/* compiled from: PG */
public final class C90988x extends C90983s {

    /* renamed from: b */
    private static final C59071e f254190b = C59071e.m91332i("com.google.android.apps.gsa.shared.util.debug.a.a.x");

    public C90988x(C90974j jVar) {
        super(jVar);
    }

    /* renamed from: b */
    private static String m148617b(long j, boolean z) {
        if (j == 0) {
            return true != z ? "-----" : "    -----";
        }
        return String.format(Locale.US, true != z ? "%.03f" : "%9.03f", new Object[]{Float.valueOf(((float) j) / 1000000.0f)});
    }

    /* renamed from: a */
    public final /* synthetic */ void mo85255a(MessageLite messageLite) {
        String str;
        C59988il ilVar = (C59988il) messageLite;
        this.f254188a.mo85258b(String.format(Locale.US, "TaskGraph %s [created at %s]", new Object[]{C118575h.m196865a(ilVar.f162114b).name(), C90745b.m148220a(new Date(ilVar.f162115c))}));
        this.f254188a.mo85261e();
        this.f254188a.mo85258b("Text");
        this.f254188a.mo85261e();
        this.f254188a.mo85257a("                                 method                 future  (Note: all times are in ms. relative to TaskGraph creation)");
        this.f254188a.mo85257a("requested,   queued,  started, finished (+  latency), finished, task");
        if (ilVar.f162116d.size() > 0) {
            C58801sm G = C58485gu.m89836F(C58710pc.m90487d(C90987w.f254189a), ilVar.f162116d).listIterator(0);
            while (G.hasNext()) {
                C59991io ioVar = (C59991io) G.next();
                int i = ioVar.f162129a;
                if ((i & 4) == 0 || (i & 8) == 0) {
                    str = "            ";
                } else {
                    str = "(+" + m148617b(ioVar.f162133e - ioVar.f162132d, true) + ")";
                }
                this.f254188a.mo85257a(String.format(Locale.US, "%s,%s,%s,%s %s, %s, %s, %s, %s, %s", new Object[]{m148617b(ioVar.f162130b, true), m148617b(ioVar.f162131c, true), m148617b(ioVar.f162132d, true), m148617b(ioVar.f162133e, true), str, m148617b(ioVar.f162134f, true), ioVar.f162137i, Long.valueOf(ioVar.f162138j), Long.valueOf(ioVar.f162139k), Long.valueOf(ioVar.f162140l)}));
                if ((ioVar.f162129a & 32) != 0) {
                    this.f254188a.mo85261e();
                    this.f254188a.mo85257a("Task " + ioVar.f162137i + ", execution failed with the following error:");
                    for (String a : ioVar.f162135g.split("\n")) {
                        this.f254188a.mo85257a(a);
                    }
                    this.f254188a.mo85260d();
                }
            }
        }
        for (Map.Entry entry : Collections.unmodifiableMap(ilVar.f162121i).entrySet()) {
            this.f254188a.mo85257a("Events of type: ".concat(String.valueOf(((C118824b) C58831av.m90830c(C118824b.m197210a(((Integer) entry.getKey()).intValue()), C118824b.UNKNOWN_TYPE)).name())));
            this.f254188a.mo85261e();
            this.f254188a.mo85257a("timestamp,  description");
            for (C59980id idVar : ((C59982if) entry.getValue()).f162106a) {
                this.f254188a.mo85257a(String.format(Locale.US, "%s, %s", new Object[]{m148617b(idVar.f162101b, true), ((C118823a) C58831av.m90830c(C118823a.m197209a(idVar.f162102c), C118823a.UNKNOWN_EVENT)).name()}));
            }
            this.f254188a.mo85260d();
        }
        if ((ilVar.f162113a & 32) != 0) {
            this.f254188a.mo85257a("TaskGraph was shutdown " + m148617b(ilVar.f162119g, false) + "ms after it was created.");
        }
        this.f254188a.mo85260d();
        this.f254188a.mo85258b("Binary");
        this.f254188a.mo85261e();
        try {
            this.f254188a.mo85257a(Base64.encodeToString(ilVar.toByteArray(), 2));
        } catch (Exception e) {
            C59104x d = f254190b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TaskGraphLogFormatter");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(11408)).mo56386p("Could not generate binary logs for TaskGraph");
        }
        this.f254188a.mo85260d();
        this.f254188a.mo85260d();
    }
}
