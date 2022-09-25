package com.google.android.libraries.mdi.download.p2248h.p2253c;

import android.net.Uri;
import com.google.android.libraries.mdi.download.C28728bf;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.storage.p3304a.p3312f.C42789m;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.mdi.download.h.c.a */
/* compiled from: PG */
public final /* synthetic */ class C29605a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C29606b f80191a;

    /* renamed from: b */
    public final /* synthetic */ Uri f80192b;

    public /* synthetic */ C29605a(C29606b bVar, Uri uri) {
        this.f80191a = bVar;
        this.f80192b = uri;
    }

    public final Object call() {
        C29606b bVar = this.f80191a;
        Uri uri = this.f80192b;
        C29045l.m53931c("%s: Start parsing manifest file at %s", "ManifestConfigFileParser", uri);
        return (C28728bf) bVar.f80193a.mo45889c(uri, new C42789m(C28728bf.f78043d.getParserForType()));
    }
}
