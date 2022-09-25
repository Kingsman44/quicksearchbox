package com.google.android.libraries.social.populous.p3296e.p3301e;

import java.text.RuleBasedCollator;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.social.populous.e.e.a */
/* compiled from: PG */
public final class C42512a extends C42517f {

    /* renamed from: a */
    public static final ConcurrentHashMap f111486a = new ConcurrentHashMap();

    /* renamed from: b */
    private final RuleBasedCollator f111487b;

    public C42512a(RuleBasedCollator ruleBasedCollator) {
        this.f111487b = ruleBasedCollator;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo45526a(String str, String str2) {
        return this.f111487b.compare(str, str2);
    }
}
