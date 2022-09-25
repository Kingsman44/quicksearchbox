package com.google.android.libraries.web.p3353c;

import com.google.common.p4522b.C58476gl;
import com.google.common.p4522b.C58528ij;
import java.util.EnumSet;

/* renamed from: com.google.android.libraries.web.c.o */
/* compiled from: PG */
public final class C43370o {

    /* renamed from: a */
    public static final C58528ij f113313a = C58476gl.m89803b(EnumSet.of(C43369n.SUCCESS, new C43369n[]{C43369n.FAILED, C43369n.CANCELLED}));

    /* renamed from: a */
    public static boolean m76521a(C43369n nVar) {
        return (nVar == C43369n.UNSPECIFIED || nVar == C43369n.WAITING_FOR_RESPONSE) ? false : true;
    }

    /* renamed from: b */
    public static boolean m76522b(C43369n nVar) {
        return nVar == C43369n.RENDERING_AND_RECEIVING_BYTES || f113313a.contains(nVar);
    }
}
