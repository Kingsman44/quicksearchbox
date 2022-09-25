package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.transition.Fade;
import android.transition.Transition;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80244ck;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80246cm;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.C103032a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4534f.C59081b;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.bf */
/* compiled from: PG */
public final class C103143bf implements C90919bp {

    /* renamed from: a */
    public static final C58974d f287846a = C58974d.m91136j();

    /* renamed from: b */
    public Optional f287847b = Optional.empty();

    /* renamed from: c */
    public final PieActivity f287848c;

    /* renamed from: d */
    public final C103032a f287849d;

    /* renamed from: e */
    public final AtomicBoolean f287850e = new AtomicBoolean(false);

    /* renamed from: f */
    private Optional f287851f = Optional.empty();

    public C103143bf(PieActivity pieActivity, C103032a aVar) {
        this.f287848c = pieActivity;
        this.f287849d = aVar;
        pieActivity.overridePendingTransition(R.anim.nga_pie_activity_enter, R.anim.nga_pie_activity_exit);
    }

    /* renamed from: f */
    public static void m171039f(View view) {
        view.setSystemUiVisibility(view.getSystemUiVisibility() | 16);
    }

    /* renamed from: g */
    public static void m171040g(Fragment fragment, int... iArr) {
        Transition interpolator = new Fade().setDuration(150).setInterpolator(new AccelerateInterpolator());
        for (int addTarget : iArr) {
            interpolator.addTarget(addTarget);
        }
        fragment.setEnterTransition(interpolator);
        fragment.setExitTransition(interpolator);
        fragment.setAllowEnterTransitionOverlap(true);
    }

    /* renamed from: h */
    public static void m171041h(Context context) {
        Intent intent = new Intent(context, PieActivity.class);
        intent.addFlags(805896192);
        context.startActivity(intent);
    }

    /* renamed from: b */
    public final void mo17870a(C80244ck ckVar) {
        if (!this.f287851f.equals(Optional.m71637of(ckVar))) {
            this.f287851f = Optional.m71637of(ckVar);
            Optional empty = Optional.empty();
            C80246cm cmVar = C80246cm.UI_STATE_UNKNOWN;
            C80246cm a = C80246cm.m128102a(ckVar.f220140b);
            if (a == null) {
                a = C80246cm.NO_UI;
            }
            switch (a.ordinal()) {
                case 0:
                    ((C58970a) ((C58970a) f287846a.mo56225c()).mo56372aa(21460)).mo56386p("Got unknown UI state request");
                    return;
                case 1:
                    mo93658c(false);
                    return;
                case 2:
                case 3:
                case 8:
                case 9:
                    C103155br brVar = new C103155br();
                    C68324h.m98669f(brVar);
                    C47243l.m84039a(brVar, ckVar);
                    empty = Optional.m71637of(brVar);
                    break;
                case 4:
                    C103161bx bxVar = new C103161bx();
                    C68324h.m98669f(bxVar);
                    empty = Optional.m71637of(bxVar);
                    break;
                case 5:
                    C103120aj ajVar = new C103120aj();
                    C68324h.m98669f(ajVar);
                    empty = Optional.m71637of(ajVar);
                    break;
                case 6:
                    C103133aw awVar = new C103133aw();
                    C68324h.m98669f(awVar);
                    C47243l.m84039a(awVar, ckVar);
                    empty = Optional.m71637of(awVar);
                    break;
                case 7:
                    String str = ckVar.f220141c;
                    C103138ba baVar = new C103138ba();
                    C68324h.m98669f(baVar);
                    C47243l.m84040b(baVar, str);
                    empty = Optional.m71637of(baVar);
                    break;
                case 10:
                case 11:
                case 12:
                    C103173k kVar = new C103173k();
                    C68324h.m98669f(kVar);
                    C47243l.m84039a(kVar, ckVar);
                    empty = Optional.m71637of(kVar);
                    break;
            }
            if (empty.isEmpty()) {
                ((C58970a) ((C58970a) f287846a.mo56225c()).mo56372aa(21459)).mo56386p("Fragment was not set");
                return;
            }
            ((Fragment) empty.get()).getClass().getSimpleName();
            C0154a aVar = new C0154a(this.f287848c.f727a.f739a.f744e);
            aVar.f814j = 0;
            aVar.mo689v(R.id.nga_pie_fragment_container, (Fragment) empty.get(), (String) null);
            aVar.mo505b(false);
        }
    }

    /* renamed from: c */
    public final void mo93658c(boolean z) {
        C59081b.m91349a(C58979ad.MEDIUM, "stack size");
        this.f287850e.set(!z);
        this.f287848c.finish();
        this.f287848c.overridePendingTransition(R.anim.nga_pie_activity_enter, R.anim.nga_pie_activity_exit);
    }

    /* renamed from: d */
    public final void mo93659d() {
        this.f287848c.getWindow().getDecorView().setSystemUiVisibility(5380);
        mo93660e();
    }

    /* renamed from: e */
    public final void mo93660e() {
        this.f287848c.getWindow().addFlags(-2013265408);
        if (Build.VERSION.SDK_INT == 30) {
            this.f287848c.getWindow().getDecorView().setOnApplyWindowInsetsListener(C103142be.f287845a);
        }
    }
}
