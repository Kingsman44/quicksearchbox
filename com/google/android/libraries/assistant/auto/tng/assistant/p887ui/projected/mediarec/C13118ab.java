package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.jumpboost.p702l.p703a.p704a.C11831a;
import com.google.android.libraries.assistant.auto.tng.assistant.p718a.C11951a;
import com.google.android.libraries.assistant.auto.tng.assistant.p720b.p724d.C11983a;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12972ad;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12973ae;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12985c;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12987e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13001s;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.p880a.C12968d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13023ak;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13042d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13047i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13048j;
import com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.p888a.C13103a;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15488n;
import com.google.android.libraries.assistant.p1363c.p1451h.C17590a;
import com.google.android.libraries.assistant.pcp.p1573k.C18914ac;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.dataservice.p3638c.C46753j;
import com.google.apps.tiktok.dataservice.p3638c.C46755l;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.p3685a.p3693c.C47600c;
import com.google.assistant.p3897e.p3902c.p3907c.C51015df;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52559wf;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.base.C58819aj;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60901do;
import com.google.knowledge.p4661a.p4662a.C61745g;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61747i;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p4850an.C63618g;
import com.google.protos.p4850an.C63624h;
import com.google.protos.p4883as.p4884a.C63772a;
import com.google.protos.p4883as.p4884a.C63775d;
import com.google.protos.p5124m.p5125a.C65603f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.ab */
/* compiled from: PG */
public final class C13118ab {

    /* renamed from: a */
    public static final C59071e f40669a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.ab");

    /* renamed from: A */
    public final C13144az f40670A;

    /* renamed from: B */
    public int f40671B = -1;

    /* renamed from: C */
    public boolean f40672C = false;

    /* renamed from: D */
    public final C13120b f40673D = new C13120b();

    /* renamed from: E */
    public final C13119a f40674E = new C13119a();

    /* renamed from: F */
    private final C60888db f40675F;

    /* renamed from: G */
    private final C11831a f40676G;

    /* renamed from: b */
    public final C69464a f40677b;

    /* renamed from: c */
    public final C69464a f40678c;

    /* renamed from: d */
    public final C69464a f40679d;

    /* renamed from: e */
    public final C69464a f40680e;

    /* renamed from: f */
    public final C69464a f40681f;

    /* renamed from: g */
    public final C69464a f40682g;

    /* renamed from: h */
    public final C69464a f40683h;

    /* renamed from: i */
    public final C69464a f40684i;

    /* renamed from: j */
    public final C69464a f40685j;

    /* renamed from: k */
    public final C69464a f40686k;

    /* renamed from: l */
    public final Fragment f40687l;

    /* renamed from: m */
    public final C47449e f40688m;

    /* renamed from: n */
    public final PackageManager f40689n;

    /* renamed from: o */
    public final C18914ac f40690o;

    /* renamed from: p */
    public final C46439e f40691p;

    /* renamed from: q */
    public final C46801dp f40692q;

    /* renamed from: r */
    public final C11951a f40693r;

    /* renamed from: s */
    public final C13103a f40694s;

    /* renamed from: t */
    public final C15488n f40695t;

    /* renamed from: u */
    public final C28310af f40696u;

    /* renamed from: v */
    public final C28306ab f40697v;

    /* renamed from: w */
    public final C11983a f40698w;

    /* renamed from: x */
    public final C28443m f40699x;

    /* renamed from: y */
    public final C47770dh f40700y;

    /* renamed from: z */
    public final C13141aw f40701z;

    /* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.ab$a */
    /* compiled from: PG */
    final class C13119a implements C46440f {
        public C13119a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59104x c = C13118ab.f40669a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MediaRecFragment");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(44594)).mo56386p("Failed to auto dismiss");
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C58976aa aaVar = C58975e.f156826a;
            C13118ab.this.f40695t.mo19974a(C37179a.f97418Q);
            C13118ab.this.mo20913d(true);
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    /* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.ab$b */
    /* compiled from: PG */
    final class C13120b implements C46792di {
        public C13120b() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C59104x c = C13118ab.f40669a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MediaRecFragment");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(44596)).mo56386p("Failed to fetch proactive content");
            C13118ab.this.f40695t.mo19974a(C37179a.f97421T.mo40815i(C62722b.INTERNAL));
            C13118ab.this.mo20913d(false);
        }

        /* renamed from: b */
        public final /* synthetic */ void mo18078b(Object obj) {
            C13001s sVar;
            long j;
            C13048j jVar = (C13048j) obj;
            C58976aa aaVar = C58975e.f156826a;
            if (jVar.f40505b.isEmpty()) {
                int a = C13047i.m29246a(jVar.f40506c);
                if (a == 0) {
                    a = 1;
                }
                C59104x d = C13118ab.f40669a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "MediaRecFragment");
                ((C59052c) ((C59052c) d).mo56372aa(44598)).mo56389s("Got empty proactive content reason %s", a != 1 ? a != 2 ? "OFFLINE" : "CACHE_MISS" : "NO_RESULTS");
                C52567wn wnVar = C52567wn.UNKNOWN;
                int i = a - 1;
                if (i == 1) {
                    C13118ab.this.f40670A.mo20927a(3);
                } else if (i != 2) {
                    C13118ab.this.f40695t.mo19974a(C37179a.f97421T.mo40815i(C62722b.NOT_FOUND));
                    C13118ab.this.mo20913d(false);
                } else {
                    C13118ab.this.f40670A.mo20927a(2);
                    C13118ab.this.f40695t.mo19974a(C37179a.f97421T.mo40815i(C62722b.UNAVAILABLE));
                    C13118ab abVar = C13118ab.this;
                    abVar.mo20915f(((Long) abVar.f40684i.mo17428b()).longValue());
                }
            } else {
                C13118ab.this.f40695t.mo19974a(C37179a.f97421T.mo40815i(C62722b.OK));
                C13118ab abVar2 = C13118ab.this;
                String str = abVar2.mo20912c().f40488f;
                ArrayList arrayList = new ArrayList(jVar.f40505b);
                if (!C58837ba.m90859h(str)) {
                    int a2 = C13139au.m29358a(-1, arrayList, true, str);
                    int a3 = C13139au.m29358a(-1, arrayList, false, str);
                    while (a3 < arrayList.size() && a2 < arrayList.size() && a3 < a2) {
                        Collections.swap(arrayList, a3, a2);
                        a2 = C13139au.m29358a(a2, arrayList, true, str);
                        a3 = C13139au.m29358a(a3, arrayList, false, str);
                    }
                }
                C12986d b = abVar2.mo20911b();
                if (b.f40368b == 10) {
                    sVar = (C13001s) b.f40369c;
                } else {
                    sVar = C13001s.f40405b;
                }
                C62971cq cqVar = sVar.f40407a;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (Collection.EL.stream(cqVar).flatMap(C13128aj.f40710a).anyMatch(new C13129ak((C52560wg) it.next()))) {
                        it.remove();
                    }
                }
                if (((Boolean) abVar2.f40679d.mo17428b()).booleanValue()) {
                    int i2 = 0;
                    int i3 = -1;
                    int i4 = -1;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            break;
                        }
                        C52568wo woVar = ((C52560wg) arrayList.get(i2)).f137950f;
                        if (woVar == null) {
                            woVar = C52568wo.f137992v;
                        }
                        C52567wn b2 = C52567wn.m86649b(woVar.f138003j);
                        if (b2 == null) {
                            b2 = C52567wn.UNKNOWN;
                        }
                        if (b2 == C52567wn.PODCAST_EPISODE && i3 == -1) {
                            i3 = i2;
                        } else {
                            C52568wo woVar2 = ((C52560wg) arrayList.get(i2)).f137950f;
                            if (woVar2 == null) {
                                woVar2 = C52568wo.f137992v;
                            }
                            C52567wn b3 = C52567wn.m86649b(woVar2.f138003j);
                            if (b3 == null) {
                                b3 = C52567wn.UNKNOWN;
                            }
                            if (b3 == C52567wn.NEWS && i4 == -1) {
                                i4 = i2;
                            }
                        }
                        if (i3 < 0 || i4 < 0) {
                            i2++;
                        } else if (i3 < i4) {
                            Collections.swap(arrayList, i3, i4);
                        }
                    }
                }
                Collections.rotate(arrayList, -jVar.f40507d);
                ArrayList arrayList2 = new ArrayList();
                if (abVar2.f40672C) {
                    j = ((long) abVar2.f40687l.getResources().getInteger(R.integer.grid_layout_span)) * ((Long) abVar2.f40681f.mo17428b()).longValue();
                } else {
                    j = ((Long) abVar2.f40680e.mo17428b()).longValue();
                }
                arrayList2.addAll((java.util.Collection) Collection.EL.stream(arrayList).limit(j).map(C13160p.f40766a).collect(Collectors.toCollection(C13161q.f40767a)));
                if (!arrayList2.isEmpty()) {
                    if (((Boolean) abVar2.f40678c.mo17428b()).booleanValue() && !C58837ba.m90859h(str) && !((C65603f) abVar2.f40686k.mo17428b()).f178307a.contains(str)) {
                        int size = arrayList2.size();
                        C13151g f = C13152h.m29382f();
                        C52559wf wfVar = (C52559wf) C52560wg.f137943j.createBuilder();
                        C51015df dfVar = (C51015df) C51016dg.f132827g.createBuilder();
                        C61751m mVar = (C61751m) C61752n.f166808f.createBuilder();
                        mVar.copyOnWrite();
                        C61752n nVar = (C61752n) mVar.instance;
                        nVar.f166810a |= 4;
                        nVar.f166811b = "Play_different_media";
                        C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
                        gVar.copyOnWrite();
                        C61746h hVar = (C61746h) gVar.instance;
                        hVar.f166793a = 2 | hVar.f166793a;
                        hVar.f166796d = "app";
                        C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
                        C63618g gVar2 = (C63618g) C63624h.f172070b.createBuilder();
                        C63772a aVar = (C63772a) C63775d.f172518h.createBuilder();
                        aVar.copyOnWrite();
                        C63775d dVar = (C63775d) aVar.instance;
                        str.getClass();
                        dVar.f172520a |= 4;
                        dVar.f172523d = str;
                        gVar2.mo59221b(aVar);
                        iVar.copyOnWrite();
                        C61748j jVar2 = (C61748j) iVar.instance;
                        C63624h hVar2 = (C63624h) gVar2.build();
                        hVar2.getClass();
                        jVar2.f166803b = hVar2;
                        jVar2.f166802a = 15;
                        gVar.copyOnWrite();
                        C61746h hVar3 = (C61746h) gVar.instance;
                        C61748j jVar3 = (C61748j) iVar.build();
                        jVar3.getClass();
                        hVar3.f166797e = jVar3;
                        hVar3.f166793a |= 4;
                        mVar.mo58184c(gVar);
                        C51805du a4 = C17590a.m34882a((C61752n) mVar.build());
                        dfVar.copyOnWrite();
                        C51016dg dgVar = (C51016dg) dfVar.instance;
                        a4.getClass();
                        dgVar.f132833e = a4;
                        dgVar.f132829a |= 8;
                        wfVar.copyOnWrite();
                        C52560wg wgVar = (C52560wg) wfVar.instance;
                        C51016dg dgVar2 = (C51016dg) dfVar.build();
                        dgVar2.getClass();
                        wgVar.f137947c = dgVar2;
                        wgVar.f137946b = 16;
                        f.mo20904e((C52560wg) wfVar.build());
                        f.mo20901b(true);
                        arrayList2.set(size - 1, f.mo20900a());
                    }
                    C13152h hVar4 = (C13152h) C58557jl.m90130k(arrayList2, (Object) null);
                    hVar4.getClass();
                    C13151g a5 = hVar4.mo20928a();
                    a5.mo20902c(true);
                    arrayList2.set(0, a5.mo20900a());
                    int size2 = arrayList2.size();
                    C13151g a6 = ((C13152h) C58557jl.m90131l(arrayList2)).mo20928a();
                    a6.mo20903d(true);
                    arrayList2.set(size2 - 1, a6.mo20900a());
                }
                View requireView = abVar2.f40687l.requireView();
                RecyclerView recyclerView = (RecyclerView) requireView.findViewById(R.id.media_rec_content_container);
                LinearLayoutManager wVar = new C13167w(abVar2, requireView.getContext(), requireView, recyclerView);
                LinearLayoutManager xVar = new C13168x(requireView.getContext(), requireView.getResources().getInteger(R.integer.grid_layout_span), requireView);
                if (true == abVar2.f40672C) {
                    wVar = xVar;
                }
                recyclerView.setLayoutManager(wVar);
                C46753j jVar4 = new C46753j();
                jVar4.f122102a = new C58819aj(new C13153i(abVar2.f40672C, abVar2.f40688m, abVar2.f40700y, abVar2.f40689n, abVar2.f40696u, abVar2.f40699x, abVar2.f40697v, new C13169y(abVar2)));
                C46755l a7 = jVar4.mo50770a();
                a7.mo50772a(arrayList2);
                recyclerView.setAdapter(a7);
                recyclerView.clearOnScrollListeners();
                recyclerView.addOnScrollListener(new C13170z(abVar2));
                abVar2.f40670A.mo20927a(4);
                C13118ab abVar3 = C13118ab.this;
                abVar3.mo20915f(((Long) abVar3.f40683h.mo17428b()).longValue());
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C13118ab(C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6, C69464a aVar7, C69464a aVar8, C69464a aVar9, C69464a aVar10, Fragment fragment, C11831a aVar11, C15488n nVar, C28310af afVar, C28306ab abVar, C11983a aVar12, C28443m mVar, C47770dh dhVar, C47600c cVar, C47449e eVar, PackageManager packageManager, C18914ac acVar, C46439e eVar2, C46801dp dpVar, C11951a aVar13, C13103a aVar14, C60888db dbVar) {
        C28443m mVar2 = mVar;
        this.f40677b = aVar;
        this.f40678c = aVar2;
        this.f40679d = aVar3;
        this.f40680e = aVar4;
        this.f40681f = aVar5;
        this.f40682g = aVar6;
        this.f40683h = aVar7;
        this.f40684i = aVar8;
        this.f40685j = aVar9;
        this.f40686k = aVar10;
        this.f40687l = fragment;
        this.f40676G = aVar11;
        this.f40695t = nVar;
        this.f40696u = afVar;
        this.f40697v = abVar;
        this.f40698w = aVar12;
        this.f40699x = mVar2;
        this.f40700y = dhVar;
        this.f40688m = eVar;
        this.f40689n = packageManager;
        this.f40690o = acVar;
        this.f40691p = eVar2;
        this.f40692q = dpVar;
        this.f40675F = dbVar;
        this.f40693r = aVar13;
        this.f40694s = aVar14;
        this.f40701z = new C13141aw(fragment, mVar2);
        this.f40670A = new C13144az(fragment, cVar);
    }

    /* renamed from: g */
    public static boolean m29335g(View view, MotionEvent motionEvent) {
        C58976aa aaVar = C58975e.f156826a;
        motionEvent.getAction();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), R.animator.expand);
                animatorSet.setTarget(view);
                animatorSet.start();
                view.performClick();
                view.setPressed(false);
            } else if (action == 3) {
                AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), R.animator.expand);
                animatorSet2.setTarget(view);
                animatorSet2.start();
                view.setPressed(false);
            }
            return view.onTouchEvent(motionEvent);
        }
        AnimatorSet animatorSet3 = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), R.animator.shrink);
        animatorSet3.setTarget(view);
        animatorSet3.start();
        view.setPressed(true);
        return true;
    }

    /* renamed from: a */
    public final C12986d mo20910a(C13023ak akVar) {
        C12986d b = mo20911b();
        C12985c cVar = (C12985c) b.toBuilder();
        C12991i iVar = b.f40370d;
        if (iVar == null) {
            iVar = C12991i.f40380k;
        }
        C12987e eVar = (C12987e) iVar.toBuilder();
        eVar.copyOnWrite();
        C12991i iVar2 = (C12991i) eVar.instance;
        iVar2.f40382a |= 2;
        iVar2.f40384c = true;
        cVar.copyOnWrite();
        C12986d dVar = (C12986d) cVar.instance;
        C12991i iVar3 = (C12991i) eVar.build();
        iVar3.getClass();
        dVar.f40370d = iVar3;
        dVar.f40367a |= 128;
        C12972ad adVar = (C12972ad) C12973ae.f40345c.createBuilder();
        adVar.copyOnWrite();
        C12973ae aeVar = (C12973ae) adVar.instance;
        akVar.getClass();
        aeVar.f40348b = akVar;
        aeVar.f40347a |= 1;
        cVar.copyOnWrite();
        C12986d dVar2 = (C12986d) cVar.instance;
        C12973ae aeVar2 = (C12973ae) adVar.build();
        aeVar2.getClass();
        dVar2.f40369c = aeVar2;
        dVar2.f40368b = 2;
        return (C12986d) cVar.build();
    }

    /* renamed from: b */
    public final C12986d mo20911b() {
        Intent a = this.f40676G.mo20174a();
        C58976aa aaVar = C58975e.f156826a;
        if (a == null) {
            C59104x d = f40669a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MediaRecFragment");
            ((C59052c) ((C59052c) d).mo56372aa(44604)).mo56386p("No intent found in the fragment host.");
            return this.f40676G.mo20175b();
        }
        C58833ax a2 = C12968d.m29209a(a);
        if (!a2.mo56113h()) {
            C59104x d2 = f40669a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "MediaRecFragment");
            ((C59052c) ((C59052c) d2).mo56372aa(44603)).mo56386p("No assistant request found in the fragment host.");
            return this.f40676G.mo20175b();
        }
        a2.mo56107c();
        return (C12986d) a2.mo56107c();
    }

    /* renamed from: c */
    public final C13042d mo20912c() {
        Object obj;
        C12986d b = mo20911b();
        if ((b.f40367a & 128) != 0) {
            C12991i iVar = b.f40370d;
            if (iVar == null) {
                iVar = C12991i.f40380k;
            }
            C62940bt r2 = C62942bv.checkIsLite(C13042d.f40481n);
            iVar.mo58887l(r2);
            if (iVar.f169962ag.mo58857o(r2.f169971d)) {
                C12991i iVar2 = b.f40370d;
                if (iVar2 == null) {
                    iVar2 = C12991i.f40380k;
                }
                C62940bt r1 = C62942bv.checkIsLite(C13042d.f40481n);
                iVar2.mo58887l(r1);
                Object l = iVar2.f169962ag.mo58854l(r1.f169971d);
                if (l == null) {
                    obj = r1.f169969b;
                } else {
                    obj = r1.mo58889c(l);
                }
                return (C13042d) obj;
            }
        }
        return C13042d.f40480m;
    }

    /* renamed from: d */
    public final void mo20913d(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (z) {
            C46459k.m82829b(this.f40694s.mo20905d(Math.max(this.f40671B + 1, ((Long) this.f40682g.mo17428b()).intValue() - 1)), "Failed to increment rotatation offset on dismiss", new Object[0]);
        }
        this.f40670A.mo20927a(6);
    }

    /* renamed from: e */
    public final void mo20914e() {
        C58976aa aaVar = C58975e.f156826a;
        this.f40695t.mo19974a(C37179a.f97420S);
        mo20913d(true);
    }

    /* renamed from: f */
    public final void mo20915f(long j) {
        if (j > 0) {
            this.f40691p.mo50445g(C46438d.m82810b(this.f40675F.mo29164d(C60901do.f165001a, j, TimeUnit.SECONDS)), new C46436b((Object) null), this.f40674E);
        }
    }

    /* renamed from: h */
    public final boolean mo20916h(KeyEvent keyEvent) {
        C59104x b = f40669a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MediaRecFragment");
        ((C59052c) ((C59052c) b).mo56372aa(44616)).mo56389s("dispatchKeyEvent: %s", keyEvent);
        if (keyEvent.getAction() != 1) {
            return false;
        }
        if (keyEvent.getKeyCode() != 4 && (keyEvent.getKeyCode() != 20 || keyEvent.getSource() == 1048584)) {
            return false;
        }
        mo20914e();
        return true;
    }
}
