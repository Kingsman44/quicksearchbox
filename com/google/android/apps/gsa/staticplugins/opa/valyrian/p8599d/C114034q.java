package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0395p;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.PopupMenu;
import androidx.core.content.C1877c;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.assistant.shared.p5829r.C73906a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.C113715c;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.C113716d;
import com.google.android.apps.gsa.staticplugins.opa.util.C113766ai;
import com.google.android.apps.gsa.staticplugins.opa.util.C113768ak;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8597b.C113954b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.p2185ve.p2199f.C28421h;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.features.C30495a;
import com.google.android.libraries.onegoogle.accountmenu.features.C30518b;
import com.google.android.libraries.onegoogle.accountmenu.features.C30606g;
import com.google.android.libraries.onegoogle.accountmenu.features.C30630m;
import com.google.android.libraries.onegoogle.accountmenu.features.C30631n;
import com.google.android.libraries.onegoogle.accountmenu.features.p2359a.C30507d;
import com.google.android.libraries.onegoogle.accountmenu.features.p2359a.C30508e;
import com.google.android.libraries.onegoogle.accountmenu.features.p2361b.C30519a;
import com.google.android.libraries.onegoogle.accountmenu.features.p2361b.C30521c;
import com.google.android.libraries.onegoogle.accountmenu.gmshead.C30645a;
import com.google.android.libraries.onegoogle.accountmenu.gmshead.C30647c;
import com.google.android.libraries.onegoogle.accountmenu.gmshead.GmsheadAccountsModelUpdater;
import com.google.android.libraries.onegoogle.accountmenu.p2353c.C30343m;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30474o;
import com.google.android.libraries.onegoogle.owners.C31012n;
import com.google.android.libraries.onegoogle.owners.C31016r;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.d.q */
/* compiled from: PG */
public final class C114034q {

    /* renamed from: a */
    public static final Duration f315713a = Duration.ofMillis(300);

    /* renamed from: b */
    private static final Interpolator f315714b = C91107f.m148859b(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: c */
    private static final Interpolator f315715c = C91107f.m148859b(0.0f, 0.0f, 0.0f, 1.0f);

    /* renamed from: d */
    private static final Interpolator f315716d = C91107f.m148859b(1.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: a */
    public static Animator m188805a(View view, Animator.AnimatorListener animatorListener) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat.setDuration(100);
        ofFloat.setInterpolator(f315714b);
        ofFloat.addListener(animatorListener);
        return ofFloat;
    }

    /* renamed from: b */
    public static Animator m188806b(View view, Animator.AnimatorListener animatorListener) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, 0.0f});
        ofFloat.setDuration(80);
        ofFloat.setInterpolator(f315714b);
        ofFloat.addListener(animatorListener);
        return ofFloat;
    }

    /* renamed from: c */
    public static AnimatorSet m188807c(View view, float f, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        Interpolator interpolator = f315715c;
        if (!z) {
            f = -f;
        }
        animatorSet.playTogether(new Animator[]{m188821q(view, interpolator, f, 0.0f, 30), m188820p(view, f315714b, 0.0f, 1.0f, 30)});
        return animatorSet;
    }

    /* renamed from: d */
    public static AnimatorSet m188808d(View view, float f, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        Interpolator interpolator = f315716d;
        if (z) {
            f = -f;
        }
        animatorSet.playTogether(new Animator[]{m188821q(view, interpolator, 0.0f, f, 0), m188820p(view, f315714b, 1.0f, 0.0f, 110)});
        return animatorSet;
    }

    /* renamed from: e */
    public static ViewTreeObserver.OnPreDrawListener m188809e(View view, View view2, C113716d dVar, C113715c cVar, C21370a aVar, C86124t tVar, C22871g gVar) {
        C86124t tVar2 = tVar;
        return new C114032o(tVar2, view, cVar, dVar, aVar, gVar, view2, (int) tVar2.mo79743a(C90029ch.f248273bg));
    }

    /* renamed from: f */
    public static ViewTreeObserver.OnPreDrawListener m188810f(View view, View view2, C113716d dVar, C113715c cVar, C21370a aVar, C86124t tVar, C22871g gVar) {
        return new C114028k(tVar, view, cVar, dVar, aVar, gVar, view2);
    }

    /* renamed from: g */
    public static void m188811g(View view, Animator animator, Animator animator2) {
        m188812h(animator);
        if (view.isShown()) {
            m188815k(animator2);
        } else {
            animator2.end();
        }
    }

    /* renamed from: h */
    public static void m188812h(Animator animator) {
        if (animator.isStarted()) {
            animator.cancel();
        }
    }

    /* renamed from: i */
    public static void m188813i(Activity activity, View view, PopupMenu.OnMenuItemClickListener onMenuItemClickListener, C113768ak akVar, C58833ax axVar, C73906a aVar, C91097g gVar) {
        if (view != null) {
            PopupMenu popupMenu = new PopupMenu(activity, view, 5);
            popupMenu.getMenuInflater().inflate(R.menu.opa_menu, popupMenu.getMenu());
            akVar.getClass();
            popupMenu.setOnMenuItemClickListener(new C113766ai(akVar, onMenuItemClickListener));
            MenuItem findItem = popupMenu.getMenu().findItem(R.id.opa_menu_my_activity);
            if (findItem != null) {
                findItem.setVisible(false);
                findItem.setEnabled(false);
            }
            if (!aVar.mo65438a()) {
                popupMenu.getMenu().removeItem(R.id.opa_menu_transparency_disclosure);
            }
            view.setOnClickListener(akVar.mo100609a(28978, popupMenu.getMenu(), new C89943l(new C114024g(axVar, activity, new C114022e(popupMenu), gVar))));
        }
    }

    /* renamed from: j */
    public static void m188814j(C86124t tVar, View view) {
        if (tVar.mo79746e(C90029ch.f248220aG)) {
            view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: k */
    public static void m188815k(Animator animator) {
        if (!animator.isStarted()) {
            animator.start();
        }
    }

    /* renamed from: l */
    public static void m188816l(View view) {
        view.setTranslationY(0.0f);
        view.setAlpha(1.0f);
    }

    /* renamed from: m */
    public static void m188817m(View view, Animator animator, Animator animator2) {
        m188812h(animator2);
        if (!view.isShown()) {
            m188815k(animator);
        }
    }

    /* renamed from: n */
    public static void m188818n(ImageView imageView, SelectedAccountDisc selectedAccountDisc, Activity activity, C58833ax axVar, Runnable runnable, C113954b bVar, C91097g gVar, C86124t tVar, C28421h hVar) {
        if (imageView != null) {
            if (!tVar.mo79746e(C90029ch.f248274bh)) {
                imageView.setOnClickListener(new C89943l(new C114024g(axVar, activity, new C114018a(runnable, gVar, bVar, imageView), gVar)));
            } else if (selectedAccountDisc != null) {
                C30630m k = C30631n.m57247k();
                k.mo36303d(activity.getString(R.string.opa_google_activity_control));
                Drawable a = C1877c.m5125a(activity, R.drawable.quantum_gm_ic_google_gm_grey_24);
                a.getClass();
                C30606g gVar2 = (C30606g) k;
                gVar2.f82676a = a;
                gVar2.f82677b = C114019b.f315666a;
                C30631n a2 = k.mo36300a();
                C30495a a3 = C30518b.m56960a();
                C30507d a4 = C30508e.m56929a();
                a4.mo36152c(C58485gu.m89846n(a2));
                a3.mo36134f(a4.mo36138a());
                a3.mo36131c(C58485gu.m89847o(C30521c.m56984b(activity, "Assistant", C114020c.f315667a), C30519a.m56981a(activity, C114021d.f315668a)));
                C30518b a5 = a3.mo36129a();
                C31016r rVar = new C31016r();
                rVar.f83519a = activity.getApplicationContext();
                C31012n a6 = rVar.mo36683a();
                hVar.getClass();
                C30305n a7 = C30645a.m57296a(activity, hVar, (C30474o) null, a5, a6);
                C2391v vVar = (C2391v) activity;
                C31016r rVar2 = new C31016r();
                rVar2.f83519a = activity.getApplicationContext();
                GmsheadAccountsModelUpdater a8 = C30647c.m57297a(a7, rVar2.mo36683a());
                vVar.getLifecycle().mo5790b(a8);
                a8.mo3524gZ(vVar);
                C0395p pVar = (C0395p) activity;
                C19559g.m37304c();
                selectedAccountDisc.mo35805c(pVar);
                pVar.getClass();
                new C30343m(pVar, (Fragment) null, a7, selectedAccountDisc).mo35905c();
            }
        }
    }

    /* renamed from: o */
    public static void m188819o(ImageView imageView, C113954b bVar) {
        if (imageView != null) {
            bVar.mo100815a(imageView);
        }
    }

    /* renamed from: p */
    private static Animator m188820p(View view, Interpolator interpolator, float f, float f2, int i) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{f, f2});
        ofFloat.setDuration(130);
        ofFloat.setInterpolator(interpolator);
        ofFloat.setStartDelay((long) i);
        return ofFloat;
    }

    /* renamed from: q */
    private static Animator m188821q(View view, Interpolator interpolator, float f, float f2, int i) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{f, f2});
        ofFloat.setDuration(250);
        ofFloat.setInterpolator(interpolator);
        ofFloat.setStartDelay((long) i);
        return ofFloat;
    }
}
