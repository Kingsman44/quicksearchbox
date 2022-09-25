package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9834a;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2383n;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.C129612d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.C129622f;
import com.google.apps.tiktok.inject.C47231d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.a.a */
/* compiled from: PG */
public final class C129580a implements C129612d {

    /* renamed from: a */
    private final Fragment f355657a;

    public C129580a(Fragment fragment) {
        C69664n.m101061g(fragment, "fragment");
        this.f355657a = fragment;
    }

    /* renamed from: a */
    private final C129612d m211577a() {
        Fragment parentFragment = this.f355657a.getParentFragment();
        C47231d dVar = parentFragment instanceof C47231d ? (C47231d) parentFragment : null;
        Object z = dVar != null ? dVar.mo17754z() : null;
        C129622f fVar = z instanceof C129622f ? (C129622f) z : null;
        if (fVar != null) {
            return fVar.mo109133b();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo109117b() {
        C129612d a = m211577a();
        if (a != null) {
            a.mo109117b();
        }
    }

    /* renamed from: c */
    public final boolean mo109118c() {
        if (this.f355657a.getLifecycle().mo5789a().compareTo(C2383n.CREATED) < 0) {
            C129612d a = m211577a();
            if (a != null) {
                return a.mo109118c();
            }
            return false;
        }
        throw new IllegalStateException("postponeEnterTransition must be called only in onCreate method of fragment.");
    }
}
