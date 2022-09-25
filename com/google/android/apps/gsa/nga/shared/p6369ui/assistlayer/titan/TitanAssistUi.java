package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.titan;

import androidx.annotation.C0826b;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81560c;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81820m;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window.C82145av;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window.C82155be;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window.C82156bf;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window.C82160bj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.C130126b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.C130127c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.impl.AssistLayerFragmentHostImpl;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.p9869b.C130122a;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9767g.p9768a.C128873c;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.titan.TitanAssistUi */
/* compiled from: PG */
public final class TitanAssistUi implements C82160bj, C2376g {

    /* renamed from: a */
    private final C130126b f224475a;

    /* renamed from: b */
    private final C83363m f224476b = new C83363m();

    /* renamed from: c */
    private final C128873c f224477c;

    /* renamed from: d */
    private final C82145av f224478d;

    public TitanAssistUi(C130126b bVar, C82156bf bfVar, C128873c cVar) {
        this.f224475a = bVar;
        C81560c cVar2 = C81560c.TITAN_VOICE_PLATE;
        C82155be a = bfVar.f224575c.mo75527a(new C83361k(true, C0826b.class), cVar2.name());
        bfVar.f224574b.put(cVar2, a);
        this.f224478d = new C82145av(a);
        this.f224477c = cVar;
    }

    /* renamed from: g */
    public final C83358h mo75513g() {
        return new C83361k(false, C0826b.class);
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        C130122a f = this.f224475a.mo109520f(C130127c.TITAN_VOICE_PLATE);
        if (f != null) {
            C82145av avVar = this.f224478d;
            Objects.requireNonNull(avVar);
            f.f356780a = new C82111a(avVar);
        }
    }

    /* renamed from: gW */
    public final void mo3521gW(C2391v vVar) {
        C130122a f = this.f224475a.mo109520f(C130127c.TITAN_VOICE_PLATE);
        if (f != null) {
            f.f356780a = null;
        }
        this.f224478d.mo75524a();
        this.f224476b.mo76661a();
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
        return this.f224478d.f224551a.f224565b;
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }

    /* renamed from: i */
    public final C83358h mo75515i() {
        return new C83361k(true, C0826b.class);
    }

    /* renamed from: j */
    public final C83358h mo75516j() {
        return new C83361k(C81820m.m130060e(), C0826b.class);
    }

    /* renamed from: k */
    public final Function mo75517k() {
        Objects.requireNonNull(this.f224477c);
        return new C82112b();
    }

    /* renamed from: l */
    public final void mo75518l() {
        ((AssistLayerFragmentHostImpl) this.f224475a).f356786b.mo5790b(this);
    }

    /* renamed from: m */
    public final void mo75519m() {
        ((AssistLayerFragmentHostImpl) this.f224475a).f356786b.mo5791c(this);
    }
}
