package com.google.android.apps.search.podcasts.widgets.feedback;

import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.player.C140787e;
import com.google.common.base.C58817ah;
import java.util.Arrays;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.widgets.feedback.b */
/* compiled from: PG */
final class C141249b implements C58817ah {

    /* renamed from: a */
    public static final C141249b f383478a = new C141249b();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C140641b bVar;
        C140787e eVar = (C140787e) obj;
        if (eVar == null || (bVar = eVar.f382282c) == null) {
            return null;
        }
        Object[] objArr = new Object[3];
        C140646b bVar2 = bVar.f381974a;
        if (bVar2 == null) {
            bVar2 = C140646b.f381993r;
        }
        objArr[0] = bVar2.f381995a;
        C140646b bVar3 = bVar.f381974a;
        if (bVar3 == null) {
            bVar3 = C140646b.f381993r;
        }
        objArr[1] = bVar3.f382001g;
        objArr[2] = bVar.f381975b;
        String format = String.format("feed_url: %s, cluster_id: %s, guid: %s", Arrays.copyOf(objArr, 3));
        C69664n.m101060f(format, "format(format, *args)");
        return format;
    }
}
