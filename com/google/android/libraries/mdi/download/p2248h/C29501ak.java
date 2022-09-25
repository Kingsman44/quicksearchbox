package com.google.android.libraries.mdi.download.p2248h;

import android.net.Uri;
import com.google.android.libraries.mdi.download.p2230c.C28776k;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.mdi.download.h.ak */
/* compiled from: PG */
public final /* synthetic */ class C29501ak implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29514ax f79943a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f79944b;

    /* renamed from: c */
    public final /* synthetic */ String f79945c;

    /* renamed from: d */
    public final /* synthetic */ C29581bb f79946d;

    /* renamed from: e */
    public final /* synthetic */ Uri f79947e;

    public /* synthetic */ C29501ak(C29514ax axVar, AtomicReference atomicReference, String str, C29581bb bbVar, Uri uri) {
        this.f79943a = axVar;
        this.f79944b = atomicReference;
        this.f79945c = str;
        this.f79946d = bbVar;
        this.f79947e = uri;
    }

    public final C60870cx apply(Object obj) {
        C29514ax axVar = this.f79943a;
        AtomicReference atomicReference = this.f79944b;
        String str = this.f79945c;
        C29581bb bbVar = this.f79946d;
        Uri uri = this.f79947e;
        C28776k kVar = (C28776k) obj;
        int a = C29580ba.m54567a(((C29581bb) atomicReference.get()).f80151d);
        if (a == 0) {
            a = 1;
        }
        if (!str.equals(bbVar.f80149b) || kVar.mo34373b()) {
            a = 2;
            C29045l.m53932d("%s: Manifest file on server updated, will re-download; urlToDownload = %s; manifestFileUri = %s", "ManifestFileGroupPopulator", str, uri);
            axVar.mo34754d(uri);
        }
        atomicReference.set(C29514ax.m54502f(str, a, kVar.mo34372a()));
        return C60866ct.f164955a;
    }
}
