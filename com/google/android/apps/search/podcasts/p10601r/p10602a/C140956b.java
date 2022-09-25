package com.google.android.apps.search.podcasts.p10601r.p10602a;

import android.content.DialogInterface;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.podcasts.p10576l.C140450al;
import com.google.android.apps.search.podcasts.p10576l.C140504p;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.material.p3506c.C44581b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47752cq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60845bz;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.r.a.b */
/* compiled from: PG */
public final class C140956b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Fragment f382712a;

    /* renamed from: b */
    final /* synthetic */ C140957c f382713b;

    public C140956b(Fragment fragment, C140957c cVar) {
        this.f382712a = fragment;
        this.f382713b = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C140957c.f382714a.mo56226d()).mo56382g(th);
        cVar.mo56379ah(new C59094n(41655));
        cVar.mo56386p("Failed to retrieve AADC preferences.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C140450al alVar = (C140450al) obj;
        if (alVar != null) {
            C140504p pVar = alVar.f381529o;
            if (pVar == null) {
                pVar = C140504p.f381619c;
            }
            if (pVar != null && !pVar.f381621a) {
                C44581b bVar = new C44581b(this.f382712a.requireContext(), 0);
                bVar.mo47604w(R.string.podcasts_aadc_dialog_title);
                bVar.mo47597p(R.string.podcasts_aadc_dialog_message);
                bVar.mo47601t(R.string.podcasts_explicit_content_learn_more, new C47752cq(this.f382713b.f382716c, "Navigate to AADC learn more", new C140955a(this.f382712a)));
                bVar.mo47598q(R.string.podcasts_aadc_dialog_close_button, (DialogInterface.OnClickListener) null);
                bVar.create().show();
                C46459k.m82829b(this.f382713b.f382715b.mo115694s(), "Failed to updated AADC preferences.", new Object[0]);
            }
        }
    }
}
