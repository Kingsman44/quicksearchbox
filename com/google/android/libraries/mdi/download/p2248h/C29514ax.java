package com.google.android.libraries.mdi.download.p2248h;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.mdi.download.C28730bh;
import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C28738bp;
import com.google.android.libraries.mdi.download.C28746bx;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29090d;
import com.google.android.libraries.mdi.download.p2246f.C29405b;
import com.google.android.libraries.mdi.download.p2248h.p2253c.C29605a;
import com.google.android.libraries.mdi.download.p2248h.p2253c.C29606b;
import com.google.android.libraries.mdi.download.p2257l.C29669a;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.protostore.C42877ac;
import com.google.android.libraries.storage.protostore.C42878ad;
import com.google.android.libraries.storage.protostore.C42880af;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.p4552o.p4566l.C60184cv;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.mdi.download.h.ax */
/* compiled from: PG */
public final class C29514ax implements C28746bx {

    /* renamed from: a */
    public final Uri f79981a;

    /* renamed from: b */
    public final C58881cr f79982b;

    /* renamed from: c */
    public final C58881cr f79983c;

    /* renamed from: d */
    public final Executor f79984d;

    /* renamed from: e */
    public final C58833ax f79985e;

    /* renamed from: f */
    public final C29598bs f79986f;

    /* renamed from: g */
    private final Context f79987g;

    /* renamed from: h */
    private final C42813k f79988h;

    /* renamed from: i */
    private final C29405b f79989i;

    /* renamed from: j */
    private final C29669a f79990j = new C29669a();

    /* renamed from: k */
    private final C29606b f79991k;

    public C29514ax(C29513aw awVar) {
        Context context = awVar.f79971a;
        this.f79987g = context;
        this.f79981a = C29090d.m53986g(awVar.f79971a);
        this.f79982b = awVar.f79972b;
        this.f79983c = awVar.f79973c;
        this.f79991k = awVar.f79979i;
        this.f79988h = awVar.f79974d;
        Executor executor = awVar.f79975e;
        this.f79984d = executor;
        this.f79985e = awVar.f79977g;
        this.f79989i = new C29405b(awVar.f79980j, awVar.f79978h);
        C42880af afVar = awVar.f79976f;
        Uri build = C29090d.m53986g(context).buildUpon().appendPath("manifest_metadata.pb").build();
        C42877ac i = C42878ad.m75739i();
        i.mo45968e(build);
        i.mo45967d(C29584be.f80153b);
        this.f79986f = new C29598bs(afVar.mo45979a(i.mo45964a()), executor);
    }

    /* renamed from: a */
    public static C58833ax m54501a(C29581bb bbVar) {
        return (bbVar.f80148a & 2) != 0 ? C58833ax.m90834k(bbVar.f80150c) : C58836b.f156633a;
    }

    /* renamed from: f */
    public static C29581bb m54502f(String str, int i, C58833ax axVar) {
        C29515ay ayVar = (C29515ay) C29581bb.f80146e.createBuilder();
        ayVar.copyOnWrite();
        C29581bb bbVar = (C29581bb) ayVar.instance;
        str.getClass();
        bbVar.f80148a |= 1;
        bbVar.f80149b = str;
        ayVar.copyOnWrite();
        C29581bb bbVar2 = (C29581bb) ayVar.instance;
        bbVar2.f80151d = i - 1;
        bbVar2.f80148a |= 4;
        if (axVar.mo56113h()) {
            String str2 = (String) axVar.mo56107c();
            ayVar.copyOnWrite();
            C29581bb bbVar3 = (C29581bb) ayVar.instance;
            str2.getClass();
            bbVar3.f80148a |= 2;
            bbVar3.f80150c = str2;
        }
        return (C29581bb) ayVar.build();
    }

    /* renamed from: b */
    public final C60870cx mo19336b(C29409fd fdVar) {
        C29669a aVar = this.f79990j;
        return aVar.f80333a.mo51512b(new C29505ao(this, fdVar), this.f79984d);
    }

    /* renamed from: c */
    public final C60870cx mo34753c(C29409fd fdVar, Uri uri, AtomicReference atomicReference) {
        C29045l.m53931c("%s: Parse the manifest file at %s.", "ManifestFileGroupPopulator", uri);
        C29606b bVar = this.f79991k;
        C29605a aVar = new C29605a(bVar, uri);
        return C29670b.m54719g(C28738bp.m53591a(C60856cj.m92904m(C47810es.m84978r(aVar), bVar.f80194b), C28737bo.MANIFEST_FILE_GROUP_POPULATOR_PARSE_MANIFEST_FILE_ERROR, "Failed to parse the manifest file.")).mo34822i(new C29496af(this, fdVar), this.f79984d).mo34822i(new C29502al(atomicReference), this.f79984d);
    }

    /* renamed from: d */
    public final void mo34754d(Uri uri) {
        try {
            if (this.f79988h.mo45894h(uri)) {
                C29045l.m53931c("%s: Removing manifest file at: %s", "ManifestFileGroupPopulator", uri);
                this.f79988h.mo45892f(uri);
                return;
            }
            C29045l.m53931c("%s: Manifest file doesn't exist: %s", "ManifestFileGroupPopulator", uri);
        } catch (IOException e) {
            C28736bn bnVar = new C28736bn();
            bnVar.f78064c = e;
            bnVar.f78062a = C28737bo.MANIFEST_FILE_GROUP_POPULATOR_DELETE_MANIFEST_FILE_ERROR;
            bnVar.f78063b = "Failed to delete manifest file.";
            throw bnVar.mo34334a();
        }
    }

    /* renamed from: e */
    public final void mo34755e(C28738bp bpVar, C28730bh bhVar) {
        this.f79989i.mo34708a(C60184cv.m92534b(bpVar.f78134a.f78133ap), bhVar.f78051b, this.f79987g.getPackageName(), bhVar.f78052c);
    }

    /* renamed from: g */
    public final void mo34756g(int i, C28730bh bhVar) {
        this.f79989i.mo34708a(i, bhVar.f78051b, this.f79987g.getPackageName(), bhVar.f78052c);
    }
}
