package com.google.android.libraries.glide.fife;

import android.os.Trace;
import com.bumptech.glide.load.C5959r;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.p297b.C5750ab;
import com.bumptech.glide.load.p297b.C5751ac;
import com.bumptech.glide.load.p297b.C5762an;
import com.bumptech.glide.load.p297b.C5763ao;
import com.bumptech.glide.load.p297b.C5764ap;
import com.google.android.libraries.social.p3267c.p3268a.C41921c;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.libraries.glide.fife.f */
/* compiled from: PG */
public final class C22016f implements C5764ap {

    /* renamed from: a */
    public static final /* synthetic */ int f60727a = 0;

    /* renamed from: b */
    private final C5762an f60728b = new C5762an(2000);

    /* renamed from: c */
    private final C5764ap f60729c;

    static {
        C58974d.m91134h("FifeModelLoader");
        new C5959r("com.google.android.libraries.glide.fife.FifeModelLoader.useBatchSizeAsAlternate", false, C22013c.f60726a);
    }

    public C22016f(C5764ap apVar) {
        this.f60729c = apVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5763ao mo11928a(Object obj, int i, int i2, C5960s sVar) {
        C22012b bVar = (C22012b) obj;
        Trace.beginSection("FifeModelLoader.beginSection");
        try {
            Trace.beginSection("FifeModelLoader.buildGlideUrl");
            C5750ab abVar = (C5750ab) this.f60728b.mo12268a(bVar, i, i2);
            if (abVar == null) {
                C5750ab abVar2 = new C5750ab(C41921c.m73454c(((ProvidedFifeUrl) bVar.f60723a).f60720b, bVar.f60724b.f60731b, C22017g.m41264c(i), C22017g.m41264c(i2), -1, -1), C5751ac.f17327a);
                this.f60728b.mo12269b(bVar, i, i2, abVar2);
                Trace.endSection();
                abVar = abVar2;
            }
            return this.f60729c.mo11928a(abVar, i, i2, sVar);
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo11929b(Object obj) {
        C22012b bVar = (C22012b) obj;
        return true;
    }
}
