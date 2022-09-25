package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8160b.p8161a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p098j.p099a.C1991k;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.C105772j;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.p8162a.C105752e;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.p8162a.C105753f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.material.progress.MaterialProgressBar;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.b.a.o */
/* compiled from: PG */
public final class C105736o extends C22939d {

    /* renamed from: a */
    private final C105772j f295089a;

    /* renamed from: b */
    private final C105752e f295090b;

    /* renamed from: c */
    private final Context f295091c;

    /* renamed from: d */
    private FrameLayout f295092d;

    /* renamed from: e */
    private MaterialProgressBar f295093e;

    public C105736o(C22945j jVar, C105772j jVar2, C105752e eVar, Context context) {
        super(jVar);
        this.f295089a = jVar2;
        this.f295090b = eVar;
        this.f295091c = context;
    }

    /* renamed from: e */
    public final void mo95022e(boolean z) {
        if (!z) {
            if (this.f295092d.getParentForAccessibility() instanceof View) {
                View view = (View) this.f295092d.getParentForAccessibility();
                if (new C1991k(view.createAccessibilityNodeInfo()).f5921a.isAccessibilityFocused()) {
                    view.announceForAccessibility(this.f295091c.getString(true != ((Boolean) ((C105724c) this.f295089a).f295051a.f63720e).booleanValue() ? R.string.spinner_request_completed : R.string.spinner_request_failed));
                }
            }
            this.f295093e.mo34158a();
            ((C105753f) this.f295090b).f295112a.mo28345s("onSpinnerFeatureHidden", "SpinnerEventsDispatcher", new Bundle());
            return;
        }
        this.f295093e.mo34165h();
        ((C105753f) this.f295090b).f295112a.mo28345s("onSpinnerFeatureRendered", "SpinnerEventsDispatcher", new Bundle());
    }

    /* renamed from: im */
    public final void mo28298im() {
        C105752e eVar = this.f295090b;
        ((C105753f) eVar).f295112a.mo28345s("onSpinnerFeatureDetached", "SpinnerEventsDispatcher", new Bundle());
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f295091c).inflate(R.layout.spinner_renderer_layout, (ViewGroup) null);
        this.f295092d = frameLayout;
        MaterialProgressBar materialProgressBar = (MaterialProgressBar) frameLayout.findViewById(R.id.progress_bar);
        this.f295093e = materialProgressBar;
        materialProgressBar.mo34158a();
        mo28295iC(this.f295092d);
        ((C105724c) this.f295089a).f295052b.mo28726b(new C105735n(this));
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        mo95022e(((Boolean) ((C105724c) this.f295089a).f295052b.f63720e).booleanValue());
    }
}
