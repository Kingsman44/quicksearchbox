package com.google.android.apps.search.podcasts.p10565f;

import android.view.View;
import com.google.android.apps.search.podcasts.p10576l.C140450al;
import com.google.android.apps.search.podcasts.p10576l.C140513y;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.f.e */
/* compiled from: PG */
final class C140309e extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ View f381163a;

    /* renamed from: b */
    final /* synthetic */ C140285af f381164b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140309e(View view, C140285af afVar) {
        super(1);
        this.f381163a = view;
        this.f381164b = afVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        C60870cx cxVar;
        C140513y yVar = ((C140450al) obj).f381517c;
        if (yVar == null) {
            yVar = C140513y.f381639d;
        }
        if (!yVar.f381643c) {
            Snackbar p = Snackbar.m79660p(this.f381163a, R.string.podcasts_download_setting_message, 0);
            p.mo48353t(R.string.podcasts_settings_tng, new C47591co(this.f381164b.f381124h, "Go to settings", new C140308d(this.f381163a)));
            p.mo48343h();
            cxVar = this.f381164b.f381127k.mo115680e();
        } else {
            cxVar = C60866ct.f164955a;
        }
        C69664n.m101060f(cxVar, "rootView: View) {\n    Ev…eVoidFuture()\n          }");
        return cxVar;
    }
}
