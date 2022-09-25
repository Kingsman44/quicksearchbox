package com.google.android.libraries.search.assistant.p2716p.p2723c.p2724a.p2725a;

import com.google.common.p4522b.C58480gp;
import com.google.common.p4526f.C59071e;
import com.google.p4152bb.p4153a.C55063em;
import com.google.p4152bb.p4153a.C55064en;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.p.c.a.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C34927aa implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C58480gp f92588a;

    /* renamed from: b */
    public final /* synthetic */ String f92589b;

    public /* synthetic */ C34927aa(C58480gp gpVar, String str) {
        this.f92588a = gpVar;
        this.f92589b = str;
    }

    public final void accept(Object obj) {
        C58480gp gpVar = this.f92588a;
        String str = this.f92589b;
        String str2 = (String) obj;
        C59071e eVar = C34942ap.f92610a;
        C55063em emVar = (C55063em) C55064en.f144858f.createBuilder();
        emVar.copyOnWrite();
        C55064en enVar = (C55064en) emVar.instance;
        str.getClass();
        enVar.f144860a |= 1;
        enVar.f144861b = str;
        emVar.copyOnWrite();
        C55064en enVar2 = (C55064en) emVar.instance;
        str2.getClass();
        enVar2.f144860a |= 4;
        enVar2.f144863d = str2;
        gpVar.mo55395g((C55064en) emVar.build());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
