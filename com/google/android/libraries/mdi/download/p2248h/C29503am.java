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

/* renamed from: com.google.android.libraries.mdi.download.h.am */
/* compiled from: PG */
public final /* synthetic */ class C29503am implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29514ax f79949a;

    /* renamed from: b */
    public final /* synthetic */ String f79950b;

    /* renamed from: c */
    public final /* synthetic */ Uri f79951c;

    /* renamed from: d */
    public final /* synthetic */ AtomicReference f79952d;

    public /* synthetic */ C29503am(C29514ax axVar, String str, Uri uri, AtomicReference atomicReference) {
        this.f79949a = axVar;
        this.f79950b = str;
        this.f79951c = uri;
        this.f79952d = atomicReference;
    }

    public final C60870cx apply(Object obj) {
        C29514ax axVar = this.f79949a;
        String str = this.f79950b;
        Uri uri = this.f79951c;
        AtomicReference atomicReference = this.f79952d;
        Void voidR = (Void) obj;
        C29045l.m53930b("%s: Finalize for downloading manifest file.", "ManifestFileGroupPopulator");
        C28750a aVar = new C28750a();
        aVar.mo34364b(str);
        aVar.f78164a = C29514ax.m54501a((C29581bb) atomicReference.get());
        C60870cx a = ((C28782q) axVar.f79983c.mo6453a()).mo34370a(aVar.mo34363a());
        C29506ap apVar = new C29506ap(str, uri, atomicReference);
        return C60922j.m93045h(a, C47810es.m84966f(apVar), axVar.f79984d);
    }
}
