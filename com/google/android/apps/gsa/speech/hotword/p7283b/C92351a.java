package com.google.android.apps.gsa.speech.hotword.p7283b;

import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.speech.hotword.C90586c;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90579a;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90580b;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.speech.hotword.b.a */
/* compiled from: PG */
public final class C92351a {

    /* renamed from: a */
    public static final C59071e f257472a = C59071e.m91332i("com.google.android.apps.gsa.speech.hotword.b.a");

    /* renamed from: b */
    public final C90021c f257473b;

    /* renamed from: c */
    int f257474c = -1;

    /* renamed from: d */
    private int f257475d;

    /* renamed from: e */
    private int f257476e;

    /* renamed from: f */
    private int f257477f;

    /* renamed from: g */
    private int f257478g;

    /* renamed from: h */
    private int f257479h;

    /* renamed from: i */
    private Map f257480i;

    /* renamed from: j */
    private final C92353b f257481j;

    /* renamed from: k */
    private Map f257482k = new HashMap();

    public C92351a(C90021c cVar, C92353b bVar) {
        this.f257473b = cVar;
        this.f257481j = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Map m151642d(java.util.Map r12, boolean r13, com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f r14, com.google.common.base.C58833ax r15) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0007
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
        L_0x0007:
            com.google.android.apps.gsa.speech.hotword.b.b r0 = r11.f257481j
            java.util.Map r15 = r0.mo87002b(r15)
            if (r15 == 0) goto L_0x01c9
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x0017
            goto L_0x01c9
        L_0x0017:
            com.google.android.apps.gsa.shared.m.c r0 = r11.f257473b
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249921ak
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x002f
            int r0 = r15.hashCode()
            int r1 = r11.f257479h
            if (r1 != r0) goto L_0x002d
            if (r13 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            return r12
        L_0x002d:
            r11.f257479h = r0
        L_0x002f:
            java.util.Set r13 = r15.keySet()
            java.util.Iterator r13 = r13.iterator()
        L_0x0037:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x01c8
            java.lang.Object r0 = r13.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = com.google.common.base.C58837ba.m90859h(r0)
            if (r1 != 0) goto L_0x0037
            java.lang.Object r1 = r15.get(r0)
            com.google.android.libraries.search.n.p r1 = (com.google.android.libraries.search.p3055n.C39812p) r1
            int r2 = r1.f104695b
            com.google.android.libraries.search.n.o r2 = com.google.android.libraries.search.p3055n.C39811o.m69225a(r2)
            if (r2 != 0) goto L_0x0059
            com.google.android.libraries.search.n.o r2 = com.google.android.libraries.search.p3055n.C39811o.PHRASE_UNKNOWN
        L_0x0059:
            com.google.android.apps.gsa.shared.speech.hotword.a.f r2 = com.google.android.apps.gsa.speech.hotword.p7283b.C92353b.m151652a(r2)
            if (r2 == r14) goto L_0x007f
            com.google.common.f.e r0 = f257472a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r2 = 12475(0x30bb, float:1.7481E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            int r1 = r1.f104695b
            com.google.android.libraries.search.n.o r1 = com.google.android.libraries.search.p3055n.C39811o.m69225a(r1)
            if (r1 != 0) goto L_0x0079
            com.google.android.libraries.search.n.o r1 = com.google.android.libraries.search.p3055n.C39811o.PHRASE_UNKNOWN
        L_0x0079:
            java.lang.String r2 = "Skipping. Expected model: %s Found: %s"
            r0.mo56354G(r2, r14, r1)
            goto L_0x0037
        L_0x007f:
            com.google.android.apps.gsa.shared.speech.hotword.a.b r2 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90580b.f253237g
            com.google.protobuf.bn r2 = r2.createBuilder()
            r7 = r2
            com.google.android.apps.gsa.shared.speech.hotword.a.a r7 = (com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90579a) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r2 = r7.instance
            com.google.android.apps.gsa.shared.speech.hotword.a.b r2 = (com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90580b) r2
            r0.getClass()
            int r3 = r2.f253239a
            r8 = 1
            r3 = r3 | r8
            r2.f253239a = r3
            r2.f253240b = r0
            com.google.android.libraries.search.n.u r2 = r1.f104696c
            if (r2 != 0) goto L_0x00a0
            com.google.android.libraries.search.n.u r2 = com.google.android.libraries.search.p3055n.C39817u.f104702d
        L_0x00a0:
            int r2 = r2.f104706c
            int r2 = com.google.android.libraries.search.p3055n.C39816t.m69227a(r2)
            if (r2 != 0) goto L_0x00a9
            r2 = 1
        L_0x00a9:
            java.lang.String r3 = "x_google"
            java.lang.String r4 = ""
            r5 = 2
            java.lang.String r6 = "okgoogle"
            if (r2 != r5) goto L_0x00f9
            int r2 = r1.f104695b
            com.google.android.libraries.search.n.o r2 = com.google.android.libraries.search.p3055n.C39811o.m69225a(r2)
            if (r2 != 0) goto L_0x00bc
            com.google.android.libraries.search.n.o r2 = com.google.android.libraries.search.p3055n.C39811o.PHRASE_UNKNOWN
        L_0x00bc:
            com.google.android.libraries.search.n.o r9 = com.google.android.libraries.search.p3055n.C39811o.OK_HEY_GOOGLE
            if (r2 != r9) goto L_0x00c1
            r6 = r3
        L_0x00c1:
            com.google.android.libraries.search.n.u r2 = r1.f104696c
            if (r2 != 0) goto L_0x00c7
            com.google.android.libraries.search.n.u r2 = com.google.android.libraries.search.p3055n.C39817u.f104702d
        L_0x00c7:
            int r9 = r2.f104704a
            if (r9 != r5) goto L_0x00d0
            java.lang.Object r2 = r2.f104705b
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
        L_0x00d0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r9 = "https://www.gstatic.com/android-search/hotword/"
            r2.<init>(r9)
            r2.append(r6)
            java.lang.String r9 = "/"
            r2.append(r9)
            r2.append(r4)
            java.lang.String r9 = "/hotword.data"
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.android.apps.gsa.shared.speech.hotword.a.b r9 = (com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90580b) r9
            int r10 = r9.f253239a
            r5 = r5 | r10
            r9.f253239a = r5
            r9.f253241c = r2
        L_0x00f9:
            r5 = r4
            r4 = r6
            boolean r2 = r3.equals(r4)
            if (r8 == r2) goto L_0x0104
            java.lang.String r2 = "Ok Google"
            goto L_0x0106
        L_0x0104:
            java.lang.String r2 = "Hey Google"
        L_0x0106:
            r7.copyOnWrite()
            com.google.protobuf.bv r3 = r7.instance
            com.google.android.apps.gsa.shared.speech.hotword.a.b r3 = (com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90580b) r3
            int r6 = r3.f253239a
            r6 = r6 | 4
            r3.f253239a = r6
            r3.f253242d = r2
            int r2 = r1.f104694a
            int r2 = com.google.android.libraries.search.p3055n.C39809m.m69224a(r2)
            r3 = 0
            if (r2 != 0) goto L_0x011f
            goto L_0x0123
        L_0x011f:
            r6 = 3
            if (r2 != r6) goto L_0x0123
            r3 = 1
        L_0x0123:
            r7.copyOnWrite()
            com.google.protobuf.bv r2 = r7.instance
            com.google.android.apps.gsa.shared.speech.hotword.a.b r2 = (com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90580b) r2
            int r6 = r2.f253239a
            r6 = r6 | 8
            r2.f253239a = r6
            r2.f253243e = r3
            int r1 = r1.f104695b
            com.google.android.libraries.search.n.o r1 = com.google.android.libraries.search.p3055n.C39811o.m69225a(r1)
            if (r1 != 0) goto L_0x013c
            com.google.android.libraries.search.n.o r1 = com.google.android.libraries.search.p3055n.C39811o.PHRASE_UNKNOWN
        L_0x013c:
            com.google.android.apps.gsa.shared.speech.hotword.a.f r1 = com.google.android.apps.gsa.speech.hotword.p7283b.C92353b.m151652a(r1)
            r7.copyOnWrite()
            com.google.protobuf.bv r2 = r7.instance
            com.google.android.apps.gsa.shared.speech.hotword.a.b r2 = (com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90580b) r2
            int r1 = r1.f253255d
            r2.f253244f = r1
            int r1 = r2.f253239a
            r1 = r1 | 16
            r2.f253239a = r1
            com.google.common.f.e r1 = f257472a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r2 = 12466(0x30b2, float:1.7469E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            java.lang.String r2 = "Adding from config to map. Locale: %s modelPrefix: %s Location:%s isSpeakerIdSupported: %b"
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            r3 = r0
            r1.mo56360M(r2, r3, r4, r5, r6)
            com.google.common.b.hd r1 = com.google.android.apps.gsa.shared.speech.hotword.C90586c.f253257a
            r2 = 0
            java.lang.Object r1 = r1.getOrDefault(r0, r2)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x01bd
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x01bd
            java.util.Iterator r0 = r1.iterator()
        L_0x0180:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0037
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r7.copyOnWrite()
            com.google.protobuf.bv r2 = r7.instance
            com.google.android.apps.gsa.shared.speech.hotword.a.b r2 = (com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90580b) r2
            r1.getClass()
            int r3 = r2.f253239a
            r3 = r3 | r8
            r2.f253239a = r3
            r2.f253240b = r1
            boolean r2 = r12.isEmpty()
            if (r2 != 0) goto L_0x01b3
            boolean r2 = r12.containsKey(r1)
            if (r2 == 0) goto L_0x01b3
            com.google.protobuf.bv r2 = r7.build()
            com.google.android.apps.gsa.shared.speech.hotword.a.b r2 = (com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90580b) r2
            p3186j$.util.Map.EL.replace(r12, r1, r2)
            goto L_0x0180
        L_0x01b3:
            com.google.protobuf.bv r2 = r7.build()
            com.google.android.apps.gsa.shared.speech.hotword.a.b r2 = (com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90580b) r2
            r12.put(r1, r2)
            goto L_0x0180
        L_0x01bd:
            com.google.protobuf.bv r1 = r7.build()
            com.google.android.apps.gsa.shared.speech.hotword.a.b r1 = (com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90580b) r1
            r12.put(r0, r1)
            goto L_0x0037
        L_0x01c8:
            return r12
        L_0x01c9:
            com.google.common.f.e r13 = f257472a
            com.google.common.f.x r13 = r13.mo56224b()
            java.lang.String r14 = "Proto config empty. Exit merge."
            r15 = 12473(0x30b9, float:1.7478E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r15)).mo56386p(r14)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.hotword.p7283b.C92351a.m151642d(java.util.Map, boolean, com.google.android.apps.gsa.shared.speech.hotword.a.f, com.google.common.base.ax):java.util.Map");
    }

    /* renamed from: e */
    private final synchronized void m151643e(String str, String str2) {
        Map map = this.f257480i;
        map.getClass();
        C90580b bVar = (C90580b) map.get(str);
        if (bVar != null) {
            if (!str2.endsWith("hotword.data")) {
                ((C59052c) ((C59052c) f257472a.mo56226d()).mo56372aa(12478)).mo56386p("Issue with hotword_models_locations.");
            }
            C90579a aVar = (C90579a) bVar.toBuilder();
            aVar.copyOnWrite();
            C90580b bVar2 = (C90580b) aVar.instance;
            str2.getClass();
            bVar2.f253239a |= 2;
            bVar2.f253241c = str2;
            map.put(str, (C90580b) aVar.build());
        }
    }

    /* renamed from: f */
    private final synchronized void m151644f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C90579a aVar = (C90579a) C90580b.f253237g.createBuilder();
            aVar.copyOnWrite();
            C90580b bVar = (C90580b) aVar.instance;
            str.getClass();
            bVar.f253239a |= 1;
            bVar.f253240b = str;
            C90584f fVar = C90584f.OK_GOOGLE;
            aVar.copyOnWrite();
            C90580b bVar2 = (C90580b) aVar.instance;
            bVar2.f253244f = fVar.f253255d;
            bVar2.f253239a |= 16;
            C90580b bVar3 = (C90580b) aVar.build();
            Map map = this.f257480i;
            map.getClass();
            map.put(str, bVar3);
        }
    }

    /* renamed from: g */
    private final synchronized void m151645g(List list, Map map) {
        if (list.size() % 2 != 0) {
            ((C59052c) ((C59052c) f257472a.mo56226d()).mo56372aa(12480)).mo56386p("Invalid input: hotword_models_locations");
            return;
        }
        for (String str : map.keySet()) {
            m151643e(str, (String) map.get(str));
        }
        for (int i = 0; i < list.size(); i += 2) {
            if (!map.containsKey(list.get(i))) {
                m151643e((String) list.get(i), (String) list.get(i + 1));
            }
        }
    }

    /* renamed from: h */
    private final synchronized void m151646h(List list) {
        Map map = this.f257480i;
        map.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C90580b bVar = (C90580b) map.get(str);
            if (bVar != null) {
                C90579a aVar = (C90579a) bVar.toBuilder();
                aVar.copyOnWrite();
                C90580b bVar2 = (C90580b) aVar.instance;
                bVar2.f253239a |= 8;
                bVar2.f253243e = true;
                map.put(str, (C90580b) aVar.build());
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public final synchronized com.google.common.p4522b.C58495hd mo86999a(com.google.common.base.C58833ax r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            com.google.android.apps.gsa.shared.m.c r0 = r11.f257473b     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.shared.m.h r1 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250770J     // Catch:{ all -> 0x009e }
            com.google.common.b.gu r0 = r0.mo79745c(r1)     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.shared.m.c r1 = r11.f257473b     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.shared.m.h r2 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250769I     // Catch:{ all -> 0x009e }
            com.google.common.b.gu r1 = r1.mo79745c(r2)     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.shared.m.c r2 = r11.f257473b     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.shared.m.h r3 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249955bR     // Catch:{ all -> 0x009e }
            com.google.common.b.hd r2 = r2.mo79752r(r3)     // Catch:{ all -> 0x009e }
            com.google.common.b.hd r2 = com.google.android.apps.gsa.shared.speech.hotword.C90586c.m147803a(r2)     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.shared.m.c r3 = r11.f257473b     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.shared.m.h r4 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250797aJ     // Catch:{ all -> 0x009e }
            com.google.common.b.gu r3 = r3.mo79745c(r4)     // Catch:{ all -> 0x009e }
            monitor-enter(r11)     // Catch:{ all -> 0x009e }
            java.util.Map r4 = r11.f257480i     // Catch:{ all -> 0x009b }
            if (r4 != 0) goto L_0x0031
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x009b }
            r4.<init>()     // Catch:{ all -> 0x009b }
            r11.f257480i = r4     // Catch:{ all -> 0x009b }
        L_0x0031:
            java.util.Map r4 = r11.f257480i     // Catch:{ all -> 0x009b }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x009b }
            r5 = 1
            if (r4 != 0) goto L_0x006d
            int r4 = r0.hashCode()     // Catch:{ all -> 0x009b }
            int r6 = r1.hashCode()     // Catch:{ all -> 0x009b }
            int r7 = r2.hashCode()     // Catch:{ all -> 0x009b }
            int r8 = r3.hashCode()     // Catch:{ all -> 0x009b }
            int r9 = r11.f257475d     // Catch:{ all -> 0x009b }
            r10 = 0
            if (r9 == r4) goto L_0x0053
            r11.f257475d = r4     // Catch:{ all -> 0x009b }
            r4 = 1
            goto L_0x0054
        L_0x0053:
            r4 = 0
        L_0x0054:
            int r9 = r11.f257476e     // Catch:{ all -> 0x009b }
            if (r9 == r6) goto L_0x005b
            r11.f257476e = r6     // Catch:{ all -> 0x009b }
            r4 = 1
        L_0x005b:
            int r6 = r11.f257477f     // Catch:{ all -> 0x009b }
            if (r6 == r7) goto L_0x0062
            r11.f257477f = r7     // Catch:{ all -> 0x009b }
            r4 = 1
        L_0x0062:
            int r6 = r11.f257478g     // Catch:{ all -> 0x009b }
            if (r6 == r8) goto L_0x0069
            r11.f257478g = r8     // Catch:{ all -> 0x009b }
            goto L_0x006d
        L_0x0069:
            if (r4 != 0) goto L_0x006d
            r5 = 0
            goto L_0x0087
        L_0x006d:
            java.util.Map r4 = r11.f257480i     // Catch:{ all -> 0x009b }
            r4.getClass()
            r4.clear()     // Catch:{ all -> 0x009b }
            if (r0 != 0) goto L_0x007c
            com.google.common.b.hd r12 = com.google.common.p4522b.C58729pv.f156485a     // Catch:{ all -> 0x009b }
            monitor-exit(r11)     // Catch:{ all -> 0x009b }
            monitor-exit(r11)
            return r12
        L_0x007c:
            r11.m151644f(r0)     // Catch:{ all -> 0x009b }
            r11.m151645g(r1, r2)     // Catch:{ all -> 0x009b }
            if (r3 == 0) goto L_0x0087
            r11.m151646h(r3)     // Catch:{ all -> 0x009b }
        L_0x0087:
            java.util.Map r0 = r11.f257480i     // Catch:{ all -> 0x009b }
            com.google.android.apps.gsa.shared.speech.hotword.a.f r1 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_GOOGLE     // Catch:{ all -> 0x009b }
            java.util.Map r12 = r11.m151642d(r0, r5, r1, r12)     // Catch:{ all -> 0x009b }
            r11.f257480i = r12     // Catch:{ all -> 0x009b }
            r12.getClass()
            com.google.common.b.hd r12 = com.google.common.p4522b.C58495hd.m89898l(r12)     // Catch:{ all -> 0x009b }
            monitor-exit(r11)     // Catch:{ all -> 0x009b }
            monitor-exit(r11)
            return r12
        L_0x009b:
            r12 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x009b }
            throw r12     // Catch:{ all -> 0x009e }
        L_0x009e:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.hotword.p7283b.C92351a.mo86999a(com.google.common.base.ax):com.google.common.b.hd");
    }

    /* renamed from: b */
    public final C58495hd mo87000b(C90584f fVar, C58833ax axVar) {
        C90584f fVar2 = C90584f.UNKNOWN;
        int ordinal = fVar.ordinal();
        if (ordinal == 1) {
            return mo86999a(axVar);
        }
        if (ordinal == 2) {
            return mo87001c(axVar);
        }
        ((C59052c) ((C59052c) f257472a.mo56225c()).mo56372aa(12470)).mo56386p("No valid model type defined, returning the default.");
        return mo86999a(axVar);
    }

    /* renamed from: c */
    public final synchronized C58495hd mo87001c(C58833ax axVar) {
        boolean z;
        Map d;
        C58495hd b = C90586c.m147804b(this.f257473b);
        int hashCode = b.values().hashCode();
        if (this.f257474c != hashCode) {
            this.f257482k.clear();
            this.f257474c = hashCode;
            C58800sl lA = b.keySet().iterator();
            while (true) {
                z = true;
                if (!lA.hasNext()) {
                    break;
                }
                String str = (String) lA.next();
                C90579a aVar = (C90579a) C90580b.f253237g.createBuilder();
                aVar.copyOnWrite();
                C90580b bVar = (C90580b) aVar.instance;
                str.getClass();
                bVar.f253239a = 1 | bVar.f253239a;
                bVar.f253240b = str;
                String str2 = (String) b.get(str);
                str2.getClass();
                aVar.copyOnWrite();
                C90580b bVar2 = (C90580b) aVar.instance;
                bVar2.f253239a |= 2;
                bVar2.f253241c = str2;
                C90584f fVar = C90584f.OK_HEY_GOOGLE;
                aVar.copyOnWrite();
                C90580b bVar3 = (C90580b) aVar.instance;
                bVar3.f253244f = fVar.f253255d;
                bVar3.f253239a |= 16;
                aVar.copyOnWrite();
                C90580b bVar4 = (C90580b) aVar.instance;
                bVar4.f253239a |= 4;
                bVar4.f253242d = "Hey Google";
                boolean contains = this.f257473b.mo79745c(C90120fr.f250797aJ).contains(str);
                aVar.copyOnWrite();
                C90580b bVar5 = (C90580b) aVar.instance;
                bVar5.f253239a |= 8;
                bVar5.f253243e = contains;
                this.f257482k.put(str, (C90580b) aVar.build());
            }
        } else {
            z = false;
        }
        d = m151642d(this.f257482k, z, C90584f.OK_HEY_GOOGLE, axVar);
        this.f257482k = d;
        return C58495hd.m89898l(d);
    }
}
