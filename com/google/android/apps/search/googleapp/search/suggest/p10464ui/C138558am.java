package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import android.content.Context;
import android.support.p033v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.search.googleapp.p10310h.C136135p;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139701a;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d;
import com.google.android.apps.search.googleapp.pixelsuggest.C136895e;
import com.google.android.apps.search.googleapp.search.C137451g;
import com.google.android.apps.search.googleapp.search.p10412h.p10414b.C137470a;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138078e;
import com.google.android.apps.search.googleapp.search.suggest.C138081f;
import com.google.android.apps.search.googleapp.search.suggest.C138132n;
import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.C137916ab;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.C137920af;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.C137929ao;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10444a.C137907b;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10446c.C137968a;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138057n;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138068y;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10465a.C138545a;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138649ba;
import com.google.android.apps.search.googleapp.search.suggest.sources.icing.C138509a;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139680b;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139684f;
import com.google.android.apps.search.lens.p10547a.C139916a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.cache.C46370ah;
import com.google.apps.tiktok.cache.C46401p;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.dataservice.p3638c.C46755l;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.aod;
import com.google.common.p4552o.apd;
import com.google.p395al.p417d.p418a.C8575bc;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62944bx;
import com.google.protobuf.C63033ey;
import com.google.protobuf.C63077o;
import com.google.protobuf.contrib.android.ProtoParsers;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.am */
/* compiled from: PG */
public final class C138558am {

    /* renamed from: a */
    public static final C58974d f376853a = C58974d.m91136j();

    /* renamed from: A */
    public final C138545a f376854A;

    /* renamed from: B */
    public final C46792di f376855B = new C46792di() {
        /* renamed from: d */
        private final void m225017d() {
            C138558am amVar = C138558am.this;
            if (amVar.f376877r && amVar.f376854A.mo114313b() == C139704d.PIXEL_LAUNCHER_ALL_APPS && C138558am.this.f376854A.mo114315d().isEmpty()) {
                C136895e eVar = C138558am.this.f376876q;
                Runnable runnable = eVar.f372596c;
                if (runnable != null) {
                    runnable.run();
                }
                eVar.f372596c = null;
            }
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C58970a) ((C58970a) ((C58970a) C138558am.f376853a.mo56225c()).mo56382g(th)).mo56372aa(41266)).mo56386p("Error loading suggestions");
            C138558am amVar = C138558am.this;
            amVar.mo114334l(Snackbar.m79661q((Context) null, amVar.mo114323a(), "Error loading suggestions", -2));
            if (C138558am.this.f376861b.isVisible()) {
                C138558am.this.f376869j.mo113759d();
                C138558am.this.f376870k.mo115170a();
            }
            C138558am.this.f376871l.mo115163a();
            m225017d();
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a4, code lost:
            if (r5.equals("shop") != false) goto L_0x00ee;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void mo18078b(java.lang.Object r10) {
            /*
                r9 = this;
                com.google.android.apps.search.googleapp.search.suggest.m r10 = (com.google.android.apps.search.googleapp.search.suggest.C138131m) r10
                int r0 = r10.f375816a
                r1 = 4
                r0 = r0 & r1
                if (r0 == 0) goto L_0x02ec
                com.google.android.apps.search.googleapp.search.suggest.ui.am r0 = com.google.android.apps.search.googleapp.search.suggest.p10464ui.C138558am.this
                com.google.apps.tiktok.dataservice.c.l r0 = r0.mo114327e()
                com.google.protobuf.cq r2 = r10.f375818c
                r0.mo50772a(r2)
                java.lang.String r0 = r10.f375817b
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x01eb
                com.google.protobuf.cq r0 = r10.f375818c
                int r0 = r0.size()
                if (r0 != 0) goto L_0x01eb
                com.google.android.apps.search.googleapp.search.suggest.ui.am r0 = com.google.android.apps.search.googleapp.search.suggest.p10464ui.C138558am.this
                com.google.android.apps.search.googleapp.search.suggest.ui.ag r2 = r0.f376862c
                boolean r2 = r2.f376846c
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x008c
                com.google.android.apps.search.googleapp.search.suggest.t r2 = r10.f375819d
                if (r2 != 0) goto L_0x0033
                com.google.android.apps.search.googleapp.search.suggest.t r2 = com.google.android.apps.search.googleapp.search.suggest.C138542t.f376811i
            L_0x0033:
                boolean r2 = r2.f376815c
                if (r2 == 0) goto L_0x008c
                com.google.android.apps.search.googleapp.search.suggest.ui.aa r1 = r0.f376861b
                android.support.v4.app.FragmentManager r1 = r1.getChildFragmentManager()
                android.support.v4.app.cc r1 = r1.f634a
                java.lang.String r2 = "incognitoSignpost"
                android.support.v4.app.Fragment r1 = r1.mo671c(r2)
                com.google.android.apps.search.googleapp.incognito.i.b r1 = (com.google.android.apps.search.googleapp.incognito.p10333i.C136347b) r1
                if (r1 != 0) goto L_0x0083
                com.google.apps.tiktok.account.AccountId r1 = r0.f376863d
                com.google.android.apps.search.googleapp.u.r r5 = com.google.android.apps.search.googleapp.p10527u.C139777r.f379893c
                com.google.protobuf.bn r5 = r5.createBuilder()
                com.google.android.apps.search.googleapp.u.q r5 = (com.google.android.apps.search.googleapp.p10527u.C139776q) r5
                com.google.android.apps.search.googleapp.u.t r6 = com.google.android.apps.search.googleapp.p10527u.C139779t.SEARCH
                r5.copyOnWrite()
                com.google.protobuf.bv r7 = r5.instance
                com.google.android.apps.search.googleapp.u.r r7 = (com.google.android.apps.search.googleapp.p10527u.C139777r) r7
                int r6 = r6.f379907i
                r7.f379896b = r6
                int r6 = r7.f379895a
                r6 = r6 | r3
                r7.f379895a = r6
                com.google.protobuf.bv r5 = r5.build()
                com.google.android.apps.search.googleapp.u.r r5 = (com.google.android.apps.search.googleapp.p10527u.C139777r) r5
                com.google.android.apps.search.googleapp.incognito.i.b r1 = com.google.android.apps.search.googleapp.incognito.p10333i.C136347b.m221524a(r1, r5)
                com.google.android.apps.search.googleapp.search.suggest.ui.aa r5 = r0.f376861b
                android.support.v4.app.FragmentManager r5 = r5.getChildFragmentManager()
                android.support.v4.app.a r6 = new android.support.v4.app.a
                r6.<init>((android.support.p031v4.app.FragmentManager) r5)
                r5 = 2131432021(0x7f0b1255, float:1.8485788E38)
                r6.mo511h(r5, r1, r2, r3)
                r6.mo509f()
            L_0x0083:
                android.widget.FrameLayout r1 = r0.mo114324b()
                r1.setVisibility(r4)
                goto L_0x01e2
            L_0x008c:
                android.widget.TextView r2 = r0.mo114325c()
                com.google.android.apps.search.googleapp.search.suggest.ui.a.a r5 = r0.f376854A
                java.lang.String r5 = r5.mo114314c()
                int r6 = r5.hashCode()
                switch(r6) {
                    case 0: goto L_0x00e3;
                    case 97610: goto L_0x00d9;
                    case 101486: goto L_0x00cf;
                    case 107868: goto L_0x00c5;
                    case 109514: goto L_0x00bb;
                    case 116753: goto L_0x00b1;
                    case 3241743: goto L_0x00a7;
                    case 3529462: goto L_0x009e;
                    default: goto L_0x009d;
                }
            L_0x009d:
                goto L_0x00ed
            L_0x009e:
                java.lang.String r3 = "shop"
                boolean r3 = r5.equals(r3)
                if (r3 == 0) goto L_0x00ed
                goto L_0x00ee
            L_0x00a7:
                java.lang.String r1 = "isch"
                boolean r1 = r5.equals(r1)
                if (r1 == 0) goto L_0x00ed
                r1 = 0
                goto L_0x00ee
            L_0x00b1:
                java.lang.String r1 = "vid"
                boolean r1 = r5.equals(r1)
                if (r1 == 0) goto L_0x00ed
                r1 = 3
                goto L_0x00ee
            L_0x00bb:
                java.lang.String r1 = "nws"
                boolean r1 = r5.equals(r1)
                if (r1 == 0) goto L_0x00ed
                r1 = 2
                goto L_0x00ee
            L_0x00c5:
                java.lang.String r1 = "map"
                boolean r1 = r5.equals(r1)
                if (r1 == 0) goto L_0x00ed
                r1 = 6
                goto L_0x00ee
            L_0x00cf:
                java.lang.String r1 = "flt"
                boolean r1 = r5.equals(r1)
                if (r1 == 0) goto L_0x00ed
                r1 = 7
                goto L_0x00ee
            L_0x00d9:
                java.lang.String r1 = "bks"
                boolean r1 = r5.equals(r1)
                if (r1 == 0) goto L_0x00ed
                r1 = 5
                goto L_0x00ee
            L_0x00e3:
                java.lang.String r1 = ""
                boolean r1 = r5.equals(r1)
                if (r1 == 0) goto L_0x00ed
                r1 = 1
                goto L_0x00ee
            L_0x00ed:
                r1 = -1
            L_0x00ee:
                r3 = 2131235087(0x7f08110f, float:1.8086358E38)
                switch(r1) {
                    case 0: goto L_0x0191;
                    case 1: goto L_0x0180;
                    case 2: goto L_0x016c;
                    case 3: goto L_0x0158;
                    case 4: goto L_0x0144;
                    case 5: goto L_0x0130;
                    case 6: goto L_0x011b;
                    case 7: goto L_0x0106;
                    default: goto L_0x00f4;
                }
            L_0x00f4:
                androidx.core.i.e r1 = new androidx.core.i.e
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5 = 2132087615(0x7f15133f, float:1.981549E38)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r1.<init>(r3, r5)
                goto L_0x01a4
            L_0x0106:
                androidx.core.i.e r1 = new androidx.core.i.e
                r3 = 2131234773(0x7f080fd5, float:1.8085721E38)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5 = 2132087499(0x7f1512cb, float:1.9815255E38)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r1.<init>(r3, r5)
                goto L_0x01a4
            L_0x011b:
                androidx.core.i.e r1 = new androidx.core.i.e
                r3 = 2131235002(0x7f0810ba, float:1.8086186E38)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5 = 2132087599(0x7f15132f, float:1.9815458E38)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r1.<init>(r3, r5)
                goto L_0x01a4
            L_0x0130:
                androidx.core.i.e r1 = new androidx.core.i.e
                r3 = 2131234614(0x7f080f36, float:1.8085399E38)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5 = 2132087256(0x7f1511d8, float:1.9814762E38)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r1.<init>(r3, r5)
                goto L_0x01a4
            L_0x0144:
                androidx.core.i.e r1 = new androidx.core.i.e
                r3 = 2131235131(0x7f08113b, float:1.8086447E38)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5 = 2132087733(0x7f1513b5, float:1.981573E38)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r1.<init>(r3, r5)
                goto L_0x01a4
            L_0x0158:
                androidx.core.i.e r1 = new androidx.core.i.e
                r3 = 2131234721(0x7f080fa1, float:1.8085616E38)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5 = 2132087832(0x7f151418, float:1.981593E38)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r1.<init>(r3, r5)
                goto L_0x01a4
            L_0x016c:
                androidx.core.i.e r1 = new androidx.core.i.e
                r3 = 2131234949(0x7f081085, float:1.8086078E38)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5 = 2132087614(0x7f15133e, float:1.9815488E38)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r1.<init>(r3, r5)
                goto L_0x01a4
            L_0x0180:
                androidx.core.i.e r1 = new androidx.core.i.e
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5 = 2132087884(0x7f15144c, float:1.9816036E38)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r1.<init>(r3, r5)
                goto L_0x01a4
            L_0x0191:
                androidx.core.i.e r1 = new androidx.core.i.e
                r3 = 2131234822(0x7f081006, float:1.808582E38)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5 = 2132087513(0x7f1512d9, float:1.9815283E38)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r1.<init>(r3, r5)
            L_0x01a4:
                com.google.android.apps.search.googleapp.search.suggest.ui.aa r3 = r0.f376861b
                android.content.Context r3 = r3.getContext()
                android.content.res.Resources r3 = r3.getResources()
                r5 = 2131168763(0x7f070dfb, float:1.7951837E38)
                int r3 = r3.getDimensionPixelSize(r5)
                com.google.android.apps.search.googleapp.search.suggest.ui.aa r5 = r0.f376861b
                android.content.Context r5 = r5.getContext()
                java.lang.Object r6 = r1.f5888a
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                android.graphics.drawable.Drawable r5 = r5.getDrawable(r6)
                if (r5 == 0) goto L_0x01d0
                r5.setBounds(r4, r4, r3, r3)
                r3 = 0
                r2.setCompoundDrawables(r3, r5, r3, r3)
            L_0x01d0:
                java.lang.Object r1 = r1.f5889b
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                r2.setText(r1)
                android.widget.TextView r1 = r0.mo114325c()
                r1.setVisibility(r4)
            L_0x01e2:
                android.support.v7.widget.RecyclerView r0 = r0.mo114323a()
                r1 = 8
                r0.setVisibility(r1)
            L_0x01eb:
                com.google.android.apps.search.googleapp.search.suggest.ui.am r0 = com.google.android.apps.search.googleapp.search.suggest.p10464ui.C138558am.this
                com.google.android.apps.search.googleapp.search.g r0 = r0.f376859F
                if (r0 == 0) goto L_0x0215
                com.google.android.apps.search.googleapp.search.suggest.t r0 = r10.f375819d
                if (r0 != 0) goto L_0x01f7
                com.google.android.apps.search.googleapp.search.suggest.t r0 = com.google.android.apps.search.googleapp.search.suggest.C138542t.f376811i
            L_0x01f7:
                int r0 = r0.f376813a
                r0 = r0 & 64
                if (r0 == 0) goto L_0x0215
                com.google.android.apps.search.googleapp.search.suggest.ui.am r0 = com.google.android.apps.search.googleapp.search.suggest.p10464ui.C138558am.this
                com.google.android.apps.search.googleapp.search.g r0 = r0.f376859F
                r0.getClass()
                com.google.android.apps.search.googleapp.search.suggest.t r1 = r10.f375819d
                if (r1 != 0) goto L_0x020a
                com.google.android.apps.search.googleapp.search.suggest.t r1 = com.google.android.apps.search.googleapp.search.suggest.C138542t.f376811i
            L_0x020a:
                java.lang.String r1 = r1.f376820h
                com.google.android.apps.search.googleapp.search.suggest.i r2 = com.google.android.apps.search.googleapp.search.suggest.C138127i.f375805b
                com.google.android.apps.search.googleapp.search.srp.e.au r3 = com.google.android.apps.search.googleapp.search.srp.p10435e.C137770au.PSYCHIC
                com.google.android.apps.search.googleapp.search.n r0 = r0.f373851a
                r0.mo113824y(r1, r2, r3)
            L_0x0215:
                com.google.android.apps.search.googleapp.search.suggest.ui.am r0 = com.google.android.apps.search.googleapp.search.suggest.p10464ui.C138558am.this
                com.google.android.apps.search.googleapp.search.suggest.b.y r0 = r0.f376868i
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                com.google.protobuf.cq r1 = r10.f375818c
                java.util.Iterator r1 = r1.iterator()
            L_0x0224:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x026a
                java.lang.Object r3 = r1.next()
                com.google.android.apps.search.googleapp.search.suggest.ag r3 = (com.google.android.apps.search.googleapp.search.suggest.C138015ag) r3
                int r4 = r3.f375482b
                com.google.android.apps.search.googleapp.search.suggest.af r4 = com.google.android.apps.search.googleapp.search.suggest.C138014af.m224326a(r4)
                if (r4 != 0) goto L_0x023a
                com.google.android.apps.search.googleapp.search.suggest.af r4 = com.google.android.apps.search.googleapp.search.suggest.C138014af.UNKNOWN
            L_0x023a:
                com.google.android.apps.search.googleapp.search.suggest.af r5 = com.google.android.apps.search.googleapp.search.suggest.C138014af.HEADER
                if (r4 == r5) goto L_0x0224
                int r4 = r3.f375482b
                com.google.android.apps.search.googleapp.search.suggest.af r5 = com.google.android.apps.search.googleapp.search.suggest.C138014af.m224326a(r4)
                if (r5 != 0) goto L_0x0248
                com.google.android.apps.search.googleapp.search.suggest.af r5 = com.google.android.apps.search.googleapp.search.suggest.C138014af.UNKNOWN
            L_0x0248:
                com.google.android.apps.search.googleapp.search.suggest.af r6 = com.google.android.apps.search.googleapp.search.suggest.C138014af.MANAGE_ACTIVITY
                if (r5 == r6) goto L_0x0224
                com.google.android.apps.search.googleapp.search.suggest.af r5 = com.google.android.apps.search.googleapp.search.suggest.C138014af.m224326a(r4)
                if (r5 != 0) goto L_0x0254
                com.google.android.apps.search.googleapp.search.suggest.af r5 = com.google.android.apps.search.googleapp.search.suggest.C138014af.UNKNOWN
            L_0x0254:
                com.google.android.apps.search.googleapp.search.suggest.af r6 = com.google.android.apps.search.googleapp.search.suggest.C138014af.DIVIDER
                if (r5 == r6) goto L_0x0224
                com.google.android.apps.search.googleapp.search.suggest.af r4 = com.google.android.apps.search.googleapp.search.suggest.C138014af.m224326a(r4)
                if (r4 != 0) goto L_0x0260
                com.google.android.apps.search.googleapp.search.suggest.af r4 = com.google.android.apps.search.googleapp.search.suggest.C138014af.UNKNOWN
            L_0x0260:
                com.google.android.apps.search.googleapp.search.suggest.af r5 = com.google.android.apps.search.googleapp.search.suggest.C138014af.UNKNOWN
                if (r4 == r5) goto L_0x0224
                com.google.protobuf.cq r3 = r3.f375483c
                r2.addAll(r3)
                goto L_0x0224
            L_0x026a:
                com.google.android.libraries.f.a r1 = r0.f375645a
                long r3 = r1.mo26871c()
                com.google.android.apps.search.googleapp.search.suggest.o r1 = r10.f375820e
                if (r1 != 0) goto L_0x0276
                com.google.android.apps.search.googleapp.search.suggest.o r1 = com.google.android.apps.search.googleapp.search.suggest.C138133o.f375822o
            L_0x0276:
                long r5 = r1.f375829f
                com.google.android.apps.search.googleapp.search.suggest.t r1 = r10.f375819d
                if (r1 != 0) goto L_0x027e
                com.google.android.apps.search.googleapp.search.suggest.t r1 = com.google.android.apps.search.googleapp.search.suggest.C138542t.f376811i
            L_0x027e:
                r7 = r1
                java.lang.String r10 = r10.f375817b
                boolean r8 = r10.isEmpty()
                r1 = r0
                r1.mo114116f(r2, r3, r5, r7, r8)
                boolean r10 = r0.f375649e
                if (r10 != 0) goto L_0x0291
                boolean r10 = r0.f375650f
                if (r10 == 0) goto L_0x02a1
            L_0x0291:
                j$.util.Optional r10 = r0.f375651g
                boolean r10 = r10.isPresent()
                if (r10 == 0) goto L_0x02a1
                j$.util.Optional r10 = r0.f375651g
                java.lang.Object r10 = r10.get()
                com.google.android.apps.search.googleapp.search.suggest.b.q r10 = (com.google.android.apps.search.googleapp.search.suggest.p10449b.C138060q) r10
            L_0x02a1:
                com.google.android.apps.search.googleapp.search.suggest.ui.am r10 = com.google.android.apps.search.googleapp.search.suggest.p10464ui.C138558am.this
                com.google.android.apps.search.googleapp.search.suggest.b.n r10 = r10.f376873n
                com.google.android.apps.search.googleapp.search.suggest.b.o r0 = r10.f375630a
                com.google.android.libraries.f.a r10 = r10.f375631b
                long r1 = r10.mo26872d()
                j$.time.Duration r10 = p3186j$.time.Duration.ofNanos(r1)
                java.lang.String r1 = "AGA"
                r0.mo114109g(r10, r1)
                com.google.android.apps.search.googleapp.search.suggest.ui.am r10 = com.google.android.apps.search.googleapp.search.suggest.p10464ui.C138558am.this
                com.google.android.apps.search.googleapp.search.suggest.ui.aa r10 = r10.f376861b
                boolean r10 = r10.isVisible()
                if (r10 == 0) goto L_0x02ce
                com.google.android.apps.search.googleapp.search.suggest.ui.am r10 = com.google.android.apps.search.googleapp.search.suggest.p10464ui.C138558am.this
                com.google.android.apps.search.googleapp.search.h.b.a r10 = r10.f376869j
                r10.mo113759d()
                com.google.android.apps.search.googleapp.search.suggest.ui.am r10 = com.google.android.apps.search.googleapp.search.suggest.p10464ui.C138558am.this
                com.google.android.apps.search.googleapp.t.e.a r10 = r10.f376870k
                r10.mo115170a()
            L_0x02ce:
                com.google.android.apps.search.googleapp.search.suggest.ui.am r10 = com.google.android.apps.search.googleapp.search.suggest.p10464ui.C138558am.this
                com.google.android.apps.search.googleapp.search.suggest.ui.aa r10 = r10.f376861b
                android.view.View r10 = r10.requireView()
                com.google.android.apps.search.googleapp.search.suggest.ui.am r0 = com.google.android.apps.search.googleapp.search.suggest.p10464ui.C138558am.this
                com.google.android.apps.search.googleapp.startup.appinteractive.b r0 = r0.f376871l
                p3186j$.util.Objects.requireNonNull(r0)
                com.google.android.apps.search.googleapp.search.suggest.ui.al r1 = new com.google.android.apps.search.googleapp.search.suggest.ui.al
                r1.<init>(r0)
                java.lang.Runnable r0 = com.google.apps.tiktok.tracing.C47810es.m84977q(r1)
                r10.post(r0)
                r9.m225017d()
            L_0x02ec:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.p10464ui.C138558am.C1385591.mo18078b(java.lang.Object):void");
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: C */
    public final C46440f f376856C = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            ((C58970a) ((C58970a) ((C58970a) C138558am.f376853a.mo56226d()).mo56382g(th)).mo56372aa(41268)).mo56386p("#onSuggestionDeletion attempt failed");
            C138558am.this.f376854A.mo114316e((ProtoParsers.ParcelableProto) obj);
            C138558am amVar = C138558am.this;
            amVar.mo114334l(Snackbar.m79660p(amVar.mo114323a(), R.string.ga_suggestion_history_deletion_failed_message, -1));
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj2;
            C138558am.this.f376854A.mo114316e((ProtoParsers.ParcelableProto) obj);
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: D */
    public final C46440f f376857D = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C58970a) ((C58970a) ((C58970a) C138558am.f376853a.mo56226d()).mo56382g(th)).mo56372aa(41270)).mo56386p("Failed to fetch location notification to show.");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Snackbar snackbar;
            Void voidR = (Void) obj;
            C138081f fVar = (C138081f) ((ProtoParsers.ParcelableProto) obj2).mo58938a(C138081f.f375684c, C138558am.this.f376879t.mo58829b());
            if (!C138558am.this.f376854A.mo114319h()) {
                C138078e a = C138078e.m224410a(fVar.f375687b);
                if (a == null) {
                    a = C138078e.NONE;
                }
                if (a != C138078e.NONE) {
                    C138558am amVar = C138558am.this;
                    C138078e a2 = C138078e.m224410a(fVar.f375687b);
                    if (a2 == null) {
                        a2 = C138078e.NONE;
                    }
                    if (a2 == C138078e.AADC_SETTINGS_CHANGED) {
                        snackbar = Snackbar.m79660p(amVar.f376861b.requireView(), R.string.googleapp_aadc_location_permission_notification, 0);
                        snackbar.mo48353t(R.string.googleapp_aadc_location_permission_settings_button, new C138562an(amVar));
                    } else {
                        snackbar = Snackbar.m79660p(amVar.f376861b.requireView(), R.string.googleapp_location_permission_toast, 0);
                    }
                    ((TextView) snackbar.f117089j.findViewById(R.id.snackbar_text)).setMaxLines(10);
                    amVar.mo114334l(snackbar);
                    C138558am.this.f376878s.mo114062b(fVar);
                }
                C138558am.this.f376854A.f376826e.mo50381d(C62912at.f169862a, C63077o.m96099a(true));
            }
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: E */
    public final C38553h f376858E;

    /* renamed from: F */
    public C137451g f376859F;

    /* renamed from: G */
    private final C21370a f376860G;

    /* renamed from: b */
    public final C138546aa f376861b;

    /* renamed from: c */
    public final C138552ag f376862c;

    /* renamed from: d */
    public final AccountId f376863d;

    /* renamed from: e */
    public final C137916ab f376864e;

    /* renamed from: f */
    public final C46439e f376865f;

    /* renamed from: g */
    public final C46801dp f376866g;

    /* renamed from: h */
    public final C138649ba f376867h;

    /* renamed from: i */
    public final C138068y f376868i;

    /* renamed from: j */
    public final C137470a f376869j;

    /* renamed from: k */
    public final C139701a f376870k;

    /* renamed from: l */
    public final C139680b f376871l;

    /* renamed from: m */
    public final C139684f f376872m;

    /* renamed from: n */
    public final C138057n f376873n;

    /* renamed from: o */
    public final C28306ab f376874o;

    /* renamed from: p */
    public final C28443m f376875p;

    /* renamed from: q */
    public final C136895e f376876q;

    /* renamed from: r */
    public final boolean f376877r;

    /* renamed from: s */
    public final C137968a f376878s;

    /* renamed from: t */
    public final C62921ba f376879t;

    /* renamed from: u */
    public final C137907b f376880u;

    /* renamed from: v */
    public final C46778cv f376881v;

    /* renamed from: w */
    public final C138509a f376882w;

    /* renamed from: x */
    public final C139916a f376883x;

    /* renamed from: y */
    public final boolean f376884y;

    /* renamed from: z */
    public final boolean f376885z;

    public C138558am(C138546aa aaVar, C138552ag agVar, C21370a aVar, AccountId accountId, C137916ab abVar, C46439e eVar, C46801dp dpVar, C138649ba baVar, C138068y yVar, C137470a aVar2, C139701a aVar3, C138509a aVar4, C139680b bVar, C139684f fVar, C138057n nVar, C28306ab abVar2, C28443m mVar, C136895e eVar2, boolean z, C137968a aVar5, C62921ba baVar2, C137907b bVar2, C46778cv cvVar, C38553h hVar, C139916a aVar6, boolean z2, boolean z3, C138545a aVar7) {
        this.f376861b = aaVar;
        this.f376862c = agVar;
        this.f376860G = aVar;
        this.f376863d = accountId;
        this.f376864e = abVar;
        this.f376865f = eVar;
        this.f376866g = dpVar;
        this.f376867h = baVar;
        this.f376868i = yVar;
        this.f376869j = aVar2;
        this.f376870k = aVar3;
        this.f376882w = aVar4;
        this.f376871l = bVar;
        this.f376872m = fVar;
        this.f376873n = nVar;
        this.f376874o = abVar2;
        this.f376875p = mVar;
        this.f376876q = eVar2;
        this.f376877r = z;
        this.f376878s = aVar5;
        this.f376879t = baVar2;
        this.f376880u = bVar2;
        this.f376881v = cvVar;
        this.f376858E = hVar;
        this.f376883x = aVar6;
        this.f376884y = z2;
        this.f376885z = z3;
        this.f376854A = aVar7;
    }

    /* renamed from: a */
    public final RecyclerView mo114323a() {
        View view = this.f376861b.getView();
        view.getClass();
        return (RecyclerView) view.findViewById(R.id.googleapp_suggestions);
    }

    /* renamed from: b */
    public final FrameLayout mo114324b() {
        View view = this.f376861b.getView();
        view.getClass();
        return (FrameLayout) view.findViewById(R.id.googleapp_suggestions_incognito_signpost_container);
    }

    /* renamed from: c */
    public final TextView mo114325c() {
        View view = this.f376861b.getView();
        view.getClass();
        return (TextView) view.findViewById(R.id.googleapp_zero_prefix_landing_page);
    }

    /* renamed from: d */
    public final C138611m mo114326d() {
        return ((C138575b) this.f376861b.getChildFragmentManager().f634a.mo671c("searchBox")).mo17754z();
    }

    /* renamed from: e */
    public final C46755l mo114327e() {
        C46755l lVar = (C46755l) mo114323a().mAdapter;
        lVar.getClass();
        return lVar;
    }

    /* renamed from: f */
    public final void mo114328f() {
        mo114334l(Snackbar.m79661q((Context) null, mo114323a(), "Error opening the app", 0));
    }

    /* renamed from: g */
    public final void mo114329g() {
        mo114324b().setVisibility(8);
        mo114325c().setVisibility(8);
        mo114323a().setVisibility(0);
    }

    /* renamed from: h */
    public final void mo114330h(C138030av avVar, apd apd) {
        this.f376875p.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(mo114323a()));
        this.f376864e.mo114047c(this.f376868i.mo114115d(Optional.m71637of(avVar)), aod.CLICKED_SUGGESTION);
        C138057n nVar = this.f376873n;
        nVar.f375630a.mo114111i(apd, Duration.ofNanos(nVar.f375631b.mo26872d()), "AGA");
    }

    /* renamed from: i */
    public final void mo114331i(C139704d dVar, boolean z) {
        C138545a aVar = this.f376854A;
        C69664n.m101061g(dVar, "entryPoint");
        C46401p pVar = aVar.f376822a;
        C62912at atVar = C62912at.f169862a;
        C138549ad adVar = (C138549ad) C138550ae.f376838c.createBuilder();
        adVar.copyOnWrite();
        C138550ae aeVar = (C138550ae) adVar.instance;
        aeVar.f376841b = dVar.f379715p;
        aeVar.f376840a |= 1;
        pVar.mo50381d(atVar, adVar.build());
        this.f376868i.mo114120j(dVar);
        if (z) {
            C138611m d = mo114326d();
            C69664n.m101061g(dVar, "entryPoint");
            d.mo114403e(dVar);
            d.mo114408j(d.mo114401b());
        }
    }

    /* renamed from: j */
    public final void mo114332j(String str, boolean z) {
        mo114327e().mo50772a(C58485gu.m89845m());
        this.f376868i.mo114117g();
        C138057n nVar = this.f376873n;
        nVar.f375630a.mo114112j(Duration.ofNanos(nVar.f375631b.mo26872d()), "AGA");
        if (TextUtils.equals(str, this.f376854A.mo114315d())) {
            mo114335m(str, str.length());
        }
        mo114326d().mo114404f(str);
        mo114326d().mo114406h();
        if (z) {
            mo114326d().mo114401b().selectAll();
        }
    }

    /* renamed from: k */
    public final void mo114333k(int i) {
        if (this.f376861b.getActivity() != null) {
            Window window = this.f376861b.requireActivity().getWindow();
            if (i != window.getAttributes().softInputMode) {
                window.setSoftInputMode(i);
            }
        }
    }

    /* renamed from: l */
    public final void mo114334l(Snackbar snackbar) {
        mo114333k(16);
        snackbar.mo48348m(new C138563ao(this));
        snackbar.mo48343h();
    }

    /* renamed from: m */
    public final void mo114335m(String str, int i) {
        if (this.f376861b.getView() != null) {
            mo114329g();
        }
        C138545a aVar = this.f376854A;
        C69664n.m101061g(str, "query");
        aVar.f376823b.mo50381d(C62912at.f169862a, C63033ey.m95859a(str));
        this.f376854A.f376824c.mo50381d(C62912at.f169862a, C62944bx.m95448a(i));
        boolean z = false;
        if (TextUtils.isEmpty(str) && this.f376868i.mo114121l()) {
            z = true;
        }
        String d = this.f376854A.mo114315d();
        C138132n nVar = (C138132n) C138133o.f375822o.createBuilder();
        int i2 = this.f376868i.f375652h;
        nVar.copyOnWrite();
        C138133o oVar = (C138133o) nVar.instance;
        oVar.f375824a |= 2;
        oVar.f375826c = i2;
        long c = this.f376860G.mo26871c();
        nVar.copyOnWrite();
        C138133o oVar2 = (C138133o) nVar.instance;
        oVar2.f375824a |= 16;
        oVar2.f375829f = c;
        C139704d b = this.f376854A.mo114313b();
        nVar.copyOnWrite();
        C138133o oVar3 = (C138133o) nVar.instance;
        oVar3.f375830g = b.f379715p;
        oVar3.f375824a |= 32;
        boolean z2 = this.f376862c.f376846c;
        nVar.copyOnWrite();
        C138133o oVar4 = (C138133o) nVar.instance;
        oVar4.f375824a |= 256;
        oVar4.f375833j = z2;
        C138552ag agVar = this.f376862c;
        C139704d a = C139704d.m227141a(agVar.f376845b);
        if (a == null) {
            a = C139704d.UNKNOWN;
        }
        if (a != C139704d.GOOGLE_APP_BROWSER || (agVar.f376844a & 8) == 0 || !d.equals(agVar.f376848e)) {
            nVar.copyOnWrite();
            C138133o oVar5 = (C138133o) nVar.instance;
            oVar5.f375824a |= 1;
            oVar5.f375825b = d;
            int a2 = this.f376854A.mo114312a();
            nVar.copyOnWrite();
            C138133o oVar6 = (C138133o) nVar.instance;
            oVar6.f375824a |= 8;
            oVar6.f375828e = a2;
        }
        if (!this.f376854A.mo114314c().isEmpty()) {
            String c2 = this.f376854A.mo114314c();
            nVar.copyOnWrite();
            C138133o oVar7 = (C138133o) nVar.instance;
            oVar7.f375824a |= 128;
            oVar7.f375832i = c2;
        }
        if (z) {
            nVar.copyOnWrite();
            C138133o oVar8 = (C138133o) nVar.instance;
            oVar8.f375824a |= 4;
            oVar8.f375827d = true;
        }
        if (this.f376854A.mo114313b() == C139704d.SEARCH_RESULTS && this.f376868i.f375654j.isZero()) {
            nVar.copyOnWrite();
            C138133o oVar9 = (C138133o) nVar.instance;
            oVar9.f375824a |= 4096;
            oVar9.f375837n = true;
        }
        C46370ah a3 = this.f376854A.f376825d.mo50378a(C62912at.f169862a);
        C8575bc bcVar = a3 != null ? (C8575bc) a3.f121384a : null;
        if (bcVar != null) {
            nVar.copyOnWrite();
            C138133o oVar10 = (C138133o) nVar.instance;
            oVar10.f375831h = bcVar;
            oVar10.f375824a |= 64;
            this.f376854A.f376825d.mo50380c();
        }
        if (TextUtils.isEmpty(d)) {
            C138552ag agVar2 = this.f376862c;
            if ((agVar2.f376844a & 4) != 0) {
                C136135p pVar = agVar2.f376847d;
                if (pVar == null) {
                    pVar = C136135p.f370764b;
                }
                nVar.copyOnWrite();
                C138133o oVar11 = (C138133o) nVar.instance;
                pVar.getClass();
                oVar11.f375834k = pVar;
                oVar11.f375824a |= 512;
            }
        }
        C138133o oVar12 = (C138133o) nVar.build();
        C46801dp dpVar = this.f376866g;
        C137916ab abVar = this.f376864e;
        String str2 = oVar12.f375825b;
        C137929ao aoVar = (C137929ao) abVar;
        dpVar.mo50707a(new C46719bc(aoVar.f375259a, new C137920af(aoVar, oVar12), "suggestions"), this.f376855B);
    }
}
