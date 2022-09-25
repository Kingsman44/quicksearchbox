package com.google.android.libraries.componentview.services.p1701a;

import android.widget.ImageView;
import com.google.android.libraries.componentview.services.application.C20586bm;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.componentview.services.a.i */
/* compiled from: PG */
public final class C20540i {

    /* renamed from: a */
    public final Map f57692a = new HashMap();

    /* renamed from: b */
    public final Executor f57693b;

    /* renamed from: c */
    private final C20586bm f57694c;

    /* renamed from: d */
    private final C20586bm f57695d;

    public C20540i(C20586bm bmVar, C20586bm bmVar2, Executor executor) {
        this.f57694c = bmVar;
        this.f57695d = bmVar2;
        this.f57693b = executor;
    }

    /* renamed from: a */
    public final C20586bm mo25453a(boolean z) {
        return z ? this.f57695d : this.f57694c;
    }

    /* renamed from: b */
    public final C60870cx mo25454b(String str, byte[] bArr, ImageView imageView, boolean z) {
        return mo25453a(z).mo25520a(str, bArr, imageView);
    }

    /* renamed from: c */
    public final C60870cx mo25455c(String str, ImageView imageView, boolean z, boolean z2) {
        if (!z) {
            return mo25453a(z2).mo25521b(str, imageView);
        }
        synchronized (this.f57692a) {
            C20539h hVar = (C20539h) this.f57692a.get(str);
            if (hVar == null) {
                hVar = new C20539h();
                this.f57692a.put(str, hVar);
            }
            if (hVar.f57689a) {
                C60870cx b = mo25453a(z2).mo25521b(str, imageView);
                return b;
            }
            byte[] bArr = hVar.f57690b;
            if (bArr == null) {
                C20538g gVar = new C20538g(imageView, z2);
                hVar.f57691c.add(gVar);
                SettableFuture settableFuture = gVar.f57687b;
                return settableFuture;
            }
            byte[] bArr2 = (byte[]) bArr.clone();
            return mo25454b(str, bArr2, imageView, z2);
        }
    }
}
