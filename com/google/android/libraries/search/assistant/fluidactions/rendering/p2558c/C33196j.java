package com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c;

import android.app.KeyguardManager;
import android.support.p031v4.app.Fragment;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.binaries.satin.app.C74164mw;
import com.google.android.apps.gsa.binaries.satin.app.C74165mx;
import com.google.android.apps.gsa.binaries.satin.app.C74166my;
import com.google.android.apps.gsa.binaries.satin.app.ni;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.C16943f;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32953f;
import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32972e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33177b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33181f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33183h;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33184i;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2557b.C33186b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33212a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33216e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33218g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33221j;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33222k;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.assistant.p3897e.p3921j.p3926e.C51950fc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import dagger.p5294a.C68221g;
import java.util.List;
import java.util.Map;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.c.j */
/* compiled from: PG */
public final class C33196j implements C33181f {
    @Deprecated

    /* renamed from: h */
    private static final String[] f88783h = {"ui.SHOW_NATIVE_FORM", "ui.SHOW_INTENT_PLATE"};

    /* renamed from: a */
    public final C33183h f88784a;

    /* renamed from: b */
    public final C33212a f88785b;

    /* renamed from: c */
    public final ContextThemeWrapper f88786c;

    /* renamed from: d */
    public C33218g f88787d;

    /* renamed from: e */
    public final int f88788e;

    /* renamed from: f */
    public C33184i f88789f;

    /* renamed from: g */
    public final C33190d f88790g;

    /* renamed from: i */
    private final C33193g f88791i;

    /* renamed from: j */
    private final C33216e f88792j;

    /* renamed from: k */
    private final C47274n f88793k;

    /* renamed from: l */
    private final Map f88794l;

    /* renamed from: m */
    private final Map f88795m;

    /* renamed from: n */
    private final C16943f f88796n;

    /* renamed from: o */
    private final C32953f f88797o;

    /* renamed from: p */
    private final C32951d f88798p;

    /* renamed from: q */
    private final C74164mw f88799q;

    /* renamed from: r */
    private final C74165mx f88800r;

    public C33196j(C33193g gVar, C33216e eVar, C47274n nVar, Map map, Map map2, C74164mw mwVar, C74165mx mxVar, C33183h hVar, C16943f fVar, C33212a aVar, C74166my myVar) {
        C33190d dVar;
        C69664n.m101061g(mwVar, "formRendererFactory");
        C69664n.m101061g(mxVar, "intentPlateFormRendererFactory");
        C69664n.m101061g(hVar, "subscriptionController");
        C69664n.m101061g(fVar, "assistantMediaPlayerManager");
        C69664n.m101061g(aVar, "argumentCache");
        C69664n.m101061g(myVar, "activityResultControllerFactory");
        this.f88791i = gVar;
        this.f88792j = eVar;
        this.f88793k = nVar;
        this.f88794l = map;
        this.f88795m = map2;
        this.f88799q = mwVar;
        this.f88800r = mxVar;
        this.f88784a = hVar;
        this.f88796n = fVar;
        this.f88785b = aVar;
        this.f88786c = new ContextThemeWrapper(nVar, 2132149049);
        int i = eVar.f88829b;
        this.f88788e = i;
        C33184i iVar = (C33184i) aVar.f88819d.remove(Integer.valueOf(i));
        this.f88789f = iVar == null ? new C33184i(C51950fc.FORM_UI_THEME_DEFAULT) : iVar;
        C32953f fVar2 = (C32953f) aVar.f88818c.remove(Integer.valueOf(i));
        this.f88797o = fVar2;
        this.f88798p = (C32951d) aVar.f88817b.remove(Integer.valueOf(i));
        if (fVar2 != null) {
            ni niVar = myVar.f206640a;
            dVar = new C33190d((Fragment) ((C68221g) niVar.c.f206889e).f184583a, (KeyguardManager) niVar.a.eN.mo17428b(), fVar2);
        } else {
            dVar = null;
        }
        this.f88790g = dVar;
    }

    /* renamed from: d */
    private final void m61567d(C33222k kVar) {
        if (kVar.mo38598b() == C33221j.SUCCESSFUL) {
            C33218g a = kVar.mo38597a();
            if (a != null && this.f88787d != a) {
                C59052c cVar = (C59052c) C33197k.f88801a.mo56224b();
                cVar.mo56379ah(new C59094n(50947));
                cVar.mo56386p("formViewDataChanged: Releasing previous views and resources");
                C33218g gVar = this.f88787d;
                if (gVar != null) {
                    mo38589c(gVar);
                }
                this.f88787d = a;
                C33193g gVar2 = this.f88791i;
                if (gVar2.getView() != null) {
                    View view = gVar2.getView();
                    C69664n.m101059e(view, "null cannot be cast to non-null type android.widget.FrameLayout");
                    FrameLayout frameLayout = (FrameLayout) view;
                    frameLayout.removeAllViews();
                    frameLayout.addView(a.f88833a);
                    return;
                }
                C59052c cVar2 = (C59052c) C33197k.f88801a.mo56226d();
                cVar2.mo56379ah(new C59094n(50948));
                cVar2.mo56386p("renderClientOp failed because form view is not initialized");
                return;
            }
            return;
        }
        C59052c cVar3 = (C59052c) C33197k.f88801a.mo56226d();
        C33221j b = kVar.mo38598b();
        cVar3.mo56379ah(new C59094n(50946));
        cVar3.mo56389s("FluidActions failed to render form, status: %s", b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0430  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0562  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x064c  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x07f6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x02a2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38574a(com.google.assistant.p3897e.p3921j.C51809dy r38) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            java.lang.String r2 = "clientOp"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r2)
            com.google.android.libraries.search.assistant.fluidactions.b.f r2 = r0.f88797o
            if (r2 == 0) goto L_0x082d
            com.google.android.libraries.search.assistant.fluidactions.b.d r2 = r0.f88798p
            if (r2 == 0) goto L_0x082d
            com.google.android.libraries.search.assistant.fluidactions.rendering.c.d r2 = r0.f88790g
            if (r2 != 0) goto L_0x0017
            goto L_0x082d
        L_0x0017:
            java.lang.String[] r2 = f88783h
            java.lang.String r4 = r1.f135936b
            java.lang.String r5 = "clientOp.clientOpName"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            boolean r2 = p5462h.p5463a.C69531o.m100940q(r2, r4)
            if (r2 != 0) goto L_0x0041
            com.google.common.f.e r2 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33197k.f88801a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            java.lang.String r1 = r1.f135936b
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 50952(0xc708, float:7.1399E-41)
            r3.<init>(r4)
            r2.mo56379ah(r3)
            java.lang.String r3 = "ClientOp cannot be handled by FluidActionsRenderer, clientOp = %s"
            r2.mo56389s(r3, r1)
            return
        L_0x0041:
            com.google.assistant.e.j.e.ff r2 = com.google.assistant.p3897e.p3921j.p3926e.C51953ff.f136315l
            com.google.protobuf.eb r2 = r2.getParserForType()
            j$.util.Optional r2 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33234l.m61649g(r1, r2)
            java.lang.String r4 = "getClientOpArg(clientOp,…OW_NATIVE_FORM_ARGS_NAME)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            boolean r4 = r2.isPresent()
            if (r4 != 0) goto L_0x006f
            com.google.common.f.e r1 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33197k.f88801a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.n r2 = new com.google.common.f.n
            r3 = 50951(0xc707, float:7.1398E-41)
            r2.<init>(r3)
            r1.mo56379ah(r2)
            java.lang.String r2 = "ClientOp does not contain the required ShowNativeFormArgs"
            r1.mo56386p(r2)
            return
        L_0x006f:
            java.lang.Object r2 = r2.get()
            java.lang.String r4 = "showNativeFormArgsOptional.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.assistant.e.j.e.ff r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r2
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.i r4 = r0.f88789f
            int r5 = r2.f136324h
            com.google.assistant.e.j.e.fc r5 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.m86447a(r5)
            if (r5 != 0) goto L_0x0086
            com.google.assistant.e.j.e.fc r5 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.FORM_UI_THEME_DEFAULT
        L_0x0086:
            java.lang.String r6 = "showNativeFormArgs.formUiTheme"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            java.lang.Integer r4 = r4.f88752b
            java.lang.String r4 = "formUiTheme"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r4)
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.i r4 = new com.google.android.libraries.search.assistant.fluidactions.rendering.a.i
            r4.<init>(r5)
            r0.f88789f = r4
            java.lang.String r4 = "ui.SHOW_INTENT_PLATE"
            java.lang.String r1 = r1.f135936b
            boolean r1 = p5462h.p5473f.p5475b.C69664n.m101066l(r4, r1)
            java.lang.String r4 = "formFieldGroup"
            java.lang.String r5 = "null cannot be cast to non-null type com.google.android.libraries.search.assistant.fluidactions.rendering.ui.FormFieldGroupView"
            java.lang.String r7 = "formField.id"
            java.lang.String r8 = "null cannot be cast to non-null type com.google.android.libraries.search.assistant.fluidactions.rendering.ui.FormSubSectionView"
            java.lang.String r10 = "updateForm(): Rendering abort! Error retrieving previous ShowNativeFormArgs"
            java.lang.String r11 = "updateForm(): Rendering abort! Error retrieving previous FormViewData"
            java.lang.String r12 = "null cannot be cast to non-null type com.google.android.libraries.search.assistant.fluidactions.rendering.ui.FormMainView"
            java.lang.String r14 = "formRendererType"
            java.lang.String r15 = "activityResultController"
            java.lang.String r6 = "freeFormCallback"
            java.lang.String r9 = "showNativeFormArgs"
            java.lang.String r3 = "fragment"
            java.lang.String r13 = "clientInputAdapterFactory"
            r18 = r4
            java.lang.String r4 = "themeConfig"
            r20 = r5
            java.lang.String r5 = "fluidActionsConfig"
            r21 = 0
            r22 = r8
            if (r1 == 0) goto L_0x0466
            com.google.android.apps.gsa.binaries.satin.app.mx r1 = r0.f88800r
            java.util.Map r8 = r0.f88795m
            r23 = r8
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.g r8 = r0.f88787d
            r24 = r12
            com.google.android.libraries.search.assistant.fluidactions.b.f r12 = r0.f88797o
            r25 = r14
            com.google.android.libraries.search.assistant.fluidactions.b.d r14 = r0.f88798p
            r26 = r7
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.i r7 = r0.f88789f
            r27 = r10
            com.google.android.libraries.search.assistant.fluidactions.rendering.c.d r10 = r0.f88790g
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.f r28 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33207u.f88807a
            com.google.android.apps.gsa.binaries.satin.app.ni r0 = r1.f206639a
            com.google.android.apps.gsa.binaries.satin.app.anh r0 = r0.b
            com.google.android.apps.gsa.binaries.satin.app.aqe r0 = r0.f198027a
            g.a.a r0 = r0.f199559hM
            java.lang.Object r0 = r0.mo17428b()
            com.google.android.apps.gsa.binaries.satin.app.apq r0 = (com.google.android.apps.gsa.binaries.satin.app.apq) r0
            r28 = r11
            com.google.android.apps.gsa.binaries.satin.app.ni r11 = r1.f206639a
            com.google.android.apps.gsa.binaries.satin.app.nj r11 = r11.c
            com.google.apps.tiktok.inject.n r11 = r11.mo69790gU()
            com.google.android.apps.gsa.binaries.satin.app.ni r1 = r1.f206639a
            com.google.android.apps.gsa.binaries.satin.app.nj r1 = r1.c
            g.a.a r1 = r1.f206889e
            dagger.a.g r1 = (dagger.p5294a.C68221g) r1
            java.lang.Object r1 = r1.f184583a
            android.support.v4.app.Fragment r1 = (android.support.p031v4.app.Fragment) r1
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r13)
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r3)
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r9)
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r6)
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r5)
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r4)
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r15)
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r3 = new com.google.android.libraries.search.assistant.fluidactions.rendering.a.g
            r3.<init>(r2)
            com.google.android.libraries.search.assistant.fluidactions.a.a r0 = r0.mo66639a(r12)
            com.google.assistant.e.j.e.ff r2 = r3.mo38576a()
            int r2 = r2.f136326j
            com.google.assistant.e.j.e.fe r2 = com.google.assistant.p3897e.p3921j.p3926e.C51952fe.m86449a(r2)
            if (r2 != 0) goto L_0x0133
            com.google.assistant.e.j.e.fe r2 = com.google.assistant.p3897e.p3921j.p3926e.C51952fe.RENDER_NEW_NATIVE_FORM_DEFAULT
        L_0x0133:
            com.google.assistant.e.j.e.fe r6 = com.google.assistant.p3897e.p3921j.p3926e.C51952fe.FORM_FIELD_STATUS_UPDATE
            if (r2 != r6) goto L_0x01ab
            if (r8 == 0) goto L_0x01ab
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r2 = r8.f88834b
            if (r2 != 0) goto L_0x013e
            goto L_0x01ab
        L_0x013e:
            java.util.List r6 = r2.mo38579d()
            java.util.List r9 = r3.mo38579d()
            int r13 = r6.size()
            int r15 = r9.size()
            if (r13 != r15) goto L_0x01ab
            java.util.ArrayList r13 = new java.util.ArrayList
            r35 = r10
            r15 = 10
            int r10 = p5462h.p5463a.C69540x.m100804k(r6, r15)
            r13.<init>(r10)
            java.util.Iterator r6 = r6.iterator()
        L_0x0161:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x0173
            java.lang.Object r10 = r6.next()
            com.google.assistant.e.j.e.eu r10 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r10
            java.lang.String r10 = r10.f136279g
            r13.add(r10)
            goto L_0x0161
        L_0x0173:
            java.util.ArrayList r6 = new java.util.ArrayList
            r10 = 10
            int r10 = p5462h.p5463a.C69540x.m100804k(r9, r10)
            r6.<init>(r10)
            java.util.Iterator r9 = r9.iterator()
        L_0x0182:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0194
            java.lang.Object r10 = r9.next()
            com.google.assistant.e.j.e.eu r10 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r10
            java.lang.String r10 = r10.f136279g
            r6.add(r10)
            goto L_0x0182
        L_0x0194:
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r13, r6)
            if (r6 == 0) goto L_0x01ad
            java.util.List r2 = r2.mo38577b()
            java.util.List r6 = r3.mo38577b()
            boolean r2 = p5462h.p5473f.p5475b.C69664n.m101066l(r2, r6)
            if (r2 == 0) goto L_0x01ad
            com.google.assistant.e.j.e.fe r2 = com.google.assistant.p3897e.p3921j.p3926e.C51952fe.FORM_FIELD_STATUS_UPDATE
            goto L_0x01af
        L_0x01ab:
            r35 = r10
        L_0x01ad:
            com.google.assistant.e.j.e.fe r2 = com.google.assistant.p3897e.p3921j.p3926e.C51952fe.RENDER_NEW_NATIVE_FORM_DEFAULT
        L_0x01af:
            int[] r6 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33206t.f88806a
            int r9 = r2.ordinal()
            r6 = r6[r9]
            r9 = 1
            if (r6 != r9) goto L_0x02a2
            r3.mo38576a()
            if (r8 != 0) goto L_0x01e0
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33208v.f88808a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.ad r1 = com.google.common.p4526f.C58979ad.SMALL
            r0.mo56380ai(r1)
            com.google.common.f.n r1 = new com.google.common.f.n
            r3 = 50972(0xc71c, float:7.1427E-41)
            r1.<init>(r3)
            r0.mo56379ah(r1)
            r1 = r28
            r0.mo56386p(r1)
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.j r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33221j.ABORTED
            goto L_0x029c
        L_0x01e0:
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r0 = r8.f88834b
            if (r0 != 0) goto L_0x0205
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33208v.f88808a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.ad r1 = com.google.common.p4526f.C58979ad.SMALL
            r0.mo56380ai(r1)
            com.google.common.f.n r1 = new com.google.common.f.n
            r3 = 50971(0xc71b, float:7.1426E-41)
            r1.<init>(r3)
            r0.mo56379ah(r1)
            r7 = r27
            r0.mo56386p(r7)
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.j r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33221j.ABORTED
            goto L_0x029c
        L_0x0205:
            java.util.List r0 = r0.mo38579d()
            r8.f88834b = r3
            java.util.List r1 = r3.mo38579d()
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
        L_0x0214:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x029a
            java.lang.Object r4 = r1.next()
            int r21 = r3 + 1
            if (r3 >= 0) goto L_0x0225
            p5462h.p5463a.C69540x.m100952j()
        L_0x0225:
            com.google.assistant.e.j.e.eu r4 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r4
            java.lang.String r5 = r4.f136279g
            r10 = r26
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r10)
            android.view.View r5 = r8.mo38605c(r5)
            if (r5 != 0) goto L_0x0254
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33208v.f88808a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.ad r1 = com.google.common.p4526f.C58979ad.SMALL
            r0.mo56380ai(r1)
            com.google.common.f.n r1 = new com.google.common.f.n
            r3 = 50970(0xc71a, float:7.1424E-41)
            r1.<init>(r3)
            r0.mo56379ah(r1)
            java.lang.String r1 = "updateForm(): Rendering abort! FormField mismatch."
            r0.mo56386p(r1)
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.j r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33221j.ABORTED
            goto L_0x029c
        L_0x0254:
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.b r5 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33207u.m61581a(r5)
            if (r5 != 0) goto L_0x0282
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33208v.f88808a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.ad r1 = com.google.common.p4526f.C58979ad.SMALL
            r0.mo56380ai(r1)
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getName()
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 50969(0xc719, float:7.1423E-41)
            r3.<init>(r4)
            r0.mo56379ah(r3)
            java.lang.String r3 = "updateForm(): Rendering abort! FormField %s does not implement BaseField interface"
            r0.mo56389s(r3, r1)
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.j r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33221j.ABORTED
            goto L_0x029c
        L_0x0282:
            java.lang.Object r3 = r0.get(r3)
            boolean r3 = p5462h.p5473f.p5475b.C69664n.m101066l(r4, r3)
            if (r3 != 0) goto L_0x0294
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.e r3 = new com.google.android.libraries.search.assistant.fluidactions.rendering.a.e
            r3.<init>(r4, r14)
            r5.mo38564e(r3)
        L_0x0294:
            r26 = r10
            r3 = r21
            goto L_0x0214
        L_0x029a:
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.j r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33221j.SUCCESSFUL
        L_0x029c:
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.k r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33207u.m61582b(r0, r2, r8)
            goto L_0x0460
        L_0x02a2:
            r3.mo38576a()
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.f r6 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33207u.f88807a
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r4)
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r5)
            r8 = r25
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r8)
            android.content.Context r4 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33204r.m61577a(r11, r3, r7, r14, r6)
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r4)
            r6 = 2131624928(0x7f0e03e0, float:1.887705E38)
            r8 = 0
            android.view.View r5 = r5.inflate(r6, r8)
            r6 = r24
            p5462h.p5473f.p5475b.C69664n.m101059e(r5, r6)
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.FormMainView r5 = (com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.FormMainView) r5
            com.google.assistant.e.j.e.ff r6 = r3.mo38576a()
            r5.mo38617a(r6)
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.g r6 = new com.google.android.libraries.search.assistant.fluidactions.rendering.d.g
            r6.<init>(r5)
            r6.f88834b = r3
            java.util.List r5 = r3.mo38580e()
            java.util.Iterator r5 = r5.iterator()
        L_0x02df:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0458
            java.lang.Object r8 = r5.next()
            com.google.assistant.e.j.e.fa r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51948fa) r8
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r4)
            r10 = 2131624930(0x7f0e03e2, float:1.8877054E38)
            r13 = 0
            android.view.View r9 = r9.inflate(r10, r13)
            r10 = r22
            p5462h.p5473f.p5475b.C69664n.m101059e(r9, r10)
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.FormSubSectionView r9 = (com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.FormSubSectionView) r9
            r9.mo38619a(r8, r4)
            int r9 = r6.mo38604b(r9)
            com.google.protobuf.cq r8 = r8.f136299d
            java.util.Iterator r8 = r8.iterator()
        L_0x030b:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x0454
            java.lang.Object r13 = r8.next()
            com.google.assistant.e.j.e.ew r13 = (com.google.assistant.p3897e.p3921j.p3926e.C51943ew) r13
            boolean r15 = r13.f136290d
            if (r15 != 0) goto L_0x044c
            android.view.LayoutInflater r15 = android.view.LayoutInflater.from(r4)
            r17 = r5
            r19 = r8
            r5 = 2131624927(0x7f0e03df, float:1.8877048E38)
            r8 = 0
            android.view.View r15 = r15.inflate(r5, r8)
            r5 = r20
            p5462h.p5473f.p5475b.C69664n.m101059e(r15, r5)
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.FormFieldGroupView r15 = (com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.FormFieldGroupView) r15
            int r8 = r6.mo38603a(r15, r9)
            r22 = r10
            r10 = r18
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r10)
            com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33204r.m61578b(r4, r15, r13)
            com.google.protobuf.cq r13 = r13.f136288b
            java.util.Iterator r13 = r13.iterator()
        L_0x0346:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x0443
            java.lang.Object r15 = r13.next()
            com.google.assistant.e.j.e.eu r15 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r15
            r20 = r5
            boolean r5 = r15.f136281i
            if (r5 != 0) goto L_0x043f
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.d r5 = new com.google.android.libraries.search.assistant.fluidactions.rendering.a.d
            r18 = r9
            java.lang.String r9 = "formField"
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r9)
            r24 = r5
            r25 = r4
            r26 = r3
            r27 = r15
            r28 = r12
            r29 = r1
            r30 = r14
            r31 = r7
            r32 = r0
            r33 = r35
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33)
            int r9 = r15.f136277e
            com.google.assistant.e.j.e.er r9 = com.google.assistant.p3897e.p3921j.p3926e.C51938er.m86437a(r9)
            r24 = r7
            r7 = r23
            java.lang.Object r9 = r7.get(r9)
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.c r9 = (com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33178c) r9
            if (r9 == 0) goto L_0x0409
            android.view.View r9 = r9.mo38567a(r5)
            r23 = r7
            java.lang.String r7 = "it.renderField(renderingContext)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r7)
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.b r7 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33207u.m61581a(r9)
            if (r7 != 0) goto L_0x03c1
            com.google.common.f.e r5 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33208v.f88808a
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            java.lang.Class r7 = r9.getClass()
            java.lang.String r7 = r7.getName()
            com.google.common.f.n r9 = new com.google.common.f.n
            r25 = r12
            r12 = 50965(0xc715, float:7.1417E-41)
            r9.<init>(r12)
            r5.mo56379ah(r9)
            java.lang.String r9 = "renderField(): Failed! FormField %s does not implement BaseField interface."
            r5.mo56389s(r9, r7)
            r26 = r13
            goto L_0x042d
        L_0x03c1:
            r25 = r12
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r12 = r5.f88739b
            com.google.assistant.e.j.e.ff r12 = r12.mo38576a()
            java.lang.String r12 = r12.f136320d
            r26 = r13
            java.lang.String r13 = "renderingContext.showNat…Holder.get().focusFieldId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r13)
            int r12 = r12.length()
            if (r12 != 0) goto L_0x03da
        L_0x03d8:
            r5 = 0
            goto L_0x03eb
        L_0x03da:
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r5 = r5.f88739b
            com.google.assistant.e.j.e.ff r5 = r5.mo38576a()
            java.lang.String r5 = r5.f136320d
            java.lang.String r12 = r15.f136279g
            boolean r5 = r5.equals(r12)
            if (r5 == 0) goto L_0x03d8
            r5 = 1
        L_0x03eb:
            r7.mo38563d(r5)
            if (r5 == 0) goto L_0x03f4
            r7.mo38565f()
            goto L_0x03f7
        L_0x03f4:
            r7.mo38566g()
        L_0x03f7:
            com.google.assistant.e.j.e.ff r32 = r3.mo38576a()
            r29 = r9
            r30 = r15
            r31 = r11
            r33 = r1
            r34 = r0
            com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33230h.m61621c(r29, r30, r31, r32, r33, r34)
            goto L_0x042e
        L_0x0409:
            r23 = r7
            r25 = r12
            r26 = r13
            com.google.common.f.e r5 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33208v.f88808a
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            int r7 = r15.f136277e
            com.google.assistant.e.j.e.er r7 = com.google.assistant.p3897e.p3921j.p3926e.C51938er.m86437a(r7)
            com.google.common.f.n r9 = new com.google.common.f.n
            r12 = 50964(0xc714, float:7.1416E-41)
            r9.<init>(r12)
            r5.mo56379ah(r9)
            java.lang.String r9 = "No FieldRenderer found for FormField type: %s"
            r5.mo56389s(r9, r7)
        L_0x042d:
            r9 = 0
        L_0x042e:
            if (r9 == 0) goto L_0x0433
            r6.mo38606d(r9, r15, r8)
        L_0x0433:
            r9 = r18
            r5 = r20
            r7 = r24
            r12 = r25
            r13 = r26
            goto L_0x0346
        L_0x043f:
            r5 = r20
            goto L_0x0346
        L_0x0443:
            r20 = r5
            r18 = r10
            r5 = r17
            r8 = r19
            goto L_0x0450
        L_0x044c:
            r22 = r10
            r10 = r18
        L_0x0450:
            r10 = r22
            goto L_0x030b
        L_0x0454:
            r22 = r10
            goto L_0x02df
        L_0x0458:
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.j r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33204r.m61579c(r4, r6, r3)
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.k r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33207u.m61582b(r0, r2, r6)
        L_0x0460:
            r11 = r37
            r11.m61567d(r0)
            return
        L_0x0466:
            r1 = r11
            r8 = r14
            r14 = r22
            r11 = r0
            r36 = r12
            r12 = r7
            r7 = r10
            r10 = r36
            com.google.android.apps.gsa.binaries.satin.app.mw r0 = r11.f88799q
            java.util.Map r14 = r11.f88794l
            r23 = r14
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.g r14 = r11.f88787d
            r24 = r10
            com.google.android.libraries.search.assistant.fluidactions.b.f r10 = r11.f88797o
            r25 = r8
            com.google.android.libraries.search.assistant.fluidactions.b.d r8 = r11.f88798p
            r26 = r12
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.i r12 = r11.f88789f
            r27 = r7
            com.google.android.libraries.search.assistant.fluidactions.rendering.c.d r7 = r11.f88790g
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.f r28 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33201o.f88803a
            com.google.android.apps.gsa.binaries.satin.app.ni r11 = r0.f206638a
            com.google.android.apps.gsa.binaries.satin.app.anh r11 = r11.b
            com.google.android.apps.gsa.binaries.satin.app.aqe r11 = r11.f198027a
            g.a.a r11 = r11.f199559hM
            java.lang.Object r11 = r11.mo17428b()
            com.google.android.apps.gsa.binaries.satin.app.apq r11 = (com.google.android.apps.gsa.binaries.satin.app.apq) r11
            r28 = r1
            com.google.android.apps.gsa.binaries.satin.app.ni r1 = r0.f206638a
            com.google.android.apps.gsa.binaries.satin.app.nj r1 = r1.c
            com.google.apps.tiktok.inject.n r1 = r1.mo69790gU()
            com.google.android.apps.gsa.binaries.satin.app.ni r0 = r0.f206638a
            com.google.android.apps.gsa.binaries.satin.app.nj r0 = r0.c
            g.a.a r0 = r0.f206889e
            dagger.a.g r0 = (dagger.p5294a.C68221g) r0
            java.lang.Object r0 = r0.f184583a
            android.support.v4.app.Fragment r0 = (android.support.p031v4.app.Fragment) r0
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r13)
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r3)
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r9)
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r6)
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r5)
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r4)
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r15)
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r3 = new com.google.android.libraries.search.assistant.fluidactions.rendering.a.g
            r3.<init>(r2)
            com.google.android.libraries.search.assistant.fluidactions.a.a r2 = r11.mo66639a(r10)
            com.google.assistant.e.j.e.ff r6 = r3.mo38576a()
            int r6 = r6.f136326j
            com.google.assistant.e.j.e.fe r6 = com.google.assistant.p3897e.p3921j.p3926e.C51952fe.m86449a(r6)
            if (r6 != 0) goto L_0x04db
            com.google.assistant.e.j.e.fe r6 = com.google.assistant.p3897e.p3921j.p3926e.C51952fe.RENDER_NEW_NATIVE_FORM_DEFAULT
        L_0x04db:
            com.google.assistant.e.j.e.fe r9 = com.google.assistant.p3897e.p3921j.p3926e.C51952fe.FORM_FIELD_STATUS_UPDATE
            if (r6 != r9) goto L_0x0553
            if (r14 == 0) goto L_0x0553
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r6 = r14.f88834b
            if (r6 != 0) goto L_0x04e6
            goto L_0x0553
        L_0x04e6:
            java.util.List r9 = r6.mo38579d()
            java.util.List r11 = r3.mo38579d()
            int r13 = r9.size()
            int r15 = r11.size()
            if (r13 != r15) goto L_0x0553
            java.util.ArrayList r13 = new java.util.ArrayList
            r35 = r7
            r15 = 10
            int r7 = p5462h.p5463a.C69540x.m100804k(r9, r15)
            r13.<init>(r7)
            java.util.Iterator r7 = r9.iterator()
        L_0x0509:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x051b
            java.lang.Object r9 = r7.next()
            com.google.assistant.e.j.e.eu r9 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r9
            java.lang.String r9 = r9.f136279g
            r13.add(r9)
            goto L_0x0509
        L_0x051b:
            java.util.ArrayList r7 = new java.util.ArrayList
            r9 = 10
            int r9 = p5462h.p5463a.C69540x.m100804k(r11, r9)
            r7.<init>(r9)
            java.util.Iterator r9 = r11.iterator()
        L_0x052a:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x053c
            java.lang.Object r11 = r9.next()
            com.google.assistant.e.j.e.eu r11 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r11
            java.lang.String r11 = r11.f136279g
            r7.add(r11)
            goto L_0x052a
        L_0x053c:
            boolean r7 = p5462h.p5473f.p5475b.C69664n.m101066l(r13, r7)
            if (r7 == 0) goto L_0x0555
            java.util.List r6 = r6.mo38577b()
            java.util.List r7 = r3.mo38577b()
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r6, r7)
            if (r6 == 0) goto L_0x0555
            com.google.assistant.e.j.e.fe r6 = com.google.assistant.p3897e.p3921j.p3926e.C51952fe.FORM_FIELD_STATUS_UPDATE
            goto L_0x0557
        L_0x0553:
            r35 = r7
        L_0x0555:
            com.google.assistant.e.j.e.fe r6 = com.google.assistant.p3897e.p3921j.p3926e.C51952fe.RENDER_NEW_NATIVE_FORM_DEFAULT
        L_0x0557:
            int[] r7 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33200n.f88802a
            int r9 = r6.ordinal()
            r7 = r7[r9]
            r9 = 1
            if (r7 != r9) goto L_0x064c
            r3.mo38576a()
            if (r14 != 0) goto L_0x0588
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33202p.f88804a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.ad r1 = com.google.common.p4526f.C58979ad.SMALL
            r0.mo56380ai(r1)
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 50962(0xc712, float:7.1413E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            r1 = r28
            r0.mo56386p(r1)
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.j r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33221j.ABORTED
            goto L_0x0644
        L_0x0588:
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r0 = r14.f88834b
            if (r0 != 0) goto L_0x05ad
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33202p.f88804a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.ad r1 = com.google.common.p4526f.C58979ad.SMALL
            r0.mo56380ai(r1)
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 50961(0xc711, float:7.1412E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            r1 = r27
            r0.mo56386p(r1)
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.j r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33221j.ABORTED
            goto L_0x0644
        L_0x05ad:
            java.util.List r0 = r0.mo38579d()
            r14.f88834b = r3
            java.util.List r1 = r3.mo38579d()
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x05bc:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0642
            java.lang.Object r3 = r1.next()
            int r21 = r2 + 1
            if (r2 >= 0) goto L_0x05cd
            p5462h.p5463a.C69540x.m100952j()
        L_0x05cd:
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            java.lang.String r4 = r3.f136279g
            r5 = r26
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            android.view.View r4 = r14.mo38605c(r4)
            if (r4 != 0) goto L_0x05fc
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33202p.f88804a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.ad r1 = com.google.common.p4526f.C58979ad.SMALL
            r0.mo56380ai(r1)
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 50960(0xc710, float:7.141E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            java.lang.String r1 = "updateForm(): Rendering abort! FormField mismatch."
            r0.mo56386p(r1)
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.j r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33221j.ABORTED
            goto L_0x0644
        L_0x05fc:
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.b r4 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33201o.m61573a(r4)
            if (r4 != 0) goto L_0x062a
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33202p.f88804a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.ad r1 = com.google.common.p4526f.C58979ad.SMALL
            r0.mo56380ai(r1)
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getName()
            com.google.common.f.n r2 = new com.google.common.f.n
            r3 = 50959(0xc70f, float:7.1409E-41)
            r2.<init>(r3)
            r0.mo56379ah(r2)
            java.lang.String r2 = "updateForm(): Rendering abort! FormField %s does not implement BaseField interface"
            r0.mo56389s(r2, r1)
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.j r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33221j.ABORTED
            goto L_0x0644
        L_0x062a:
            java.lang.Object r2 = r0.get(r2)
            boolean r2 = p5462h.p5473f.p5475b.C69664n.m101066l(r3, r2)
            if (r2 != 0) goto L_0x063c
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.e r2 = new com.google.android.libraries.search.assistant.fluidactions.rendering.a.e
            r2.<init>(r3, r8)
            r4.mo38564e(r2)
        L_0x063c:
            r26 = r5
            r2 = r21
            goto L_0x05bc
        L_0x0642:
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.j r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33221j.SUCCESSFUL
        L_0x0644:
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.k r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33201o.m61574b(r0, r6, r14)
        L_0x0648:
            r1 = r37
            goto L_0x0829
        L_0x064c:
            r3.mo38576a()
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.f r7 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33201o.f88803a
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r4)
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r5)
            r4 = r25
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r4)
            android.content.Context r4 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33204r.m61577a(r1, r3, r12, r8, r7)
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r4)
            r7 = 2131624928(0x7f0e03e0, float:1.887705E38)
            r11 = 0
            android.view.View r5 = r5.inflate(r7, r11)
            r7 = r24
            p5462h.p5473f.p5475b.C69664n.m101059e(r5, r7)
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.FormMainView r5 = (com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.FormMainView) r5
            java.lang.String r7 = "view"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r7)
            boolean r7 = r8.mo38383m()
            if (r7 == 0) goto L_0x068e
            android.graphics.drawable.Drawable r7 = r5.getBackground()
            if (r7 == 0) goto L_0x068e
            r11 = 2131168122(0x7f070b7a, float:1.7950537E38)
            int r11 = com.google.android.libraries.material.p2206b.C28505a.m53283a(r11, r4)
            r7.setTint(r11)
        L_0x068e:
            com.google.assistant.e.j.e.ff r7 = r3.mo38576a()
            r5.mo38617a(r7)
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.g r7 = new com.google.android.libraries.search.assistant.fluidactions.rendering.d.g
            r7.<init>(r5)
            r7.f88834b = r3
            java.util.List r5 = r3.mo38580e()
            java.util.Iterator r5 = r5.iterator()
        L_0x06a4:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L_0x081f
            java.lang.Object r11 = r5.next()
            com.google.assistant.e.j.e.fa r11 = (com.google.assistant.p3897e.p3921j.p3926e.C51948fa) r11
            android.view.LayoutInflater r13 = android.view.LayoutInflater.from(r4)
            r14 = 2131624930(0x7f0e03e2, float:1.8877054E38)
            r15 = 0
            android.view.View r13 = r13.inflate(r14, r15)
            r15 = r22
            p5462h.p5473f.p5475b.C69664n.m101059e(r13, r15)
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.FormSubSectionView r13 = (com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.FormSubSectionView) r13
            r13.mo38619a(r11, r4)
            int r13 = r7.mo38604b(r13)
            com.google.protobuf.cq r11 = r11.f136299d
            java.util.Iterator r11 = r11.iterator()
        L_0x06d0:
            boolean r16 = r11.hasNext()
            if (r16 == 0) goto L_0x081b
            java.lang.Object r16 = r11.next()
            r9 = r16
            com.google.assistant.e.j.e.ew r9 = (com.google.assistant.p3897e.p3921j.p3926e.C51943ew) r9
            boolean r14 = r9.f136290d
            if (r14 != 0) goto L_0x0815
            android.view.LayoutInflater r14 = android.view.LayoutInflater.from(r4)
            r17 = r5
            r38 = r11
            r5 = 2131624927(0x7f0e03df, float:1.8877048E38)
            r11 = 0
            android.view.View r14 = r14.inflate(r5, r11)
            r11 = r20
            p5462h.p5473f.p5475b.C69664n.m101059e(r14, r11)
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.FormFieldGroupView r14 = (com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.FormFieldGroupView) r14
            int r5 = r7.mo38603a(r14, r13)
            r11 = r18
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r11)
            com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33204r.m61578b(r4, r14, r9)
            com.google.protobuf.cq r9 = r9.f136288b
            java.util.Iterator r9 = r9.iterator()
        L_0x070b:
            boolean r14 = r9.hasNext()
            if (r14 == 0) goto L_0x0809
            java.lang.Object r14 = r9.next()
            com.google.assistant.e.j.e.eu r14 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r14
            r18 = r9
            boolean r9 = r14.f136281i
            if (r9 != 0) goto L_0x0805
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.d r9 = new com.google.android.libraries.search.assistant.fluidactions.rendering.a.d
            r22 = r11
            java.lang.String r11 = "formField"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r11)
            r24 = r9
            r25 = r4
            r26 = r3
            r27 = r14
            r28 = r10
            r29 = r0
            r30 = r8
            r31 = r12
            r32 = r2
            r33 = r35
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33)
            int r11 = r14.f136277e
            com.google.assistant.e.j.e.er r11 = com.google.assistant.p3897e.p3921j.p3926e.C51938er.m86437a(r11)
            r24 = r8
            r8 = r23
            java.lang.Object r11 = r8.get(r11)
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.c r11 = (com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33178c) r11
            if (r11 == 0) goto L_0x07cf
            android.view.View r11 = r11.mo38567a(r9)
            r23 = r8
            java.lang.String r8 = "it.renderField(renderingContext)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r8)
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.b r8 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33201o.m61573a(r11)
            if (r8 != 0) goto L_0x0786
            com.google.common.f.e r8 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33202p.f88804a
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            java.lang.Class r9 = r11.getClass()
            java.lang.String r9 = r9.getName()
            com.google.common.f.n r11 = new com.google.common.f.n
            r25 = r10
            r10 = 50955(0xc70b, float:7.1403E-41)
            r11.<init>(r10)
            r8.mo56379ah(r11)
            java.lang.String r10 = "renderField(): Failed! FormField %s does not implement BaseField interface."
            r8.mo56389s(r10, r9)
            r26 = r12
            goto L_0x07f3
        L_0x0786:
            r25 = r10
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r10 = r9.f88739b
            com.google.assistant.e.j.e.ff r10 = r10.mo38576a()
            java.lang.String r10 = r10.f136320d
            r26 = r12
            java.lang.String r12 = "renderingContext.showNat…Holder.get().focusFieldId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r12)
            int r10 = r10.length()
            if (r10 != 0) goto L_0x079f
        L_0x079d:
            r9 = 0
            goto L_0x07b0
        L_0x079f:
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r9 = r9.f88739b
            com.google.assistant.e.j.e.ff r9 = r9.mo38576a()
            java.lang.String r9 = r9.f136320d
            java.lang.String r10 = r14.f136279g
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x079d
            r9 = 1
        L_0x07b0:
            r8.mo38563d(r9)
            if (r9 == 0) goto L_0x07b9
            r8.mo38565f()
            goto L_0x07bc
        L_0x07b9:
            r8.mo38566g()
        L_0x07bc:
            com.google.assistant.e.j.e.ff r32 = r3.mo38576a()
            r29 = r11
            r30 = r14
            r31 = r1
            r33 = r0
            r34 = r2
            com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33230h.m61621c(r29, r30, r31, r32, r33, r34)
            r8 = r11
            goto L_0x07f4
        L_0x07cf:
            r23 = r8
            r25 = r10
            r26 = r12
            com.google.common.f.e r8 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33202p.f88804a
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            int r9 = r14.f136277e
            com.google.assistant.e.j.e.er r9 = com.google.assistant.p3897e.p3921j.p3926e.C51938er.m86437a(r9)
            com.google.common.f.n r10 = new com.google.common.f.n
            r11 = 50954(0xc70a, float:7.1402E-41)
            r10.<init>(r11)
            r8.mo56379ah(r10)
            java.lang.String r10 = "No FieldRenderer found for FormField type: %s"
            r8.mo56389s(r10, r9)
        L_0x07f3:
            r8 = 0
        L_0x07f4:
            if (r8 == 0) goto L_0x07f9
            r7.mo38606d(r8, r14, r5)
        L_0x07f9:
            r9 = r18
            r11 = r22
            r8 = r24
            r10 = r25
            r12 = r26
            goto L_0x070b
        L_0x0805:
            r9 = r18
            goto L_0x070b
        L_0x0809:
            r18 = r11
            r5 = r17
            r9 = 1
            r14 = 2131624930(0x7f0e03e2, float:1.8877054E38)
            r11 = r38
            goto L_0x06d0
        L_0x0815:
            r9 = 1
            r14 = 2131624930(0x7f0e03e2, float:1.8877054E38)
            goto L_0x06d0
        L_0x081b:
            r22 = r15
            goto L_0x06a4
        L_0x081f:
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.j r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33204r.m61579c(r4, r7, r3)
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.k r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33201o.m61574b(r0, r6, r7)
            goto L_0x0648
        L_0x0829:
            r1.m61567d(r0)
            return
        L_0x082d:
            r1 = r0
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33197k.f88801a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.ad r2 = com.google.common.p4526f.C58979ad.SMALL
            r0.mo56380ai(r2)
            com.google.common.f.n r2 = new com.google.common.f.n
            r3 = 50950(0xc706, float:7.1396E-41)
            r2.<init>(r3)
            r0.mo56379ah(r2)
            java.lang.String r2 = "Failed to render ClientOp, showing error UI"
            r0.mo56386p(r2)
            com.google.android.libraries.search.assistant.fluidactions.rendering.c.g r0 = r1.f88791i
            android.view.View r0 = r0.getView()
            boolean r2 = r0 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L_0x0859
            r8 = r0
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            goto L_0x085a
        L_0x0859:
            r8 = 0
        L_0x085a:
            if (r8 != 0) goto L_0x0875
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33197k.f88801a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r2 = new com.google.common.f.n
            r3 = 50953(0xc709, float:7.14E-41)
            r2.<init>(r3)
            r0.mo56379ah(r2)
            java.lang.String r2 = "Failed to show error UI, root view is null"
            r0.mo56386p(r2)
            return
        L_0x0875:
            r8.removeAllViews()
            android.view.ContextThemeWrapper r0 = r1.f88786c
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r2 = 2131624926(0x7f0e03de, float:1.8877045E38)
            r3 = 0
            android.view.View r0 = r0.inflate(r2, r3)
            r8.addView(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33196j.mo38574a(com.google.assistant.e.j.dy):void");
    }

    /* renamed from: b */
    public final void mo38575b(C33176f fVar) {
        List<View> V;
        C33177b bVar;
        C69664n.m101061g(fVar, "assistantState");
        C33218g gVar = this.f88787d;
        if (gVar != null && (V = C69540x.m100840V(gVar.f88837e)) != null) {
            for (View view : V) {
                if (view instanceof C33177b) {
                    bVar = (C33177b) view;
                } else {
                    if (view instanceof C47231d) {
                        Object z = ((C47231d) view).mo17754z();
                        if (z instanceof C33177b) {
                            bVar = (C33177b) z;
                        }
                    }
                    bVar = null;
                }
                if (bVar != null) {
                    bVar.mo38561b(fVar);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo38589c(C33218g gVar) {
        C33183h hVar = this.f88784a;
        C69664n.m101059e(hVar, "null cannot be cast to non-null type com.google.android.libraries.search.assistant.fluidactions.rendering.impl.SubscriptionControllerImpl");
        C33211y yVar = (C33211y) hVar;
        C33186b bVar = yVar.f88814b;
        for (C32972e c : bVar.f88757c.values()) {
            bVar.f88759e.mo38407c(c);
        }
        bVar.f88757c.clear();
        yVar.f88815c.clear();
        C33190d dVar = this.f88790g;
        if (dVar != null) {
            dVar.f88773f = null;
        }
        this.f88796n.mo23108c().ifPresent(C33195i.f88782a);
        for (View view : C69540x.m100840V(gVar.f88837e)) {
            if (view instanceof C33177b) {
                ((C33177b) view).mo38562c();
            }
        }
    }
}
