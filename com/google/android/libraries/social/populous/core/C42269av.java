package com.google.android.libraries.social.populous.core;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.p4017at.p4078i.p4079a.p4080a.C54287d;
import com.google.p4420by.p4425c.p4428b.p4429a.p4430a.p4431a.C57877c;

/* renamed from: com.google.android.libraries.social.populous.core.av */
/* compiled from: PG */
public final class C42269av {

    /* renamed from: A */
    private C58528ij f110853A;

    /* renamed from: B */
    private Boolean f110854B;

    /* renamed from: C */
    private C42276bb f110855C;

    /* renamed from: D */
    private Boolean f110856D;

    /* renamed from: E */
    private Boolean f110857E;

    /* renamed from: F */
    private Boolean f110858F;

    /* renamed from: G */
    private SessionContextRuleSet f110859G;

    /* renamed from: H */
    private Experiments f110860H;

    /* renamed from: I */
    private C58528ij f110861I;

    /* renamed from: J */
    private Boolean f110862J;

    /* renamed from: K */
    private boolean f110863K = false;

    /* renamed from: L */
    private C58528ij f110864L;

    /* renamed from: M */
    private boolean f110865M = false;

    /* renamed from: N */
    private boolean f110866N;

    /* renamed from: O */
    private boolean f110867O = false;

    /* renamed from: P */
    private int f110868P;

    /* renamed from: a */
    public ClientId f110869a;

    /* renamed from: b */
    public C57877c f110870b;

    /* renamed from: c */
    public C58528ij f110871c;

    /* renamed from: d */
    public Long f110872d;

    /* renamed from: e */
    public Long f110873e;

    /* renamed from: f */
    public SocialAffinityAllEventSource f110874f;

    /* renamed from: g */
    public Boolean f110875g;

    /* renamed from: h */
    public Boolean f110876h;

    /* renamed from: i */
    public Boolean f110877i;

    /* renamed from: j */
    public C42275ba f110878j;

    /* renamed from: k */
    public int f110879k;

    /* renamed from: l */
    public int f110880l;

    /* renamed from: m */
    public int f110881m;

    /* renamed from: n */
    public int f110882n;

    /* renamed from: o */
    public int f110883o;

    /* renamed from: p */
    private Boolean f110884p;

    /* renamed from: q */
    private Integer f110885q;

    /* renamed from: r */
    private C58833ax f110886r = C58836b.f156633a;

    /* renamed from: s */
    private Boolean f110887s;

    /* renamed from: t */
    private Boolean f110888t;

    /* renamed from: u */
    private Boolean f110889u;

    /* renamed from: v */
    private Boolean f110890v;

    /* renamed from: w */
    private C58528ij f110891w;

    /* renamed from: x */
    private Boolean f110892x;

    /* renamed from: y */
    private String f110893y;

    /* renamed from: z */
    private String f110894z;

    public C42269av() {
    }

    public C42269av(ClientConfigInternal clientConfigInternal) {
        this.f110884p = Boolean.valueOf(clientConfigInternal.f110719e);
        this.f110869a = clientConfigInternal.f110720f;
        this.f110885q = Integer.valueOf(clientConfigInternal.f110721g);
        this.f110879k = clientConfigInternal.f110713O;
        this.f110870b = clientConfigInternal.f110722h;
        this.f110886r = clientConfigInternal.f110723i;
        this.f110868P = clientConfigInternal.f110714P;
        this.f110887s = Boolean.valueOf(clientConfigInternal.f110724j);
        this.f110871c = clientConfigInternal.f110725k;
        this.f110888t = Boolean.valueOf(clientConfigInternal.f110726l);
        this.f110889u = Boolean.valueOf(clientConfigInternal.f110727m);
        this.f110872d = Long.valueOf(clientConfigInternal.f110728n);
        this.f110873e = Long.valueOf(clientConfigInternal.f110729o);
        this.f110890v = Boolean.valueOf(clientConfigInternal.f110730p);
        this.f110891w = clientConfigInternal.f110731q;
        this.f110892x = Boolean.valueOf(clientConfigInternal.f110732r);
        this.f110880l = clientConfigInternal.f110715Q;
        this.f110874f = clientConfigInternal.f110733s;
        this.f110893y = clientConfigInternal.f110734t;
        this.f110894z = clientConfigInternal.f110735u;
        this.f110853A = clientConfigInternal.f110736v;
        this.f110854B = Boolean.valueOf(clientConfigInternal.f110737w);
        this.f110875g = Boolean.valueOf(clientConfigInternal.f110738x);
        this.f110855C = clientConfigInternal.f110739y;
        this.f110876h = Boolean.valueOf(clientConfigInternal.f110740z);
        this.f110881m = clientConfigInternal.f110716R;
        this.f110882n = clientConfigInternal.f110717S;
        this.f110877i = Boolean.valueOf(clientConfigInternal.f110699A);
        this.f110878j = clientConfigInternal.f110700B;
        this.f110856D = Boolean.valueOf(clientConfigInternal.f110701C);
        this.f110857E = Boolean.valueOf(clientConfigInternal.f110702D);
        this.f110858F = Boolean.valueOf(clientConfigInternal.f110703E);
        this.f110859G = clientConfigInternal.f110704F;
        this.f110860H = clientConfigInternal.f110705G;
        this.f110861I = clientConfigInternal.f110706H;
        this.f110862J = Boolean.valueOf(clientConfigInternal.f110707I);
        this.f110883o = clientConfigInternal.f110718T;
        this.f110863K = clientConfigInternal.f110708J;
        this.f110864L = clientConfigInternal.f110709K;
        this.f110865M = clientConfigInternal.f110710L;
        this.f110866N = clientConfigInternal.f110711M;
        this.f110867O = clientConfigInternal.f110712N;
    }

    /* renamed from: a */
    public final ClientConfigInternal mo45225a() {
        String str = this.f110884p == null ? " shouldFormatPhoneNumbers" : BuildConfig.FLAVOR;
        if (this.f110869a == null) {
            str = str.concat(" clientId");
        }
        if (this.f110885q == null) {
            str = str.concat(" maxAutocompletions");
        }
        if (this.f110879k == 0) {
            str = str.concat(" peopleApiAutocompleteClientId");
        }
        if (this.f110870b == null) {
            str = str.concat(" affinityType");
        }
        if (this.f110868P == 0) {
            str = str.concat(" peopleApiAppType");
        }
        if (this.f110887s == null) {
            str = str.concat(" shouldFilterIantsByAppType");
        }
        if (this.f110871c == null) {
            str = str.concat(" autocompletionCategories");
        }
        if (this.f110888t == null) {
            str = str.concat(" returnContactsWithProfileIdOnly");
        }
        if (this.f110889u == null) {
            str = str.concat(" shouldCreateSeparateInAppNotificationTargetResults");
        }
        if (this.f110872d == null) {
            str = str.concat(" cacheRefreshWindowMs");
        }
        if (this.f110873e == null) {
            str = str.concat(" cacheInvalidateTimeMs");
        }
        if (this.f110890v == null) {
            str = str.concat(" needWarmUpStarlightCache");
        }
        if (this.f110891w == null) {
            str = str.concat(" peopleRequestsExtensions");
        }
        if (this.f110892x == null) {
            str = str.concat(" requestPeopleSMimeInfo");
        }
        if (this.f110880l == 0) {
            str = str.concat(" socialAffinityApplication");
        }
        if (this.f110874f == null) {
            str = str.concat(" socialAffinityAllEventSource");
        }
        if (this.f110893y == null) {
            str = str.concat(" clearcutLogSource");
        }
        if (this.f110894z == null) {
            str = str.concat(" metricClearcutLogSource");
        }
        if (this.f110853A == null) {
            str = str.concat(" additionalPhenotypeLogSources");
        }
        if (this.f110854B == null) {
            str = str.concat(" returnServerContactsOnly");
        }
        if (this.f110875g == null) {
            str = str.concat(" useLiveAutocomplete");
        }
        if (this.f110855C == null) {
            str = str.concat(" minimumTopNCacheCallbackStatus");
        }
        if (this.f110876h == null) {
            str = str.concat(" shouldMixServerAndDeviceContacts");
        }
        if (this.f110881m == 0) {
            str = str.concat(" emptyQueryResultGroupingOption");
        }
        if (this.f110882n == 0) {
            str = str.concat(" nonEmptyQueryResultGroupingOption");
        }
        if (this.f110877i == null) {
            str = str.concat(" shouldLogActionAfterAutocompleteSessionClosedException");
        }
        if (this.f110878j == null) {
            str = str.concat(" metadataFieldOrderingConvention");
        }
        if (this.f110856D == null) {
            str = str.concat(" shouldFilterOwnerFields");
        }
        if (this.f110857E == null) {
            str = str.concat(" requireExactMatch");
        }
        if (this.f110858F == null) {
            str = str.concat(" livePeopleApiLoaderEnabled");
        }
        if (this.f110859G == null) {
            str = str.concat(" sessionContextRuleSet");
        }
        if (this.f110860H == null) {
            str = str.concat(" internalBuilderExperiments");
        }
        if (this.f110861I == null) {
            str = str.concat(" requestMaskIncludeContainers");
        }
        if (this.f110862J == null) {
            str = str.concat(" shouldEnablePrivateNames");
        }
        if (this.f110883o == 0) {
            str = str.concat(" cacheKey");
        }
        if (this.f110864L == null) {
            str = str.concat(" includedProfileStates");
        }
        if (str.isEmpty()) {
            return new ClientConfigInternal(this.f110884p.booleanValue(), this.f110869a, this.f110885q.intValue(), this.f110879k, this.f110870b, this.f110886r, this.f110868P, this.f110887s.booleanValue(), this.f110871c, this.f110888t.booleanValue(), this.f110889u.booleanValue(), this.f110872d.longValue(), this.f110873e.longValue(), this.f110890v.booleanValue(), this.f110891w, this.f110892x.booleanValue(), this.f110880l, this.f110874f, this.f110893y, this.f110894z, this.f110853A, this.f110854B.booleanValue(), this.f110875g.booleanValue(), this.f110855C, this.f110876h.booleanValue(), this.f110881m, this.f110882n, this.f110877i.booleanValue(), this.f110878j, this.f110856D.booleanValue(), this.f110857E.booleanValue(), this.f110858F.booleanValue(), this.f110859G, this.f110860H, this.f110861I, this.f110862J.booleanValue(), this.f110883o, this.f110863K, this.f110864L, this.f110865M, this.f110866N, this.f110867O);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C58833ax mo45226b() {
        Experiments experiments = this.f110860H;
        return experiments == null ? C58836b.f156633a : C58833ax.m90834k(experiments);
    }

    /* renamed from: c */
    public final void mo45227c(Experiments experiments) {
        C42294bt btVar;
        if (!mo45226b().mo56113h()) {
            btVar = new C42294bt();
        } else {
            C42294bt btVar2 = new C42294bt();
            btVar2.mo45253a((Experiments) mo45226b().mo56107c());
            btVar = btVar2;
        }
        btVar.mo45253a(experiments);
        this.f110860H = new Experiments(btVar);
    }

    /* renamed from: d */
    public final void mo45228d() {
        this.f110854B = false;
    }

    /* renamed from: e */
    public final void mo45229e() {
        this.f110885q = 15;
        C58528ij M = C58528ij.m90013M(C42262ao.EMAIL, C42262ao.PHONE_NUMBER, C42262ao.PROFILE_ID, C42262ao.IN_APP_NOTIFICATION_TARGET);
        M.getClass();
        this.f110871c = M;
        this.f110868P = 1;
        this.f110887s = true;
        this.f110873e = Long.valueOf(ClientConfigInternal.f110697c);
        this.f110872d = Long.valueOf(ClientConfigInternal.f110696b);
        this.f110881m = 3;
        this.f110858F = true;
        C42275ba baVar = C42275ba.CONTACT_PREFERRED;
        baVar.getClass();
        this.f110878j = baVar;
        this.f110890v = true;
        this.f110882n = 2;
        C58733pz pzVar = C58733pz.f156496a;
        pzVar.getClass();
        this.f110891w = pzVar;
        C58528ij O = C58528ij.m90015O(C54287d.CONTACT, C54287d.PROFILE, C54287d.DOMAIN_CONTACT, C54287d.DOMAIN_PROFILE, C54287d.GOOGLE_GROUP, C54287d.AFFINITY, new C54287d[0]);
        O.getClass();
        this.f110861I = O;
        this.f110892x = false;
        this.f110857E = false;
        this.f110888t = false;
        mo45228d();
        this.f110889u = true;
        this.f110877i = false;
        this.f110876h = true;
        this.f110856D = false;
        this.f110884p = true;
        this.f110874f = C42337di.m74561a(1, 1, 1, 1, 1, 1);
        this.f110893y = "SOCIAL_AFFINITY";
        this.f110894z = "PEOPLE_AUTOCOMPLETE";
        C58733pz pzVar2 = C58733pz.f156496a;
        pzVar2.getClass();
        this.f110853A = C58528ij.m90006F(pzVar2);
        this.f110875g = true;
        C42276bb bbVar = C42276bb.PARTIAL;
        bbVar.getClass();
        this.f110855C = bbVar;
        this.f110859G = SessionContextRuleSet.f110817a;
        this.f110879k = 89;
        this.f110862J = false;
        this.f110863K = false;
        C58733pz pzVar3 = C58733pz.f156496a;
        pzVar3.getClass();
        this.f110864L = pzVar3;
        this.f110865M = false;
        this.f110866N = false;
        this.f110867O = false;
        C42294bt btVar = new C42294bt();
        btVar.mo45254b(C42295bu.f110921b);
        btVar.mo45254b(C42295bu.f110922c);
        mo45227c(new Experiments(btVar));
    }
}
