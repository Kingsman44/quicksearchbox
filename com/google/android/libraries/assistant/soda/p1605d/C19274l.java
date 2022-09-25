package com.google.android.libraries.assistant.soda.p1605d;

import android.content.Context;
import com.google.speech.p5218j.C66917eg;
import com.google.speech.p5218j.C66919ei;
import com.google.speech.p5218j.C66929es;
import com.google.speech.p5218j.C66935ey;

/* renamed from: com.google.android.libraries.assistant.soda.d.l */
/* compiled from: PG */
public final class C19274l implements C19273k {

    /* renamed from: a */
    private final C19280r f53989a;

    /* renamed from: b */
    private final C19270h f53990b;

    /* renamed from: c */
    private final C19271i f53991c;

    public C19274l(Context context, C19280r rVar, C19270h hVar) {
        C19271i iVar = new C19271i(context);
        this.f53989a = rVar;
        this.f53990b = hVar;
        this.f53991c = iVar;
    }

    /* renamed from: a */
    public final void mo24436a(C66917eg egVar) {
        if (this.f53989a != null) {
            for (C66929es a : egVar.f181906a) {
                this.f53989a.mo24437a(a);
            }
        }
        if (this.f53990b != null) {
            for (C66935ey a2 : egVar.f181908c) {
                this.f53990b.mo24434a(a2);
            }
        }
        for (C66919ei a3 : egVar.f181907b) {
            this.f53991c.mo24435a(a3);
        }
    }
}
