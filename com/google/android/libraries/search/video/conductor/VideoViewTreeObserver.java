package com.google.android.libraries.search.video.conductor;

import android.support.p031v4.app.Fragment;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.apps.tiktok.tracing.C47751cp;
import com.google.apps.tiktok.tracing.C47755ct;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.androidx.TracedDefaultLifecycleObserver;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
public final class VideoViewTreeObserver {

    /* renamed from: a */
    final Set f108360a = new CopyOnWriteArraySet();

    /* renamed from: b */
    boolean f108361b;

    /* renamed from: c */
    public final Fragment f108362c;

    /* renamed from: d */
    public final C47770dh f108363d;

    /* renamed from: e */
    public final ViewTreeObserver.OnGlobalLayoutListener f108364e;

    /* renamed from: f */
    public final ViewTreeObserver.OnScrollChangedListener f108365f;

    /* renamed from: g */
    public final ViewTreeObserver.OnWindowFocusChangeListener f108366g;

    /* renamed from: h */
    private final C2376g f108367h;

    public VideoViewTreeObserver(Fragment fragment, C47770dh dhVar) {
        C414771 r0 = new C2376g() {
            /* renamed from: gV */
            public final /* synthetic */ void mo3520gV(C2391v vVar) {
            }

            /* renamed from: gW */
            public final /* synthetic */ void mo3521gW(C2391v vVar) {
            }

            /* renamed from: gX */
            public final void mo3522gX(C2391v vVar) {
                VideoViewTreeObserver videoViewTreeObserver = VideoViewTreeObserver.this;
                View view = videoViewTreeObserver.f108362c.getView();
                if (view != null) {
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    viewTreeObserver.removeOnScrollChangedListener(videoViewTreeObserver.f108365f);
                    viewTreeObserver.removeOnWindowFocusChangeListener(videoViewTreeObserver.f108366g);
                    viewTreeObserver.removeOnGlobalLayoutListener(videoViewTreeObserver.f108364e);
                }
                VideoViewTreeObserver.this.mo44002c(false);
            }

            /* renamed from: gY */
            public final void mo3523gY(C2391v vVar) {
                VideoViewTreeObserver videoViewTreeObserver = VideoViewTreeObserver.this;
                View view = videoViewTreeObserver.f108362c.getView();
                if (view != null) {
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    viewTreeObserver.addOnScrollChangedListener(videoViewTreeObserver.f108365f);
                    viewTreeObserver.addOnGlobalLayoutListener(videoViewTreeObserver.f108364e);
                    viewTreeObserver.addOnWindowFocusChangeListener(videoViewTreeObserver.f108366g);
                    videoViewTreeObserver.mo44002c(view.hasWindowFocus());
                }
            }

            /* renamed from: gZ */
            public final /* synthetic */ void mo3524gZ(C2391v vVar) {
            }

            /* renamed from: ha */
            public final /* synthetic */ void mo3525ha(C2391v vVar) {
            }
        };
        this.f108367h = r0;
        this.f108362c = fragment;
        this.f108363d = dhVar;
        this.f108365f = new C47751cp(dhVar, new C41483f(this));
        this.f108364e = new C47755ct(dhVar, new C41484g(this));
        this.f108366g = new C41485h(this);
        fragment.getLifecycle().mo5790b(new TracedDefaultLifecycleObserver(r0));
    }

    /* renamed from: a */
    public final void mo44000a() {
        for (C41489l lVar : this.f108360a) {
            lVar.mo44010b();
            lVar.mo44009a();
        }
    }

    /* renamed from: b */
    public final void mo44001b() {
        for (C41489l lVar : this.f108360a) {
            lVar.mo44010b();
            lVar.mo44009a();
        }
    }

    /* renamed from: c */
    public final void mo44002c(boolean z) {
        if (this.f108361b != z) {
            this.f108361b = z;
            for (C41489l lVar : this.f108360a) {
                boolean z2 = this.f108361b;
                if (lVar.f108386c != z2) {
                    lVar.f108386c = z2;
                    lVar.mo44010b();
                    lVar.mo44009a();
                }
            }
        }
    }
}
