package com.google.android.libraries.search.silk.p3162a.p3168f;

import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.webkit.URLUtil;
import com.google.android.libraries.mdi.download.p2230c.C28779n;
import com.google.android.libraries.mdi.download.p2243e.C29344a;
import com.google.android.libraries.mdi.download.p2243e.C29358h;
import com.google.android.libraries.mdi.download.p2243e.C29359i;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.android.libraries.silk.p3238b.C41749b;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4304i.C56712b;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.silk.a.f.e */
/* compiled from: PG */
public final /* synthetic */ class C40572e implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C40573f f106486a;

    /* renamed from: b */
    public final /* synthetic */ C56712b f106487b;

    public /* synthetic */ C40572e(C40573f fVar, C56712b bVar) {
        this.f106486a = fVar;
        this.f106487b = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C40573f fVar = this.f106486a;
        C56712b bVar = this.f106487b;
        Uri parse = Uri.parse(bVar.f151374a);
        String lastPathSegment = parse.getLastPathSegment();
        if (bVar.f151374a.isEmpty() || !URLUtil.isValidUrl(bVar.f151374a) || !URLUtil.isHttpsUrl(bVar.f151374a) || lastPathSegment == null) {
            return C60856cj.m92899h(new C41742a(C41749b.m73222a("invalid_url", "Download url is not valid.")));
        }
        try {
            Uri a = fVar.f106491d.mo42585a(lastPathSegment);
            C29358h k = C29359i.m54279k();
            k.mo34664j(bVar.f151374a);
            k.mo34658d(a);
            k.mo34659e(C28779n.f78236c);
            k.mo34662h(false);
            C29344a aVar = (C29344a) k;
            aVar.f79540f = lastPathSegment;
            C40570c cVar = fVar.f106489b;
            Context context = (Context) cVar.f106480a.mo17428b();
            context.getClass();
            Executor executor = (Executor) cVar.f106481b.mo17428b();
            executor.getClass();
            NotificationManager notificationManager = (NotificationManager) cVar.f106482c.mo17428b();
            notificationManager.getClass();
            C21370a aVar2 = (C21370a) cVar.f106483d.mo17428b();
            aVar2.getClass();
            C42813k kVar = (C42813k) cVar.f106484e.mo17428b();
            kVar.getClass();
            parse.getClass();
            a.getClass();
            aVar.f79538d = C58833ax.m90834k(new C40569b(context, executor, notificationManager, aVar2, kVar, parse, a));
            return fVar.f106488a.mo34665a(k.mo34695k());
        } catch (IOException e) {
            return C60856cj.m92899h(new C41742a(C41749b.m73223b(e.getMessage() != null ? e.getMessage() : "Cannot find download destination.")));
        }
    }
}
