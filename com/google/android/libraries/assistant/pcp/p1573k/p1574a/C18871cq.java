package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.p031v4.media.session.C0320v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.cq */
/* compiled from: PG */
public final class C18871cq {

    /* renamed from: a */
    private static final C59071e f53131a = C59071e.m91331h();

    /* renamed from: b */
    private final Context f53132b;

    /* renamed from: c */
    private final C69464a f53133c;

    public C18871cq(Context context, C69464a aVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(aVar, "packageManagerLazy");
        this.f53132b = context;
        this.f53133c = aVar;
    }

    /* renamed from: b */
    private final void m36301b(String str) {
        Intent launchIntentForPackage = ((PackageManager) this.f53133c.mo17428b()).getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            C59052c cVar = (C59052c) f53131a.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "TNG.MediaHelper");
            cVar.mo56379ah(new C59094n(47483));
            cVar.mo56389s("Fallback failed to get launch-intent from package %s", str);
            return;
        }
        launchIntentForPackage.addFlags(536870912);
        C58976aa aaVar = C58975e.f156826a;
        C47810es.m84979s(this.f53132b, launchIntentForPackage);
    }

    /* renamed from: a */
    public final void mo24202a(C0320v vVar) {
        C69664n.m101061g(vVar, "mediaControllerCompat");
        String g = vVar.mo1039g();
        PendingIntent c = vVar.mo1035c();
        if (c == null) {
            C59052c cVar = (C59052c) f53131a.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "TNG.MediaHelper");
            cVar.mo56379ah(new C59094n(47481));
            cVar.mo56389s("#switchToMediaApp(): getSessionActivity() for %s returned null. Using package manager fallback.", g);
            C69664n.m101060f(g, "packageName");
            m36301b(g);
            return;
        }
        try {
            c.send();
        } catch (PendingIntent.CanceledException e) {
            C59052c cVar2 = (C59052c) f53131a.mo56225c();
            cVar2.mo56378ag(C58975e.f156826a, "TNG.MediaHelper");
            C59052c cVar3 = (C59052c) cVar2.mo56382g(e);
            cVar3.mo56379ah(new C59094n(47480));
            cVar3.mo56386p("Failed to send session activity. Fallback to intent with app package name.");
            C69664n.m101060f(g, "packageName");
            m36301b(g);
        }
    }
}
