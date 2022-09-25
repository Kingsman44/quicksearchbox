package com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.opa.p6448i.C83709a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C111829at;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.TapasJni;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k.p8554b.C112116a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8588i.C113497a;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121509q;
import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.p1373a.C17001af;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.C28804cs;
import com.google.android.libraries.mdi.download.C28805ct;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29663j;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3312f.C42790n;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58781rt;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4553a.C59508ce;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import org.p5610a.p5611a.p5612a.C71989i;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.OptionalInt;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.k.m */
/* compiled from: PG */
public final class C112127m implements C90991b {

    /* renamed from: a */
    public static final C121537f f311355a = C121537f.m200840b("Tapas/TapasMddClient", C121511c.f337208a);

    /* renamed from: k */
    private static final C59071e f311356k = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.k.m");

    /* renamed from: b */
    public final C112116a f311357b;

    /* renamed from: c */
    public final C68214a f311358c;

    /* renamed from: d */
    public final C22871g f311359d;

    /* renamed from: e */
    public final C42813k f311360e;

    /* renamed from: f */
    public final Optional f311361f;

    /* renamed from: g */
    public final C86124t f311362g;

    /* renamed from: h */
    public final C17001af f311363h;

    /* renamed from: i */
    public final C17001af f311364i;

    /* renamed from: j */
    public final C17001af f311365j;

    /* renamed from: l */
    private final Context f311366l;

    /* renamed from: m */
    private final C111248k f311367m;

    /* renamed from: n */
    private final TapasJni f311368n;

    /* renamed from: o */
    private C60870cx f311369o;

    /* renamed from: p */
    private final Queue f311370p = new C58781rt(new C58425eo(100));

    /* renamed from: q */
    private final C68214a f311371q;

    public C112127m(Context context, C112116a aVar, C68214a aVar2, C22871g gVar, C42813k kVar, C111248k kVar2, Optional optional, TapasJni tapasJni, C86124t tVar, C68214a aVar3, C17001af afVar) {
        this.f311366l = context;
        this.f311357b = aVar;
        this.f311358c = aVar2;
        this.f311359d = gVar;
        this.f311360e = kVar;
        this.f311367m = kVar2;
        this.f311361f = optional;
        this.f311368n = tapasJni;
        this.f311371q = aVar3;
        this.f311362g = tVar;
        this.f311363h = afVar;
        this.f311364i = afVar;
        this.f311365j = afVar;
    }

    /* renamed from: a */
    public final C60870cx mo99401a() {
        C60870cx cxVar;
        if (this.f311369o == null) {
            TapasJni tapasJni = this.f311368n;
            C22871g gVar = this.f311359d;
            synchronized (TapasJni.f310689c) {
                cxVar = TapasJni.f310690d;
                if (cxVar == null) {
                    if (C83709a.m133281a(tapasJni.f310693e)) {
                        TapasJni.f310690d = gVar.mo28201a("[Tapas JNI init]", new C111829at(tapasJni));
                    } else {
                        TapasJni.f310690d = C60856cj.m92900i(false);
                    }
                    cxVar = TapasJni.f310690d;
                }
            }
            this.f311369o = cxVar;
        }
        return this.f311369o;
    }

    /* renamed from: b */
    public final C60870cx mo99402b(Boolean bool) {
        if (!C83709a.m133281a(this.f311362g)) {
            return C60856cj.m92900i(false);
        }
        C121509q l = f311355a.mo105243l("issueLoadCortexResourcesTask");
        try {
            if (bool.booleanValue() || !this.f311368n.mo99232c()) {
                String x = this.f311362g.mo79758x(C90063do.f249491eY);
                if (!x.isEmpty()) {
                    mo99407h(2, "Loading model from %s", x);
                    C60870cx i = this.f311359d.mo28209i(mo99401a(), "[Tapas] TapasMddClient.loadCortexResources", new C112118d(this, x));
                    l.close();
                    return i;
                }
                String x2 = this.f311362g.mo79758x(C90063do.f249306az);
                if (this.f311361f.isPresent()) {
                    mo99407h(2, "Loading %s from DEV ASSETS (include_tapas_assets=true)", x2);
                    C60870cx i2 = this.f311359d.mo28209i(mo99401a(), "[Tapas] TapasMddClient.loadCortexResources", new C112119e(this, x2));
                    l.close();
                    return i2;
                }
                mo99407h(2, "Loading %s from MDD", x2);
                C28804cs f = C28805ct.m53747f();
                ((C29663j) f).f80313a = "tapas_cortex";
                C60870cx j = this.f311359d.mo28210j(((C29409fd) this.f311358c.mo27525b()).mo34717f(f.mo34447a()), "[Tapas] TapasMddClient.loadCortexResources", new C112120f(this, x2));
                l.close();
                return j;
            }
            C60870cx i3 = C60856cj.m92900i(true);
            l.close();
            return i3;
        } catch (Throwable th) {
            C112113a.m185984a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Optional mo99403c(C29690f fVar, String str) {
        mo99407h(2, "Requesting Cortex resources: %s while having %s", str, fVar.f80416g);
        for (C28595b bVar : fVar.f80416g) {
            if (bVar.f77798b.equals(str)) {
                C121537f fVar2 = f311355a;
                int i = fVar.f80414e;
                fVar2.mo105240i("tapas_mdd_version_" + i);
                mo99407h(2, "Loading %s from MDD with version=%d", str, Integer.valueOf(fVar.f80414e));
                try {
                    return Optional.m71637of(mo99406g((InputStream) this.f311360e.mo45889c(Uri.parse(bVar.f77799c), new C42790n()), str));
                } catch (IOException e) {
                    String message = e.getMessage();
                    mo99407h(1, "Failure during creating MDD file stream for %s: %s", str, message);
                    return Optional.empty();
                }
            }
        }
        f311355a.mo105240i("tapas_mdd_file_not_found");
        mo99407h(1, "Cortex %s file not found.", str);
        return Optional.empty();
    }

    /* renamed from: e */
    public final Boolean mo99404e(ByteBuffer byteBuffer, int i) {
        C121537f fVar = f311355a;
        C121509q l = fVar.mo105243l("loadModelDataIntoTapasJni");
        if (byteBuffer != null) {
            try {
                TapasJni tapasJni = this.f311368n;
                if (TapasJni.f310687a.get()) {
                    if (byteBuffer.isDirect()) {
                        TapasJni.f310688b.set(C59508ce.MODEL_LOADING);
                        if (!tapasJni.nativeLoadResources(6, byteBuffer)) {
                            AtomicReference atomicReference = TapasJni.f310688b;
                            C59508ce ceVar = C59508ce.MODEL_LOADING;
                            C59508ce ceVar2 = C59508ce.ERROR;
                            while (true) {
                                if (!atomicReference.compareAndSet(ceVar, ceVar2)) {
                                    if (atomicReference.get() != ceVar) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        } else {
                            tapasJni.f310694f = OptionalInt.m71640of(i);
                            TapasJni.f310688b.set(C59508ce.MODEL_LOADED);
                            fVar.mo105240i("cortex_model_loaded");
                            mo99407h(2, "Cortex model loaded: %s", byteBuffer);
                            l.close();
                            return true;
                        }
                    } else {
                        throw new IOException("Direct native access is required to the ByteBuffer.");
                    }
                }
            } catch (Throwable th) {
                C112113a.m185984a(th, th);
            }
        }
        f311355a.mo105240i("cortex_model_not_loaded");
        mo99407h(1, "Cortex model not loaded: %s", byteBuffer);
        l.close();
        return false;
        throw th;
    }

    /* renamed from: f */
    public final String mo99405f(String str) {
        if (str.startsWith("file:")) {
            return str.substring(5);
        }
        if (str.startsWith("/files/")) {
            str = str.substring(7);
        }
        return new File(this.f311366l.getFilesDir(), str).getAbsolutePath();
    }

    /* renamed from: g */
    public final ByteBuffer mo99406g(InputStream inputStream, String str) {
        try {
            C121537f fVar = f311355a;
            C121509q l = fVar.mo105243l("loadContentOfFileStream");
            try {
                byte[] c = C71989i.m105288c(inputStream);
                int length = c.length;
                fVar.mo105239h("file_size", (long) length);
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length);
                allocateDirect.put(c, 0, length);
                mo99407h(2, "Loaded %s from stream:, size: %d bytes", str, Integer.valueOf(length));
                allocateDirect.rewind();
                if (inputStream != null) {
                    inputStream.close();
                }
                l.close();
                return allocateDirect;
            } catch (Throwable th) {
                l.close();
                throw th;
            }
            throw th;
        } catch (IOException e) {
            String message = e.getMessage();
            mo99407h(1, "Failed to load %s from stream: %s", str, message);
            throw e;
        } catch (Throwable th2) {
            C112113a.m185984a(th, th2);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        if (this.f311362g.mo79746e(C90063do.f249395ci)) {
            fVar.mo85291r("TapasMddClient");
            ArrayList arrayList = new ArrayList(this.f311370p);
            fVar.mo85292s(C90752i.m148229c(String.format(Locale.US, "Event count: %d", new Object[]{Integer.valueOf(arrayList.size())})));
            Collection.EL.stream(arrayList).forEach(new C112117c(fVar));
        }
    }

    /* renamed from: h */
    public final void mo99407h(int i, String str, Object... objArr) {
        String format = String.format(str, objArr);
        if (i - 1 != 0) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            C59104x c = f311356k.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TapasMddClient");
            ((C59052c) ((C59052c) c).mo56372aa(27574)).mo56389s("%s", format);
        }
        if (this.f311362g.mo79746e(C90063do.f249395ci)) {
            this.f311370p.add(String.format(Locale.US, "%s: %s", new Object[]{((C113497a) this.f311371q.mo27525b()).mo100249a(), format}));
        }
        this.f311367m.mo99076a(C111255r.CORTEX_LOG, String.format("%s", new Object[]{format}));
    }

    /* renamed from: i */
    public final C60870cx mo99408i(String str) {
        C121509q l;
        try {
            C121537f fVar = f311355a;
            l = fVar.mo105243l("loadResourcesInner_tapas_cortex_" + str);
            if (this.f311361f.isPresent()) {
                mo99407h(2, "Loading %s from DEV ASSETS (include_tapas_assets=true)", str);
                Optional flatMap = this.f311361f.flatMap(new C112124j());
                if (flatMap.isEmpty()) {
                    mo99407h(1, "Missing %s from DEV ASSETS (include_tapas_assets=true)", str);
                    C60870cx i = C60856cj.m92900i(Optional.empty());
                    l.close();
                    return i;
                }
                C60870cx i2 = C60856cj.m92900i(Optional.m71637of(mo99406g((InputStream) flatMap.get(), str)));
                l.close();
                return i2;
            }
            C28804cs f = C28805ct.m53747f();
            ((C29663j) f).f80313a = "tapas_cortex";
            C60870cx j = this.f311359d.mo28210j(((C29409fd) this.f311358c.mo27525b()).mo34717f(f.mo34447a()), "[Tapas] TapasMddClient.loadResourcesInner", new C112125k(this, str));
            l.close();
            return j;
        } catch (IOException e) {
            mo99407h(1, "Error while loading data: %s", e);
            return C60856cj.m92900i(Optional.empty());
        } catch (Throwable th) {
            C112113a.m185984a(th, th);
        }
        throw th;
    }
}
