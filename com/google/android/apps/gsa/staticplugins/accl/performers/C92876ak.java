package com.google.android.apps.gsa.staticplugins.accl.performers;

import android.content.Context;
import com.google.android.apps.gsa.shared.p6976ag.p6979c.C89110d;
import com.google.android.apps.gsa.shared.p6976ag.p6979c.C89113g;
import com.google.android.apps.gsa.shared.p6976ag.p6979c.C89114h;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C63077o;
import dagger.C68214a;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71131r;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71132s;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71133t;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71135v;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.ak */
/* compiled from: PG */
public final class C92876ak extends C22538o {

    /* renamed from: a */
    public static final C59071e f259111a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.ak");

    /* renamed from: b */
    final C68214a f259112b;

    /* renamed from: c */
    public final C89110d f259113c;

    /* renamed from: d */
    private final Context f259114d;

    /* renamed from: e */
    private final C89113g f259115e;

    /* renamed from: f */
    private final C89114h f259116f;

    /* renamed from: g */
    private final C22695ah f259117g;

    /* renamed from: h */
    private final C68214a f259118h;

    /* renamed from: i */
    private final C22871g f259119i;

    /* renamed from: j */
    private final C37215b f259120j;

    public C92876ak(Context context, C68214a aVar, C89113g gVar, C89110d dVar, C89114h hVar, C22695ah ahVar, C68214a aVar2, C22871g gVar2, C37215b bVar) {
        this.f259114d = context;
        this.f259112b = aVar;
        this.f259115e = gVar;
        this.f259113c = dVar;
        this.f259116f = hVar;
        this.f259117g = ahVar;
        this.f259118h = aVar2;
        this.f259119i = gVar2;
        this.f259120j = bVar;
    }

    /* renamed from: b */
    public static String m152919b(C52115fu fuVar) {
        int i = fuVar.f136755a;
        return (i & 16) != 0 ? fuVar.f136760f : (i & 64) != 0 ? fuVar.f136762h : (i & 1) != 0 ? fuVar.f136756b : "SETTING_UNSPECIFIED";
    }

    /* renamed from: d */
    static final C60870cx m152920d(boolean z, boolean z2) {
        boolean z3 = false;
        if (z && z2) {
            z3 = true;
        }
        return C60856cj.m92900i(C22402a.m41821a("is_dependent_setting_modified", "google.protobuf.BoolValue", C63077o.m96099a(z3)));
    }

    /* renamed from: e */
    private final C60870cx m152921e(boolean z, boolean z2, C52115fu fuVar) {
        if (z) {
            return C60856cj.m92900i(C22402a.f61894b);
        }
        if (!z2) {
            return C60856cj.m92900i(C22402a.f61893a);
        }
        if ((fuVar.f136755a & 1024) == 0) {
            return C60856cj.m92900i(C22402a.f61893a);
        }
        return this.f259119i.mo28204d("Delayed return...", (long) fuVar.f136766l, new C92874ai(this, fuVar));
    }

    /* renamed from: f */
    private static C71132s m152922f(String str) {
        C71131r rVar = (C71131r) C71132s.f189749c.createBuilder();
        C71133t tVar = (C71133t) C71135v.f189755d.createBuilder();
        tVar.copyOnWrite();
        C71135v vVar = (C71135v) tVar.instance;
        str.getClass();
        vVar.f189757a |= 1;
        vVar.f189758b = str;
        tVar.copyOnWrite();
        C71135v vVar2 = (C71135v) tVar.instance;
        vVar2.f189759c = 1;
        vVar2.f189757a |= 2;
        C71135v vVar3 = (C71135v) tVar.build();
        rVar.copyOnWrite();
        C71132s sVar = (C71132s) rVar.instance;
        vVar3.getClass();
        sVar.f189753b = vVar3;
        sVar.f189752a |= 1;
        return (C71132s) rVar.build();
    }

    /* renamed from: g */
    private final void m152923g(C62722b bVar) {
        m152925i(bVar, "SETTING_UNSPECIFIED");
        mo87475c(bVar, "SETTING_UNSPECIFIED");
    }

    /* renamed from: h */
    private final void m152924h(C37252a aVar, C62722b bVar, String str) {
        C37253b bVar2 = (C37253b) aVar;
        bVar2.mo40792p(C71132s.f189750d, m152922f(str));
        C37215b bVar3 = this.f259120j;
        aVar.mo40781e(bVar);
        bVar2.mo40795s("settingsPerformerAGSA_C", "device.MODIFY_SETTING");
        bVar3.mo19974a(aVar);
    }

    /* renamed from: i */
    private final void m152925i(C62722b bVar, String str) {
        m152924h(C37176a.f96830aA.mo40779c(), bVar, str);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01f6, code lost:
        r7 = com.google.assistant.p3897e.p3921j.C52114ft.m86509a(r3.f136759e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01fc, code lost:
        if (r7 != 0) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01fe, code lost:
        r18 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0201, code lost:
        r18 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0203, code lost:
        r7 = r15.mo83094d(r12, r17, r18, r3.f136758d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r7 = com.google.protos.p4850an.p4855d.p4857b.C63490p.UNSPECIFIED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01eb, code lost:
        r7 = com.google.assistant.p3897e.p3921j.C52112fr.m86508b(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01ef, code lost:
        if (r7 != 0) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01f1, code lost:
        r17 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f4, code lost:
        r17 = r7;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x01ca */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02a7 A[Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02bc A[Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02eb A[ADDED_TO_REGION, Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0301 A[Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0355 A[Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0357 A[Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x035d A[Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x035e A[Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0370 A[Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x037a A[Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0383 A[Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03a3 A[Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x018d A[Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x018f A[Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01a1 A[Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20765a(com.google.assistant.p3897e.p3921j.C51809dy r22, com.google.android.libraries.gsa.conversation.clientop.C22434e r23) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            com.google.common.f.e r3 = f259111a
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r4 = "Enter AGSA-C modifySettingPerformer."
            r5 = 13096(0x3328, float:1.8351E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)
            java.lang.String r3 = r2.f135936b
            java.lang.String r4 = "device.MODIFY_SETTING"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0464
            com.google.assistant.e.j.dw r3 = r2.f135938d     // Catch:{ RuntimeException -> 0x045c }
            if (r3 != 0) goto L_0x0021
            com.google.assistant.e.j.dw r3 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b     // Catch:{ RuntimeException -> 0x045c }
        L_0x0021:
            java.lang.String r4 = "modify_setting_args"
            com.google.assistant.e.j.fu r5 = com.google.assistant.p3897e.p3921j.C52115fu.f136753n     // Catch:{ RuntimeException -> 0x045c }
            com.google.protobuf.eb r5 = r5.getParserForType()     // Catch:{ RuntimeException -> 0x045c }
            com.google.protobuf.MessageLite r3 = m41992m(r3, r4, r5)     // Catch:{ RuntimeException -> 0x045c }
            com.google.assistant.e.j.fu r3 = (com.google.assistant.p3897e.p3921j.C52115fu) r3     // Catch:{ RuntimeException -> 0x045c }
            com.google.assistant.e.j.dw r2 = r2.f135938d     // Catch:{ RuntimeException -> 0x045c }
            if (r2 != 0) goto L_0x0035
            com.google.assistant.e.j.dw r2 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b     // Catch:{ RuntimeException -> 0x045c }
        L_0x0035:
            com.google.assistant.e.j.fu r4 = com.google.assistant.p3897e.p3921j.C52115fu.f136753n     // Catch:{ RuntimeException -> 0x045c }
            com.google.protobuf.eb r4 = r4.getParserForType()     // Catch:{ RuntimeException -> 0x045c }
            java.lang.String r5 = "modify_dependent_setting_args"
            com.google.protobuf.cq r2 = r2.f135932a     // Catch:{ RuntimeException -> 0x045c }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ RuntimeException -> 0x045c }
        L_0x0043:
            boolean r6 = r2.hasNext()     // Catch:{ RuntimeException -> 0x045c }
            if (r6 == 0) goto L_0x006e
            java.lang.Object r6 = r2.next()     // Catch:{ RuntimeException -> 0x045c }
            com.google.assistant.e.j.kc r6 = (com.google.assistant.p3897e.p3921j.C52232kc) r6     // Catch:{ RuntimeException -> 0x045c }
            java.lang.String r7 = r6.f137065b     // Catch:{ RuntimeException -> 0x045c }
            boolean r7 = r7.equals(r5)     // Catch:{ RuntimeException -> 0x045c }
            if (r7 == 0) goto L_0x0043
            com.google.assistant.e.j.ka r2 = r6.f137066c     // Catch:{ RuntimeException -> 0x045c }
            if (r2 != 0) goto L_0x005d
            com.google.assistant.e.j.ka r2 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ RuntimeException -> 0x045c }
        L_0x005d:
            com.google.protobuf.z r2 = r2.f137061c     // Catch:{ RuntimeException -> 0x045c }
            com.google.protobuf.ba r5 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ RuntimeException -> 0x045c }
            java.lang.Object r2 = r4.mo59011j(r2, r5)     // Catch:{ RuntimeException -> 0x045c }
            com.google.protobuf.MessageLite r2 = (com.google.protobuf.MessageLite) r2     // Catch:{ RuntimeException -> 0x045c }
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)     // Catch:{ RuntimeException -> 0x045c }
            goto L_0x0070
        L_0x006e:
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a     // Catch:{ RuntimeException -> 0x045c }
        L_0x0070:
            java.lang.Object r2 = r2.mo56111f()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.assistant.e.j.fu r2 = (com.google.assistant.p3897e.p3921j.C52115fu) r2     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            int r4 = r3.f136755a     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r5 = r4 & 64
            if (r5 == 0) goto L_0x007d
            goto L_0x0093
        L_0x007d:
            r5 = r4 & 1
            if (r5 != 0) goto L_0x0093
            r4 = r4 & 16
            if (r4 == 0) goto L_0x0086
            goto L_0x0093
        L_0x0086:
            com.google.net.a.a.b r2 = com.google.net.p4726a.p4727a.C62722b.INVALID_ARGUMENT     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r4 = "SETTING_UNSPECIFIED"
            r1.m152925i(r2, r4)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.android.libraries.gsa.conversation.clientop.k r2 = new com.google.android.libraries.gsa.conversation.clientop.k     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r2.<init>()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            throw r2     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
        L_0x0093:
            com.google.net.a.a.b r4 = com.google.net.p4726a.p4727a.C62722b.OK     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r5 = m152919b(r3)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r1.m152925i(r4, r5)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            int r4 = r3.f136755a     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r4 = r4 & 128(0x80, float:1.794E-43)
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0132
            java.lang.String r4 = r3.f136760f     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r7 = "DO_NOT_DISTURB"
            boolean r4 = r4.equals(r7)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r4 == 0) goto L_0x0132
            int r4 = r3.f136757c     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            int r4 = com.google.assistant.p3897e.p3921j.C52112fr.m86508b(r4)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r4 != 0) goto L_0x00b8
            goto L_0x0132
        L_0x00b8:
            if (r4 != r5) goto L_0x0132
            java.lang.String r2 = "android.settings.VOICE_CONTROL_DO_NOT_DISTURB_MODE"
            java.lang.String r4 = "android.intent.category.VOICE"
            java.lang.String r5 = "android.settings.extra.do_not_disturb_mode_enabled"
            java.lang.String r7 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r8 = "android.settings.extra.do_not_disturb_mode_minutes"
            long r9 = r3.f136763i     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            j$.time.Duration r9 = p3186j$.time.Duration.ofMillis(r9)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            long r9 = r9.toMinutes()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            int r10 = (int) r9     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            android.content.Intent r9 = new android.content.Intent     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r9.<init>()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            android.content.Intent r2 = r9.setAction(r2)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            android.content.Intent r2 = r2.addCategory(r4)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r4 = "com.android.settings"
            android.content.Intent r2 = r2.setPackage(r4)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            android.content.Intent r2 = r2.putExtra(r5, r6)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r4 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            android.content.Intent r2 = r2.putExtra(r7, r4)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r4 = "IsVoiceQuery"
            android.content.Intent r2 = r2.putExtra(r4, r6)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r4 = "NoUiQuery"
            android.content.Intent r2 = r2.putExtra(r4, r6)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            android.content.Intent r2 = r2.putExtra(r8, r10)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.android.libraries.gsa.conversation.h.ah r4 = r1.f259117g     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            boolean r4 = r4.mo27809c()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r4 == 0) goto L_0x0114
            com.google.android.libraries.gsa.conversation.h.ah r4 = r1.f259117g     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            boolean r4 = r4.mo27808b(r2)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r4 == 0) goto L_0x0114
            com.google.assistant.e.j.ec r2 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61893a     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92900i(r2)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            goto L_0x0435
        L_0x0114:
            com.google.android.libraries.gsa.conversation.h.ah r4 = r1.f259117g     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            boolean r2 = r4.mo27807a(r2)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r2 == 0) goto L_0x0124
            com.google.assistant.e.j.ec r2 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61893a     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92900i(r2)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            goto L_0x0435
        L_0x0124:
            com.google.assistant.e.j.kf r2 = com.google.assistant.p3897e.p3921j.C52235kf.UNKNOWN     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r4 = "Failed to turn on DO_NOT_DISTURB with duration"
            com.google.assistant.e.j.ec r2 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r2, r4)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92900i(r2)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            goto L_0x0435
        L_0x0132:
            dagger.a r4 = r1.f259112b     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.Object r4 = r4.mo27525b()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.android.apps.gsa.search.core.i.t r4 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r4     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            dagger.a r7 = r1.f259118h     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.Object r7 = r7.mo27525b()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.common.base.ax r7 = (com.google.common.base.C58833ax) r7     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            boolean r7 = r7.mo56113h()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r8 = 0
            if (r7 == 0) goto L_0x015d
            dagger.a r7 = r1.f259118h     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.Object r7 = r7.mo27525b()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.common.base.ax r7 = (com.google.common.base.C58833ax) r7     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.Object r7 = r7.mo56107c()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.android.apps.gsa.nga.api.bn r7 = (com.google.android.apps.gsa.nga.api.C74713bn) r7     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            boolean r7 = r7.mo71077b()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r7 != 0) goto L_0x0165
        L_0x015d:
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247307eg     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            boolean r7 = r4.mo79746e(r7)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r7 == 0) goto L_0x0167
        L_0x0165:
            r7 = 1
            goto L_0x0168
        L_0x0167:
            r7 = 0
        L_0x0168:
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247351fX     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            boolean r9 = r4.mo79746e(r9)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r9 == 0) goto L_0x0177
            boolean r9 = r3.f136764j     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r9 != 0) goto L_0x0175
            goto L_0x0177
        L_0x0175:
            r9 = 1
            goto L_0x0181
        L_0x0177:
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90028cg.f248172b     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            boolean r9 = r4.mo79746e(r9)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r9 == 0) goto L_0x0180
            goto L_0x0175
        L_0x0180:
            r9 = 0
        L_0x0181:
            boolean r10 = r3.f136765k     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r10 == 0) goto L_0x018f
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90028cg.f248171a     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            boolean r10 = r4.mo79746e(r10)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r10 == 0) goto L_0x018f
            r10 = 1
            goto L_0x0190
        L_0x018f:
            r10 = 0
        L_0x0190:
            r11 = 0
            if (r7 == 0) goto L_0x02bc
            int r7 = r3.f136755a     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r7 = r7 & 64
            if (r7 == 0) goto L_0x02bc
            java.lang.String r7 = r3.f136762h     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            boolean r7 = r7.isEmpty()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r7 != 0) goto L_0x02bc
            java.lang.String r7 = r3.f136762h     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.android.libraries.search.b.i.g r12 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96832aC     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.android.libraries.search.b.i.a r12 = r12.mo40779c()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.net.a.a.b r13 = com.google.net.p4726a.p4727a.C62722b.OK     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r14 = m152919b(r3)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r1.m152924h(r12, r13, r14)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.android.apps.gsa.search.shared.h.m r12 = new com.google.android.apps.gsa.search.shared.h.m     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            android.content.Context r13 = r1.f259114d     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r12.<init>(r13, r7, r11)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            boolean r7 = r12.mo81692d()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r7 == 0) goto L_0x02cb
            com.google.android.apps.gsa.shared.ag.c.h r15 = r1.f259116f     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r3 == 0) goto L_0x02a1
            java.lang.String r7 = r3.f136760f     // Catch:{ IllegalArgumentException -> 0x01ca }
            com.google.protos.an.d.b.p r7 = com.google.protos.p4850an.p4855d.p4857b.C63490p.m96249a(r7)     // Catch:{ IllegalArgumentException -> 0x01ca }
            goto L_0x01cc
        L_0x01ca:
            com.google.protos.an.d.b.p r7 = com.google.protos.p4850an.p4855d.p4857b.C63490p.UNSPECIFIED     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
        L_0x01cc:
            int r13 = r3.f136755a     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r14 = r13 & 2
            if (r14 == 0) goto L_0x028a
            int r14 = r3.f136757c     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            int r16 = com.google.assistant.p3897e.p3921j.C52112fr.m86508b(r14)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r16 != 0) goto L_0x01dc
            r16 = 1
        L_0x01dc:
            int r16 = r16 + -1
            switch(r16) {
                case 1: goto L_0x0255;
                case 2: goto L_0x0241;
                case 3: goto L_0x020f;
                case 4: goto L_0x01eb;
                case 5: goto L_0x01eb;
                case 6: goto L_0x01e5;
                default: goto L_0x01e1;
            }     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
        L_0x01e1:
            com.google.common.f.e r7 = com.google.android.apps.gsa.shared.p6976ag.p6979c.C89114h.f241576a     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            goto L_0x0269
        L_0x01e5:
            r7 = r13 & 32
            if (r7 == 0) goto L_0x01eb
            goto L_0x02a1
        L_0x01eb:
            int r7 = com.google.assistant.p3897e.p3921j.C52112fr.m86508b(r14)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r7 != 0) goto L_0x01f4
            r17 = 1
            goto L_0x01f6
        L_0x01f4:
            r17 = r7
        L_0x01f6:
            int r7 = r3.f136759e     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            int r7 = com.google.assistant.p3897e.p3921j.C52114ft.m86509a(r7)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r7 != 0) goto L_0x0201
            r18 = 1
            goto L_0x0203
        L_0x0201:
            r18 = r7
        L_0x0203:
            double r13 = r3.f136758d     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r16 = r12
            r19 = r13
            boolean r7 = r15.mo83094d(r16, r17, r18, r19)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            goto L_0x02a2
        L_0x020f:
            android.content.Context r7 = r12.f236584b     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            androidx.slice.Slice r13 = r12.f236585c     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            androidx.slice.i r14 = new androidx.slice.i     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r14.<init>(r7, r13)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.util.List r7 = r14.mo8619h()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            boolean r13 = r7.isEmpty()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r13 == 0) goto L_0x0224
            goto L_0x02a1
        L_0x0224:
            java.lang.Object r7 = r7.get(r8)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            androidx.slice.a.a r7 = (androidx.slice.p194a.C4094a) r7     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            android.content.Intent r13 = new android.content.Intent     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r13.<init>()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r14 = "android.app.slice.extra.TOGGLE_STATE"
            boolean r15 = r7.f13111f     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r15 = r15 ^ r6
            android.content.Intent r13 = r13.putExtra(r14, r15)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            android.app.PendingIntent r7 = r7.mo8605b()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            boolean r7 = r12.mo81691c(r7, r13)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            goto L_0x02a2
        L_0x0241:
            com.google.common.b.ij r13 = com.google.android.apps.gsa.shared.p6976ag.p6979c.C89108b.f241541a     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            boolean r13 = r13.contains(r7)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r13 == 0) goto L_0x0250
            r13 = -100
            boolean r7 = r15.mo83093c(r12, r7, r13)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            goto L_0x02a2
        L_0x0250:
            boolean r7 = r12.mo81693e(r8)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            goto L_0x02a2
        L_0x0255:
            com.google.common.b.ij r13 = com.google.android.apps.gsa.shared.p6976ag.p6979c.C89108b.f241541a     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            boolean r13 = r13.contains(r7)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r13 == 0) goto L_0x0264
            r13 = 100
            boolean r7 = r15.mo83093c(r12, r7, r13)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            goto L_0x02a2
        L_0x0264:
            boolean r7 = r12.mo81693e(r6)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            goto L_0x02a2
        L_0x0269:
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r13 = 10981(0x2ae5, float:1.5388E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r13)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r13 = "Unsupported change type %s"
            int r14 = r3.f136757c     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            int r14 = com.google.assistant.p3897e.p3921j.C52112fr.m86508b(r14)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r14 != 0) goto L_0x0282
            r14 = 1
        L_0x0282:
            java.lang.String r14 = com.google.assistant.p3897e.p3921j.C52112fr.m86507a(r14)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r7.mo56389s(r13, r14)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            goto L_0x02a1
        L_0x028a:
            android.content.Context r7 = r12.f236584b     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            androidx.slice.Slice r13 = r12.f236585c     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            androidx.slice.i r14 = new androidx.slice.i     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r14.<init>(r7, r13)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            androidx.slice.a.a r7 = r14.f13140f     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r7 != 0) goto L_0x0298
            goto L_0x02a1
        L_0x0298:
            android.app.PendingIntent r7 = r7.mo8605b()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            boolean r7 = r12.mo81691c(r7, r11)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            goto L_0x02a2
        L_0x02a1:
            r7 = 0
        L_0x02a2:
            r12.mo81690a()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r7 == 0) goto L_0x02cb
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96833aD     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.android.libraries.search.b.i.a r2 = r2.mo40779c()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.net.a.a.b r4 = com.google.net.p4726a.p4727a.C62722b.OK     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r5 = m152919b(r3)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r1.m152924h(r2, r4, r5)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.common.util.concurrent.cx r2 = r1.m152921e(r9, r10, r3)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            goto L_0x0435
        L_0x02bc:
            com.google.android.libraries.search.b.i.g r7 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96832aC     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.android.libraries.search.b.i.a r7 = r7.mo40779c()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.net.a.a.b r12 = com.google.net.p4726a.p4727a.C62722b.INVALID_ARGUMENT     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r13 = m152919b(r3)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r1.m152924h(r7, r12, r13)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
        L_0x02cb:
            com.google.android.libraries.search.b.i.g r7 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96833aD     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.android.libraries.search.b.i.a r7 = r7.mo40779c()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.net.a.a.b r12 = com.google.net.p4726a.p4727a.C62722b.UNAVAILABLE     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r13 = m152919b(r3)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r1.m152924h(r7, r12, r13)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r7 = new java.lang.String     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r12 = r23
            com.google.android.libraries.gsa.conversation.clientop.c r12 = (com.google.android.libraries.gsa.conversation.clientop.C22407c) r12     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            byte[] r12 = r12.f61900b     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r7.<init>(r12)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            boolean r12 = android.text.TextUtils.isEmpty(r7)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r12 == 0) goto L_0x02ff
            if (r3 == 0) goto L_0x02fe
            int r7 = r3.f136755a     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r7 = r7 & r6
            if (r7 == 0) goto L_0x02fe
            java.lang.String r7 = r3.f136756b     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            boolean r7 = r7.isEmpty()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r7 == 0) goto L_0x02fb
            goto L_0x02fe
        L_0x02fb:
            java.lang.String r7 = r3.f136756b     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            goto L_0x02ff
        L_0x02fe:
            r7 = r11
        L_0x02ff:
            if (r7 != 0) goto L_0x033c
            com.google.android.apps.gsa.shared.m.d r12 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247185cQ     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            boolean r12 = r4.mo79746e(r12)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r12 == 0) goto L_0x0310
            int r12 = r3.f136755a     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r12 = r12 & 16
            if (r12 == 0) goto L_0x0310
            goto L_0x033c
        L_0x0310:
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96834aE     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.android.libraries.search.b.i.a r2 = r2.mo40779c()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.net.a.a.b r4 = com.google.net.p4726a.p4727a.C62722b.INVALID_ARGUMENT     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r5 = m152919b(r3)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r1.m152924h(r2, r4, r5)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96835aF     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.android.libraries.search.b.i.a r2 = r2.mo40779c()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.net.a.a.b r4 = com.google.net.p4726a.p4727a.C62722b.INVALID_ARGUMENT     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r5 = m152919b(r3)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r1.m152924h(r2, r4, r5)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.assistant.e.j.kf r2 = com.google.assistant.p3897e.p3921j.C52235kf.INTERNAL     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r4 = "Legacy flow is not supported."
            com.google.assistant.e.j.ec r2 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r2, r4)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92900i(r2)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            goto L_0x0435
        L_0x033c:
            com.google.android.libraries.search.b.i.g r12 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96834aE     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.android.libraries.search.b.i.a r12 = r12.mo40779c()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.net.a.a.b r13 = com.google.net.p4726a.p4727a.C62722b.OK     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r14 = m152919b(r3)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r1.m152924h(r12, r13, r14)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.android.apps.gsa.shared.ag.c.d r12 = r1.f259113c     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r13 = r3.f136760f     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.android.apps.gsa.shared.ag.c.c r7 = r12.mo83088a(r7, r13)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r2 != 0) goto L_0x0357
            r12 = r11
            goto L_0x0359
        L_0x0357:
            java.lang.String r12 = r2.f136756b     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
        L_0x0359:
            com.google.android.apps.gsa.shared.ag.c.d r13 = r1.f259113c     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r2 != 0) goto L_0x035e
            goto L_0x0360
        L_0x035e:
            java.lang.String r11 = r2.f136760f     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
        L_0x0360:
            com.google.android.apps.gsa.shared.ag.c.c r11 = r13.mo83088a(r12, r11)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r12 = r11.mo83085f(r8)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.android.apps.gsa.shared.ag.c.h r13 = r1.f259116f     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            boolean r2 = r13.mo83092b(r11, r2)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r12 == 0) goto L_0x037a
            java.lang.String r11 = r11.mo83085f(r8)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            boolean r11 = r12.equals(r11)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r11 = r11 ^ r6
            goto L_0x037b
        L_0x037a:
            r11 = 0
        L_0x037b:
            com.google.android.apps.gsa.shared.ag.c.h r12 = r1.f259116f     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            boolean r7 = r12.mo83092b(r7, r3)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r7 == 0) goto L_0x03a3
            com.google.android.libraries.search.b.i.g r4 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96835aF     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.android.libraries.search.b.i.a r4 = r4.mo40779c()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.net.a.a.b r5 = com.google.net.p4726a.p4727a.C62722b.OK     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r6 = m152919b(r3)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r1.m152924h(r4, r5, r6)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r9 != 0) goto L_0x039d
            if (r10 == 0) goto L_0x0397
            goto L_0x039d
        L_0x0397:
            com.google.common.util.concurrent.cx r2 = m152920d(r2, r11)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            goto L_0x0435
        L_0x039d:
            com.google.common.util.concurrent.cx r2 = r1.m152921e(r9, r10, r3)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            goto L_0x0435
        L_0x03a3:
            com.google.android.libraries.search.b.i.g r7 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96835aF     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.android.libraries.search.b.i.a r7 = r7.mo40779c()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.net.a.a.b r12 = com.google.net.p4726a.p4727a.C62722b.UNAVAILABLE     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r13 = m152919b(r3)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r1.m152924h(r7, r12, r13)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247185cQ     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            boolean r4 = r4.mo79746e(r7)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r4 == 0) goto L_0x041f
            int r4 = r3.f136755a     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0401
            com.google.android.libraries.search.b.i.g r4 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96836aG     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.android.libraries.search.b.i.a r4 = r4.mo40779c()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.net.a.a.b r5 = com.google.net.p4726a.p4727a.C62722b.OK     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r7 = m152919b(r3)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r1.m152924h(r4, r5, r7)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            int r4 = r3.f136757c     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            int r4 = com.google.assistant.p3897e.p3921j.C52112fr.m86508b(r4)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r4 != 0) goto L_0x03d7
            r4 = 1
        L_0x03d7:
            com.google.android.apps.gsa.shared.ag.c.g r5 = r1.f259115e     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.android.apps.gsa.shared.ag.c.f r4 = r5.mo83091a(r4)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            boolean r4 = r4.mo83090b(r3)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r4 == 0) goto L_0x0410
            com.google.android.libraries.search.b.i.g r4 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96837aH     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.android.libraries.search.b.i.a r4 = r4.mo40779c()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.net.a.a.b r5 = com.google.net.p4726a.p4727a.C62722b.OK     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r6 = m152919b(r3)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r1.m152924h(r4, r5, r6)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            if (r9 != 0) goto L_0x03fc
            if (r10 == 0) goto L_0x03f7
            goto L_0x03fc
        L_0x03f7:
            com.google.common.util.concurrent.cx r2 = m152920d(r2, r11)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            goto L_0x0435
        L_0x03fc:
            com.google.common.util.concurrent.cx r2 = r1.m152921e(r9, r10, r3)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            goto L_0x0435
        L_0x0401:
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96836aG     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.android.libraries.search.b.i.a r2 = r2.mo40779c()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.net.a.a.b r4 = com.google.net.p4726a.p4727a.C62722b.INVALID_ARGUMENT     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r5 = m152919b(r3)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r1.m152924h(r2, r4, r5)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
        L_0x0410:
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96837aH     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.android.libraries.search.b.i.a r2 = r2.mo40779c()     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.net.a.a.b r4 = com.google.net.p4726a.p4727a.C62722b.UNAVAILABLE     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r5 = m152919b(r3)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r1.m152924h(r2, r4, r5)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
        L_0x041f:
            com.google.assistant.e.j.kf r2 = com.google.assistant.p3897e.p3921j.C52235kf.INTERNAL     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r5 = r3.f136760f     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r4[r8] = r5     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            java.lang.String r5 = "Setting %s is not available or not updated as intended"
            java.lang.String r4 = java.lang.String.format(r5, r4)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.assistant.e.j.ec r2 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r2, r4)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92900i(r2)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
        L_0x0435:
            com.google.android.apps.gsa.staticplugins.accl.performers.aj r4 = new com.google.android.apps.gsa.staticplugins.accl.performers.aj     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            r4.<init>(r1, r3)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.common.util.concurrent.bg r5 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.common.util.concurrent.bz r4 = com.google.apps.tiktok.tracing.C47810es.m84974n(r4)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            com.google.common.util.concurrent.C60856cj.m92911t(r2, r4, r5)     // Catch:{ k -> 0x0450, RuntimeException -> 0x0444 }
            return r2
        L_0x0444:
            r0 = move-exception
            r2 = r0
            com.google.net.a.a.b r4 = com.google.net.p4726a.p4727a.C62722b.INTERNAL
            java.lang.String r3 = m152919b(r3)
            r1.mo87475c(r4, r3)
            throw r2
        L_0x0450:
            r0 = move-exception
            r2 = r0
            com.google.net.a.a.b r4 = com.google.net.p4726a.p4727a.C62722b.INVALID_ARGUMENT
            java.lang.String r3 = m152919b(r3)
            r1.mo87475c(r4, r3)
            throw r2
        L_0x045c:
            r0 = move-exception
            r2 = r0
            com.google.net.a.a.b r3 = com.google.net.p4726a.p4727a.C62722b.INVALID_ARGUMENT
            r1.m152923g(r3)
            throw r2
        L_0x0464:
            com.google.net.a.a.b r3 = com.google.net.p4726a.p4727a.C62722b.INVALID_ARGUMENT
            r1.m152923g(r3)
            com.google.android.libraries.gsa.conversation.clientop.d r3 = new com.google.android.libraries.gsa.conversation.clientop.d
            r3.<init>(r2)
            goto L_0x0470
        L_0x046f:
            throw r3
        L_0x0470:
            goto L_0x046f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.accl.performers.C92876ak.mo20765a(com.google.assistant.e.j.dy, com.google.android.libraries.gsa.conversation.clientop.e):com.google.common.util.concurrent.cx");
    }

    /* renamed from: c */
    public final void mo87475c(C62722b bVar, String str) {
        C37215b bVar2 = this.f259120j;
        C37252a c = C37176a.f96831aB.mo40805c(bVar);
        C37253b bVar3 = (C37253b) c;
        bVar3.mo40792p(C71132s.f189750d, m152922f(str));
        bVar3.mo40795s("settingsPerformerAGSA_C", "device.MODIFY_SETTING");
        bVar2.mo19974a(c);
    }
}
