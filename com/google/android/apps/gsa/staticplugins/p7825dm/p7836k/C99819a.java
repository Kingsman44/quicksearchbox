package com.google.android.apps.gsa.staticplugins.p7825dm.p7836k;

import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.libraries.silk.p3205a.p3228q.C41731a;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4312q.C56796d;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4312q.C56800h;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4312q.C56802j;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56847c;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56848d;
import java.net.URISyntaxException;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.k.a */
/* compiled from: PG */
public final class C99819a implements C41731a {

    /* renamed from: a */
    private static final C56848d f279255a;

    /* renamed from: b */
    private static final C56848d f279256b;

    /* renamed from: c */
    private final PackageManager f279257c;

    /* renamed from: d */
    private final C87680ah f279258d;

    static {
        C56847c cVar = (C56847c) C56848d.f151669d.createBuilder();
        cVar.copyOnWrite();
        C56848d dVar = (C56848d) cVar.instance;
        dVar.f151671a |= 1;
        dVar.f151672b = "invalid_url";
        cVar.copyOnWrite();
        C56848d dVar2 = (C56848d) cVar.instance;
        dVar2.f151671a |= 2;
        dVar2.f151673c = "Given URL is invalid";
        f279255a = (C56848d) cVar.build();
        C56847c cVar2 = (C56847c) C56848d.f151669d.createBuilder();
        cVar2.copyOnWrite();
        C56848d dVar3 = (C56848d) cVar2.instance;
        dVar3.f151671a |= 1;
        dVar3.f151672b = "activity_not_found";
        cVar2.copyOnWrite();
        C56848d dVar4 = (C56848d) cVar2.instance;
        dVar4.f151671a |= 2;
        dVar4.f151673c = "No activity can open given url";
        f279256b = (C56848d) cVar2.build();
    }

    public C99819a(PackageManager packageManager, C87680ah ahVar) {
        this.f279257c = packageManager;
        this.f279258d = ahVar;
    }

    /* renamed from: a */
    public final C60870cx mo42557a(C56796d dVar) {
        return C60856cj.m92899h(new UnsupportedOperationException());
    }

    /* renamed from: b */
    public final C60870cx mo42558b(C56800h hVar) {
        return C60856cj.m92899h(new UnsupportedOperationException());
    }

    /* renamed from: c */
    public final C60870cx mo42559c(C56802j jVar) {
        try {
            Intent parseUri = Intent.parseUri(jVar.f151581a, 0);
            parseUri.addCategory("android.intent.category.BROWSABLE");
            if (parseUri.getComponent() == null ? this.f279257c.queryIntentActivities(parseUri, 65536).isEmpty() : this.f279257c.queryIntentActivities(parseUri, 0).isEmpty()) {
                return C60856cj.m92899h(new C41742a(f279256b));
            }
            if (parseUri.getPackage() == null && parseUri.getComponent() == null) {
                parseUri.putExtra("com.google.android.apps.gsa.customtabs.EXTRA_LAUNCH_NEW_TASK_OVERRIDE", false);
            }
            C87680ah ahVar = this.f279258d;
            C88489j jVar2 = new C88489j(C87739bu.BROWSABLE_INTENT_LAUNCHED_IN_CLIENT);
            jVar2.mo82015c(parseUri);
            ahVar.mo81961c(jVar2.mo82013a());
            return C60866ct.f164955a;
        } catch (URISyntaxException unused) {
            return C60856cj.m92899h(new C41742a(f279255a));
        }
    }
}
