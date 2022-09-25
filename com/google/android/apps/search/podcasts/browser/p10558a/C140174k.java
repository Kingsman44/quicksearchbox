package com.google.android.apps.search.podcasts.browser.p10558a;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.MediaDescriptionCompat;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10588n.C140666ao;
import com.google.android.apps.search.podcasts.player.p10597d.C140786b;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.browser.a.k */
/* compiled from: PG */
final class C140174k extends C69665o implements C69626l {
    public C140174k() {
        super(1);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        List<C140666ao> list = (List) obj;
        C69664n.m101061g(list, "subscriptions");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(list, 10));
        for (C140666ao aoVar : list) {
            C140646b bVar = aoVar.f382044a;
            String str = bVar.f381995a;
            C69664n.m101060f(str, "show.feedUrl");
            C69664n.m101061g(str, "feedUrl");
            String b = C140786b.m228597b(str);
            arrayList.add(new MediaBrowserCompat.MediaItem(new MediaDescriptionCompat("show:".concat(String.valueOf(b)), bVar.f381996b, bVar.f381997c, (CharSequence) null, (Bitmap) null, Uri.parse(bVar.f381998d), (Bundle) null, (Uri) null), 1));
        }
        return arrayList;
    }
}
