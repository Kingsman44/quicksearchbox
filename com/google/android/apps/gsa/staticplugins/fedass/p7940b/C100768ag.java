package com.google.android.apps.gsa.staticplugins.fedass.p7940b;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7180q.C91081a;
import com.google.android.apps.gsa.shared.util.p7180q.C91084c;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100743i;
import com.google.android.apps.search.fedora.p10099e.C132817y;
import com.google.android.libraries.assistant.trainingcache.agsa.C19424b;
import com.google.android.libraries.assistant.trainingcache.agsa.C19427e;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoWriter;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5199c.p5200a.C66457b;
import com.google.speech.p5199c.p5200a.C66477v;
import com.google.speech.p5228m.C67270aa;
import com.google.speech.p5228m.C67349m;
import dagger.C68214a;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.b.ag */
/* compiled from: PG */
public final class C100768ag implements C90991b {

    /* renamed from: a */
    public static final C59071e f281663a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.b.ag");

    /* renamed from: b */
    public final Context f281664b;

    /* renamed from: c */
    public final C68214a f281665c;

    /* renamed from: d */
    public final C68214a f281666d;

    /* renamed from: e */
    public final C68214a f281667e;

    /* renamed from: f */
    public final C68214a f281668f;

    /* renamed from: g */
    public final AtomicReference f281669g = new AtomicReference();

    /* renamed from: h */
    public final AtomicReference f281670h = new AtomicReference();

    /* renamed from: i */
    private final C68214a f281671i;

    public C100768ag(Context context, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5) {
        this.f281666d = aVar2;
        this.f281664b = context;
        this.f281665c = aVar;
        this.f281671i = aVar3;
        this.f281667e = aVar4;
        this.f281668f = aVar5;
    }

    /* renamed from: b */
    public static void m166962b(String str) {
        File file = new File(str);
        if (file.exists() && !m166963f(file)) {
            ((C59052c) ((C59052c) f281663a.mo56225c()).mo56372aa(19546)).mo56386p("Failed to delete the training cache directory");
        }
    }

    /* renamed from: f */
    private static boolean m166963f(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File f : listFiles) {
                m166963f(f);
            }
        }
        return file.delete();
    }

    /* renamed from: a */
    public final C60870cx mo92040a() {
        EkhoWriter ekhoWriter;
        C91084c a = C91081a.m148802a();
        if (a != C91084c.INTERACTOR) {
            ((C59052c) ((C59052c) f281663a.mo56225c()).mo56372aa(19545)).mo56354G("EkhoWriter cannot be initialized in %s process, only %s", a, C91084c.INTERACTOR);
            return C60866ct.f164955a;
        }
        C19427e eVar = (C19427e) this.f281666d.mo27525b();
        if (eVar.f54329b.compareAndSet(true, false) && (ekhoWriter = (EkhoWriter) eVar.f54333f.getAndSet((Object) null)) != null) {
            ekhoWriter.close();
        }
        C100742h f = C100742h.m166944c(((C100719ab) this.f281667e.mo27525b()).mo92020d()).mo92036f(new C100793x(this));
        f.mo92038i(C100794y.f281711a);
        return f.f281631a;
    }

    /* renamed from: c */
    public final void mo92041c() {
        C19427e eVar = (C19427e) this.f281666d.mo27525b();
        if (eVar.f54329b.get()) {
            EkhoWriter.nativeDisableWriting(((EkhoWriter) eVar.f54333f.get()).f54364a.get());
        }
    }

    /* renamed from: e */
    public final void mo92042e() {
        C19427e eVar = (C19427e) this.f281666d.mo27525b();
        if (eVar.f54329b.get()) {
            EkhoWriter.nativeClearAsync(((EkhoWriter) eVar.f54333f.get()).f54364a.get());
            ((C19435g) eVar.f54331d.mo27525b()).mo24619a("FedAss.EkhoWriter.NumClearCache");
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        boolean z;
        C67349m a;
        fVar.mo85291r("Ekho Stats");
        C19427e eVar = (C19427e) this.f281666d.mo27525b();
        if (!eVar.f54329b.get()) {
            z = false;
        } else {
            z = EkhoWriter.nativeIsInitialized(((EkhoWriter) eVar.f54333f.get()).f54364a.get());
        }
        fVar.mo85279c("Ekho Initialized").mo85276a(C90752i.m148228b(Boolean.valueOf(z)));
        C132817y yVar = (C132817y) this.f281670h.get();
        if (yVar != null) {
            fVar.mo85279c("Ekho enabled").mo85276a(C90752i.m148228b(Boolean.valueOf(yVar.f362391b)));
        }
        C67270aa aaVar = (C67270aa) this.f281669g.get();
        if (z && yVar != null && aaVar != null && (a = ((C19424b) this.f281671i.mo27525b()).mo24614a(aaVar)) != null) {
            C66477v a2 = C100743i.m166953a(Optional.ofNullable(a), C66457b.f180706c);
            fVar.mo85279c("cache size kb").mo85276a(C90752i.m148230d(Long.valueOf(a2.f180759c)));
            fVar.mo85279c("session count").mo85276a(C90752i.m148230d(Integer.valueOf(a2.f180761e)));
            fVar.mo85279c("non-audio record count").mo85276a(C90752i.m148230d(Long.valueOf(a2.f180760d)));
            fVar.mo85279c("audio record count").mo85276a(C90752i.m148230d(Integer.valueOf(a2.f180762f)));
            fVar.mo85279c("audio record size kb").mo85276a(C90752i.m148230d(Long.valueOf(a2.f180763g)));
            fVar.mo85279c("policy config version").mo85276a(C90752i.m148230d(Integer.valueOf(a2.f180764h)));
        }
    }
}
