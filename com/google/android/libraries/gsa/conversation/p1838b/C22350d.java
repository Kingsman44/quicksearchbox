package com.google.android.libraries.gsa.conversation.p1838b;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58880cq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.conversation.b.d */
/* compiled from: PG */
public final class C22350d {

    /* renamed from: a */
    public static final String[] f61695a = {BuildConfig.FLAVOR, C58880cq.m90966b("  ", 1), C58880cq.m90966b("  ", 2), C58880cq.m90966b("  ", 3), C58880cq.m90966b("  ", 4), C58880cq.m90966b("  ", 5)};

    /* renamed from: b */
    public final List f61696b;

    /* renamed from: c */
    private final int f61697c;

    public C22350d() {
        this(1, new ArrayList());
    }

    public C22350d(int i, List list) {
        this.f61697c = i;
        this.f61696b = list;
    }

    /* renamed from: a */
    public final void mo27578a(C22348b bVar) {
        if (bVar != null) {
            bVar.mo27576a(new C22350d(this.f61697c + 1, this.f61696b));
        }
    }

    /* renamed from: b */
    public final void mo27579b(String str, Object obj) {
        this.f61696b.add(new C22349c(this.f61697c, str, obj.toString(), 3));
    }

    /* renamed from: c */
    public final void mo27580c(String str) {
        this.f61696b.add(new C22349c(this.f61697c - 1, str, BuildConfig.FLAVOR, 0));
    }
}
