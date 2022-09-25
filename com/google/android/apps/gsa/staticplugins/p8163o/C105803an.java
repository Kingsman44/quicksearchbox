package com.google.android.apps.gsa.staticplugins.p8163o;

import android.net.Uri;
import com.google.android.p10890h.p10891a.p10893b.C146579j;
import com.google.android.p10890h.p10891a.p10893b.C146580k;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.an */
/* compiled from: PG */
final class C105803an extends C146579j {

    /* renamed from: b */
    private final Map f295161b;

    public C105803an(Map map) {
        this.f295161b = map;
    }

    /* renamed from: c */
    public final void mo95069c() {
        this.f395862a.mo123374d("ctmp");
    }

    /* renamed from: d */
    public final void mo95070d() {
        Map map = this.f295161b;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                C146580k kVar = this.f395862a;
                String encode = Uri.encode((String) entry.getKey());
                String encode2 = Uri.encode((String) entry.getValue());
                kVar.mo123373c("ctmp", encode + ":" + encode2);
            }
        }
    }
}
