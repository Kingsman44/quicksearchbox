package com.google.android.libraries.assistant.auto.tng.morris.framework.p1084d;

import com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.C14653a;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14394hp;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14493lg;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14494lh;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14496lj;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.d.ad */
/* compiled from: PG */
public final class C14754ad {

    /* renamed from: a */
    public final C14755ae f44528a;

    /* renamed from: b */
    public final C14769o f44529b;

    /* renamed from: c */
    private final C14778x f44530c;

    public C14754ad(C14755ae aeVar, C14769o oVar, C14778x xVar) {
        this.f44528a = aeVar;
        this.f44529b = oVar;
        this.f44530c = xVar;
    }

    /* renamed from: a */
    public final void mo21725a(List list, Optional optional, Optional optional2, C14493lg lgVar, C14749d dVar) {
        Optional map = optional.map(C14751aa.f44525a);
        Optional map2 = optional2.map(C14751aa.f44525a);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C14496lj ljVar = (C14496lj) it.next();
            if ((!map.isPresent() || ljVar != map.get()) && (!map2.isPresent() || ljVar != map2.get())) {
                lgVar.copyOnWrite();
                C14494lh lhVar = (C14494lh) lgVar.instance;
                C14494lh lhVar2 = C14494lh.f43803f;
                ljVar.getClass();
                C62961ch chVar = lhVar.f43809e;
                if (!chVar.mo58948c()) {
                    lhVar.f43809e = C62942bv.mutableCopy(chVar);
                }
                lhVar.f43809e.mo58916g(ljVar.getNumber());
                C14778x xVar = this.f44530c;
                switch (ljVar.ordinal()) {
                    case 1:
                    case 2:
                    case 3:
                    case 26:
                        C14653a aVar = (C14653a) xVar.f44552a.get(C14394hp.PHONE_EVENT);
                        aVar.getClass();
                        aVar.mo21633j(ljVar, map2, dVar);
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        C14653a aVar2 = (C14653a) xVar.f44552a.get(C14394hp.MESSAGE_EVENT);
                        aVar2.getClass();
                        aVar2.mo21633j(ljVar, map2, dVar);
                        break;
                    case 14:
                        C14653a aVar3 = (C14653a) xVar.f44552a.get(C14394hp.MEDIA_EVENT);
                        aVar3.getClass();
                        aVar3.mo21633j(ljVar, map2, dVar);
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                        C14653a aVar4 = (C14653a) xVar.f44552a.get(C14394hp.ASSISTANT_EVENT);
                        aVar4.getClass();
                        aVar4.mo21633j(ljVar, map2, dVar);
                        break;
                    case 22:
                    case 25:
                        C14653a aVar5 = (C14653a) xVar.f44552a.get(C14394hp.SETTINGS_EVENT);
                        aVar5.getClass();
                        aVar5.mo21633j(ljVar, map2, dVar);
                        break;
                    case 23:
                        C14653a aVar6 = (C14653a) xVar.f44552a.get(C14394hp.EXPERIENCE_LAUNCHER_EVENT);
                        aVar6.getClass();
                        aVar6.mo21633j(ljVar, map2, dVar);
                        break;
                    case 24:
                        C14653a aVar7 = (C14653a) xVar.f44552a.get(C14394hp.HOME_EVENT);
                        aVar7.getClass();
                        aVar7.mo21633j(ljVar, map2, dVar);
                        break;
                    case 27:
                        C14653a aVar8 = (C14653a) xVar.f44552a.get(C14394hp.SUGGESTIONS_EVENT);
                        aVar8.getClass();
                        aVar8.mo21633j(ljVar, map2, dVar);
                        break;
                }
            }
        }
    }
}
