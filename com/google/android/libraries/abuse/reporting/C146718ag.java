package com.google.android.libraries.abuse.reporting;

import android.os.Handler;
import android.support.p031v4.app.FragmentManager;
import android.util.Pair;
import android.view.ViewTreeObserver;
import com.google.p335a.p336a.C6580b;
import com.google.p335a.p336a.C6582d;
import com.google.p335a.p336a.C6588j;
import com.google.p335a.p336a.C6594p;
import com.google.p335a.p336a.C6597s;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.abuse.reporting.ag */
/* compiled from: PG */
public final class C146718ag implements C146713ab {

    /* renamed from: a */
    public final AtomicBoolean f396212a = new AtomicBoolean(true);

    /* renamed from: b */
    final C146717af f396213b;

    /* renamed from: c */
    public final C146726ao f396214c;

    /* renamed from: d */
    public final ReportAbuseComponentState f396215d;

    /* renamed from: e */
    public final Handler f396216e;

    /* renamed from: f */
    private final FragmentManager f396217f;

    /* JADX WARNING: type inference failed for: r8v0, types: [android.content.Context, com.google.android.libraries.abuse.reporting.af] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C146718ag(android.content.Context r8, android.support.p031v4.app.FragmentManager r9, com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r10) {
        /*
            r7 = this;
            r7.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 1
            r0.<init>(r1)
            r7.f396212a = r0
            r7.f396213b = r8
            r7.f396217f = r9
            android.os.Handler r8 = new android.os.Handler
            r8.<init>()
            r7.f396216e = r8
            r7.f396215d = r10
            com.google.android.libraries.abuse.reporting.ao r8 = new com.google.android.libraries.abuse.reporting.ao
            r8.<init>()
            r7.f396214c = r8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = r10.mo123528d(r0)
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = r10.mo123528d(r2)
            r8.f396232a = r0
            r8.f396233b = r2
            java.lang.String r0 = "finish_reporting"
            com.google.a.a.d r0 = r10.mo123525a(r0)
            r2 = 19
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = r10.mo123528d(r2)
            r3 = 5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r10.mo123528d(r3)
            java.lang.String r0 = r0.f19577e
            r4 = 4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = r10.mo123528d(r4)
            r5 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r5 = r10.mo123528d(r5)
            r6 = 15
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r10 = r10.mo123528d(r6)
            r8.f396236e = r3
            r8.f396237f = r0
            r8.f396238g = r2
            r8.f396239h = r4
            r8.f396234c = r5
            r8.f396235d = r10
            android.support.v4.app.a r10 = new android.support.v4.app.a
            r10.<init>((android.support.p031v4.app.FragmentManager) r9)
            r9 = 4097(0x1001, float:5.741E-42)
            r10.f814j = r9
            r9 = 16908290(0x1020002, float:2.3877235E-38)
            r0 = 0
            r10.mo511h(r9, r8, r0, r1)
            r8 = 0
            r10.mo505b(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.abuse.reporting.C146718ag.<init>(android.content.Context, android.support.v4.app.FragmentManager, com.google.android.libraries.abuse.reporting.ReportAbuseComponentState):void");
    }

    /* renamed from: e */
    private final void m239061e(String str) {
        int i;
        if (str.equals("undo")) {
            m239064h();
            return;
        }
        C6582d a = this.f396215d.mo123525a(str);
        C6594p pVar = this.f396215d.f396191f;
        if (pVar == null || (pVar.f19602a & 1) == 0) {
            i = -1;
        } else {
            C6580b bVar = pVar.f19603b;
            if (bVar == null) {
                bVar = C6580b.f19567c;
            }
            i = bVar.f19570b;
        }
        this.f396213b.mo123516o(this.f396215d.f396189d, i, a.f19575c, (String) null, (List) null);
    }

    /* renamed from: f */
    private final void m239062f() {
        int i;
        ArrayList arrayList;
        ReportAbuseComponentState reportAbuseComponentState = this.f396215d;
        C6588j b = reportAbuseComponentState.mo123526b(reportAbuseComponentState.f396191f.f19604c);
        C6594p pVar = this.f396215d.f396191f;
        if (pVar == null || (pVar.f19602a & 1) == 0) {
            i = -1;
        } else {
            C6580b bVar = pVar.f19603b;
            if (bVar == null) {
                bVar = C6580b.f19567c;
            }
            i = bVar.f19570b;
        }
        if ((b.f19588a & 4) != 0 && !b.f19591d.isEmpty()) {
            if (!b.f19593f.isEmpty()) {
                C62971cq<C6597s> cqVar = b.f19593f;
                ArrayList arrayList2 = new ArrayList();
                for (C6597s sVar : cqVar) {
                    arrayList2.add(Pair.create(sVar.f19619b, sVar.f19620c));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            this.f396213b.mo123516o(this.f396215d.f396189d, i, -1, b.f19591d, arrayList);
            m239060d(false);
        }
        if (b.f19590c) {
            m239063g(true);
        } else {
            m239060d(false);
        }
    }

    /* renamed from: g */
    private final void m239063g(boolean z) {
        this.f396212a.set(false);
        C146717af afVar = this.f396213b;
        C6580b bVar = this.f396215d.f396191f.f19603b;
        if (bVar == null) {
            bVar = C6580b.f19567c;
        }
        afVar.mo123519q(bVar);
        this.f396215d.f396189d = true;
        if (z) {
            m239060d(true);
        }
        this.f396212a.set(true);
    }

    /* renamed from: h */
    private final void m239064h() {
        this.f396213b.mo123520r();
    }

    /* renamed from: a */
    public final void mo123545a(String str, ArrayList arrayList, ArrayList arrayList2, C6588j jVar, int i, int i2, boolean z) {
        ReportAbuseCardConfigParcel reportAbuseCardConfigParcel = new ReportAbuseCardConfigParcel(str, arrayList, arrayList2, jVar, i, i2, z);
        ReportAbuseComponentState reportAbuseComponentState = this.f396215d;
        reportAbuseComponentState.f396188c.add(reportAbuseComponentState.f396190e);
        reportAbuseComponentState.f396190e = arrayList;
        reportAbuseComponentState.f396187b.add(reportAbuseCardConfigParcel);
        C146726ao aoVar = this.f396214c;
        if (aoVar.f396242k > 0) {
            ViewTreeObserver viewTreeObserver = aoVar.f396240i.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new C146723al(aoVar, viewTreeObserver));
        }
        aoVar.mo123558c(reportAbuseCardConfigParcel);
        aoVar.mo123563h();
        aoVar.mo123564i(reportAbuseCardConfigParcel);
    }

    /* renamed from: b */
    public final void mo123546b() {
        int i;
        this.f396216e.removeCallbacksAndMessages((Object) null);
        C6594p pVar = this.f396215d.f396191f;
        if (pVar == null || (pVar.f19602a & 1) == 0) {
            i = -1;
        } else {
            C6580b bVar = pVar.f19603b;
            if (bVar == null) {
                bVar = C6580b.f19567c;
            }
            i = bVar.f19570b;
        }
        this.f396213b.mo123516o(this.f396215d.f396189d, i, -1, (String) null, (List) null);
    }

    /* renamed from: c */
    public final void mo123547c() {
        String d = this.f396215d.mo123528d(6);
        ArrayList arrayList = new ArrayList(this.f396215d.f396186a.f19582a);
        ArrayList arrayList2 = new ArrayList();
        this.f396212a.set(false);
        this.f396216e.postDelayed(new C146716ae(this, d, arrayList, arrayList2), 100);
    }

    /* renamed from: l */
    public final void mo123513l() {
        mo123546b();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo123514m(int r15, int r16) {
        /*
            r14 = this;
            r8 = r14
            r0 = r16
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r1 = r8.f396215d
            com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel r1 = r1.mo123527c()
            com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel$ButtonState r1 = r1.f396182h
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = r15
            if (r5 == r4) goto L_0x01f2
            if (r0 == r4) goto L_0x01ee
            if (r0 == r3) goto L_0x01d8
            r5 = 4
            r6 = 3
            if (r0 == r6) goto L_0x002f
            if (r0 == r5) goto L_0x001d
            goto L_0x01f6
        L_0x001d:
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r0 = r8.f396215d
            com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel r0 = r0.mo123527c()
            com.google.a.a.j r0 = r0.f396178d
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.f19590c
            if (r0 == 0) goto L_0x002f
            r14.m239062f()
            return
        L_0x002f:
            int r0 = r1.f396184b
            if (r0 == 0) goto L_0x0035
            goto L_0x01f6
        L_0x0035:
            java.lang.String r0 = r1.f396185c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r9 = r8.f396215d
            java.util.ArrayList r9 = r9.f396190e
            int r10 = r9.size()
            r11 = 0
        L_0x004a:
            if (r11 >= r10) goto L_0x0060
            java.lang.Object r12 = r9.get(r11)
            com.google.a.a.p r12 = (com.google.p335a.p336a.C6594p) r12
            int r11 = r11 + 1
            java.lang.String r13 = r12.f19608g
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L_0x004a
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r0 = r8.f396215d
            r0.f396191f = r12
        L_0x0060:
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r0 = r8.f396215d
            com.google.a.a.p r0 = r0.f396191f
            int r9 = r0.f19602a
            r5 = r5 & r9
            r9 = 0
            java.lang.String r10 = ""
            if (r5 == 0) goto L_0x0070
            boolean r5 = r0.f19606e
            if (r5 != 0) goto L_0x0078
        L_0x0070:
            com.google.protobuf.cq r5 = r0.f19607f
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x0147
        L_0x0078:
            com.google.protobuf.cq r5 = r0.f19607f
            int r5 = r5.size()
            if (r5 != 0) goto L_0x008d
            com.google.protobuf.cq r5 = r0.f19605d
            int r5 = r5.size()
            if (r5 != 0) goto L_0x008d
            int r5 = r0.f19602a
            r5 = r5 & r3
            if (r5 == 0) goto L_0x01f6
        L_0x008d:
            int r5 = r0.f19602a
            r5 = r5 & 32
            if (r5 == 0) goto L_0x0095
            java.lang.String r10 = r0.f19610i
        L_0x0095:
            com.google.protobuf.cq r5 = r0.f19607f
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x00a7
            java.util.ArrayList r1 = new java.util.ArrayList
            com.google.protobuf.cq r2 = r0.f19607f
            r1.<init>(r2)
            r5 = r1
            r2 = 3
            goto L_0x00a8
        L_0x00a7:
            r5 = r1
        L_0x00a8:
            com.google.protobuf.cq r1 = r0.f19605d
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00d3
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r1 = r8.f396215d
            java.util.ArrayList r1 = r1.mo123530e()
            boolean r6 = r1.isEmpty()
            if (r6 != 0) goto L_0x00d2
            boolean r6 = r10.isEmpty()
            if (r6 == 0) goto L_0x00cf
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r6 = r8.f396215d
            r7 = 10
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r6 = r6.mo123528d(r7)
            r10 = r6
        L_0x00cf:
            if (r2 != 0) goto L_0x00d2
            r2 = 2
        L_0x00d2:
            r7 = r1
        L_0x00d3:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x0112
            com.google.protobuf.cq r1 = r0.f19605d
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0112
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L_0x0112
            int r1 = r0.f19602a
            r1 = r1 & r3
            if (r1 == 0) goto L_0x00ed
            goto L_0x0112
        L_0x00ed:
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L_0x0106
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x0106
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r1 = r8.f396215d
            r2 = 13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r1 = r1.mo123528d(r2)
            r10 = r1
        L_0x0106:
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r1 = r8.f396215d
            java.lang.String r2 = "no_action"
            com.google.a.a.d r1 = r1.mo123525a(r2)
            r7.add(r1)
            r2 = 2
        L_0x0112:
            int r1 = r0.f19602a
            r1 = r1 & r3
            if (r1 == 0) goto L_0x0139
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L_0x0129
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r1 = r8.f396215d
            r3 = 11
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r10 = r1.mo123528d(r3)
        L_0x0129:
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r1 = r8.f396215d
            java.lang.String r0 = r0.f19604c
            com.google.a.a.j r0 = r1.mo123526b(r0)
            if (r2 != 0) goto L_0x0134
            goto L_0x0135
        L_0x0134:
            r4 = r2
        L_0x0135:
            r6 = r4
            r1 = r10
            r4 = r0
            goto L_0x013c
        L_0x0139:
            r6 = r2
            r4 = r9
            r1 = r10
        L_0x013c:
            r9 = 1
            r10 = 0
            r0 = r14
            r2 = r5
            r3 = r7
            r5 = r9
            r7 = r10
            r0.mo123545a(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0147:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r1 = r0.f19602a
            r1 = r1 & r3
            if (r1 == 0) goto L_0x018d
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r1 = r8.f396215d
            java.lang.String r3 = r0.f19604c
            com.google.a.a.j r7 = r1.mo123526b(r3)
            if (r7 == 0) goto L_0x017f
            boolean r1 = r7.f19590c
            if (r1 != 0) goto L_0x0165
            goto L_0x017f
        L_0x0165:
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r0 = r8.f396215d
            r1 = 12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = r0.mo123528d(r1)
            r9 = 1
            r10 = 4
            r11 = 0
            r0 = r14
            r2 = r5
            r3 = r6
            r4 = r7
            r5 = r9
            r6 = r10
            r7 = r11
            r0.mo123545a(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x017f:
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r1 = r8.f396215d
            r3 = 9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r10 = r1.mo123528d(r3)
            r9 = 1
            goto L_0x018f
        L_0x018d:
            r7 = r9
            r9 = 2
        L_0x018f:
            com.google.protobuf.cq r0 = r0.f19605d
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01b8
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r0 = r8.f396215d
            java.util.ArrayList r0 = r0.mo123530e()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x01b6
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L_0x01b6
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r1 = r8.f396215d
            r3 = 7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r1 = r1.mo123528d(r3)
            r3 = r0
            goto L_0x01ba
        L_0x01b6:
            r3 = r0
            goto L_0x01b9
        L_0x01b8:
            r3 = r6
        L_0x01b9:
            r1 = r10
        L_0x01ba:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x01c7
            if (r7 == 0) goto L_0x01c6
            boolean r0 = r7.f19590c
            if (r0 != 0) goto L_0x01c7
        L_0x01c6:
            r2 = 1
        L_0x01c7:
            r14.m239063g(r2)
            if (r2 != 0) goto L_0x01f6
            r6 = 2
            r10 = 0
            r0 = r14
            r2 = r5
            r4 = r7
            r5 = r6
            r6 = r9
            r7 = r10
            r0.mo123545a(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x01d8:
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r0 = r8.f396215d
            com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel r0 = r0.mo123527c()
            boolean r0 = r0.f396179e
            if (r0 == 0) goto L_0x01e8
            java.lang.String r0 = "finish_reporting"
            r14.m239061e(r0)
            return
        L_0x01e8:
            java.lang.String r0 = r1.f396185c
            r14.m239061e(r0)
            return
        L_0x01ee:
            r14.m239062f()
            return
        L_0x01f2:
            if (r0 == r4) goto L_0x01fb
            if (r0 == r3) goto L_0x01f7
        L_0x01f6:
            return
        L_0x01f7:
            r14.m239064h()
            return
        L_0x01fb:
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r0 = r8.f396215d
            java.util.ArrayList r1 = r0.f396188c
            int r3 = r1.size()
            int r3 = r3 + -1
            java.lang.Object r1 = r1.remove(r3)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r0.f396190e = r1
            java.util.ArrayList r0 = r0.f396187b
            int r1 = r0.size()
            int r1 = r1 + -1
            java.lang.Object r0 = r0.remove(r1)
            com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel r0 = (com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel) r0
            com.google.android.libraries.abuse.reporting.ao r0 = r8.f396214c
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r1 = r8.f396215d
            com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel r1 = r1.mo123527c()
            r0.mo123560e(r2)
            boolean r3 = r0.mo123565j()
            if (r3 == 0) goto L_0x0231
            int r3 = r0.mo123556a()
            goto L_0x0236
        L_0x0231:
            int r3 = r0.mo123556a()
            int r3 = -r3
        L_0x0236:
            com.google.android.libraries.abuse.reporting.ReportAbuseHorizontalScrollView r4 = r0.f396241j
            int r4 = r4.getScrollX()
            int r5 = r0.f396242k
            int r5 = r5 + -1
            r0.f396242k = r5
            android.widget.LinearLayout r5 = r0.f396240i
            android.view.ViewTreeObserver r5 = r5.getViewTreeObserver()
            com.google.android.libraries.abuse.reporting.am r6 = new com.google.android.libraries.abuse.reporting.am
            r6.<init>(r0, r5, r1)
            r5.addOnGlobalLayoutListener(r6)
            com.google.android.libraries.abuse.reporting.an r1 = new com.google.android.libraries.abuse.reporting.an
            int r4 = r4 + r3
            r1.<init>(r0, r4, r5)
            r5.addOnScrollChangedListener(r1)
            com.google.android.libraries.abuse.reporting.ReportAbuseHorizontalScrollView r0 = r0.f396241j
            r0.smoothScrollBy(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.abuse.reporting.C146718ag.mo123514m(int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        r15 = r15.mo123526b(r0.f19604c);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m239060d(boolean r15) {
        /*
            r14 = this;
            if (r15 == 0) goto L_0x0059
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r15 = r14.f396215d
            com.google.a.a.p r0 = r15.f396191f
            int r1 = r0.f19602a
            r1 = r1 & 4
            if (r1 == 0) goto L_0x001b
            boolean r0 = r0.f19606e
            if (r0 == 0) goto L_0x001b
            r0 = 13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r15 = r15.mo123528d(r0)
            goto L_0x0025
        L_0x001b:
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r15 = r15.mo123528d(r0)
        L_0x0025:
            r1 = r15
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r15 = r14.f396215d
            boolean r0 = r15.f396189d
            r4 = 2
            r5 = 1
            if (r5 == r0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r5 = 2
        L_0x003a:
            com.google.a.a.p r0 = r15.f396191f
            int r6 = r0.f19602a
            r4 = r4 & r6
            r6 = 0
            if (r4 == 0) goto L_0x0051
            java.lang.String r0 = r0.f19604c
            com.google.a.a.j r15 = r15.mo123526b(r0)
            if (r15 == 0) goto L_0x004f
            boolean r0 = r15.f19590c
            if (r0 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r4 = r15
            goto L_0x0052
        L_0x0051:
            r4 = r6
        L_0x0052:
            r6 = 2
            r7 = 1
            r0 = r14
            r0.mo123545a(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0059:
            com.google.android.libraries.abuse.reporting.af r8 = r14.f396213b
            r9 = 0
            r10 = -1
            r11 = -1
            r12 = 0
            r13 = 0
            r8.mo123516o(r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.abuse.reporting.C146718ag.m239060d(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r4.f19590c != false) goto L_0x0044;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo123515n(int r8, int r9, java.lang.String r10) {
        /*
            r7 = this;
            r0 = 2
            if (r9 == 0) goto L_0x0004
            goto L_0x0045
        L_0x0004:
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r1 = r7.f396215d
            java.util.ArrayList r1 = r1.f396190e
            int r2 = r1.size()
            r3 = 0
        L_0x000d:
            r4 = 0
            if (r3 >= r2) goto L_0x0021
            java.lang.Object r5 = r1.get(r3)
            com.google.a.a.p r5 = (com.google.p335a.p336a.C6594p) r5
            int r3 = r3 + 1
            java.lang.String r6 = r5.f19608g
            boolean r6 = r6.equals(r10)
            if (r6 == 0) goto L_0x000d
            goto L_0x0022
        L_0x0021:
            r5 = r4
        L_0x0022:
            int r1 = r5.f19602a
            r0 = r0 & r1
            if (r0 == 0) goto L_0x002f
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r0 = r7.f396215d
            java.lang.String r1 = r5.f19604c
            com.google.a.a.j r4 = r0.mo123526b(r1)
        L_0x002f:
            com.google.protobuf.cq r0 = r5.f19607f
            int r0 = r0.size()
            r1 = 3
            if (r0 != 0) goto L_0x0044
            boolean r0 = r5.f19606e
            if (r0 != 0) goto L_0x0044
            r0 = 4
            if (r4 == 0) goto L_0x0045
            boolean r2 = r4.f19590c
            if (r2 != 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r0 = 3
        L_0x0045:
            com.google.android.libraries.abuse.reporting.ao r1 = r7.f396214c
            r2 = 1
            r1.mo123559d(r0, r2)
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r1 = r7.f396215d
            com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel r1 = r1.mo123527c()
            r1.f396181g = r0
            com.google.android.libraries.abuse.reporting.ReportAbuseComponentState r0 = r7.f396215d
            com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel r0 = r0.mo123527c()
            com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel$ButtonState r1 = new com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel$ButtonState
            r1.<init>(r8, r9, r10)
            r0.f396182h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.abuse.reporting.C146718ag.mo123515n(int, int, java.lang.String):void");
    }
}
