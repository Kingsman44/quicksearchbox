package com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a.p8389a;

import android.content.Context;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13030ar;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13032at;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13033au;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13036ax;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13037ay;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13038b;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13073s;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13074t;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13075u;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.C14865cz;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.C14748c;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14110ak;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14350fz;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14647d;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1320d.C16783a;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57996c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.a.am */
/* compiled from: PG */
public final class C109546am implements C57974a {

    /* renamed from: i */
    public static final /* synthetic */ int f305077i = 0;

    /* renamed from: j */
    private static final C59071e f305078j = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.a.am");

    /* renamed from: k */
    private static final C58528ij f305079k = C58528ij.m90013M("android.intent.action.SET_TIMER", "android.intent.action.SET_ALARM", "android.intent.action.SHOW_TIMERS", "android.intent.action.SHOW_ALARMS");

    /* renamed from: a */
    public final Context f305080a;

    /* renamed from: b */
    public final C14986h f305081b;

    /* renamed from: c */
    public final C109538ae f305082c;

    /* renamed from: d */
    public Optional f305083d = Optional.empty();

    /* renamed from: e */
    public boolean f305084e;

    /* renamed from: f */
    public boolean f305085f;

    /* renamed from: g */
    public C2164c f305086g;

    /* renamed from: h */
    public final C60870cx f305087h = C2169h.m6027a(new C109545al(this));

    /* renamed from: l */
    private final C16783a f305088l;

    /* renamed from: m */
    private final C14110ak f305089m;

    /* renamed from: n */
    private final C14748c f305090n;

    /* renamed from: o */
    private final C86124t f305091o;

    /* renamed from: p */
    private final C14647d f305092p;

    /* renamed from: q */
    private final C60888db f305093q;

    /* renamed from: r */
    private final C14865cz f305094r;

    /* renamed from: s */
    private Optional f305095s = Optional.empty();

    /* renamed from: t */
    private Optional f305096t = Optional.empty();

    /* renamed from: u */
    private C60870cx f305097u = C60866ct.f164955a;

    public C109546am(Context context, C16783a aVar, C14986h hVar, C109538ae aeVar, C14110ak akVar, C14748c cVar, C86124t tVar, C14647d dVar, C60888db dbVar, C14865cz czVar) {
        this.f305080a = context;
        this.f305088l = aVar;
        this.f305081b = hVar;
        this.f305082c = aeVar;
        this.f305089m = akVar;
        this.f305090n = cVar;
        this.f305091o = tVar;
        this.f305092p = dVar;
        this.f305093q = dbVar;
        this.f305094r = czVar;
        this.f305084e = true;
    }

    /* renamed from: e */
    private final C14350fz m182297e(C13038b bVar) {
        C13073s sVar;
        C13075u uVar = bVar.f40474b;
        if (uVar == null) {
            uVar = C13075u.f40569c;
        }
        if (C13074t.m29251a(uVar.f40571a) != 2) {
            C13075u uVar2 = bVar.f40474b;
            if (uVar2 == null) {
                uVar2 = C13075u.f40569c;
            }
            if (C13074t.m29251a(uVar2.f40571a) != 3) {
                return C14350fz.MIC_UNKNOWN;
            }
            C13037ay ayVar = bVar.f40475c;
            if (ayVar == null) {
                ayVar = C13037ay.f40467c;
            }
            int a = C13036ax.m29242a(ayVar.f40470b);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 1) {
                return C14350fz.MIC_TTS;
            }
            if (i != 2) {
                return C14350fz.MIC_PROCESSING;
            }
            return C14350fz.MIC_UNKNOWN;
        } else if (this.f305083d.isEmpty() || ((C14350fz) this.f305083d.get()).equals(C14350fz.MIC_CLOSE) || ((C14350fz) this.f305083d.get()).equals(C14350fz.MIC_UNKNOWN)) {
            return C14350fz.MIC_OPEN;
        } else {
            C13075u uVar3 = bVar.f40474b;
            if (uVar3 == null) {
                uVar3 = C13075u.f40569c;
            }
            if (uVar3.f40571a == 1) {
                sVar = (C13073s) uVar3.f40572b;
            } else {
                sVar = C13073s.f40565c;
            }
            if (sVar.f40568b > 0) {
                return C14350fz.MIC_RECORDING;
            }
            return (!this.f305083d.isPresent() || !((C14350fz) this.f305083d.get()).equals(C14350fz.MIC_RECORDING)) ? C14350fz.MIC_OPEN : C14350fz.MIC_RECORDING;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03d3, code lost:
        if (r2.contains("com.google.android.deskclock") == false) goto L_0x03da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x016d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo20337c(java.lang.Object r12) {
        /*
            r11 = this;
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.y r12 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13079y) r12
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.ac r0 = r12.f40580b
            if (r0 != 0) goto L_0x000a
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.ac r0 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13015ac.f40430c
        L_0x000a:
            int r0 = r0.f40433b
            int r0 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13014ab.m29235a(r0)
            r1 = 0
            java.lang.String r2 = "Morris.AssistantAppFlow"
            r3 = 0
            if (r0 != 0) goto L_0x0017
            goto L_0x008a
        L_0x0017:
            r4 = 2
            if (r0 != r4) goto L_0x008a
            androidx.d.a.c r12 = r11.f305086g
            r12.getClass()
            r12.mo5437b(r1)
            com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.a.ae r12 = r11.f305082c
            j$.util.Optional r0 = r12.f305066d
            boolean r0 = r0.isPresent()
            if (r0 != 0) goto L_0x003f
            com.google.common.f.e r12 = com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a.p8389a.C109538ae.f305063a
            com.google.common.f.x r12 = r12.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r0, r2)
            java.lang.String r0 = "Ignoring end success event, no conversation in progress"
            r1 = 24939(0x616b, float:3.4947E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r1)).mo56386p(r0)
            goto L_0x0050
        L_0x003f:
            com.google.android.libraries.search.b.i.f r0 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97877cC
            com.google.net.a.a.b r1 = com.google.net.p4726a.p4727a.C62722b.OK
            com.google.android.libraries.search.b.i.a r0 = r0.mo40805c(r1)
            r12.mo97886b(r0)
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            r12.f305066d = r0
        L_0x0050:
            com.google.android.apps.gsa.search.core.i.t r12 = r11.f305091o
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248927x
            boolean r12 = r12.mo79746e(r0)
            if (r12 == 0) goto L_0x0065
            com.google.android.libraries.assistant.auto.tng.morris.c.ak r12 = r11.f305089m
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98226im
            com.google.android.libraries.search.b.i.a r0 = r0.mo40813g()
            r12.mo21421f(r0)
        L_0x0065:
            com.google.common.util.concurrent.cx r12 = r11.f305097u
            r12.cancel(r3)
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r12 = r11.f305081b
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r0 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14741k.m31039a()
            r12.mo21875g(r0)
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r12 = r11.f305081b
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r0 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14742l.m31047c(r3)
            r12.mo21875g(r0)
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r12 = r11.f305081b
            com.google.android.libraries.assistant.auto.tng.morris.e.fz r0 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14350fz.MIC_CLOSE
            java.lang.String r1 = ""
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r0 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14731a.m31011h(r0, r1)
            r12.mo21875g(r0)
            return
        L_0x008a:
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.f r0 = r12.f40581c
            if (r0 != 0) goto L_0x0090
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.f r0 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13060f.f40536l
        L_0x0090:
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b r0 = r0.f40539b
            if (r0 != 0) goto L_0x0096
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b r0 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13038b.f40471d
        L_0x0096:
            com.google.android.libraries.assistant.auto.tng.morris.e.fz r0 = r11.m182297e(r0)
            com.google.android.libraries.assistant.auto.tng.morris.e.fz r4 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14350fz.MIC_RECORDING
            r5 = 1
            if (r0 != r4) goto L_0x00c2
            com.google.android.libraries.assistant.auto.tng.morris.framework.c.c r4 = r11.f305090n
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.f r6 = r12.f40581c
            if (r6 != 0) goto L_0x00a7
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.f r6 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13060f.f40536l
        L_0x00a7:
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b r6 = r6.f40539b
            if (r6 != 0) goto L_0x00ad
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b r6 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13038b.f40471d
        L_0x00ad:
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.u r6 = r6.f40474b
            if (r6 != 0) goto L_0x00b3
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.u r6 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13075u.f40569c
        L_0x00b3:
            int r7 = r6.f40571a
            if (r7 != r5) goto L_0x00bc
            java.lang.Object r6 = r6.f40572b
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.s r6 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13073s) r6
            goto L_0x00be
        L_0x00bc:
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.s r6 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13073s.f40565c
        L_0x00be:
            int r6 = r6.f40568b
            r4.f44521a = r6
        L_0x00c2:
            j$.util.Optional r4 = r11.f305096t
            boolean r4 = r4.isEmpty()
            java.lang.String r6 = "Morris.SessDataSink"
            if (r4 == 0) goto L_0x00d4
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r12)
            r11.f305096t = r4
            goto L_0x0180
        L_0x00d4:
            j$.util.Optional r4 = r11.f305096t
            java.lang.Object r4 = r4.get()
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.y r4 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13079y) r4
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.f r4 = r4.f40581c
            if (r4 != 0) goto L_0x00e2
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.f r4 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13060f.f40536l
        L_0x00e2:
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.f r7 = r12.f40581c
            if (r7 != 0) goto L_0x00e8
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.f r7 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13060f.f40536l
        L_0x00e8:
            j$.util.Optional r8 = r11.f305083d
            boolean r8 = r8.isPresent()
            if (r8 == 0) goto L_0x010a
            j$.util.Optional r8 = r11.f305083d
            java.lang.Object r8 = r8.get()
            com.google.android.libraries.assistant.auto.tng.morris.e.fz r8 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14350fz) r8
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b r9 = r7.f40539b
            if (r9 != 0) goto L_0x00fe
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.b r9 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13038b.f40471d
        L_0x00fe:
            com.google.android.libraries.assistant.auto.tng.morris.e.fz r9 = r11.m182297e(r9)
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x010a
            r8 = 1
            goto L_0x010b
        L_0x010a:
            r8 = 0
        L_0x010b:
            j$.util.Optional r9 = r11.f305095s
            boolean r9 = r9.isPresent()
            if (r9 == 0) goto L_0x012d
            j$.util.Optional r9 = r11.f305095s
            java.lang.Object r9 = r9.get()
            java.lang.String r9 = (java.lang.String) r9
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.au r10 = r7.f40540c
            if (r10 != 0) goto L_0x0121
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.au r10 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13033au.f40462c
        L_0x0121:
            java.lang.String r10 = m182298f(r10)
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x012d
            r9 = 1
            goto L_0x012e
        L_0x012d:
            r9 = 0
        L_0x012e:
            r8 = r8 | r9
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r9 = r4.f40542e
            if (r9 != 0) goto L_0x0135
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r9 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b.f48800l
        L_0x0135:
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r10 = r7.f40542e
            if (r10 != 0) goto L_0x013b
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r10 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b.f48800l
        L_0x013b:
            boolean r9 = r9.equals(r10)
            r9 = r9 ^ r5
            r8 = r8 | r9
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.d r9 = r4.f40547j
            if (r9 != 0) goto L_0x0147
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.d r9 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16754d.f49023f
        L_0x0147:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.d r10 = r7.f40547j
            if (r10 != 0) goto L_0x014d
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.d r10 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16754d.f49023f
        L_0x014d:
            boolean r9 = r9.equals(r10)
            r9 = r9 ^ r5
            r8 = r8 | r9
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.p r4 = r4.f40546i
            if (r4 != 0) goto L_0x0159
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.p r4 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16766p.f49064d
        L_0x0159:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.p r7 = r7.f40546i
            if (r7 != 0) goto L_0x015f
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.p r7 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16766p.f49064d
        L_0x015f:
            boolean r4 = r4.equals(r7)
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r12)
            r11.f305096t = r7
            r4 = r4 ^ r5
            r4 = r4 | r8
            if (r4 != 0) goto L_0x0180
            com.google.common.f.e r12 = f305078j
            com.google.common.f.x r12 = r12.mo56224b()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r0, r6)
            java.lang.String r0 = "Ignoring duplicate SessionData"
            r1 = 24949(0x6175, float:3.4961E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x0180:
            com.google.android.libraries.assistant.auto.tng.morris.e.fz r4 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14350fz.MIC_CLOSE
            if (r0 != r4) goto L_0x018e
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r4 = r11.f305081b
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r3 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14742l.m31047c(r3)
            r4.mo21875g(r3)
            goto L_0x01c3
        L_0x018e:
            com.google.android.libraries.assistant.auto.tng.morris.e.fz r4 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14350fz.MIC_TTS
            if (r0 != r4) goto L_0x01a1
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r4 = r11.f305081b
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r7 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14742l.m31048d()
            r4.mo21875g(r7)
            com.google.common.util.concurrent.cx r4 = r11.f305097u
            r4.cancel(r3)
            goto L_0x01c3
        L_0x01a1:
            com.google.android.libraries.assistant.auto.tng.morris.e.fz r4 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14350fz.MIC_PROCESSING
            if (r0 != r4) goto L_0x01c3
            com.google.common.util.concurrent.db r4 = r11.f305093q
            com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.a.ag r7 = new com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.a.ag
            r7.<init>(r11, r0)
            com.google.android.apps.gsa.search.core.i.t r8 = r11.f305091o
            com.google.android.apps.gsa.shared.m.f r9 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248861bP
            long r8 = r8.mo79743a(r9)
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.common.util.concurrent.cz r4 = r4.mo29164d(r7, r8, r10)
            r11.f305097u = r4
            java.lang.String r7 = "Failed to execute low connectivity indication"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r4, r7, r3)
        L_0x01c3:
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.f r3 = r12.f40581c
            if (r3 != 0) goto L_0x01c9
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.f r3 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13060f.f40536l
        L_0x01c9:
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.au r3 = r3.f40540c
            if (r3 != 0) goto L_0x01cf
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.au r3 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13033au.f40462c
        L_0x01cf:
            java.lang.String r3 = m182298f(r3)
            com.google.android.libraries.assistant.auto.tng.morris.e.fz r4 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14350fz.MIC_UNKNOWN
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x01dc
            goto L_0x0214
        L_0x01dc:
            com.google.android.libraries.assistant.auto.tng.morris.e.fz r4 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14350fz.MIC_TTS
            if (r0 != r4) goto L_0x01f8
            j$.util.Optional r4 = r11.f305083d
            boolean r4 = r4.isPresent()
            if (r4 == 0) goto L_0x01f8
            j$.util.Optional r4 = r11.f305083d
            java.lang.Object r4 = r4.get()
            com.google.android.libraries.assistant.auto.tng.morris.e.fz r4 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14350fz) r4
            com.google.android.libraries.assistant.auto.tng.morris.e.fz r7 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14350fz.MIC_TTS
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x0214
        L_0x01f8:
            com.google.android.libraries.assistant.auto.tng.morris.e.fz r4 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14350fz.MIC_RECORDING
            if (r0 != r4) goto L_0x0231
            j$.util.Optional r4 = r11.f305083d
            boolean r4 = r4.isPresent()
            if (r4 == 0) goto L_0x0231
            j$.util.Optional r4 = r11.f305083d
            java.lang.Object r4 = r4.get()
            com.google.android.libraries.assistant.auto.tng.morris.e.fz r4 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14350fz) r4
            com.google.android.libraries.assistant.auto.tng.morris.e.fz r7 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14350fz.MIC_RECORDING
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0231
        L_0x0214:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x021b
            goto L_0x028e
        L_0x021b:
            j$.util.Optional r4 = r11.f305095s
            boolean r4 = r4.isPresent()
            if (r4 == 0) goto L_0x0231
            j$.util.Optional r4 = r11.f305095s
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x028e
        L_0x0231:
            com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.a.ae r4 = r11.f305082c
            j$.util.Optional r7 = r4.f305066d
            boolean r7 = r7.isPresent()
            if (r7 != 0) goto L_0x0252
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a.p8389a.C109538ae.f305063a
            com.google.common.f.x r4 = r4.mo56225c()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r7, r2)
            java.lang.String r2 = r0.name()
            r7 = 24942(0x616e, float:3.4951E-41)
            java.lang.String r8 = "Ignoring milestone event: %s, no conversation in progress"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56389s(r8, r2)
            goto L_0x0285
        L_0x0252:
            com.google.common.b.hd r7 = com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a.p8389a.C109538ae.f305064b
            boolean r7 = r7.containsKey(r0)
            if (r7 != 0) goto L_0x0271
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a.p8389a.C109538ae.f305063a
            com.google.common.f.x r4 = r4.mo56225c()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r7, r2)
            java.lang.String r2 = r0.name()
            r7 = 24941(0x616d, float:3.495E-41)
            java.lang.String r8 = "MicUiState %s, is not mapped to Appflow"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56389s(r8, r2)
            goto L_0x0285
        L_0x0271:
            com.google.common.b.hd r2 = com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a.p8389a.C109538ae.f305064b
            java.lang.Object r2 = r2.get(r0)
            j$.util.function.Supplier r2 = (p3186j$.util.function.Supplier) r2
            r2.getClass()
            java.lang.Object r2 = r2.get()
            com.google.android.libraries.search.b.i.a r2 = (com.google.android.libraries.search.p2871b.p2895i.C37252a) r2
            r4.mo97886b(r2)
        L_0x0285:
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r2 = r11.f305081b
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r4 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14731a.m31011h(r0, r3)
            r2.mo21875g(r4)
        L_0x028e:
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.f r2 = r12.f40581c
            if (r2 != 0) goto L_0x0295
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.f r4 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13060f.f40536l
            goto L_0x0296
        L_0x0295:
            r4 = r2
        L_0x0296:
            int r4 = r4.f40538a
            r4 = r4 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x03da
            if (r2 != 0) goto L_0x02a0
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.f r2 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13060f.f40536l
        L_0x02a0:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.p r2 = r2.f40546i
            if (r2 != 0) goto L_0x02a6
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.p r2 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16766p.f49064d
        L_0x02a6:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.n r4 = r2.f49067b
            if (r4 != 0) goto L_0x02ac
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.n r4 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16764n.f49053j
        L_0x02ac:
            java.lang.String r4 = r4.f49056b
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.n r7 = r2.f49067b
            if (r7 != 0) goto L_0x02b4
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.n r7 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16764n.f49053j
        L_0x02b4:
            com.google.protobuf.cq r7 = r7.f49062h
            java.lang.String r8 = "com.google.android.apps.gsa.staticplugins.opa.morris.SHOW_OVERLAY"
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L_0x02e8
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r7)
            com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.a.ah r2 = com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a.p8389a.C109541ah.f305072a
            j$.util.stream.Stream r1 = r1.filter(r2)
            j$.util.Optional r1 = r1.findFirst()
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L_0x03da
            com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.a.ae r1 = r11.f305082c
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98051fR
            com.google.android.libraries.search.b.i.a r2 = r2.mo40813g()
            r1.mo97887c(r2)
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r1 = r11.f305081b
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r2 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14731a.m31013j()
            r1.mo21875g(r2)
            goto L_0x03da
        L_0x02e8:
            java.lang.String r8 = "com.google.android.apps.gsa.staticplugins.opa.morris.SHOW_FULLSCREEN"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x038f
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r7)
            com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.a.ai r4 = com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a.p8389a.C109542ai.f305073a
            j$.util.stream.Stream r2 = r2.filter(r4)
            com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.a.aj r4 = com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a.p8389a.C109543aj.f305074a
            j$.util.stream.Stream r2 = r2.map(r4)
            j$.util.Optional r2 = r2.findFirst()
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x03da
            java.lang.Object r4 = r2.get()
            java.lang.String r4 = (java.lang.String) r4
            int r4 = java.lang.Integer.parseInt(r4)
            int r4 = p001a.p007b.p011b.p012a.C0025a.m8c(r4)
            int r5 = r4 + -2
            if (r4 == 0) goto L_0x038e
            switch(r5) {
                case -1: goto L_0x0377;
                case 0: goto L_0x0377;
                case 1: goto L_0x036d;
                case 2: goto L_0x0363;
                case 3: goto L_0x0358;
                case 4: goto L_0x034d;
                case 5: goto L_0x0342;
                case 6: goto L_0x0337;
                case 7: goto L_0x032c;
                case 8: goto L_0x0321;
                case 9: goto L_0x0377;
                case 10: goto L_0x0377;
                default: goto L_0x031f;
            }
        L_0x031f:
            goto L_0x03da
        L_0x0321:
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r1 = r11.f305081b
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r2 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14745o.m31065h()
            r1.mo21875g(r2)
            goto L_0x03da
        L_0x032c:
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r1 = r11.f305081b
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r2 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14745o.m31064g()
            r1.mo21875g(r2)
            goto L_0x03da
        L_0x0337:
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r1 = r11.f305081b
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r2 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14745o.m31059b()
            r1.mo21875g(r2)
            goto L_0x03da
        L_0x0342:
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r1 = r11.f305081b
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r2 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14745o.m31062e()
            r1.mo21875g(r2)
            goto L_0x03da
        L_0x034d:
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r1 = r11.f305081b
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r2 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14738h.m31024b()
            r1.mo21875g(r2)
            goto L_0x03da
        L_0x0358:
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r1 = r11.f305081b
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r2 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14745o.m31063f()
            r1.mo21875g(r2)
            goto L_0x03da
        L_0x0363:
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r1 = r11.f305081b
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r2 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14745o.m31060c()
            r1.mo21875g(r2)
            goto L_0x03da
        L_0x036d:
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r1 = r11.f305081b
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r2 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14745o.m31061d()
            r1.mo21875g(r2)
            goto L_0x03da
        L_0x0377:
            com.google.common.f.e r1 = f305078j
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r4, r6)
            java.lang.Object r2 = r2.get()
            r4 = 24951(0x6177, float:3.4964E-41)
            java.lang.String r5 = "Not valid FullscreenMode: %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r4)).mo56389s(r5, r2)
            goto L_0x03da
        L_0x038e:
            throw r1
        L_0x038f:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.d.a r1 = r11.f305088l
            android.content.Intent r1 = r1.mo23010a(r2)
            r11.f305085f = r5
            com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.a.ae r2 = r11.f305082c
            com.google.android.libraries.search.b.i.g r4 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97926cz
            com.google.android.libraries.search.b.i.a r4 = r4.mo40813g()
            r2.mo97887c(r4)
            java.lang.String r2 = "com.google.android.voicesearch.SEND_MESSAGE_TO_CONTACTS"
            java.lang.String r4 = r1.getAction()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x03af
            goto L_0x03d5
        L_0x03af:
            com.google.common.b.gu r2 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p881b.C13009a.f40419b
            java.lang.String r4 = r1.getPackage()
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L_0x03d5
            java.lang.String r2 = r1.getDataString()
            com.google.common.b.ij r4 = f305079k
            java.lang.String r1 = r1.getAction()
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L_0x03d5
            if (r2 == 0) goto L_0x03da
            java.lang.String r1 = "com.google.android.deskclock"
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x03da
        L_0x03d5:
            com.google.android.libraries.assistant.auto.tng.morris.f.d r1 = r11.f305092p
            r1.mo21611y()
        L_0x03da:
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.f r1 = r12.f40581c
            if (r1 != 0) goto L_0x03e1
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.f r2 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13060f.f40536l
            goto L_0x03e2
        L_0x03e1:
            r2 = r1
        L_0x03e2:
            int r2 = r2.f40538a
            r2 = r2 & 8
            if (r2 == 0) goto L_0x044c
            if (r1 != 0) goto L_0x03ec
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.f r1 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13060f.f40536l
        L_0x03ec:
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r1 = r1.f40542e
            if (r1 != 0) goto L_0x03f2
            com.google.android.libraries.assistant.auto.tng.ui.c.a.b r1 = com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b.f48800l
        L_0x03f2:
            int r2 = r1.f48802a
            r4 = r2 & 4
            if (r4 == 0) goto L_0x0408
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r2 = r11.f305081b
            com.google.at.h.b.a.r r1 = r1.f48810i
            if (r1 != 0) goto L_0x0400
            com.google.at.h.b.a.r r1 = com.google.p4017at.p4060h.p4068b.p4069a.C54201r.f142243f
        L_0x0400:
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r1 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14731a.m31014k(r1)
            r2.mo21875g(r1)
            goto L_0x044c
        L_0x0408:
            r2 = r2 & 8
            if (r2 == 0) goto L_0x044c
            com.google.android.apps.gsa.search.core.i.t r2 = r11.f305091o
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248927x
            boolean r2 = r2.mo79746e(r4)
            if (r2 == 0) goto L_0x0433
            com.google.assistant.e.j.e.ep r2 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.CALL
            com.google.assistant.e.j.e.ff r4 = r1.f48811j
            if (r4 != 0) goto L_0x041e
            com.google.assistant.e.j.e.ff r4 = com.google.assistant.p3897e.p3921j.p3926e.C51953ff.f136315l
        L_0x041e:
            int r4 = r4.f136323g
            com.google.assistant.e.j.e.ep r4 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.m86435a(r4)
            if (r4 != 0) goto L_0x0428
            com.google.assistant.e.j.e.ep r4 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.DEFAULT
        L_0x0428:
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0433
            com.google.android.libraries.assistant.auto.tng.morris.c.ak r2 = r11.f305089m
            r2.mo21416a()
        L_0x0433:
            com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.cz r2 = r11.f305094r
            com.google.assistant.e.j.e.ff r1 = r1.f48811j
            if (r1 != 0) goto L_0x043b
            com.google.assistant.e.j.e.ff r1 = com.google.assistant.p3897e.p3921j.p3926e.C51953ff.f136315l
        L_0x043b:
            j$.util.Optional r1 = r2.mo21784a(r1)
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r2 = r11.f305081b
            p3186j$.util.Objects.requireNonNull(r2)
            com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.a.ak r4 = new com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.a.ak
            r4.<init>(r2)
            r1.ifPresent(r4)
        L_0x044c:
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.f r12 = r12.f40581c
            if (r12 != 0) goto L_0x0453
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.f r1 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13060f.f40536l
            goto L_0x0454
        L_0x0453:
            r1 = r12
        L_0x0454:
            int r1 = r1.f40538a
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x04ab
            if (r12 != 0) goto L_0x045e
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.f r12 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13060f.f40536l
        L_0x045e:
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.d r12 = r12.f40547j
            if (r12 != 0) goto L_0x0464
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.d r12 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16754d.f49023f
        L_0x0464:
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r1 = r11.f305081b
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf.f43796e
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.gt r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt) r2
            com.google.android.libraries.assistant.auto.tng.morris.e.gn r4 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14365gn.f43466q
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.gk r4 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14362gk) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.gn r5 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14365gn) r5
            r6 = 28
            r5.f43468a = r6
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.gn r5 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14365gn) r5
            r12.getClass()
            r5.f43480m = r12
            r2.copyOnWrite()
            com.google.protobuf.bv r12 = r2.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf) r12
            com.google.protobuf.bv r4 = r4.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.gn r4 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14365gn) r4
            r4.getClass()
            r12.f43801d = r4
            r4 = 3
            r12.f43800c = r4
            com.google.protobuf.bv r12 = r2.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf) r12
            r1.mo21875g(r12)
        L_0x04ab:
            j$.util.Optional r12 = p3186j$.util.Optional.m71637of(r0)
            r11.f305083d = r12
            j$.util.Optional r12 = p3186j$.util.Optional.m71637of(r3)
            r11.f305095s = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a.p8389a.C109546am.mo20337c(java.lang.Object):void");
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f305095s = Optional.empty();
        this.f305083d = Optional.empty();
        this.f305096t = Optional.empty();
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        this.f305095s = Optional.empty();
        this.f305083d = Optional.empty();
        this.f305096t = Optional.empty();
        this.f305097u.cancel(false);
        this.f305084e = false;
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        C59104x d = f305078j.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.SessDataSink");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(24947)).mo56386p("#onFailure");
        this.f305095s = Optional.empty();
        this.f305083d = Optional.empty();
        this.f305096t = Optional.empty();
        this.f305097u.cancel(false);
        this.f305084e = false;
    }

    /* renamed from: f */
    private static String m182298f(C13033au auVar) {
        C13032at atVar;
        C13030ar arVar;
        int i = auVar.f40464a;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 2 : 1 : 3;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            if (i == 1) {
                atVar = (C13032at) auVar.f40465b;
            } else {
                atVar = C13032at.f40457d;
            }
            return String.valueOf(atVar.f40460b).concat(String.valueOf((auVar.f40464a == 1 ? (C13032at) auVar.f40465b : C13032at.f40457d).f40461c));
        } else if (i3 != 1) {
            return BuildConfig.FLAVOR;
        } else {
            if (i == 2) {
                arVar = (C13030ar) auVar.f40465b;
            } else {
                arVar = C13030ar.f40453c;
            }
            return arVar.f40456b;
        }
    }
}
