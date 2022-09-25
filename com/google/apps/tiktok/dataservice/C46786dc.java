package com.google.apps.tiktok.dataservice;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.apps.tiktok.dataservice.dc */
/* compiled from: PG */
public abstract class C46786dc extends C46691ai {
    /* renamed from: a */
    public static C46786dc m83350a(C58528ij ijVar) {
        boolean z = true;
        if (ijVar.size() <= 1) {
            z = false;
        }
        C58838bb.m90869d(z, "A set key must have at least two members.");
        return new C46884x(ijVar);
    }

    /* renamed from: b */
    public abstract C58528ij mo50742b();
}
