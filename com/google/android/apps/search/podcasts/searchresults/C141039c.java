package com.google.android.apps.search.podcasts.searchresults;

import android.view.View;
import com.google.android.apps.search.podcasts.p10565f.C140290ak;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.searchresults.c */
/* compiled from: PG */
final class C141039c implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141037b f382898a;

    public C141039c(C141037b bVar) {
        this.f382898a = bVar;
    }

    public final void onClick(View view) {
        String str;
        C141041e eVar;
        C141045i iVar = this.f382898a.f382884b;
        int i = iVar.f382908a;
        if (i == 1) {
            str = ((C141043g) iVar.f382909b).f382905a;
        } else {
            if (i == 2) {
                eVar = (C141041e) iVar.f382909b;
            } else {
                eVar = C141041e.f382899c;
            }
            str = eVar.f382901a;
        }
        C69664n.m101060f(str, "if (args.hasQuery()) {\n …ult.title\n              }");
        C47393f.m84236g(new C140290ak("http://www.google.com/search?q=".concat(String.valueOf(str))), this.f382898a.f382885c);
    }
}
