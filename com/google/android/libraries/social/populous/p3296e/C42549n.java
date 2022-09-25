package com.google.android.libraries.social.populous.p3296e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.social.populous.core.C42262ao;
import com.google.android.libraries.social.populous.core.C42276bb;
import com.google.android.libraries.social.populous.core.C42279be;
import com.google.android.libraries.social.populous.core.C42334df;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.SessionContext;
import com.google.android.libraries.social.populous.logging.C42575j;
import com.google.android.libraries.social.populous.logging.C42576k;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42426e;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42427f;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42435n;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42444w;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4575r.C60757n;
import com.google.p4181bi.C55794ad;
import com.google.p4181bi.C55797ag;
import com.google.p4181bi.C55828ba;
import com.google.p4181bi.C55846h;
import com.google.p4181bi.C55847i;
import com.google.p4181bi.C55855q;
import com.google.p4181bi.C55856r;
import com.google.p4181bi.C55864z;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69296d;

/* renamed from: com.google.android.libraries.social.populous.e.n */
/* compiled from: PG */
public final class C42549n {

    /* renamed from: a */
    public final String f111604a;

    /* renamed from: b */
    public final String f111605b;

    /* renamed from: c */
    public final long f111606c;

    /* renamed from: d */
    public final SessionContext f111607d;

    /* renamed from: e */
    public final C42279be f111608e;

    /* renamed from: f */
    public final ClientConfigInternal f111609f;

    /* renamed from: g */
    public final C42444w f111610g;

    /* renamed from: h */
    public final C42591z f111611h;

    /* renamed from: i */
    public final C42576k f111612i;

    /* renamed from: j */
    public C58872ci f111613j;

    /* renamed from: k */
    public int f111614k = 0;

    /* renamed from: l */
    public final HashSet f111615l = new HashSet();

    /* renamed from: m */
    public final int[] f111616m;

    /* renamed from: n */
    public final C42435n f111617n = new C42435n();

    /* renamed from: o */
    public int f111618o = 0;

    /* renamed from: p */
    public int f111619p = 0;

    /* renamed from: q */
    public int f111620q;

    /* renamed from: r */
    public final int f111621r;

    public C42549n(String str, long j, SessionContext sessionContext, C42279be beVar, ClientConfigInternal clientConfigInternal, int i, C42591z zVar, C42576k kVar) {
        String str2;
        int i2;
        C58833ax axVar;
        int i3;
        SessionContext sessionContext2;
        C42276bb bbVar;
        this.f111604a = str;
        if (C69296d.f185416a.mo6453a().mo60961f()) {
            str2 = str.trim();
            int i4 = C60757n.m92748i(C69296d.f185416a.mo6453a().mo60956a());
            if (str2.length() > i4) {
                str2 = str2.substring(0, i4);
            }
        } else {
            str2 = str.trim();
        }
        this.f111605b = str2;
        this.f111606c = j;
        this.f111607d = sessionContext;
        this.f111608e = beVar;
        this.f111609f = clientConfigInternal;
        this.f111611h = zVar;
        C42426e eVar = new C42426e();
        eVar.mo45474a(true);
        C42276bb bbVar2 = C42276bb.PARTIAL;
        if (bbVar2 != null) {
            eVar.f111288c = bbVar2;
            eVar.f111290e = 1;
            eVar.f111286a = sessionContext;
            if (str2.isEmpty()) {
                i2 = clientConfigInternal.f110716R;
            } else {
                i2 = clientConfigInternal.f110717S;
            }
            eVar.f111290e = i2;
            eVar.mo45474a(clientConfigInternal.f110738x);
            eVar.f111288c = clientConfigInternal.f110739y;
            SessionContext sessionContext3 = eVar.f111286a;
            if (sessionContext3 == null) {
                axVar = C58836b.f156633a;
            } else {
                axVar = C58833ax.m90834k(sessionContext3);
            }
            if (!axVar.mo56113h()) {
                eVar.f111286a = new C42334df().mo45315a();
            }
            if (eVar.f111289d != 1 || (i3 = eVar.f111290e) == 0 || (sessionContext2 = eVar.f111286a) == null || (bbVar = eVar.f111288c) == null) {
                StringBuilder sb = new StringBuilder();
                if (eVar.f111290e == 0) {
                    sb.append(" resultsGroupingOption");
                }
                if (eVar.f111286a == null) {
                    sb.append(" sessionContext");
                }
                if (eVar.f111289d == 0) {
                    sb.append(" useLiveAutocomplete");
                }
                if (eVar.f111288c == null) {
                    sb.append(" minimumTopNCacheCallbackStatus");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            this.f111610g = new C42427f(i3, sessionContext2, eVar.f111287b, bbVar);
            this.f111621r = i;
            C42575j a = kVar.mo45663a();
            a.f111730a = Long.valueOf(j);
            this.f111612i = a.mo45662a();
            this.f111616m = new int[((Integer) sessionContext.f110812f.mo56106b(C42548m.f111603a).mo56109e(0)).intValue()];
            return;
        }
        throw new NullPointerException("Null minimumTopNCacheCallbackStatus");
    }

    /* renamed from: a */
    public final long mo45554a() {
        C58872ci ciVar = this.f111613j;
        if (ciVar != null) {
            return ciVar.mo56158a(TimeUnit.NANOSECONDS);
        }
        return -1;
    }

    /* renamed from: b */
    public final C58528ij mo45555b(C42405ab abVar) {
        String str;
        C55864z zVar;
        C55828ba baVar;
        C55828ba baVar2;
        C55797ag agVar;
        C55797ag agVar2;
        C55797ag agVar3;
        C55797ag agVar4;
        C55797ag agVar5;
        C55797ag agVar6;
        C55794ad adVar;
        C58526ih ihVar = new C58526ih();
        if (abVar.mo45412n() - 1 == 0) {
            int a = C55846h.m87793a(((C55847i) abVar.f111226a.mo56107c()).f147360a);
            int i = a - 1;
            if (a == 0) {
                throw null;
            } else if (i == 0) {
                C58485gu f = abVar.mo45404f(this.f111609f.f110725k);
                int size = f.size();
                int i2 = 0;
                while (i2 < size) {
                    C55856r rVar = (C55856r) f.get(i2);
                    int i3 = rVar.f147383b;
                    int a2 = C55855q.m87794a(i3);
                    int i4 = a2 - 1;
                    if (a2 != 0) {
                        if (i4 == 0) {
                            if (i3 == 2) {
                                zVar = (C55864z) rVar.f147384c;
                            } else {
                                zVar = C55864z.f147406f;
                            }
                            str = zVar.f147409b.toLowerCase(Locale.ROOT).trim();
                        } else if (i4 != 1) {
                            str = BuildConfig.FLAVOR;
                            if (i4 == 2) {
                                if (i3 == 4) {
                                    agVar = (C55797ag) rVar.f147384c;
                                } else {
                                    agVar = C55797ag.f147232e;
                                }
                                if ((agVar.f147234a & 1) != 0) {
                                    if (rVar.f147383b == 4) {
                                        agVar6 = (C55797ag) rVar.f147384c;
                                    } else {
                                        agVar6 = C55797ag.f147232e;
                                    }
                                    str = agVar6.f147237d;
                                } else {
                                    int i5 = rVar.f147383b;
                                    if (i5 == 4) {
                                        agVar2 = (C55797ag) rVar.f147384c;
                                    } else {
                                        agVar2 = C55797ag.f147232e;
                                    }
                                    if (agVar2.f147235b == 2) {
                                        if (i5 == 4) {
                                            agVar5 = (C55797ag) rVar.f147384c;
                                        } else {
                                            agVar5 = C55797ag.f147232e;
                                        }
                                        if (agVar5.f147235b == 2) {
                                            str = (String) agVar5.f147236c;
                                        }
                                        str = "iant:".concat(String.valueOf(str));
                                    } else {
                                        if (i5 == 4) {
                                            agVar3 = (C55797ag) rVar.f147384c;
                                        } else {
                                            agVar3 = C55797ag.f147232e;
                                        }
                                        if (agVar3.f147235b == 3) {
                                            if (i5 == 4) {
                                                agVar4 = (C55797ag) rVar.f147384c;
                                            } else {
                                                agVar4 = C55797ag.f147232e;
                                            }
                                            if (agVar4.f147235b == 3) {
                                                str = (String) agVar4.f147236c;
                                            }
                                            str = "iant:".concat(String.valueOf(str));
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i3 == 3) {
                                baVar = (C55828ba) rVar.f147384c;
                            } else {
                                baVar = C55828ba.f147322d;
                            }
                            if ((baVar.f147324a & 2) != 0) {
                                str = (rVar.f147383b == 3 ? (C55828ba) rVar.f147384c : C55828ba.f147322d).f147326c;
                            } else {
                                if (rVar.f147383b == 3) {
                                    baVar2 = (C55828ba) rVar.f147384c;
                                } else {
                                    baVar2 = C55828ba.f147322d;
                                }
                                str = baVar2.f147325b;
                            }
                        }
                        ihVar.mo55373c(str);
                        i2++;
                    } else {
                        throw null;
                    }
                }
            } else if (i == 1 && this.f111609f.f110725k.contains(C42262ao.GROUP)) {
                C55847i iVar = (C55847i) abVar.f111226a.mo56107c();
                if (iVar.f147360a == 2) {
                    adVar = (C55794ad) iVar.f147361b;
                } else {
                    adVar = C55794ad.f147223g;
                }
                ihVar.mo55373c(adVar.f147229e);
            }
        }
        return ihVar.mo55486f();
    }
}
