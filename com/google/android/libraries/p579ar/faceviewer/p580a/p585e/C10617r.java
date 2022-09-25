package com.google.android.libraries.p579ar.faceviewer.p580a.p585e;

import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.p579ar.faceviewer.utils.C10668a;
import com.google.android.libraries.p579ar.faceviewer.utils.C10672e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.research.xeno.effect.AssetDownloader;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.e.r */
/* compiled from: PG */
public final /* synthetic */ class C10617r implements C10672e {

    /* renamed from: a */
    public final /* synthetic */ C10619t f35479a;

    /* renamed from: b */
    public final /* synthetic */ AssetDownloader.DownloadCallback f35480b;

    /* renamed from: c */
    public final /* synthetic */ String f35481c;

    public /* synthetic */ C10617r(C10619t tVar, AssetDownloader.DownloadCallback downloadCallback, String str) {
        this.f35479a = tVar;
        this.f35480b = downloadCallback;
        this.f35481c = str;
    }

    /* renamed from: a */
    public final C60870cx mo18640a() {
        C10619t tVar = this.f35479a;
        AssetDownloader.DownloadCallback downloadCallback = this.f35480b;
        String str = this.f35481c;
        try {
            File createTempFile = File.createTempFile("asset", ".tmp");
            createTempFile.deleteOnExit();
            C60870cx a = C2169h.m6027a(new C10668a(tVar.f35486a, str, createTempFile, tVar.f35487b));
            synchronized (tVar.f35488c) {
                tVar.f35489d.add(a);
            }
            SettableFuture settableFuture = new SettableFuture();
            C60856cj.m92911t(a, new C10618s(downloadCallback, createTempFile, str, settableFuture), tVar.f35487b);
            return settableFuture;
        } catch (IOException e) {
            downloadCallback.onCompletion((String) null, e.toString());
            return C60856cj.m92899h(e);
        }
    }
}
