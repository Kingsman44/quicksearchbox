package com.google.android.libraries.search.silk.p3162a.p3168f;

import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import androidx.core.app.C1839z;
import com.google.android.libraries.mdi.download.foreground.C29423c;
import com.google.android.libraries.mdi.download.p2243e.C29353c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.silk.a.f.b */
/* compiled from: PG */
final class C40569b implements C29353c {

    /* renamed from: a */
    public static final C59071e f106471a = C59071e.m91332i("com.google.android.libraries.search.silk.a.f.b");

    /* renamed from: b */
    public final Context f106472b;

    /* renamed from: c */
    public final Uri f106473c;

    /* renamed from: d */
    public final Uri f106474d;

    /* renamed from: e */
    public final C21370a f106475e;

    /* renamed from: f */
    public final ContentResolver f106476f;

    /* renamed from: g */
    public final C42813k f106477g;

    /* renamed from: h */
    private final Executor f106478h;

    /* renamed from: i */
    private final NotificationManager f106479i;

    public C40569b(Context context, Executor executor, NotificationManager notificationManager, C21370a aVar, C42813k kVar, Uri uri, Uri uri2) {
        this.f106472b = context;
        this.f106478h = executor;
        this.f106473c = uri;
        this.f106474d = uri2;
        C58838bb.m90884s(uri2.getPath() != null, "Download Uri path cannot be empty.");
        this.f106475e = aVar;
        this.f106479i = notificationManager;
        this.f106476f = context.getContentResolver();
        this.f106477g = kVar;
    }

    /* renamed from: a */
    public final C60870cx mo34574a() {
        C40568a aVar = new C40568a(this);
        return C60856cj.m92903l(C47810es.m84977q(aVar), this.f106478h);
    }

    /* renamed from: b */
    public final void mo34575b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f106471a.mo56226d()).mo56382g(th)).mo56372aa(53362)).mo56389s("Cannot download from uri: %s", this.f106473c);
        mo42524g();
    }

    /* renamed from: c */
    public final void mo34576c() {
    }

    /* renamed from: d */
    public final void mo34577d(long j) {
    }

    /* renamed from: e */
    public final int mo42522e() {
        return (int) (this.f106475e.mo26870b() % 2147483647L);
    }

    /* renamed from: f */
    public final void mo42523f() {
        try {
            this.f106477g.mo45892f(this.f106474d);
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) f106471a.mo56226d()).mo56382g(e)).mo56372aa(53363)).mo56386p("Cannot delete the temporal downloaded file.");
        }
    }

    /* renamed from: g */
    public final void mo42524g() {
        C1839z zVar = new C1839z(this.f106472b, "download-notification-channel-id");
        zVar.f5705y = "status";
        zVar.f5679J.icon = 17301634;
        zVar.mo5015d(8, true);
        zVar.f5690j = -1;
        zVar.f5685e = C1839z.m5037c(this.f106473c.getLastPathSegment());
        zVar.mo5015d(16, true);
        zVar.f5686f = C1839z.m5037c(C29423c.m54380c(this.f106472b));
        this.f106479i.notify("SILK_DOWNLOAD", mo42522e(), zVar.mo5013a());
    }
}
