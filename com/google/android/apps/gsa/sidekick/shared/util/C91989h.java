package com.google.android.apps.gsa.sidekick.shared.util;

import com.google.android.apps.p489g.p494d.C9167bc;
import com.google.android.apps.p489g.p494d.C9168bd;
import com.google.android.apps.p489g.p494d.C9169be;
import com.google.p375ai.p378b.C7555bi;
import com.google.p375ai.p378b.C7557bk;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.h */
/* compiled from: PG */
public final /* synthetic */ class C91989h implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C91989h f256484a = new C91989h();

    private /* synthetic */ C91989h() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C7557bk bkVar = (C7557bk) obj;
        C9168bd bdVar = (C9168bd) C9169be.f31664i.createBuilder();
        if ((bkVar.f26135a & 1) != 0) {
            String str = bkVar.f26136b;
            bdVar.copyOnWrite();
            C9169be beVar = (C9169be) bdVar.instance;
            str.getClass();
            beVar.f31666a |= 1;
            beVar.f31667b = str;
        }
        if ((bkVar.f26135a & 2) != 0) {
            C7555bi biVar = bkVar.f26137c;
            if (biVar == null) {
                biVar = C7555bi.f26127e;
            }
            C9167bc a = C91992k.m150973a(biVar);
            bdVar.copyOnWrite();
            C9169be beVar2 = (C9169be) bdVar.instance;
            a.getClass();
            beVar2.f31668c = a;
            beVar2.f31666a |= 2;
        }
        if ((bkVar.f26135a & 4) != 0) {
            C7555bi biVar2 = bkVar.f26138d;
            if (biVar2 == null) {
                biVar2 = C7555bi.f26127e;
            }
            C9167bc a2 = C91992k.m150973a(biVar2);
            bdVar.copyOnWrite();
            C9169be beVar3 = (C9169be) bdVar.instance;
            a2.getClass();
            beVar3.f31669d = a2;
            beVar3.f31666a |= 4;
        }
        if ((bkVar.f26135a & 8) != 0) {
            String str2 = bkVar.f26139e;
            bdVar.copyOnWrite();
            C9169be beVar4 = (C9169be) bdVar.instance;
            str2.getClass();
            beVar4.f31666a |= 8;
            beVar4.f31670e = str2;
        }
        if ((bkVar.f26135a & 32) != 0) {
            String str3 = bkVar.f26141g;
            bdVar.copyOnWrite();
            C9169be beVar5 = (C9169be) bdVar.instance;
            str3.getClass();
            beVar5.f31666a |= 32;
            beVar5.f31672g = str3;
        }
        if ((bkVar.f26135a & 64) != 0) {
            String str4 = bkVar.f26142h;
            bdVar.copyOnWrite();
            C9169be beVar6 = (C9169be) bdVar.instance;
            str4.getClass();
            beVar6.f31666a |= 64;
            beVar6.f31673h = str4;
        }
        if ((bkVar.f26135a & 16) != 0) {
            String str5 = bkVar.f26140f;
            bdVar.copyOnWrite();
            C9169be beVar7 = (C9169be) bdVar.instance;
            str5.getClass();
            beVar7.f31666a |= 16;
            beVar7.f31671f = str5;
        }
        return (C9169be) bdVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
