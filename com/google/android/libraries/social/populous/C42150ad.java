package com.google.android.libraries.social.populous;

import com.google.android.libraries.social.p3269d.p3270a.C41932g;
import com.google.android.libraries.social.populous.core.C42309ch;
import com.google.android.libraries.social.populous.core.GroupOrigin;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.social.populous.ad */
/* compiled from: PG */
public abstract class C42150ad {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Autocompletion mo44840a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Group mo44841b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Person mo44842c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C41932g mo44843d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo44844e(C42309ch chVar);

    /* renamed from: f */
    public final Autocompletion mo44849f() {
        boolean z = true;
        boolean z2 = (mo44842c() != null) ^ (mo44841b() != null);
        if (mo44843d() == null) {
            z = false;
        }
        C58838bb.m90884s(z2 ^ z, "Autocompletions must only contain one of: person, group, or custom result.");
        if (mo44842c() != null) {
            mo44844e(C42309ch.PERSON);
        } else if (mo44841b() != null) {
            C58485gu c = mo44841b().mo44782c();
            if (!c.isEmpty()) {
                mo44844e(C42309ch.m74492a(((GroupOrigin) c.get(0)).mo45008c()));
            } else {
                mo44844e(C42309ch.GROUP);
            }
        } else if (mo44843d() != null) {
            mo44844e(C42309ch.CUSTOM);
        }
        return mo44840a();
    }
}
