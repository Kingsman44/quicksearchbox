package com.google.android.libraries.social.populous;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.social.p3269d.p3270a.C41924aa;
import com.google.android.libraries.social.p3269d.p3270a.C41932g;
import com.google.android.libraries.social.populous.android.C42169h;
import com.google.android.libraries.social.populous.core.C42279be;
import com.google.android.libraries.social.populous.core.C42282bh;
import com.google.android.libraries.social.populous.core.C42304cc;
import com.google.android.libraries.social.populous.core.C42313cl;
import com.google.android.libraries.social.populous.core.C42331dc;
import com.google.android.libraries.social.populous.core.C42334df;
import com.google.android.libraries.social.populous.core.C42355p;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.Loggable;
import com.google.android.libraries.social.populous.core.PersonExtendedData;
import com.google.android.libraries.social.populous.core.SessionContext;
import com.google.android.libraries.social.populous.logging.C42562a;
import com.google.android.libraries.social.populous.logging.C42567b;
import com.google.android.libraries.social.populous.logging.C42569d;
import com.google.android.libraries.social.populous.logging.C42575j;
import com.google.android.libraries.social.populous.logging.C42576k;
import com.google.android.libraries.social.populous.logging.C42579n;
import com.google.android.libraries.social.populous.logging.C42580o;
import com.google.android.libraries.social.populous.logging.C42581p;
import com.google.android.libraries.social.populous.logging.C42583r;
import com.google.android.libraries.social.populous.logging.C42584s;
import com.google.android.libraries.social.populous.logging.C42586u;
import com.google.android.libraries.social.populous.logging.C42587v;
import com.google.android.libraries.social.populous.logging.C42588w;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.android.libraries.social.populous.logging.LogEntity;
import com.google.android.libraries.social.populous.logging.LogEvent;
import com.google.android.libraries.social.populous.p3296e.C42500d;
import com.google.android.libraries.social.populous.p3296e.C42549n;
import com.google.android.libraries.social.populous.p3296e.C42551p;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42439r;
import com.google.android.libraries.social.populous.storage.C42680d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.base.C58838bb;
import com.google.common.base.C58872ci;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4575r.C60757n;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4181bi.C55815ay;
import com.google.p4181bi.C55817b;
import com.google.p4181bi.C55847i;
import com.google.p4420by.p4425c.p4428b.p4429a.p4430a.C57883f;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62972cr;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69282ab;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69288ah;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69296d;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69308p;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69314v;
import p5602o.p5607c.C71924aa;
import p5602o.p5607c.C71942m;

/* compiled from: PG */
public abstract class AutocompleteSession implements AutocompleteSessionBase {

    /* renamed from: a */
    public final ClientConfigInternal f110340a;

    /* renamed from: b */
    public C42588w f110341b;

    /* renamed from: c */
    public C42591z f110342c;

    /* renamed from: d */
    public C60870cx f110343d;

    /* renamed from: e */
    public C42355p f110344e;

    /* renamed from: f */
    public C42151ae f110345f;

    /* renamed from: g */
    protected final C42586u f110346g;

    /* renamed from: h */
    public C42586u f110347h;

    /* renamed from: i */
    public final HashMap f110348i = new HashMap();

    /* renamed from: j */
    public final List f110349j;

    /* renamed from: k */
    protected C42549n f110350k;

    /* renamed from: l */
    public final C42334df f110351l;

    /* renamed from: m */
    public Long f110352m;

    /* renamed from: n */
    public long f110353n;

    /* renamed from: o */
    public long f110354o;

    /* renamed from: p */
    public long f110355p;

    /* renamed from: q */
    public boolean f110356q;

    /* renamed from: r */
    public boolean f110357r;

    /* renamed from: s */
    public Integer f110358s = null;

    /* renamed from: t */
    public C58881cr f110359t;

    /* renamed from: u */
    private final C42206bk f110360u;

    /* renamed from: v */
    private final C42279be f110361v;

    /* renamed from: w */
    private final Executor f110362w;

    protected AutocompleteSession(ClientConfigInternal clientConfigInternal, C42206bk bkVar, Executor executor, SessionContext sessionContext, C42586u uVar) {
        long j;
        Long l;
        this.f110340a = clientConfigInternal;
        this.f110360u = bkVar;
        this.f110349j = mo44816e();
        this.f110341b = null;
        this.f110342c = null;
        this.f110356q = false;
        this.f110362w = executor;
        this.f110359t = null;
        this.f110361v = new C42711y(this);
        this.f110346g = uVar;
        this.f110358s = uVar.f111755a;
        this.f110345f = null;
        if (sessionContext == null || (l = sessionContext.f110816j) == null) {
            j = ((C42205bj) bkVar).f110525a.nextLong();
        } else {
            j = l.longValue();
        }
        this.f110353n = j;
        this.f110354o = ((C42205bj) bkVar).f110526b.getAndIncrement();
        C42334df dfVar = new C42334df();
        this.f110351l = dfVar;
        if (sessionContext != null) {
            C58485gu guVar = sessionContext.f110810d;
            dfVar.f111033d.clear();
            dfVar.f111033d.addAll(guVar);
            C58485gu guVar2 = sessionContext.f110807a;
            dfVar.f111030a.clear();
            dfVar.f111030a.addAll(guVar2);
            C58485gu guVar3 = sessionContext.f110808b;
            dfVar.f111031b.clear();
            dfVar.f111031b.addAll(guVar3);
            C58485gu guVar4 = sessionContext.f110809c;
            dfVar.f111032c.clear();
            dfVar.f111032c.addAll(guVar4);
            dfVar.f111036g = sessionContext.f110811e;
            dfVar.f111037h = sessionContext.f110812f;
            dfVar.f111039j = sessionContext.f110813g;
            dfVar.f111038i = sessionContext.f110816j;
            C58485gu guVar5 = sessionContext.f110814h;
            dfVar.f111034e.clear();
            dfVar.f111034e.addAll(guVar5);
            C58485gu guVar6 = sessionContext.f110815i;
            dfVar.f111035f.clear();
            dfVar.f111035f.addAll(guVar6);
        }
        mo44826o((String) null, 0);
    }

    /* renamed from: a */
    static C58528ij m73984a(Loggable loggable) {
        if (loggable instanceof ContactMethodField) {
            return C58758qx.m90644b(((ContactMethodField) loggable).mo44976b().f110792i);
        }
        if (loggable instanceof Group) {
            return ((Group) loggable).mo44780a().mo44931d();
        }
        return C58733pz.f156496a;
    }

    /* renamed from: d */
    static String m73985d(Object obj) {
        if (obj instanceof ContactMethodField) {
            return ((ContactMethodField) obj).mo45119n();
        }
        if (obj instanceof Group) {
            return ((Group) obj).mo44784e();
        }
        return null;
    }

    /* renamed from: q */
    private final C42584s m73986q(Group group) {
        LogEntity logEntity;
        C42584s sVar;
        if (C42331dc.m74557b(m73984a(group))) {
            logEntity = m73988s(group);
        } else {
            logEntity = (LogEntity) this.f110346g.get(group.mo44784e());
        }
        if (logEntity != null) {
            sVar = logEntity.mo45570d();
        } else {
            sVar = LogEntity.m75050A(group.mo44780a(), group.mo44829f());
        }
        sVar.mo45628p(group.mo44780a().f110775g);
        return sVar;
    }

    /* renamed from: r */
    private final C42584s m73987r(ContactMethodField contactMethodField) {
        LogEntity logEntity;
        C42584s sVar;
        if (C42331dc.m74557b(m73984a(contactMethodField))) {
            logEntity = m73988s(contactMethodField);
        } else {
            logEntity = (LogEntity) this.f110346g.get(contactMethodField.mo45119n());
        }
        if (logEntity != null) {
            sVar = logEntity.mo45570d();
        } else {
            sVar = LogEntity.m75053z(contactMethodField, C58837ba.m90858g((String) this.f110348i.get(contactMethodField.mo45119n())), false);
        }
        sVar.mo45620h(contactMethodField.mo44976b().f110787d);
        sVar.mo45628p(contactMethodField.mo44976b().f110786c);
        return sVar;
    }

    /* renamed from: s */
    private final LogEntity m73988s(Loggable loggable) {
        C42586u uVar = this.f110347h;
        if (uVar != null) {
            return (LogEntity) uVar.get(m73985d(loggable));
        }
        return null;
    }

    /* renamed from: t */
    private final C58833ax m73989t() {
        C42355p pVar;
        if (C69308p.m100586e() && (pVar = this.f110344e) != null) {
            C58833ax a = pVar.mo45322a();
            if (a.mo56113h()) {
                return (C58833ax) a.mo56107c();
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: u */
    private final void m73990u(LogEntity logEntity, C42576k kVar) {
        if (logEntity.mo45586r()) {
            this.f110342c.mo45635e(20, kVar);
        } else if (logEntity.mo45587s()) {
            this.f110342c.mo45635e(19, kVar);
        }
    }

    /* renamed from: v */
    private final void m73991v(String str, Object obj) {
        if (!this.f110356q) {
            return;
        }
        if (!this.f110340a.f110699A) {
            throw new C42557h(str);
        } else if (C69314v.f185468a.mo6453a().mo61002a()) {
            Long l = null;
            if (obj instanceof ContactMethodField) {
                ContactMethodField contactMethodField = (ContactMethodField) obj;
                if (contactMethodField.mo44976b() != null) {
                    l = contactMethodField.mo44976b().f110802s;
                }
            } else if (obj instanceof Group) {
                Group group = (Group) obj;
                if (group.mo44780a() != null) {
                    l = Long.valueOf(group.mo44780a().mo44928a());
                }
            }
            C42591z zVar = this.f110342c;
            C42575j jVar = new C42575j();
            jVar.f111733d = mo44815c();
            jVar.f111730a = l;
            jVar.f111731b = Long.valueOf(this.f110354o);
            jVar.f111732c = Long.valueOf(this.f110353n);
            C42579n a = zVar.mo45631a(jVar.mo45662a());
            a.mo45673h(3);
            a.mo45671f(C62722b.FAILED_PRECONDITION);
            a.mo45674i(33);
            a.mo45672g(13);
            a.mo45666a();
        }
    }

    /* renamed from: w */
    private static boolean m73992w(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((C42304cc) it.next()).mo44976b().f110790g.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    private final void m73993x(int i, String str, Long l, List list) {
        Integer c;
        C42584s sVar;
        C42567b bVar = new C42567b();
        bVar.f111711i = i;
        bVar.f111703a = l;
        bVar.f111704b = this.f110354o;
        byte b = bVar.f111710h;
        bVar.f111705c = this.f110353n;
        bVar.f111710h = (byte) (b | 3);
        bVar.f111706d = str;
        bVar.mo45644b(C58485gu.m89842j(list));
        C58833ax t = m73989t();
        bVar.f111707e = t.mo56113h() ? Long.valueOf(((C42680d) t.mo56107c()).f111893b) : this.f110352m;
        bVar.f111708f = this.f110357r;
        bVar.f111710h = (byte) (bVar.f111710h | 4);
        C58801sm G = ((C58485gu) list).listIterator(0);
        while (true) {
            if (!G.hasNext()) {
                c = mo44815c();
                break;
            }
            LogEntity logEntity = (LogEntity) G.next();
            if (logEntity.mo45567a() != 0) {
                c = Integer.valueOf(logEntity.mo45567a());
                break;
            }
        }
        bVar.f111709g = c;
        LogEvent a = bVar.mo45643a();
        C42588w wVar = this.f110341b;
        C42580o oVar = wVar.f111758b;
        int j = a.mo45605j();
        int i2 = j - 1;
        if (j != 0) {
            switch (i2) {
                case 1:
                    ArrayList arrayList = new ArrayList(a.mo45597d());
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        LogEntity logEntity2 = (LogEntity) arrayList.get(i3);
                        if (C58557jl.m90138s(logEntity2.mo45582n(), C42583r.f111754a) || logEntity2.mo45611C()) {
                            sVar = logEntity2.mo45570d();
                        } else {
                            sVar = LogEntity.m75052y();
                            sVar.mo45619g(logEntity2.mo45592w());
                            sVar.mo45627o(logEntity2.mo45593x());
                            sVar.mo45620h(logEntity2.mo45568b());
                            sVar.mo45628p(logEntity2.mo45569c());
                            sVar.mo45630r(logEntity2.mo45583o());
                            sVar.mo45629q(logEntity2.mo45582n());
                        }
                        if (a.mo45612k() > 0) {
                            sVar.mo45628p(-1);
                            sVar.mo45620h(-1);
                        }
                        LogEntity.m75051B(sVar);
                        arrayList.set(i3, sVar.mo45613a());
                    }
                    C42587v c2 = a.mo45596c();
                    c2.mo45644b(C58485gu.m89842j(arrayList));
                    a = c2.mo45643a();
                    break;
                case 2:
                case 3:
                    if (a.mo45597d().size() != 1) {
                        throw new IllegalArgumentException("Only one is expected for the Click event, but it has " + a.mo45597d().size());
                    }
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported event type: ".concat(C42581p.m75151a(a.mo45605j())));
            }
            if (a != null) {
                C42569d dVar = (C42569d) wVar.f111757a;
                dVar.mo45645a(a, true);
                dVar.mo45645a(a, false);
                return;
            }
            return;
        }
        throw null;
    }

    /* renamed from: b */
    public C60870cx mo44814b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Integer mo44815c() {
        C58833ax t = m73989t();
        if (!t.mo56113h()) {
            return this.f110358s;
        }
        C57883f fVar = ((C42680d) t.mo56107c()).f111895d;
        if (fVar == null || (fVar.f154841a & 1) == 0) {
            return null;
        }
        return Integer.valueOf(fVar.f154842b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public List mo44816e() {
        throw null;
    }

    /* renamed from: f */
    public final void mo44817f(C42182ao aoVar) {
        if (aoVar != null) {
            synchronized (this.f110349j) {
                this.f110349j.add(aoVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo44818g(C42500d dVar) {
        Autocompletion[] autocompletionArr;
        int i;
        C58872ci ciVar;
        C42576k kVar;
        C42160an anVar;
        Autocompletion[] autocompletionArr2;
        C42551p pVar;
        C42331dc dcVar;
        C55815ay ayVar;
        C58485gu guVar;
        if (dVar.mo45390l() == 3 || dVar.mo45390l() == 4) {
            this.f110358s = dVar.mo45385h();
            this.f110352m = dVar.mo45387i();
            this.f110346g.f111755a = this.f110358s;
        }
        int i2 = 0;
        if (dVar.mo45383f().mo56113h()) {
            C42551p pVar2 = (C42551p) dVar.mo45383f().mo56107c();
            String str = dVar.mo45381e().f111605b;
            long j = dVar.mo45381e().f111606c;
            long a = dVar.mo45381e().mo45554a();
            C42576k kVar2 = dVar.mo45381e().f111612i;
            if (pVar2.f111629b.isEmpty()) {
                autocompletionArr = new Autocompletion[0];
            } else {
                C58872ci b = this.f110342c.mo45632b();
                C42160an anVar2 = new C42160an(this.f110340a, str, j);
                Autocompletion[] autocompletionArr3 = new Autocompletion[pVar2.f111629b.size()];
                int i3 = 0;
                while (i3 < pVar2.f111629b.size()) {
                    C42405ab abVar = (C42405ab) pVar2.f111629b.get(i3);
                    try {
                        Autocompletion a2 = anVar2.mo44852a(abVar);
                        autocompletionArr3[i3] = a2;
                        C42586u uVar = this.f110346g;
                        switch (pVar2.f111633f - 1) {
                            case 0:
                                dcVar = C42331dc.PAPI_TOPN;
                                break;
                            case 1:
                                dcVar = C42331dc.PAPI_AUTOCOMPLETE;
                                break;
                            case 3:
                                dcVar = C42331dc.DEVICE;
                                break;
                            case 4:
                                dcVar = C42331dc.DIRECTORY;
                                break;
                            case 5:
                                dcVar = C42331dc.PAPI_LIST_PEOPLE_BY_KNOWN_ID;
                                break;
                            case 6:
                                dcVar = C42331dc.PAPI_LIST_PEOPLE_BY_KNOWN_ID;
                                break;
                            case 7:
                                dcVar = C42331dc.SMART_ADDRESS_EXPANSION;
                                break;
                            case 8:
                                dcVar = C42331dc.PAPI_LIST_PEOPLE_BY_KNOWN_ID;
                                break;
                            case 9:
                                dcVar = C42331dc.PAPI_LIST_PEOPLE_BY_KNOWN_ID;
                                break;
                            case 10:
                                dcVar = C42331dc.PAPI_TOPN;
                                break;
                            case 11:
                                dcVar = C42331dc.PAPI_AUTOCOMPLETE;
                                break;
                            default:
                                dcVar = C42331dc.UNKNOWN_PROVENANCE;
                                break;
                        }
                        int intValue = ((Integer) pVar2.f111628a.mo56109e(Integer.valueOf(i2))).intValue();
                        C58833ax axVar = abVar.f111226a;
                        C58833ax d = axVar.mo56113h() ? abVar.mo45402d(axVar.mo56107c()) : C58836b.f156633a;
                        if (a2.mo44773b() == null || !abVar.mo45410l()) {
                            pVar = pVar2;
                            autocompletionArr2 = autocompletionArr3;
                            i = i3;
                            kVar = kVar2;
                            ciVar = b;
                            anVar = anVar2;
                            if (a2.mo44772a() != null) {
                                Group a3 = a2.mo44772a();
                                C42584s A = LogEntity.m75050A(a3.mo44780a(), a3.mo44829f());
                                A.mo45617e(intValue);
                                C42562a aVar = (C42562a) A;
                                aVar.f111682i = str;
                                aVar.f111674a = BuildConfig.FLAVOR;
                                aVar.f111681h = a >= 0 ? Integer.valueOf(C60757n.m92748i(TimeUnit.NANOSECONDS.toMicros(a))) : null;
                                if (C69308p.m100587f()) {
                                    C58528ij d2 = a3.mo44780a().mo44931d();
                                    if (d2 != null) {
                                        A.mo45615c().addAll(d2);
                                        A.mo45616d().addAll(d2);
                                    } else {
                                        A.mo45615c().add(dcVar);
                                        A.mo45616d().add(dcVar);
                                    }
                                } else {
                                    A.mo45615c().add(dcVar);
                                    A.mo45616d().add(dcVar);
                                }
                                if (d.mo56113h()) {
                                    C58833ax e = ((C42313cl) d.mo56107c()).mo45279e();
                                    if (e.mo56113h()) {
                                        aVar.f111683j = (C71942m) e.mo56107c();
                                    }
                                }
                                LogEntity.m75051B(A);
                                uVar.putIfAbsent(a3.mo44784e(), A.mo45613a());
                            }
                            i3 = i + 1;
                            pVar2 = pVar;
                            autocompletionArr3 = autocompletionArr2;
                            anVar2 = anVar;
                            kVar2 = kVar;
                            b = ciVar;
                            i2 = 0;
                        } else {
                            Person b2 = a2.mo44773b();
                            pVar = pVar2;
                            ContactMethodField[] g = a2.mo44828g();
                            autocompletionArr2 = autocompletionArr3;
                            int length = g.length;
                            anVar = anVar2;
                            int i4 = 0;
                            while (i4 < length) {
                                int i5 = length;
                                ContactMethodField contactMethodField = g[i4];
                                ContactMethodField[] contactMethodFieldArr = g;
                                String a4 = b2.mo44830a();
                                C42576k kVar3 = kVar2;
                                PersonExtendedData personExtendedData = b2.f110369e;
                                C58872ci ciVar2 = b;
                                C42584s z = LogEntity.m75053z(contactMethodField, a4, personExtendedData != null && personExtendedData.mo45035b());
                                z.mo45617e(intValue);
                                C42562a aVar2 = (C42562a) z;
                                aVar2.f111682i = str;
                                C55847i iVar = (C55847i) abVar.f111226a.mo56107c();
                                C42405ab abVar2 = abVar;
                                int i6 = i3;
                                if (iVar.f147360a == 1) {
                                    ayVar = (C55815ay) iVar.f147361b;
                                } else {
                                    ayVar = C55815ay.f147275f;
                                }
                                C55817b bVar = ayVar.f147278b;
                                if (bVar == null) {
                                    bVar = C55817b.f147283d;
                                }
                                aVar2.f111674a = bVar.f147286b.mo59170I(C62972cr.f170009a);
                                z.mo45623k(m73992w(b2.f110367c));
                                C42282bh lo = contactMethodField.mo45020lo();
                                if (lo == C42282bh.IN_APP_NOTIFICATION_TARGET || lo == C42282bh.IN_APP_EMAIL || lo == C42282bh.IN_APP_PHONE || lo == C42282bh.IN_APP_GAIA) {
                                    InAppNotificationTarget k = contactMethodField.mo45117k();
                                    C58480gp gpVar = new C58480gp(4);
                                    gpVar.mo55395g(k);
                                    gpVar.mo55396h(k.mo45016f());
                                    guVar = gpVar.mo55394f();
                                } else {
                                    guVar = C58485gu.m89845m();
                                }
                                z.mo45624l(m73992w(guVar));
                                aVar2.f111681h = a >= 0 ? Integer.valueOf(C60757n.m92748i(TimeUnit.NANOSECONDS.toMicros(a))) : null;
                                if (C69308p.m100587f()) {
                                    z.mo45616d().addAll(contactMethodField.mo44976b().f110792i);
                                    C58528ij b3 = b2.f110365a.mo44798b();
                                    if (b3 != null) {
                                        z.mo45615c().addAll(b3);
                                    } else {
                                        z.mo45615c().addAll(contactMethodField.mo44976b().f110792i);
                                    }
                                } else {
                                    z.mo45615c().add(dcVar);
                                    z.mo45616d().add(dcVar);
                                }
                                if (d.mo56113h()) {
                                    C58833ax e2 = ((C42313cl) d.mo56107c()).mo45279e();
                                    if (e2.mo56113h()) {
                                        aVar2.f111683j = (C71942m) e2.mo56107c();
                                    }
                                }
                                String n = contactMethodField.mo45119n();
                                LogEntity.m75051B(z);
                                LogEntity a5 = z.mo45613a();
                                if (!uVar.containsKey(n) || C42331dc.f111026n.compare(a5.mo45583o(), ((LogEntity) uVar.get(n)).mo45583o()) >= 0) {
                                    uVar.put(n, a5);
                                }
                                i4++;
                                length = i5;
                                g = contactMethodFieldArr;
                                kVar2 = kVar3;
                                b = ciVar2;
                                abVar = abVar2;
                                i3 = i6;
                            }
                            i = i3;
                            kVar = kVar2;
                            ciVar = b;
                            i3 = i + 1;
                            pVar2 = pVar;
                            autocompletionArr3 = autocompletionArr2;
                            anVar2 = anVar;
                            kVar2 = kVar;
                            b = ciVar;
                            i2 = 0;
                        }
                    } catch (IllegalStateException e3) {
                        pVar = pVar2;
                        autocompletionArr2 = autocompletionArr3;
                        i = i3;
                        kVar = kVar2;
                        ciVar = b;
                        anVar = anVar2;
                        C42579n a6 = this.f110342c.mo45631a(this.f110350k.f111612i);
                        a6.mo45673h(2);
                        a6.mo45674i(27);
                        a6.mo45670e(e3);
                        a6.mo45672g(8);
                        a6.mo45671f(C62722b.INVALID_ARGUMENT);
                        a6.mo45666a();
                    }
                }
                this.f110342c.mo45638h(58, b, kVar2);
                autocompletionArr = autocompletionArr3;
            }
        } else {
            C58485gu g2 = dVar.mo45384g();
            String str2 = dVar.mo45381e().f111605b;
            long j2 = dVar.mo45381e().f111606c;
            dVar.mo45381e().mo45554a();
            C42576k kVar4 = dVar.mo45381e().f111612i;
            if (g2.isEmpty()) {
                autocompletionArr = new Autocompletion[0];
            } else {
                C58872ci b4 = this.f110342c.mo45632b();
                Autocompletion[] autocompletionArr4 = new Autocompletion[g2.size()];
                if (g2.size() <= 0) {
                    this.f110342c.mo45638h(58, b4, kVar4);
                    autocompletionArr = autocompletionArr4;
                } else {
                    C42439r rVar = (C42439r) g2.get(0);
                    throw null;
                }
            }
        }
        C42151ae aeVar = this.f110345f;
        if (aeVar != null) {
            synchronized (aeVar.f110397a) {
                if (aeVar.f110403g == dVar.mo45381e()) {
                    aeVar.f110401e.mo55371a(autocompletionArr, autocompletionArr.length);
                    if (dVar.mo45389k()) {
                        aeVar.f110403g = null;
                        aeVar.f110401e.mo55394f();
                        aeVar.f110402f = aeVar.f110400d.mo26884a();
                        aeVar.f110404h = 2;
                    }
                }
            }
        }
        ((C42558i) this.f110362w).f111639a.post(new C42148ab(this, dVar, autocompletionArr));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (r12 == 0) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r12 == 0) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44819h(com.google.android.libraries.social.populous.p3296e.C42549n r11, int r12, com.google.android.libraries.social.populous.p3296e.C42500d r13) {
        /*
            r10 = this;
            boolean r0 = p5304e.p5305a.p5306a.p5442w.p5443a.C69314v.m100612c()
            r1 = 4
            r2 = 3
            r3 = 2
            if (r0 == 0) goto L_0x003a
            com.google.android.libraries.social.populous.e.b.n r0 = r11.f111617n
            boolean r0 = r0.mo45493b()
            if (r0 == 0) goto L_0x0014
            r1 = 5
            r6 = 5
            goto L_0x0047
        L_0x0014:
            com.google.common.base.ax r0 = r13.mo45383f()
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0030
            com.google.common.base.ax r0 = r13.mo45383f()
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.libraries.social.populous.e.p r0 = (com.google.android.libraries.social.populous.p3296e.C42551p) r0
            int r0 = r0.f111632e
            int r1 = com.google.android.libraries.social.populous.logging.C42570e.m75127a(r0, r12)
            r6 = r1
            goto L_0x0047
        L_0x0030:
            com.google.android.libraries.social.populous.core.aq r0 = r13.mo45380d()
            if (r0 == 0) goto L_0x0037
            goto L_0x0040
        L_0x0037:
            if (r12 != 0) goto L_0x0046
            goto L_0x0044
        L_0x003a:
            com.google.android.libraries.social.populous.core.aq r0 = r13.mo45380d()
            if (r0 == 0) goto L_0x0042
        L_0x0040:
            r6 = 4
            goto L_0x0047
        L_0x0042:
            if (r12 != 0) goto L_0x0046
        L_0x0044:
            r6 = 3
            goto L_0x0047
        L_0x0046:
            r6 = 2
        L_0x0047:
            int r0 = r13.mo45377a()
            com.google.common.base.cr r1 = r10.f110359t
            r4 = 1
            if (r1 == 0) goto L_0x005f
            com.google.android.libraries.social.populous.android.h r1 = (com.google.android.libraries.social.populous.android.C42169h) r1
            com.google.android.libraries.social.populous.android.t r1 = r1.f110439a
            com.google.android.libraries.social.populous.core.bb r1 = r1.mo44862b()
            int r1 = r1.f110907d
            int r1 = com.google.android.libraries.social.populous.C42185ar.m74118a(r1)
            goto L_0x0060
        L_0x005f:
            r1 = 1
        L_0x0060:
            java.lang.Integer r5 = r10.mo44815c()
            int r13 = r13.mo45390l()
            int r7 = r11.f111620q
            if (r7 != 0) goto L_0x006d
            return
        L_0x006d:
            com.google.android.libraries.social.populous.logging.x r7 = com.google.android.libraries.social.populous.logging.C42590y.m75179g()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8 = r7
            com.google.android.libraries.social.populous.logging.h r8 = (com.google.android.libraries.social.populous.logging.C42573h) r8
            r8.f111718b = r0
            r7.mo45651b(r12)
            int r12 = r11.f111621r
            r8.f111719c = r12
            r8.f111720d = r1
            r7.mo45652c(r13)
            boolean r12 = p5304e.p5305a.p5306a.p5442w.p5443a.C69314v.m100612c()
            if (r12 == 0) goto L_0x0098
            int r12 = r6 + -1
            if (r12 == r4) goto L_0x0095
            if (r12 == r3) goto L_0x0095
            if (r12 == r2) goto L_0x0095
            goto L_0x009c
        L_0x0095:
            com.google.common.base.ci r12 = r11.f111613j
            goto L_0x009a
        L_0x0098:
            com.google.common.base.ci r12 = r11.f111613j
        L_0x009a:
            r8.f111717a = r12
        L_0x009c:
            com.google.android.libraries.social.populous.logging.z r4 = r11.f111611h
            int r12 = r11.f111620q
            com.google.android.libraries.social.populous.logging.y r7 = r7.mo45650a()
            java.lang.String r13 = r11.f111605b
            int r13 = r13.length()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
            com.google.android.libraries.social.populous.logging.k r11 = r11.f111612i
            com.google.android.libraries.social.populous.logging.j r11 = r11.mo45663a()
            r11.f111733d = r5
            com.google.android.libraries.social.populous.logging.k r9 = r11.mo45662a()
            r5 = r12
            r4.mo45637g(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.AutocompleteSession.mo44819h(com.google.android.libraries.social.populous.e.n, int, com.google.android.libraries.social.populous.e.d):void");
    }

    /* renamed from: i */
    public final void mo44820i(Object obj, String str) {
        if (obj instanceof ContactMethodField) {
            ContactMethodField contactMethodField = (ContactMethodField) obj;
            if (this.f110348i.get(contactMethodField.mo45119n()) == null) {
                this.f110348i.put(contactMethodField.mo45119n(), str);
            }
        }
    }

    /* renamed from: j */
    public final void mo44821j(Object obj) {
        if (C69288ah.f185401a.mo6453a().mo60944b()) {
            m73991v("Cannot call reportDeselection after close an AutocompleteSession.", obj);
            C58838bb.m90866a(obj, "deselection is a required parameter.");
            if (obj instanceof ContactMethodField) {
                ContactMethodField contactMethodField = (ContactMethodField) obj;
                C58838bb.m90866a(contactMethodField.mo44976b(), "contactMethodField must have valid Metadata.");
                if (!contactMethodField.mo44976b().f110796m) {
                    C42584s r = m73987r(contactMethodField);
                    LogEntity.m75051B(r);
                    LogEntity a = r.mo45613a();
                    m73993x(4, contactMethodField.mo44976b().f110801r, contactMethodField.mo44976b().f110802s, C58485gu.m89846n(a));
                    C42282bh lo = contactMethodField.mo45020lo();
                    if (lo == C42282bh.IN_APP_NOTIFICATION_TARGET || lo == C42282bh.IN_APP_EMAIL || lo == C42282bh.IN_APP_PHONE || lo == C42282bh.IN_APP_GAIA) {
                        C42575j jVar = new C42575j();
                        jVar.f111733d = mo44815c();
                        jVar.f111730a = contactMethodField.mo44976b().f110802s;
                        jVar.f111731b = Long.valueOf(this.f110354o);
                        jVar.f111732c = Long.valueOf(this.f110353n);
                        m73990u(a, jVar.mo45662a());
                    }
                    this.f110354o = ((C42205bj) this.f110360u).f110526b.getAndIncrement();
                    synchronized (this.f110351l) {
                        Iterator it = this.f110351l.f111030a.iterator();
                        while (it.hasNext()) {
                            if (((ContactMethodField) it.next()).mo45119n().equals(contactMethodField.mo45119n())) {
                                it.remove();
                            }
                        }
                    }
                }
            } else if (obj instanceof Group) {
                Group group = (Group) obj;
                C58838bb.m90866a(group.mo44780a(), "group must have valid Metadata.");
                String e = group.mo44780a().mo44932e();
                Long valueOf = Long.valueOf(group.mo44780a().mo44928a());
                C42584s q = m73986q(group);
                LogEntity.m75051B(q);
                m73993x(4, e, valueOf, C58485gu.m89846n(q.mo45613a()));
                if (C69282ab.m100471c()) {
                    this.f110354o = ((C42205bj) this.f110360u).f110526b.getAndIncrement();
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo44822k(Object obj) {
        m73991v("Cannot call reportDisplay after close an AutocompleteSession.", obj);
        C58838bb.m90866a(obj, "The display is a required parameter.");
        if (obj instanceof ContactMethodField) {
            ContactMethodField contactMethodField = (ContactMethodField) obj;
            C58838bb.m90866a(contactMethodField.mo44976b(), "The resultField must have valid Metadata.");
            if (!contactMethodField.mo44976b().f110796m) {
                String str = contactMethodField.mo44976b().f110801r;
                Long l = contactMethodField.mo44976b().f110802s;
                C42584s r = m73987r(contactMethodField);
                LogEntity.m75051B(r);
                m73993x(2, str, l, C58485gu.m89846n(r.mo45613a()));
            }
        } else if (obj instanceof Group) {
            Group group = (Group) obj;
            C58838bb.m90866a(group.mo44780a(), "The group must have valid Metadata.");
            String e = group.mo44780a().mo44932e();
            Long valueOf = Long.valueOf(group.mo44780a().mo44928a());
            C42584s q = m73986q(group);
            LogEntity.m75051B(q);
            m73993x(2, e, valueOf, C58485gu.m89846n(q.mo45613a()));
        }
    }

    /* renamed from: l */
    public final void mo44823l(Object[] objArr) {
        C58480gp e = C58485gu.m89837e();
        int i = 0;
        while (i < objArr.length) {
            ContactMethodField contactMethodField = objArr[i];
            if (contactMethodField != null) {
                if (contactMethodField instanceof ContactMethodField) {
                    C42584s r = m73987r(contactMethodField);
                    r.mo45628p(i);
                    r.mo45620h(0);
                    LogEntity.m75051B(r);
                    e.mo55395g(r.mo45613a());
                }
                if (C69282ab.f185394a.mo6453a().mo60939b()) {
                    Group group = objArr[i];
                    if (group instanceof Group) {
                        C42584s q = m73986q(group);
                        q.mo45628p(i);
                        q.mo45620h(0);
                        LogEntity.m75051B(q);
                        e.mo55395g(q.mo45613a());
                    }
                }
                if ((objArr[i] instanceof C41932g) && C69296d.m100510c()) {
                    C41924aa aaVar = objArr[i].f109394c;
                    if (aaVar == null) {
                        aaVar = C41924aa.f109370g;
                    }
                    EnumSet<E> noneOf = EnumSet.noneOf(C42331dc.class);
                    for (C71924aa a : new C62963cj(aaVar.f109375d, C41924aa.f109369e)) {
                        noneOf.add(C42331dc.m74556a(a));
                    }
                    C42584s y = LogEntity.m75052y();
                    y.mo45619g(10);
                    y.mo45628p(aaVar.f109376f);
                    y.mo45630r(noneOf);
                    ((C42562a) y).f111682i = aaVar.f109373b;
                    y.mo45628p(i);
                    y.mo45620h(0);
                    LogEntity.m75051B(y);
                    e.mo55395g(y.mo45613a());
                }
                i++;
            } else {
                throw new IllegalArgumentException("Illegal empty string as recipient.");
            }
        }
        m73993x(8, (String) null, (Long) null, e.mo55394f());
    }

    /* renamed from: m */
    public final void mo44824m(Object obj) {
        LogEntity logEntity;
        m73991v("Cannot call reportSelection after close an AutocompleteSession.", obj);
        C58838bb.m90866a(obj, "selection is a required parameter.");
        C42586u uVar = this.f110346g;
        String d = m73985d(obj);
        if (!(d == null || (logEntity = (LogEntity) uVar.get(d)) == null)) {
            uVar.f111756b.put(d, logEntity.mo45581m());
        }
        if (obj instanceof ContactMethodField) {
            ContactMethodField contactMethodField = (ContactMethodField) obj;
            C58838bb.m90866a(contactMethodField.mo44976b(), "contactMethodField must have valid Metadata.");
            if (!contactMethodField.mo44976b().f110796m) {
                C42584s r = m73987r(contactMethodField);
                LogEntity.m75051B(r);
                LogEntity a = r.mo45613a();
                m73993x(3, contactMethodField.mo44976b().f110801r, contactMethodField.mo44976b().f110802s, C58485gu.m89846n(a));
                C42282bh lo = contactMethodField.mo45020lo();
                if (lo == C42282bh.IN_APP_NOTIFICATION_TARGET || lo == C42282bh.IN_APP_EMAIL || lo == C42282bh.IN_APP_PHONE || lo == C42282bh.IN_APP_GAIA) {
                    C42575j jVar = new C42575j();
                    jVar.f111733d = mo44815c();
                    jVar.f111730a = contactMethodField.mo44976b().f110802s;
                    jVar.f111731b = Long.valueOf(this.f110354o);
                    jVar.f111732c = Long.valueOf(this.f110353n);
                    m73990u(a, jVar.mo45662a());
                }
                this.f110354o = ((C42205bj) this.f110360u).f110526b.getAndIncrement();
                synchronized (this.f110351l) {
                    this.f110351l.f111030a.add(contactMethodField);
                }
            }
        } else if (obj instanceof Group) {
            Group group = (Group) obj;
            C58838bb.m90866a(group.mo44780a(), "group must have valid Metadata.");
            String e = group.mo44780a().mo44932e();
            Long valueOf = Long.valueOf(group.mo44780a().mo44928a());
            C42584s q = m73986q(group);
            LogEntity.m75051B(q);
            m73993x(3, e, valueOf, C58485gu.m89846n(q.mo45613a()));
            if (C69282ab.m100471c()) {
                this.f110354o = ((C42205bj) this.f110360u).f110526b.getAndIncrement();
            }
        }
    }

    /* renamed from: n */
    public void mo44825n(String str) {
        String g = C58837ba.m90858g(str);
        mo44826o(g, true != g.trim().isEmpty() ? 7 : 6);
        C60870cx cxVar = this.f110343d;
        if (cxVar != null) {
            C60856cj.m92911t(cxVar, new C42149ac(this, this.f110350k), C60826bg.f164896a);
        }
    }

    /* renamed from: o */
    public final void mo44826o(String str, int i) {
        int i2 = i;
        C42549n nVar = this.f110350k;
        if (nVar != null) {
            nVar.f111617n.mo45492a();
            this.f110350k = null;
        }
        long andIncrement = ((C42205bj) this.f110360u).f110527c.getAndIncrement();
        this.f110355p = andIncrement;
        if (str != null) {
            SessionContext a = this.f110351l.mo45315a();
            C42279be beVar = this.f110361v;
            ClientConfigInternal clientConfigInternal = this.f110340a;
            C58881cr crVar = this.f110359t;
            int a2 = crVar != null ? C42185ar.m74118a(((C42169h) crVar).f110439a.mo44862b().f110907d) : 1;
            C42591z zVar = this.f110342c;
            C42575j jVar = new C42575j();
            jVar.f111733d = mo44815c();
            jVar.f111731b = Long.valueOf(this.f110354o);
            jVar.f111732c = Long.valueOf(this.f110353n);
            C42549n nVar2 = new C42549n(str, andIncrement, a, beVar, clientConfigInternal, a2, zVar, jVar.mo45662a());
            this.f110350k = nVar2;
            if (i2 != 0) {
                nVar2.f111620q = i2;
                nVar2.f111613j = nVar2.f111611h.mo45634d(i2, 1, Integer.valueOf(nVar2.f111605b.length()), nVar2.f111612i);
            }
            C42151ae aeVar = this.f110345f;
            if (aeVar != null) {
                C42549n nVar3 = this.f110350k;
                synchronized (aeVar.f110397a) {
                    if (BuildConfig.FLAVOR.equals(nVar3.f111605b)) {
                        synchronized (aeVar.f110397a) {
                            int i3 = aeVar.f110404h;
                            if (i3 == 2 || i3 == 3) {
                                long a3 = aeVar.f110400d.mo26884a() - aeVar.f110402f;
                                if (a3 >= aeVar.f110399c) {
                                    aeVar.mo44850a();
                                } else if (a3 >= aeVar.f110398b) {
                                    aeVar.f110404h = 3;
                                }
                            }
                        }
                        if (aeVar.f110404h != 2) {
                            aeVar.f110403g = nVar3;
                            aeVar.f110401e = C58485gu.m89837e();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: p */
    public final void mo44827p() {
        if (!this.f110356q) {
            this.f110356q = true;
            C42591z zVar = this.f110342c;
            C42575j jVar = new C42575j();
            jVar.f111733d = mo44815c();
            jVar.f111731b = Long.valueOf(this.f110354o);
            jVar.f111732c = Long.valueOf(this.f110353n);
            zVar.mo45634d(4, 0, (Integer) null, jVar.mo45662a());
            m73993x(6, (String) null, (Long) null, C58485gu.m89845m());
            return;
        }
        throw new C42196ba();
    }
}
