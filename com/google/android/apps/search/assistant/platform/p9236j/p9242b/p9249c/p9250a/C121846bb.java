package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a;

import android.content.Intent;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122046f;
import com.google.android.libraries.search.assistant.invocation.p2587a.p2588a.C33483a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.a.bb */
/* compiled from: PG */
public final class C121846bb implements C33483a {

    /* renamed from: a */
    public static final C59071e f338088a = C59071e.m91331h();

    /* renamed from: b */
    public final C122046f f338089b;

    /* renamed from: c */
    public final C34053bp f338090c;

    /* renamed from: d */
    private final C71422aw f338091d;

    public C121846bb(C122046f fVar, C34053bp bpVar, C71422aw awVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        this.f338089b = fVar;
        this.f338090c = bpVar;
        this.f338091d = awVar;
    }

    /* renamed from: a */
    public final C60870cx mo38888a(Intent intent) {
        C69664n.m101061g(intent, "intent");
        C59052c cVar = (C59052c) f338088a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "INV.ActivityStarter");
        C34053bp bpVar = this.f338090c;
        C61301b a = bpVar != null ? C34711b.m63445a(bpVar) : null;
        cVar.mo56379ah(new C59094n(36019));
        cVar.mo56389s("startVoiceActivity: for token = %s", a);
        return C71663i.m104692e(this.f338091d, (C71424ay) null, new C121845ba(this, intent, (C69577g) null), 3);
    }
}
