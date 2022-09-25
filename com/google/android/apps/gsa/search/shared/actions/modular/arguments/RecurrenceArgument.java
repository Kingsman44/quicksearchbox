package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.p256b.C5033s;
import com.android.recurrencepicker.C5487k;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58597ky;
import com.google.p4152bb.p4153a.C55005ci;
import com.google.p4152bb.p4153a.C55015cs;
import com.google.p4152bb.p4153a.C55133hb;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.ArrayList;
import java.util.Calendar;

/* compiled from: PG */
public class RecurrenceArgument extends SingleValueArgument {
    public static final Parcelable.Creator CREATOR = new C87461y();

    /* renamed from: i */
    private final int f236201i;

    /* renamed from: j */
    private final int f236202j;

    private RecurrenceArgument(RecurrenceArgument recurrenceArgument, int i) {
        super(recurrenceArgument, (C5033s) recurrenceArgument.f236203n, i);
        this.f236201i = recurrenceArgument.f236201i;
        this.f236202j = recurrenceArgument.f236202j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final boolean mo81325M() {
        int i = this.f236201i;
        return i != -1 && (this.f236144e.mo81211R(i) instanceof DateArgument);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final boolean mo81326N() {
        int i = this.f236202j;
        return i != -1 && (this.f236144e.mo81211R(i) instanceof TimeOfDayArgument);
    }

    /* renamed from: O */
    public final boolean mo81327O() {
        Object obj;
        for (C55005ci ciVar : this.f236146g) {
            C62940bt r2 = C62942bv.checkIsLite(C55015cs.f144740c);
            ciVar.mo58887l(r2);
            Object l = ciVar.f169962ag.mo58854l(r2.f169971d);
            if (l == null) {
                obj = r2.f169969b;
            } else {
                obj = r2.mo58889c(l);
            }
            if (((C55015cs) obj).f144742a) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final long mo81328a() {
        Calendar calendar;
        if (mo81326N()) {
            TimeOfDayArgument g = mo81330g();
            if (g.mo81343R()) {
                return g.mo81248a();
            }
        }
        if (mo81325M()) {
            calendar = mo81329b().mo81293a();
        } else {
            calendar = Calendar.getInstance();
        }
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(11, 9);
        return calendar.getTimeInMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final DateArgument mo81329b() {
        C58838bb.m90883r(mo81325M());
        return (DateArgument) this.f236144e.mo81211R(this.f236201i);
    }

    /* renamed from: c */
    public final C87429c mo81250c(C87449m mVar, C55134hc hcVar, Resources resources) {
        String str;
        if (mo81263C()) {
            C55133hb a = C55133hb.m87600a(hcVar.f145123c);
            if (a == null) {
                a = C55133hb.NONE;
            }
            C5033s sVar = (C5033s) this.f236203n;
            int ordinal = a.ordinal();
            if (ordinal == 38) {
                int i = sVar.f15889d;
                if (i == 4) {
                    return new C87429c(C58597ky.m90212c(1, 2, 3, 4, 5, 6, 7));
                } else if (i == 5) {
                    ArrayList d = C58597ky.m90213d(sVar.f15902q);
                    for (int i2 = 0; i2 < sVar.f15902q; i2++) {
                        d.add(Integer.valueOf(C5033s.m13827b(sVar.f15900o[i2])));
                    }
                    return new C87429c(d);
                }
            } else if (ordinal == 39) {
                if (mo81327O()) {
                    str = C5487k.m14199b(sVar, resources);
                } else {
                    str = C5487k.m14198a(resources, sVar);
                }
                if (!TextUtils.isEmpty(str)) {
                    return new C87429c(str);
                }
            }
        }
        this.f236144e.mo81210Q().mo81395a("RecurrenceArgument transformation failed because event recurrence value is not set or transformation type is not supported", mo81279n(), (Throwable) null);
        return C87429c.f236122a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final TimeOfDayArgument mo81330g() {
        C58838bb.m90883r(mo81326N());
        return (TimeOfDayArgument) this.f236144e.mo81211R(this.f236202j);
    }

    /* renamed from: h */
    public final void mo81331h() {
        TimeOfDayArgument g = mo81330g();
        boolean C = mo81263C();
        int j = g.mo81275j();
        g.f236208j = C;
        if (j != g.mo81275j()) {
            g.mo81289x();
        }
    }

    /* renamed from: hB */
    public final boolean mo81260hB() {
        return false;
    }

    /* renamed from: i */
    public final void mo81332i(String str) {
        C5033s sVar;
        if (str != null) {
            sVar = new C5033s();
            sVar.mo9970e(str);
        } else {
            sVar = null;
        }
        mo81334P(sVar);
    }

    /* renamed from: m */
    public final /* synthetic */ Argument mo81278m(int i) {
        return new RecurrenceArgument(this, i);
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00f0, code lost:
        if (r12 != false) goto L_0x00f2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0354  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p4152bb.p4153a.C55213ka mo81279n() {
        /*
            r16 = this;
            r0 = r16
            com.google.bb.a.md r1 = com.google.p4152bb.p4153a.C55270md.f145577e
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.bb.a.mc r1 = (com.google.p4152bb.p4153a.C55269mc) r1
            java.lang.Object r2 = r0.f236203n
            com.android.b.s r2 = (com.android.p256b.C5033s) r2
            long r3 = r16.mo81328a()
            r7 = 4
            r8 = 2
            r9 = 1
            if (r2 != 0) goto L_0x001a
        L_0x0017:
            r6 = 0
            goto L_0x032d
        L_0x001a:
            com.google.i.a.ax r10 = com.google.p4653i.p4654a.C61683ax.f166633j
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.i.a.ae r10 = (com.google.p4653i.p4654a.C61664ae) r10
            int r11 = r2.f15892g
            if (r11 == 0) goto L_0x0034
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.i.a.ax r12 = (com.google.p4653i.p4654a.C61683ax) r12
            int r13 = r12.f166635a
            r13 = r13 | r8
            r12.f166635a = r13
            r12.f166637c = r11
        L_0x0034:
            com.google.i.a.aq r11 = com.google.p4653i.p4654a.C61676aq.f166619c
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.i.a.ap r11 = (com.google.p4653i.p4654a.C61675ap) r11
            com.google.i.a.t r12 = com.google.p4653i.p4654a.C61710t.f166708k
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.i.a.m r12 = (com.google.p4653i.p4654a.C61703m) r12
            java.util.Calendar r13 = java.util.Calendar.getInstance()
            r13.setTimeInMillis(r3)
            int r14 = r13.get(r9)
            r12.copyOnWrite()
            com.google.protobuf.bv r15 = r12.instance
            com.google.i.a.t r15 = (com.google.p4653i.p4654a.C61710t) r15
            int r6 = r15.f166710a
            r6 = r6 | r9
            r15.f166710a = r6
            r15.f166711b = r14
            int r6 = r13.get(r8)
            r12.copyOnWrite()
            com.google.protobuf.bv r14 = r12.instance
            com.google.i.a.t r14 = (com.google.p4653i.p4654a.C61710t) r14
            int r15 = r14.f166710a
            r15 = r15 | r8
            r14.f166710a = r15
            int r6 = r6 + r9
            r14.f166712c = r6
            r6 = 5
            int r13 = r13.get(r6)
            r12.copyOnWrite()
            com.google.protobuf.bv r14 = r12.instance
            com.google.i.a.t r14 = (com.google.p4653i.p4654a.C61710t) r14
            int r15 = r14.f166710a
            r15 = r15 | r7
            r14.f166710a = r15
            r14.f166713d = r13
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.i.a.aq r13 = (com.google.p4653i.p4654a.C61676aq) r13
            com.google.protobuf.bv r12 = r12.build()
            com.google.i.a.t r12 = (com.google.p4653i.p4654a.C61710t) r12
            r12.getClass()
            r13.f166622b = r12
            int r12 = r13.f166621a
            r12 = r12 | r9
            r13.f166621a = r12
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.i.a.ax r12 = (com.google.p4653i.p4654a.C61683ax) r12
            com.google.protobuf.bv r11 = r11.build()
            com.google.i.a.aq r11 = (com.google.p4653i.p4654a.C61676aq) r11
            r11.getClass()
            r12.f166638d = r11
            int r11 = r12.f166635a
            r11 = r11 | r7
            r12.f166635a = r11
            com.google.i.a.ao r11 = com.google.p4653i.p4654a.C61674ao.f166610g
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.i.a.an r11 = (com.google.p4653i.p4654a.C61673an) r11
            int r12 = r2.f15891f
            r13 = 0
            if (r12 == 0) goto L_0x00ce
            r11.copyOnWrite()
            com.google.protobuf.bv r14 = r11.instance
            com.google.i.a.ao r14 = (com.google.p4653i.p4654a.C61674ao) r14
            int r15 = r14.f166612a
            r15 = r15 | r7
            r14.f166612a = r15
            r14.f166615d = r12
            r12 = 1
            goto L_0x00cf
        L_0x00ce:
            r12 = 0
        L_0x00cf:
            java.lang.String r14 = r2.f15890e
            if (r14 == 0) goto L_0x00f0
            android.text.format.Time r12 = new android.text.format.Time
            r12.<init>()
            java.lang.String r14 = r2.f15890e
            r12.parse(r14)
            long r14 = r12.toMillis(r13)
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.i.a.ao r12 = (com.google.p4653i.p4654a.C61674ao) r12
            int r5 = r12.f166612a
            r5 = r5 | r8
            r12.f166612a = r5
            r12.f166614c = r14
            goto L_0x00f2
        L_0x00f0:
            if (r12 == 0) goto L_0x010a
        L_0x00f2:
            r10.copyOnWrite()
            com.google.protobuf.bv r5 = r10.instance
            com.google.i.a.ax r5 = (com.google.p4653i.p4654a.C61683ax) r5
            com.google.protobuf.bv r11 = r11.build()
            com.google.i.a.ao r11 = (com.google.p4653i.p4654a.C61674ao) r11
            r11.getClass()
            r5.f166639e = r11
            int r11 = r5.f166635a
            r11 = r11 | 8
            r5.f166635a = r11
        L_0x010a:
            com.google.i.a.ag r5 = com.google.p4653i.p4654a.C61666ag.f166594e
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.i.a.af r5 = (com.google.p4653i.p4654a.C61665af) r5
            java.util.Calendar r11 = java.util.Calendar.getInstance()
            r11.setTimeInMillis(r3)
            com.google.i.a.s r12 = com.google.p4653i.p4654a.C61709s.f166701e
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.i.a.r r12 = (com.google.p4653i.p4654a.C61708r) r12
            r14 = 11
            int r14 = r11.get(r14)
            r12.copyOnWrite()
            com.google.protobuf.bv r15 = r12.instance
            com.google.i.a.s r15 = (com.google.p4653i.p4654a.C61709s) r15
            int r6 = r15.f166703a
            r6 = r6 | r9
            r15.f166703a = r6
            r15.f166704b = r14
            r6 = 12
            int r6 = r11.get(r6)
            r12.copyOnWrite()
            com.google.protobuf.bv r14 = r12.instance
            com.google.i.a.s r14 = (com.google.p4653i.p4654a.C61709s) r14
            int r15 = r14.f166703a
            r15 = r15 | r8
            r14.f166703a = r15
            r14.f166705c = r6
            r6 = 13
            int r6 = r11.get(r6)
            r12.copyOnWrite()
            com.google.protobuf.bv r11 = r12.instance
            com.google.i.a.s r11 = (com.google.p4653i.p4654a.C61709s) r11
            int r14 = r11.f166703a
            r14 = r14 | r7
            r11.f166703a = r14
            r11.f166706d = r6
            com.google.protobuf.bv r6 = r12.build()
            com.google.i.a.s r6 = (com.google.p4653i.p4654a.C61709s) r6
            r5.copyOnWrite()
            com.google.protobuf.bv r11 = r5.instance
            com.google.i.a.ag r11 = (com.google.p4653i.p4654a.C61666ag) r11
            r6.getClass()
            r11.f166597b = r6
            int r6 = r11.f166596a
            r6 = r6 | r9
            r11.f166596a = r6
            if (r5 == 0) goto L_0x017d
            com.google.protobuf.bv r5 = r5.build()
            com.google.i.a.ag r5 = (com.google.p4653i.p4654a.C61666ag) r5
            goto L_0x017e
        L_0x017d:
            r5 = 0
        L_0x017e:
            if (r5 == 0) goto L_0x018f
            r10.copyOnWrite()
            com.google.protobuf.bv r6 = r10.instance
            com.google.i.a.ax r6 = (com.google.p4653i.p4654a.C61683ax) r6
            r6.f166640f = r5
            int r5 = r6.f166635a
            r5 = r5 | 16
            r6.f166635a = r5
        L_0x018f:
            int r5 = r2.f15889d
            if (r5 != r7) goto L_0x01a3
            r10.copyOnWrite()
            com.google.protobuf.bv r2 = r10.instance
            com.google.i.a.ax r2 = (com.google.p4653i.p4654a.C61683ax) r2
            r2.f166636b = r13
            int r3 = r2.f166635a
            r3 = r3 | r9
            r2.f166635a = r3
            goto L_0x030c
        L_0x01a3:
            java.lang.String r6 = "Failed to convert byday: %d to caribou Weekday."
            r11 = 5
            if (r5 != r11) goto L_0x01fd
            r10.copyOnWrite()
            com.google.protobuf.bv r3 = r10.instance
            com.google.i.a.ax r3 = (com.google.p4653i.p4654a.C61683ax) r3
            r3.f166636b = r9
            int r4 = r3.f166635a
            r4 = r4 | r9
            r3.f166635a = r4
            com.google.i.a.au r3 = com.google.p4653i.p4654a.C61680au.f166625b
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.i.a.at r3 = (com.google.p4653i.p4654a.C61679at) r3
            int r4 = r2.f15902q
        L_0x01c0:
            int r5 = r2.f15902q
            if (r13 >= r5) goto L_0x01e1
            int[] r5 = r2.f15900o
            r5 = r5[r13]
            int r11 = com.google.android.apps.gsa.search.shared.actions.util.C87495q.m142027a(r5)
            if (r11 != 0) goto L_0x01db
            com.google.common.f.e r2 = com.google.android.apps.gsa.search.shared.actions.util.C87495q.f236322a
            com.google.common.f.x r2 = r2.mo56225c()
            r3 = 9580(0x256c, float:1.3424E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r3)).mo56387q(r6, r5)
            goto L_0x0017
        L_0x01db:
            r3.mo58169a(r11)
            int r13 = r13 + 1
            goto L_0x01c0
        L_0x01e1:
            if (r4 == 0) goto L_0x030c
            r10.copyOnWrite()
            com.google.protobuf.bv r2 = r10.instance
            com.google.i.a.ax r2 = (com.google.p4653i.p4654a.C61683ax) r2
            com.google.protobuf.bv r3 = r3.build()
            com.google.i.a.au r3 = (com.google.p4653i.p4654a.C61680au) r3
            r3.getClass()
            r2.f166641g = r3
            int r3 = r2.f166635a
            r3 = r3 | 32
            r2.f166635a = r3
            goto L_0x030c
        L_0x01fd:
            r11 = 6
            if (r5 != r11) goto L_0x02a0
            r10.copyOnWrite()
            com.google.protobuf.bv r5 = r10.instance
            com.google.i.a.ax r5 = (com.google.p4653i.p4654a.C61683ax) r5
            r5.f166636b = r8
            int r11 = r5.f166635a
            r11 = r11 | r9
            r5.f166635a = r11
            com.google.i.a.am r5 = com.google.p4653i.p4654a.C61672am.f166603f
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.i.a.al r5 = (com.google.p4653i.p4654a.C61671al) r5
            int r11 = r2.f15902q
            if (r11 <= 0) goto L_0x0269
            int[] r3 = r2.f15900o
            if (r3 == 0) goto L_0x025a
            int[] r4 = r2.f15901p
            if (r4 != 0) goto L_0x0223
            goto L_0x025a
        L_0x0223:
            r3 = r3[r13]
            int r4 = com.google.android.apps.gsa.search.shared.actions.util.C87495q.m142027a(r3)
            if (r4 != 0) goto L_0x0238
            com.google.common.f.e r2 = com.google.android.apps.gsa.search.shared.actions.util.C87495q.f236322a
            com.google.common.f.x r2 = r2.mo56225c()
            r4 = 9579(0x256b, float:1.3423E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56387q(r6, r3)
            goto L_0x0017
        L_0x0238:
            int[] r2 = r2.f15901p
            r2 = r2[r13]
            r5.copyOnWrite()
            com.google.protobuf.bv r3 = r5.instance
            com.google.i.a.am r3 = (com.google.p4653i.p4654a.C61672am) r3
            int r6 = r3.f166605a
            r6 = r6 | 8
            r3.f166605a = r6
            r3.f166608d = r2
            r5.copyOnWrite()
            com.google.protobuf.bv r2 = r5.instance
            com.google.i.a.am r2 = (com.google.p4653i.p4654a.C61672am) r2
            r2.f166607c = r4
            int r3 = r2.f166605a
            r3 = r3 | r7
            r2.f166605a = r3
            goto L_0x0287
        L_0x025a:
            com.google.common.f.e r3 = com.google.android.apps.gsa.search.shared.actions.util.C87495q.f236322a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r4 = "byday and bydayNum can't be NULL for monthly reminder, eventRecurrence: %s"
            r5 = 9578(0x256a, float:1.3422E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56389s(r4, r2)
            goto L_0x0017
        L_0x0269:
            int r6 = r2.f15904s
            if (r6 <= 0) goto L_0x0278
            int[] r2 = r2.f15903r
            r2 = r2[r13]
            r6 = -1
            if (r2 != r6) goto L_0x0278
            r5.mo58167a(r6)
            goto L_0x0287
        L_0x0278:
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r2.setTimeInMillis(r3)
            r3 = 5
            int r2 = r2.get(r3)
            r5.mo58167a(r2)
        L_0x0287:
            r10.copyOnWrite()
            com.google.protobuf.bv r2 = r10.instance
            com.google.i.a.ax r2 = (com.google.p4653i.p4654a.C61683ax) r2
            com.google.protobuf.bv r3 = r5.build()
            com.google.i.a.am r3 = (com.google.p4653i.p4654a.C61672am) r3
            r3.getClass()
            r2.f166642h = r3
            int r3 = r2.f166635a
            r3 = r3 | 64
            r2.f166635a = r3
            goto L_0x030c
        L_0x02a0:
            r6 = 7
            if (r5 != r6) goto L_0x0314
            r10.copyOnWrite()
            com.google.protobuf.bv r2 = r10.instance
            com.google.i.a.ax r2 = (com.google.p4653i.p4654a.C61683ax) r2
            r5 = 3
            r2.f166636b = r5
            int r5 = r2.f166635a
            r5 = r5 | r9
            r2.f166635a = r5
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r2.setTimeInMillis(r3)
            com.google.i.a.am r3 = com.google.p4653i.p4654a.C61672am.f166603f
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.i.a.al r3 = (com.google.p4653i.p4654a.C61671al) r3
            r4 = 5
            int r4 = r2.get(r4)
            r3.mo58167a(r4)
            com.google.protobuf.bv r3 = r3.build()
            com.google.i.a.am r3 = (com.google.p4653i.p4654a.C61672am) r3
            com.google.i.a.aw r4 = com.google.p4653i.p4654a.C61682aw.f166628d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.i.a.av r4 = (com.google.p4653i.p4654a.C61681av) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.i.a.aw r5 = (com.google.p4653i.p4654a.C61682aw) r5
            r3.getClass()
            r5.f166631b = r3
            int r3 = r5.f166630a
            r3 = r3 | r9
            r5.f166630a = r3
            int r2 = r2.get(r8)
            int r2 = r2 + r9
            int r2 = com.google.p4653i.p4654a.C61670ak.m94428a(r2)
            r4.mo58170a(r2)
            com.google.protobuf.bv r2 = r4.build()
            com.google.i.a.aw r2 = (com.google.p4653i.p4654a.C61682aw) r2
            r10.copyOnWrite()
            com.google.protobuf.bv r3 = r10.instance
            com.google.i.a.ax r3 = (com.google.p4653i.p4654a.C61683ax) r3
            r2.getClass()
            r3.f166643i = r2
            int r2 = r3.f166635a
            r2 = r2 | 128(0x80, float:1.794E-43)
            r3.f166635a = r2
        L_0x030c:
            com.google.protobuf.bv r2 = r10.build()
            r6 = r2
            com.google.i.a.ax r6 = (com.google.p4653i.p4654a.C61683ax) r6
            goto L_0x032d
        L_0x0314:
            com.google.common.f.e r3 = com.google.android.apps.gsa.search.shared.actions.util.C87495q.f236322a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            r4 = 9576(0x2568, float:1.3419E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            java.lang.String r4 = "The frequency %d is not supported."
            int r2 = r2.f15889d
            r3.mo56387q(r4, r2)
            goto L_0x0017
        L_0x032d:
            if (r6 == 0) goto L_0x033d
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.bb.a.md r2 = (com.google.p4152bb.p4153a.C55270md) r2
            r2.f145581b = r6
            int r3 = r2.f145580a
            r3 = r3 | r9
            r2.f145580a = r3
        L_0x033d:
            int r2 = r0.f236201i
            r3 = -1
            if (r2 == r3) goto L_0x0350
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.bb.a.md r4 = (com.google.p4152bb.p4153a.C55270md) r4
            int r5 = r4.f145580a
            r5 = r5 | r8
            r4.f145580a = r5
            r4.f145582c = r2
        L_0x0350:
            int r2 = r0.f236202j
            if (r2 == r3) goto L_0x0362
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.bb.a.md r3 = (com.google.p4152bb.p4153a.C55270md) r3
            int r4 = r3.f145580a
            r4 = r4 | r7
            r3.f145580a = r4
            r3.f145583d = r2
        L_0x0362:
            com.google.bb.a.ka r2 = super.mo81279n()
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.bb.a.jz r2 = (com.google.p4152bb.p4153a.C55211jz) r2
            com.google.protobuf.bt r3 = com.google.p4152bb.p4153a.C55270md.f145578f
            com.google.protobuf.bv r1 = r1.build()
            com.google.bb.a.md r1 = (com.google.p4152bb.p4153a.C55270md) r1
            r2.mo58885m(r3, r1)
            com.google.protobuf.bv r1 = r2.build()
            com.google.bb.a.ka r1 = (com.google.p4152bb.p4153a.C55213ka) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.modular.arguments.RecurrenceArgument.mo81279n():com.google.bb.a.ka");
    }

    /* renamed from: p */
    public final Object mo81281p(C87440d dVar) {
        return dVar.mo81362i(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ProtoLiteParcelable.m147140k(mo81279n(), parcel);
    }

    /* renamed from: y */
    public final void mo81290y(ModularAction modularAction) {
        super.mo81290y(modularAction);
        if (mo81325M()) {
            mo81329b().mo81270J(new C87459w(this));
        }
        if (mo81326N()) {
            mo81270J(new C87460x(this));
            mo81331h();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecurrenceArgument(com.google.p4152bb.p4153a.C55213ka r12) {
        /*
            r11 = this;
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55270md.f145578f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r12.mo58887l(r0)
            com.google.protobuf.bf r1 = r12.f169962ag
            com.google.protobuf.bs r2 = r0.f169971d
            java.lang.Object r1 = r1.mo58854l(r2)
            if (r1 != 0) goto L_0x0016
            java.lang.Object r0 = r0.f169969b
            goto L_0x001a
        L_0x0016:
            java.lang.Object r0 = r0.mo58889c(r1)
        L_0x001a:
            com.google.bb.a.md r0 = (com.google.p4152bb.p4153a.C55270md) r0
            int r0 = r0.f145580a
            r1 = 1
            r0 = r0 & r1
            r2 = 4
            r3 = 0
            r4 = -1
            if (r0 == 0) goto L_0x0134
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55270md.f145578f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r12.mo58887l(r0)
            com.google.protobuf.bf r5 = r12.f169962ag
            com.google.protobuf.bs r6 = r0.f169971d
            java.lang.Object r5 = r5.mo58854l(r6)
            if (r5 != 0) goto L_0x003b
            java.lang.Object r0 = r0.f169969b
            goto L_0x003f
        L_0x003b:
            java.lang.Object r0 = r0.mo58889c(r5)
        L_0x003f:
            com.google.bb.a.md r0 = (com.google.p4152bb.p4153a.C55270md) r0
            com.google.i.a.ax r0 = r0.f145581b
            if (r0 != 0) goto L_0x0047
            com.google.i.a.ax r0 = com.google.p4653i.p4654a.C61683ax.f166633j
        L_0x0047:
            if (r0 == 0) goto L_0x0134
            int r5 = r0.f166635a
            r5 = r5 & r1
            if (r5 == 0) goto L_0x0134
            com.android.b.s r3 = new com.android.b.s
            r3.<init>()
            int r5 = r0.f166636b
            int r6 = com.google.p4653i.p4654a.C61668ai.m94427a(r5)
            if (r6 != 0) goto L_0x005c
            r6 = 1
        L_0x005c:
            int r6 = r6 + r4
            r7 = 2
            if (r6 == 0) goto L_0x0129
            r8 = 5
            r9 = 0
            if (r6 == r1) goto L_0x00cf
            if (r6 == r7) goto L_0x006b
            r1 = 7
            r3.f15889d = r1
            goto L_0x012b
        L_0x006b:
            r5 = 6
            r3.f15889d = r5
            int r5 = r0.f166635a
            r5 = r5 & 64
            if (r5 == 0) goto L_0x012b
            com.google.i.a.am r5 = r0.f166642h
            if (r5 != 0) goto L_0x007a
            com.google.i.a.am r5 = com.google.p4653i.p4654a.C61672am.f166603f
        L_0x007a:
            int r6 = r5.f166605a
            r6 = r6 & r2
            if (r6 == 0) goto L_0x00b6
            int r6 = r5.f166607c
            int r6 = com.google.p4653i.p4654a.C61678as.m94431a(r6)
            if (r6 != 0) goto L_0x0088
            r6 = 1
        L_0x0088:
            r3.f15902q = r1
            int[] r10 = new int[r1]
            int r6 = com.google.android.apps.gsa.search.shared.actions.util.C87496r.m142028a(r6)
            r10[r9] = r6
            r3.f15900o = r10
            boolean r6 = r5.f166609e
            if (r6 != 0) goto L_0x00ae
            int r5 = r5.f166608d
            if (r5 != r8) goto L_0x009d
            goto L_0x00ae
        L_0x009d:
            if (r5 > r8) goto L_0x00aa
            if (r5 > 0) goto L_0x00a2
            goto L_0x00aa
        L_0x00a2:
            int[] r1 = new int[r1]
            r1[r9] = r5
            r3.f15901p = r1
            goto L_0x012b
        L_0x00aa:
            r3.f15902q = r9
            goto L_0x012b
        L_0x00ae:
            int[] r1 = new int[r1]
            r1[r9] = r4
            r3.f15901p = r1
            goto L_0x012b
        L_0x00b6:
            com.google.protobuf.ch r6 = r5.f166606b
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x012b
            com.google.protobuf.ch r5 = r5.f166606b
            int r5 = r5.mo58914d(r9)
            if (r5 != r4) goto L_0x012b
            r3.f15904s = r1
            int[] r1 = new int[r1]
            r1[r9] = r4
            r3.f15903r = r1
            goto L_0x012b
        L_0x00cf:
            r3.f15889d = r8
            int r5 = com.google.p4653i.p4654a.C61668ai.m94427a(r5)
            if (r5 == 0) goto L_0x012b
            if (r5 != r7) goto L_0x012b
            com.google.i.a.au r5 = r0.f166641g
            if (r5 != 0) goto L_0x00df
            com.google.i.a.au r5 = com.google.p4653i.p4654a.C61680au.f166625b
        L_0x00df:
            com.google.protobuf.ch r5 = r5.f166627a
            int r5 = r5.size()
            if (r5 == 0) goto L_0x012b
            com.google.i.a.au r5 = r0.f166641g
            if (r5 != 0) goto L_0x00ed
            com.google.i.a.au r5 = com.google.p4653i.p4654a.C61680au.f166625b
        L_0x00ed:
            com.google.protobuf.ch r5 = r5.f166627a
            int r5 = r5.size()
            r3.f15902q = r5
            int[] r6 = new int[r5]
            r3.f15900o = r6
            int[] r5 = new int[r5]
            r3.f15901p = r5
        L_0x00fd:
            com.google.i.a.au r5 = r0.f166641g
            if (r5 != 0) goto L_0x0103
            com.google.i.a.au r5 = com.google.p4653i.p4654a.C61680au.f166625b
        L_0x0103:
            com.google.protobuf.ch r5 = r5.f166627a
            int r5 = r5.size()
            if (r9 >= r5) goto L_0x012b
            com.google.i.a.au r5 = r0.f166641g
            if (r5 != 0) goto L_0x0111
            com.google.i.a.au r5 = com.google.p4653i.p4654a.C61680au.f166625b
        L_0x0111:
            com.google.protobuf.ch r5 = r5.f166627a
            int r5 = r5.mo58914d(r9)
            int r5 = com.google.p4653i.p4654a.C61678as.m94431a(r5)
            if (r5 != 0) goto L_0x011e
            r5 = 1
        L_0x011e:
            int[] r6 = r3.f15900o
            int r5 = com.google.android.apps.gsa.search.shared.actions.util.C87496r.m142028a(r5)
            r6[r9] = r5
            int r9 = r9 + 1
            goto L_0x00fd
        L_0x0129:
            r3.f15889d = r2
        L_0x012b:
            int r1 = r0.f166635a
            r1 = r1 & r7
            if (r1 == 0) goto L_0x0134
            int r0 = r0.f166637c
            r3.f15892g = r0
        L_0x0134:
            r11.<init>(r12, r3)
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55270md.f145578f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r12.mo58887l(r0)
            com.google.protobuf.bf r12 = r12.f169962ag
            com.google.protobuf.bs r1 = r0.f169971d
            java.lang.Object r12 = r12.mo58854l(r1)
            if (r12 != 0) goto L_0x014d
            java.lang.Object r12 = r0.f169969b
            goto L_0x0151
        L_0x014d:
            java.lang.Object r12 = r0.mo58889c(r12)
        L_0x0151:
            com.google.bb.a.md r12 = (com.google.p4152bb.p4153a.C55270md) r12
            int r0 = r12.f145580a
            r1 = r0 & 2
            if (r1 == 0) goto L_0x015c
            int r1 = r12.f145582c
            goto L_0x015d
        L_0x015c:
            r1 = -1
        L_0x015d:
            r11.f236201i = r1
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0164
            int r4 = r12.f145583d
        L_0x0164:
            r11.f236202j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.modular.arguments.RecurrenceArgument.<init>(com.google.bb.a.ka):void");
    }
}
