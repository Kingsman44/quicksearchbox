package com.google.android.libraries.lens.ondevice.p2024d;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.ondevice.C24292d;
import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24280f;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24283a;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24288f;
import com.google.android.libraries.lens.ondevice.p2034k.C24668ey;
import com.google.android.libraries.lens.ondevice.p2034k.C24682fl;
import com.google.android.libraries.lens.ondevice.p2034k.C24701gd;
import com.google.android.libraries.lens.ondevice.p2034k.C24715gr;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4705i.p4706a.C62370ab;

/* renamed from: com.google.android.libraries.lens.ondevice.d.cy */
/* compiled from: PG */
public final class C24372cy implements C24419m {

    /* renamed from: a */
    private final C24668ey f66756a;

    /* renamed from: b */
    private final C24701gd f66757b;

    /* renamed from: c */
    private final C24682fl f66758c;

    /* renamed from: d */
    private final C24715gr f66759d;

    public C24372cy(C24668ey eyVar, C24701gd gdVar, C24682fl flVar, C24715gr grVar) {
        this.f66756a = eyVar;
        this.f66757b = gdVar;
        this.f66758c = flVar;
        this.f66759d = grVar;
    }

    /* renamed from: a */
    public final C24288f mo29871a(C24292d dVar, C24425s sVar, C24280f fVar) {
        Bitmap bitmap = (Bitmap) fVar.mo29810b().mo56107c();
        bitmap.getClass();
        C62370ab abVar = (C62370ab) fVar.mo29815f().mo56109e(C62370ab.f168371f);
        abVar.getClass();
        C24668ey eyVar = this.f66756a;
        eyVar.getClass();
        C24701gd gdVar = this.f66757b;
        gdVar.getClass();
        C24682fl flVar = this.f66758c;
        flVar.getClass();
        C24715gr grVar = this.f66759d;
        grVar.getClass();
        C60870cx gq = new C24314au(dVar, eyVar, gdVar, flVar, grVar, bitmap, abVar).f66523a.mo60297gq();
        C24283a aVar = new C24283a();
        aVar.mo29850j(gq);
        aVar.mo29825b(gq);
        return aVar.mo29824a();
    }
}
