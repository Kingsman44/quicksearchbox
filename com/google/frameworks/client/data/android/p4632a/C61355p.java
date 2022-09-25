package com.google.frameworks.client.data.android.p4632a;

import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.frameworks.client.data.android.a.p */
/* compiled from: PG */
public final class C61355p {

    /* renamed from: a */
    public final C58528ij f165920a;

    /* renamed from: b */
    public final C58833ax f165921b;

    /* renamed from: c */
    public final boolean f165922c;

    /* renamed from: d */
    public final C58833ax f165923d;

    public C61355p(C58528ij ijVar, C58833ax axVar, boolean z, C58833ax axVar2) {
        this.f165920a = ijVar;
        this.f165921b = axVar;
        this.f165922c = z;
        this.f165923d = axVar2;
    }

    /* renamed from: a */
    public static C61354o m93860a(C58528ij ijVar) {
        C58838bb.m90869d(!ijVar.isEmpty(), "Must provide at least one fallback account type");
        C58838bb.m90869d(!ijVar.contains("google"), "Cannot fall back for google accounts");
        return new C61354o(ijVar);
    }
}
