package com.google.android.libraries.p579ar.faceviewer.p580a.p585e;

import com.google.android.libraries.p579ar.faceviewer.utils.C10673f;
import com.google.research.xeno.effect.AssetDownloader;
import java.util.HashSet;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.e.t */
/* compiled from: PG */
public final class C10619t implements AssetDownloader {

    /* renamed from: a */
    public final CronetEngine f35486a;

    /* renamed from: b */
    public final Executor f35487b;

    /* renamed from: c */
    public final C10673f f35488c;

    /* renamed from: d */
    public final HashSet f35489d = new HashSet();

    public C10619t(CronetEngine cronetEngine, Executor executor, Executor executor2) {
        this.f35486a = cronetEngine;
        this.f35487b = executor;
        this.f35488c = new C10673f(executor2);
    }

    public final void downloadAsset(String str, AssetDownloader.DownloadCallback downloadCallback) {
        synchronized (this.f35488c) {
            if (this.f35488c.mo18712b(new C10617r(this, downloadCallback, str)).isCancelled()) {
                downloadCallback.onCompletion((String) null, "Download cancelled.");
            }
        }
    }
}
