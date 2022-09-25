package com.google.android.apps.gsa.assistant.handoff;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.assistant.handoff.z */
/* compiled from: PG */
public enum C9493z {
    CVC_CHALLENGE(101, "transactions.CVC_CHALLENGE"),
    GDI_ACTIVITY(102, "identity.ACCOUNT_LINKING"),
    PAYMENTS_AUTH_ACTIVITY(103, "transactions.PAYMENTS_AUTH"),
    FIX_INSTRUMENT(104, "transactions.FIX_INSTRUMENT"),
    ADD_INSTRUMENT(105, "transactions.ADD_INSTRUMENT"),
    ADD_ADDRESS(106, "transactions.ADD_ADDRESS"),
    SETUP_PAYMENTS(107, "transactions.SETUP_PAYMENTS"),
    PAYMENTS_AUTH_PIN_ACTIVITY(108, "transactions.PAYMENTS_AUTH"),
    FOOD_ORDERING_CART_UPDATED(201, "food_ordering.CART_UPDATED");
    

    /* renamed from: j */
    public final int f32951j;

    /* renamed from: k */
    public final C58833ax f32952k;

    private C9493z(int i, String str) {
        this.f32951j = i;
        this.f32952k = C58833ax.m90834k(str);
    }
}
