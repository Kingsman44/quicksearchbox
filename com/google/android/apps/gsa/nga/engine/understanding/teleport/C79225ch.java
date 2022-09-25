package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.engine.au.c;
import com.google.android.apps.gsa.nga.engine.au.d;
import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80051ae;
import com.google.android.apps.gsa.nga.shared.p6274a.C80056b;
import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import p001a.p014d.p015a.p016a.C0064i;
import p001a.p014d.p015a.p016a.C0065j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.ch */
/* compiled from: PG */
public final /* synthetic */ class C79225ch implements Function {

    /* renamed from: a */
    public final /* synthetic */ TeleportQueryCleaner f217694a;

    /* renamed from: b */
    public final /* synthetic */ C79298f f217695b;

    public /* synthetic */ C79225ch(TeleportQueryCleaner teleportQueryCleaner, C79298f fVar) {
        this.f217694a = teleportQueryCleaner;
        this.f217695b = fVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C80051ae aeVar;
        C80056b bVar;
        TeleportQueryCleaner teleportQueryCleaner = this.f217694a;
        C80047aa aaVar = (C80047aa) obj;
        String j = this.f217695b.mo73864j();
        C0064i iVar = (C0064i) C0065j.f172g.createBuilder();
        int i = aaVar.f219660d;
        iVar.copyOnWrite();
        C0065j jVar = (C0065j) iVar.instance;
        jVar.f174a |= 2;
        jVar.f176c = i;
        int i2 = aaVar.f219661e;
        iVar.copyOnWrite();
        C0065j jVar2 = (C0065j) iVar.instance;
        jVar2.f174a |= 4;
        jVar2.f177d = i2;
        String substring = j.substring(aaVar.f219660d, aaVar.f219661e);
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
            d dVar = teleportQueryCleaner.f217616b;
            if (aaVar.f219657a == 13) {
                aeVar = (C80051ae) aaVar.f219658b;
            } else {
                aeVar = C80051ae.f219672b;
            }
            String a2 = c.a(aeVar.f219674a, dVar.b);
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
