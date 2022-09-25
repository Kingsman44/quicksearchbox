package com.google.android.apps.gsa.staticplugins.customtabs.p7709b;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.search.core.state.p6864a.C86789d;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98572h;
import com.google.android.libraries.p1703d.C20660p;
import com.google.common.p4552o.C60483ro;
import com.google.common.p4552o.C60485rq;
import com.google.common.p4552o.C60486rr;
import com.google.common.p4552o.C60487rs;
import com.google.common.p4552o.C60488rt;
import com.google.common.p4552o.C60489ru;
import com.google.common.p4552o.C60497sb;
import com.google.common.p4552o.C60499sd;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.b.x */
/* compiled from: PG */
final class C98641x extends C20660p {

    /* renamed from: a */
    final /* synthetic */ C98642y f275493a;

    public C98641x(C98642y yVar) {
        this.f275493a = yVar;
    }

    /* renamed from: t */
    private final void m163400t(C98635r rVar) {
        this.f275493a.f275501f.mo28212l("Set navigation info", new C98640w((C86789d) this.f275493a.f275502g.mo27525b(), rVar));
    }

    /* renamed from: g */
    public final void mo25642g() {
        this.f275493a.f275508m = true;
        if (this.f275493a.f275498c.mo79746e(C90110fh.f250592Q) && this.f275493a.f275506k.f57938a.mo25588l()) {
            C98642y yVar = this.f275493a;
            yVar.f275509n = yVar.f275503h.mo91204c(yVar.f275506k);
        }
    }

    /* renamed from: h */
    public final void mo25643h(long j, Long l) {
        C98596aa aaVar = this.f275493a.f275511p;
        if (aaVar != null) {
            if (!aaVar.f275375d) {
                aaVar.f275375d = true;
                aaVar.mo91208c(C89849ae.CCT_FIRST_CONTENTFUL_PAINT, l);
            }
            C60483ro roVar = (C60483ro) C60489ru.f163711h.createBuilder();
            int a = aaVar.mo91206a();
            roVar.copyOnWrite();
            C60489ru ruVar = (C60489ru) roVar.instance;
            ruVar.f163713a |= 2;
            ruVar.f163715c = a;
            int i = (int) j;
            roVar.copyOnWrite();
            C60489ru ruVar2 = (C60489ru) roVar.instance;
            ruVar2.f163713a |= 8;
            ruVar2.f163717e = i;
            if (l != null) {
                long longValue = l.longValue();
                long j2 = aaVar.f275373b;
                roVar.copyOnWrite();
                C60489ru ruVar3 = (C60489ru) roVar.instance;
                ruVar3.f163713a |= 4;
                ruVar3.f163716d = (int) (longValue - j2);
            }
            aaVar.mo91210e(roVar, 7);
            C60497sb sbVar = aaVar.f275374c;
            C60499sd sdVar = (C60499sd) sbVar.instance;
            int i2 = sdVar.f163779a;
            if ((i2 & 8) == 0 && (i2 & 2) != 0) {
                int i3 = sdVar.f163781c;
                sbVar.copyOnWrite();
                C60499sd sdVar2 = (C60499sd) sbVar.instance;
                sdVar2.f163779a |= 8;
                sdVar2.f163783e = i3 + i;
            }
        }
        this.f275493a.mo91245c();
    }

    /* renamed from: i */
    public final void mo25644i(Bundle bundle) {
        int i = bundle.getInt("freResult");
        boolean z = i > 0;
        C98572h a = this.f275493a.f275499d.mo91191a();
        if (a == null || z != a.f57882c.mo25583f()) {
            C98642y yVar = this.f275493a;
            yVar.f275499d.mo91192b(yVar.f275506k.f57938a);
        }
        if (i == 0) {
            C89949q.m146523g(848);
        } else if (i == 1) {
            C89949q.m146523g(847);
        } else if (i == 2) {
            C89949q.m146523g(846);
        }
    }

    /* renamed from: j */
    public final void mo25645j(long j, Long l) {
        C98596aa aaVar = this.f275493a.f275511p;
        if (aaVar != null) {
            C60483ro roVar = (C60483ro) C60489ru.f163711h.createBuilder();
            int a = aaVar.mo91206a();
            roVar.copyOnWrite();
            C60489ru ruVar = (C60489ru) roVar.instance;
            ruVar.f163713a |= 2;
            ruVar.f163715c = a;
            roVar.copyOnWrite();
            C60489ru ruVar2 = (C60489ru) roVar.instance;
            ruVar2.f163713a |= 8;
            ruVar2.f163717e = (int) j;
            if (l != null) {
                long longValue = l.longValue();
                long j2 = aaVar.f275373b;
                roVar.copyOnWrite();
                C60489ru ruVar3 = (C60489ru) roVar.instance;
                ruVar3.f163713a |= 4;
                ruVar3.f163716d = (int) (longValue - j2);
            }
            aaVar.mo91210e(roVar, 8);
        }
    }

    /* renamed from: k */
    public final void mo25646k(int i, Long l, Uri uri) {
        int i2 = i;
        Long l2 = l;
        Uri uri2 = uri;
        C98596aa aaVar = this.f275493a.f275511p;
        if (aaVar != null) {
            int a = aaVar.mo91206a();
            C60483ro roVar = (C60483ro) C60489ru.f163711h.createBuilder();
            roVar.copyOnWrite();
            C60489ru ruVar = (C60489ru) roVar.instance;
            ruVar.f163713a |= 2;
            ruVar.f163715c = a;
            if (l2 != null) {
                long longValue = l.longValue();
                long j = aaVar.f275373b;
                roVar.copyOnWrite();
                C60489ru ruVar2 = (C60489ru) roVar.instance;
                ruVar2.f163713a |= 4;
                ruVar2.f163716d = (int) (longValue - j);
            }
            switch (i2) {
                case 1:
                    aaVar.mo91210e(roVar, 1);
                    C60497sb sbVar = aaVar.f275374c;
                    if ((((C60499sd) sbVar.instance).f163779a & 2) == 0) {
                        sbVar.copyOnWrite();
                        C60499sd sdVar = (C60499sd) sbVar.instance;
                        sdVar.f163779a = 2 | sdVar.f163779a;
                        sdVar.f163781c = a;
                        break;
                    }
                    break;
                case 2:
                    aaVar.f275376e = true;
                    aaVar.mo91210e(roVar, 2);
                    aaVar.mo91211f(2, a);
                    break;
                case 3:
                    if (!aaVar.f275375d && !aaVar.f275376e) {
                        aaVar.f275375d = true;
                        aaVar.mo91208c(C89849ae.CCT_NAVIGATION_FAILED, l2);
                    }
                    aaVar.mo91210e(roVar, 3);
                    aaVar.mo91211f(3, a);
                    break;
                case 4:
                    if (!aaVar.f275375d && !aaVar.f275376e) {
                        aaVar.f275375d = true;
                        aaVar.mo91208c(C89849ae.CCT_NAVIGATION_ABORTED, l2);
                    }
                    aaVar.mo91210e(roVar, 4);
                    aaVar.mo91211f(5, a);
                    break;
                case 5:
                    if (!aaVar.f275375d && !aaVar.f275376e) {
                        ((C89859i) aaVar.f275372a.mo27525b()).mo74236a(aaVar.mo91207b(C89849ae.CCT_TAB_SHOWN, l2).mo83699a());
                    }
                    aaVar.mo91210e(roVar, 5);
                    C60497sb sbVar2 = aaVar.f275374c;
                    if ((((C60499sd) sbVar2.instance).f163779a & 4) == 0) {
                        sbVar2.copyOnWrite();
                        C60499sd sdVar2 = (C60499sd) sbVar2.instance;
                        sdVar2.f163779a |= 4;
                        sdVar2.f163782d = a;
                        break;
                    }
                    break;
                case 6:
                    aaVar.mo91210e(roVar, 6);
                    aaVar.mo91211f(4, a);
                    C60497sb sbVar3 = aaVar.f275374c;
                    int i3 = ((C60499sd) sbVar3.instance).f163779a;
                    if ((i3 & 64) == 0 && (i3 & 32) != 0) {
                        sbVar3.copyOnWrite();
                        C60499sd sdVar3 = (C60499sd) sbVar3.instance;
                        sdVar3.f163779a |= 64;
                        sdVar3.f163786h = a;
                        aaVar.mo91209d(879);
                        break;
                    }
            }
        }
        if (i2 == 1) {
            C98610ao aoVar = this.f275493a.f275512q;
            if (aoVar != null) {
                if (uri2 != null || !this.f275493a.f275516u) {
                    aoVar.mo91219b(uri2);
                } else {
                    aoVar.mo91219b(this.f275493a.f275513r);
                }
            }
            if (uri2 != null) {
                this.f275493a.mo91244b(uri2);
            }
            this.f275493a.f275516u = false;
            this.f275493a.mo91245c();
            this.f275493a.f275506k.mo25665d();
            m163400t((C98635r) null);
        } else if (i2 == 5) {
            C98642y yVar = this.f275493a;
            yVar.f275517v.f275455a.f275478i = yVar;
            this.f275493a.mo91245c();
        }
    }

    /* renamed from: l */
    public final void mo25647l(Bundle bundle) {
        C98635r rVar = new C98635r(bundle);
        if (this.f275493a.f275510o) {
            m163400t(rVar);
        }
        this.f275493a.mo91244b(rVar.mo91237b());
        this.f275493a.mo91245c();
    }

    /* renamed from: m */
    public final void mo25648m(Bundle bundle) {
        C98596aa aaVar = this.f275493a.f275511p;
        if (aaVar != null) {
            C60483ro roVar = (C60483ro) C60489ru.f163711h.createBuilder();
            int a = aaVar.mo91206a();
            roVar.copyOnWrite();
            C60489ru ruVar = (C60489ru) roVar.instance;
            ruVar.f163713a |= 2;
            ruVar.f163715c = a;
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
            rtVar4.f163703a |= 8;
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
            C60489ru ruVar2 = (C60489ru) roVar.instance;
            C60488rt rtVar8 = (C60488rt) rsVar.build();
            rtVar8.getClass();
            ruVar2.f163718f = rtVar8;
            ruVar2.f163713a |= 16;
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
            C60489ru ruVar3 = (C60489ru) roVar.instance;
            C60486rr rrVar4 = (C60486rr) rqVar.build();
            rrVar4.getClass();
            ruVar3.f163719g = rrVar4;
            ruVar3.f163713a |= 32;
            aaVar.mo91210e(roVar, 9);
        }
    }

    /* renamed from: n */
    public final void mo25649n() {
        C98610ao aoVar = this.f275493a.f275512q;
        if (aoVar != null) {
            aoVar.f275416o = false;
            Runnable runnable = aoVar.f275413l;
            if (runnable != null) {
                runnable.run();
                aoVar.f275413l = null;
            }
        }
    }

    /* renamed from: o */
    public final void mo25650o() {
        C98610ao aoVar = this.f275493a.f275512q;
        if (aoVar != null) {
            aoVar.f275416o = true;
            Runnable runnable = aoVar.f275414m;
            if (runnable != null) {
                runnable.run();
                aoVar.f275414m = null;
            }
        }
    }
}
