package com.google.android.libraries.storage.protostore;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3312f.C42788l;
import com.google.android.libraries.storage.protostore.p3316a.C42874b;
import com.google.common.p4541l.C59316ad;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.libraries.storage.protostore.bg */
/* compiled from: PG */
public final /* synthetic */ class C42911bg implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C42929by f112266a;

    /* renamed from: b */
    public final /* synthetic */ C42926bv f112267b;

    /* renamed from: c */
    public final /* synthetic */ boolean f112268c;

    public /* synthetic */ C42911bg(C42929by byVar, C42926bv bvVar, boolean z) {
        this.f112266a = byVar;
        this.f112267b = bvVar;
        this.f112268c = z;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C42929by byVar = this.f112266a;
        C42926bv bvVar = this.f112267b;
        boolean z = this.f112268c;
        C60870cx cxVar = byVar.f112295a;
        C42813k kVar = byVar.f112297c;
        Uri build = C42874b.m75731a((Uri) C60856cj.m92909r(cxVar), ".version").buildUpon().fragment(BuildConfig.FLAVOR).build();
        new C42912bh(bvVar).f112269a.mo45995a();
        C42788l lVar = new C42788l();
        lVar.f112052a = true;
        File file = (File) kVar.mo45889c(build, lVar);
        C59316ad.m92162b(file);
        ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 939524096);
        try {
            int fd = open.getFd();
            if (MappedCounterCacheVersion.nativeFileTruncate(fd) == 0) {
                long nativeMmap = MappedCounterCacheVersion.nativeMmap(fd, z);
                if (nativeMmap >= 0) {
                    MappedCounterCacheVersion mappedCounterCacheVersion = new MappedCounterCacheVersion(nativeMmap);
                    if (open != null) {
                        open.close();
                    }
                    return C60856cj.m92900i(mappedCounterCacheVersion);
                }
                throw new IOException("Failed to mmap counter file");
            }
            throw new IOException("Failed to truncate counter file");
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
