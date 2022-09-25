package com.google.apps.tiktok.p3643g;

import android.content.Context;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.base.C58817ah;

/* renamed from: com.google.apps.tiktok.g.b */
/* compiled from: PG */
public final /* synthetic */ class C47085b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Context f122682a;

    /* renamed from: b */
    public final /* synthetic */ Class f122683b;

    public /* synthetic */ C47085b(Context context, Class cls) {
        this.f122682a = context;
        this.f122683b = cls;
    }

    public final Object apply(Object obj) {
        try {
            return C47245e.m84045a(this.f122682a, this.f122683b, (AccountId) obj);
        } catch (IllegalStateException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        }
    }
}
