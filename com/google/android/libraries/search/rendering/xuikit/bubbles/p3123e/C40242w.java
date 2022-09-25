package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e;

import android.graphics.Bitmap;
import com.google.android.gms.feedback.C144206k;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b.C40201l;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b.C40203n;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b.C40208s;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3128d.C40219b;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3146a.p3147a.C40497a;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3159f.C40537f;
import com.google.apps.tiktok.monitoring.feedback.C47465c;
import com.google.apps.tiktok.monitoring.feedback.C47474k;
import com.google.apps.tiktok.monitoring.feedback.C47475l;
import com.google.apps.tiktok.monitoring.feedback.C47477n;
import com.google.common.base.C58833ax;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.w */
/* compiled from: PG */
public final /* synthetic */ class C40242w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40165ak f105710a;

    public /* synthetic */ C40242w(C40165ak akVar) {
        this.f105710a = akVar;
    }

    public final void run() {
        C40165ak akVar = this.f105710a;
        akVar.f105510q.mo42182e();
        C40219b bVar = akVar.f105498e;
        Optional empty = Optional.empty();
        C40203n nVar = (C40203n) ((C40201l) bVar).f105619b.f105590a.mo51122q().f634a.mo671c("XBubbleFragment");
        nVar.getClass();
        C40208s f = nVar.mo17754z();
        C69664n.m101061g(empty, "screenshot");
        C47477n nVar2 = f.f105647i;
        C47474k g = C47475l.m84477g();
        C47465c cVar = (C47465c) g;
        cVar.f123249a = "com.google.android.googlequicksearchbox.USER_INITIATED_FEEDBACK_REPORT";
        cVar.f123251c = C58833ax.m90834k((Bitmap) empty.orElse(C144206k.m234450b(f.f105642d.getView())));
        C40537f b = f.mo42313b();
        C40497a.m70211a(g, b != null ? b.mo17754z().f106400c : null);
        nVar2.mo51336a(g.mo51332e());
    }
}
