package com.google.android.libraries.web.contrib.p3388h;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C2383n;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2168g;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.browser.internal.C43308t;
import com.google.android.libraries.web.browser.internal.p3352a.C43284c;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.contrib.h.r */
/* compiled from: PG */
public final class C43626r {

    /* renamed from: a */
    public static final C59071e f113870a = C59071e.m91332i("com.google.android.libraries.web.contrib.h.r");

    /* renamed from: b */
    public final C46428ao f113871b;

    /* renamed from: c */
    private final C60888db f113872c;

    /* renamed from: d */
    private final boolean f113873d;

    public C43626r(C46428ao aoVar, C60888db dbVar, Optional optional) {
        this.f113871b = aoVar;
        this.f113872c = dbVar;
        this.f113873d = optional.orElse(null) == C43271v.WEB_LAYER;
    }

    /* renamed from: a */
    public static Bitmap m76983a(View view) {
        Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
        view.getLocalVisibleRect(rect);
        Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        view.computeScroll();
        canvas.translate((float) (-view.getScrollX()), (float) (-view.getScrollY()));
        view.draw(canvas);
        return createBitmap;
    }

    /* renamed from: d */
    public static void m76984d(C43861g gVar, boolean z, Consumer consumer) {
        C43308t a = gVar.mo17754z().mo46873a(C44082a.f114755a);
        C43284c.m76381a(a.f113152b).mo46395c(z, new C43615g(consumer));
    }

    /* renamed from: e */
    private static Window m76985e(Fragment fragment) {
        Object host = fragment.getHost();
        if (host instanceof C47215a) {
            return ((C47215a) host).mo51123r();
        }
        if (host instanceof Activity) {
            return ((Activity) host).getWindow();
        }
        ((C59052c) ((C59052c) f113870a.mo56226d()).mo56372aa(54110)).mo56386p("Could not retrieve a Window from Fragment: no supported host.");
        return null;
    }

    /* renamed from: f */
    private static void m76986f(View view, C43625q qVar) {
        if (view.getVisibility() == 0) {
            if (view instanceof SurfaceView) {
                C43861g gVar = null;
                try {
                    Fragment parentFragment = FragmentManager.m262e((SurfaceView) view).getParentFragment();
                    if (parentFragment instanceof C43861g) {
                        gVar = (C43861g) parentFragment;
                    } else {
                        ((C59052c) ((C59052c) f113870a.mo56226d()).mo56372aa(54111)).mo56386p("Ignoring a SurfaceView that is not in a Browser/WebFragment.");
                    }
                } catch (IllegalStateException e) {
                    ((C59052c) ((C59052c) ((C59052c) f113870a.mo56226d()).mo56382g(e)).mo56372aa(54112)).mo56386p("Ignoring a SurfaceView not in any Fragment.");
                }
                if (gVar != null && gVar.f114305a.f6612c.mo5788a(C2383n.STARTED)) {
                    qVar.f113868b.add(gVar);
                    qVar.f113867a = true;
                    if (qVar.f113869c == null) {
                        qVar.f113869c = m76985e(gVar);
                    }
                }
            } else if (view instanceof TextureView) {
                qVar.f113867a = true;
                if (qVar.f113869c == null) {
                    try {
                        qVar.f113869c = m76985e(FragmentManager.m262e(view));
                    } catch (IllegalStateException e2) {
                        ((C59052c) ((C59052c) ((C59052c) f113870a.mo56224b()).mo56382g(e2)).mo56372aa(54117)).mo56386p("TextureView not in any Fragment.");
                    }
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m76986f(viewGroup.getChildAt(i), qVar);
                }
            }
        }
    }

    /* renamed from: b */
    public final C60870cx mo46653b(View view) {
        C19559g.m37304c();
        try {
            C43625q qVar = new C43625q();
            m76986f(view, qVar);
            if (!qVar.f113867a) {
                return C60856cj.m92900i(m76983a(view));
            }
            C43624p pVar = new C43624p(view, qVar.f113869c, qVar.f113868b);
            view.addOnAttachStateChangeListener(new C43623o(pVar));
            if (pVar.f113865b == null) {
                return C60856cj.m92899h(new IllegalStateException("No Window found for the root view."));
            }
            C60870cx a = C2169h.m6027a(new C43618j(this, qVar, new C43617i(this, new AtomicInteger(qVar.f113868b.size()), pVar), pVar));
            ((C2168g) a).f6144b.mo4106b(new C43619k(pVar), this.f113872c);
            return a;
        } catch (OutOfMemoryError e) {
            ((C59052c) ((C59052c) ((C59052c) f113870a.mo56226d()).mo56382g(e)).mo56372aa(54113)).mo56386p("Get screenshot failed due to memory error.");
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: c */
    public final void mo46654c(C43624p pVar, C2164c cVar) {
        View view = pVar.f113864a;
        if (view == null || pVar.f113865b == null) {
            cVar.mo5439d(new IllegalStateException("View or View's Window null"));
            return;
        }
        int[] iArr = new int[2];
        Rect rect = new Rect();
        view.getLocationInWindow(iArr);
        view.getGlobalVisibleRect(rect);
        int i = iArr[0];
        Rect rect2 = new Rect(i, iArr[1], rect.width() + i, iArr[1] + rect.height());
        C43614f fVar = new C43614f(this, pVar, rect2, Bitmap.createBitmap(rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), cVar);
        if (this.f113873d) {
            C60872cz d = this.f113872c.mo29164d(fVar, 1, TimeUnit.SECONDS);
            C43622n nVar = new C43622n(pVar, cVar);
            C60856cj.m92911t(d, C47810es.m84974n(nVar), C60826bg.f164896a);
            return;
        }
        try {
            fVar.run();
        } catch (IllegalArgumentException e) {
            ((C59052c) ((C59052c) ((C59052c) f113870a.mo56226d()).mo56382g(e)).mo56372aa(54118)).mo56386p("Failed use PixelCopy#request. The window may not have a backing surface");
            cVar.mo5437b(m76983a(view));
        }
    }
}
