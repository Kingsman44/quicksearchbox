package com.google.android.libraries.assistant.contexttrigger.p1462f;

import com.google.assistant.p3803ag.p3807b.p3808a.C48889ad;
import com.google.assistant.p3803ag.p3807b.p3808a.C48892ag;
import com.google.assistant.p3803ag.p3807b.p3808a.C48897al;
import com.google.assistant.p3803ag.p3807b.p3808a.C48899an;
import com.google.assistant.p3803ag.p3807b.p3808a.C48917s;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58490gz;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.ad */
/* compiled from: PG */
public final /* synthetic */ class C17698ad implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C17703ai f50887a;

    /* renamed from: b */
    public final /* synthetic */ String f50888b;

    /* renamed from: c */
    public final /* synthetic */ C58480gp f50889c;

    /* renamed from: d */
    public final /* synthetic */ C58480gp f50890d;

    /* renamed from: e */
    public final /* synthetic */ C58490gz f50891e;

    public /* synthetic */ C17698ad(C17703ai aiVar, String str, C58480gp gpVar, C58480gp gpVar2, C58490gz gzVar) {
        this.f50887a = aiVar;
        this.f50888b = str;
        this.f50889c = gpVar;
        this.f50890d = gpVar2;
        this.f50891e = gzVar;
    }

    public final Object apply(Object obj) {
        C17703ai aiVar = this.f50887a;
        String str = this.f50888b;
        C58480gp gpVar = this.f50889c;
        C58480gp gpVar2 = this.f50890d;
        C58490gz gzVar = this.f50891e;
        C48892ag agVar = (C48892ag) obj;
        if (!agVar.mo53189b(str)) {
            return agVar;
        }
        C48889ad adVar = (C48889ad) agVar.toBuilder();
        str.getClass();
        C62995dn dnVar = agVar.f126520a;
        if (dnVar.containsKey(str)) {
            C48899an anVar = (C48899an) dnVar.get(str);
            gpVar.mo55395g(anVar);
            C17717i iVar = aiVar.f50902c;
            C48917s sVar = anVar.f126535b;
            if (sVar == null) {
                sVar = C48917s.f126578f;
            }
            gpVar2.mo55395g(iVar.mo23448a(sVar, aiVar.f50904e).mo23446a());
            str.getClass();
            C62995dn dnVar2 = agVar.f126520a;
            if (dnVar2.containsKey(str)) {
                C48897al alVar = ((C48899an) dnVar2.get(str)).f126538e;
                if (alVar == null) {
                    alVar = C48897al.f126526e;
                }
                C17703ai.m34983b(alVar, adVar, gzVar);
                str.getClass();
                adVar.copyOnWrite();
                ((C48892ag) adVar.instance).mo53188a().remove(str);
                return (C48892ag) adVar.build();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}
