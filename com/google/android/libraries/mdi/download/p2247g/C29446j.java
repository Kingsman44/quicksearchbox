package com.google.android.libraries.mdi.download.p2247g;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.mdi.download.C29662ie;
import com.google.android.libraries.storage.p3304a.p3313g.C42801d;
import com.google.android.libraries.storage.p3304a.p3313g.C42802e;
import com.google.android.libraries.storage.p3304a.p3313g.C42803f;
import java.util.HashMap;

/* renamed from: com.google.android.libraries.mdi.download.g.j */
/* compiled from: PG */
public final class C29446j implements C42803f {

    /* renamed from: a */
    public final C29662ie f79831a;

    /* renamed from: b */
    public final Context f79832b;

    /* renamed from: c */
    public final Object f79833c = new Object();

    /* renamed from: d */
    public final HashMap f79834d = new HashMap();

    /* renamed from: e */
    public final HashMap f79835e = new HashMap();

    public C29446j(Context context) {
        C29443g gVar = new C29443g();
        this.f79832b = context;
        this.f79831a = gVar;
    }

    /* renamed from: a */
    public final C42802e mo34689a(Uri uri) {
        return mo34690b(uri);
    }

    /* renamed from: b */
    public final C42802e mo34690b(Uri uri) {
        C42802e eVar;
        synchronized (this.f79833c) {
            eVar = (C42802e) this.f79835e.get(uri);
        }
        return eVar;
    }

    /* renamed from: h */
    public final C42801d mo34694h() {
        return null;
    }
}
