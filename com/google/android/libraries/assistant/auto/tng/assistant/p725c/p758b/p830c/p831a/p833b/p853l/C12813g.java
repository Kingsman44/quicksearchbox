package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p853l;

import com.google.assistant.p3897e.p3929l.p3930a.C52685ar;
import com.google.assistant.p3897e.p3929l.p3930a.C52686as;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.l.g */
/* compiled from: PG */
public final /* synthetic */ class C12813g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C52685ar f40010a;

    /* renamed from: b */
    public final /* synthetic */ boolean f40011b;

    public /* synthetic */ C12813g(C52685ar arVar, boolean z) {
        this.f40010a = arVar;
        this.f40011b = z;
    }

    public final void accept(Object obj) {
        C52685ar arVar = this.f40010a;
        boolean z = this.f40011b;
        int i = C12814h.f40012d;
        if (((Boolean) obj).booleanValue()) {
            int i2 = true != z ? 5 : 6;
            arVar.copyOnWrite();
            C52686as asVar = (C52686as) arVar.instance;
            C52686as asVar2 = C52686as.f138291q;
            asVar.f138302j = i2 - 1;
            asVar.f138293a |= 8192;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
