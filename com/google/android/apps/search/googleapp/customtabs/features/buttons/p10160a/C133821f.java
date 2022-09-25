package com.google.android.apps.search.googleapp.customtabs.features.buttons.p10160a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133706a;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133709aa;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133731q;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133734t;
import com.google.android.apps.search.googleapp.saves.p10388b.C137230y;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1703d.C20642af;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.buttons.a.f */
/* compiled from: PG */
final class C133821f implements C133734t, C133709aa {

    /* renamed from: a */
    public static final C59071e f364492a = C59071e.m91332i("com.google.android.apps.search.googleapp.customtabs.features.buttons.a.f");

    /* renamed from: b */
    public static final C60845bz f364493b = new C133820e();

    /* renamed from: c */
    public final C137230y f364494c;

    /* renamed from: d */
    public final Executor f364495d;

    /* renamed from: e */
    public final C60836bq f364496e = new C60836bq();

    /* renamed from: f */
    public final AtomicReference f364497f = new AtomicReference((Object) null);

    /* renamed from: g */
    private final Context f364498g;

    /* renamed from: h */
    private final C133731q f364499h;

    public C133821f(C137230y yVar, Executor executor, Context context, C133731q qVar) {
        this.f364494c = yVar;
        this.f364495d = executor;
        this.f364498g = context;
        this.f364499h = qVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo111366a(int i) {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo111367b() {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo111368c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo111369d() {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo111370e() {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo111351f(C20642af afVar) {
    }

    /* renamed from: g */
    public final void mo111352g(int i, Uri uri, Uri uri2) {
        boolean z = false;
        if (uri != null && !uri.equals((Uri) this.f364497f.getAndSet(uri))) {
            z = true;
        }
        if (i == 5 || z) {
            C60870cx b = this.f364496e.mo57305b(C47810es.m84965e(new C133818c(this)), this.f364495d);
            C60845bz bzVar = f364493b;
            C60856cj.m92911t(b, C47810es.m84974n(bzVar), this.f364495d);
        }
    }

    /* renamed from: h */
    public final C60870cx mo111407h(boolean z) {
        Resources resources = this.f364498g.getResources();
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, z ? R.drawable.quantum_gm_ic_bookmark_gm_grey_48 : R.drawable.quantum_gm_ic_bookmark_border_gm_grey_48);
        String string = resources.getString(true != z ? R.string.ga_custom_tabs_save_description : R.string.ga_custom_tabs_unsave_description);
        C133731q qVar = this.f364499h;
        return C60856cj.m92904m(C47810es.m84978r(new C133706a(qVar, decodeResource, string)), qVar.f364232a);
    }
}
