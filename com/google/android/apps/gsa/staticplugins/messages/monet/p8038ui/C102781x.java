package com.google.android.apps.gsa.staticplugins.messages.monet.p8038ui;

import com.google.android.apps.gsa.staticplugins.messages.monet.p8034a.C102721b;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8037c.C102752d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.tools.model.p1921b.p1922a.C23247a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23265j;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.ui.x */
/* compiled from: PG */
public final class C102781x implements C102752d, C23252b {

    /* renamed from: a */
    public final C23251a f286902a;

    /* renamed from: b */
    public final C23251a f286903b;

    /* renamed from: c */
    private final C23251a f286904c;

    /* renamed from: d */
    private final List f286905d;

    public C102781x(C22945j jVar) {
        C23247a.m43563d(jVar, this);
        C23087a aVar = new C23087a();
        C22945j jVar2 = jVar;
        C23251a aVar2 = new C23251a(jVar2, "iconResId", new C23265j(), false, true, false);
        this.f286902a = aVar2;
        aVar.mo28530a(aVar2);
        C23251a aVar3 = new C23251a(jVar2, "textResId", new C23265j(), false, true, false);
        this.f286903b = aVar3;
        aVar.mo28530a(aVar3);
        C23251a aVar4 = new C23251a(jVar, "type", new C23268m(new C23259d(C102721b.values())), false, true, false);
        this.f286904c = aVar4;
        aVar.mo28530a(aVar4);
        this.f286905d = new C23088b(aVar.f63434a);
    }

    /* renamed from: a */
    public final List mo28329a() {
        return this.f286905d;
    }
}
