package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.impl;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window.C82185s;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.C130125a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.C130126b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.C130127c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.p9869b.C130122a;
import com.google.common.p4526f.C59071e;
import java.util.EnumMap;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.migration.fragment.impl.AssistLayerFragmentHostImpl */
/* compiled from: PG */
public final class AssistLayerFragmentHostImpl implements C130125a, C130126b {

    /* renamed from: a */
    public static final C59071e f356785a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.migration.fragment.impl.AssistLayerFragmentHostImpl");

    /* renamed from: b */
    public final C2393x f356786b = new C2393x(this);

    /* renamed from: c */
    public AssistLayerFragmentHostLifecycleObserver f356787c;

    /* renamed from: d */
    public final EnumMap f356788d = new EnumMap(C130127c.class);

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.migration.fragment.impl.AssistLayerFragmentHostImpl$AssistLayerFragmentHostLifecycleObserver */
    /* compiled from: PG */
    public final class AssistLayerFragmentHostLifecycleObserver implements C2376g {

        /* renamed from: a */
        public final C130146r f356789a;

        /* renamed from: b */
        public final FrameLayout f356790b;

        public AssistLayerFragmentHostLifecycleObserver(Window window, Context context, Supplier supplier, C82185s sVar) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.f356790b = frameLayout;
            frameLayout.setId(View.generateViewId());
            C130146r rVar = new C130146r();
            rVar.mo51130t(window, frameLayout, frameLayout.getContext());
            rVar.f356820h = frameLayout;
            rVar.f356821i = supplier;
            rVar.f356823k = sVar;
            this.f356789a = rVar;
        }

        /* renamed from: g */
        public final void mo109521g(Consumer consumer) {
            C130136h hVar = this.f356789a.f356819g;
            if (hVar != null) {
                consumer.accept(hVar);
            }
        }

        /* renamed from: gV */
        public final void mo3520gV(C2391v vVar) {
            this.f356789a.mo19987jP((Bundle) null);
        }

        /* renamed from: gW */
        public final void mo3521gW(C2391v vVar) {
            this.f356789a.mo51129jQ();
        }

        /* renamed from: gX */
        public final void mo3522gX(C2391v vVar) {
            this.f356789a.mo51126e();
        }

        /* renamed from: gY */
        public final void mo3523gY(C2391v vVar) {
            this.f356789a.mo51127f();
        }

        /* renamed from: gZ */
        public final void mo3524gZ(C2391v vVar) {
            this.f356789a.mo51128g();
        }

        /* renamed from: ha */
        public final void mo3525ha(C2391v vVar) {
            this.f356789a.mo22016h();
        }
    }

    /* renamed from: a */
    public final void mo109515a(Configuration configuration) {
        AssistLayerFragmentHostLifecycleObserver assistLayerFragmentHostLifecycleObserver = this.f356787c;
        if (assistLayerFragmentHostLifecycleObserver != null) {
            assistLayerFragmentHostLifecycleObserver.f356789a.mo51131u(configuration);
        }
    }

    /* renamed from: b */
    public final void mo109516b() {
        this.f356786b.mo5793e(C2382m.ON_STOP);
        this.f356786b.mo5793e(C2382m.ON_DESTROY);
        C2393x xVar = this.f356786b;
        AssistLayerFragmentHostLifecycleObserver assistLayerFragmentHostLifecycleObserver = this.f356787c;
        assistLayerFragmentHostLifecycleObserver.getClass();
        xVar.mo5791c(assistLayerFragmentHostLifecycleObserver);
    }

    /* renamed from: c */
    public final void mo109517c() {
        this.f356786b.mo5793e(C2382m.ON_PAUSE);
    }

    /* renamed from: d */
    public final void mo109518d() {
        this.f356786b.mo5793e(C2382m.ON_RESUME);
    }

    /* renamed from: e */
    public final void mo109519e(Window window, Context context, C82185s sVar) {
        AssistLayerFragmentHostLifecycleObserver assistLayerFragmentHostLifecycleObserver = this.f356787c;
        if (assistLayerFragmentHostLifecycleObserver != null) {
            assistLayerFragmentHostLifecycleObserver.f356789a.mo51129jQ();
            this.f356786b.mo5791c(this.f356787c);
        }
        AssistLayerFragmentHostLifecycleObserver assistLayerFragmentHostLifecycleObserver2 = new AssistLayerFragmentHostLifecycleObserver(window, context, new C130140l(this), sVar);
        this.f356787c = assistLayerFragmentHostLifecycleObserver2;
        this.f356786b.mo5790b(assistLayerFragmentHostLifecycleObserver2);
        this.f356786b.mo5793e(C2382m.ON_CREATE);
        this.f356786b.mo5793e(C2382m.ON_START);
    }

    public final C2384o getLifecycle() {
        return this.f356786b;
    }

    /* renamed from: f */
    public final C130122a mo109520f(C130127c cVar) {
        AssistLayerFragmentHostLifecycleObserver assistLayerFragmentHostLifecycleObserver = this.f356787c;
        assistLayerFragmentHostLifecycleObserver.getClass();
        return (C130122a) assistLayerFragmentHostLifecycleObserver.f356789a.f356818f.get(cVar);
    }
}
