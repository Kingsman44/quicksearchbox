package com.google.android.libraries.logging.p2185ve.synthetic;

import com.google.android.libraries.logging.p2182b.C28278i;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28316c;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28317d;
import com.google.android.libraries.logging.p2185ve.p2188c.p2190b.C28330m;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.logging.ve.synthetic.g */
/* compiled from: PG */
public final class C28463g {

    /* renamed from: a */
    public final C28330m f77254a;

    /* renamed from: b */
    private final C28317d f77255b;

    /* renamed from: c */
    private final C28278i f77256c;

    public C28463g(C28317d dVar, C28330m mVar, C28278i iVar) {
        this.f77255b = dVar;
        this.f77254a = mVar;
        this.f77256c = iVar;
    }

    /* renamed from: g */
    private static void m53195g(C28316c cVar) {
        C58838bb.m90868c(cVar.mo33830n());
    }

    @Deprecated
    /* renamed from: a */
    public final C28313c mo33917a(C28427h hVar) {
        return new C28313c(hVar, C28468l.f77267a, this.f77255b, (C28306ab) null);
    }

    /* renamed from: b */
    public final C28439i mo33918b(C28313c cVar) {
        C28439i e = cVar.mo33857e(this.f77255b);
        C28466j jVar = new C28466j(e);
        e.f77220f = jVar;
        jVar.mo33827j();
        return e;
    }

    /* renamed from: c */
    public final C28316c mo33919c(C28439i iVar) {
        C58838bb.m90873h(iVar.f77219e == this.f77255b, "%s was created from a different context to this SyntheticHost.", iVar);
        C28316c cVar = iVar.f77220f;
        C58838bb.m90868c(cVar instanceof C28466j);
        return cVar;
    }

    /* renamed from: d */
    public final void mo33920d(C28439i iVar) {
        C28316c c = mo33919c(iVar);
        m53195g(c);
        c.mo33823f();
    }

    /* renamed from: e */
    public final void mo33921e(C28439i iVar) {
        C28316c c = mo33919c(iVar);
        m53195g(c);
        c.mo33824g();
    }

    /* renamed from: f */
    public final void mo33922f() {
        if (this.f77254a.mo33847c()) {
            C47558bi a = C47831fm.m85006a("GIL:FlushHostBatch");
            try {
                this.f77256c.mo33777c(new C28462f(this));
                a.close();
                return;
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        } else {
            return;
        }
        throw th;
    }
}
