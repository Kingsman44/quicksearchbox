package com.google.android.libraries.search.silk.p3162a.p3179q;

import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore;
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

/* renamed from: com.google.android.libraries.search.silk.a.q.b */
/* compiled from: PG */
public final class C40627b implements C29353c {

    /* renamed from: a */
    public static final C59071e f106616a = C59071e.m91332i("com.google.android.libraries.search.silk.a.q.b");

    /* renamed from: b */
    public final Context f106617b;

    /* renamed from: c */
    public final Uri f106618c;

    /* renamed from: d */
    public final ContentResolver f106619d;

    /* renamed from: e */
    public final C42813k f106620e;

    /* renamed from: f */
    private final Executor f106621f;

    /* renamed from: g */
    private final Uri f106622g;

    /* renamed from: h */
    private final NotificationManager f106623h;

    /* renamed from: i */
    private final C21370a f106624i;

    public C40627b(Context context, Executor executor, NotificationManager notificationManager, C21370a aVar, C42813k kVar, Uri uri, Uri uri2) {
        this.f106617b = context;
        this.f106621f = executor;
        this.f106622g = uri;
        this.f106618c = uri2;
        C58838bb.m90884s(uri2.getPath() != null, "Image Share Uri path cannot be empty.");
        this.f106624i = aVar;
        this.f106623h = notificationManager;
        this.f106619d = context.getContentResolver();
        this.f106620e = kVar;
    }

    /* renamed from: a */
    public final C60870cx mo34574a() {
        C40626a aVar = new C40626a(this);
        return C60856cj.m92903l(C47810es.m84977q(aVar), this.f106621f);
    }

    /* renamed from: b */
    public final void mo34575b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f106616a.mo56226d()).mo56382g(th)).mo56372aa(53385)).mo56389s("Cannot share image from uri: %s", this.f106622g);
        mo42572g();
    }

    /* renamed from: c */
    public final void mo34576c() {
    }

    /* renamed from: d */
    public final void mo34577d(long j) {
    }

    /* renamed from: e */
    public final Uri mo42570e() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", this.f106622g.getLastPathSegment());
        contentValues.put("mime_type", "image/*");
        contentValues.put("date_modified", Long.valueOf(this.f106624i.mo26870b() / 1000));
        try {
            contentValues.put("_size", Long.valueOf(this.f106620e.mo45887a(this.f106618c)));
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) f106616a.mo56226d()).mo56382g(e)).mo56372aa(53381)).mo56386p("Cannot retrieve size of the downloaded file.");
        }
        contentValues.put("is_pending", 1);
        return this.f106619d.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
    }

    /* renamed from: f */
    public final void mo42571f() {
        try {
            this.f106620e.mo45892f(this.f106618c);
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) f106616a.mo56226d()).mo56382g(e)).mo56372aa(53386)).mo56386p("Cannot delete the temporal downloaded file.");
        }
    }

    /* renamed from: g */
    public final void mo42572g() {
        C1839z zVar = new C1839z(this.f106617b, "download-notification-channel-id");
        zVar.f5705y = "status";
        zVar.f5679J.icon = 17301634;
        zVar.mo5015d(8, true);
        zVar.f5690j = -1;
        zVar.f5685e = C1839z.m5037c(this.f106622g.getLastPathSegment());
        zVar.mo5015d(16, true);
        zVar.f5686f = C1839z.m5037c(C29423c.m54380c(this.f106617b));
        this.f106623h.notify("SILK_SHARE", (int) (this.f106624i.mo26870b() % 2147483647L), zVar.mo5013a());
    }
}
