package com.google.android.libraries.mdi.download.p2248h;

import android.net.Uri;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.p2230c.C28779n;
import com.google.android.libraries.mdi.download.p2230c.C28780o;
import com.google.android.libraries.mdi.download.p2230c.C28781p;
import com.google.android.libraries.mdi.download.p2230c.C28782q;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.mdi.download.h.ag */
/* compiled from: PG */
public final /* synthetic */ class C29497ag implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29514ax f79927a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f79928b;

    /* renamed from: c */
    public final /* synthetic */ C29409fd f79929c;

    /* renamed from: d */
    public final /* synthetic */ Uri f79930d;

    /* renamed from: e */
    public final /* synthetic */ String f79931e;

    public /* synthetic */ C29497ag(C29514ax axVar, AtomicReference atomicReference, C29409fd fdVar, Uri uri, String str) {
        this.f79927a = axVar;
        this.f79928b = atomicReference;
        this.f79929c = fdVar;
        this.f79930d = uri;
        this.f79931e = str;
    }

    public final C60870cx apply(Object obj) {
        C29514ax axVar = this.f79927a;
        AtomicReference atomicReference = this.f79928b;
        C29409fd fdVar = this.f79929c;
        Uri uri = this.f79930d;
        String str = this.f79931e;
        if (((C58833ax) obj).mo56113h()) {
            return C60866ct.f164955a;
        }
        int i = ((C29581bb) atomicReference.get()).f80151d;
        int a = C29580ba.m54567a(i);
        if (a != 0 && a == 4) {
            C29045l.m53930b("%s: Manifest file was committed.", "ManifestFileGroupPopulator");
            if (!axVar.f79985e.mo56113h()) {
                return C60866ct.f164955a;
            }
            C29045l.m53930b("%s: Overrider is present, commit again.", "ManifestFileGroupPopulator");
            return axVar.mo34753c(fdVar, uri, atomicReference);
        }
        int a2 = C29580ba.m54567a(i);
        if (a2 != 0 && a2 == 3) {
            C29045l.m53930b("%s: Manifest file was downloaded.", "ManifestFileGroupPopulator");
            return axVar.mo34753c(fdVar, uri, atomicReference);
        }
        C29045l.m53932d("%s: Start downloading the manifest file from %s to %s.", "ManifestFileGroupPopulator", str, uri.toString());
        C28779n nVar = C28779n.f78236c;
        C28780o g = C28781p.m53690g();
        g.mo34395h(str);
        g.mo34393f(uri);
        g.mo34391d(nVar);
        return C29670b.m54719g(((C28782q) axVar.f79983c.mo6453a()).mo34371b(g.mo34409i())).mo34822i(new C29503am(axVar, str, uri, atomicReference), axVar.f79984d).mo34822i(new C29504an(axVar, fdVar, uri, atomicReference), axVar.f79984d);
    }
}
