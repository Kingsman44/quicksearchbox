package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import com.google.assistant.p3897e.p3902c.p3907c.C50947as;
import com.google.assistant.p3897e.p3902c.p3907c.C50954az;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.common.base.C58833ax;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.aq */
/* compiled from: PG */
public final /* synthetic */ class C11154aq implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ String f36522a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f36523b;

    /* renamed from: c */
    public final /* synthetic */ C58833ax f36524c;

    /* renamed from: d */
    public final /* synthetic */ String f36525d;

    public /* synthetic */ C11154aq(String str, Consumer consumer, C58833ax axVar, String str2) {
        this.f36522a = str;
        this.f36523b = consumer;
        this.f36524c = axVar;
        this.f36525d = str2;
    }

    public final void accept(Object obj) {
        String str = this.f36522a;
        Consumer consumer = this.f36523b;
        C58833ax axVar = this.f36524c;
        String str2 = this.f36525d;
        C50947as asVar = (C50947as) obj;
        int i = C11160aw.f36531a;
        if (((C50954az) asVar.instance).f132652l.equals(str)) {
            consumer.accept(asVar);
            Optional map = Optional.ofNullable((C52490tr) C11160aw.m26449b(axVar).mo56111f()).filter(new C11147aj(str2)).map(C11152ao.f36520a).map(C11148ak.f36516a);
            Objects.requireNonNull(asVar);
            map.ifPresent(new C11149al(asVar));
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
