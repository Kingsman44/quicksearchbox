package com.google.android.libraries.search.assistant.fluidactions.p2554e;

import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45632al;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45633am;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45634an;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45638ar;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45646az;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45670p;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45674t;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45678x;
import com.google.assistant.p3897e.p3921j.C52612ye;
import com.google.assistant.p3897e.p3921j.C52613yf;
import com.google.assistant.p3897e.p3921j.C52615yh;
import com.google.assistant.p3897e.p3921j.C52616yi;
import com.google.assistant.p3897e.p3921j.C52617yj;
import com.google.assistant.p3897e.p3921j.C52622yo;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.assistant.p3897e.p3921j.C52624yq;
import com.google.assistant.p3897e.p3921j.C52625yr;
import com.google.assistant.p3897e.p3921j.C52626ys;
import com.google.assistant.p3897e.p3921j.C52627yt;
import com.google.assistant.p3897e.p3921j.C52632yy;
import com.google.assistant.p3897e.p3921j.C52633yz;
import com.google.assistant.p3897e.p3921j.ade;
import com.google.assistant.p3897e.p3921j.adf;
import com.google.assistant.p3897e.p3921j.adm;
import com.google.common.p4522b.C58370cn;
import com.google.p4242bp.p4266g.C56364n;
import com.google.protos.p4850an.p4855d.p4862g.C63564a;
import com.google.protos.p4850an.p4855d.p4862g.C63565b;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.e.y */
/* compiled from: PG */
public final class C33169y {
    /* renamed from: a */
    public static C45634an m61527a(C52625yr yrVar) {
        C45633am amVar = (C45633am) C45634an.f120041e.createBuilder();
        if ((yrVar.f138172a & 4) != 0) {
            String str = yrVar.f138175d;
            amVar.copyOnWrite();
            C45634an anVar = (C45634an) amVar.instance;
            str.getClass();
            anVar.f120043a |= 16;
            anVar.f120045c = str;
        }
        if ((yrVar.f138172a & 1) != 0) {
            int a = C52615yh.m86661a(yrVar.f138173b);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 1) {
                amVar.copyOnWrite();
                C45634an anVar2 = (C45634an) amVar.instance;
                anVar2.f120044b = 2;
                anVar2.f120043a |= 4;
            } else if (i == 2) {
                amVar.copyOnWrite();
                C45634an anVar3 = (C45634an) amVar.instance;
                anVar3.f120044b = 9;
                anVar3.f120043a |= 4;
            } else if (i == 4) {
                amVar.copyOnWrite();
                C45634an anVar4 = (C45634an) amVar.instance;
                anVar4.f120044b = 7;
                anVar4.f120043a |= 4;
            } else if (i != 5) {
                amVar.copyOnWrite();
                C45634an anVar5 = (C45634an) amVar.instance;
                anVar5.f120044b = 0;
                anVar5.f120043a |= 4;
            } else {
                amVar.copyOnWrite();
                C45634an anVar6 = (C45634an) amVar.instance;
                anVar6.f120044b = 14;
                anVar6.f120043a |= 4;
            }
        }
        return (C45634an) amVar.build();
    }

    /* renamed from: b */
    public static C52623yp m61528b(C45632al alVar) {
        C52622yo yoVar = (C52622yo) C52623yp.f138162g.createBuilder();
        if ((alVar.f120023a & 2) != 0) {
            C45638ar arVar = alVar.f120024b;
            if (arVar == null) {
                arVar = C45638ar.f120061c;
            }
            C52626ys ysVar = (C52626ys) C52627yt.f138176c.createBuilder();
            if (arVar.f120063a.size() != 0) {
                ysVar.mo53899a(arVar.f120063a);
            }
            for (C45678x xVar : arVar.f120064b) {
                C52616yi yiVar = (C52616yi) C52617yj.f138146b.createBuilder();
                for (C45646az azVar : xVar.f120159c) {
                    C52632yy yyVar = (C52632yy) C52633yz.f138192f.createBuilder();
                    if ((azVar.f120087a & 8) != 0) {
                        String str = azVar.f120090d;
                        yyVar.copyOnWrite();
                        C52633yz yzVar = (C52633yz) yyVar.instance;
                        str.getClass();
                        yzVar.f138194a |= 2;
                        yzVar.f138196c = str;
                    }
                    if ((azVar.f120087a & 4) != 0) {
                        String str2 = azVar.f120089c;
                        yyVar.copyOnWrite();
                        C52633yz yzVar2 = (C52633yz) yyVar.instance;
                        str2.getClass();
                        yzVar2.f138194a |= 1;
                        yzVar2.f138195b = str2;
                    }
                    if ((azVar.f120087a & 2) != 0) {
                        long j = azVar.f120088b;
                        yyVar.copyOnWrite();
                        C52633yz yzVar3 = (C52633yz) yyVar.instance;
                        yzVar3.f138194a |= 8;
                        yzVar3.f138198e = j;
                    }
                    if ((azVar.f120087a & 256) != 0) {
                        C52612ye yeVar = (C52612ye) C52613yf.f138138f.createBuilder();
                        C45670p pVar = azVar.f120091e;
                        if (pVar == null) {
                            pVar = C45670p.f120138f;
                        }
                        if ((pVar.f120140a & 1) != 0) {
                            C45670p pVar2 = azVar.f120091e;
                            if (pVar2 == null) {
                                pVar2 = C45670p.f120138f;
                            }
                            String str3 = pVar2.f120141b;
                            yeVar.copyOnWrite();
                            C52613yf yfVar = (C52613yf) yeVar.instance;
                            str3.getClass();
                            yfVar.f138140a |= 1;
                            yfVar.f138141b = str3;
                        }
                        C45670p pVar3 = azVar.f120091e;
                        if (((pVar3 == null ? C45670p.f120138f : pVar3).f120140a & 8) != 0) {
                            if (pVar3 == null) {
                                pVar3 = C45670p.f120138f;
                            }
                            String str4 = pVar3.f120144e;
                            yeVar.copyOnWrite();
                            C52613yf yfVar2 = (C52613yf) yeVar.instance;
                            str4.getClass();
                            yfVar2.f138140a |= 8;
                            yfVar2.f138144e = str4;
                        }
                        C45670p pVar4 = azVar.f120091e;
                        if (((pVar4 == null ? C45670p.f120138f : pVar4).f120140a & 2) != 0) {
                            if (pVar4 == null) {
                                pVar4 = C45670p.f120138f;
                            }
                            String str5 = pVar4.f120142c;
                            yeVar.copyOnWrite();
                            C52613yf yfVar3 = (C52613yf) yeVar.instance;
                            str5.getClass();
                            yfVar3.f138140a |= 2;
                            yfVar3.f138142c = str5;
                        }
                        C45670p pVar5 = azVar.f120091e;
                        if (((pVar5 == null ? C45670p.f120138f : pVar5).f120140a & 4) != 0) {
                            if (pVar5 == null) {
                                pVar5 = C45670p.f120138f;
                            }
                            String str6 = pVar5.f120143d;
                            yeVar.copyOnWrite();
                            C52613yf yfVar4 = (C52613yf) yeVar.instance;
                            str6.getClass();
                            yfVar4.f138140a |= 4;
                            yfVar4.f138143d = str6;
                        }
                        yyVar.copyOnWrite();
                        C52633yz yzVar4 = (C52633yz) yyVar.instance;
                        C52613yf yfVar5 = (C52613yf) yeVar.build();
                        yfVar5.getClass();
                        yzVar4.f138197d = yfVar5;
                        yzVar4.f138194a |= 4;
                    }
                    yiVar.mo53886a(yyVar);
                }
                ysVar.mo53902d((C52617yj) yiVar.build());
            }
            C52627yt ytVar = (C52627yt) ysVar.build();
            yoVar.copyOnWrite();
            C52623yp ypVar = (C52623yp) yoVar.instance;
            ytVar.getClass();
            ypVar.f138165b = ytVar;
            ypVar.f138164a |= 1;
        }
        Collection.EL.stream(alVar.f120026d).forEach(new C33166v(yoVar));
        Collection.EL.stream(alVar.f120029g).forEach(new C33167w(yoVar));
        return (C52623yp) yoVar.build();
    }

    /* renamed from: c */
    public static C52625yr m61529c(C45634an anVar) {
        C52624yq yqVar = (C52624yq) C52625yr.f138170e.createBuilder();
        if ((anVar.f120043a & 16) != 0) {
            String str = anVar.f120045c;
            yqVar.copyOnWrite();
            C52625yr yrVar = (C52625yr) yqVar.instance;
            str.getClass();
            yrVar.f138172a |= 4;
            yrVar.f138175d = str;
        }
        if ((anVar.f120043a & 4) != 0) {
            int a = C45674t.m81357a(anVar.f120044b);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 2) {
                yqVar.copyOnWrite();
                C52625yr yrVar2 = (C52625yr) yqVar.instance;
                yrVar2.f138173b = 1;
                yrVar2.f138172a = 1 | yrVar2.f138172a;
            } else if (i == 7) {
                yqVar.copyOnWrite();
                C52625yr yrVar3 = (C52625yr) yqVar.instance;
                yrVar3.f138173b = 4;
                yrVar3.f138172a = 1 | yrVar3.f138172a;
            } else if (i == 9) {
                yqVar.copyOnWrite();
                C52625yr yrVar4 = (C52625yr) yqVar.instance;
                yrVar4.f138173b = 2;
                yrVar4.f138172a = 1 | yrVar4.f138172a;
            } else if (i != 14) {
                yqVar.copyOnWrite();
                C52625yr yrVar5 = (C52625yr) yqVar.instance;
                yrVar5.f138173b = 0;
                yrVar5.f138172a = 1 | yrVar5.f138172a;
            } else {
                yqVar.copyOnWrite();
                C52625yr yrVar6 = (C52625yr) yqVar.instance;
                yrVar6.f138173b = 5;
                yrVar6.f138172a = 1 | yrVar6.f138172a;
            }
        }
        return (C52625yr) yqVar.build();
    }

    /* renamed from: d */
    public static adm m61530d(C56364n nVar) {
        adf adf = (adf) adm.f134889h.createBuilder();
        if ((nVar.f150312a & 16) != 0) {
            C45632al alVar = nVar.f150314c;
            if (alVar == null) {
                alVar = C45632al.f120021r;
            }
            C52623yp b = m61528b(alVar);
            adf.copyOnWrite();
            adm adm = (adm) adf.instance;
            b.getClass();
            adm.f134892b = b;
            adm.f134891a |= 1;
        }
        return (adm) adf.build();
    }

    /* renamed from: e */
    public static C63565b m61531e(ade ade) {
        C63564a aVar = (C63564a) C63565b.f171933j.createBuilder();
        if ((ade.f134879a & 1) != 0) {
            String str = ade.f134880b;
            aVar.copyOnWrite();
            C63565b bVar = (C63565b) aVar.instance;
            str.getClass();
            bVar.f171935a |= 1;
            bVar.f171936b = str;
        }
        if ((ade.f134879a & 2) != 0) {
            boolean z = ade.f134881c;
            aVar.copyOnWrite();
            C63565b bVar2 = (C63565b) aVar.instance;
            bVar2.f171935a |= 2;
            bVar2.f171937c = z;
        }
        if ((ade.f134879a & 4) != 0) {
            String str2 = ade.f134882d;
            aVar.copyOnWrite();
            C63565b bVar3 = (C63565b) aVar.instance;
            str2.getClass();
            bVar3.f171935a |= 4;
            bVar3.f171938d = str2;
        }
        if ((ade.f134879a & 8) != 0) {
            String str3 = ade.f134883e;
            aVar.copyOnWrite();
            C63565b bVar4 = (C63565b) aVar.instance;
            str3.getClass();
            bVar4.f171935a |= 8;
            bVar4.f171939e = str3;
        }
        if (ade.f134884f.size() != 0) {
            aVar.mo59216a(ade.f134884f);
        }
        if (ade.f134885g.size() != 0) {
            aVar.mo59217b((Iterable) Collection.EL.stream(ade.f134885g).map(C33168x.f88725a).collect(C58370cn.f155946a));
        }
        return (C63565b) aVar.build();
    }
}
