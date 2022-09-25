package com.google.android.libraries.assistant.soda.p1605d;

import android.content.Context;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.speech.p5218j.C66917eg;
import com.google.speech.p5218j.C66919ei;
import com.google.speech.p5218j.C66929es;
import com.google.speech.p5218j.C66935ey;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.soda.d.n */
/* compiled from: PG */
public final class C19276n implements C19273k {

    /* renamed from: a */
    private static final C59071e f53992a = C59071e.m91332i("com.google.android.libraries.assistant.soda.d.n");

    /* renamed from: b */
    private final C19271i f53993b;

    /* renamed from: c */
    private final Optional f53994c;

    /* renamed from: d */
    private final Optional f53995d;

    public C19276n(Context context, Optional optional, Optional optional2) {
        this.f53993b = new C19271i(context);
        this.f53994c = optional;
        this.f53995d = optional2;
    }

    /* renamed from: a */
    public final void mo24436a(C66917eg egVar) {
        for (C66919ei a : egVar.f181907b) {
            this.f53993b.mo24435a(a);
        }
        if (this.f53994c.isPresent()) {
            for (C66935ey a2 : egVar.f181908c) {
                ((C19270h) this.f53994c.get()).mo24434a(a2);
            }
        } else if (!egVar.f181908c.isEmpty()) {
            C59052c cVar = (C59052c) f53992a.mo56224b();
            cVar.mo56374ac(30, TimeUnit.SECONDS);
            ((C59052c) cVar.mo56372aa(47683)).mo56386p("Dropping Soda generic appflow logs due to missing SodaMetricsAppFlow.");
        }
        if (this.f53995d.isPresent()) {
            for (C66929es a3 : egVar.f181906a) {
                ((C19280r) this.f53995d.get()).mo24437a(a3);
            }
        } else if (!egVar.f181906a.isEmpty()) {
            C59052c cVar2 = (C59052c) f53992a.mo56224b();
            cVar2.mo56374ac(30, TimeUnit.SECONDS);
            ((C59052c) cVar2.mo56372aa(47682)).mo56386p("Dropping Soda streamz events due to missing SodaMetricsStreamz.");
        }
    }
}
