package com.google.android.apps.search.podcasts.browser.p10558a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.MediaDescriptionCompat;
import com.google.android.apps.search.podcasts.p10576l.C140509u;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10588n.C140648a;
import com.google.android.apps.search.podcasts.p10588n.C140659ah;
import com.google.android.apps.search.podcasts.p10588n.C140665an;
import com.google.android.apps.search.podcasts.p10588n.C140672au;
import com.google.android.apps.search.podcasts.p10588n.C140690s;
import com.google.android.apps.search.podcasts.p10588n.C140697z;
import com.google.android.apps.search.podcasts.p10601r.C140976e;
import com.google.android.apps.search.podcasts.p10601r.C140979f;
import com.google.android.apps.search.podcasts.player.p10597d.C140786b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.cache.C46370ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p4017at.p4082j.p4083a.C54297aa;
import com.google.p4017at.p4082j.p4083a.C54299ac;
import com.google.p4017at.p4082j.p4083a.C54453r;
import com.google.protobuf.C62971cq;
import com.google.protos.p4757ac.p4758a.C63111j;
import com.google.protos.p4757ac.p4758a.C63113l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.browser.a.l */
/* compiled from: PG */
public final class C140175l {

    /* renamed from: a */
    public final Context f380845a;

    /* renamed from: b */
    public final C140690s f380846b;

    /* renamed from: c */
    public final C140659ah f380847c;

    /* renamed from: d */
    public final C140672au f380848d;

    /* renamed from: e */
    public final C140665an f380849e;

    /* renamed from: f */
    public final C140648a f380850f;

    /* renamed from: g */
    public final C140697z f380851g;

    /* renamed from: h */
    public final Executor f380852h;

    /* renamed from: i */
    private final C21370a f380853i;

    /* renamed from: j */
    private final C59071e f380854j = C59071e.m91331h();

    public C140175l(Context context, C140690s sVar, C140659ah ahVar, C140672au auVar, C140665an anVar, C140648a aVar, C140697z zVar, C21370a aVar2, Executor executor) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(aVar2, "clock");
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f380845a = context;
        this.f380846b = sVar;
        this.f380847c = ahVar;
        this.f380848d = auVar;
        this.f380849e = anVar;
        this.f380850f = aVar;
        this.f380851g = zVar;
        this.f380853i = aVar2;
        this.f380852h = executor;
    }

    /* renamed from: e */
    private final MediaBrowserCompat.MediaItem m227825e(C63111j jVar, C140509u uVar) {
        C63113l lVar = jVar.f170360k;
        if (lVar == null) {
            lVar = C63113l.f170365p;
        }
        String str = lVar.f170373g;
        C69664n.m101060f(str, "episodeData.showMetadata.feedUrl");
        String str2 = jVar.f170356g;
        C69664n.m101060f(str2, "episodeData.guid");
        C69664n.m101061g(str, "feedUrl");
        C69664n.m101061g(str2, "guid");
        C69664n.m101061g(uVar, "autoplayContext");
        String str3 = "episode:" + uVar.getNumber() + "___" + C140786b.m228597b(str) + "___" + C140786b.m228597b(str2);
        String str4 = jVar.f170351b;
        String d = C140979f.m228938d(this.f380845a, Duration.ofSeconds(jVar.f170358i).toMillis(), this.f380853i.mo26870b());
        C63113l lVar2 = jVar.f170360k;
        if (lVar2 == null) {
            lVar2 = C63113l.f170365p;
        }
        return new MediaBrowserCompat.MediaItem(new MediaDescriptionCompat(str3, str4, d, (CharSequence) null, (Bitmap) null, Uri.parse(lVar2.f170371e), (Bundle) null, Uri.parse(jVar.f170353d)), 2);
    }

    /* renamed from: a */
    public final Uri mo115483a(int i) {
        try {
            Uri.Builder builder = new Uri.Builder();
            String packageName = this.f380845a.getPackageName();
            Resources resources = this.f380845a.getResources();
            String resourcePackageName = resources.getResourcePackageName(i);
            String resourceTypeName = resources.getResourceTypeName(i);
            String resourceEntryName = resources.getResourceEntryName(i);
            builder.scheme("android.resource").encodedAuthority(packageName).appendEncodedPath(resourceTypeName);
            if (!C69664n.m101066l(packageName, resourcePackageName)) {
                builder.appendEncodedPath(resourcePackageName + ":" + resourceEntryName);
            } else {
                builder.appendEncodedPath(resourceEntryName);
            }
            return builder.build();
        } catch (Resources.NotFoundException e) {
            C59052c cVar = (C59052c) ((C59052c) this.f380854j.mo56226d()).mo56382g(e);
            cVar.mo56379ah(new C59094n(41504));
            cVar.mo56384n();
            return null;
        }
    }

    /* renamed from: b */
    public final List mo115484b(List list, C140509u uVar) {
        ArrayList arrayList = new ArrayList(C69540x.m100804k(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m227825e(C140976e.m228929b((C140641b) it.next()), uVar));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final List mo115485c(C54297aa aaVar) {
        C54453r rVar;
        C62971cq cqVar = aaVar.f142652a;
        C69664n.m101060f(cqVar, "feed\n      .feedItemsList");
        ArrayList<C54299ac> arrayList = new ArrayList<>();
        for (Object next : cqVar) {
            if (((C54299ac) next).f142655a == 1) {
                arrayList.add(next);
            }
        }
        ArrayList<C63111j> arrayList2 = new ArrayList<>();
        for (C54299ac acVar : arrayList) {
            if (acVar.f142655a == 1) {
                rVar = (C54453r) acVar.f142656b;
            } else {
                rVar = C54453r.f142983d;
            }
            C62971cq cqVar2 = rVar.f142987c;
            C69664n.m101060f(cqVar2, "it.episodeGroup.episodesList");
            C69540x.m100811r(arrayList2, cqVar2);
        }
        ArrayList arrayList3 = new ArrayList(C69540x.m100804k(arrayList2, 10));
        for (C63111j jVar : arrayList2) {
            C69664n.m101060f(jVar, "it");
            arrayList3.add(m227825e(jVar, C140509u.AUTOPLAY_DEFAULT));
        }
        return arrayList3;
    }

    /* renamed from: d */
    public final boolean mo115486d(C58833ax axVar, Duration duration) {
        return !axVar.mo56113h() || this.f380853i.mo26870b() - ((C46370ah) axVar.mo56107c()).f121385b >= duration.toMillis();
    }
}
