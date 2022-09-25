package com.google.android.apps.search.podcasts.show;

import android.view.View;
import com.google.android.apps.search.podcasts.p10565f.C140303ax;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140645a;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.show.ak */
/* compiled from: PG */
final class C141126ak implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141128am f383155a;

    public C141126ak(C141128am amVar) {
        this.f383155a = amVar;
    }

    public final void onClick(View view) {
        C140645a aVar = (C140645a) this.f383155a.f383157a.toBuilder();
        aVar.copyOnWrite();
        ((C140646b) aVar.instance).f382007m = true;
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "showItem.toBuilder().setIsSubscribed(true).build()");
        C47393f.m84237h(new C140303ax((C140646b) build), view);
        this.f383155a.f383158b.dismiss();
    }
}
