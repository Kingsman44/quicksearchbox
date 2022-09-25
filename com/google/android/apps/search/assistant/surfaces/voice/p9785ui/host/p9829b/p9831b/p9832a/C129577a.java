package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9831b.p9832a;

import android.support.p031v4.app.FragmentManager;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129578c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129636o;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129647z;
import com.google.android.apps.search.assistant.verticals.p9880a.p9884c.C130348b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.b.a.a */
/* compiled from: PG */
public final class C129577a {

    /* renamed from: a */
    private final C47215a f355652a;

    public C129577a(C47215a aVar) {
        C69664n.m101061g(aVar, "fragmentHost");
        this.f355652a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo109114a() {
        FragmentManager q = this.f355652a.mo51122q();
        C69664n.m101060f(q, "fragmentHost.supportFragmentManager");
        C129578c a = C129647z.m211697a(q);
        if (a == null) {
            return C60856cj.m92900i(C130348b.m212798a().mo109666a());
        }
        C129636o a2 = a.mo17754z();
        C34053bp bpVar = a2.mo109137c().f355880d;
        C60870cx c = bpVar != null ? a2.f355792l.mo106973c(bpVar) : null;
        if (c == null) {
            return C60856cj.m92900i(C130348b.m212798a().mo109666a());
        }
        return c;
    }
}
