package com.google.android.libraries.elements.p1714d;

import android.util.Log;
import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.protos.youtube.elements.C66260r;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5513j.C70085f;

/* renamed from: com.google.android.libraries.elements.d.aj */
/* compiled from: PG */
public final /* synthetic */ class C20797aj implements C69822d {

    /* renamed from: a */
    public final /* synthetic */ C21259bb f58224a;

    /* renamed from: b */
    public final /* synthetic */ C21319z f58225b;

    /* renamed from: c */
    public final /* synthetic */ boolean f58226c;

    /* renamed from: d */
    public final /* synthetic */ C6411u f58227d;

    /* renamed from: e */
    public final /* synthetic */ boolean f58228e;

    public /* synthetic */ C20797aj(C21259bb bbVar, C21319z zVar, boolean z, C6411u uVar, boolean z2) {
        this.f58224a = bbVar;
        this.f58225b = zVar;
        this.f58226c = z;
        this.f58227d = uVar;
        this.f58228e = z2;
    }

    /* renamed from: a */
    public final Object mo25875a(Object obj) {
        C21259bb bbVar = this.f58224a;
        C21319z zVar = this.f58225b;
        boolean z = this.f58226c;
        C6411u uVar = this.f58227d;
        boolean z2 = this.f58228e;
        Throwable th = (Throwable) obj;
        C20920dp dpVar = C20799al.f58231a;
        bbVar.mo25782a(C66260r.LOG_TYPE_INTERNAL_TEMPLATE_RESOLUTION_ERROR, "Error materializing Component", zVar, th);
        if (z) {
            C20799al.f58232b.post(new C20796ai(uVar, th));
        } else if (z2) {
            Log.e("Elements DEBUG", "NOT A PRODUCTION CRASH BELOW. Review ElementsException message for details");
            throw C70085f.m101984a(th);
        }
        return C20799al.f58231a;
    }
}
