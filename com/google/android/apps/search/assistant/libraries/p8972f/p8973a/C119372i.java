package com.google.android.apps.search.assistant.libraries.p8972f.p8973a;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4671b.C61819l;
import com.google.knowledge.p4671b.C61820m;
import com.google.knowledge.p4671b.C61826s;
import java.util.concurrent.ExecutionException;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.search.assistant.libraries.f.a.i */
/* compiled from: PG */
public final /* synthetic */ class C119372i implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C61819l f332806a;

    public /* synthetic */ C119372i(C61819l lVar) {
        this.f332806a = lVar;
    }

    public final void accept(Object obj, Object obj2) {
        C61819l lVar = this.f332806a;
        C119379p pVar = (C119379p) obj;
        try {
            C61826s sVar = (C61826s) C60856cj.m92909r((C60870cx) obj2);
            C119379p pVar2 = C119379p.OPA_USER_ENABLED_STATUS;
            switch (pVar.ordinal()) {
                case 0:
                    lVar.copyOnWrite();
                    C61820m mVar = (C61820m) lVar.instance;
                    C61820m mVar2 = C61820m.f167020J;
                    mVar.f167045o = sVar.f167079d;
                    mVar.f167031a |= 8192;
                    return;
                case 1:
                    lVar.copyOnWrite();
                    C61820m mVar3 = (C61820m) lVar.instance;
                    C61820m mVar4 = C61820m.f167020J;
                    mVar3.f167046p = sVar.f167079d;
                    mVar3.f167031a |= 16384;
                    return;
                case 2:
                    lVar.copyOnWrite();
                    C61820m mVar5 = (C61820m) lVar.instance;
                    C61820m mVar6 = C61820m.f167020J;
                    mVar5.f167047q = sVar.f167079d;
                    mVar5.f167031a |= 32768;
                    return;
                case 3:
                    lVar.copyOnWrite();
                    C61820m mVar7 = (C61820m) lVar.instance;
                    C61820m mVar8 = C61820m.f167020J;
                    mVar7.f167048r = sVar.f167079d;
                    mVar7.f167031a |= 65536;
                    return;
                case 4:
                    lVar.copyOnWrite();
                    C61820m mVar9 = (C61820m) lVar.instance;
                    C61820m mVar10 = C61820m.f167020J;
                    mVar9.f167051u = sVar.f167079d;
                    mVar9.f167031a |= 524288;
                    return;
                case 5:
                    lVar.copyOnWrite();
                    C61820m mVar11 = (C61820m) lVar.instance;
                    C61820m mVar12 = C61820m.f167020J;
                    mVar11.f167054x = sVar.f167079d;
                    mVar11.f167031a |= 4194304;
                    return;
                case 6:
                    lVar.copyOnWrite();
                    C61820m mVar13 = (C61820m) lVar.instance;
                    C61820m mVar14 = C61820m.f167020J;
                    mVar13.f167022A = sVar.f167079d;
                    mVar13.f167031a |= 33554432;
                    return;
                case 7:
                    lVar.copyOnWrite();
                    C61820m mVar15 = (C61820m) lVar.instance;
                    C61820m mVar16 = C61820m.f167020J;
                    mVar15.f167023B = sVar.f167079d;
                    mVar15.f167031a |= 67108864;
                    return;
                case 8:
                    lVar.copyOnWrite();
                    C61820m mVar17 = (C61820m) lVar.instance;
                    C61820m mVar18 = C61820m.f167020J;
                    mVar17.f167027F = sVar.f167079d;
                    mVar17.f167031a |= 1073741824;
                    return;
                case 9:
                    lVar.copyOnWrite();
                    C61820m mVar19 = (C61820m) lVar.instance;
                    C61820m mVar20 = C61820m.f167020J;
                    mVar19.f167024C = sVar.f167079d;
                    mVar19.f167031a |= 134217728;
                    return;
                case 10:
                    lVar.copyOnWrite();
                    C61820m mVar21 = (C61820m) lVar.instance;
                    C61820m mVar22 = C61820m.f167020J;
                    mVar21.f167025D = sVar.f167079d;
                    mVar21.f167031a |= 268435456;
                    return;
                case 11:
                    lVar.copyOnWrite();
                    C61820m mVar23 = (C61820m) lVar.instance;
                    C61820m mVar24 = C61820m.f167020J;
                    mVar23.f167026E = sVar.f167079d;
                    mVar23.f167031a |= 536870912;
                    return;
                default:
                    return;
            }
        } catch (ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) C119380q.f332830a.mo56226d()).mo56382g(e)).mo56372aa(34407)).mo56389s("Failed to fetch opt-in setting %s", pVar.name());
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
