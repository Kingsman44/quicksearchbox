package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8738f;

import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.searchbox.p6944c.p6945a.C88543c;
import com.google.android.libraries.searchbox.root.C41626a;
import com.google.android.libraries.searchbox.root.p3199a.C41627a;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.f.d */
/* compiled from: PG */
final class C116947d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C41642a f324672a;

    /* renamed from: b */
    final /* synthetic */ C116948e f324673b;

    public C116947d(C116948e eVar, C41642a aVar) {
        this.f324673b = eVar;
        this.f324672a = aVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (this.f324673b.f324674a == null) {
            return;
        }
        if (th instanceof CancellationException) {
            ((C88616t) this.f324672a).f239556a.mo84352bk();
            C88543c cVar = this.f324673b.f324674a;
            cVar.getClass();
            cVar.mo82204x(C41627a.CANCELLED, this.f324672a);
        } else if (th instanceof TimeoutException) {
            ((C88616t) this.f324672a).f239556a.mo84352bk();
            C88543c cVar2 = this.f324673b.f324674a;
            cVar2.getClass();
            cVar2.mo82204x(C41627a.TIMEOUT, this.f324672a);
        } else {
            ((C88616t) this.f324672a).f239556a.mo84352bk();
            C88543c cVar3 = this.f324673b.f324674a;
            cVar3.getClass();
            cVar3.mo82204x(C41627a.FAILURE, this.f324672a);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C41626a aVar = (C41626a) obj;
        ((C88616t) this.f324672a).f239556a.mo84352bk();
        C88543c cVar = this.f324673b.f324674a;
        if (cVar != null) {
            cVar.mo82204x(C41627a.SUCCESS, this.f324672a);
        }
    }
}
