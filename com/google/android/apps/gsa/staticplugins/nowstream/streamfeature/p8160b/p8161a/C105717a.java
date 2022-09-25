package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8160b.p8161a;

import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.C105770h;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23256a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.b.a.a */
/* compiled from: PG */
public final class C105717a implements C105770h, C23252b {

    /* renamed from: a */
    public final C23251a f294990a;

    /* renamed from: b */
    private final List f294991b;

    public C105717a(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C23251a aVar2 = new C23251a(jVar, "isBackgroundDark", new C23256a(), false, true, false);
        this.f294990a = aVar2;
        aVar.mo28530a(aVar2);
        this.f294991b = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f294991b;
    }
}
