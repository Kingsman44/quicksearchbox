package com.google.android.apps.search.googleapp.discover.p10195j.p10196a;

import android.content.Context;
import android.support.p033v7.app.C0358as;
import android.support.p033v7.app.C0401v;
import com.facebook.litho.LithoView;
import com.google.android.apps.search.googleapp.discover.p10166a.C133939b;
import com.google.android.apps.search.googleapp.discover.p10189g.C134344o;
import com.google.android.apps.search.googleapp.discover.p10189g.C134345p;
import com.google.android.apps.search.googleapp.discover.p10214s.C134589g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40081u;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40027ah;
import com.google.android.libraries.search.rendering.xuikit.p3131d.C40306b;
import com.google.apps.tiktok.tracing.C47585ci;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57082ax;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a.C64202ax;
import com.google.protos.youtube.elements.C66059au;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.p5494b.C69802a;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.a.ax */
/* compiled from: PG */
public final class C134393ax implements C21312s {

    /* renamed from: a */
    private static final C59071e f366099a = C59071e.m91332i("com.google.android.apps.search.googleapp.discover.j.a.ax");

    /* renamed from: b */
    private final C133939b f366100b;

    public C134393ax(C133939b bVar) {
        this.f366100b = bVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C64202ax.f173593c;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        Object obj2;
        C57696b bVar;
        C64202ax axVar = (C64202ax) obj;
        C21248ar e = rVar.mo26735e();
        if (!(e instanceof C40081u)) {
            ((C59052c) ((C59052c) f366099a.mo56226d()).mo56372aa(40336)).mo56386p("Creating a VE logger that did not use an XUiKitElementBuilder. This will break VE logging");
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
        C133939b bVar2 = this.f366100b;
        C57082ax axVar2 = axVar.f173595a;
        if (axVar2 == null) {
            axVar2 = C57082ax.f152383e;
        }
        C40027ah ahVar = uVar.f105299b;
        C69664n.m101061g(axVar2, "showDialogData");
        C69664n.m101061g(gVar, "clientContext");
        C134345p pVar = bVar2.f364795d;
        C69664n.m101061g(axVar2, "showDialogData");
        C69664n.m101061g(gVar, "parentClientContext");
        C57784p pVar2 = axVar2.f152386b;
        if (pVar2 == null) {
            pVar2 = C57784p.f154382f;
        }
        int i = 1;
        if ((pVar2.f154384a & 1) != 0) {
            Context context = pVar.f365938b.getContext();
            if (context == null) {
                C59052c cVar = (C59052c) C134345p.f365937a.mo56226d();
                cVar.mo56379ah(new C59094n(40305));
                cVar.mo56386p("No Context. Skipping.");
            } else {
                pVar.mo111749c();
                C69802a aVar = new C69802a();
                C57784p pVar3 = axVar2.f152386b;
                if (pVar3 == null) {
                    pVar3 = C57784p.f154382f;
                }
                C57784p pVar4 = pVar3;
                C69664n.m101060f(pVar4, "showDialogData.elementsOutput");
                LithoView a = pVar.mo111747a(context, pVar4, ahVar, gVar, aVar);
                if ((axVar2.f152385a & 2) != 0) {
                    bVar = axVar2.f152387c;
                    if (bVar == null) {
                        bVar = C57696b.f154137l;
                    }
                } else {
                    bVar = null;
                }
                int i2 = context.getResources().getConfiguration().uiMode & 48;
                C0358as asVar = new C0358as(context, true != axVar2.f152388d ? R.style.OverlayDialog : R.style.OverlayDialogTransparent);
                C0401v b2 = asVar.mo1197b();
                if (i2 == 32) {
                    i = 2;
                }
                b2.mo1191s(i);
                asVar.mo1197b().mo1189q(a);
                asVar.setOnDismissListener(new C47585ci(pVar.f365940d, "Clicked to dismiss Dialog", new C134344o(a, aVar, bVar, ahVar)));
                asVar.show();
                pVar.f365945i = asVar;
            }
        } else {
            C59052c cVar2 = (C59052c) C134345p.f365937a.mo56226d();
            cVar2.mo56379ah(new C59094n(40306));
            cVar2.mo56386p("No ElementTree to display. Skipping.");
        }
        C69794a aVar2 = C69874i.f186267a;
        C69822d dVar = C70101a.f186847o;
        return aVar2;
    }
}
