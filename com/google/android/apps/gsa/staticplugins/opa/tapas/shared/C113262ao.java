package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.Comparator;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ao */
/* compiled from: PG */
final class C113262ao extends C113274b {

    /* renamed from: c */
    private volatile transient C58485gu f313627c;

    /* renamed from: d */
    private volatile transient Optional f313628d;

    public C113262ao(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, Optional optional9, C58495hd hdVar, C58495hd hdVar2, Optional optional10) {
        super(optional, optional2, optional3, optional4, optional5, optional6, optional7, optional8, optional9, hdVar, hdVar2, optional10);
    }

    /* renamed from: o */
    public final C58485gu mo99956o() {
        if (this.f313627c == null) {
            synchronized (this) {
                if (this.f313627c == null) {
                    this.f313627c = C58485gu.m89836F(Comparator.CC.comparing(C113500l.f314254a), this.f313692a.entrySet());
                    if (this.f313627c == null) {
                        throw new NullPointerException("getPrefilledFulfillmentParamsSorted() cannot return null");
                    }
                }
            }
        }
        return this.f313627c;
    }

    /* renamed from: q */
    public final Optional mo99957q() {
        if (this.f313628d == null) {
            synchronized (this) {
                if (this.f313628d == null) {
                    this.f313628d = this.f313693b.map(C113498j.f314252a).flatMap(C113499k.f314253a);
                    if (this.f313628d == null) {
                        throw new NullPointerException("getPrefilledDeeplinkUri() cannot return null");
                    }
                }
            }
        }
        return this.f313628d;
    }
}
