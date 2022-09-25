package com.google.android.libraries.assistant.auto.tng.suggestions.p1262j;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.p1188b.p1189a.C15857b;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.p1190c.C15859a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1210c.p1211a.C15948d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.C16408a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.suggestion.C53473c;
import com.google.assistant.suggestion.RegisterDisplayParams;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.j.t */
/* compiled from: PG */
public final class C16325t {

    /* renamed from: a */
    public final C16408a f48021a;

    /* renamed from: b */
    public final AtomicReference f48022b = new AtomicReference(Optional.empty());

    /* renamed from: c */
    public final Executor f48023c;

    /* renamed from: d */
    public final Executor f48024d;

    /* renamed from: e */
    public final C15859a f48025e;

    /* renamed from: f */
    public final C69464a f48026f;

    /* renamed from: g */
    public final C69464a f48027g;

    /* renamed from: h */
    public final C15857b f48028h;

    /* renamed from: i */
    public final C15948d f48029i;

    public C16325t(C16408a aVar, C15948d dVar, C15859a aVar2, C15857b bVar, Executor executor, Executor executor2, C69464a aVar3, C69464a aVar4) {
        this.f48021a = aVar;
        this.f48029i = dVar;
        this.f48023c = executor;
        this.f48024d = executor2;
        this.f48025e = aVar2;
        this.f48028h = bVar;
        this.f48026f = aVar3;
        this.f48027g = aVar4;
    }

    /* renamed from: a */
    public final C60870cx mo22884a() {
        Optional optional = (Optional) this.f48022b.get();
        if (optional.isPresent()) {
            return (C60870cx) optional.get();
        }
        C16408a aVar = this.f48021a;
        C53473c a = C53473c.m86820a();
        a.f140342d = 7;
        C60870cx f = aVar.mo22920f("coolwalk_media_card_display_id", new RegisterDisplayParams(a), C16318m.f48009a, 1);
        this.f48022b.set(Optional.m71637of(f));
        return f;
    }

    /* renamed from: b */
    public final C60870cx mo22885b() {
        C60870cx cxVar;
        C60870cx d = this.f48021a.mo22918d("coolwalk_media_card_display_id");
        C60870cx d2 = this.f48021a.mo22918d("coolwalk_suggestion_display_id");
        C15948d dVar = this.f48029i;
        if (!((Boolean) dVar.f47322d.mo17428b()).booleanValue()) {
            cxVar = C60856cj.m92900i(false);
        } else {
            cxVar = dVar.f47320b.mo22918d("voiceplate_immersive_display_id");
        }
        C46459k.m82829b(cxVar, "Failed to unregister discovery manager", new Object[0]);
        return C47638k.m84751b(d2, d).mo51520a(new C16324s(this, d2, d), this.f48024d);
    }
}
