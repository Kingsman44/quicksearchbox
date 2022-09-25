package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.warmactions;

import androidx.annotation.C0826b;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81560c;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81819l;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81820m;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window.C82156bf;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window.C82160bj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83356f;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9725a.C128467a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.C130121b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.C130126b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.impl.AssistLayerFragmentHostImpl;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.p9868a.C130120b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.warmactions.WarmActionsAssistUi */
/* compiled from: PG */
public final class WarmActionsAssistUi implements C82160bj, C2376g {

    /* renamed from: a */
    public static final Duration f224483a = Duration.ofSeconds(1);

    /* renamed from: b */
    public final C83363m f224484b = new C83363m();

    /* renamed from: c */
    public final C83356f f224485c;

    /* renamed from: d */
    public final C83357g f224486d;

    /* renamed from: e */
    public final C22871g f224487e;

    /* renamed from: f */
    public final C81819l f224488f;

    /* renamed from: g */
    public final C81564g f224489g;

    /* renamed from: h */
    private final C83357g f224490h;

    /* renamed from: i */
    private final C22871g f224491i;

    /* renamed from: j */
    private final C130126b f224492j;

    /* renamed from: k */
    private final C83358h f224493k;

    public WarmActionsAssistUi(C22871g gVar, C22871g gVar2, C81819l lVar, C130126b bVar, C82156bf bfVar, C81564g gVar3) {
        C83356f fVar = new C83356f(false, C0826b.class);
        this.f224485c = fVar;
        this.f224486d = new C83361k(C81820m.f223773b, C0826b.class);
        this.f224490h = new C83361k(false, C0826b.class);
        this.f224487e = gVar;
        this.f224491i = gVar2;
        this.f224488f = lVar;
        this.f224492j = bVar;
        this.f224489g = gVar3;
        this.f224493k = bfVar.mo75526a(fVar, C81560c.WARM_WORDS);
    }

    /* renamed from: g */
    public final C83358h mo75513g() {
        return new C83361k(false, C0826b.class);
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        AssistLayerFragmentHostImpl.AssistLayerFragmentHostLifecycleObserver assistLayerFragmentHostLifecycleObserver = ((AssistLayerFragmentHostImpl) this.f224492j).f356787c;
        assistLayerFragmentHostLifecycleObserver.getClass();
        C128467a aVar = assistLayerFragmentHostLifecycleObserver.f356789a.f356814b;
        C82115b bVar = new C82115b(this);
        C130120b bVar2 = aVar.f353323a;
        C19559g.m37304c();
        bVar2.f356778d.set(bVar);
        this.f224484b.mo76662b(this.f224488f.mo75167t(), new C82116c(aVar));
        aVar.f353325c.mo109509a(new C82117d(this));
        C130121b bVar3 = aVar.f353324b;
        C83357g gVar = this.f224490h;
        Objects.requireNonNull(gVar);
        bVar3.mo109509a(new C82118e(gVar));
        AssistLayerFragmentHostImpl.AssistLayerFragmentHostLifecycleObserver assistLayerFragmentHostLifecycleObserver2 = ((AssistLayerFragmentHostImpl) this.f224492j).f356787c;
        assistLayerFragmentHostLifecycleObserver2.getClass();
        assistLayerFragmentHostLifecycleObserver2.f356789a.f356815c.f353445a.mo109509a(new C82119f(this));
        this.f224491i.mo28212l("[NGA] WarmActionsAssistUi.onAssistUiCreate", new C82120g(this));
    }

    /* renamed from: gW */
    public final void mo3521gW(C2391v vVar) {
        this.f224484b.mo76661a();
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: h */
    public final C83358h mo75514h() {
        return this.f224493k;
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }

    /* renamed from: i */
    public final C83358h mo75515i() {
        return this.f224490h;
    }

    /* renamed from: j */
    public final C83358h mo75516j() {
        return this.f224486d;
    }

    /* renamed from: k */
    public final Function mo75517k() {
        return C82121h.f224501a;
    }

    /* renamed from: l */
    public final void mo75518l() {
        ((AssistLayerFragmentHostImpl) this.f224492j).f356786b.mo5790b(this);
    }

    /* renamed from: m */
    public final void mo75519m() {
        ((AssistLayerFragmentHostImpl) this.f224492j).f356786b.mo5791c(this);
        this.f224485c.mo76660b(false);
    }
}
