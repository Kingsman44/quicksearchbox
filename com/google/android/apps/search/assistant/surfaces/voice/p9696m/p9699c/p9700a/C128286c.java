package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9699c.p9700a;

import android.content.Intent;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121812a;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121846bb;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129571aa;
import com.google.android.libraries.search.assistant.invocation.p2587a.p2588a.C33484b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2693a.C34708c;
import com.google.android.libraries.search.assistant.performer.p2728a.C35473i;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.c.a.c */
/* compiled from: PG */
public final class C128286c implements C35473i {

    /* renamed from: a */
    public static final C59071e f352852a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.m.c.a.c");

    /* renamed from: b */
    private final C60887da f352853b;

    /* renamed from: c */
    private final C129571aa f352854c;

    /* renamed from: d */
    private final C121812a f352855d;

    public C128286c(C60887da daVar, C121812a aVar, C129571aa aaVar) {
        this.f352853b = daVar;
        this.f352855d = aVar;
        this.f352854c = aaVar;
    }

    /* renamed from: a */
    public final C60870cx mo20099a(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        C121812a aVar = this.f352855d;
        C34053bp a = C34708c.m63442a("Assistant Powered Voice Search");
        C69664n.m101061g(a, "token");
        C121846bb a2 = aVar.f338045b.mo65973a(aVar.f338044a, a);
        this.f352854c.mo109110a();
        return C47633f.m84733g(a2.mo38888a(intent)).mo51515h(C128284a.f352850a, this.f352853b).mo51513e(C33484b.class, new C128285b(intent), this.f352853b);
    }
}
