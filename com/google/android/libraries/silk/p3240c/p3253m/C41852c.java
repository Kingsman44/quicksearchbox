package com.google.android.libraries.silk.p3240c.p3253m;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.silk.p3240c.C41858n;
import com.google.android.libraries.silk.p3240c.C41871q;
import com.google.common.p4543n.p4544a.C59347c;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4336m.C56914b;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.libraries.silk.c.m.c */
/* compiled from: PG */
public final class C41852c implements C21312s {

    /* renamed from: a */
    private final C41858n f109239a;

    public C41852c(C69464a aVar, C41871q qVar) {
        this.f109239a = new C41858n(qVar, new C41851b(aVar), "Share", "bindCallbackToNativeShareButton");
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C56914b.f151888d;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C56914b bVar = (C56914b) obj;
        C41858n nVar = this.f109239a;
        int i = bVar.f151890a;
        String str = bVar.f151891b;
        boolean z = true;
        if (1 != (i & 1)) {
            z = false;
        }
        return nVar.mo44343a(C59347c.m92236a(z, str));
    }
}
