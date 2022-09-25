package com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9504a.p9505a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9504a.C126879a;
import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9506b.C126904a;
import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9507c.p9508a.C126905a;
import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9509d.C126908c;
import com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.C128245a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129571aa;
import com.google.android.libraries.silk.p3205a.p3228q.C41731a;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4312q.C56796d;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4312q.C56800h;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4312q.C56802j;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56847c;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56848d;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56850f;
import java.net.URISyntaxException;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.a.a.f */
/* compiled from: PG */
public final class C126885f implements C126879a, C41731a {

    /* renamed from: e */
    public static final /* synthetic */ int f349364e = 0;

    /* renamed from: f */
    private static final C59071e f349365f = C59071e.m91331h();

    /* renamed from: g */
    private static final C56848d f349366g;

    /* renamed from: h */
    private static final C56848d f349367h;

    /* renamed from: a */
    public final Context f349368a;

    /* renamed from: b */
    public final C126905a f349369b;

    /* renamed from: c */
    public final C126904a f349370c;

    /* renamed from: d */
    public final C126908c f349371d;

    /* renamed from: i */
    private final C128245a f349372i;

    /* renamed from: j */
    private final C129571aa f349373j;

    /* renamed from: k */
    private final PackageManager f349374k;

    static {
        C56847c cVar = (C56847c) C56848d.f151669d.createBuilder();
        C69664n.m101060f(cVar, "newBuilder()");
        C56850f a = C69664n.m101061g(cVar, "builder");
        a.mo54435c("invalid_url");
        a.mo54434b("The intent url is invalid");
        f349366g = a.mo54433a();
        C56847c cVar2 = (C56847c) C56848d.f151669d.createBuilder();
        C69664n.m101060f(cVar2, "newBuilder()");
        C56850f a2 = C69664n.m101061g(cVar2, "builder");
        a2.mo54435c("activity_not_found");
        a2.mo54434b("No Activity support given intent");
        f349367h = a2.mo54433a();
    }

    public C126885f(Context context, C126908c cVar, C126904a aVar, C126905a aVar2, C128245a aVar3, C129571aa aaVar, PackageManager packageManager) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(cVar, "requestManager");
        C69664n.m101061g(aVar3, "lockscreenKeyguard");
        C69664n.m101061g(aaVar, "startActivityTracker");
        C69664n.m101061g(packageManager, "packageManager");
        this.f349368a = context;
        this.f349371d = cVar;
        this.f349370c = aVar;
        this.f349369b = aVar2;
        this.f349372i = aVar3;
        this.f349373j = aaVar;
        this.f349374k = packageManager;
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo42557a(C56796d dVar) {
        return C60856cj.m92899h(new UnsupportedOperationException("Method SilkNavigationApi.openDeepLink not implemented!"));
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo42558b(C56800h hVar) {
        return C60856cj.m92899h(new UnsupportedOperationException("Method SilkNavigationApi.openSearch not implemented!"));
    }

    /* renamed from: c */
    public final C60870cx mo42559c(C56802j jVar) {
        C69664n.m101061g(jVar, "openUrlRequest");
        C59052c cVar = (C59052c) f349365f.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "AssistantIntentStarter");
        cVar.mo56379ah(new C59094n(37223));
        cVar.mo56386p("#ais openUrl");
        try {
            Intent parseUri = Intent.parseUri(jVar.f151581a, 0);
            C69664n.m101060f(parseUri, "parseUri(openUrlRequest.getUrl(), /* flags= */ 0)");
            PackageManager packageManager = this.f349374k;
            C69664n.m101061g(parseUri, "intent");
            C69664n.m101061g(packageManager, "packageManager");
            if (parseUri.getComponent() == null ? packageManager.resolveActivity(parseUri, 65536) == null : packageManager.resolveActivity(parseUri, 0) == null) {
                return C60856cj.m92899h(new C41742a(f349367h));
            }
            C69664n.m101061g(parseUri, "intent");
            Bundle extras = parseUri.getExtras();
            if (extras == null || !extras.getBoolean("com.google.android.apps.gsa.shared.util.starter.IntentStarter.START_ACTIVITY_FOR_RESULT", false)) {
                return mo20101f(parseUri);
            }
            C60870cx g = mo39653g(parseUri);
            C126884e eVar = C126884e.f349363a;
            return C60922j.m93045h(g, C47810es.m84966f(eVar), C60826bg.f164896a);
        } catch (URISyntaxException e) {
            return C60856cj.m92899h(new C41742a(f349366g, e));
        }
    }

    /* renamed from: d */
    public final void mo107836d(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        this.f349373j.mo109110a();
        C47810es.m84979s(this.f349368a, intent);
    }

    /* renamed from: f */
    public final C60870cx mo20101f(Intent intent) {
        C69664n.m101061g(intent, "intent");
        C59052c cVar = (C59052c) f349365f.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "AssistantIntentStarter");
        cVar.mo56379ah(new C59094n(37224));
        cVar.mo56386p("#ais startActivity");
        C60870cx a = this.f349372i.mo108383a(intent);
        C126881b bVar = new C126881b(this, intent);
        return C60922j.m93045h(a, C47810es.m84966f(bVar), C60826bg.f164896a);
    }

    /* renamed from: g */
    public final C60870cx mo39653g(Intent intent) {
        C69664n.m101061g(intent, "intent");
        C59052c cVar = (C59052c) f349365f.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "AssistantIntentStarter");
        cVar.mo56379ah(new C59094n(37225));
        cVar.mo56386p("startActivityForResult");
        C60870cx a = this.f349372i.mo108383a(intent);
        C126883d dVar = new C126883d(this, intent);
        return C60922j.m93045h(a, C47810es.m84966f(dVar), C60826bg.f164896a);
    }
}
