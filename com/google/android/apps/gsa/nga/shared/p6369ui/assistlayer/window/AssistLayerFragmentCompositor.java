package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window;

import android.view.View;
import androidx.annotation.C0826b;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81820m;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.C130126b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.impl.AssistLayerFragmentHostImpl;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.impl.C130143o;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import java.util.Map;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.window.AssistLayerFragmentCompositor */
/* compiled from: PG */
public final class AssistLayerFragmentCompositor implements C82144au, C2376g {

    /* renamed from: a */
    public final C130126b f224508a;

    /* renamed from: b */
    final C83358h f224509b;

    /* renamed from: c */
    final C83358h f224510c;

    /* renamed from: d */
    final C83358h f224511d;

    /* renamed from: e */
    private final C58495hd f224512e;

    /* renamed from: f */
    private final C83363m f224513f = new C83363m();

    public AssistLayerFragmentCompositor(C130126b bVar, Map map) {
        this.f224508a = bVar;
        C58495hd hdVar = (C58495hd) Collection.EL.stream(map.entrySet()).sorted(C82137an.f224543a).collect(C58370cn.m89403c(C82141ar.f224547a, C82142as.f224548a, C82126ac.f224531a));
        this.f224512e = hdVar;
        C58485gu guVar = (C58485gu) Collection.EL.stream(hdVar.entrySet()).map(C82142as.f224548a).collect(C58370cn.f155946a);
        this.f224509b = C83349aj.m132657l(C0826b.class, (C58528ij) Collection.EL.stream(guVar).map(C82127ad.f224532a).collect(C58370cn.f155947b), C82128ae.f224533a);
        this.f224510c = (C83358h) Collection.EL.stream(guVar).map(C82129af.f224534a).reduce(C82130ag.f224535a).orElse(new C83361k(C81820m.f223773b, C0826b.class));
        this.f224511d = C83349aj.m132657l(C0826b.class, (C58528ij) Collection.EL.stream(guVar).map(C82131ah.f224536a).collect(C58370cn.f155947b), C82138ao.f224544a);
        C83349aj.m132657l(C0826b.class, (C58528ij) Collection.EL.stream(guVar).map(C82139ap.f224545a).collect(C58370cn.f155947b), C82140aq.f224546a);
    }

    /* renamed from: a */
    public final View mo75217a() {
        AssistLayerFragmentHostImpl.AssistLayerFragmentHostLifecycleObserver assistLayerFragmentHostLifecycleObserver = ((AssistLayerFragmentHostImpl) this.f224508a).f356787c;
        assistLayerFragmentHostLifecycleObserver.getClass();
        return assistLayerFragmentHostLifecycleObserver.f356790b;
    }

    /* renamed from: b */
    public final C83358h mo75218b() {
        return this.f224509b;
    }

    /* renamed from: c */
    public final C83358h mo75219c() {
        return this.f224511d;
    }

    /* renamed from: d */
    public final C83358h mo75220d() {
        return this.f224510c;
    }

    /* renamed from: e */
    public final void mo75221e() {
        ((AssistLayerFragmentHostImpl) this.f224508a).f356786b.mo5790b(this);
    }

    /* renamed from: f */
    public final void mo75222f() {
        ((AssistLayerFragmentHostImpl) this.f224508a).f356786b.mo5791c(this);
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        C58800sl lA = this.f224512e.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            this.f224513f.mo76663c(((C82160bj) entry.getValue()).mo75514h(), new C82134ak(this, entry));
            ((C82160bj) entry.getValue()).mo75518l();
        }
    }

    /* renamed from: gW */
    public final void mo3521gW(C2391v vVar) {
        this.f224513f.mo76661a();
        C58800sl lA = this.f224512e.entrySet().iterator();
        while (lA.hasNext()) {
            ((C82160bj) ((Map.Entry) lA.next()).getValue()).mo75519m();
        }
        AssistLayerFragmentHostImpl assistLayerFragmentHostImpl = (AssistLayerFragmentHostImpl) this.f224508a;
        assistLayerFragmentHostImpl.f356788d.clear();
        AssistLayerFragmentHostImpl.AssistLayerFragmentHostLifecycleObserver assistLayerFragmentHostLifecycleObserver = assistLayerFragmentHostImpl.f356787c;
        assistLayerFragmentHostLifecycleObserver.getClass();
        assistLayerFragmentHostLifecycleObserver.mo109521g(C130143o.f356810a);
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

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}
