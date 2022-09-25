package com.google.android.apps.gsa.staticplugins.images.viewer.p8015a;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.protos.p4972d.p4973a.p4974a.p4975a.p4976a.p4977a.p4978a.p4979a.C64629b;
import com.google.protos.p5146w.p5147a.p5148a.C65928f;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.a.e */
/* compiled from: PG */
public final /* synthetic */ class C102266e implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C102270i f285349a;

    public /* synthetic */ C102266e(C102270i iVar) {
        this.f285349a = iVar;
    }

    public final void run() {
        C102270i iVar = this.f285349a;
        C65930h hVar = ((C64629b) ((C102262a) iVar.f285354a).f285330a.f63720e).f175189b;
        if (hVar == null) {
            hVar = C65930h.f179300i;
        }
        C65928f fVar = hVar.f179305d;
        if (fVar == null) {
            fVar = C65928f.f179293f;
        }
        Uri parse = Uri.parse(fVar.f179296b);
        DownloadManager.Request request = new DownloadManager.Request(parse);
        if (iVar.f285356c.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            try {
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, parse.getLastPathSegment());
            } catch (IllegalStateException | NullPointerException unused) {
            }
        }
        request.setNotificationVisibility(1);
        request.allowScanningByMediaScanner();
        iVar.f285357d.mo79821c(request, 449);
    }
}
