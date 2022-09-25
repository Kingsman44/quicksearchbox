package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9504a.C126879a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129297a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129298b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129299c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129300d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129301e;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129302f;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129303g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129304h;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129305i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129306j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129307k;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129308l;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129311o;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129312p;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.p3926e.C51986gl;
import com.google.assistant.p3897e.p3921j.p3926e.C51991gq;
import com.google.assistant.p3897e.p3921j.p3926e.C51992gr;
import com.google.assistant.p3897e.p3921j.p3926e.C51994gt;
import com.google.assistant.p3897e.p3921j.p3926e.C52030ib;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.protos.p4816ai.p4818b.C63204j;
import com.google.protos.p4985f.p5042u.C65340b;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.suggestion.y */
/* compiled from: PG */
public final class C129337y {

    /* renamed from: a */
    public static final C129337y f355222a = new C129337y();

    /* renamed from: b */
    private static final C58974d f355223b = C58974d.m91136j();

    /* renamed from: c */
    private final AtomicInteger f355224c = new AtomicInteger(0);

    private C129337y() {
    }

    /* renamed from: b */
    public static C60870cx m211156b(C129300d dVar, C126879a aVar) {
        Optional c = m211157c(dVar.f355130a);
        if (c.isEmpty()) {
            return C60866ct.f164955a;
        }
        Intent intent = (Intent) c.get();
        if (!dVar.f355131b.isEmpty()) {
            intent.setPackage(dVar.f355131b);
        }
        int a = C129299c.m211113a(dVar.f355132c);
        if (a == 0) {
            a = 1;
        }
        if (a - 2 != 1) {
            return C60866ct.f164955a;
        }
        if (intent.getBooleanExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.START_ACTIVITY_FOR_RESULT", false)) {
            return aVar.mo39653g(intent);
        }
        return aVar.mo20101f(intent);
    }

    /* renamed from: c */
    public static Optional m211157c(String str) {
        if (TextUtils.isEmpty(str)) {
            return Optional.empty();
        }
        try {
            return Optional.m71637of(Intent.parseUri(str, 0));
        } catch (URISyntaxException e) {
            ((C58970a) ((C58970a) ((C58970a) f355223b.mo56226d()).mo56382g(e)).mo56372aa(38271)).mo56389s("Can't parse Intent from  uri: %s", str);
            return Optional.empty();
        }
    }

    /* renamed from: d */
    public static boolean m211158d(C51992gr grVar) {
        if ((grVar.f136447a & 16384) != 0) {
            try {
                C52030ib ibVar = grVar.f136461o;
                if (ibVar == null) {
                    ibVar = C52030ib.f136561a;
                }
                C52030ib ibVar2 = (C52030ib) C62942bv.parseFrom((C62942bv) C52030ib.f136561a, ibVar.toByteArray(), C62921ba.m95368a());
                C62940bt r0 = C62942bv.checkIsLite(C65340b.f176697b);
                ibVar2.mo58887l(r0);
                return ibVar2.f169962ag.mo58857o(r0.f169971d);
            } catch (C62974ct e) {
                ((C58970a) ((C58970a) ((C58970a) f355223b.mo56226d()).mo56382g(e)).mo56372aa(38273)).mo56386p("Fail to parse ClarificationData");
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C58485gu mo108976a(C51986gl glVar, PackageManager packageManager) {
        Optional optional;
        C129300d dVar;
        int i;
        int a;
        C51058ev evVar;
        PackageManager packageManager2 = packageManager;
        C58480gp e = C58485gu.m89837e();
        HashSet hashSet = new HashSet();
        for (C51992gr grVar : glVar.f136424b) {
            if (!m211158d(grVar)) {
                C129307k kVar = (C129307k) C129308l.f355150g.createBuilder();
                String str = grVar.f136451e;
                kVar.copyOnWrite();
                str.getClass();
                ((C129308l) kVar.instance).f355154c = str;
                C51012dc dcVar = grVar.f136452f;
                if (dcVar == null) {
                    dcVar = C51012dc.f132813k;
                }
                if ((dcVar.f132815a & 2) != 0) {
                    C129305i iVar = (C129305i) C129306j.f355146c.createBuilder();
                    C51012dc dcVar2 = grVar.f136452f;
                    if (dcVar2 == null) {
                        dcVar2 = C51012dc.f132813k;
                    }
                    String str2 = dcVar2.f132817c;
                    iVar.copyOnWrite();
                    C129306j jVar = (C129306j) iVar.instance;
                    str2.getClass();
                    jVar.f355148a |= 1;
                    jVar.f355149b = str2;
                    kVar.copyOnWrite();
                    C129306j jVar2 = (C129306j) iVar.build();
                    jVar2.getClass();
                    ((C129308l) kVar.instance).f355156e = jVar2;
                }
                C51012dc dcVar3 = grVar.f136452f;
                if (((dcVar3 == null ? C51012dc.f132813k : dcVar3).f132815a & 64) != 0) {
                    if (dcVar3 == null) {
                        dcVar3 = C51012dc.f132813k;
                    }
                    String str3 = dcVar3.f132822h;
                    kVar.copyOnWrite();
                    str3.getClass();
                    ((C129308l) kVar.instance).f355155d = str3;
                }
                if ((grVar.f136447a & 32768) != 0) {
                    C51991gq gqVar = grVar.f136462p;
                    if (gqVar == null) {
                        gqVar = C51991gq.f136433k;
                    }
                    kVar.copyOnWrite();
                    C129308l lVar = (C129308l) kVar.instance;
                    gqVar.getClass();
                    lVar.f355157f = gqVar;
                    lVar.f355152a |= 1;
                }
                String num = Integer.toString(this.f355224c.getAndIncrement());
                kVar.copyOnWrite();
                num.getClass();
                ((C129308l) kVar.instance).f355153b = num;
                C129301e eVar = (C129301e) C129302f.f355133f.createBuilder();
                C51994gt gtVar = grVar.f136454h;
                if (gtVar == null) {
                    gtVar = C51994gt.f136465g;
                }
                C51994gt gtVar2 = gtVar;
                try {
                    C51098gh ghVar = grVar.f136453g;
                    if (ghVar == null) {
                        ghVar = C51098gh.f133009e;
                    }
                    if (ghVar.f133012b == 1) {
                        C51098gh ghVar2 = grVar.f136453g;
                        if (ghVar2 == null) {
                            ghVar2 = C51098gh.f133009e;
                        }
                        if (ghVar2.f133012b == 1) {
                            evVar = (C51058ev) ghVar2.f133013c;
                        } else {
                            evVar = C51058ev.f132941o;
                        }
                        int i2 = evVar.f132943a;
                        if ((i2 & 32) == 0) {
                            if ((i2 & 1) == 0) {
                                optional = Optional.empty();
                            }
                        }
                        C129298b bVar = (C129298b) C129300d.f355128d.createBuilder();
                        bVar.copyOnWrite();
                        ((C129300d) bVar.instance).f355132c = 1;
                        if ((evVar.f132943a & 32) != 0) {
                            String str4 = evVar.f132949g;
                            bVar.copyOnWrite();
                            str4.getClass();
                            ((C129300d) bVar.instance).f355130a = str4;
                        } else {
                            Intent launchIntentForPackage = packageManager2.getLaunchIntentForPackage(evVar.f132944b);
                            if (launchIntentForPackage != null) {
                                String uri = launchIntentForPackage.toUri(0);
                                bVar.copyOnWrite();
                                uri.getClass();
                                ((C129300d) bVar.instance).f355130a = uri;
                            } else {
                                ((C58970a) ((C58970a) f355223b.mo56226d()).mo56372aa(38270)).mo56389s("Failed to generate intent from package name %s.", evVar.f132944b);
                                optional = Optional.empty();
                            }
                        }
                        if ((evVar.f132943a & 1) != 0) {
                            String str5 = evVar.f132944b;
                            bVar.copyOnWrite();
                            str5.getClass();
                            ((C129300d) bVar.instance).f355131b = str5;
                        }
                        optional = Optional.m71637of(bVar);
                    } else {
                        optional = Optional.empty();
                    }
                } catch (RuntimeException e2) {
                    ((C58970a) ((C58970a) ((C58970a) f355223b.mo56226d()).mo56382g(e2)).mo56372aa(38269)).mo56389s("Failed to fetch Android Intent from following suggestion:%s", grVar.f136451e);
                    optional = Optional.empty();
                }
                if (optional.isPresent()) {
                    eVar.copyOnWrite();
                    C129302f fVar = (C129302f) eVar.instance;
                    C129300d dVar2 = (C129300d) ((C129298b) optional.get()).build();
                    dVar2.getClass();
                    fVar.f355136b = dVar2;
                    fVar.f355135a = 3;
                } else if ((gtVar2.f136467a & 2) != 0) {
                    String str6 = gtVar2.f136469c;
                    eVar.copyOnWrite();
                    C129302f fVar2 = (C129302f) eVar.instance;
                    str6.getClass();
                    fVar2.f355135a = 2;
                    fVar2.f355136b = str6;
                } else {
                    String str7 = grVar.f136451e;
                    eVar.copyOnWrite();
                    C129302f fVar3 = (C129302f) eVar.instance;
                    str7.getClass();
                    fVar3.f355135a = 2;
                    fVar3.f355136b = str7;
                }
                if ((gtVar2.f136467a & 1) != 0) {
                    boolean z = gtVar2.f136468b;
                    eVar.copyOnWrite();
                    ((C129302f) eVar.instance).f355137c = z;
                }
                if ((gtVar2.f136467a & 16) != 0) {
                    boolean z2 = gtVar2.f136471e;
                    eVar.copyOnWrite();
                    ((C129302f) eVar.instance).f355139e = z2;
                }
                if ((gtVar2.f136467a & 8) != 0) {
                    C63088z zVar = gtVar2.f136470d;
                    eVar.copyOnWrite();
                    zVar.getClass();
                    ((C129302f) eVar.instance).f355138d = zVar;
                }
                C129311o oVar = (C129311o) C129312p.f355162d.createBuilder();
                if ((grVar.f136447a & 2048) != 0) {
                    boolean z3 = grVar.f136458l;
                    oVar.copyOnWrite();
                    ((C129312p) oVar.instance).f355165b = z3;
                }
                if ((grVar.f136447a & 4) != 0) {
                    int i3 = grVar.f136450d;
                    oVar.copyOnWrite();
                    ((C129312p) oVar.instance).f355164a = i3;
                }
                if ((grVar.f136447a & 1024) != 0) {
                    try {
                        C52230ka kaVar = grVar.f136457k;
                        if (kaVar == null) {
                            kaVar = C52230ka.f137057d;
                        }
                        C63204j jVar3 = (C63204j) C62942bv.parseFrom((C62942bv) C63204j.f170749e, kaVar.f137061c, C62921ba.m95368a());
                        oVar.copyOnWrite();
                        jVar3.getClass();
                        ((C129312p) oVar.instance).f355166c = jVar3;
                    } catch (C62974ct e3) {
                        ((C58970a) ((C58970a) ((C58970a) f355223b.mo56226d()).mo56382g(e3)).mo56372aa(38267)).mo56386p("Failed to parse feature tree ref");
                    }
                }
                C129303g gVar = (C129303g) C129304h.f355140d.createBuilder();
                gVar.copyOnWrite();
                C129308l lVar2 = (C129308l) kVar.build();
                lVar2.getClass();
                ((C129304h) gVar.instance).f355142a = lVar2;
                gVar.copyOnWrite();
                C129302f fVar4 = (C129302f) eVar.build();
                fVar4.getClass();
                ((C129304h) gVar.instance).f355143b = fVar4;
                C129312p pVar = (C129312p) oVar.build();
                gVar.copyOnWrite();
                pVar.getClass();
                ((C129304h) gVar.instance).f355144c = pVar;
                C129304h hVar = (C129304h) gVar.build();
                C129302f fVar5 = hVar.f355143b;
                int a2 = C129297a.m211112a((fVar5 == null ? C129302f.f355133f : fVar5).f355135a);
                int i4 = a2 - 1;
                if (a2 != 0) {
                    if (i4 == 0) {
                        if (fVar5 == null) {
                            fVar5 = C129302f.f355133f;
                        }
                        if ((fVar5.f355135a == 2 ? (String) fVar5.f355136b : BuildConfig.FLAVOR).isEmpty()) {
                        }
                    } else if (i4 == 1) {
                        if (fVar5 == null) {
                            fVar5 = C129302f.f355133f;
                        }
                        if (fVar5.f355135a == 3) {
                            dVar = (C129300d) fVar5.f355136b;
                        } else {
                            dVar = C129300d.f355128d;
                        }
                        if (!dVar.f355130a.isEmpty() && ((a = C129299c.m211113a(i)) == 0 || a != 2)) {
                            int a3 = C129299c.m211113a((i = dVar.f355132c));
                            if (a3 == 0) {
                                a3 = 1;
                            }
                            if (a3 - 2 == 1 && !dVar.f355131b.isEmpty()) {
                                Optional c = m211157c(dVar.f355130a);
                                if (c.isPresent()) {
                                    Intent intent = (Intent) c.get();
                                    if (!dVar.f355131b.isEmpty()) {
                                        intent.setPackage(dVar.f355131b);
                                    }
                                    int a4 = C129299c.m211113a(dVar.f355132c);
                                    if (a4 == 0) {
                                        a4 = 1;
                                    }
                                    if (a4 - 2 == 1) {
                                        ResolveInfo resolveActivity = packageManager2.resolveActivity(intent, 0);
                                        if (resolveActivity != null) {
                                            if (resolveActivity.activityInfo != null) {
                                                if (resolveActivity.activityInfo.packageName == null) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (i4 == 2) {
                        ((C58970a) ((C58970a) f355223b.mo56226d()).mo56372aa(38272)).mo56386p("Suggestion does not have an action set.");
                    }
                    if ((grVar.f136447a & 128) == 0 || hashSet.add(grVar.f136455i)) {
                        e.mo55395g(hVar);
                    }
                } else {
                    throw null;
                }
            }
        }
        return e.mo55394f();
    }
}
