package com.google.android.apps.gsa.staticplugins.bisto.p7486d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6813n.C86183b;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96505y;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.d.r */
/* compiled from: PG */
public final class C95269r {

    /* renamed from: a */
    public static final C59071e f266560a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.d.r");

    /* renamed from: f */
    private static final long f266561f = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: b */
    public final Context f266562b;

    /* renamed from: c */
    public BroadcastReceiver f266563c;

    /* renamed from: d */
    public long f266564d;

    /* renamed from: e */
    public SettableFuture f266565e;

    /* renamed from: g */
    private final C22871g f266566g;

    /* renamed from: h */
    private final C22871g f266567h;

    /* renamed from: i */
    private final C86183b f266568i;

    public C95269r(Context context, C22871g gVar, C22871g gVar2, C86183b bVar) {
        this.f266562b = context;
        this.f266566g = gVar;
        this.f266567h = gVar2;
        this.f266568i = bVar;
    }

    /* renamed from: a */
    public final synchronized void mo89186a() {
        SettableFuture settableFuture = this.f266565e;
        if (settableFuture != null && !settableFuture.isDone()) {
            this.f266565e.cancel(false);
        }
        this.f266565e = null;
    }

    /* renamed from: b */
    public final void mo89187b() {
        BroadcastReceiver broadcastReceiver = this.f266563c;
        if (broadcastReceiver != null) {
            this.f266562b.unregisterReceiver(broadcastReceiver);
        }
        try {
            this.f266568i.mo79820b(this.f266564d);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            C59104x c = f266560a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "JingleDownloader");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(14810)).mo56386p("Exception from DownloadManager");
        }
    }

    /* renamed from: c */
    public final synchronized C60870cx mo89188c() {
        C60870cx e;
        mo89187b();
        mo89186a();
        SettableFuture settableFuture = new SettableFuture();
        this.f266565e = settableFuture;
        e = C90877ak.m148471e(settableFuture, f266561f, TimeUnit.MILLISECONDS, this.f266567h);
        C90873ag agVar = new C90873ag(e, this.f266566g, "after downloading jingle", new C95265n(this));
        agVar.mo85225c(TimeoutException.class, new C95266o(this));
        agVar.mo85223a(new C95267p(this));
        C95268q qVar = new C95268q(this);
        this.f266563c = qVar;
        this.f266562b.registerReceiver(qVar, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
        File d = mo89189d();
        if (d != null) {
            Long b = C96505y.m159888b(this.f266562b, Uri.parse("https://www.gstatic.com/bisto/herbie_assets/jingle.wav"), d, true, true);
            if (b == null) {
                C59104x c = f266560a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "JingleDownloader");
                ((C59052c) ((C59052c) c).mo56372aa(14809)).mo56386p("Failed to create a download");
            } else {
                this.f266564d = b.longValue();
            }
        } else {
            C59104x c2 = f266560a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "JingleDownloader");
            ((C59052c) ((C59052c) c2).mo56372aa(14808)).mo56386p("could not create destination file");
        }
        return e;
    }

    /* renamed from: d */
    public final File mo89189d() {
        File externalCacheDir = this.f266562b.getExternalCacheDir();
        if (externalCacheDir != null) {
            return new File(externalCacheDir, "jingle.wav");
        }
        C59104x c = f266560a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "JingleDownloader");
        ((C59052c) ((C59052c) c).mo56372aa(14804)).mo56386p("Cannot open external cache directory");
        return null;
    }
}
