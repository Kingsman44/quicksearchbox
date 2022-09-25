package com.google.android.libraries.web.contrib.contextmenu.internal;

import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.contrib.contextmenu.internal.p3365a.C43456a;
import com.google.android.libraries.web.contrib.contextmenu.internal.p3366b.C43459a;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43948y;
import com.google.android.libraries.web.p3428m.C43949z;
import com.google.android.libraries.web.p3428m.p3429a.p3430a.C43908c;
import com.google.android.libraries.web.p3428m.p3429a.p3430a.C43909d;
import com.google.android.libraries.web.shared.lifecycle.C44107h;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.contrib.contextmenu.internal.c */
/* compiled from: PG */
public final class C43461c implements C44107h, C43949z {

    /* renamed from: a */
    public Consumer f113533a;

    /* renamed from: b */
    private final C43269t f113534b;

    public C43461c(C43948y yVar, C43269t tVar) {
        this.f113534b = tVar;
        yVar.mo46938e(this);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo44356a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo46529b(C43904a aVar) {
    }

    /* renamed from: c */
    public final void mo46530c(C43904a aVar) {
        C43908c a = C43909d.m77519a(aVar);
        if (this.f113534b.mo46385c().equals(C43271v.WEB_VIEW)) {
            a.mo46918l(new C43459a(new C43458b(this)));
        } else {
            a.mo46922p(new C43456a(new C43458b(this)));
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void mo46531d() {
    }
}
