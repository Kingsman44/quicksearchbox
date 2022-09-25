package com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.p10154a.C133707a;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.C139787a;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.p10530a.C139789b;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1703d.C20642af;
import com.google.android.libraries.p1703d.C20660p;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.C60483ro;
import com.google.common.p4552o.C60485rq;
import com.google.common.p4552o.C60486rr;
import com.google.common.p4552o.C60487rs;
import com.google.common.p4552o.C60488rt;
import com.google.common.p4552o.C60489ru;
import com.google.common.p4552o.C60497sb;
import com.google.common.p4552o.C60499sd;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.ConcurrentMap;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.d.a.p */
/* compiled from: PG */
final class C133730p extends C20660p {

    /* renamed from: a */
    final /* synthetic */ C133731q f364231a;

    public C133730p(C133731q qVar) {
        this.f364231a = qVar;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        C133731q qVar = this.f364231a;
        C133737w wVar = qVar.f364244m;
        int i = qVar.f364235d;
        C133739y yVar = wVar.f364255a;
        ConcurrentMap concurrentMap = yVar.f364260c;
        Integer valueOf = Integer.valueOf(i);
        concurrentMap.remove(valueOf);
        yVar.f364261d.remove(valueOf);
        super.finalize();
    }

    /* renamed from: g */
    public final void mo25642g() {
        C47538ax c = this.f364231a.f364237f.mo51613c("onWarmupCompleted");
        try {
            this.f364231a.f364243l = true;
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C133722h.m216948a(th, th);
        }
        throw th;
    }

    /* renamed from: h */
    public final void mo25643h(long j, Long l) {
        C47538ax c = this.f364231a.f364237f.mo51613c("onFirstContentfulPaintMetricReceived");
        try {
            if (this.f364231a.f364241j) {
                C133707a aVar = this.f364231a.f364236e;
                C19559g.m37304c();
                C58838bb.m90883r(aVar.f364191h);
                if (!aVar.f364192i) {
                    if (!aVar.f364190g) {
                        aVar.f364190g = true;
                        if (aVar.f364188e) {
                            aVar.f364187d.mo115239b();
                            aVar.f364187d.mo115242e(aVar.mo111344d());
                        }
                        aVar.mo111345e(C89849ae.CCT_FIRST_CONTENTFUL_PAINT, l);
                    }
                    C60483ro roVar = (C60483ro) C60489ru.f163711h.createBuilder();
                    roVar.copyOnWrite();
                    C60489ru ruVar = (C60489ru) roVar.instance;
                    ruVar.f163714b = 6;
                    ruVar.f163713a = 1 | ruVar.f163713a;
                    int a = aVar.mo111341a();
                    roVar.copyOnWrite();
                    C60489ru ruVar2 = (C60489ru) roVar.instance;
                    ruVar2.f163713a |= 2;
                    ruVar2.f163715c = a;
                    int i = (int) j;
                    roVar.copyOnWrite();
                    C60489ru ruVar3 = (C60489ru) roVar.instance;
                    ruVar3.f163713a |= 8;
                    ruVar3.f163717e = i;
                    if (l != null) {
                        int b = aVar.mo111342b(l.longValue());
                        roVar.copyOnWrite();
                        C60489ru ruVar4 = (C60489ru) roVar.instance;
                        ruVar4.f163713a |= 4;
                        ruVar4.f163716d = b;
                    }
                    aVar.mo111346f((C60489ru) roVar.build());
                    C60497sb sbVar = aVar.f364186c;
                    C60499sd sdVar = (C60499sd) sbVar.instance;
                    int i2 = sdVar.f163779a;
                    if ((i2 & 8) == 0 && (i2 & 2) != 0) {
                        int i3 = sdVar.f163781c + i;
                        sbVar.copyOnWrite();
                        C60499sd sdVar2 = (C60499sd) sbVar.instance;
                        sdVar2.f163779a |= 8;
                        sdVar2.f163783e = i3;
                    }
                }
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } else if (c != null) {
                c.close();
                return;
            } else {
                return;
            }
        } catch (Throwable th) {
            C133722h.m216948a(th, th);
        }
        throw th;
    }

    /* renamed from: j */
    public final void mo25645j(long j, Long l) {
        C47538ax c = this.f364231a.f364237f.mo51613c("onLoadEventStartMetricReceived");
        try {
            if (this.f364231a.f364241j) {
                C133707a aVar = this.f364231a.f364236e;
                C19559g.m37304c();
                C58838bb.m90883r(aVar.f364191h);
                if (!aVar.f364192i) {
                    C60483ro roVar = (C60483ro) C60489ru.f163711h.createBuilder();
                    roVar.copyOnWrite();
                    C60489ru ruVar = (C60489ru) roVar.instance;
                    ruVar.f163714b = 7;
                    ruVar.f163713a |= 1;
                    int a = aVar.mo111341a();
                    roVar.copyOnWrite();
                    C60489ru ruVar2 = (C60489ru) roVar.instance;
                    ruVar2.f163713a |= 2;
                    ruVar2.f163715c = a;
                    int i = (int) j;
                    roVar.copyOnWrite();
                    C60489ru ruVar3 = (C60489ru) roVar.instance;
                    ruVar3.f163713a |= 8;
                    ruVar3.f163717e = i;
                    if (l != null) {
                        int b = aVar.mo111342b(l.longValue());
                        roVar.copyOnWrite();
                        C60489ru ruVar4 = (C60489ru) roVar.instance;
                        ruVar4.f163713a |= 4;
                        ruVar4.f163716d = b;
                    }
                    aVar.mo111346f((C60489ru) roVar.build());
                }
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } else if (c != null) {
                c.close();
                return;
            } else {
                return;
            }
        } catch (Throwable th) {
            C133722h.m216948a(th, th);
        }
        throw th;
    }

    /* renamed from: m */
    public final void mo25648m(Bundle bundle) {
        C47538ax c = this.f364231a.f364237f.mo51613c("onPageLoadMetricsReceived");
        try {
            if (this.f364231a.f364241j) {
                C133707a aVar = this.f364231a.f364236e;
                C19559g.m37304c();
                C58838bb.m90883r(aVar.f364191h);
                if (!aVar.f364192i) {
                    C60483ro roVar = (C60483ro) C60489ru.f163711h.createBuilder();
                    roVar.copyOnWrite();
                    C60489ru ruVar = (C60489ru) roVar.instance;
                    ruVar.f163714b = 8;
                    ruVar.f163713a |= 1;
                    int a = aVar.mo111341a();
                    roVar.copyOnWrite();
                    C60489ru ruVar2 = (C60489ru) roVar.instance;
                    ruVar2.f163713a |= 2;
                    ruVar2.f163715c = a;
                    C60487rs rsVar = (C60487rs) C60488rt.f163701i.createBuilder();
                    long j = bundle.getLong("domainLookupStart", -1);
                    rsVar.copyOnWrite();
                    C60488rt rtVar = (C60488rt) rsVar.instance;
                    rtVar.f163703a |= 1;
                    rtVar.f163704b = j;
                    long j2 = bundle.getLong("domainLookupEnd", -1);
                    rsVar.copyOnWrite();
                    C60488rt rtVar2 = (C60488rt) rsVar.instance;
                    rtVar2.f163703a |= 2;
                    rtVar2.f163705c = j2;
                    long j3 = bundle.getLong("connectStart", -1);
                    rsVar.copyOnWrite();
                    C60488rt rtVar3 = (C60488rt) rsVar.instance;
                    rtVar3.f163703a |= 4;
                    rtVar3.f163706d = j3;
                    long j4 = bundle.getLong("connectEnd", -1);
                    rsVar.copyOnWrite();
                    C60488rt rtVar4 = (C60488rt) rsVar.instance;
                    rtVar4.f163703a = 8 | rtVar4.f163703a;
                    rtVar4.f163707e = j4;
                    long j5 = bundle.getLong("requestStart", -1);
                    rsVar.copyOnWrite();
                    C60488rt rtVar5 = (C60488rt) rsVar.instance;
                    rtVar5.f163703a |= 16;
                    rtVar5.f163708f = j5;
                    long j6 = bundle.getLong("responseStart", -1);
                    rsVar.copyOnWrite();
                    C60488rt rtVar6 = (C60488rt) rsVar.instance;
                    rtVar6.f163703a |= 32;
                    rtVar6.f163709g = j6;
                    long j7 = bundle.getLong("responseEnd", -1);
                    rsVar.copyOnWrite();
                    C60488rt rtVar7 = (C60488rt) rsVar.instance;
                    rtVar7.f163703a |= 64;
                    rtVar7.f163710h = j7;
                    roVar.copyOnWrite();
                    C60489ru ruVar3 = (C60489ru) roVar.instance;
                    C60488rt rtVar8 = (C60488rt) rsVar.build();
                    rtVar8.getClass();
                    ruVar3.f163718f = rtVar8;
                    ruVar3.f163713a |= 16;
                    C60485rq rqVar = (C60485rq) C60486rr.f163695e.createBuilder();
                    long j8 = bundle.getLong("effectiveConnectionType", -1);
                    rqVar.copyOnWrite();
                    C60486rr rrVar = (C60486rr) rqVar.instance;
                    rrVar.f163697a |= 1;
                    rrVar.f163698b = j8;
                    long j9 = bundle.getLong("httpRtt", -1);
                    rqVar.copyOnWrite();
                    C60486rr rrVar2 = (C60486rr) rqVar.instance;
                    rrVar2.f163697a |= 2;
                    rrVar2.f163699c = j9;
                    long j10 = bundle.getLong("transportRtt", -1);
                    rqVar.copyOnWrite();
                    C60486rr rrVar3 = (C60486rr) rqVar.instance;
                    rrVar3.f163697a |= 4;
                    rrVar3.f163700d = j10;
                    roVar.copyOnWrite();
                    C60489ru ruVar4 = (C60489ru) roVar.instance;
                    C60486rr rrVar4 = (C60486rr) rqVar.build();
                    rrVar4.getClass();
                    ruVar4.f163719g = rrVar4;
                    ruVar4.f163713a |= 32;
                    aVar.mo111346f((C60489ru) roVar.build());
                }
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } else if (c != null) {
                c.close();
                return;
            } else {
                return;
            }
        } catch (Throwable th) {
            C133722h.m216948a(th, th);
        }
        throw th;
    }

    /* renamed from: n */
    public final void mo25649n() {
        C47538ax c = this.f364231a.f364237f.mo51613c("onTopNavigationHidden");
        try {
            if (this.f364231a.f364241j) {
                this.f364231a.mo111363f(C133725k.f364225a);
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } else if (c != null) {
                c.close();
                return;
            } else {
                return;
            }
        } catch (Throwable th) {
            C133722h.m216948a(th, th);
        }
        throw th;
    }

    /* renamed from: o */
    public final void mo25650o() {
        C47538ax c = this.f364231a.f364237f.mo51613c("onTopNavigationShown");
        try {
            if (this.f364231a.f364241j) {
                this.f364231a.mo111363f(C133723i.f364224a);
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } else if (c != null) {
                c.close();
                return;
            } else {
                return;
            }
        } catch (Throwable th) {
            C133722h.m216948a(th, th);
        }
        throw th;
    }

    /* renamed from: p */
    public final void mo25651p(int i, Long l, Uri uri, Uri uri2) {
        C47538ax c = this.f364231a.f364237f.mo51613c("onNavigationEvent");
        try {
            if (this.f364231a.f364241j) {
                if (i == 1) {
                    if (this.f364231a.f364242k && uri2 == null) {
                        uri2 = this.f364231a.mo111358a();
                    }
                    this.f364231a.f364233b.mo25665d();
                    C133707a aVar = this.f364231a.f364236e;
                    C19559g.m37304c();
                    C58838bb.m90883r(aVar.f364191h);
                    if (!aVar.f364192i) {
                        if (!aVar.f364189f && !aVar.f364190g && aVar.f364188e) {
                            aVar.f364187d.mo115243f();
                        }
                        C60489ru i2 = aVar.mo111349i(1, l);
                        aVar.mo111346f(i2);
                        C60497sb sbVar = aVar.f364186c;
                        if ((((C60499sd) sbVar.instance).f163779a & 2) == 0) {
                            int i3 = i2.f163715c;
                            sbVar.copyOnWrite();
                            C60499sd sdVar = (C60499sd) sbVar.instance;
                            sdVar.f163779a |= 2;
                            sdVar.f163781c = i3;
                        }
                    }
                } else if (i == 3) {
                    C133707a aVar2 = this.f364231a.f364236e;
                    C19559g.m37304c();
                    C58838bb.m90883r(aVar2.f364191h);
                    if (!aVar2.f364192i) {
                        if (!aVar2.f364189f && !aVar2.f364190g) {
                            aVar2.f364190g = true;
                            if (aVar2.f364188e) {
                                aVar2.f364187d.mo115241d(aVar2.mo111344d());
                            }
                            aVar2.mo111345e(C89849ae.CCT_NAVIGATION_FAILED, l);
                        }
                        C60489ru i4 = aVar2.mo111349i(3, l);
                        aVar2.mo111346f(i4);
                        aVar2.mo111350j(3, i4.f163715c);
                    }
                } else if (i == 4) {
                    C133707a aVar3 = this.f364231a.f364236e;
                    C19559g.m37304c();
                    C58838bb.m90883r(aVar3.f364191h);
                    if (!aVar3.f364192i) {
                        if (!aVar3.f364189f && !aVar3.f364190g) {
                            aVar3.f364190g = true;
                            if (aVar3.f364188e) {
                                aVar3.f364187d.mo115240c(aVar3.mo111344d());
                            }
                            aVar3.mo111345e(C89849ae.CCT_NAVIGATION_ABORTED, l);
                        }
                        C60489ru i5 = aVar3.mo111349i(4, l);
                        aVar3.mo111346f(i5);
                        aVar3.mo111350j(5, i5.f163715c);
                    }
                } else if (i == 2) {
                    C133707a aVar4 = this.f364231a.f364236e;
                    C19559g.m37304c();
                    C58838bb.m90883r(aVar4.f364191h);
                    if (!aVar4.f364192i) {
                        aVar4.f364189f = true;
                        C60489ru i6 = aVar4.mo111349i(2, l);
                        aVar4.mo111346f(i6);
                        aVar4.mo111350j(2, i6.f163715c);
                    }
                } else if (i == 5) {
                    C133731q qVar = this.f364231a;
                    qVar.f364245n.f364256a.mo111375d(qVar, true);
                    C133707a aVar5 = this.f364231a.f364236e;
                    C19559g.m37304c();
                    C58838bb.m90883r(aVar5.f364191h);
                    if (!aVar5.f364192i) {
                        if (!aVar5.f364189f && !aVar5.f364190g) {
                            aVar5.f364185b.mo74236a(aVar5.mo111343c(C89849ae.CCT_TAB_SHOWN, l).mo83699a());
                        }
                        C60489ru i7 = aVar5.mo111349i(5, l);
                        aVar5.mo111346f(i7);
                        C60497sb sbVar2 = aVar5.f364186c;
                        if ((((C60499sd) sbVar2.instance).f163779a & 4) == 0) {
                            int i8 = i7.f163715c;
                            sbVar2.copyOnWrite();
                            C60499sd sdVar2 = (C60499sd) sbVar2.instance;
                            sdVar2.f163779a |= 4;
                            sdVar2.f163782d = i8;
                        }
                    }
                } else if (i == 6) {
                    C133731q qVar2 = this.f364231a;
                    qVar2.f364245n.f364256a.mo111375d(qVar2, false);
                    C133707a aVar6 = this.f364231a.f364236e;
                    C19559g.m37304c();
                    C58838bb.m90883r(aVar6.f364191h);
                    if (!aVar6.f364192i) {
                        if (!aVar6.f364189f && !aVar6.f364190g && aVar6.f364188e) {
                            C139787a aVar7 = aVar6.f364187d;
                            C139789b d = aVar6.mo111344d();
                            C69664n.m101061g(d, "loggingData");
                            C37215b bVar = aVar7.f379927a;
                            C37252a c2 = C37182a.f98211iS.mo40805c(C62722b.UNKNOWN);
                            C139787a.m227254h(c2, d);
                            bVar.mo19974a(c2);
                            aVar6.f364190g = true;
                        }
                        C60489ru i9 = aVar6.mo111349i(6, l);
                        aVar6.mo111346f(i9);
                        aVar6.mo111350j(4, i9.f163715c);
                        C60497sb sbVar3 = aVar6.f364186c;
                        int i10 = ((C60499sd) sbVar3.instance).f163779a;
                        if ((i10 & 64) == 0) {
                            if ((i10 & 32) != 0) {
                                int i11 = i9.f163715c;
                                sbVar3.copyOnWrite();
                                C60499sd sdVar3 = (C60499sd) sbVar3.instance;
                                sdVar3.f163779a |= 64;
                                sdVar3.f163786h = i11;
                                aVar6.mo111347g(C59743a.USER_EVENT_CUSTOM_TABS_TAB_HIDDEN);
                            }
                        }
                    }
                    i = 6;
                }
                this.f364231a.mo111363f(new C133726l(i));
                this.f364231a.mo111364g(new C133727m(i, uri, uri2), C133709aa.class);
                if (this.f364231a.f364242k && i == 2) {
                    this.f364231a.f364242k = false;
                }
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } else if (c != null) {
                c.close();
                return;
            } else {
                return;
            }
        } catch (Throwable th) {
            C133722h.m216948a(th, th);
        }
        throw th;
    }

    /* renamed from: q */
    public final void mo25652q(C20642af afVar) {
        C47538ax c = this.f364231a.f364237f.mo51613c("onNavigationInfoReady");
        try {
            if (this.f364231a.f364241j) {
                this.f364231a.mo111364g(new C133729o(afVar), C133709aa.class);
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } else if (c != null) {
                c.close();
                return;
            } else {
                return;
            }
        } catch (Throwable th) {
            C133722h.m216948a(th, th);
        }
        throw th;
    }

    /* renamed from: r */
    public final void mo25653r() {
        C47538ax c = this.f364231a.f364237f.mo51613c("onGreatestScrollPercentageIncreased");
        try {
            if (this.f364231a.f364241j) {
                this.f364231a.mo111363f(new C133724j());
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } else if (c != null) {
                c.close();
                return;
            } else {
                return;
            }
        } catch (Throwable th) {
            C133722h.m216948a(th, th);
        }
        throw th;
    }

    /* renamed from: s */
    public final void mo25654s() {
        C47538ax c = this.f364231a.f364237f.mo51613c("onVerticalScrollEvent");
        try {
            if (this.f364231a.f364241j) {
                this.f364231a.mo111363f(new C133728n());
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } else if (c != null) {
                c.close();
                return;
            } else {
                return;
            }
        } catch (Throwable th) {
            C133722h.m216948a(th, th);
        }
        throw th;
    }
}
