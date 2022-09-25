package com.android.p257c.p258a.p259a.p260a;

import p3186j$.util.function.BiConsumer;

/* renamed from: com.android.c.a.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C5035a implements BiConsumer {

    /* renamed from: a */
    public static final /* synthetic */ C5035a f15912a = new C5035a();

    private /* synthetic */ C5035a() {
    }

    public final void accept(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        String str = (String) obj2;
        C5036b.f15913a.put(num, str);
        C5036b.f15914b.put(str, num);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
