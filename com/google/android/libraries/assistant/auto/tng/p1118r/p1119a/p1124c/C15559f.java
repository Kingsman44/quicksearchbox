package com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1124c;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122468w;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122099h;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9259b.C122108a;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9260c.C122109a;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9260c.C122119d;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9260c.p9261a.C122113d;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9260c.p9261a.C122114e;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1122b.C15537a;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.a.c.f */
/* compiled from: PG */
public final class C15559f implements C122108a {

    /* renamed from: a */
    public final C52230ka f46557a = C52230ka.f137057d;

    /* renamed from: b */
    private final C122114e f46558b;

    public C15559f(C15537a aVar) {
        C58976aa aaVar = C58975e.f156826a;
        C58490gz gzVar = new C58490gz(4);
        C122119d dVar = C122468w.f339525a;
        Objects.requireNonNull(aVar);
        C122113d.m201648b(dVar, new C15554a(aVar), gzVar);
        C122113d.m201649c(new C122109a("alarm"), new C15555b(this), gzVar);
        C122113d.m201649c(new C122109a("timer"), new C15556c(this), gzVar);
        C122113d.m201649c(new C122109a("stopwatch"), new C15557d(this), gzVar);
        C122113d.m201649c(new C122109a("media"), new C15558e(this), gzVar);
        this.f46558b = C122113d.m201647a(gzVar);
    }

    /* renamed from: a */
    public final C60870cx mo22397a(C122099h hVar) {
        return this.f46558b.mo105537a(hVar);
    }
}
