package com.google.android.apps.gsa.staticplugins.nga.p8063g;

import com.google.android.apps.gsa.nga.shared.p6345h.C81278bi;
import com.google.android.apps.gsa.nga.shared.p6345h.C81280bk;
import com.google.android.apps.gsa.nga.shared.p6345h.C81304ch;
import com.google.android.apps.gsa.nga.shared.p6345h.C81305ci;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;
import java.util.Collections;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.g.c */
/* compiled from: PG */
public final /* synthetic */ class C103198c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f287949a;

    /* renamed from: b */
    public final /* synthetic */ boolean f287950b;

    /* renamed from: c */
    public final /* synthetic */ boolean f287951c;

    /* renamed from: d */
    public final /* synthetic */ boolean f287952d;

    /* renamed from: e */
    public final /* synthetic */ boolean f287953e;

    /* renamed from: f */
    public final /* synthetic */ boolean f287954f;

    public /* synthetic */ C103198c(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f287949a = str;
        this.f287950b = z;
        this.f287951c = z2;
        this.f287952d = z3;
        this.f287953e = z4;
        this.f287954f = z5;
    }

    public final Object apply(Object obj) {
        String str = this.f287949a;
        boolean z = this.f287950b;
        boolean z2 = this.f287951c;
        boolean z3 = this.f287952d;
        boolean z4 = this.f287953e;
        boolean z5 = this.f287954f;
        C81278bi biVar = (C81278bi) ((C81280bk) Objects.requireNonNull((C81280bk) obj)).toBuilder();
        C81305ci ciVar = C81305ci.f222556g;
        str.getClass();
        Map unmodifiableMap = Collections.unmodifiableMap(((C81280bk) biVar.instance).f222508k);
        if (unmodifiableMap.containsKey(str)) {
            ciVar = (C81305ci) unmodifiableMap.get(str);
        }
        C81304ch chVar = (C81304ch) ciVar.toBuilder();
        chVar.copyOnWrite();
        C81305ci ciVar2 = (C81305ci) chVar.instance;
        ciVar2.f222558a |= 1;
        ciVar2.f222559b = z;
        chVar.copyOnWrite();
        C81305ci ciVar3 = (C81305ci) chVar.instance;
        ciVar3.f222558a |= 2;
        ciVar3.f222560c = z2;
        chVar.copyOnWrite();
        C81305ci ciVar4 = (C81305ci) chVar.instance;
        ciVar4.f222558a |= 4;
        ciVar4.f222561d = z3;
        chVar.copyOnWrite();
        C81305ci ciVar5 = (C81305ci) chVar.instance;
        ciVar5.f222558a |= 8;
        ciVar5.f222562e = z4;
        chVar.copyOnWrite();
        C81305ci ciVar6 = (C81305ci) chVar.instance;
        ciVar6.f222558a |= 16;
        ciVar6.f222563f = z5;
        C81305ci ciVar7 = (C81305ci) chVar.build();
        str.getClass();
        ciVar7.getClass();
        biVar.copyOnWrite();
        C81280bk bkVar = (C81280bk) biVar.instance;
        C62995dn dnVar = bkVar.f222508k;
        if (!dnVar.f170058b) {
            bkVar.f222508k = dnVar.mo58980a();
        }
        bkVar.f222508k.put(str, ciVar7);
        return (C81280bk) biVar.build();
    }
}
