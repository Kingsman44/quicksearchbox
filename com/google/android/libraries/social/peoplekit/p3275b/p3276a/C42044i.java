package com.google.android.libraries.social.peoplekit.p3275b.p3276a;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.AppCompatImageView;
import android.support.p033v7.widget.AppCompatTextView;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import androidx.core.content.C1878d;
import androidx.core.graphics.drawable.C1929b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.C41960a;
import com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers.C42023p;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitControllerLoggingRelativeLayout;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.p3281c.C42087a;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.android.libraries.social.peoplekit.configs.C42141b;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;
import com.google.android.libraries.social.peoplekit.p3273a.p3274a.C41986e;
import com.google.android.libraries.social.peoplekit.p3275b.C42046c;
import com.google.android.libraries.social.peoplekit.p3277c.p3278a.C42054d;
import com.google.android.material.button.MaterialButton;
import com.google.p4140ba.p4150c.p4151a.C54941a;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.social.peoplekit.b.a.i */
/* compiled from: PG */
public final class C42044i {

    /* renamed from: a */
    public final Activity f109845a;

    /* renamed from: b */
    public final PeopleKitControllerLoggingRelativeLayout f109846b;

    /* renamed from: c */
    public final MaterialButton f109847c;

    /* renamed from: d */
    public final PeopleKitSelectionModel f109848d;

    /* renamed from: e */
    public final PeopleKitConfig f109849e;

    /* renamed from: f */
    public final C42075e f109850f;

    /* renamed from: g */
    public final C41986e f109851g;

    /* renamed from: h */
    public final C42023p f109852h;

    /* renamed from: i */
    public final C42054d f109853i;

    /* renamed from: j */
    public final PeopleKitVisualElementPath f109854j;

    /* renamed from: k */
    public RelativeLayout f109855k;

    /* renamed from: l */
    public boolean f109856l = true;

    /* renamed from: m */
    public boolean f109857m;

    /* renamed from: n */
    public C42141b f109858n;

    /* renamed from: o */
    public C42046c f109859o;

    /* renamed from: p */
    private boolean f109860p = false;

    public C42044i(Activity activity, ExecutorService executorService, PeopleKitDataLayer peopleKitDataLayer, PeopleKitSelectionModel peopleKitSelectionModel, C42075e eVar, PeopleKitConfig peopleKitConfig, C41960a aVar, PeopleKitVisualElementPath peopleKitVisualElementPath, C42141b bVar) {
        C42075e eVar2 = eVar;
        PeopleKitConfig peopleKitConfig2 = peopleKitConfig;
        this.f109845a = activity;
        this.f109848d = peopleKitSelectionModel;
        this.f109850f = eVar2;
        this.f109849e = peopleKitConfig2;
        C42087a.m73675a(bVar);
        this.f109858n = bVar;
        PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath2.f109973a.mo44369a(new C41952a(C54941a.f144443F));
        peopleKitVisualElementPath2.mo44564a(peopleKitVisualElementPath.f109973a);
        this.f109854j = peopleKitVisualElementPath2;
        eVar2.mo44577c(-1, peopleKitVisualElementPath2);
        C42087a.m73676b(this.f109858n);
        PeopleKitControllerLoggingRelativeLayout peopleKitControllerLoggingRelativeLayout = (PeopleKitControllerLoggingRelativeLayout) LayoutInflater.from(activity).inflate(R.layout.peoplekit_maximized_view, (ViewGroup) null);
        this.f109846b = peopleKitControllerLoggingRelativeLayout;
        peopleKitControllerLoggingRelativeLayout.f109970a = eVar2;
        peopleKitControllerLoggingRelativeLayout.f109971b = peopleKitVisualElementPath2;
        PeopleKitVisualElementPath peopleKitVisualElementPath3 = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath3.f109973a.mo44369a(new C41952a(C54941a.f144448K));
        peopleKitVisualElementPath3.mo44564a(peopleKitVisualElementPath2.f109973a);
        eVar2.mo44577c(-1, peopleKitVisualElementPath3);
        MaterialButton materialButton = (MaterialButton) peopleKitControllerLoggingRelativeLayout.findViewById(R.id.peoplekit_maxview_send_button_action_bar);
        this.f109847c = materialButton;
        Activity activity2 = activity;
        ExecutorService executorService2 = executorService;
        PeopleKitDataLayer peopleKitDataLayer2 = peopleKitDataLayer;
        PeopleKitSelectionModel peopleKitSelectionModel2 = peopleKitSelectionModel;
        C42075e eVar3 = eVar;
        PeopleKitConfig peopleKitConfig3 = peopleKitConfig;
        C42023p pVar = r8;
        C42023p pVar2 = new C42023p(activity2, executorService2, peopleKitDataLayer2, peopleKitSelectionModel2, eVar3, peopleKitConfig3, aVar, peopleKitVisualElementPath2, bVar);
        this.f109852h = pVar;
        C41986e eVar4 = r8;
        C42141b bVar2 = bVar;
        C41986e eVar5 = new C41986e(activity2, executorService2, peopleKitDataLayer2, peopleKitSelectionModel2, eVar3, peopleKitConfig3, peopleKitVisualElementPath2, bVar2);
        this.f109851g = eVar4;
        eVar4.f109627c.f109671f = aVar;
        pVar.f109724a.addOnLayoutChangeListener(new C42036a(this));
        C42054d dVar = new C42054d(activity2, peopleKitConfig, peopleKitSelectionModel, aVar, peopleKitDataLayer, eVar, peopleKitVisualElementPath2, bVar2);
        this.f109853i = dVar;
        PeopleKitConfigImpl peopleKitConfigImpl = (PeopleKitConfigImpl) peopleKitConfig2;
        if (peopleKitConfigImpl.f110242i) {
            dVar.mo44540c();
        }
        if (peopleKitConfigImpl.f110241h) {
            dVar.mo44540c();
            materialButton.setOnClickListener(new C42037b(this, peopleKitDataLayer, peopleKitSelectionModel, aVar, activity, eVar));
        }
        mo44527b();
    }

    /* renamed from: a */
    public final void mo44526a(boolean z) {
        if (this.f109856l) {
            if (z) {
                if (!this.f109860p) {
                    this.f109855k.animate().translationY(0.0f).setDuration(100).setInterpolator(new DecelerateInterpolator()).setListener(new C42042g(this)).start();
                    this.f109855k.setVisibility(0);
                    this.f109860p = true;
                }
            } else if (this.f109860p) {
                if (this.f109853i.f109908c.hasFocus()) {
                    ((InputMethodManager) this.f109845a.getSystemService("input_method")).hideSoftInputFromWindow(this.f109846b.getWindowToken(), 0);
                }
                this.f109855k.animate().translationY((float) this.f109845a.getResources().getDimensionPixelSize(R.dimen.peoplekit_maxview_message_bar_translation)).setDuration(100).setInterpolator(new DecelerateInterpolator()).setListener(new C42043h(this)).start();
                this.f109860p = false;
            }
        }
    }

    /* renamed from: b */
    public final void mo44527b() {
        int i = this.f109858n.f110282a;
        if (i != 0) {
            this.f109846b.setBackgroundColor(C1878d.m5128a(this.f109845a, i));
            this.f109846b.findViewById(R.id.peoplekit_maxview_messagebar).setBackgroundColor(C1878d.m5128a(this.f109845a, this.f109858n.f110282a));
            this.f109846b.findViewById(R.id.peoplekit_maxview_top_container).setBackgroundColor(C1878d.m5128a(this.f109845a, this.f109858n.f110282a));
        }
        if (this.f109858n.f110285d != 0) {
            this.f109846b.findViewById(R.id.peoplekit_maxview_app_bar_layout).setBackgroundColor(C1878d.m5128a(this.f109845a, this.f109858n.f110285d));
        }
        int i2 = this.f109858n.f110290i;
        if (i2 != 0) {
            int a = C1878d.m5128a(this.f109845a, i2);
            ((AppCompatTextView) this.f109846b.findViewById(R.id.peoplekit_maxview_action_bar_title)).setTextColor(a);
            ((AppCompatTextView) this.f109846b.findViewById(R.id.peoplekit_maxview_action_bar_subtitle)).setTextColor(a);
        }
        int i3 = this.f109858n.f110295n;
        if (i3 != 0) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) this.f109846b.findViewById(R.id.peoplekit_maxview_close_button);
            Drawable drawable = appCompatImageView.getDrawable();
            C1929b.m5225f(drawable.mutate(), C1878d.m5128a(this.f109845a, i3));
            appCompatImageView.setImageDrawable(drawable);
        }
        int i4 = this.f109858n.f110299r;
        if (i4 != 0) {
            this.f109847c.mo47556m(ColorStateList.valueOf(C1878d.m5128a(this.f109845a, i4)));
        }
        int i5 = this.f109858n.f110297p;
        if (i5 != 0) {
            this.f109847c.setTextColor(C1878d.m5128a(this.f109845a, i5));
        }
        mo44528c();
        mo44529d();
    }

    /* renamed from: c */
    public final void mo44528c() {
        C42087a.m73676b(this.f109858n);
        Window window = this.f109845a.getWindow();
        int i = this.f109858n.f110283b;
        if (i != 0) {
            window.setStatusBarColor(C1878d.m5128a(this.f109845a, i));
            window.setNavigationBarColor(C1878d.m5128a(this.f109845a, this.f109858n.f110283b));
        }
    }

    /* renamed from: d */
    public final void mo44529d() {
        C42087a.m73676b(this.f109858n);
        Window window = this.f109845a.getWindow();
        View decorView = window.getDecorView();
        int i = this.f109858n.f110283b;
        if (i == 0 || i == R.color.google_white) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8208);
            window.addFlags(LinearLayoutManager.INVALID_OFFSET);
            return;
        }
        decorView.setSystemUiVisibility(0);
        window.addFlags(0);
    }
}
