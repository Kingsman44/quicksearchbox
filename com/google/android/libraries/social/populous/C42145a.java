package com.google.android.libraries.social.populous;

import com.google.android.libraries.social.p3269d.p3270a.C41932g;
import com.google.android.libraries.social.populous.core.C42309ch;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.social.populous.a */
/* compiled from: PG */
final class C42145a extends C42150ad {

    /* renamed from: a */
    public C58485gu f110383a;

    /* renamed from: b */
    public Person f110384b;

    /* renamed from: c */
    public Group f110385c;

    /* renamed from: d */
    public C41932g f110386d;

    /* renamed from: e */
    private C42309ch f110387e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Autocompletion mo44840a() {
        if (this.f110387e != null && this.f110383a != null) {
            return new AutoValue_Autocompletion(this.f110387e, this.f110383a, this.f110384b, this.f110385c, this.f110386d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f110387e == null) {
            sb.append(" objectType");
        }
        if (this.f110383a == null) {
            sb.append(" matchesList");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Group mo44841b() {
        return this.f110385c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Person mo44842c() {
        return this.f110384b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C41932g mo44843d() {
        return this.f110386d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo44844e(C42309ch chVar) {
        if (chVar != null) {
            this.f110387e = chVar;
            return;
        }
        throw new NullPointerException("Null objectType");
    }
}
