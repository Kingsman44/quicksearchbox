package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9560l;

import com.google.android.apps.search.assistant.platform.p9141h.p9162h.C121126d;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.C127369n;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127282b;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127283c;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32798at;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32838cf;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.l.c */
/* compiled from: PG */
public final class C127238c implements C127369n {

    /* renamed from: a */
    public static final C33476a f350351a = new C33476a("assistant.api.DeviceCapabilities", C51715bm.f135662t);

    /* renamed from: b */
    public static final C32836cd f350352b;

    /* renamed from: c */
    private final String f350353c;

    /* renamed from: d */
    private final boolean f350354d;

    /* renamed from: e */
    private final C68214a f350355e;

    /* renamed from: f */
    private final C37215b f350356f;

    /* renamed from: g */
    private final C71422aw f350357g;

    /* renamed from: h */
    private final C121126d f350358h;

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a = C69664n.m101061g(ccVar, "builder");
        a.mo38320c();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a2 = C69664n.m101061g(ajVar, "builder");
        a2.mo38300c("asst.device.capabilities");
        a.mo38319b(a2.mo38298a());
        f350352b = a.mo38318a();
    }

    public C127238c(String str, boolean z, C68214a aVar, C37215b bVar, C71422aw awVar, C121126d dVar) {
        C69664n.m101061g(aVar, "deviceCapabilitiesFetcher");
        C69664n.m101061g(bVar, "appFlowLogger");
        C69664n.m101061g(awVar, "futureScope");
        this.f350353c = str;
        this.f350354d = z;
        this.f350355e = aVar;
        this.f350356f = bVar;
        this.f350357g = awVar;
        this.f350358h = dVar;
    }

    /* renamed from: a */
    public final C60870cx mo107986a(C127289i iVar, C32810be beVar) {
        C69664n.m101061g(iVar, "queryContext");
        C69664n.m101061g(beVar, "request");
        C127283c cVar = iVar.f350565c;
        if (cVar == null) {
            cVar = C127283c.f350547c;
        }
        return C71663i.m104692e(this.f350357g, (C71424ay) null, new C127236a(this, iVar, C127282b.m208209a(cVar.f350549a) != C127282b.VOICE_SEARCH, (C69577g) null), 3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x059e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x05a1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0035  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108002b(java.lang.String r26, boolean r27, p5462h.p5466c.C69577g r28) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            boolean r4 = r3 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9560l.C127237b
            if (r4 == 0) goto L_0x001b
            r4 = r3
            com.google.android.apps.search.assistant.surfaces.voice.d.c.l.b r4 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9560l.C127237b) r4
            int r5 = r4.f350350i
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f350350i = r5
            goto L_0x0020
        L_0x001b:
            com.google.android.apps.search.assistant.surfaces.voice.d.c.l.b r4 = new com.google.android.apps.search.assistant.surfaces.voice.d.c.l.b
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r3 = r4.f350348g
            h.c.a.a r5 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r6 = r4.f350350i
            java.lang.String r7 = "this.toBuilder()"
            r8 = 0
            r9 = 2
            java.lang.String r10 = "_builder.build()"
            java.lang.String r11 = "builder"
            java.lang.String r12 = "newBuilder()"
            java.lang.String r13 = "value"
            r14 = 1
            if (r6 == 0) goto L_0x0062
            if (r6 == r14) goto L_0x0050
            if (r6 != r9) goto L_0x0048
            java.lang.Object r1 = r4.f350346e
            java.lang.Object r2 = r4.f350345d
            java.lang.Object r5 = r4.f350344c
            java.lang.Object r6 = r4.f350343b
            java.lang.Object r4 = r4.f350342a
            p5462h.C69714l.m101134b(r3)
            goto L_0x044f
        L_0x0048:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0050:
            boolean r1 = r4.f350347f
            java.lang.Object r2 = r4.f350343b
            java.lang.Object r6 = r4.f350342a
            p5462h.C69714l.m101134b(r3)
            r23 = r7
            r24 = r2
            r2 = r1
            r1 = r24
            goto L_0x03c7
        L_0x0062:
            p5462h.C69714l.m101134b(r3)
            com.google.android.libraries.search.b.b r3 = r0.f350356f
            com.google.android.libraries.search.b.i.g r6 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96893bK
            java.lang.String r15 = "MAIN_ASSISTANT_DEVICE_CAPABILITIES_FETCH_STARTED"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r15)
            com.google.android.apps.search.assistant.surfaces.voice.p9689l.C128239a.m209322b(r3, r6, r1)
            dagger.a r3 = r0.f350355e
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.libraries.search.assistant.y.i.g r3 = (com.google.android.libraries.search.assistant.p2828y.p2848i.C36979g) r3
            com.google.assistant.e.j.amf r6 = com.google.assistant.p3897e.p3921j.amf.f135365e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.j.ame r6 = (com.google.assistant.p3897e.p3921j.ame) r6
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r12)
            com.google.assistant.e.j.amd r6 = p5462h.p5473f.p5475b.C69664n.m101061g(r6, "builder")
            r6.mo53704b()
            com.google.assistant.e.j.amf r16 = r6.mo53703a()
            if (r2 != 0) goto L_0x009e
            com.google.assistant.e.j.li r6 = com.google.assistant.p3897e.p3921j.C52265li.f137167I
            java.lang.String r15 = "{\n      SupportedFeature…etDefaultInstance()\n    }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r15)
            r17 = r6
            r23 = r7
            goto L_0x0396
        L_0x009e:
            com.google.assistant.e.j.li r6 = com.google.assistant.p3897e.p3921j.C52265li.f137167I
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.j.lh r6 = (com.google.assistant.p3897e.p3921j.C52264lh) r6
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r12)
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r11)
            r6.copyOnWrite()
            com.google.protobuf.bv r15 = r6.instance
            com.google.assistant.e.j.li r15 = (com.google.assistant.p3897e.p3921j.C52265li) r15
            int r14 = r15.f137177a
            r17 = 8388608(0x800000, float:1.17549435E-38)
            r14 = r14 | r17
            r15.f137177a = r14
            r15.f137196t = r8
            r6.copyOnWrite()
            com.google.protobuf.bv r14 = r6.instance
            com.google.assistant.e.j.li r14 = (com.google.assistant.p3897e.p3921j.C52265li) r14
            int r15 = r14.f137177a
            r15 = r15 | r9
            r14.f137177a = r15
            r15 = 1
            r14.f137180d = r15
            r6.copyOnWrite()
            com.google.protobuf.bv r14 = r6.instance
            com.google.assistant.e.j.li r14 = (com.google.assistant.p3897e.p3921j.C52265li) r14
            int r9 = r14.f137177a
            r9 = r9 | 4
            r14.f137177a = r9
            r14.f137181e = r15
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.assistant.e.j.li r9 = (com.google.assistant.p3897e.p3921j.C52265li) r9
            int r14 = r9.f137177a
            r14 = r14 | 1024(0x400, float:1.435E-42)
            r9.f137177a = r14
            r9.f137187k = r8
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.assistant.e.j.li r9 = (com.google.assistant.p3897e.p3921j.C52265li) r9
            int r14 = r9.f137177a
            r14 = r14 | 32
            r9.f137177a = r14
            r14 = 1
            r9.f137184h = r14
            com.google.assistant.e.j.lb r9 = com.google.assistant.p3897e.p3921j.C52258lb.OPA_ANDROID_LAUNCH_KEYBOARD_URI
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r13)
            r6.copyOnWrite()
            com.google.protobuf.bv r14 = r6.instance
            com.google.assistant.e.j.li r14 = (com.google.assistant.p3897e.p3921j.C52265li) r14
            int r9 = r9.f137142c
            r14.f137197u = r9
            int r9 = r14.f137177a
            r15 = 134217728(0x8000000, float:3.85186E-34)
            r9 = r9 | r15
            r14.f137177a = r9
            com.google.assistant.e.j.lk r9 = com.google.assistant.p3897e.p3921j.C52267lk.f137203c
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.e.j.lj r9 = (com.google.assistant.p3897e.p3921j.C52266lj) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r12)
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r11)
            r9.copyOnWrite()
            com.google.protobuf.bv r14 = r9.instance
            com.google.assistant.e.j.lk r14 = (com.google.assistant.p3897e.p3921j.C52267lk) r14
            int r15 = r14.f137205a
            r8 = 1
            r15 = r15 | r8
            r14.f137205a = r15
            r14.f137206b = r8
            com.google.protobuf.bv r8 = r9.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r10)
            com.google.assistant.e.j.lk r8 = (com.google.assistant.p3897e.p3921j.C52267lk) r8
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r13)
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.assistant.e.j.li r9 = (com.google.assistant.p3897e.p3921j.C52265li) r9
            r8.getClass()
            r9.f137186j = r8
            int r8 = r9.f137177a
            r8 = r8 | 128(0x80, float:1.794E-43)
            r9.f137177a = r8
            com.google.assistant.e.j.kx r8 = com.google.assistant.p3897e.p3921j.C52253kx.f137130c
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.j.ku r8 = (com.google.assistant.p3897e.p3921j.C52250ku) r8
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r12)
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r11)
            com.google.assistant.e.j.kw r9 = com.google.assistant.p3897e.p3921j.C52252kw.DIALOG_STATE_PARAMS
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r13)
            r8.copyOnWrite()
            com.google.protobuf.bv r14 = r8.instance
            com.google.assistant.e.j.kx r14 = (com.google.assistant.p3897e.p3921j.C52253kx) r14
            int r9 = r9.f137129c
            r14.f137133b = r9
            int r9 = r14.f137132a
            r15 = 1
            r9 = r9 | r15
            r14.f137132a = r9
            com.google.protobuf.bv r8 = r8.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r10)
            com.google.assistant.e.j.kx r8 = (com.google.assistant.p3897e.p3921j.C52253kx) r8
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r13)
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.assistant.e.j.li r9 = (com.google.assistant.p3897e.p3921j.C52265li) r9
            r8.getClass()
            r9.f137199w = r8
            int r8 = r9.f137177a
            r14 = 1073741824(0x40000000, float:2.0)
            r8 = r8 | r14
            r9.f137177a = r8
            com.google.assistant.e.j.lm r8 = com.google.assistant.p3897e.p3921j.C52269lm.TRANSACTIONS_V3
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r13)
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.assistant.e.j.li r9 = (com.google.assistant.p3897e.p3921j.C52265li) r9
            int r8 = r8.f137213e
            r9.f137185i = r8
            int r8 = r9.f137177a
            r8 = r8 | 64
            r9.f137177a = r8
            com.google.assistant.e.j.lg r8 = com.google.assistant.p3897e.p3921j.C52263lg.f137151o
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.j.ld r8 = (com.google.assistant.p3897e.p3921j.C52260ld) r8
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r12)
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r11)
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.e.j.lg r9 = (com.google.assistant.p3897e.p3921j.C52263lg) r9
            int r14 = r9.f137153a
            r15 = 2
            r14 = r14 | r15
            r9.f137153a = r14
            r14 = 1
            r9.f137155c = r14
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.e.j.lg r9 = (com.google.assistant.p3897e.p3921j.C52263lg) r9
            int r14 = r9.f137153a
            r14 = r14 | 512(0x200, float:7.175E-43)
            r9.f137153a = r14
            r14 = 0
            r9.f137162j = r14
            com.google.assistant.e.j.kr r9 = com.google.assistant.p3897e.p3921j.C52247kr.NGA_ESCAPE_HATCH
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r13)
            r8.copyOnWrite()
            com.google.protobuf.bv r14 = r8.instance
            com.google.assistant.e.j.lg r14 = (com.google.assistant.p3897e.p3921j.C52263lg) r14
            int r9 = r9.f137120c
            r14.f137157e = r9
            int r9 = r14.f137153a
            r9 = r9 | 8
            r14.f137153a = r9
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.e.j.lg r9 = (com.google.assistant.p3897e.p3921j.C52263lg) r9
            int r14 = r9.f137153a
            r14 = r14 | 4
            r9.f137153a = r14
            r14 = 1
            r9.f137156d = r14
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.e.j.lg r9 = (com.google.assistant.p3897e.p3921j.C52263lg) r9
            int r15 = r9.f137153a
            r15 = r15 | 256(0x100, float:3.59E-43)
            r9.f137153a = r15
            r9.f137161i = r14
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.e.j.lg r9 = (com.google.assistant.p3897e.p3921j.C52263lg) r9
            int r15 = r9.f137153a
            r15 = r15 | 32
            r9.f137153a = r15
            r9.f137159g = r14
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.e.j.lg r9 = (com.google.assistant.p3897e.p3921j.C52263lg) r9
            int r15 = r9.f137153a
            r15 = r15 | 128(0x80, float:1.794E-43)
            r9.f137153a = r15
            r9.f137160h = r14
            com.google.assistant.e.j.kt r9 = com.google.assistant.p3897e.p3921j.C52249kt.f137121c
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.e.j.ks r9 = (com.google.assistant.p3897e.p3921j.C52248ks) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r12)
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r11)
            r9.copyOnWrite()
            com.google.protobuf.bv r15 = r9.instance
            com.google.assistant.e.j.kt r15 = (com.google.assistant.p3897e.p3921j.C52249kt) r15
            r23 = r7
            int r7 = r15.f137123a
            r7 = r7 | r14
            r15.f137123a = r7
            r15.f137124b = r14
            com.google.protobuf.bv r7 = r9.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r10)
            com.google.assistant.e.j.kt r7 = (com.google.assistant.p3897e.p3921j.C52249kt) r7
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r13)
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.e.j.lg r9 = (com.google.assistant.p3897e.p3921j.C52263lg) r9
            r7.getClass()
            r9.f137164l = r7
            int r7 = r9.f137153a
            r7 = r7 | 2048(0x800, float:2.87E-42)
            r9.f137153a = r7
            com.google.protobuf.a.b r7 = new com.google.protobuf.a.b
            com.google.protobuf.cq r9 = r9.f137165m
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            java.lang.String r14 = "_builder.getSupportedDisplayTargetsList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r14)
            r7.<init>(r9)
            r7 = 2
            com.google.assistant.e.j.lf[] r9 = new com.google.assistant.p3897e.p3921j.C52262lf[r7]
            com.google.assistant.e.j.lf r7 = com.google.assistant.p3897e.p3921j.C52262lf.f137144f
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.e.j.le r7 = (com.google.assistant.p3897e.p3921j.C52261le) r7
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r12)
            com.google.assistant.e.j.all r7 = p5462h.p5473f.p5475b.C69664n.m101061g(r7, "builder")
            com.google.assistant.e.c.c.hp r14 = com.google.assistant.p3897e.p3902c.p3907c.C51133hp.DEFAULT
            r7.mo53697b(r14)
            com.google.assistant.e.j.lf r7 = r7.mo53696a()
            r14 = 0
            r9[r14] = r7
            com.google.assistant.e.j.lf r7 = com.google.assistant.p3897e.p3921j.C52262lf.f137144f
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.e.j.le r7 = (com.google.assistant.p3897e.p3921j.C52261le) r7
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r12)
            com.google.assistant.e.j.all r7 = p5462h.p5473f.p5475b.C69664n.m101061g(r7, "builder")
            com.google.assistant.e.c.c.hp r14 = com.google.assistant.p3897e.p3902c.p3907c.C51133hp.CONVERSATION_STARTERS
            r7.mo53697b(r14)
            com.google.assistant.e.j.le r14 = r7.f135332a
            r14.copyOnWrite()
            com.google.protobuf.bv r14 = r14.instance
            com.google.assistant.e.j.lf r14 = (com.google.assistant.p3897e.p3921j.C52262lf) r14
            int r15 = r14.f137146a
            r15 = r15 | 8
            r14.f137146a = r15
            r15 = 1
            r14.f137150e = r15
            com.google.assistant.e.j.lf r7 = r7.mo53696a()
            r9[r15] = r7
            java.util.List r7 = p5462h.p5463a.C69540x.m100947e(r9)
            java.lang.String r9 = "values"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r9)
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.e.j.lg r9 = (com.google.assistant.p3897e.p3921j.C52263lg) r9
            r9.mo53824a()
            com.google.protobuf.cq r9 = r9.f137165m
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r7, (java.util.List) r9)
            r8.copyOnWrite()
            com.google.protobuf.bv r7 = r8.instance
            com.google.assistant.e.j.lg r7 = (com.google.assistant.p3897e.p3921j.C52263lg) r7
            int r9 = r7.f137153a
            r9 = r9 | 8192(0x2000, float:1.14794E-41)
            r7.f137153a = r9
            r9 = 1
            r7.f137166n = r9
            com.google.protobuf.bv r7 = r8.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r10)
            com.google.assistant.e.j.lg r7 = (com.google.assistant.p3897e.p3921j.C52263lg) r7
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r13)
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.assistant.e.j.li r8 = (com.google.assistant.p3897e.p3921j.C52265li) r8
            r7.getClass()
            r8.f137198v = r7
            int r7 = r8.f137177a
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            r7 = r7 | r9
            r8.f137177a = r7
            com.google.assistant.e.j.km r7 = com.google.assistant.p3897e.p3921j.C52242km.f137107c
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.e.j.kl r7 = (com.google.assistant.p3897e.p3921j.C52241kl) r7
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r12)
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r11)
            boolean r8 = r0.f350354d
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.assistant.e.j.km r9 = (com.google.assistant.p3897e.p3921j.C52242km) r9
            int r14 = r9.f137109a
            r15 = 1
            r14 = r14 | r15
            r9.f137109a = r14
            r9.f137110b = r8
            com.google.protobuf.bv r7 = r7.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r10)
            com.google.assistant.e.j.km r7 = (com.google.assistant.p3897e.p3921j.C52242km) r7
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r13)
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.assistant.e.j.li r8 = (com.google.assistant.p3897e.p3921j.C52265li) r8
            r7.getClass()
            r8.f137173E = r7
            int r7 = r8.f137178b
            r9 = 262144(0x40000, float:3.67342E-40)
            r7 = r7 | r9
            r8.f137178b = r7
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.assistant.e.j.li r7 = (com.google.assistant.p3897e.p3921j.C52265li) r7
            int r8 = r7.f137178b
            r8 = r8 | 512(0x200, float:7.175E-43)
            r7.f137178b = r8
            r8 = 1
            r7.f137169A = r8
            com.google.assistant.e.j.kz r7 = com.google.assistant.p3897e.p3921j.C52255kz.f137134c
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.e.j.ky r7 = (com.google.assistant.p3897e.p3921j.C52254ky) r7
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r12)
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r11)
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.assistant.e.j.kz r9 = (com.google.assistant.p3897e.p3921j.C52255kz) r9
            int r14 = r9.f137136a
            r14 = r14 | r8
            r9.f137136a = r14
            r9.f137137b = r8
            com.google.protobuf.bv r7 = r7.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r10)
            com.google.assistant.e.j.kz r7 = (com.google.assistant.p3897e.p3921j.C52255kz) r7
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r13)
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.assistant.e.j.li r8 = (com.google.assistant.p3897e.p3921j.C52265li) r8
            r7.getClass()
            r8.f137174F = r7
            int r7 = r8.f137178b
            r7 = r7 | r17
            r8.f137178b = r7
            com.google.protobuf.bv r6 = r6.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r10)
            com.google.assistant.e.j.li r6 = (com.google.assistant.p3897e.p3921j.C52265li) r6
            r17 = r6
        L_0x0396:
            java.lang.String r6 = r0.f350353c
            r7 = 1
            char[] r8 = new char[r7]
            r7 = 44
            r9 = 0
            r8[r9] = r7
            r7 = 6
            java.util.List r18 = p5462h.p5483m.C69764m.m101189F(r6, r8, r9, r7)
            h.a.am r19 = p5462h.p5463a.C69496am.f185918a
            com.google.android.libraries.search.assistant.y.i.b r6 = new com.google.android.libraries.search.assistant.y.i.b
            r20 = 1
            r21 = 0
            r22 = 96
            r15 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            com.google.common.util.concurrent.cx r3 = r3.mo40506a(r6)
            r4.f350342a = r0
            r4.f350343b = r1
            r4.f350347f = r2
            r6 = 1
            r4.f350350i = r6
            java.lang.Object r3 = kotlinx.coroutines.p5578d.C71663i.m104690c(r3, r4)
            if (r3 == r5) goto L_0x05f0
            r6 = r0
        L_0x03c7:
            com.google.assistant.e.j.bm r3 = (com.google.assistant.p3897e.p3921j.C51715bm) r3
            com.google.protobuf.bn r3 = r3.toBuilder()
            r7 = r23
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r7)
            com.google.assistant.e.j.bl r3 = (com.google.assistant.p3897e.p3921j.C51714bl) r3
            com.google.assistant.e.j.qv r3 = p5462h.p5473f.p5475b.C69664n.m101061g(r3, "builder")
            com.google.assistant.e.j.cy r8 = r3.mo53860b()
            com.google.protobuf.bn r8 = r8.toBuilder()
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r7)
            com.google.assistant.e.j.cx r8 = (com.google.assistant.p3897e.p3921j.C51771cx) r8
            com.google.assistant.e.j.akn r8 = p5462h.p5473f.p5475b.C69664n.m101061g(r8, "builder")
            com.google.assistant.e.j.dg r9 = r8.mo53692b()
            com.google.protobuf.bn r9 = r9.toBuilder()
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r7)
            com.google.assistant.e.j.dd r9 = (com.google.assistant.p3897e.p3921j.C51788dd) r9
            com.google.assistant.e.j.amj r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")
            com.google.assistant.e.j.dd r14 = r9.f135376a
            r14.copyOnWrite()
            com.google.protobuf.bv r14 = r14.instance
            com.google.assistant.e.j.dg r14 = (com.google.assistant.p3897e.p3921j.C51791dg) r14
            int r15 = r14.f135892a
            r16 = 2
            r15 = r15 | 2
            r14.f135892a = r15
            r15 = 1
            r14.f135893b = r15
            com.google.assistant.e.j.dg r9 = r9.mo53705a()
            r8.mo53694d(r9)
            com.google.assistant.e.j.cy r8 = r8.mo53691a()
            r3.mo53862d(r8)
            com.google.assistant.e.j.bm r3 = r3.mo53859a()
            if (r2 == 0) goto L_0x05df
            h.f.b.aa r2 = new h.f.b.aa
            r2.<init>()
            r8 = r6
            com.google.android.apps.search.assistant.surfaces.voice.d.c.l.c r8 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9560l.C127238c) r8
            com.google.android.apps.search.assistant.platform.h.h.d r8 = r8.f350358h
            com.google.android.libraries.storage.protostore.ab r8 = r8.f336571a
            com.google.common.util.concurrent.cx r8 = r8.mo46042d()
            java.lang.String r9 = "personalResponseReadAccessor.getPersonalResponse()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)
            r4.f350342a = r6
            r4.f350343b = r1
            r4.f350344c = r3
            r4.f350345d = r2
            r4.f350346e = r2
            r9 = 2
            r4.f350350i = r9
            java.lang.Object r4 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r4)
            if (r4 == r5) goto L_0x05de
            r5 = r3
            r3 = r4
            r4 = r6
            r6 = r1
            r1 = r2
        L_0x044f:
            com.google.android.apps.search.assistant.platform.h.h.b.b r3 = (com.google.android.apps.search.assistant.platform.p9141h.p9162h.p9164b.C121124b) r3
            boolean r3 = r3.f336566b
            h.f.b.aa r1 = (p5462h.p5473f.p5475b.C69644aa) r1
            r1.f186023a = r3
            com.google.protobuf.bv r5 = (com.google.protobuf.C62942bv) r5
            com.google.protobuf.bn r1 = r5.toBuilder()
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r7)
            com.google.assistant.e.j.bl r1 = (com.google.assistant.p3897e.p3921j.C51714bl) r1
            com.google.assistant.e.j.qv r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.assistant.e.j.cy r3 = r1.mo53860b()
            com.google.protobuf.bn r3 = r3.toBuilder()
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r7)
            com.google.assistant.e.j.cx r3 = (com.google.assistant.p3897e.p3921j.C51771cx) r3
            com.google.assistant.e.j.akn r3 = p5462h.p5473f.p5475b.C69664n.m101061g(r3, "builder")
            com.google.assistant.e.j.dg r5 = r3.mo53692b()
            com.google.protobuf.bn r5 = r5.toBuilder()
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r7)
            com.google.assistant.e.j.dd r5 = (com.google.assistant.p3897e.p3921j.C51788dd) r5
            com.google.assistant.e.j.amj r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")
            com.google.assistant.e.j.df r7 = com.google.assistant.p3897e.p3921j.C51790df.f135885d
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.e.j.de r7 = (com.google.assistant.p3897e.p3921j.C51789de) r7
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r12)
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r11)
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.assistant.e.j.df r8 = (com.google.assistant.p3897e.p3921j.C51790df) r8
            int r9 = r8.f135887a
            r14 = 2
            r9 = r9 | r14
            r8.f135887a = r9
            r9 = 0
            r8.f135888b = r9
            com.google.protobuf.bv r7 = r7.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r10)
            com.google.assistant.e.j.df r7 = (com.google.assistant.p3897e.p3921j.C51790df) r7
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r13)
            com.google.assistant.e.j.dd r8 = r5.f135376a
            r8.copyOnWrite()
            com.google.protobuf.bv r8 = r8.instance
            com.google.assistant.e.j.dg r8 = (com.google.assistant.p3897e.p3921j.C51791dg) r8
            r7.getClass()
            r8.f135894c = r7
            int r7 = r8.f135892a
            r7 = r7 | 4
            r8.f135892a = r7
            com.google.assistant.e.j.dg r5 = r5.mo53705a()
            r3.mo53694d(r5)
            com.google.assistant.e.j.cu r5 = com.google.assistant.p3897e.p3921j.C51768cu.f135816e
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.e.j.ct r5 = (com.google.assistant.p3897e.p3921j.C51767ct) r5
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r12)
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r11)
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.e.j.cu r7 = (com.google.assistant.p3897e.p3921j.C51768cu) r7
            int r8 = r7.f135818a
            r9 = 1
            r8 = r8 | r9
            r7.f135818a = r8
            r7.f135819b = r9
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.e.j.cu r7 = (com.google.assistant.p3897e.p3921j.C51768cu) r7
            int r8 = r7.f135818a
            r14 = 2
            r8 = r8 | r14
            r7.f135818a = r8
            r7.f135820c = r9
            com.google.protobuf.bv r5 = r5.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r10)
            com.google.assistant.e.j.cu r5 = (com.google.assistant.p3897e.p3921j.C51768cu) r5
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r13)
            com.google.assistant.e.j.cx r7 = r3.f135278a
            r7.copyOnWrite()
            com.google.protobuf.bv r7 = r7.instance
            com.google.assistant.e.j.cy r7 = (com.google.assistant.p3897e.p3921j.C51772cy) r7
            r5.getClass()
            r7.f135835j = r5
            int r5 = r7.f135826a
            r5 = r5 | 256(0x100, float:3.59E-43)
            r7.f135826a = r5
            com.google.assistant.e.j.br r5 = com.google.assistant.p3897e.p3921j.C51720br.f135690d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.e.j.bq r5 = (com.google.assistant.p3897e.p3921j.C51719bq) r5
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r12)
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r11)
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.e.j.br r7 = (com.google.assistant.p3897e.p3921j.C51720br) r7
            int r8 = r7.f135692a
            r8 = r8 | 4
            r7.f135692a = r8
            r8 = 1
            r7.f135694c = r8
            com.google.protobuf.bv r5 = r5.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r10)
            com.google.assistant.e.j.br r5 = (com.google.assistant.p3897e.p3921j.C51720br) r5
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r13)
            com.google.assistant.e.j.cx r7 = r3.f135278a
            r7.copyOnWrite()
            com.google.protobuf.bv r7 = r7.instance
            com.google.assistant.e.j.cy r7 = (com.google.assistant.p3897e.p3921j.C51772cy) r7
            r5.getClass()
            r7.f135831f = r5
            int r5 = r7.f135826a
            r5 = r5 | 16
            r7.f135826a = r5
            com.google.assistant.e.j.cy r3 = r3.mo53691a()
            r1.mo53862d(r3)
            com.google.assistant.e.j.cg r3 = com.google.assistant.p3897e.p3921j.C51754cg.f135778e
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.e.j.cf r3 = (com.google.assistant.p3897e.p3921j.C51753cf) r3
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r12)
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r11)
            com.google.assistant.e.j.dr r5 = com.google.assistant.p3897e.p3921j.C51802dr.ALL_YOUTUBE_CONTENT
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r13)
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.assistant.e.j.cg r7 = (com.google.assistant.p3897e.p3921j.C51754cg) r7
            int r5 = r5.f135922c
            r7.f135782c = r5
            int r5 = r7.f135780a
            r8 = 2
            r5 = r5 | r8
            r7.f135780a = r5
            com.google.assistant.e.j.ck r5 = com.google.assistant.p3897e.p3921j.C51758ck.ALL_PROACTIVE_NOTIFICATIONS
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r13)
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.assistant.e.j.cg r7 = (com.google.assistant.p3897e.p3921j.C51754cg) r7
            int r5 = r5.f135796d
            r7.f135783d = r5
            int r5 = r7.f135780a
            r5 = r5 | 16
            r7.f135780a = r5
            h.f.b.aa r2 = (p5462h.p5473f.p5475b.C69644aa) r2
            boolean r2 = r2.f186023a
            if (r2 == 0) goto L_0x05a1
            com.google.assistant.e.j.ci r2 = com.google.assistant.p3897e.p3921j.C51756ci.ALL_PERSONAL_DATA
            goto L_0x05a3
        L_0x05a1:
            com.google.assistant.e.j.ci r2 = com.google.assistant.p3897e.p3921j.C51756ci.NO_PERSONAL_DATA
        L_0x05a3:
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r13)
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.e.j.cg r5 = (com.google.assistant.p3897e.p3921j.C51754cg) r5
            int r2 = r2.f135790e
            r5.f135781b = r2
            int r2 = r5.f135780a
            r7 = 1
            r2 = r2 | r7
            r5.f135780a = r2
            com.google.protobuf.bv r2 = r3.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r10)
            com.google.assistant.e.j.cg r2 = (com.google.assistant.p3897e.p3921j.C51754cg) r2
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r13)
            com.google.assistant.e.j.bl r3 = r1.f137536a
            r3.copyOnWrite()
            com.google.protobuf.bv r3 = r3.instance
            com.google.assistant.e.j.bm r3 = (com.google.assistant.p3897e.p3921j.C51715bm) r3
            r2.getClass()
            r3.f135672i = r2
            int r2 = r3.f135664a
            r2 = r2 | 256(0x100, float:3.59E-43)
            r3.f135664a = r2
            com.google.assistant.e.j.bm r3 = r1.mo53859a()
            r1 = r6
            r6 = r4
            goto L_0x05df
        L_0x05de:
            return r5
        L_0x05df:
            com.google.android.apps.search.assistant.surfaces.voice.d.c.l.c r6 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9560l.C127238c) r6
            com.google.android.libraries.search.b.b r2 = r6.f350356f
            com.google.android.libraries.search.b.i.g r4 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96894bL
            java.lang.String r5 = "MAIN_ASSISTANT_DEVICE_CAPABILITIES_FETCH_FINISHED"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.apps.search.assistant.surfaces.voice.p9689l.C128239a.m209322b(r2, r4, r1)
            return r3
        L_0x05f0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9560l.C127238c.mo108002b(java.lang.String, boolean, h.c.g):java.lang.Object");
    }
}
