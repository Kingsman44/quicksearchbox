package com.google.android.apps.gsa.nga.engine.recognition.p6131m.p6132a;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.recognition.C77549ab;
import com.google.android.apps.gsa.nga.engine.recognition.C77557aj;
import com.google.android.apps.gsa.nga.engine.recognition.C77623f;
import com.google.android.apps.gsa.nga.engine.recognition.p6131m.C77864c;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6288j.C80471b;
import com.google.speech.recognizer.p5233a.C67464l;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.m.a.d */
/* compiled from: PG */
class C77836d implements C77549ab, C77864c {

    /* renamed from: a */
    private final C80471b f214409a;

    /* renamed from: b */
    private final C77549ab f214410b;

    /* renamed from: c */
    private C80471b f214411c = C80471b.SODA;

    public C77836d(C80471b bVar, C77549ab abVar) {
        this.f214409a = bVar;
        this.f214410b = abVar;
    }

    /* renamed from: d */
    private final synchronized Optional m124869d() {
        if (this.f214409a.equals(this.f214411c)) {
            return Optional.m71637of(this.f214410b);
        }
        return Optional.empty();
    }

    /* renamed from: e */
    private final void m124870e(Consumer consumer) {
        Optional d = m124869d();
        if (d.isPresent()) {
            consumer.accept((C77549ab) d.get());
        }
    }

    /* renamed from: a */
    public final void mo72601a(C67464l lVar, ac acVar, boolean z) {
        m124870e(new C77832a(lVar, acVar, z));
    }

    /* renamed from: c */
    public final void mo72602c(C77557aj ajVar, String str) {
        m124870e(new C77835c(ajVar, str));
    }

    /* renamed from: f */
    public final synchronized void mo72836f(C80471b bVar) {
        this.f214411c = bVar;
    }

    /* renamed from: gG */
    public final void mo72714gG(C77623f fVar) {
        m124870e(new C77834b(fVar));
    }
}
