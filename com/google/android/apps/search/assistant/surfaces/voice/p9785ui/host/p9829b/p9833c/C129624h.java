package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129662i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.C129668f;
import java.util.Map;
import p5462h.C69613f;
import p5462h.C69685i;
import p5462h.C69747m;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.h */
/* compiled from: PG */
public final class C129624h {

    /* renamed from: a */
    public static final Map f355746a;

    /* renamed from: b */
    public static final Map f355747b;

    /* renamed from: c */
    public final boolean f355748c;

    /* renamed from: d */
    private final Map f355749d;

    /* renamed from: e */
    private final C129605c f355750e;

    /* renamed from: f */
    private final C129668f f355751f;

    /* renamed from: g */
    private final C69613f f355752g = new C69747m(new C129623g(this));

    static {
        C129662i iVar = C129662i.KEYBOARD_INPUT;
        C129662i iVar2 = C129662i.INPUT;
        C69685i iVar3 = new C69685i(iVar, iVar2);
        C129668f fVar = C129668f.DEFAULT;
        C129662i iVar4 = C129662i.RESPONSE;
        f355746a = C69505av.m100866h(new C69685i(new C69685i(C129662i.INPUT, C129662i.KEYBOARD_INPUT), C129668f.DEFAULT), new C69685i(iVar3, fVar), new C69685i(new C69685i(iVar, iVar4), fVar), new C69685i(new C69685i(iVar4, iVar), fVar), new C69685i(new C69685i(iVar2, C129662i.LEGAL_NOTICE), fVar));
        C129662i iVar5 = C129662i.ACCOUNT_FIX;
        C129662i iVar6 = C129662i.INPUT;
        C69685i iVar7 = new C69685i(iVar5, iVar6);
        C129668f fVar2 = C129668f.SEAMLESS;
        C129662i iVar8 = C129662i.ENABLE_ASSISTANT;
        C129662i iVar9 = C129662i.RESPONSE;
        C129662i iVar10 = C129662i.ESCAPE_HATCH;
        f355747b = C69505av.m100866h(new C69685i(iVar7, fVar2), new C69685i(new C69685i(iVar8, iVar5), fVar2), new C69685i(new C69685i(iVar8, iVar6), fVar2), new C69685i(new C69685i(iVar6, iVar9), fVar2), new C69685i(new C69685i(iVar6, iVar10), fVar2), new C69685i(new C69685i(iVar9, iVar10), fVar2));
    }

    public C129624h(Map map, C129605c cVar, C129668f fVar, boolean z) {
        this.f355749d = map;
        this.f355750e = cVar;
        this.f355751f = fVar;
        this.f355748c = z;
    }

    /* renamed from: a */
    public final C129605c mo109134a(C129668f fVar) {
        C69664n.m101061g(fVar, "type");
        C129605c cVar = (C129605c) this.f355749d.get(fVar);
        return cVar == null ? this.f355750e : cVar;
    }

    /* renamed from: b */
    public final C129668f mo109135b(C129676j jVar, C129676j jVar2) {
        C69664n.m101061g(jVar, "src");
        C69664n.m101061g(jVar2, "dest");
        Map map = (Map) this.f355752g.mo5768a();
        C129662i a = C129662i.m211713a(jVar.f355893b);
        if (a == null) {
            a = C129662i.DEFAULT_NOT_VISIBLE;
        }
        C129662i a2 = C129662i.m211713a(jVar2.f355893b);
        if (a2 == null) {
            a2 = C129662i.DEFAULT_NOT_VISIBLE;
        }
        C129668f fVar = (C129668f) map.get(new C69685i(a, a2));
        return fVar == null ? this.f355751f : fVar;
    }
}
