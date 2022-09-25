package com.google.android.libraries.assistant.soda.p1611f;

import com.google.android.libraries.assistant.soda.C19239ab;
import com.google.android.libraries.assistant.soda.C19258c;
import com.google.android.libraries.assistant.soda.s3client.SodaTransportFactory;
import com.google.common.base.C58833ax;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.soda.f.c */
/* compiled from: PG */
public final /* synthetic */ class C19323c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C19239ab f54077a;

    public /* synthetic */ C19323c(C19239ab abVar) {
        this.f54077a = abVar;
    }

    public final void accept(Object obj) {
        ((C19258c) this.f54077a).f53966a = C58833ax.m90834k((SodaTransportFactory) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
