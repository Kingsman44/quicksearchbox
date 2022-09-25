package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4552o.p4553a.C59509cf;
import com.google.common.p4552o.p4553a.C59514ck;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ba */
/* compiled from: PG */
final class C113276ba extends C113356d {

    /* renamed from: c */
    private volatile transient C58485gu f313706c;

    public C113276ba(C113405ep epVar, C58495hd hdVar, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, C59514ck ckVar, C59509cf cfVar, Optional optional7, Optional optional8, C58528ij ijVar) {
        super(epVar, hdVar, optional, optional2, optional3, optional4, optional5, optional6, ckVar, cfVar, optional7, optional8, ijVar);
    }

    /* renamed from: o */
    public final C58485gu mo100053o() {
        if (this.f313706c == null) {
            synchronized (this) {
                if (this.f313706c == null) {
                    this.f313706c = C113339cj.m187493a(this.f313883a);
                    if (this.f313706c == null) {
                        throw new NullPointerException("getSuggestions() cannot return null");
                    }
                }
            }
        }
        return this.f313706c;
    }
}
