package com.google.android.libraries.assistant.p1363c.p1382d.p1384b;

import com.google.android.libraries.assistant.p1363c.p1382d.C17195a;
import com.google.android.libraries.assistant.p1363c.p1382d.C17209c;
import com.google.android.libraries.assistant.p1363c.p1382d.C17214d;
import com.google.android.libraries.assistant.p1363c.p1382d.p1383a.C17197b;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.c.d.b.f */
/* compiled from: PG */
public final class C17204f implements C17195a {

    /* renamed from: a */
    private final C58833ax f49944a;

    /* renamed from: b */
    private final C58833ax f49945b;

    /* renamed from: c */
    private final C17202d f49946c;

    /* renamed from: d */
    private final C17206h f49947d;

    public C17204f(Executor executor, C58833ax axVar, C58833ax axVar2, C17202d dVar) {
        C69664n.m101061g(executor, "backgroundExecutor");
        C69664n.m101061g(dVar, "stateManager");
        this.f49944a = axVar;
        this.f49945b = axVar2;
        this.f49946c = dVar;
        this.f49947d = new C17206h(executor, new C17203e(this));
    }

    /* renamed from: a */
    public final C60870cx mo23231a(C17197b bVar) {
        C46423aj ajVar;
        C69664n.m101061g(bVar, "library");
        C17206h hVar = this.f49947d;
        synchronized (hVar.f49952c) {
            Map map = hVar.f49953d;
            Object obj = map.get(bVar);
            if (obj == null) {
                obj = new C46423aj(new C17205g(hVar, bVar), hVar.f49950a);
                map.put(bVar, obj);
            }
            ajVar = (C46423aj) obj;
        }
        return ajVar.mo50395b();
    }

    /* renamed from: b */
    public final Throwable mo23241b(C17197b bVar) {
        try {
            ((C17201c) ((C58847bk) this.f49945b).f156646a).mo23238a(bVar);
            this.f49946c.mo23240b(bVar, C17214d.LOADED_FROM_SPLIT);
            return null;
        } catch (UnsatisfiedLinkError e) {
            return e;
        }
    }

    /* renamed from: c */
    public final void mo23242c(C17197b bVar) {
        try {
            ((C17201c) ((C58847bk) this.f49944a).f156646a).mo23238a(bVar);
            this.f49946c.mo23240b(bVar, C17214d.LOADED_FROM_APK);
        } catch (UnsatisfiedLinkError e) {
            throw new C17209c("Error while loading ".concat(String.valueOf(bVar.mo23232a())), e);
        }
    }
}
