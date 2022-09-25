package com.google.android.libraries.gsa.monet.tools.p1897b.p1901b;

import com.google.android.libraries.gsa.monet.shared.p1891a.C23069d;
import com.google.android.libraries.gsa.monet.shared.p1895e.C23109a;

/* renamed from: com.google.android.libraries.gsa.monet.tools.b.b.f */
/* compiled from: PG */
public final /* synthetic */ class C23154f implements C23109a {

    /* renamed from: a */
    public final /* synthetic */ C23160l f63509a;

    public /* synthetic */ C23154f(C23160l lVar) {
        this.f63509a = lVar;
    }

    /* renamed from: a */
    public final void mo28347a(Object obj) {
        C23160l lVar = this.f63509a;
        lVar.f63522e = false;
        C23159k kVar = lVar.f63520c;
        if (kVar != null) {
            Runnable runnable = kVar.f63516b;
            if (runnable != null) {
                runnable.run();
                kVar.f63516b = null;
                return;
            }
            return;
        }
        throw new C23069d();
    }
}
