package com.google.android.libraries.mdi.download.p2236d.p2239c;

import android.net.Uri;
import com.google.android.libraries.mdi.download.C28787cb;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29037d;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;

/* renamed from: com.google.android.libraries.mdi.download.d.c.g */
/* compiled from: PG */
public final /* synthetic */ class C28919g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C28787cb f78557a;

    /* renamed from: b */
    public final /* synthetic */ String f78558b;

    /* renamed from: c */
    public final /* synthetic */ C29037d f78559c;

    /* renamed from: d */
    public final /* synthetic */ C42813k f78560d;

    /* renamed from: e */
    public final /* synthetic */ Uri f78561e;

    public /* synthetic */ C28919g(C28787cb cbVar, String str, C29037d dVar, C42813k kVar, Uri uri) {
        this.f78557a = cbVar;
        this.f78558b = str;
        this.f78559c = dVar;
        this.f78560d = kVar;
        this.f78561e = uri;
    }

    public final C60870cx apply(Object obj) {
        C28787cb cbVar = this.f78557a;
        String str = this.f78558b;
        C29037d dVar = this.f78559c;
        C42813k kVar = this.f78560d;
        Uri uri = this.f78561e;
        if (((C29402ez) obj).f79719g >= cbVar.mo34425e()) {
            C29045l.m53931c("%s: Checksum mismatch detected but the has already reached retry limit! Skipping removal for file %s", "DownloaderCallbackImpl", str);
            dVar.mo34543h(1115);
        } else {
            C29045l.m53930b("%s: Removing file and marking as corrupted due to checksum mismatch", "DownloaderCallbackImpl");
            try {
                kVar.mo45892f(uri);
            } catch (IOException e) {
                C29045l.m53938j(e, "%s: Failed to remove corrupted file %s", "DownloaderCallbackImpl", str);
                return C60856cj.m92899h(e);
            }
        }
        return C60866ct.f164955a;
    }
}
