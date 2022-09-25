package com.google.android.libraries.p579ar.faceviewer.p580a.p585e;

import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.SettableFuture;
import com.google.research.xeno.effect.AssetDownloader;
import java.io.File;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.e.s */
/* compiled from: PG */
final class C10618s implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ AssetDownloader.DownloadCallback f35482a;

    /* renamed from: b */
    final /* synthetic */ File f35483b;

    /* renamed from: c */
    final /* synthetic */ String f35484c;

    /* renamed from: d */
    final /* synthetic */ SettableFuture f35485d;

    public C10618s(AssetDownloader.DownloadCallback downloadCallback, File file, String str, SettableFuture settableFuture) {
        this.f35482a = downloadCallback;
        this.f35483b = file;
        this.f35484c = str;
        this.f35485d = settableFuture;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f35482a.onCompletion((String) null, th.toString());
        this.f35485d.mo57356n((Object) null);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (Boolean.TRUE.equals((Boolean) obj)) {
            this.f35482a.onCompletion(this.f35483b.getAbsolutePath(), (String) null);
        } else {
            this.f35482a.onCompletion((String) null, "Failed to download ".concat(String.valueOf(this.f35484c)));
        }
        this.f35485d.mo57356n((Object) null);
    }
}
