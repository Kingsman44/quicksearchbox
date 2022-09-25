package com.google.firebase;

import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.firebase.l */
/* compiled from: PG */
public class C61267l extends Exception {
    @Deprecated
    protected C61267l() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61267l(String str) {
        super(str);
        C143919bh.m233970m(str, "Detail message must not be empty");
    }
}
