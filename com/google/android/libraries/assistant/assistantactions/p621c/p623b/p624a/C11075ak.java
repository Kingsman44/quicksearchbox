package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import com.google.assistant.p3897e.p3921j.C52617yj;
import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.ak */
/* compiled from: PG */
public final /* synthetic */ class C11075ak implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ List f36356a;

    public /* synthetic */ C11075ak(List list) {
        this.f36356a = list;
    }

    public final void accept(Object obj) {
        this.f36356a.addAll(((C52617yj) obj).f138148a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
