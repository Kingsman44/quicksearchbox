package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9680a;

import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128189u;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.common.p4522b.C58485gu;
import com.google.net.p4726a.p4727a.C62722b;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C128134h implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C128148v f352516a;

    /* renamed from: b */
    public final /* synthetic */ C128189u f352517b;

    public /* synthetic */ C128134h(C128148v vVar, C128189u uVar) {
        this.f352516a = vVar;
        this.f352517b = uVar;
    }

    public final void accept(Object obj) {
        C128148v vVar = this.f352516a;
        C128189u uVar = this.f352517b;
        C58485gu guVar = (C58485gu) obj;
        C37215b bVar = vVar.f352542d;
        C37252a j = C37176a.f97033ds.mo40816j("source", uVar.name());
        j.mo40781e(C62722b.OK);
        bVar.mo19974a(j);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
