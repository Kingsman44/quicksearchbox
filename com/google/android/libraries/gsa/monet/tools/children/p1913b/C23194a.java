package com.google.android.libraries.gsa.monet.tools.children.p1913b;

import com.google.android.libraries.gsa.monet.internal.p1887a.C22978b;
import com.google.android.libraries.gsa.monet.shared.C23110f;
import com.google.android.libraries.gsa.monet.shared.C23117m;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.tools.children.shared.C23241j;
import com.google.android.libraries.gsa.monet.tools.children.shared.C23242k;

/* renamed from: com.google.android.libraries.gsa.monet.tools.children.b.a */
/* compiled from: PG */
public final class C23194a implements C23241j {

    /* renamed from: a */
    private final String f63608a;

    /* renamed from: b */
    private final C23117m f63609b;

    /* renamed from: c */
    private final C23110f f63610c;

    /* renamed from: d */
    private final String f63611d;

    public C23194a(String str, C23117m mVar, C23110f fVar) {
        this.f63608a = str;
        this.f63609b = mVar;
        this.f63610c = fVar;
        this.f63611d = C23242k.m43542b(str);
    }

    /* renamed from: d */
    public final void mo28623d(C23129y yVar, ProtoParcelable protoParcelable) {
        C23110f fVar = this.f63610c;
        String str = this.f63608a;
        C22978b bVar = (C22978b) fVar;
        bVar.f63198a.mo28328a();
        bVar.mo28363a();
        C23067b.m43232e(!bVar.f63199b.f63194b.mo28477m(str));
        this.f63610c.mo28364q(this.f63608a, yVar, protoParcelable);
        this.f63609b.mo28332B(C23242k.m43541a(this.f63611d, true));
    }
}
