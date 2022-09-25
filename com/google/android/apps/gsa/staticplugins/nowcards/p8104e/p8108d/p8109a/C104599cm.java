package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8106b.C104480p;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a.C23246a;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23272q;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.cm */
/* compiled from: PG */
public final class C104599cm implements C104480p, C23252b {

    /* renamed from: a */
    private final C23251a f291211a;

    /* renamed from: b */
    private final C23251a f291212b;

    /* renamed from: c */
    private final C23251a f291213c;

    /* renamed from: d */
    private final List f291214d;

    public C104599cm(C23052c cVar) {
        C23246a.m43558d(cVar, this);
        C23087a aVar = new C23087a();
        C23052c cVar2 = cVar;
        C23251a aVar2 = new C23251a(cVar2, "firstButtonLabel", new C23272q(), true, false, false);
        this.f291211a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(cVar2, "prompt", new C23272q(), true, false, false);
        this.f291212b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(cVar2, "secondButtonLabel", new C23272q(), true, false, false);
        this.f291213c = aVar4;
        aVar.mo28530a(aVar4);
        this.f291214d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f291214d;
    }

    /* renamed from: b */
    public final /* synthetic */ C23250b mo94227b() {
        return this.f291211a;
    }

    /* renamed from: c */
    public final /* synthetic */ C23250b mo94228c() {
        return this.f291212b;
    }

    /* renamed from: d */
    public final /* synthetic */ C23250b mo94229d() {
        return this.f291213c;
    }
}
