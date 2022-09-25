package com.google.android.libraries.search.video.conductor;

import android.graphics.Rect;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.search.video.conductor.l */
/* compiled from: PG */
public final class C41489l {

    /* renamed from: a */
    final Set f108384a = new HashSet();

    /* renamed from: b */
    public final Map f108385b = new HashMap();

    /* renamed from: c */
    boolean f108386c;

    /* renamed from: d */
    public boolean f108387d;

    /* renamed from: e */
    public final View.OnAttachStateChangeListener f108388e;

    public C41489l(VideoViewTreeObserver videoViewTreeObserver) {
        videoViewTreeObserver.f108360a.add(this);
        this.f108386c = videoViewTreeObserver.f108361b;
        this.f108388e = new C41486i(this);
    }

    /* renamed from: a */
    public final void mo44009a() {
        if (this.f108387d) {
            this.f108387d = false;
            for (C41487j f : this.f108384a) {
                f.mo43998f(this);
            }
        }
    }

    /* renamed from: b */
    public final void mo44010b() {
        C41488k kVar;
        for (View view : new HashSet(this.f108385b.keySet())) {
            if (!view.isAttachedToWindow() || !this.f108386c) {
                kVar = C41488k.INVISIBLE;
            } else {
                Rect rect = new Rect();
                if (!view.getGlobalVisibleRect(rect)) {
                    kVar = C41488k.INVISIBLE;
                } else if (Math.abs(rect.width() - view.getWidth()) > 1 || Math.abs(rect.height() - view.getHeight()) > 1) {
                    kVar = C41488k.PARTIAL;
                } else {
                    kVar = C41488k.VISIBLE;
                }
            }
            if (kVar != this.f108385b.get(view)) {
                this.f108387d = true;
                this.f108385b.put(view, kVar);
            }
        }
    }
}
