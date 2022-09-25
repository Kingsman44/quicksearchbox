package com.google.android.libraries.gsa.conversation.p1837a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6491a.C84349ah;
import com.google.android.libraries.gsa.conversation.p1852f.C22588o;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.speech.p5224k.p5225a.C67190ah;

/* renamed from: com.google.android.libraries.gsa.conversation.a.ai */
/* compiled from: PG */
public final class C22318ai extends C22334o {

    /* renamed from: a */
    private static final C59071e f61629a = C59071e.m91332i("com.google.android.libraries.gsa.conversation.a.ai");

    /* renamed from: b */
    private final C67190ah f61630b;

    /* renamed from: c */
    private final C22588o f61631c;

    /* renamed from: d */
    private final C22345z f61632d;

    /* renamed from: e */
    private C58833ax f61633e = C58836b.f156633a;

    /* renamed from: f */
    private final C84349ah f61634f;

    public C22318ai(C67190ah ahVar, C84349ah ahVar2, C22588o oVar, C22345z zVar) {
        this.f61630b = ahVar;
        this.f61634f = ahVar2;
        this.f61631c = oVar;
        this.f61632d = zVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C22333n mo27546a() {
        return C22333n.OUTPUT;
    }

    /* renamed from: b */
    public final synchronized C60870cx mo27547b() {
        if (this.f61633e.mo56113h()) {
            C59104x c = f61629a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TtsSynthAudioRequest");
            ((C59052c) ((C59052c) c).mo56372aa(48238)).mo56386p("Audio request already executed, returning.");
            return C118826c.f331423b;
        }
        C22334o a = this.f61632d.mo27565a(C60922j.m93044g(this.f61631c.mo27693a(this.f61630b), C22317ah.f61628a, C60826bg.f164896a), this.f61634f);
        this.f61633e = C58833ax.m90834k(a);
        return a.mo27547b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final synchronized C60870cx mo27548c() {
        C60870cx cxVar;
        if (this.f61633e.mo56113h()) {
            cxVar = ((C22334o) this.f61633e.mo56107c()).mo27548c();
        } else {
            cxVar = C118826c.f331423b;
        }
        return cxVar;
    }
}
