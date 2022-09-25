package com.google.android.libraries.search.silk.p3162a.p3179q;

import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.webkit.URLUtil;
import com.google.android.libraries.mdi.download.p2230c.C28779n;
import com.google.android.libraries.mdi.download.p2243e.C29344a;
import com.google.android.libraries.mdi.download.p2243e.C29358h;
import com.google.android.libraries.mdi.download.p2243e.C29359i;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4320y.C56840e;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.silk.a.q.f */
/* compiled from: PG */
public final /* synthetic */ class C40631f implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C40633h f106633a;

    /* renamed from: b */
    public final /* synthetic */ C56840e f106634b;

    public /* synthetic */ C40631f(C40633h hVar, C56840e eVar) {
        this.f106633a = hVar;
        this.f106634b = eVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        C40633h hVar = this.f106633a;
        C56840e eVar = this.f106634b;
        String str = eVar.f151654e;
        Uri parse = Uri.parse(str);
        String lastPathSegment = parse.getLastPathSegment();
        if (str.isEmpty() || !URLUtil.isValidUrl(str) || !URLUtil.isHttpsUrl(str) || lastPathSegment == null) {
            cxVar = C40633h.m70397b("general_error", "imageUrl url is not a valid Url.");
        } else {
            try {
                Uri a = hVar.f106639d.mo42585a(lastPathSegment);
                C40628c cVar = hVar.f106641f;
                Context context = (Context) cVar.f106625a.mo17428b();
                context.getClass();
                Executor executor = (Executor) cVar.f106626b.mo17428b();
                executor.getClass();
                NotificationManager notificationManager = (NotificationManager) cVar.f106627c.mo17428b();
                notificationManager.getClass();
                C21370a aVar = (C21370a) cVar.f106628d.mo17428b();
                aVar.getClass();
                C42813k kVar = (C42813k) cVar.f106629e.mo17428b();
                kVar.getClass();
                parse.getClass();
                a.getClass();
                C40627b bVar = new C40627b(context, executor, notificationManager, aVar, kVar, parse, a);
                C29358h k = C29359i.m54279k();
                k.mo34664j(str);
                k.mo34658d(a);
                k.mo34659e(C28779n.f78236c);
                k.mo34662h(false);
                C29344a aVar2 = (C29344a) k;
                aVar2.f79540f = lastPathSegment;
                aVar2.f79538d = C58833ax.m90834k(bVar);
                cxVar = C60922j.m93045h(hVar.f106640e.mo34665a(k.mo34695k()), C47810es.m84966f(new C40632g(bVar)), hVar.f106638c);
            } catch (IOException e) {
                cxVar = C40633h.m70397b("general_error", e.getMessage() != null ? e.getMessage() : "Cannot create a temp file to download the image to be shared.");
            }
        }
        return C60922j.m93045h(cxVar, C47810es.m84966f(new C40630e(hVar, eVar)), hVar.f106638c);
    }
}
