package com.google.android.libraries.search.silk.p3162a.p3175m;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.libraries.silk.p3205a.p3228q.C41731a;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4312q.C56794b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4312q.C56796d;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4312q.C56800h;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4312q.C56802j;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56847c;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56848d;
import com.google.protobuf.C62963cj;
import java.net.URISyntaxException;

/* renamed from: com.google.android.libraries.search.silk.a.m.a */
/* compiled from: PG */
public final class C40620a implements C41731a {

    /* renamed from: a */
    private static final C59071e f106595a = C59071e.m91332i("com.google.android.libraries.search.silk.a.m.a");

    /* renamed from: b */
    private static final C56848d f106596b;

    /* renamed from: c */
    private static final C56848d f106597c;

    /* renamed from: d */
    private static final C56848d f106598d;

    /* renamed from: e */
    private static final C56848d f106599e;

    /* renamed from: f */
    private static final C56848d f106600f;

    /* renamed from: g */
    private static final C56848d f106601g;

    /* renamed from: h */
    private final Context f106602h;

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
        f106596b = (C56848d) cVar.build();
        C56847c cVar2 = (C56847c) C56848d.f151669d.createBuilder();
        cVar2.copyOnWrite();
        C56848d dVar3 = (C56848d) cVar2.instance;
        dVar3.f151671a |= 1;
        dVar3.f151672b = "invalid_deeplink";
        cVar2.copyOnWrite();
        C56848d dVar4 = (C56848d) cVar2.instance;
        dVar4.f151671a |= 2;
        dVar4.f151673c = "Given deep link is invalid";
        f106597c = (C56848d) cVar2.build();
        C56847c cVar3 = (C56847c) C56848d.f151669d.createBuilder();
        cVar3.copyOnWrite();
        C56848d dVar5 = (C56848d) cVar3.instance;
        dVar5.f151671a |= 1;
        dVar5.f151672b = "no_handler_found";
        cVar3.copyOnWrite();
        C56848d dVar6 = (C56848d) cVar3.instance;
        dVar6.f151671a |= 2;
        dVar6.f151673c = "No activity can open given url";
        f106598d = (C56848d) cVar3.build();
        C56847c cVar4 = (C56847c) C56848d.f151669d.createBuilder();
        cVar4.copyOnWrite();
        C56848d dVar7 = (C56848d) cVar4.instance;
        dVar7.f151671a |= 1;
        dVar7.f151672b = "no_handler_found";
        cVar4.copyOnWrite();
        C56848d dVar8 = (C56848d) cVar4.instance;
        dVar8.f151671a |= 2;
        dVar8.f151673c = "open url failed";
        f106599e = (C56848d) cVar4.build();
        C56847c cVar5 = (C56847c) C56848d.f151669d.createBuilder();
        cVar5.copyOnWrite();
        C56848d dVar9 = (C56848d) cVar5.instance;
        dVar9.f151671a |= 1;
        dVar9.f151672b = "unknown_corpora";
        cVar5.copyOnWrite();
        C56848d dVar10 = (C56848d) cVar5.instance;
        dVar10.f151671a |= 2;
        dVar10.f151673c = "All given corpora are unknown";
        f106600f = (C56848d) cVar5.build();
        C56847c cVar6 = (C56847c) C56848d.f151669d.createBuilder();
        cVar6.copyOnWrite();
        C56848d dVar11 = (C56848d) cVar6.instance;
        dVar11.f151671a |= 1;
        dVar11.f151672b = "empty_query";
        cVar6.copyOnWrite();
        C56848d dVar12 = (C56848d) cVar6.instance;
        dVar12.f151671a |= 2;
        dVar12.f151673c = "Given query is empty";
        f106601g = (C56848d) cVar6.build();
    }

    public C40620a(Context context) {
        this.f106602h = context;
    }

    /* renamed from: d */
    private static Intent m70371d(String str) {
        Intent parseUri = Intent.parseUri(str, 0);
        parseUri.addCategory("android.intent.category.BROWSABLE");
        return parseUri;
    }

    /* renamed from: e */
    private final void m70372e(Intent intent) {
        intent.setFlags(268435456);
        PackageManager packageManager = this.f106602h.getPackageManager();
        if (intent.getComponent() == null ? packageManager.queryIntentActivities(intent, 65536).isEmpty() : packageManager.queryIntentActivities(intent, 0).isEmpty()) {
            ((C59052c) ((C59052c) f106595a.mo56225c()).mo56372aa(53377)).mo56386p("No application can open url");
            throw new C41742a(f106598d);
        }
        try {
            C47810es.m84979s(this.f106602h, intent);
        } catch (ActivityNotFoundException e) {
            ((C59052c) ((C59052c) f106595a.mo56225c()).mo56372aa(53376)).mo56386p("Opening url failed");
            throw new C41742a(f106599e, e);
        }
    }

    /* renamed from: a */
    public final C60870cx mo42557a(C56796d dVar) {
        String str;
        try {
            if (!dVar.f151569b.isEmpty()) {
                str = dVar.f151569b;
            } else if (!dVar.f151568a.isEmpty()) {
                str = dVar.f151568a;
            } else {
                ((C59052c) ((C59052c) f106595a.mo56225c()).mo56372aa(53375)).mo56386p("No suitable deep link supplied");
                throw new C41742a(f106597c);
            }
            m70372e(m70371d(str));
            return C60866ct.f164955a;
        } catch (URISyntaxException e) {
            ((C59052c) ((C59052c) ((C59052c) f106595a.mo56225c()).mo56382g(e)).mo56372aa(53373)).mo56386p("could not parse deep link");
            return C60856cj.m92899h(new C41742a(f106597c, e));
        } catch (C41742a e2) {
            return C60856cj.m92899h(e2);
        }
    }

    /* renamed from: b */
    public final C60870cx mo42558b(C56800h hVar) {
        if (!new C62963cj(hVar.f151576b, C56800h.f151572c).isEmpty() && !new C62963cj(hVar.f151576b, C56800h.f151572c).contains(C56794b.ALL)) {
            return C60856cj.m92899h(new C41742a(f106600f));
        }
        if (hVar.f151575a.isEmpty()) {
            return C60856cj.m92899h(new C41742a(f106601g));
        }
        Intent intent = new Intent("android.intent.action.WEB_SEARCH");
        intent.putExtra("query", hVar.f151575a);
        try {
            m70372e(intent);
            return C60866ct.f164955a;
        } catch (C41742a e) {
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: c */
    public final C60870cx mo42559c(C56802j jVar) {
        try {
            m70372e(m70371d(jVar.f151581a));
            return C60866ct.f164955a;
        } catch (URISyntaxException e) {
            ((C59052c) ((C59052c) ((C59052c) f106595a.mo56225c()).mo56382g(e)).mo56372aa(53374)).mo56386p("url is invalid");
            return C60856cj.m92899h(new C41742a(f106596b, e));
        } catch (C41742a e2) {
            return C60856cj.m92899h(e2);
        }
    }
}
