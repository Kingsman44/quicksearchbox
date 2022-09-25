package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.C130126b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.C130127c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.impl.AssistLayerFragmentHostImpl;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.impl.C130141m;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.impl.C130142n;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.impl.C130144p;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.impl.C130146r;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.window.ak */
/* compiled from: PG */
public final /* synthetic */ class C82134ak implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ AssistLayerFragmentCompositor f224539a;

    /* renamed from: b */
    public final /* synthetic */ Map.Entry f224540b;

    public /* synthetic */ C82134ak(AssistLayerFragmentCompositor assistLayerFragmentCompositor, Map.Entry entry) {
        this.f224539a = assistLayerFragmentCompositor;
        this.f224540b = entry;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        AssistLayerFragmentCompositor assistLayerFragmentCompositor = this.f224539a;
        Map.Entry entry = this.f224540b;
        if (((Boolean) obj).booleanValue()) {
            Function k = ((C82160bj) entry.getValue()).mo75517k();
            C130126b bVar = assistLayerFragmentCompositor.f224508a;
            C130127c cVar = (C130127c) entry.getKey();
            AssistLayerFragmentHostImpl assistLayerFragmentHostImpl = (AssistLayerFragmentHostImpl) bVar;
            if (assistLayerFragmentHostImpl.f356788d.isEmpty()) {
                AssistLayerFragmentHostImpl.AssistLayerFragmentHostLifecycleObserver assistLayerFragmentHostLifecycleObserver = assistLayerFragmentHostImpl.f356787c;
                assistLayerFragmentHostLifecycleObserver.getClass();
                int i = C130144p.f356811a;
                C130146r rVar = assistLayerFragmentHostLifecycleObserver.f356789a;
                if (rVar.f356822j) {
                    C28306ab.m52931g(rVar.mo22017i());
                }
            }
            assistLayerFragmentHostImpl.f356788d.put(cVar, k);
            AssistLayerFragmentHostImpl.AssistLayerFragmentHostLifecycleObserver assistLayerFragmentHostLifecycleObserver2 = assistLayerFragmentHostImpl.f356787c;
            assistLayerFragmentHostLifecycleObserver2.getClass();
            assistLayerFragmentHostLifecycleObserver2.mo109521g(new C130142n(cVar, k));
            return;
        }
        C130126b bVar2 = assistLayerFragmentCompositor.f224508a;
        C130127c cVar2 = (C130127c) entry.getKey();
        AssistLayerFragmentHostImpl assistLayerFragmentHostImpl2 = (AssistLayerFragmentHostImpl) bVar2;
        assistLayerFragmentHostImpl2.f356788d.remove(cVar2);
        AssistLayerFragmentHostImpl.AssistLayerFragmentHostLifecycleObserver assistLayerFragmentHostLifecycleObserver3 = assistLayerFragmentHostImpl2.f356787c;
        assistLayerFragmentHostLifecycleObserver3.getClass();
        assistLayerFragmentHostLifecycleObserver3.mo109521g(new C130141m(cVar2));
    }
}
