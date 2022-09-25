package com.google.android.libraries.gsa.monet.tools.p1897b.p1901b;

import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1898a.p1899a.C23137a;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.google.android.libraries.gsa.monet.tools.b.b.i */
/* compiled from: PG */
public final /* synthetic */ class C23157i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C23159k f63511a;

    /* renamed from: b */
    public final /* synthetic */ C23129y f63512b;

    /* renamed from: c */
    public final /* synthetic */ ProtoParcelable f63513c;

    public /* synthetic */ C23157i(C23159k kVar, C23129y yVar, ProtoParcelable protoParcelable) {
        this.f63511a = kVar;
        this.f63512b = yVar;
        this.f63513c = protoParcelable;
    }

    public final void run() {
        C23159k kVar = this.f63511a;
        C23129y yVar = this.f63512b;
        ProtoParcelable protoParcelable = this.f63513c;
        kVar.f63517c.mo28602a();
        kVar.mo28599b();
        C23160l lVar = kVar.f63517c;
        C23251a aVar = lVar.f63518a.f63499b;
        aVar.mo28730f(new C23088b((Collection) new C23137a(lVar.f63519b.mo28621b()).mo28587a(new ArrayList((Collection) aVar.f63720e))), false);
        kVar.f63517c.mo28609h(yVar, protoParcelable);
    }
}
