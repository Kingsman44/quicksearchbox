package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58703ow;
import com.google.common.p4522b.C58740qf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59795fw;
import com.google.common.p4552o.C59796fx;
import com.google.common.p4552o.C59826gs;
import com.google.common.p4552o.C59827gt;
import com.google.common.p4552o.C59859hw;
import com.google.common.p4552o.C59860hx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.bg */
/* compiled from: PG */
public final class C90815bg implements C90991b {

    /* renamed from: a */
    private static final C59071e f253947a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.c.a.bg");

    /* renamed from: b */
    private final C21370a f253948b;

    /* renamed from: c */
    private final String f253949c;

    /* renamed from: d */
    private final String f253950d;

    /* renamed from: e */
    private final C58833ax f253951e;

    /* renamed from: f */
    private final C58881cr f253952f;

    /* renamed from: g */
    private final boolean f253953g;

    /* renamed from: h */
    private final boolean f253954h;

    /* renamed from: i */
    private final int f253955i;

    /* renamed from: j */
    private final int f253956j;

    /* renamed from: k */
    private final Object f253957k = new Object();

    /* renamed from: l */
    private final Set f253958l = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: m */
    private final C90804aw[] f253959m = new C90804aw[100];

    /* renamed from: n */
    private int f253960n = 0;

    /* renamed from: o */
    private long f253961o;

    /* renamed from: p */
    private long f253962p;

    /* renamed from: q */
    private int f253963q = 0;

    /* renamed from: r */
    private int f253964r = 0;

    /* renamed from: s */
    private int f253965s = 0;

    public C90815bg(String str, int i, C58881cr crVar, boolean z, C21370a aVar, boolean z2, int i2) {
        str.getClass();
        this.f253949c = str;
        this.f253951e = C58833ax.m90834k(Integer.valueOf(i));
        this.f253952f = crVar;
        this.f253953g = z;
        this.f253948b = aVar;
        this.f253954h = z2;
        this.f253955i = i2;
        this.f253956j = i2 * 5;
        this.f253950d = null;
    }

    /* renamed from: e */
    private static C59860hx m148393e(C90804aw awVar, long j, long j2) {
        C59859hw hwVar = (C59859hw) C59860hx.f161771i.createBuilder();
        String a = awVar.mo85126a();
        hwVar.copyOnWrite();
        C59860hx hxVar = (C59860hx) hwVar.instance;
        a.getClass();
        hxVar.f161773a |= 16;
        hxVar.f161778f = a;
        long j3 = awVar.f253922d;
        hwVar.copyOnWrite();
        C59860hx hxVar2 = (C59860hx) hwVar.instance;
        hxVar2.f161773a |= 1;
        hxVar2.f161774b = j + j3;
        long j4 = awVar.f253923e;
        if (j4 != 0) {
            hwVar.copyOnWrite();
            C59860hx hxVar3 = (C59860hx) hwVar.instance;
            hxVar3.f161773a |= 2;
            hxVar3.f161775c = j4;
        }
        if (awVar.f253925g != -1) {
            long j5 = awVar.f253924f;
            long j6 = awVar.f253922d;
            hwVar.copyOnWrite();
            C59860hx hxVar4 = (C59860hx) hwVar.instance;
            hxVar4.f161773a |= 4;
            hxVar4.f161776d = j5 - j6;
            long j7 = awVar.f253925g;
            long j8 = awVar.f253924f;
            hwVar.copyOnWrite();
            C59860hx hxVar5 = (C59860hx) hwVar.instance;
            hxVar5.f161773a |= 8;
            hxVar5.f161777e = j7 - j8;
        } else if (awVar.f253924f != -1) {
            long j9 = awVar.f253924f;
            long j10 = awVar.f253922d;
            hwVar.copyOnWrite();
            C59860hx hxVar6 = (C59860hx) hwVar.instance;
            hxVar6.f161773a |= 4;
            hxVar6.f161776d = j9 - j10;
            long j11 = awVar.f253924f;
            hwVar.copyOnWrite();
            C59860hx hxVar7 = (C59860hx) hwVar.instance;
            hxVar7.f161773a |= 8;
            hxVar7.f161777e = j2 - j11;
        } else {
            long j12 = awVar.f253922d;
            hwVar.copyOnWrite();
            C59860hx hxVar8 = (C59860hx) hwVar.instance;
            hxVar8.f161773a |= 4;
            hxVar8.f161776d = j2 - j12;
        }
        return (C59860hx) hwVar.build();
    }

    /* renamed from: f */
    private final void m148394f() {
        int i = this.f253963q + this.f253964r;
        if (i > this.f253965s) {
            this.f253965s = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C90804aw mo85156a(C58881cr crVar, long j) {
        Level level;
        C90804aw awVar = new C90804aw(crVar, j, this.f253948b.mo26874f());
        synchronized (this.f253957k) {
            this.f253958l.add(awVar);
            if (awVar.f253923e == 0) {
                this.f253963q++;
                m148394f();
            }
            int i = this.f253963q;
            int i2 = this.f253955i;
            if (i > i2) {
                if (i > i2) {
                    long f = this.f253948b.mo26874f();
                    if (f > this.f253961o + 5000) {
                        this.f253961o = f;
                        if (i > this.f253956j) {
                            level = Level.SEVERE;
                        } else {
                            level = Level.WARNING;
                        }
                        ((C59052c) f253947a.mo56223a(level).mo56372aa(11389)).mo56352E("Queue length for executor %s is now %d. Perhaps some tasks are too long, or the pool is too small.", this.f253949c, i);
                    }
                }
            }
        }
        return awVar;
    }

    /* renamed from: b */
    public final void mo85157b(C90804aw awVar) {
        long f = this.f253948b.mo26874f();
        awVar.f253925g = f;
        synchronized (this.f253957k) {
            this.f253958l.remove(awVar);
            C90804aw[] awVarArr = this.f253959m;
            int i = this.f253960n;
            awVarArr[i] = awVar;
            this.f253960n = (i + 1) % 100;
            this.f253964r--;
        }
        if (this.f253954h && f - awVar.f253924f > 300000) {
            ((C59052c) ((C59052c) f253947a.mo56226d()).mo56372aa(11386)).mo56359L("Task %s took %dms, which is over the %dms threshold", awVar.mo85126a(), Long.valueOf(f - awVar.f253924f), 300000L);
        }
    }

    /* renamed from: c */
    public final void mo85158c(C90804aw awVar) {
        boolean z;
        long f = this.f253948b.mo26874f();
        awVar.f253924f = f;
        synchronized (this.f253957k) {
            z = false;
            if (f > this.f253962p + 5000 && f > awVar.f253922d + awVar.f253923e + 1000) {
                this.f253962p = f;
                z = true;
            }
            if (awVar.f253923e == 0) {
                this.f253963q--;
            }
            this.f253964r++;
            m148394f();
        }
        if (z) {
            ((C59052c) ((C59052c) f253947a.mo56226d()).mo56372aa(11388)).mo56359L("Task %s was queued for %dms before starting on executor %s", awVar.mo85126a(), Long.valueOf((f - awVar.f253922d) - awVar.f253923e), this.f253949c);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C58485gu j;
        C90804aw[] awVarArr;
        C59826gs gsVar = (C59826gs) C59827gt.f161660l.createBuilder();
        String str = this.f253949c;
        gsVar.copyOnWrite();
        C59827gt gtVar = (C59827gt) gsVar.instance;
        str.getClass();
        gtVar.f161662a |= 1;
        gtVar.f161663b = str;
        String str2 = this.f253950d;
        if (str2 != null) {
            gsVar.copyOnWrite();
            C59827gt gtVar2 = (C59827gt) gsVar.instance;
            gtVar2.f161662a |= 32;
            gtVar2.f161671j = str2;
        }
        gsVar.copyOnWrite();
        C59827gt gtVar3 = (C59827gt) gsVar.instance;
        gtVar3.f161662a |= 64;
        gtVar3.f161672k = false;
        boolean z = this.f253953g;
        gsVar.copyOnWrite();
        C59827gt gtVar4 = (C59827gt) gsVar.instance;
        gtVar4.f161662a |= 16;
        gtVar4.f161670i = z;
        if (this.f253951e.mo56113h()) {
            int intValue = ((Integer) this.f253951e.mo56107c()).intValue();
            gsVar.copyOnWrite();
            C59827gt gtVar5 = (C59827gt) gsVar.instance;
            gtVar5.f161662a |= 4;
            gtVar5.f161665d = intValue;
        }
        C58881cr crVar = this.f253952f;
        if (crVar != null) {
            int intValue2 = ((Integer) crVar.mo6453a()).intValue();
            gsVar.copyOnWrite();
            C59827gt gtVar6 = (C59827gt) gsVar.instance;
            gtVar6.f161662a |= 2;
            gtVar6.f161664c = intValue2;
        }
        synchronized (this.f253957k) {
            int i = this.f253965s;
            gsVar.copyOnWrite();
            C59827gt gtVar7 = (C59827gt) gsVar.instance;
            gtVar7.f161662a |= 8;
            gtVar7.f161669h = i;
            j = C58485gu.m89842j(this.f253958l);
            awVarArr = (C90804aw[]) this.f253959m.clone();
        }
        long f = this.f253948b.mo26874f();
        long b = this.f253948b.mo26870b() - f;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C90804aw awVar = (C90804aw) j.get(i2);
            if (awVar.f253924f == -1) {
                arrayList.add(awVar);
            } else {
                arrayList2.add(awVar);
            }
        }
        Collections.sort(arrayList, C90804aw.f253919a);
        ArrayList arrayList3 = new ArrayList(50);
        for (C90804aw e : C58557jl.m90125f(arrayList, 50)) {
            arrayList3.add(m148393e(e, b, f));
        }
        Collections.sort(arrayList2, C90804aw.f253920b);
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList4.add(m148393e((C90804aw) arrayList2.get(i3), b, f));
        }
        Arrays.sort(awVarArr, new C58703ow(new C58740qf(C90804aw.f253921c)));
        ArrayList arrayList5 = new ArrayList();
        for (C90804aw awVar2 : awVarArr) {
            if (awVar2 == null) {
                break;
            }
            arrayList5.add(m148393e(awVar2, b, f));
        }
        gsVar.copyOnWrite();
        ((C59827gt) gsVar.instance).f161667f = C59827gt.emptyProtobufList();
        gsVar.copyOnWrite();
        C59827gt gtVar8 = (C59827gt) gsVar.instance;
        C62971cq cqVar = gtVar8.f161667f;
        if (!cqVar.mo58948c()) {
            gtVar8.f161667f = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) arrayList3, (List) gtVar8.f161667f);
        gsVar.copyOnWrite();
        ((C59827gt) gsVar.instance).f161666e = C59827gt.emptyProtobufList();
        gsVar.copyOnWrite();
        C59827gt gtVar9 = (C59827gt) gsVar.instance;
        C62971cq cqVar2 = gtVar9.f161666e;
        if (!cqVar2.mo58948c()) {
            gtVar9.f161666e = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) arrayList4, (List) gtVar9.f161666e);
        gsVar.copyOnWrite();
        ((C59827gt) gsVar.instance).f161668g = C59827gt.emptyProtobufList();
        gsVar.copyOnWrite();
        C59827gt gtVar10 = (C59827gt) gsVar.instance;
        C62971cq cqVar3 = gtVar10.f161668g;
        if (!cqVar3.mo58948c()) {
            gtVar10.f161668g = C62942bv.mutableCopy(cqVar3);
        }
        C62947c.addAll((Iterable) arrayList5, (List) gtVar10.f161668g);
        C59795fw fwVar = fVar.f254236a;
        fwVar.copyOnWrite();
        C59796fx fxVar = (C59796fx) fwVar.instance;
        C59827gt gtVar11 = (C59827gt) gsVar.build();
        C59796fx fxVar2 = C59796fx.f161580r;
        gtVar11.getClass();
        fxVar.mo57059a();
        fxVar.f161587f.add(gtVar11);
    }

    public C90815bg(String str, String str2, C21370a aVar, C58833ax axVar, boolean z, int i) {
        this.f253949c = str;
        this.f253950d = str2;
        this.f253948b = aVar;
        this.f253954h = z;
        this.f253955i = i;
        this.f253956j = i * 5;
        this.f253951e = axVar;
        this.f253953g = false;
        this.f253952f = null;
    }
}
