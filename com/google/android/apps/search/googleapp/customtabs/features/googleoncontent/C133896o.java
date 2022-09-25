package com.google.android.apps.search.googleapp.customtabs.features.googleoncontent;

import android.content.Intent;
import android.databinding.C0118a;
import android.net.Uri;
import com.google.android.apps.gsa.h.h.c;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.p10162a.C133873a;
import com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.p10162a.C133876d;
import com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.p10162a.C133877e;
import com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.p10162a.C133878f;
import com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.p10162a.C133880h;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133714af;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p395al.p398b.p399a.p402b.p403a.p406c.C8435b;
import com.google.p395al.p398b.p399a.p402b.p403a.p406c.C8437d;
import com.google.p395al.p398b.p399a.p402b.p403a.p406c.C8439f;
import com.google.p395al.p398b.p399a.p402b.p403a.p407d.C8441b;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54079ac;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54084ah;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54098av;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54103b;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54120s;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54124w;
import com.google.protobuf.contrib.android.ProtoParsers;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.o */
/* compiled from: PG */
public final /* synthetic */ class C133896o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133907z f364680a;

    /* renamed from: b */
    public final /* synthetic */ C133714af f364681b;

    /* renamed from: c */
    public final /* synthetic */ c f364682c;

    public /* synthetic */ C133896o(C133907z zVar, C133714af afVar, c cVar) {
        this.f364680a = zVar;
        this.f364681b = afVar;
        this.f364682c = cVar;
    }

    public final C60870cx apply(Object obj) {
        C54079ac acVar;
        Optional optional;
        Optional optional2;
        C133907z zVar = this.f364680a;
        C133714af afVar = this.f364681b;
        c cVar = this.f364682c;
        Optional optional3 = (Optional) obj;
        if (!optional3.isPresent()) {
            return C60856cj.m92900i(Optional.empty());
        }
        C133880h hVar = zVar.f364699b;
        C54120s sVar = (C54120s) optional3.get();
        C54098av avVar = sVar.f142012c;
        if (avVar == null) {
            avVar = C54098av.f141935j;
        }
        if (avVar.f141944h) {
            C54098av avVar2 = sVar.f142012c;
            if (((avVar2 == null ? C54098av.f141935j : avVar2).f141937a & 2) != 0) {
                if (avVar2 == null) {
                    avVar2 = C54098av.f141935j;
                }
                C54103b bVar = avVar2.f141940d;
                if (bVar == null) {
                    bVar = C54103b.f141956g;
                }
                if (bVar.f141959b * 100.0f > ((float) hVar.f364649h)) {
                    C54098av avVar3 = sVar.f142012c;
                    if (((avVar3 == null ? C54098av.f141935j : avVar3).f141937a & 8) != 0) {
                        if (avVar3 == null) {
                            avVar3 = C54098av.f141935j;
                        }
                        C54124w wVar = avVar3.f141941e;
                        if (wVar == null) {
                            wVar = C54124w.f142030c;
                        }
                        if (!wVar.f142033b.isEmpty()) {
                            C54098av avVar4 = sVar.f142012c;
                            if (avVar4 == null) {
                                avVar4 = C54098av.f141935j;
                            }
                            if (avVar4.f141938b.size() == 0) {
                                return C60856cj.m92900i(Optional.empty());
                            }
                            C54098av avVar5 = sVar.f142012c;
                            if (avVar5 == null) {
                                avVar5 = C54098av.f141935j;
                            }
                            C54084ah ahVar = (C54084ah) avVar5.f141938b.get(0);
                            if (ahVar.f141912a == 1) {
                                acVar = (C54079ac) ahVar.f141913b;
                            } else {
                                acVar = C54079ac.f141889k;
                            }
                            C54079ac acVar2 = acVar;
                            if ((acVar2.f141891a & 2) != 0) {
                                C8435b bVar2 = acVar2.f141893c;
                                if (bVar2 == null) {
                                    bVar2 = C8435b.f29324c;
                                }
                                C8437d dVar = bVar2.f29327b;
                                if (dVar == null) {
                                    dVar = C8437d.f29329b;
                                }
                                C8441b bVar3 = ((C8439f) dVar.f29331a.get(0)).f29334a;
                                if (bVar3 == null) {
                                    bVar3 = C8441b.f29337b;
                                }
                                optional = Optional.m71637of(Uri.parse(bVar3.f29339a));
                            } else {
                                optional = Optional.empty();
                            }
                            C60870cx cxVar = (C60870cx) optional.map(new C133876d(hVar)).orElse(C60856cj.m92900i(Optional.empty()));
                            if ((acVar2.f141891a & 64) != 0) {
                                C8435b bVar4 = acVar2.f141898h;
                                if (bVar4 == null) {
                                    bVar4 = C8435b.f29324c;
                                }
                                C8437d dVar2 = bVar4.f29327b;
                                if (dVar2 == null) {
                                    dVar2 = C8437d.f29329b;
                                }
                                C8441b bVar5 = ((C8439f) dVar2.f29331a.get(0)).f29334a;
                                if (bVar5 == null) {
                                    bVar5 = C8441b.f29337b;
                                }
                                optional2 = Optional.m71637of(Uri.parse(bVar5.f29339a));
                            } else {
                                optional2 = Optional.empty();
                            }
                            C60870cx cxVar2 = (C60870cx) optional2.map(new C133876d(hVar)).orElse(C60856cj.m92900i(Optional.empty()));
                            Intent intent = new Intent();
                            intent.setClassName(hVar.f364643b, "com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.DismissalButtonGoogleOnContentReceiver_Receiver");
                            intent.addFlags(268435456);
                            ProtoParsers.m95531n(intent, "EXTRA_RESTORATION_DATA", afVar);
                            C60870cx g = C60922j.m93044g(hVar.f364645d.mo50182b(intent, hVar.f364646e), C47810es.m84963c(new C133878f(hVar, afVar)), hVar.f364647f);
                            C60870cx a = C47638k.m84751b(cxVar, cxVar2, g).mo51520a(new C133877e(hVar, g, sVar, acVar2, cxVar, cxVar2), hVar.f364647f);
                            C60870cx a2 = hVar.f364650i.mo103972a();
                            return C47638k.m84751b(a, a2).mo51520a(new C133873a(hVar, sVar, a, cVar, a2), hVar.f364647f);
                        }
                    }
                    C0118a.m108p(C133880h.f364642a.mo56226d(), "Received an empty invalid peek text.", 40178, C38505d.f101863a, Integer.valueOf(C89885b.EXPLORE_ON_CONTENT_RESPONSE_WITHOUT_PEEK_TEXT_VALUE));
                    return C60856cj.m92900i(Optional.empty());
                }
            }
        }
        return C60856cj.m92900i(Optional.empty());
    }
}
