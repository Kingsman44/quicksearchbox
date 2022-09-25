package com.google.android.apps.search.assistant.verticals.ambient.feedback;

import com.google.assistant.p4016z.C53708bf;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58487gw;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import p3186j$.util.function.Consumer;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.feedback.y */
/* compiled from: PG */
public final /* synthetic */ class C130666y implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C58487gw f357821a;

    /* renamed from: b */
    public final /* synthetic */ Stream.Builder f357822b;

    /* renamed from: c */
    public final /* synthetic */ Stream.Builder f357823c;

    public /* synthetic */ C130666y(C58487gw gwVar, Stream.Builder builder, Stream.Builder builder2) {
        this.f357821a = gwVar;
        this.f357822b = builder;
        this.f357823c = builder2;
    }

    public final void accept(Object obj) {
        C58487gw gwVar = this.f357821a;
        Stream.Builder builder = this.f357822b;
        Stream.Builder builder2 = this.f357823c;
        C58485gu b = gwVar.mo55277g((C8242v) obj);
        if (b.size() > 1) {
            builder.add(C130610ac.m212981a(b));
        } else {
            builder2.add((C53708bf) b.get(0));
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
