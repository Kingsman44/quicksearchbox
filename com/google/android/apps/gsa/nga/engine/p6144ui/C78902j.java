package com.google.android.apps.gsa.nga.engine.p6144ui;

import com.google.android.apps.gsa.nga.engine.p6144ui.answer.C78043ap;
import com.google.android.apps.gsa.nga.engine.p6144ui.answer.C78071j;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80390c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import p3186j$.util.Objects;

@Deprecated
/* renamed from: com.google.android.apps.gsa.nga.engine.ui.j */
/* compiled from: PG */
public final class C78902j implements C78018a {

    /* renamed from: a */
    public final C78088b f217119a;

    /* renamed from: b */
    private final C22871g f217120b;

    public C78902j(C78088b bVar, C22871g gVar) {
        this.f217119a = bVar;
        this.f217120b = gVar;
    }

    /* renamed from: a */
    public final C80390c mo72962a() {
        return this.f217119a.f215074a.f215043f;
    }

    /* renamed from: b */
    public final void mo72963b() {
        C22871g gVar = this.f217120b;
        C78088b bVar = this.f217119a;
        Objects.requireNonNull(bVar);
        gVar.mo28212l("[NGA] ThreadSafeNgaUiController.cancelConfirmCancelCard", new C78163e(bVar));
    }

    /* renamed from: c */
    public final void mo72964c() {
        C22871g gVar = this.f217120b;
        C78088b bVar = this.f217119a;
        Objects.requireNonNull(bVar);
        gVar.mo28212l("[NGA] ThreadSafeNgaUiController.confirmConfirmCancelCard", new C78108d(bVar));
    }

    /* renamed from: d */
    public final void mo72965d() {
        C22871g gVar = this.f217120b;
        C78088b bVar = this.f217119a;
        Objects.requireNonNull(bVar);
        gVar.mo28212l("[NGA] ThreadSafeNgaUiController.hide", new C78898g(bVar));
    }

    /* renamed from: e */
    public final void mo72966e(String str) {
        this.f217120b.mo28212l("[NGA] ThreadSafeNgaUiController.showAnswerText", new C78900h(this, str));
    }

    /* renamed from: f */
    public final void mo72967f(C78071j jVar) {
        this.f217120b.mo28212l("[NGA] ThreadSafeNgaUiController.showAnswerUi", new C78901i(this, jVar));
    }

    /* renamed from: g */
    public final void mo72968g(C78043ap apVar) {
        this.f217120b.mo28212l("[NGA] ThreadSafeNgaUiController.showConfirmCancelAction", new C78896f(this, apVar));
    }

    /* renamed from: h */
    public final boolean mo72969h() {
        return this.f217119a.f215074a.mo73056h();
    }
}
