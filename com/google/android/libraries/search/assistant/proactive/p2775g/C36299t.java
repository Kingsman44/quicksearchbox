package com.google.android.libraries.search.assistant.proactive.p2775g;

import com.google.assistant.p3803ag.p3809c.C49052er;
import com.google.assistant.p3803ag.p3809c.C49055eu;
import com.google.assistant.p3803ag.p3809c.C49056ev;
import com.google.assistant.p3803ag.p3809c.C49057ew;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.search.assistant.proactive.g.t */
/* compiled from: PG */
public final /* synthetic */ class C36299t implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C36300u f94788a;

    /* renamed from: b */
    public final /* synthetic */ int f94789b;

    /* renamed from: c */
    public final /* synthetic */ int f94790c;

    /* renamed from: d */
    public final /* synthetic */ boolean f94791d;

    /* renamed from: e */
    public final /* synthetic */ int f94792e;

    /* renamed from: f */
    public final /* synthetic */ int f94793f;

    public /* synthetic */ C36299t(C36300u uVar, int i, int i2, int i3, boolean z, int i4) {
        this.f94788a = uVar;
        this.f94793f = i;
        this.f94789b = i2;
        this.f94790c = i3;
        this.f94791d = z;
        this.f94792e = i4;
    }

    public final Object apply(Object obj) {
        C36300u uVar = this.f94788a;
        int i = this.f94793f;
        int i2 = this.f94789b;
        int i3 = this.f94790c;
        boolean z = this.f94791d;
        int i4 = this.f94792e;
        C49056ev evVar = (C49056ev) ((C49057ew) obj).toBuilder();
        C49052er erVar = (C49052er) C49055eu.f126887h.createBuilder();
        long b = uVar.f94794a.mo26870b();
        erVar.copyOnWrite();
        C49055eu euVar = (C49055eu) erVar.instance;
        euVar.f126889a |= 1;
        euVar.f126890b = b;
        erVar.copyOnWrite();
        C49055eu euVar2 = (C49055eu) erVar.instance;
        euVar2.f126891c = i - 1;
        euVar2.f126889a |= 2;
        erVar.copyOnWrite();
        C49055eu euVar3 = (C49055eu) erVar.instance;
        euVar3.f126889a |= 16;
        euVar3.f126894f = i2;
        erVar.copyOnWrite();
        C49055eu euVar4 = (C49055eu) erVar.instance;
        euVar4.f126889a |= 4;
        euVar4.f126892d = i3;
        erVar.copyOnWrite();
        C49055eu euVar5 = (C49055eu) erVar.instance;
        euVar5.f126889a |= 32;
        euVar5.f126895g = z;
        erVar.copyOnWrite();
        C49055eu euVar6 = (C49055eu) erVar.instance;
        euVar6.f126889a |= 8;
        euVar6.f126893e = i4;
        evVar.mo53213a((C49055eu) erVar.build());
        return (C49057ew) evVar.build();
    }
}
