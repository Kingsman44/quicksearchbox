package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Context;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82482gv;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.actions.util.ImageInfo;
import com.google.android.apps.gsa.search.shared.actions.util.Suggestion;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88515i;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87890hj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88293wh;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88295wj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88337xy;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108248bs;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108250bu;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108256c;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108390gy;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108411hs;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108429ij;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108430ik;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.b */
/* compiled from: PG */
public final class C107711b implements C87682aj {

    /* renamed from: a */
    public final Context f299727a;

    /* renamed from: b */
    public final C108230ba f299728b;

    /* renamed from: c */
    public final C88515i f299729c;

    /* renamed from: d */
    public final C68214a f299730d;

    /* renamed from: e */
    public final C68214a f299731e;

    /* renamed from: f */
    public VoiceAction f299732f;

    /* renamed from: g */
    public SearchError f299733g;

    /* renamed from: h */
    public VoiceAction f299734h;

    /* renamed from: i */
    public CardDecision f299735i;

    /* renamed from: j */
    public long f299736j;

    /* renamed from: k */
    public C108802ef f299737k;

    /* renamed from: l */
    private final C108429ij f299738l;

    /* renamed from: m */
    private final C68214a f299739m;

    /* renamed from: n */
    private final C86124t f299740n;

    /* renamed from: o */
    private final C58833ax f299741o;

    public C107711b(Context context, C108230ba baVar, C88515i iVar, C108429ij ijVar, C68214a aVar, C86124t tVar, C68214a aVar2, C68214a aVar3, C58833ax axVar) {
        this.f299727a = context;
        this.f299728b = baVar;
        this.f299729c = iVar;
        this.f299738l = ijVar;
        this.f299739m = aVar;
        this.f299740n = tVar;
        this.f299730d = aVar2;
        this.f299731e = aVar3;
        this.f299741o = axVar;
    }

    /* renamed from: h */
    private static boolean m178824h(C108232bc bcVar) {
        return bcVar.mo95830h() == 2 && (bcVar instanceof C108212aj) && ((C108212aj) bcVar).f300977c == 3;
    }

    /* renamed from: i */
    private final boolean m178825i(C108232bc bcVar) {
        C108232bc c = this.f299728b.mo95421j().mo95353c();
        if (c == null || c.mo96576jz(bcVar.f301029k) == 2 || (c instanceof C108451je)) {
            return true;
        }
        if (!(c instanceof C108262cf) || !((C108262cf) c).mo96710A()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo96241a(C107710u uVar) {
        uVar.mo96220c(this, C88244um.SHOW_DISPLAY_SEGMENT, C88244um.NO_SPEECH_DETECTED);
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [com.google.android.apps.gsa.staticplugins.opa.chatui.bc] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96242b(java.lang.String r11, android.view.View r12) {
        /*
            r10 = this;
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r10.f299728b
            boolean r0 = r0.mo95405ap()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            com.google.android.apps.gsa.staticplugins.opa.chatui.cf r0 = new com.google.android.apps.gsa.staticplugins.opa.chatui.cf
            r0.<init>()
            com.google.android.apps.gsa.search.core.i.t r1 = r10.f299740n
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247760nI
            boolean r1 = r1.mo79746e(r2)
            r2 = 0
            if (r1 != 0) goto L_0x0023
            r0.f301174d = r11
            com.google.android.apps.gsa.shared.util.BitFlags r1 = r0.f301029k
            r4 = 256(0x100, double:1.265E-321)
            r1.mo85049c(r2, r4)
        L_0x0023:
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r1 = r10.f299735i
            if (r1 == 0) goto L_0x0030
            boolean r1 = r1.f236268v
            if (r1 == 0) goto L_0x0030
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r1 = r10.f299728b
            r1.mo95377S()
        L_0x0030:
            com.google.android.apps.gsa.search.core.i.t r1 = r10.f299740n
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247760nI
            boolean r1 = r1.mo79746e(r4)
            r4 = 1
            if (r1 != 0) goto L_0x0041
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r11 = r10.f299728b
            r11.mo95430s(r0)
            goto L_0x00a0
        L_0x0041:
            com.google.android.apps.gsa.staticplugins.opa.chatui.cf r0 = new com.google.android.apps.gsa.staticplugins.opa.chatui.cf
            r0.<init>()
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r1 = r10.f299728b
            com.google.android.apps.gsa.staticplugins.opa.chatui.bf r1 = r1.mo95421j()
            int r1 = r1.mo95351a()
            r5 = -1
            int r1 = r1 + r5
            if (r1 < 0) goto L_0x005f
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r6 = r10.f299728b
            com.google.android.apps.gsa.staticplugins.opa.chatui.bf r6 = r6.mo95421j()
            com.google.android.apps.gsa.staticplugins.opa.chatui.bc r6 = r6.mo95352b(r1)
            goto L_0x0060
        L_0x005f:
            r6 = 0
        L_0x0060:
            r7 = 256(0x100, float:3.59E-43)
            r8 = 0
            if (r6 == 0) goto L_0x0087
            boolean r9 = m178824h(r6)
            if (r9 == 0) goto L_0x0087
            int r5 = r5 + r1
            r7 = 1280(0x500, float:1.794E-42)
            if (r5 < 0) goto L_0x0087
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r1 = r10.f299728b
            com.google.android.apps.gsa.staticplugins.opa.chatui.bf r1 = r1.mo95421j()
            com.google.android.apps.gsa.staticplugins.opa.chatui.bc r1 = r1.mo95352b(r5)
            boolean r9 = r1 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf
            if (r9 == 0) goto L_0x0087
            r0 = r1
            com.google.android.apps.gsa.staticplugins.opa.chatui.cf r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf) r0
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r1 = r10.f299728b
            r1.mo95372N(r6)
            r8 = 1
        L_0x0087:
            r0.f301174d = r11
            com.google.android.apps.gsa.shared.util.BitFlags r11 = r0.f301029k
            long r6 = (long) r7
            r11.mo85049c(r2, r6)
            if (r8 == 0) goto L_0x009b
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r11 = r10.f299728b
            com.google.android.apps.gsa.staticplugins.opa.chatui.bf r11 = r11.mo95421j()
            r11.mo95354d(r5)
            goto L_0x00a0
        L_0x009b:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r11 = r10.f299728b
            r11.mo95430s(r0)
        L_0x00a0:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r11 = r10.f299728b
            com.google.android.apps.gsa.staticplugins.opa.chatui.aj r0 = new com.google.android.apps.gsa.staticplugins.opa.chatui.aj
            r0.<init>(r12, r4)
            r11.mo95430s(r0)
            boolean r11 = r12 instanceof android.view.ViewGroup
            if (r11 == 0) goto L_0x00b8
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            com.google.android.apps.gsa.staticplugins.opa.a r11 = new com.google.android.apps.gsa.staticplugins.opa.a
            r11.<init>(r10)
            r12.setOnHierarchyChangeListener(r11)
        L_0x00b8:
            com.google.android.apps.gsa.staticplugins.opa.ef r11 = r10.f299737k
            r11.mo97173b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C107711b.mo96242b(java.lang.String, android.view.View):void");
    }

    /* renamed from: d */
    public final void mo96243d(List list) {
        C108430ik ikVar;
        C108230ba baVar = this.f299728b;
        C108429ij ijVar = this.f299738l;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                Suggestion suggestion = (Suggestion) list.get(i);
                if (!TextUtils.isEmpty(suggestion.f236276b.f145894c)) {
                    ikVar = new C108390gy(suggestion);
                } else {
                    ikVar = new C108256c(suggestion);
                }
                ijVar.mo96874d(ikVar);
                arrayList.add(ikVar);
            }
        }
        baVar.mo95408as(arrayList);
        this.f299737k.mo97173b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo96244e() {
        CardDecision cardDecision;
        VoiceAction voiceAction = this.f299734h;
        if (voiceAction == null || (cardDecision = this.f299735i) == null) {
            return false;
        }
        return voiceAction.mo81086x() || voiceAction.mo81088z() || (voiceAction.mo81051A() && cardDecision.f236255i && !cardDecision.f236254h);
    }

    /* renamed from: f */
    public final void mo96245f(int i, int i2) {
        String str;
        C58833ax axVar = this.f299741o;
        if (axVar.mo56113h()) {
            String str2 = i != 2 ? i != 3 ? "SHOW_SYSTEM_RESPONSE" : "OFFLINE_ERROR" : "NO_ERROR_MESSAGE_RES_ID";
            switch (i2) {
                case 1:
                    str = "UNKNOWN";
                    break;
                case 2:
                    str = "AUDIO_RECOGNIZE_EXCEPTION";
                    break;
                case 3:
                    str = "EMBEDDED_RECOGNIZER_UNAVAILABLE_EXCEPTION";
                    break;
                case 4:
                    str = "GRAMMAR_COMPILATION_EXCEPTION";
                    break;
                case 5:
                    str = "IMPLICIT_SERVER_ERROR";
                    break;
                case 6:
                    str = "INPUT_STREAM_EXCEPTION";
                    break;
                case 7:
                    str = "LANGUAGE_PACK_NOT_FOUND_EXCEPTION";
                    break;
                case 8:
                    str = "MICROPHONE_PERMISSION_ERROR";
                    break;
                case 9:
                    str = "NETWORK_RECOGNIZE_EXCEPTION";
                    break;
                case 10:
                    str = "NO_MATCH_OFFLINE";
                    break;
                case 11:
                    str = "NO_MATCH_RECOGNIZE_EXCEPTION";
                    break;
                case 12:
                    str = "SPEECH_TIMEOUT_RECOGNIZE_EXCEPTION";
                    break;
                default:
                    str = "null";
                    break;
            }
            if (i2 != 0) {
                ((C83305i) axVar.mo56107c()).mo75579d(new C82482gv("OPA_SEARCH_ERROR_BRANCH", BuildConfig.FLAVOR, str2, str));
                return;
            }
            throw null;
        }
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        ImageInfo imageInfo;
        C108390gy gyVar;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        int ordinal = a.ordinal();
        if (ordinal == 56) {
            C62940bt btVar = C88293wh.f238796a;
            C88246uo uoVar = serviceEventData.f236959a;
            C62940bt r0 = C62942bv.checkIsLite(btVar);
            uoVar.mo58887l(r0);
            if (uoVar.f169962ag.mo58857o(r0.f169971d)) {
                C88295wj wjVar = (C88295wj) serviceEventData.mo81918e(C88293wh.f238796a);
                String str = wjVar.f238800b;
                C87890hj hjVar = wjVar.f238802d;
                if (hjVar == null) {
                    hjVar = C87890hj.f237764c;
                }
                String str2 = null;
                if (hjVar == null) {
                    imageInfo = null;
                } else {
                    imageInfo = new ImageInfo(hjVar.f237767b);
                }
                String str3 = imageInfo != null ? imageInfo.f236269a : null;
                C88337xy[] xyVarArr = (C88337xy[]) wjVar.f238801c.toArray(new C88337xy[0]);
                if (!TextUtils.isEmpty(str) || !ImageInfo.m141972a(imageInfo)) {
                    if (!TextUtils.isEmpty(str)) {
                        mo96246g(str, false, true, 1, 0);
                    }
                    if (!TextUtils.isEmpty(str3) && !this.f299728b.mo95405ap()) {
                        C108411hs hsVar = new C108411hs(str3, (C91189au) this.f299739m.mo27525b());
                        hsVar.mo96611b(m178825i(hsVar));
                        this.f299728b.mo95377S();
                        this.f299728b.mo95430s(hsVar);
                        this.f299737k.mo97173b();
                    }
                    if (r0 > 0) {
                        C108230ba baVar = this.f299728b;
                        C108429ij ijVar = this.f299738l;
                        ArrayList arrayList = new ArrayList();
                        for (C88337xy xyVar : xyVarArr) {
                            if (xyVar.f238904b.isEmpty()) {
                                gyVar = null;
                            } else {
                                gyVar = ijVar.mo96871a(xyVar.f238905c, xyVar.f238904b, (String) null);
                            }
                            if (gyVar != null) {
                                arrayList.add(gyVar);
                            }
                        }
                        baVar.mo95408as(arrayList);
                        this.f299737k.mo97173b();
                    }
                    if (wjVar.f238804f) {
                        this.f299728b.mo95432u(((C108250bu) this.f299731e.mo27525b()).mo96700a(C108248bs.FEEDBACK, new Object[0]));
                        this.f299737k.mo97173b();
                    }
                    String str4 = wjVar.f238803e;
                    C108802ef efVar = this.f299737k;
                    if (true != TextUtils.isEmpty(str4)) {
                        str2 = str4;
                    }
                    efVar.mo97172a(0, str2, "ds-action-rendered");
                }
            }
        } else if (ordinal == 66) {
            this.f299737k.f302543b.f303218D.mo96344a(2);
        }
    }

    /* JADX WARNING: type inference failed for: r5v6, types: [com.google.android.apps.gsa.staticplugins.opa.chatui.bc] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96246g(java.lang.String r11, boolean r12, boolean r13, int r14, int r15) {
        /*
            r10 = this;
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r10.f299728b
            boolean r0 = r0.mo95405ap()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            com.google.android.apps.gsa.search.core.i.t r0 = r10.f299740n
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247760nI
            boolean r0 = r0.mo79746e(r1)
            r1 = 256(0x100, double:1.265E-321)
            r3 = 0
            if (r0 != 0) goto L_0x0040
            com.google.android.apps.gsa.staticplugins.opa.chatui.cf r0 = new com.google.android.apps.gsa.staticplugins.opa.chatui.cf
            r0.<init>()
            r0.f301174d = r11
            if (r15 == 0) goto L_0x0022
            r0.f301164E = r15
        L_0x0022:
            r0.f301170K = r14
            if (r12 == 0) goto L_0x002b
            com.google.android.apps.gsa.shared.util.BitFlags r11 = r0.f301029k
            r11.mo85049c(r3, r1)
        L_0x002b:
            boolean r11 = r10.m178825i(r0)
            r0.mo96611b(r11)
            if (r13 == 0) goto L_0x0039
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r11 = r10.f299728b
            r11.mo95377S()
        L_0x0039:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r11 = r10.f299728b
            r11.mo95430s(r0)
            goto L_0x00b8
        L_0x0040:
            com.google.android.apps.gsa.staticplugins.opa.chatui.cf r0 = new com.google.android.apps.gsa.staticplugins.opa.chatui.cf
            r0.<init>()
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r5 = r10.f299728b
            com.google.android.apps.gsa.staticplugins.opa.chatui.bf r5 = r5.mo95421j()
            int r5 = r5.mo95351a()
            r6 = -1
            int r5 = r5 + r6
            if (r5 < 0) goto L_0x005e
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r7 = r10.f299728b
            com.google.android.apps.gsa.staticplugins.opa.chatui.bf r7 = r7.mo95421j()
            com.google.android.apps.gsa.staticplugins.opa.chatui.bc r7 = r7.mo95352b(r5)
            goto L_0x005f
        L_0x005e:
            r7 = 0
        L_0x005f:
            r8 = 0
            if (r7 == 0) goto L_0x0082
            boolean r9 = m178824h(r7)
            if (r9 == 0) goto L_0x0082
            int r6 = r6 + r5
            if (r6 < 0) goto L_0x0082
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r5 = r10.f299728b
            com.google.android.apps.gsa.staticplugins.opa.chatui.bf r5 = r5.mo95421j()
            com.google.android.apps.gsa.staticplugins.opa.chatui.bc r5 = r5.mo95352b(r6)
            boolean r9 = r5 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf
            if (r9 == 0) goto L_0x0082
            r0 = r5
            com.google.android.apps.gsa.staticplugins.opa.chatui.cf r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf) r0
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r5 = r10.f299728b
            r5.mo95372N(r7)
            r8 = 1
        L_0x0082:
            r0.f301174d = r11
            if (r15 == 0) goto L_0x0088
            r0.f301164E = r15
        L_0x0088:
            r0.f301170K = r14
            if (r12 == 0) goto L_0x0091
            com.google.android.apps.gsa.shared.util.BitFlags r11 = r0.f301029k
            r11.mo85049c(r3, r1)
        L_0x0091:
            boolean r11 = r10.m178825i(r0)
            r0.mo96611b(r11)
            if (r13 == 0) goto L_0x00a7
            if (r7 == 0) goto L_0x00a7
            boolean r11 = m178824h(r7)
            if (r11 == 0) goto L_0x00a7
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r11 = r10.f299728b
            r11.mo95377S()
        L_0x00a7:
            if (r8 == 0) goto L_0x00b3
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r11 = r10.f299728b
            com.google.android.apps.gsa.staticplugins.opa.chatui.bf r11 = r11.mo95421j()
            r11.mo95354d(r6)
            goto L_0x00b8
        L_0x00b3:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r11 = r10.f299728b
            r11.mo95430s(r0)
        L_0x00b8:
            com.google.android.apps.gsa.staticplugins.opa.ef r11 = r10.f299737k
            r11.mo97173b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C107711b.mo96246g(java.lang.String, boolean, boolean, int, int):void");
    }
}
