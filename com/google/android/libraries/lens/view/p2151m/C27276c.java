package com.google.android.libraries.lens.view.p2151m;

import android.content.Context;
import android.text.TextUtils;
import androidx.browser.p059a.C0962j;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.lens.view.m.c */
/* compiled from: PG */
public final class C27276c {

    /* renamed from: a */
    public C2164c f74598a;

    /* renamed from: b */
    private final Context f74599b;

    /* renamed from: c */
    private final C27275b f74600c = new C27275b(this);

    /* renamed from: d */
    private final C27281h f74601d;

    /* renamed from: e */
    private C60870cx f74602e;

    public C27276c(Context context, C27281h hVar) {
        this.f74599b = context;
        this.f74601d = hVar;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo32807a() {
        C60870cx cxVar = this.f74602e;
        if (cxVar != null) {
            return cxVar;
        }
        String a = this.f74601d.mo32811a();
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        this.f74602e = C2169h.m6027a(new C27274a(this));
        C0962j.m2898d(this.f74599b, a, this.f74600c);
        C60870cx cxVar2 = this.f74602e;
        cxVar2.getClass();
        return cxVar2;
    }

    /* renamed from: b */
    public final synchronized void mo32808b() {
        if (this.f74602e != null) {
            this.f74599b.unbindService(this.f74600c);
            this.f74602e = null;
            C2164c cVar = this.f74598a;
            if (cVar != null) {
                cVar.mo5438c();
                this.f74598a = null;
            }
        }
    }
}
