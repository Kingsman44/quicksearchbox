package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a.p2817a.p2818a;

import com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a.C36733i;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a.C36734j;
import com.google.assistant.p3861at.C50362ug;
import com.google.assistant.p3861at.act;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.p4184bj.p4193c.p4201f.C56002b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C36691a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C36701k f95576a;

    /* renamed from: b */
    public final /* synthetic */ act f95577b;

    /* renamed from: c */
    public final /* synthetic */ boolean f95578c;

    /* renamed from: d */
    public final /* synthetic */ boolean f95579d;

    /* renamed from: e */
    public final /* synthetic */ boolean f95580e;

    /* renamed from: f */
    public final /* synthetic */ C58833ax f95581f;

    /* renamed from: g */
    public final /* synthetic */ boolean f95582g;

    public /* synthetic */ C36691a(C36701k kVar, act act, boolean z, boolean z2, boolean z3, C58833ax axVar, boolean z4) {
        this.f95576a = kVar;
        this.f95577b = act;
        this.f95578c = z;
        this.f95579d = z2;
        this.f95580e = z3;
        this.f95581f = axVar;
        this.f95582g = z4;
    }

    public final Object apply(Object obj) {
        C36701k kVar = this.f95576a;
        act act = this.f95577b;
        boolean z = this.f95578c;
        boolean z2 = this.f95579d;
        boolean z3 = this.f95580e;
        C58833ax axVar = this.f95581f;
        boolean z4 = this.f95582g;
        C58485gu<C56002b> guVar = (C58485gu) obj;
        C50362ug ugVar = act.f128917x;
        if (ugVar == null) {
            ugVar = C50362ug.f131096h;
        }
        C36733i iVar = (C36733i) C36734j.f95715j.createBuilder();
        iVar.copyOnWrite();
        C36734j jVar = (C36734j) iVar.instance;
        ugVar.getClass();
        jVar.f95718b = ugVar;
        jVar.f95717a |= 1;
        iVar.copyOnWrite();
        C36734j jVar2 = (C36734j) iVar.instance;
        jVar2.f95717a |= 2;
        jVar2.f95719c = z;
        iVar.copyOnWrite();
        C36734j jVar3 = (C36734j) iVar.instance;
        jVar3.f95717a |= 4;
        jVar3.f95720d = z2;
        iVar.copyOnWrite();
        C36734j jVar4 = (C36734j) iVar.instance;
        jVar4.f95717a |= 8;
        jVar4.f95721e = z3;
        iVar.copyOnWrite();
        C36734j jVar5 = (C36734j) iVar.instance;
        C62961ch chVar = jVar5.f95722f;
        if (!chVar.mo58948c()) {
            jVar5.f95722f = C62942bv.mutableCopy(chVar);
        }
        for (C56002b bVar : guVar) {
            jVar5.f95722f.mo58916g(bVar.f149164z);
        }
        iVar.copyOnWrite();
        C36734j jVar6 = (C36734j) iVar.instance;
        jVar6.f95717a |= 64;
        jVar6.f95724i = z4;
        if (axVar.mo56113h()) {
            String str = (String) axVar.mo56107c();
            iVar.copyOnWrite();
            C36734j jVar7 = (C36734j) iVar.instance;
            str.getClass();
            jVar7.f95717a |= 16;
            jVar7.f95723h = str;
        }
        kVar.f95606g = C58833ax.m90834k((C36734j) iVar.build());
        return (C36734j) iVar.build();
    }
}
