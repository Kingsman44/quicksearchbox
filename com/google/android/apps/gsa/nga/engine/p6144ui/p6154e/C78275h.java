package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e;

import com.google.android.apps.gsa.nga.api.a.au;
import com.google.android.apps.gsa.nga.api.a.ay;
import com.google.android.apps.gsa.nga.api.a.ba;
import com.google.android.apps.gsa.nga.api.a.be;
import com.google.android.apps.gsa.nga.api.a.bf;
import com.google.android.apps.gsa.nga.shared.p6417x.C83346ag;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h */
/* compiled from: PG */
public final /* synthetic */ class C78275h implements C83346ag {

    /* renamed from: a */
    public static final /* synthetic */ C78275h f215554a = new C78275h();

    private /* synthetic */ C78275h() {
    }

    /* renamed from: a */
    public final Object mo73128a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Boolean bool = (Boolean) obj3;
        Integer num = (Integer) obj4;
        ba baVar = (ba) obj6;
        au createBuilder = bf.i.createBuilder();
        createBuilder.copyOnWrite();
        bf bfVar = createBuilder.instance;
        bfVar.b = ((ay) obj).c;
        int i = 1;
        bfVar.a |= 1;
        createBuilder.copyOnWrite();
        bf bfVar2 = createBuilder.instance;
        bfVar2.c = ((be) obj2).d;
        bfVar2.a |= 2;
        if (true == ((Boolean) obj5).booleanValue()) {
            i = 2;
        }
        createBuilder.copyOnWrite();
        bf bfVar3 = createBuilder.instance;
        bfVar3.e = i - 1;
        bfVar3.a |= 8;
        createBuilder.copyOnWrite();
        bf bfVar4 = createBuilder.instance;
        baVar.getClass();
        bfVar4.f = baVar;
        bfVar4.a |= 16;
        boolean booleanValue = bool.booleanValue();
        createBuilder.copyOnWrite();
        bf bfVar5 = createBuilder.instance;
        bfVar5.a |= 32;
        bfVar5.g = booleanValue;
        int intValue = num.intValue();
        createBuilder.copyOnWrite();
        bf bfVar6 = createBuilder.instance;
        bfVar6.a |= 64;
        bfVar6.h = intValue;
        return createBuilder.build();
    }
}
