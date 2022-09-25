package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80051ae;
import com.google.android.apps.gsa.nga.shared.p6274a.C80056b;
import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import p001a.p014d.p015a.p016a.C0064i;
import p001a.p014d.p015a.p016a.C0065j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.dx */
/* compiled from: PG */
public final /* synthetic */ class C123397dx implements Function {

    /* renamed from: a */
    public final /* synthetic */ TeleportQueryCleanerImpl f341158a;

    /* renamed from: b */
    public final /* synthetic */ C123427f f341159b;

    public /* synthetic */ C123397dx(TeleportQueryCleanerImpl teleportQueryCleanerImpl, C123427f fVar) {
        this.f341158a = teleportQueryCleanerImpl;
        this.f341159b = fVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C80051ae aeVar;
        C80056b bVar;
        TeleportQueryCleanerImpl teleportQueryCleanerImpl = this.f341158a;
        C80047aa aaVar = (C80047aa) obj;
        String i = this.f341159b.mo105929i();
        C0064i iVar = (C0064i) C0065j.f172g.createBuilder();
        int i2 = aaVar.f219660d;
        iVar.copyOnWrite();
        C0065j jVar = (C0065j) iVar.instance;
        jVar.f174a |= 2;
        jVar.f176c = i2;
        int i3 = aaVar.f219661e;
        iVar.copyOnWrite();
        C0065j jVar2 = (C0065j) iVar.instance;
        jVar2.f174a |= 4;
        jVar2.f177d = i3;
        String substring = i.substring(aaVar.f219660d, aaVar.f219661e);
        iVar.copyOnWrite();
        C0065j jVar3 = (C0065j) iVar.instance;
        substring.getClass();
        jVar3.f174a |= 1;
        jVar3.f175b = substring;
        C80080z a = C80080z.m128077a(aaVar.f219659c);
        if (a == null) {
            a = C80080z.UNRECOGNIZED;
        }
        if (a.equals(C80080z.APP)) {
            if (aaVar.f219657a == 12) {
                bVar = (C80056b) aaVar.f219658b;
            } else {
                bVar = C80056b.f219686c;
            }
            String str = bVar.f219688a;
            iVar.copyOnWrite();
            C0065j jVar4 = (C0065j) iVar.instance;
            str.getClass();
            jVar4.f174a |= 8;
            jVar4.f178e = str;
        } else {
            C123331bl blVar = teleportQueryCleanerImpl.f341028b;
            if (aaVar.f219657a == 13) {
                aeVar = (C80051ae) aaVar.f219658b;
            } else {
                aeVar = C80051ae.f219672b;
            }
            String a2 = blVar.mo105989a(aeVar.f219674a);
            iVar.copyOnWrite();
            C0065j jVar5 = (C0065j) iVar.instance;
            a2.getClass();
            jVar5.f174a |= 16;
            jVar5.f179f = a2;
        }
        return (C0065j) iVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
