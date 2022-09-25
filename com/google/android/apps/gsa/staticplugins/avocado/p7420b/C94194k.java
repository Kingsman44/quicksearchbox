package com.google.android.apps.gsa.staticplugins.avocado.p7420b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.assistant.settings.features.avocado.ai;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.assistant.shared.n.p;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.EnrollmentHelper;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.speech.hotword.unicornenrollment.ParentSelectorScreenView;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101495ac;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.b.k */
/* compiled from: PG */
public final class C94194k extends C83907bm {

    /* renamed from: b */
    public static final C59071e f263174b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.avocado.b.k");

    /* renamed from: c */
    public int f263175c = 1;

    /* renamed from: d */
    C9439b f263176d;

    /* renamed from: e */
    long f263177e;

    /* renamed from: f */
    public l f263178f;

    /* renamed from: g */
    public C86054o f263179g;

    /* renamed from: h */
    public C90929bz f263180h;

    /* renamed from: i */
    public C91189au f263181i;

    /* renamed from: j */
    public EnrollmentHelper f263182j;

    /* renamed from: k */
    public C92371d f263183k;

    /* renamed from: l */
    public ai f263184l;

    /* renamed from: m */
    public ParentSelectorScreenView f263185m;

    /* renamed from: n */
    public C101495ac f263186n;

    /* renamed from: e */
    public final void mo88395e(int i) {
        this.f263175c = i;
        mo77318iT().mo77312a();
    }

    public final void onCreate(Bundle bundle) {
        C83891ay.m133615a(this);
        super.onCreate(bundle);
        C58976aa aaVar = C58975e.f156826a;
        Bundle arguments = getArguments();
        this.f263176d = C9439b.m23955a(arguments.getInt("enrollment_entry_id"));
        this.f263177e = arguments.getLong("enrollment_request_id");
        this.f263182j.mo87039b(1127, this.f263176d, this.f263177e, C90584f.OK_HEY_GOOGLE);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ParentSelectorScreenView parentSelectorScreenView = (ParentSelectorScreenView) layoutInflater.inflate(R.layout.hotword_enrollment_parent_selector_screen, (ViewGroup) null);
        this.f263185m = parentSelectorScreenView;
        parentSelectorScreenView.mo87063b(false, new C94191h(this), this.f263184l.b(), false, false);
        l lVar = this.f263178f;
        p pVar = new p();
        pVar.b = C58833ax.m90833j(this.f263179g.mo79668a());
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128945a |= 1073741824;
        acv.f128970z = true;
        pVar.e((acv) acu.build());
        pVar.a = new C94192i(this);
        pVar.e = C58833ax.m90833j(getClass().getSimpleName());
        lVar.h(pVar.a());
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(R.id.hotword_enrollment_unicorn_container);
        frameLayout.addView(this.f263185m);
        return frameLayout;
    }
}
