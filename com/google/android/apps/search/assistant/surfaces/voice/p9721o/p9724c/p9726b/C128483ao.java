package com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9726b;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C1878d;
import androidx.core.p094f.C1888a;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9725a.C128467a;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d.C128541f;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d.C128543h;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9793c.C129024a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3505b.C44535e;
import com.google.android.material.p3508e.C44654a;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.o.c.b.ao */
/* compiled from: PG */
public final class C128483ao {

    /* renamed from: a */
    public static final C59071e f353347a = C59071e.m91331h();

    /* renamed from: l */
    private static final Duration f353348l = Duration.ofMillis(500);

    /* renamed from: b */
    public final C47770dh f353349b;

    /* renamed from: c */
    public final C128467a f353350c;

    /* renamed from: d */
    public final C46801dp f353351d;

    /* renamed from: e */
    public final C128533y f353352e;

    /* renamed from: f */
    public final boolean f353353f;

    /* renamed from: g */
    public final boolean f353354g;

    /* renamed from: h */
    public final boolean f353355h;

    /* renamed from: i */
    public final C129024a f353356i;

    /* renamed from: j */
    public ViewPropertyAnimator f353357j;

    /* renamed from: k */
    public final AtomicReference f353358k = new AtomicReference(C128543h.f353464i);

    /* renamed from: m */
    private final boolean f353359m;

    /* renamed from: n */
    private ViewPropertyAnimator f353360n;

    public C128483ao(C47770dh dhVar, C128467a aVar, C46801dp dpVar, C128533y yVar, boolean z, boolean z2, boolean z3, boolean z4, C129024a aVar2) {
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(aVar, "warmActionsUiDataService");
        C69664n.m101061g(dpVar, "subscriptionMixin");
        this.f353349b = dhVar;
        this.f353350c = aVar;
        this.f353351d = dpVar;
        this.f353352e = yVar;
        this.f353359m = z;
        this.f353353f = z2;
        this.f353354g = z3;
        this.f353355h = z4;
        this.f353356i = aVar2;
    }

    /* renamed from: m */
    static /* synthetic */ void m209656m(C128483ao aoVar, C128543h hVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            Object obj = aoVar.f353358k.get();
            C69664n.m101060f(obj, "lastDescriptor.get()");
            hVar = (C128543h) obj;
        }
        if ((i2 & 2) != 0) {
            i = -2;
        }
        Configuration configuration = aoVar.mo108466e().getResources().getConfiguration();
        C69664n.m101060f(configuration, "containerView.resources.configuration");
        aoVar.mo108467f(hVar, i, C128484ap.m209673b(configuration));
    }

    /* renamed from: n */
    public static final void m209657n(View view, int i) {
        View requireViewById = view.requireViewById(i);
        C69664n.m101060f(requireViewById, "requireViewById<FrameLayout>(resourceId)");
        FrameLayout frameLayout = (FrameLayout) requireViewById;
        Drawable background = frameLayout.getBackground();
        C69664n.m101059e(background, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        Drawable drawable = ((LayerDrawable) background).getDrawable(0);
        C69664n.m101059e(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        int c = C44535e.m78720c(frameLayout.getContext(), R.attr.colorSurface, 0);
        C44654a aVar = new C44654a(frameLayout.getContext());
        Context context = frameLayout.getContext();
        C69664n.m101060f(context, "container.context");
        ((GradientDrawable) drawable).setColor(aVar.mo47886a(c, context.getResources().getDimension(R.dimen.assistant_guacamole_pill_elevation)));
    }

    /* renamed from: o */
    private final ViewPropertyAnimator m209658o(View view, ViewPropertyAnimator viewPropertyAnimator, float f, C69626l lVar) {
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (view.getVisibility() != 0) {
            view.setAlpha(0.0f);
            view.setVisibility(0);
        }
        ViewPropertyAnimator listener = view.animate().alpha(f).setDuration(f353348l.toMillis()).setListener(new C128469aa(this, lVar, view));
        C69664n.m101060f(listener, "@SuppressWarnings(\"GoodT…  }\n        }\n      )\n  }");
        return listener;
    }

    /* renamed from: p */
    private final void m209659p(boolean z) {
        TextView textView = (TextView) this.f353352e.requireView().findViewById(R.id.assistant_guacamole_pill_phrase);
        if (textView != null) {
            ViewParent parentForAccessibility = textView.getParentForAccessibility();
            C69664n.m101059e(parentForAccessibility, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parentForAccessibility;
            Object obj = this.f353358k.get();
            C69664n.m101060f(obj, "lastDescriptor.get()");
            C128543h hVar = (C128543h) obj;
            viewGroup.setContentDescription(viewGroup.getResources().getString(true != z ? R.string.assistant_guacamole_opened_popup_pill_content_description : R.string.assistant_guacamole_closed_popup_pill_content_description, new Object[]{hVar.f353469d}));
        }
    }

    /* renamed from: a */
    public final ViewPropertyAnimator mo108462a(View view, ViewPropertyAnimator viewPropertyAnimator) {
        return m209658o(view, viewPropertyAnimator, 1.0f, C128534z.f353444a);
    }

    /* renamed from: b */
    public final ViewPropertyAnimator mo108463b(View view, ViewPropertyAnimator viewPropertyAnimator, C69626l lVar) {
        return m209658o(view, viewPropertyAnimator, 0.0f, new C128471ac(view, lVar));
    }

    /* renamed from: c */
    public final FrameLayout mo108464c() {
        View requireViewById = this.f353352e.requireView().requireViewById(R.id.assistant_guacamole_pill_container);
        C69664n.m101060f(requireViewById, "fragment.requireView().r…guacamole_pill_container)");
        return (FrameLayout) requireViewById;
    }

    /* renamed from: d */
    public final FrameLayout mo108465d() {
        View requireViewById = this.f353352e.requireView().requireViewById(R.id.assistant_guacamole_popup_container);
        C69664n.m101060f(requireViewById, "fragment.requireView().r…uacamole_popup_container)");
        return (FrameLayout) requireViewById;
    }

    /* renamed from: e */
    public final RelativeLayout mo108466e() {
        View requireViewById = this.f353352e.requireView().requireViewById(R.id.assistant_guacamole_container);
        C69664n.m101060f(requireViewById, "fragment.requireView().r…tant_guacamole_container)");
        return (RelativeLayout) requireViewById;
    }

    /* renamed from: f */
    public final void mo108467f(C128543h hVar, int i, boolean z) {
        C79570b bVar;
        int i2;
        Resources resources = mo108466e().getResources();
        boolean z2 = hVar.f353472g;
        boolean z3 = hVar.f353471f;
        C128541f a = C128541f.m209785a(hVar.f353467b);
        if (a == null) {
            a = C128541f.WARM_ACTIONS_UI_BEHAVIOR_UNSPECIFIED;
        }
        if (a == C128541f.ANSWERING) {
            bVar = C79570b.CALL_NUMBER;
        } else {
            bVar = C79570b.m127648a(hVar.f353468c);
            if (bVar == null) {
                bVar = C79570b.CONTEXT_TYPE_UNSPECIFIED;
            }
            C69664n.m101060f(bVar, "descriptor.contextType");
        }
        if (z3 && !z2) {
            boolean z4 = this.f353353f;
            i2 = R.dimen.assistant_guacamole_pill_le_lockscreen_spacing_top;
            if (!z4 && !this.f353354g && !this.f353355h) {
                i2 = R.dimen.assistant_guacamole_pill_lockscreen_spacing_top;
            }
        } else if (z) {
            int ordinal = bVar.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i2 = R.dimen.assistant_guacamole_pill_notification_spacing_top_timer_landscape;
                } else if (ordinal == 7 || ordinal == 8) {
                    i2 = R.dimen.assistant_guacamole_pill_notification_spacing_top_call_landscape;
                } else if (ordinal == 11) {
                    i2 = R.dimen.assistant_guacamole_pill_notification_spacing_top_media_landscape;
                }
            }
            i2 = R.dimen.assistant_guacamole_pill_notification_spacing_top_alarm_landscape;
        } else {
            int ordinal2 = bVar.ordinal();
            if (ordinal2 != 1) {
                if (ordinal2 == 2) {
                    i2 = R.dimen.assistant_guacamole_pill_notification_spacing_top_timer_portrait;
                } else if (ordinal2 == 7 || ordinal2 == 8) {
                    i2 = R.dimen.assistant_guacamole_pill_notification_spacing_top_call_portrait;
                } else if (ordinal2 == 11) {
                    i2 = R.dimen.assistant_guacamole_pill_notification_spacing_top_media_portrait;
                }
            }
            i2 = R.dimen.assistant_guacamole_pill_notification_spacing_top_alarm_portrait;
        }
        int dimensionPixelOffset = resources.getDimensionPixelOffset(i2);
        if (C1888a.m5150d()) {
            if (!z) {
                dimensionPixelOffset -= mo108466e().getResources().getDimensionPixelOffset(R.dimen.assistant_guacamole_sysbar_spacing_portrait);
            }
            if (z) {
                dimensionPixelOffset += mo108466e().getResources().getDimensionPixelOffset(R.dimen.assistant_guacamole_sysbar_spacing_landscape);
            }
        }
        if (i == -2) {
            RelativeLayout e = mo108466e();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 1;
            layoutParams.setMargins(0, dimensionPixelOffset, 0, 0);
            e.setLayoutParams(layoutParams);
            mo108466e().setPadding(0, 0, 0, 0);
        } else if (i == -1) {
            mo108466e().setPadding(0, dimensionPixelOffset, 0, 0);
            RelativeLayout e2 = mo108466e();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            layoutParams2.gravity = 1;
            layoutParams2.setMargins(0, 0, 0, 0);
            e2.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: g */
    public final void mo108468g() {
        if (this.f353354g) {
            mo108464c().setBackground(mo108464c().getContext().getDrawable(R.drawable.assistant_guacamole_background_ripple_le));
        }
    }

    /* renamed from: h */
    public final void mo108469h() {
        if (this.f353354g) {
            mo108464c().setBackgroundTintList(ColorStateList.valueOf(C1878d.m5128a(mo108464c().getContext(), R.color.assistant_quick_phrases_pill_le_fill_color)));
            C128484ap.m209672a(mo108465d());
        }
        if (this.f353359m || this.f353353f || this.f353355h) {
            C128484ap.m209672a(mo108464c());
            C128484ap.m209672a(mo108465d());
        }
    }

    /* renamed from: i */
    public final void mo108470i(C69626l lVar) {
        this.f353360n = mo108463b(mo108465d(), this.f353360n, lVar);
    }

    /* renamed from: j */
    public final void mo108471j() {
        if (mo108465d().getVisibility() == 0) {
            mo108470i(C128472ad.f353334a);
            m209659p(true);
            return;
        }
        this.f353360n = mo108462a(mo108465d(), this.f353360n);
        m209659p(false);
    }

    /* renamed from: k */
    public final void mo108472k(View view) {
        Context context = this.f353352e.getContext();
        C69664n.m101058d(context);
        Object systemService = context.getSystemService("accessibility");
        C69664n.m101059e(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        boolean z = false;
        if (((AccessibilityManager) systemService).isEnabled() && view.getVisibility() == 0) {
            z = true;
        }
        C59052c cVar = (C59052c) f353347a.mo56224b();
        Boolean valueOf = Boolean.valueOf(z);
        cVar.mo56379ah(new C59094n(38874));
        cVar.mo56389s("#MWW Updating focusable value to %s.", valueOf);
        this.f353350c.f353324b.mo109510b(valueOf);
    }

    /* renamed from: l */
    public final void mo108473l(View view) {
        Rect rect = new Rect();
        if (view.getVisibility() == 0) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i = iArr[0];
            rect = new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
        }
        this.f353350c.f353325c.mo109510b(rect);
    }
}
