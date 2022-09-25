package com.google.android.apps.search.podcasts.p10573k.p10575b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.google.android.apps.search.podcasts.p10576l.C140497i;
import com.google.android.apps.search.podcasts.p10576l.C140498j;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import java.util.List;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.k.b.a */
/* compiled from: PG */
final class C140434a extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ Context f381472a;

    /* renamed from: b */
    final /* synthetic */ C140436c f381473b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140434a(Context context, C140436c cVar) {
        super(1);
        this.f381472a = context;
        this.f381473b = cVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            Intent component = new Intent("com.google.android.app.podcasts.PROMPT_NOTIFICATION_PERMISSION").setComponent(new ComponentName("com.google.android.apps.podcasts", "com.google.android.apps.podcasts.PodcastsActivity"));
            C69664n.m101060f(component, "Intent(PROMPT_PERMISSION…AGE, SHELL_APP_ACTIVITY))");
            List<ResolveInfo> queryIntentActivities = this.f381472a.getPackageManager().queryIntentActivities(component, 65536);
            C69664n.m101060f(queryIntentActivities, "context.packageManager\n …nager.MATCH_DEFAULT_ONLY)");
            if (!queryIntentActivities.isEmpty()) {
                C59052c cVar = (C59052c) C140436c.f381476a.mo56226d();
                cVar.mo56379ah(new C59094n(41621));
                cVar.mo56386p("Prompting for notification permission.");
                C140498j jVar = this.f381473b.f381477b;
                C46459k.m82829b(jVar.f381594a.mo46039a(C140497i.f381593a, jVar.f381597d), "Couldn't save notification permission state.", new Object[0]);
                C47810es.m84979s(this.f381472a, component);
            } else {
                C59052c cVar2 = (C59052c) C140436c.f381476a.mo56226d();
                cVar2.mo56379ah(new C59094n(41620));
                cVar2.mo56386p("Notification permission prompt not supported ");
            }
        }
        return C69788q.f186170a;
    }
}
