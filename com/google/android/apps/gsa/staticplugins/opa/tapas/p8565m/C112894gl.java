package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113342cm;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g;
import com.google.android.googlequicksearchbox.R;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.gl */
/* compiled from: PG */
final class C112894gl implements C113342cm {

    /* renamed from: a */
    private final C68214a f312892a;

    /* renamed from: b */
    private final C112893gk f312893b;

    /* renamed from: c */
    private final C86124t f312894c;

    /* renamed from: d */
    private final C68214a f312895d;

    /* renamed from: e */
    private int f312896e;

    public C112894gl(C68214a aVar, C112893gk gkVar, C86124t tVar, C68214a aVar2) {
        this.f312892a = aVar;
        this.f312893b = gkVar;
        this.f312894c = tVar;
        this.f312895d = aVar2;
    }

    /* renamed from: a */
    public final int mo99713a() {
        return R.layout.slice_item;
    }

    /* renamed from: b */
    public final int mo99684b(C113415ez ezVar) {
        return this.f312896e;
    }

    /* renamed from: c */
    public final C0673gh mo99714c(View view) {
        return new C112889gg(view, view.getContext(), this.f312894c, this.f312892a);
    }

    /* renamed from: d */
    public final /* synthetic */ Optional mo99715d(C113415ez ezVar) {
        return Optional.empty();
    }

    /* renamed from: e */
    public final Optional mo99716e(C0673gh ghVar) {
        return Optional.ofNullable(((C112889gg) ghVar).f312879h);
    }

    /* renamed from: f */
    public final void mo99685f(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo99717g(C113415ez ezVar, View view) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v61, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: com.google.android.libraries.assistant.slices.AssistantSliceView} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo99686h(com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es r27, com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez r28, android.support.p033v7.widget.C0673gh r29, com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g r30) {
        /*
            r26 = this;
            r0 = r26
            j$.util.Optional r1 = r28.mo100057P()
            boolean r1 = r1.isPresent()
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x002f
            dagger.a r1 = r0.f312895d
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.g.ao r1 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112037ao) r1
            j$.util.Optional r3 = r28.mo100057P()
            java.lang.Object r3 = r3.get()
            com.google.assistant.ad.d.ad r3 = (com.google.assistant.p3781ad.p3789d.C48570ad) r3
            com.google.android.apps.gsa.staticplugins.opa.tapas.g.an r1 = r1.mo99348a(r3)
            j$.util.Optional r1 = r1.mo99343e()
            java.lang.Object r1 = r1.orElse(r2)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
        L_0x002f:
            r7 = r2
            com.google.android.libraries.searchbox.shared.suggestion.e r1 = r28.mo100209i()
            com.google.android.libraries.searchbox.shared.suggestion.ag r1 = r1.f109016j
            if (r1 != 0) goto L_0x003a
            com.google.android.libraries.searchbox.shared.suggestion.ag r1 = com.google.android.libraries.searchbox.shared.suggestion.C41667ag.f108943h
        L_0x003a:
            int r1 = r1.f108947c
            int r1 = com.google.android.libraries.searchbox.shared.suggestion.C41666af.m73067a(r1)
            r2 = 3
            if (r1 != 0) goto L_0x0045
        L_0x0043:
            r6 = 1
            goto L_0x0048
        L_0x0045:
            if (r1 != r2) goto L_0x0043
            r6 = 2
        L_0x0048:
            int r1 = r7.hashCode()
            r4 = 6
            r5 = 5
            java.lang.String r9 = "Get_schedule"
            java.lang.String r12 = "Get_alarm_info"
            java.lang.String r13 = "Get_personal_event_info"
            java.lang.String r14 = "Get_calendar_events"
            java.lang.String r15 = "CalendarAgenda"
            java.lang.String r2 = "Get_reminder_info"
            java.lang.String r11 = "Create_timer"
            java.lang.String r10 = "Create_alarm"
            r16 = 0
            switch(r1) {
                case -1384585454: goto L_0x009c;
                case -1144657654: goto L_0x0094;
                case 46834225: goto L_0x008c;
                case 917696521: goto L_0x0084;
                case 1116286597: goto L_0x007c;
                case 1838311808: goto L_0x0074;
                case 2025923950: goto L_0x006c;
                case 2043392610: goto L_0x0064;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x00a4
        L_0x0064:
            boolean r1 = r7.equals(r11)
            if (r1 == 0) goto L_0x00a4
            r1 = 2
            goto L_0x00a5
        L_0x006c:
            boolean r1 = r7.equals(r10)
            if (r1 == 0) goto L_0x00a4
            r1 = 0
            goto L_0x00a5
        L_0x0074:
            boolean r1 = r7.equals(r9)
            if (r1 == 0) goto L_0x00a4
            r1 = 7
            goto L_0x00a5
        L_0x007c:
            boolean r1 = r7.equals(r12)
            if (r1 == 0) goto L_0x00a4
            r1 = 1
            goto L_0x00a5
        L_0x0084:
            boolean r1 = r7.equals(r13)
            if (r1 == 0) goto L_0x00a4
            r1 = 6
            goto L_0x00a5
        L_0x008c:
            boolean r1 = r7.equals(r14)
            if (r1 == 0) goto L_0x00a4
            r1 = 5
            goto L_0x00a5
        L_0x0094:
            boolean r1 = r7.equals(r15)
            if (r1 == 0) goto L_0x00a4
            r1 = 4
            goto L_0x00a5
        L_0x009c:
            boolean r1 = r7.equals(r2)
            if (r1 == 0) goto L_0x00a4
            r1 = 3
            goto L_0x00a5
        L_0x00a4:
            r1 = -1
        L_0x00a5:
            switch(r1) {
                case 0: goto L_0x00bc;
                case 1: goto L_0x00b8;
                case 2: goto L_0x00b4;
                case 3: goto L_0x00b0;
                case 4: goto L_0x00ac;
                case 5: goto L_0x00ac;
                case 6: goto L_0x00ac;
                case 7: goto L_0x00ac;
                default: goto L_0x00a8;
            }
        L_0x00a8:
            r1 = 97541(0x17d05, float:1.36684E-40)
            goto L_0x00bf
        L_0x00ac:
            r1 = 119830(0x1d416, float:1.67918E-40)
            goto L_0x00bf
        L_0x00b0:
            r1 = 119829(0x1d415, float:1.67916E-40)
            goto L_0x00bf
        L_0x00b4:
            r1 = 119827(0x1d413, float:1.67913E-40)
            goto L_0x00bf
        L_0x00b8:
            r1 = 119828(0x1d414, float:1.67915E-40)
            goto L_0x00bf
        L_0x00bc:
            r1 = 119826(0x1d412, float:1.67912E-40)
        L_0x00bf:
            r0.f312896e = r1
            r1 = r29
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.gg r1 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m.C112889gg) r1
            com.google.android.libraries.searchbox.shared.suggestion.e r3 = r28.mo100209i()
            com.google.android.libraries.searchbox.shared.suggestion.ag r3 = r3.f109016j
            if (r3 != 0) goto L_0x00cf
            com.google.android.libraries.searchbox.shared.suggestion.ag r3 = com.google.android.libraries.searchbox.shared.suggestion.C41667ag.f108943h
        L_0x00cf:
            java.lang.String r3 = r3.f108946b
            int r8 = r0.f312896e
            int r19 = r7.hashCode()
            switch(r19) {
                case -1384585454: goto L_0x0113;
                case -1144657654: goto L_0x010b;
                case 46834225: goto L_0x0103;
                case 917696521: goto L_0x00fb;
                case 1116286597: goto L_0x00f3;
                case 1838311808: goto L_0x00eb;
                case 2025923950: goto L_0x00e3;
                case 2043392610: goto L_0x00db;
                default: goto L_0x00da;
            }
        L_0x00da:
            goto L_0x011b
        L_0x00db:
            boolean r2 = r7.equals(r11)
            if (r2 == 0) goto L_0x011b
            r2 = 2
            goto L_0x011c
        L_0x00e3:
            boolean r2 = r7.equals(r10)
            if (r2 == 0) goto L_0x011b
            r2 = 0
            goto L_0x011c
        L_0x00eb:
            boolean r2 = r7.equals(r9)
            if (r2 == 0) goto L_0x011b
            r2 = 7
            goto L_0x011c
        L_0x00f3:
            boolean r2 = r7.equals(r12)
            if (r2 == 0) goto L_0x011b
            r2 = 1
            goto L_0x011c
        L_0x00fb:
            boolean r2 = r7.equals(r13)
            if (r2 == 0) goto L_0x011b
            r2 = 6
            goto L_0x011c
        L_0x0103:
            boolean r2 = r7.equals(r14)
            if (r2 == 0) goto L_0x011b
            r2 = 5
            goto L_0x011c
        L_0x010b:
            boolean r2 = r7.equals(r15)
            if (r2 == 0) goto L_0x011b
            r2 = 4
            goto L_0x011c
        L_0x0113:
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x011b
            r2 = 3
            goto L_0x011c
        L_0x011b:
            r2 = -1
        L_0x011c:
            switch(r2) {
                case 0: goto L_0x0142;
                case 1: goto L_0x013b;
                case 2: goto L_0x0134;
                case 3: goto L_0x012d;
                case 4: goto L_0x0126;
                case 5: goto L_0x0126;
                case 6: goto L_0x0126;
                case 7: goto L_0x0126;
                default: goto L_0x011f;
            }
        L_0x011f:
            r2 = 41280(0xa140, float:5.7846E-41)
            r9 = 41280(0xa140, float:5.7846E-41)
            goto L_0x0148
        L_0x0126:
            r2 = 119825(0x1d411, float:1.6791E-40)
            r9 = 119825(0x1d411, float:1.6791E-40)
            goto L_0x0148
        L_0x012d:
            r2 = 119824(0x1d410, float:1.67909E-40)
            r9 = 119824(0x1d410, float:1.67909E-40)
            goto L_0x0148
        L_0x0134:
            r2 = 119822(0x1d40e, float:1.67906E-40)
            r9 = 119822(0x1d40e, float:1.67906E-40)
            goto L_0x0148
        L_0x013b:
            r2 = 119823(0x1d40f, float:1.67908E-40)
            r9 = 119823(0x1d40f, float:1.67908E-40)
            goto L_0x0148
        L_0x0142:
            r2 = 119821(0x1d40d, float:1.67905E-40)
            r9 = 119821(0x1d40d, float:1.67905E-40)
        L_0x0148:
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.ad r2 = new com.google.android.apps.gsa.staticplugins.opa.tapas.m.ad
            r5 = r3
            r3 = r2
            r4 = r1
            r1 = -1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.gk r3 = r0.f312893b
            java.lang.String r4 = r2.f312478b
            java.util.Map r5 = r3.f312891j
            boolean r5 = r5.containsKey(r4)
            r6 = 0
            if (r5 != 0) goto L_0x0233
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.core.i.t r5 = r3.f312890i
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249353bt
            boolean r5 = r5.mo79746e(r7)
            if (r5 == 0) goto L_0x0171
            int r5 = r2.f312479c
            r7 = 2
            if (r5 != r7) goto L_0x0171
            r5 = 1
            goto L_0x0172
        L_0x0171:
            r5 = 0
        L_0x0172:
            androidx.slice.widget.SliceView r7 = new androidx.slice.widget.SliceView
            android.content.Context r8 = r3.f312883b
            r7.<init>(r8)
            if (r5 == 0) goto L_0x0197
            android.content.Context r7 = r3.f312883b
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r8 = 2131624369(0x7f0e01b1, float:1.8875916E38)
            android.view.View r7 = r7.inflate(r8, r6)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r8 = 2131429025(0x7f0b06a1, float:1.8479711E38)
            android.view.View r7 = r7.findViewById(r8)
            com.google.android.libraries.assistant.slices.AssistantSliceView r7 = (com.google.android.libraries.assistant.slices.AssistantSliceView) r7
            r8 = 1
            r7.f53827q = r8
            goto L_0x019c
        L_0x0197:
            int r8 = r2.f312479c
            r7.mo8673h(r8)
        L_0x019c:
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.be r8 = r3.f312887f
            int r9 = r2.f312481e
            j$.util.Optional r12 = p3186j$.util.Optional.empty()
            r8.mo99651b(r7, r9, r12)
            android.content.Context r8 = r3.f312883b
            androidx.lifecycle.v r9 = r3.f312884c
            com.google.android.libraries.gsa.k.g r12 = r3.f312889h
            com.google.android.apps.gsa.search.core.i.t r13 = r3.f312890i
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.ct r14 = r3.f312885d
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.be r15 = r3.f312887f
            r1 = 1
            java.lang.Integer[] r6 = new java.lang.Integer[r1]
            int r1 = r2.f312482f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6[r16] = r1
            java.util.List r25 = java.util.Arrays.asList(r6)
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.gp r1 = new com.google.android.apps.gsa.staticplugins.opa.tapas.m.gp
            r17 = r1
            r18 = r8
            r19 = r9
            r20 = r12
            r21 = r13
            r22 = r14
            r23 = r15
            r24 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            r1.f312901a = r7
            r7.mo8669d(r1)
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.gn r6 = new com.google.android.apps.gsa.staticplugins.opa.tapas.m.gn
            r6.<init>(r7, r1)
            java.util.Map r1 = r3.f312891j
            r1.put(r4, r6)
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.gp r1 = r6.f312898b
            java.util.Map r6 = r3.f312891j
            r1.f312905e = r6
            android.net.Uri r6 = android.net.Uri.parse(r4)
            android.content.Context r7 = r3.f312883b
            androidx.lifecycle.LiveData r6 = androidx.slice.widget.C4134al.m11866a(r7, r6)
            r1.mo99777c(r6)
            java.lang.String r1 = r2.f312480d
            boolean r6 = r1.equals(r10)
            if (r6 != 0) goto L_0x0233
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x0233
            dagger.a r1 = r3.f312886e
            java.lang.Object r1 = r1.mo27525b()
            r6 = r1
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.hd r6 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m.C112913hd) r6
            r1 = 1
            if (r1 == r5) goto L_0x0218
            r5 = 12
            r8 = 12
            goto L_0x021c
        L_0x0218:
            r5 = 25
            r8 = 25
        L_0x021c:
            java.lang.Integer[] r1 = new java.lang.Integer[r1]
            int r5 = r2.f312482f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1[r16] = r5
            java.lang.String r7 = "Track Slice Card attention"
            java.util.List r9 = java.util.Arrays.asList(r1)
            r10 = r27
            r11 = r28
            r6.mo99780b(r7, r8, r9, r10, r11)
        L_0x0233:
            java.util.Map r1 = r3.f312891j
            java.lang.Object r1 = r1.get(r4)
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.gn r1 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m.C112896gn) r1
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.gp r4 = r1.f312898b
            r5 = r28
            r4.f312902b = r5
            r6 = r27
            r4.f312903c = r6
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.gg r2 = r2.f312477a
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.gn r4 = r2.f312878g
            if (r4 != r1) goto L_0x024d
            goto L_0x033a
        L_0x024d:
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.dh r3 = r3.f312888g
            android.widget.ImageView r4 = r2.f312874c
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.dc r6 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113363dd.m187554d()
            com.google.common.b.gu r5 = r28.mo100212l()
            j$.util.stream.Stream r5 = p3186j$.util.Collection.EL.stream(r5)
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.gh r7 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m.C112890gh.f312880a
            j$.util.stream.Stream r5 = r5.map(r7)
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.gi r7 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m.C112891gi.f312881a
            j$.util.stream.Stream r5 = r5.map(r7)
            j$.util.stream.Collector r7 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r5 = r5.collect(r7)
            java.util.List r5 = (java.util.List) r5
            r6.mo99986c(r5)
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.df r5 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m.C112893gk.f312882a
            com.google.common.b.gp r7 = r6.mo99985b()
            r7.mo55395g(r5)
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.dd r5 = r6.mo99984a()
            r3.mo100144d(r4, r5)
            r3 = 0
            r2.f312878g = r3
            androidx.slice.widget.SliceView r4 = r2.f312879h
            if (r4 == 0) goto L_0x0292
            android.widget.LinearLayout r5 = r2.f312873b
            r5.removeView(r4)
        L_0x0292:
            r2.f312879h = r3
            r2.f312878g = r1
            androidx.slice.widget.SliceView r3 = r1.f312897a
            r2.f312879h = r3
            androidx.slice.widget.SliceView r3 = r2.f312879h
            if (r3 != 0) goto L_0x02ac
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m.C112889gg.f312872a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r2 = "Set a slice view component with no slice to be shown."
            r3 = 27822(0x6cae, float:3.8987E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x02ac:
            com.google.android.apps.gsa.search.core.i.t r4 = r2.f312877f
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249353bt
            boolean r4 = r4.mo79746e(r5)
            if (r4 == 0) goto L_0x02f1
            androidx.slice.widget.au r4 = r3.f13202i
            int r4 = r4.f13326d
            r5 = 2
            if (r4 != r5) goto L_0x02f1
            android.view.ViewParent r4 = r3.getParent()
            if (r4 == 0) goto L_0x02e0
            android.view.ViewParent r4 = r3.getParent()
            android.view.ViewParent r4 = r4.getParent()
            if (r4 == 0) goto L_0x02e0
            android.view.ViewParent r4 = r3.getParent()
            android.view.ViewParent r4 = r4.getParent()
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            android.view.ViewParent r5 = r3.getParent()
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r4.removeView(r5)
        L_0x02e0:
            android.widget.LinearLayout r4 = r2.f312873b
            r4.removeAllViewsInLayout()
            android.widget.LinearLayout r4 = r2.f312873b
            android.view.ViewParent r5 = r3.getParent()
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r4.addView(r5)
            goto L_0x032c
        L_0x02f1:
            android.view.ViewParent r4 = r3.getParent()
            if (r4 == 0) goto L_0x0300
            android.view.ViewParent r4 = r3.getParent()
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r4.removeView(r3)
        L_0x0300:
            android.view.ViewGroup$MarginLayoutParams r4 = new android.view.ViewGroup$MarginLayoutParams
            r5 = -2
            r6 = -1
            r4.<init>(r6, r5)
            android.content.Context r5 = r2.f312875d
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131172125(0x7f071b1d, float:1.7958656E38)
            int r5 = r5.getDimensionPixelSize(r6)
            r4.setMarginStart(r5)
            android.content.Context r5 = r2.f312875d
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131172124(0x7f071b1c, float:1.7958654E38)
            int r5 = r5.getDimensionPixelSize(r6)
            r4.setMarginEnd(r5)
            android.widget.LinearLayout r5 = r2.f312873b
            r5.addView(r3, r4)
        L_0x032c:
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.gp r1 = r1.f312898b
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ez r1 = r1.f312902b
            if (r1 == 0) goto L_0x033a
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.gf r4 = new com.google.android.apps.gsa.staticplugins.opa.tapas.m.gf
            r4.<init>(r2, r1)
            r3.setOnLongClickListener(r4)
        L_0x033a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m.C112894gl.mo99686h(com.google.android.apps.gsa.staticplugins.opa.tapas.shared.es, com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ez, android.support.v7.widget.gh, com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g):void");
    }

    /* renamed from: i */
    public final /* synthetic */ boolean mo99718i() {
        return false;
    }
}
