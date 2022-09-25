package com.google.android.apps.search.podcasts.p10601r.p10605c;

import android.view.View;
import com.google.android.apps.search.podcasts.p10565f.C140291al;
import com.google.android.apps.search.podcasts.p10576l.C140495g;
import com.google.android.apps.search.podcasts.p10576l.C140498j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3506c.C44581b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47752cq;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.r.c.c */
/* compiled from: PG */
public final class C140966c extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ View f382732a;

    /* renamed from: b */
    final /* synthetic */ C140967d f382733b;

    /* renamed from: c */
    final /* synthetic */ C140291al f382734c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140966c(View view, C140967d dVar, C140291al alVar) {
        super(1);
        this.f382732a = view;
        this.f382733b = dVar;
        this.f382734c = alVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        boolean z = false;
        if (!((Boolean) obj).booleanValue()) {
            C44581b bVar = new C44581b(this.f382732a.getContext(), 0);
            bVar.mo47604w(R.string.podcasts_gdpr_dialog_title);
            bVar.mo47597p(R.string.podcasts_gdpr_dialog_message);
            bVar.mo47601t(R.string.podcasts_gdpr_dialog_close_button, new C47752cq(this.f382733b.f382737c, "GDPR got it", new C140964a(this.f382734c, this.f382732a)));
            bVar.mo47598q(R.string.podcasts_gdpr_dialog_learn_more, new C47752cq(this.f382733b.f382737c, "Navigate to GDPR learn more", new C140965b(this.f382732a)));
            bVar.f1347a.f1333n = false;
            bVar.create().show();
            C140498j jVar = this.f382733b.f382736b;
            C46459k.m82829b(jVar.f381594a.mo46039a(new C140495g(), jVar.f381597d), "Couldn't save gdprc modal shown state", new Object[0]);
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
