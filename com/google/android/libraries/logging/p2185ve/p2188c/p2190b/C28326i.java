package com.google.android.libraries.logging.p2185ve.p2188c.p2190b;

import com.google.android.libraries.logging.p2182b.C28278i;
import com.google.android.libraries.logging.p2185ve.p2187b.C28312a;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28314a;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.android.libraries.logging.ve.c.b.i */
/* compiled from: PG */
public final class C28326i {

    /* renamed from: a */
    public final C28278i f77010a;

    /* renamed from: b */
    public final C28312a f77011b;

    /* renamed from: c */
    public final C28330m f77012c;

    /* renamed from: d */
    public final C21370a f77013d;

    /* renamed from: e */
    public final C28314a f77014e = new C28325h(this);

    /* renamed from: f */
    public int f77015f = 0;

    /* renamed from: g */
    public Runnable f77016g = null;

    /* renamed from: h */
    public Runnable f77017h = null;

    public C28326i(C28278i iVar, C28312a aVar, C21370a aVar2) {
        this.f77010a = iVar;
        this.f77011b = aVar;
        this.f77012c = new C28330m();
        this.f77013d = aVar2;
    }

    /* renamed from: a */
    public final void mo33840a() {
        this.f77016g = null;
        if (this.f77012c.mo33847c()) {
            C47558bi a = C47831fm.m85006a("GIL:AutoProcessBatch");
            try {
                this.f77010a.mo33777c(new C28321d(this));
                a.close();
                return;
            } catch (Throwable th) {
                C28319b.m52974a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: b */
    public final void mo33841b() {
        if (this.f77016g == null) {
            Runnable a = this.f77011b.mo33807a(new C28323f(this));
            this.f77016g = a;
            int i = this.f77015f;
            if (i > 0) {
                C19559g.m37302a().postDelayed(a, (long) i);
            } else {
                C19559g.m37302a().post(a);
            }
        }
    }
}
