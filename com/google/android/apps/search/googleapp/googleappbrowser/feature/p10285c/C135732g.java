package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10285c;

import android.animation.ValueAnimator;
import android.support.p031v4.app.C0167am;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.p10309b.C136072b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.web.contrib.p3367d.p3368a.C43465b;
import com.google.android.libraries.web.contrib.p3367d.p3368a.p3369a.C43464b;
import com.google.android.libraries.web.contrib.p3367d.p3370b.C43466a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58893dc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.c.g */
/* compiled from: PG */
public final class C135732g {

    /* renamed from: a */
    public static final C59071e f369705a = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.feature.c.g");

    /* renamed from: l */
    private static final Duration f369706l = Duration.ofMillis(250);

    /* renamed from: b */
    public final AccountId f369707b;

    /* renamed from: c */
    public final InputMethodManager f369708c;

    /* renamed from: d */
    public final C43466a f369709d;

    /* renamed from: e */
    public final C46801dp f369710e;

    /* renamed from: f */
    public final C47770dh f369711f;

    /* renamed from: g */
    public final C136072b f369712g;

    /* renamed from: h */
    public final C28306ab f369713h;

    /* renamed from: i */
    public final C135727b f369714i;

    /* renamed from: j */
    public ValueAnimator f369715j;

    /* renamed from: k */
    public final C43464b f369716k;

    /* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.c.g$a */
    /* compiled from: PG */
    final class C135733a implements C46792di {
        public C135733a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C135732g.f369705a.mo56226d()).mo56382g(th)).mo56372aa(40604)).mo56386p("Failed to fetch FindInPageState.");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C43465b bVar = (C43465b) obj;
            if (!bVar.f113547g) {
                C135732g.this.f369712g.mo112730a("WHY_NOT_SHOW_THE_ACTION_BUTTONS");
                return;
            }
            TextView textView = (TextView) C135732g.this.f369714i.requireView().findViewById(R.id.googleapp_browser_findinpage_number_of_matches);
            ImageButton imageButton = (ImageButton) C135732g.this.f369714i.requireView().findViewById(R.id.googleapp_browser_findinpage_next_match);
            ImageButton imageButton2 = (ImageButton) C135732g.this.f369714i.requireView().findViewById(R.id.googleapp_browser_findinpage_previous_match);
            C58893dc.m90996a(textView);
            int i = 0;
            textView.setText(C135732g.this.f369714i.getResources().getString(R.string.gab_findinpage_match_position, new Object[]{Integer.valueOf(bVar.f113542b), Integer.valueOf(bVar.f113543c)}));
            C58893dc.m90996a(textView);
            if (true != bVar.f113544d) {
                i = 8;
            }
            textView.setVisibility(i);
            C58893dc.m90996a(imageButton);
            imageButton.setEnabled(bVar.f113545e);
            C58893dc.m90996a(imageButton2);
            imageButton2.setEnabled(bVar.f113545e);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C135732g(AccountId accountId, C135727b bVar, C47770dh dhVar, C43464b bVar2, C46801dp dpVar, C43466a aVar, C136072b bVar3, C28306ab abVar) {
        this.f369707b = accountId;
        this.f369714i = bVar;
        this.f369711f = dhVar;
        this.f369710e = dpVar;
        this.f369716k = bVar2;
        this.f369709d = aVar;
        this.f369712g = bVar3;
        this.f369713h = abVar;
        this.f369708c = (InputMethodManager) bVar.requireActivity().getSystemService("input_method");
    }

    /* renamed from: a */
    public final void mo112512a() {
        View view;
        C0167am activity = this.f369714i.getActivity();
        if (activity != null) {
            view = activity.getCurrentFocus();
            if (view == null) {
                view = this.f369714i.getView();
            }
        } else {
            view = null;
        }
        if (view != null) {
            this.f369708c.hideSoftInputFromWindow(view.getWindowToken(), 0);
            view.clearFocus();
        }
    }

    /* renamed from: b */
    public final void mo112513b() {
        mo112514c(new C135728c(this));
    }

    /* renamed from: c */
    public final void mo112514c(Runnable runnable) {
        ValueAnimator valueAnimator = this.f369715j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{1}).setDuration(f369706l.toMillis());
        this.f369715j = duration;
        duration.addListener(new C135731f(runnable));
        this.f369715j.start();
    }
}
