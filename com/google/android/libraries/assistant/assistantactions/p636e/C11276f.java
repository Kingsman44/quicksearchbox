package com.google.android.libraries.assistant.assistantactions.p636e;

import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45631ak;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45632al;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45635ao;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45638ar;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45645ay;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45646az;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45669o;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45670p;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45677w;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45678x;
import com.google.assistant.p3897e.p3921j.C52613yf;
import com.google.assistant.p3897e.p3921j.C52617yj;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.assistant.p3897e.p3921j.C52627yt;
import com.google.assistant.p3897e.p3921j.C52633yz;
import com.google.assistant.p3897e.p3921j.adm;
import com.google.p4242bp.p4266g.C56359i;
import com.google.p4242bp.p4266g.C56364n;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.assistantactions.e.f */
/* compiled from: PG */
public final /* synthetic */ class C11276f implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C11276f f36697a = new C11276f();

    private /* synthetic */ C11276f() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        adm adm = (adm) obj;
        C56359i iVar = (C56359i) C56364n.f150310j.createBuilder();
        if ((adm.f134891a & 1) != 0) {
            C52623yp ypVar = adm.f134892b;
            if (ypVar == null) {
                ypVar = C52623yp.f138162g;
            }
            C45631ak akVar = (C45631ak) C45632al.f120021r.createBuilder();
            if ((ypVar.f138164a & 1) != 0) {
                C52627yt ytVar = ypVar.f138165b;
                if (ytVar == null) {
                    ytVar = C52627yt.f138176c;
                }
                C45635ao aoVar = (C45635ao) C45638ar.f120061c.createBuilder();
                if (ytVar.f138178a.size() != 0) {
                    aoVar.mo49725a(ytVar.f138178a);
                }
                for (C52617yj yjVar : ytVar.f138179b) {
                    C45677w wVar = (C45677w) C45678x.f120155d.createBuilder();
                    for (C52633yz yzVar : yjVar.f138148a) {
                        C45645ay ayVar = (C45645ay) C45646az.f120085f.createBuilder();
                        if ((yzVar.f138194a & 2) != 0) {
                            String str = yzVar.f138196c;
                            ayVar.copyOnWrite();
                            C45646az azVar = (C45646az) ayVar.instance;
                            str.getClass();
                            azVar.f120087a |= 8;
                            azVar.f120090d = str;
                        }
                        if ((yzVar.f138194a & 1) != 0) {
                            String str2 = yzVar.f138195b;
                            ayVar.copyOnWrite();
                            C45646az azVar2 = (C45646az) ayVar.instance;
                            str2.getClass();
                            azVar2.f120087a |= 4;
                            azVar2.f120089c = str2;
                        }
                        if ((yzVar.f138194a & 8) != 0) {
                            long j = yzVar.f138198e;
                            ayVar.copyOnWrite();
                            C45646az azVar3 = (C45646az) ayVar.instance;
                            azVar3.f120087a |= 2;
                            azVar3.f120088b = j;
                        }
                        if ((yzVar.f138194a & 4) != 0) {
                            C45669o oVar = (C45669o) C45670p.f120138f.createBuilder();
                            C52613yf yfVar = yzVar.f138197d;
                            if (yfVar == null) {
                                yfVar = C52613yf.f138138f;
                            }
                            if ((yfVar.f138140a & 1) != 0) {
                                C52613yf yfVar2 = yzVar.f138197d;
                                if (yfVar2 == null) {
                                    yfVar2 = C52613yf.f138138f;
                                }
                                String str3 = yfVar2.f138141b;
                                oVar.copyOnWrite();
                                C45670p pVar = (C45670p) oVar.instance;
                                str3.getClass();
                                pVar.f120140a |= 1;
                                pVar.f120141b = str3;
                            }
                            C52613yf yfVar3 = yzVar.f138197d;
                            if (((yfVar3 == null ? C52613yf.f138138f : yfVar3).f138140a & 8) != 0) {
                                if (yfVar3 == null) {
                                    yfVar3 = C52613yf.f138138f;
                                }
                                String str4 = yfVar3.f138144e;
                                oVar.copyOnWrite();
                                C45670p pVar2 = (C45670p) oVar.instance;
                                str4.getClass();
                                pVar2.f120140a |= 8;
                                pVar2.f120144e = str4;
                            }
                            C52613yf yfVar4 = yzVar.f138197d;
                            if (((yfVar4 == null ? C52613yf.f138138f : yfVar4).f138140a & 2) != 0) {
                                if (yfVar4 == null) {
                                    yfVar4 = C52613yf.f138138f;
                                }
                                String str5 = yfVar4.f138142c;
                                oVar.copyOnWrite();
                                C45670p pVar3 = (C45670p) oVar.instance;
                                str5.getClass();
                                pVar3.f120140a |= 2;
                                pVar3.f120142c = str5;
                            }
                            C52613yf yfVar5 = yzVar.f138197d;
                            if (((yfVar5 == null ? C52613yf.f138138f : yfVar5).f138140a & 4) != 0) {
                                if (yfVar5 == null) {
                                    yfVar5 = C52613yf.f138138f;
                                }
                                String str6 = yfVar5.f138143d;
                                oVar.copyOnWrite();
                                C45670p pVar4 = (C45670p) oVar.instance;
                                str6.getClass();
                                pVar4.f120140a |= 4;
                                pVar4.f120143d = str6;
                            }
                            ayVar.copyOnWrite();
                            C45646az azVar4 = (C45646az) ayVar.instance;
                            C45670p pVar5 = (C45670p) oVar.build();
                            pVar5.getClass();
                            azVar4.f120091e = pVar5;
                            azVar4.f120087a |= 256;
                        }
                        wVar.mo49730a(ayVar);
                    }
                    aoVar.mo49727c((C45678x) wVar.build());
                }
                C45638ar arVar = (C45638ar) aoVar.build();
                akVar.copyOnWrite();
                C45632al alVar = (C45632al) akVar.instance;
                arVar.getClass();
                alVar.f120024b = arVar;
                alVar.f120023a |= 2;
            }
            Collection.EL.stream(ypVar.f138166c).forEach(new C11274d(akVar));
            Collection.EL.stream(ypVar.f138169f).forEach(new C11275e(akVar));
            C45632al alVar2 = (C45632al) akVar.build();
            iVar.copyOnWrite();
            C56364n nVar = (C56364n) iVar.instance;
            alVar2.getClass();
            nVar.f150314c = alVar2;
            nVar.f150312a |= 16;
        }
        return (C56364n) iVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
