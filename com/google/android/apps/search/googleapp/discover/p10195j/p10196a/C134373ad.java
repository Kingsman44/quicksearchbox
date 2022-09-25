package com.google.android.apps.search.googleapp.discover.p10195j.p10196a;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import com.facebook.litho.LithoView;
import com.google.android.apps.search.googleapp.discover.p10166a.C133939b;
import com.google.android.apps.search.googleapp.discover.p10189g.C134342m;
import com.google.android.apps.search.googleapp.discover.p10189g.C134343n;
import com.google.android.apps.search.googleapp.discover.p10189g.C134345p;
import com.google.android.apps.search.googleapp.discover.p10214s.C134589g;
import com.google.android.apps.search.googleapp.discover.p10244v.C135200t;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40081u;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40027ah;
import com.google.android.libraries.search.rendering.xuikit.p3131d.C40306b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C44565p;
import com.google.apps.tiktok.tracing.C47585ci;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57109x;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a.C64182ad;
import com.google.protos.youtube.elements.C66059au;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.p5494b.C69802a;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.a.ad */
/* compiled from: PG */
public final class C134373ad implements C21312s {

    /* renamed from: a */
    private static final C59071e f366024a = C59071e.m91332i("com.google.android.apps.search.googleapp.discover.j.a.ad");

    /* renamed from: b */
    private final C133939b f366025b;

    public C134373ad(C133939b bVar) {
        this.f366025b = bVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C64182ad.f173531c;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        Object obj2;
        C57784p pVar;
        C57784p pVar2;
        C57696b bVar;
        C64182ad adVar = (C64182ad) obj;
        C21248ar e = rVar.mo26735e();
        if (!(e instanceof C40081u)) {
            ((C59052c) ((C59052c) f366024a.mo56226d()).mo56372aa(40331)).mo56386p("Creating a VE logger that did not use an XUiKitElementBuilder. This will break VE logging");
            return C69794a.m101254f(new IllegalArgumentException("CommandHandler requires an XUiKitElementBuilder."));
        }
        C40081u uVar = (C40081u) e;
        C40306b b = uVar.f105300c.mo42110b();
        C62940bt r1 = C62942bv.checkIsLite(C134589g.f366529e);
        b.mo58887l(r1);
        Object l = b.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj2 = r1.f169969b;
        } else {
            obj2 = r1.mo58889c(l);
        }
        C134589g gVar = (C134589g) obj2;
        C133939b bVar2 = this.f366025b;
        C57109x xVar = adVar.f173533a;
        if (xVar == null) {
            xVar = C57109x.f152452e;
        }
        C40027ah ahVar = uVar.f105299b;
        C69664n.m101061g(xVar, "openCardMenuData");
        C69664n.m101061g(gVar, "clientContext");
        C134345p pVar3 = bVar2.f364795d;
        C69664n.m101061g(xVar, "openCardMenuData");
        C69664n.m101061g(gVar, "parentClientContext");
        if (xVar.f152455b == 1) {
            pVar = (C57784p) xVar.f152456c;
        } else {
            pVar = C57784p.f154382f;
        }
        if ((pVar.f154384a & 1) != 0) {
            Context context = pVar3.f365938b.getContext();
            if (context == null) {
                C59052c cVar = (C59052c) C134345p.f365937a.mo56226d();
                cVar.mo56379ah(new C59094n(40302));
                cVar.mo56386p("No Context. Skipping.");
            } else {
                pVar3.mo111749c();
                C135200t tVar = pVar3.f365941e;
                String str = gVar.f366532b;
                C69664n.m101060f(str, "parentClientContext.sessionId");
                tVar.mo112158f(str, pVar3.f365944h.f366954c);
                int i = context.getResources().getConfiguration().uiMode;
                C44565p pVar4 = new C44565p(context, R.style.SheetDialog);
                pVar3.f365945i = pVar4;
                pVar4.mo1197b().mo1191s((i & 48) == 32 ? 2 : 1);
                C69802a aVar = new C69802a();
                if (xVar.f152455b == 1) {
                    pVar2 = (C57784p) xVar.f152456c;
                } else {
                    pVar2 = C57784p.f154382f;
                }
                C57784p pVar5 = pVar2;
                C69664n.m101060f(pVar5, "openCardMenuData.elementsOutput");
                LithoView a = pVar3.mo111747a(context, pVar5, ahVar, gVar, aVar);
                pVar4.setContentView((View) a);
                if ((xVar.f152454a & 4) != 0) {
                    bVar = xVar.f152457d;
                    if (bVar == null) {
                        bVar = C57696b.f154137l;
                    }
                } else {
                    bVar = null;
                }
                pVar4.setOnDismissListener(new C47585ci(pVar3.f365940d, "Clicked to dismiss Bottomsheet", new C134342m(a, aVar, bVar, ahVar)));
                ViewParent parent = a.getParent();
                C69664n.m101059e(parent, "null cannot be cast to non-null type android.view.View");
                BottomSheetBehavior C = BottomSheetBehavior.m78767C((View) parent);
                C69664n.m101060f(C, "from(lithoView.parent as View)");
                pVar4.setOnShowListener(new C134343n(pVar3, a, C));
                pVar4.show();
            }
        } else {
            C59052c cVar2 = (C59052c) C134345p.f365937a.mo56226d();
            cVar2.mo56379ah(new C59094n(40303));
            cVar2.mo56386p("No ElementTree to display. Skipping.");
        }
        C69794a aVar2 = C69874i.f186267a;
        C69822d dVar = C70101a.f186847o;
        return aVar2;
    }
}
