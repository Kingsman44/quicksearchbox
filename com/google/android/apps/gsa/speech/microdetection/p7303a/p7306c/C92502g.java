package com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c;

import com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92508b;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.speech.microdetection.a.c.g */
/* compiled from: PG */
final class C92502g implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f258141a;

    /* renamed from: b */
    final /* synthetic */ byte[] f258142b;

    /* renamed from: c */
    final /* synthetic */ byte[] f258143c;

    /* renamed from: d */
    final /* synthetic */ byte[] f258144d;

    /* renamed from: e */
    final /* synthetic */ C92503h f258145e;

    public C92502g(C92503h hVar, String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f258145e = hVar;
        this.f258141a = str;
        this.f258142b = bArr;
        this.f258143c = bArr2;
        this.f258144d = bArr3;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C92504i.f258151a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "MicroDataManager");
        C92503h hVar = this.f258145e;
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(12704)).mo56354G("MicroDataManager InitializationTask failed due to hotword model load failure! Locale: %s, type: %s", hVar.f258147b, hVar.f258148c.name());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C92508b bVar = (C92508b) obj;
        boolean z = true;
        if ((bVar.f258182a & 1) == 0 || bVar.f258183b.mo59174N().length == 0) {
            C59104x d = C92504i.f258151a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MicroDataManager");
            C92503h hVar = this.f258145e;
            ((C59052c) ((C59052c) d).mo56372aa(12705)).mo56354G("MicroDataManager using no hotword model for locale: %s, type: %s!", hVar.f258147b, hVar.f258148c.name());
            this.f258145e.f258150e.f258174u = 3;
        }
        if (this.f258145e.f258149d) {
            C59104x c = C92504i.f258151a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MicroDataManager");
            ((C59052c) ((C59052c) c).mo56372aa(12707)).mo56386p("MicroDataManager InitializationTask has been cancelled! Skipping config assignment and callbacks.");
            this.f258145e.f258150e.f258174u = 4;
            return;
        }
        synchronized (this.f258145e.f258150e) {
            C92504i iVar = this.f258145e.f258150e;
            iVar.f258157d = null;
            iVar.f258158e = null;
            if ((bVar.f258182a & 1) == 0 || bVar.f258183b.mo59174N().length == 0) {
                C92504i iVar2 = this.f258145e.f258150e;
                iVar2.f258167n = bVar.f258184c;
                iVar2.f258160g = null;
                if (C58837ba.m90859h(iVar2.f258167n)) {
                    this.f258145e.f258150e.f258167n = "Hotword model is null or empty!";
                }
            } else {
                this.f258145e.f258150e.f258160g = bVar.f258183b.mo59174N();
                this.f258145e.f258150e.f258174u = 5;
            }
            this.f258145e.f258150e.f258159f = this.f258141a;
            C59104x b = C92504i.f258151a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MicroDataManager");
            C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(12706);
            if (bVar != null) {
                z = false;
            }
            cVar.mo56357J("MicroDataManager InitializationTask. googleHotwordData is null: true, hotwordModel is null: %b , sourceLocationOfCurrentHotwordModel %s", z, this.f258145e.f258150e.f258159f);
            C92504i iVar3 = this.f258145e.f258150e;
            iVar3.f258161h = this.f258142b;
            iVar3.f258162i = this.f258143c;
            iVar3.f258163j = this.f258144d;
            iVar3.f258175v = 2;
            iVar3.f258165l = null;
            iVar3.f258164k = false;
            Iterator it = iVar3.f258168o.iterator();
            while (it.hasNext()) {
                Runnable runnable = (Runnable) it.next();
                if (runnable != null) {
                    runnable.run();
                }
            }
            this.f258145e.f258150e.f258168o.clear();
        }
    }
}
