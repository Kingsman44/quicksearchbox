package com.google.frameworks.client.data.android.p4641h;

import com.google.common.base.C58838bb;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.h.am */
/* compiled from: PG */
public final class C61480am {

    /* renamed from: a */
    public static final C61480am f166232a = new C61480am(1, (C61474ag) null);

    /* renamed from: b */
    public final C61474ag f166233b;

    /* renamed from: c */
    public final int f166234c;

    private C61480am(int i, C61474ag agVar) {
        this.f166234c = i;
        this.f166233b = agVar;
    }

    /* renamed from: a */
    public static C61480am m94193a(Status status, C70334de deVar) {
        status.getClass();
        C58838bb.m90884s(!status.mo61679g(), "Error status must not be ok");
        return new C61480am(2, new C61474ag(status, deVar));
    }
}
