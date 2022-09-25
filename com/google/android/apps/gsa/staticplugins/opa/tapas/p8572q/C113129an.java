package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90048d;
import com.google.android.apps.gsa.shared.p7066m.C90075e;
import com.google.android.apps.gsa.shared.p7066m.C90102f;
import com.google.android.apps.gsa.shared.p7066m.C90128g;
import com.google.android.apps.gsa.shared.p7066m.C90129h;
import com.google.common.p4526f.C59052c;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.an */
/* compiled from: PG */
abstract class C113129an {
    /* renamed from: a */
    public abstract C90048d mo99857a();

    /* renamed from: b */
    public abstract C113128am mo99858b();

    /* renamed from: c */
    public abstract C90075e mo99862c();

    /* renamed from: d */
    public abstract C90102f mo99866d();

    /* renamed from: e */
    public abstract C90128g mo99870e();

    /* renamed from: f */
    public abstract C90129h mo99875f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final Object mo99890g(C86124t tVar) {
        try {
            C113128am amVar = C113128am.STRING_PARAM;
            int ordinal = mo99858b().ordinal();
            if (ordinal == 0) {
                return tVar.mo79758x(mo99875f());
            }
            if (ordinal == 1) {
                return tVar.mo79753s(mo99870e());
            }
            if (ordinal == 2) {
                return Boolean.valueOf(tVar.mo79746e(mo99857a()));
            }
            if (ordinal == 3) {
                return Long.valueOf(tVar.mo79743a(mo99866d()));
            }
            if (ordinal == 4) {
                return Double.valueOf(tVar.mo79747m(mo99862c()));
            }
            ((C59052c) ((C59052c) C113131ap.f313439a.mo56225c()).mo56372aa(27956)).mo56389s("Illogical param case: %s", mo99858b());
            return null;
        } catch (NoSuchElementException e) {
            ((C59052c) ((C59052c) ((C59052c) C113131ap.f313439a.mo56225c()).mo56382g(e)).mo56372aa(27955)).mo56389s("Illogical state, case %s", mo99858b());
            return null;
        }
    }
}
