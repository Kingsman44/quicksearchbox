package com.google.android.apps.search.fedora.p10107j.p10109b;

import com.google.android.apps.search.fedora.metrics.C133072j;
import com.google.android.apps.search.fedora.p10094c.C132739n;
import com.google.android.libraries.assistant.trainingcache.bindings.C19439b;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoWriter;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.fedora.j.b.u */
/* compiled from: PG */
public final /* synthetic */ class C132996u implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ byte[] f362698a;

    /* renamed from: b */
    public final /* synthetic */ boolean f362699b;

    /* renamed from: c */
    public final /* synthetic */ int f362700c;

    /* renamed from: d */
    public final /* synthetic */ int f362701d;

    public /* synthetic */ C132996u(int i, int i2, byte[] bArr, boolean z) {
        this.f362700c = i;
        this.f362701d = i2;
        this.f362698a = bArr;
        this.f362699b = z;
    }

    public final void accept(Object obj) {
        int i = this.f362700c;
        int i2 = this.f362701d;
        byte[] bArr = this.f362698a;
        boolean z = this.f362699b;
        C132739n nVar = (C132739n) obj;
        C59071e eVar = C133001z.f362708a;
        C58976aa aaVar = C58975e.f156826a;
        EkhoWriter ekhoWriter = (EkhoWriter) nVar.f362177d.get();
        if (ekhoWriter != null) {
            C19439b bVar = new C19439b(ekhoWriter, i);
            bVar.f54369d = i2;
            bVar.f54367b = bArr;
            bVar.f54366a.mo24643a(bVar);
            ((C133072j) nVar.f362175b.mo17428b()).mo110965c("Fedora.EkhoWriter.NumClientEvents", i - 1);
        }
        if (z) {
            nVar.mo110899b();
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
