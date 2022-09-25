package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7608d;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.C97095j;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.C97096k;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.C97102q;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.p7602b.C97087a;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.C97137ai;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.C97192c;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97213a;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97219g;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97040c;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.d.g */
/* compiled from: PG */
public final class C97201g implements C97192c {

    /* renamed from: a */
    public final int f271568a;

    /* renamed from: b */
    public final float f271569b;

    /* renamed from: c */
    private final Context f271570c;

    /* renamed from: d */
    private final C97040c f271571d;

    /* renamed from: e */
    private final DisplayManager f271572e;

    /* renamed from: f */
    private final C97102q f271573f;

    /* renamed from: g */
    private final C97087a f271574g;

    /* renamed from: h */
    private final int f271575h;

    public C97201g(Context context, C97040c cVar, C86124t tVar, C97087a aVar, C97102q qVar) {
        this.f271570c = context;
        this.f271571d = cVar;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        displayManager.getClass();
        this.f271572e = displayManager;
        this.f271574g = aVar;
        this.f271573f = qVar;
        this.f271575h = (int) tVar.mo79743a(C90110fh.f250683bm);
        this.f271568a = (int) tVar.mo79743a(C90110fh.f250682bl);
        this.f271569b = (float) tVar.mo79747m(C90110fh.f250681bk);
    }

    /* renamed from: g */
    public static void m160888g(View view, float f, int i) {
        view.animate().cancel();
        view.animate().setDuration(800).alpha(f).setStartDelay((long) (i * 1000)).start();
    }

    /* renamed from: h */
    private final View m160889h() {
        FrameLayout frameLayout;
        int i = this.f271575h;
        if (i == 3) {
            frameLayout = (FrameLayout) LayoutInflater.from(this.f271570c).inflate(R.layout.text_and_voice, (ViewGroup) null);
            View findViewById = frameLayout.findViewById(R.id.search_bubble_text_icon_imageview_container_left);
            View findViewById2 = frameLayout.findViewById(R.id.search_bubble_text_icon_imageview_container_right);
            View findViewById3 = frameLayout.findViewById(R.id.search_bubble_voice_icon_imageview_container_left);
            View findViewById4 = frameLayout.findViewById(R.id.search_bubble_voice_icon_imageview_container_right);
            C58528ij K = C58528ij.m90011K(findViewById2, findViewById);
            C97087a aVar = this.f271574g;
            Objects.requireNonNull(aVar);
            m160890i(K, new C97195a(aVar));
            C58528ij K2 = C58528ij.m90011K(findViewById3, findViewById4);
            C97087a aVar2 = this.f271574g;
            Objects.requireNonNull(aVar2);
            m160890i(K2, new C97196b(aVar2));
            m160891j(frameLayout, R.id.dual_bubble_container_left, R.id.dual_bubble_container_center, R.id.dual_bubble_container_right);
        } else {
            FrameLayout frameLayout2 = (FrameLayout) LayoutInflater.from(this.f271570c).inflate(R.layout.collapsed, (ViewGroup) null);
            if (i == 1) {
                for (ImageView imageResource : C58528ij.m90012L((ImageView) frameLayout2.findViewById(R.id.search_bubble_icon_in_center), (ImageView) frameLayout2.findViewById(R.id.search_bubble_icon_in_left), (ImageView) frameLayout2.findViewById(R.id.search_bubble_icon_in_right))) {
                    imageResource.setImageResource(R.drawable.search_bubble_voice_icon);
                }
                this.f271574g.mo90439i();
            } else {
                this.f271574g.mo90438h();
            }
            m160891j(frameLayout2, R.id.left_search_bubble_container, R.id.center_search_bubble_container, R.id.right_search_bubble_container);
            frameLayout = frameLayout2;
        }
        frameLayout.addOnLayoutChangeListener(new C97199e(frameLayout));
        int i2 = this.f271568a;
        if (i2 != -1) {
            m160888g(frameLayout, this.f271569b, i2);
            m160890i(new C58759qy(frameLayout), new C97200f(this, frameLayout));
        }
        return frameLayout;
    }

    /* renamed from: i */
    private static void m160890i(C58528ij ijVar, Runnable runnable) {
        C58800sl lA = ijVar.iterator();
        while (lA.hasNext()) {
            ((View) lA.next()).setOnTouchListener(new C97197c(runnable));
        }
    }

    /* renamed from: j */
    private final void m160891j(View view, int i, int i2, int i3) {
        float f = ((C97213a) C97219g.m160926b(this.f271572e)).f271607a;
        View view2 = view;
        view.getViewTreeObserver().addOnPreDrawListener(new C97198d(view2, view.findViewById(i), view.findViewById(i2), view.findViewById(i3), (int) f));
    }

    /* renamed from: a */
    public final View mo90573a() {
        return m160889h();
    }

    /* renamed from: b */
    public final View mo90574b() {
        return m160889h();
    }

    /* renamed from: c */
    public final C60870cx mo90575c() {
        return C60856cj.m92900i(new ArrayList());
    }

    /* renamed from: d */
    public final void mo90576d() {
        C97102q qVar = this.f271573f;
        C97040c cVar = this.f271571d;
        C97095j f = C97096k.m160726f();
        f.mo90448c(this.f271570c.getString(R.string.search_bubble_notification_header));
        f.mo90447b(this.f271570c.getString(R.string.search_bubble_notification_description));
        qVar.mo90469b(cVar, f.mo90446a());
    }

    /* renamed from: e */
    public final void mo90577e(C97137ai aiVar) {
    }

    /* renamed from: f */
    public final boolean mo90578f() {
        return false;
    }
}
