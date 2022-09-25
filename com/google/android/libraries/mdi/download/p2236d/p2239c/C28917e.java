package com.google.android.libraries.mdi.download.p2236d.p2239c;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C28738bp;
import com.google.android.libraries.mdi.download.C28787cb;
import com.google.android.libraries.mdi.download.C29318dd;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29338dv;
import com.google.android.libraries.mdi.download.C29390en;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.C29397eu;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29658ia;
import com.google.android.libraries.mdi.download.delta.vcdiff.C29321a;
import com.google.android.libraries.mdi.download.p2236d.C29293ls;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29037d;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.d.c.e */
/* compiled from: PG */
public final class C28917e implements C28932t {

    /* renamed from: a */
    public final Context f78541a;

    /* renamed from: b */
    public final C29293ls f78542b;

    /* renamed from: c */
    public final C42813k f78543c;

    /* renamed from: d */
    public final C29658ia f78544d;

    /* renamed from: e */
    public final C29328dl f78545e;

    /* renamed from: f */
    public final C29338dv f78546f;

    /* renamed from: g */
    public final C29037d f78547g;

    /* renamed from: h */
    public final C29392ep f78548h;

    /* renamed from: i */
    public final int f78549i;

    /* renamed from: j */
    public final long f78550j;

    /* renamed from: k */
    public final String f78551k;

    /* renamed from: l */
    public final C58833ax f78552l;

    /* renamed from: m */
    public final Executor f78553m;

    /* renamed from: n */
    public final C29321a f78554n;

    /* renamed from: o */
    public final int f78555o;

    /* renamed from: p */
    private final C28787cb f78556p;

    public C28917e(Context context, C29293ls lsVar, C42813k kVar, C29658ia iaVar, C29328dl dlVar, int i, C29321a aVar, C29338dv dvVar, C29037d dVar, C29392ep epVar, int i2, long j, String str, C58833ax axVar, C28787cb cbVar, Executor executor) {
        this.f78541a = context;
        this.f78542b = lsVar;
        this.f78543c = kVar;
        this.f78544d = iaVar;
        this.f78545e = dlVar;
        this.f78555o = i;
        this.f78554n = aVar;
        this.f78546f = dvVar;
        this.f78547g = dVar;
        this.f78548h = epVar;
        this.f78549i = i2;
        this.f78550j = j;
        this.f78551k = str;
        this.f78552l = axVar;
        this.f78556p = cbVar;
        this.f78553m = executor;
    }

    /* renamed from: a */
    public final C60870cx mo34506a(Uri uri) {
        C29045l.m53931c("%s: Successfully downloaded delta file %s", "DeltaFileDownloaderCallbackImpl", uri);
        if (!C28927o.m53847b(this.f78543c, uri).equals(this.f78546f.f79527d)) {
            C29045l.m53937i("%s: Downloaded delta file at uri = %s, checksum = %s verification failed", "DeltaFileDownloaderCallbackImpl", uri, this.f78546f.f79527d);
            C28736bn bnVar = new C28736bn();
            bnVar.f78062a = C28737bo.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR;
            C28738bp a = bnVar.mo34334a();
            return C29670b.m54719g(C28925m.m53839c(this.f78542b, this.f78545e, this.f78555o, this.f78543c, uri, this.f78546f.f79527d, this.f78547g, this.f78556p, this.f78553m)).mo34820f(IOException.class, new C28913a(a), this.f78553m).mo34822i(new C28914b(a), this.f78553m);
        }
        Uri a2 = C28926n.m53844a(uri);
        C29397eu euVar = (C29397eu) C29398ev.f79698g.createBuilder();
        C29318dd ddVar = this.f78546f.f79529f;
        if (ddVar == null) {
            ddVar = C29318dd.f79461c;
        }
        String str = ddVar.f79464b;
        euVar.copyOnWrite();
        C29398ev evVar = (C29398ev) euVar.instance;
        str.getClass();
        evVar.f79700a |= 4;
        evVar.f79703d = str;
        int i = this.f78555o;
        euVar.copyOnWrite();
        C29398ev evVar2 = (C29398ev) euVar.instance;
        evVar2.f79704e = i - 1;
        evVar2.f79700a |= 8;
        C29398ev evVar3 = (C29398ev) euVar.build();
        return C60922j.m93045h(C60922j.m93045h(this.f78542b.mo34620e(evVar3), C47810es.m84966f(new C28916d(this, evVar3, a2, uri)), this.f78553m), C47810es.m84966f(new C28915c(this, a2)), this.f78553m);
    }

    /* renamed from: b */
    public final C60870cx mo34507b(C28738bp bpVar) {
        C29045l.m53931c("%s: Failed to download file(delta) %s", "DeltaFileDownloaderCallbackImpl", this.f78545e.f79477f);
        if (bpVar.f78134a.equals(C28737bo.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR)) {
            return C28925m.m53840d(C29390en.CORRUPTED, this.f78545e, this.f78555o, this.f78542b, this.f78553m);
        }
        return C28925m.m53840d(C29390en.DOWNLOAD_FAILED, this.f78545e, this.f78555o, this.f78542b, this.f78553m);
    }
}
