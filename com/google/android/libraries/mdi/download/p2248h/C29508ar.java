package com.google.android.libraries.mdi.download.p2248h;

import android.net.Uri;
import com.google.android.libraries.mdi.download.p2230c.C28750a;
import com.google.android.libraries.mdi.download.p2230c.C28782q;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.mdi.download.h.ar */
/* compiled from: PG */
public final /* synthetic */ class C29508ar implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29514ax f79963a;

    /* renamed from: b */
    public final /* synthetic */ String f79964b;

    /* renamed from: c */
    public final /* synthetic */ Uri f79965c;

    /* renamed from: d */
    public final /* synthetic */ AtomicReference f79966d;

    public /* synthetic */ C29508ar(C29514ax axVar, String str, Uri uri, AtomicReference atomicReference) {
        this.f79963a = axVar;
        this.f79964b = str;
        this.f79965c = uri;
        this.f79966d = atomicReference;
    }

    public final C60870cx apply(Object obj) {
        C29514ax axVar = this.f79963a;
        String str = this.f79964b;
        Uri uri = this.f79965c;
        AtomicReference atomicReference = this.f79966d;
        Void voidR = (Void) obj;
        C29045l.m53930b("%s: Prepare for downloading manifest file.", "ManifestFileGroupPopulator");
        C29581bb bbVar = (C29581bb) atomicReference.get();
        C28750a aVar = new C28750a();
        aVar.mo34364b(str);
        aVar.f78164a = C29514ax.m54501a(bbVar);
        C60870cx a = ((C28782q) axVar.f79983c.mo6453a()).mo34370a(aVar.mo34363a());
        C29501ak akVar = new C29501ak(axVar, atomicReference, str, bbVar, uri);
        return C60922j.m93045h(a, C47810es.m84966f(akVar), axVar.f79984d);
    }
}
