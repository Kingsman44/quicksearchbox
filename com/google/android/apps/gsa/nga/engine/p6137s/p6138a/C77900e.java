package com.google.android.apps.gsa.nga.engine.p6137s.p6138a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.am.e.d;
import com.google.android.apps.gsa.nga.engine.p6137s.C77908f;
import com.google.android.apps.gsa.nga.engine.understanding.p6236c.C79028k;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80412ad;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.base.C58889cz;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58710pc;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p3186j$.time.Duration;
import p3186j$.util.Comparator;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.s.a.e */
/* compiled from: PG */
public final class C77900e implements C77908f {

    /* renamed from: a */
    static final Duration f214605a = Duration.ofSeconds(2);

    /* renamed from: b */
    private static final C58710pc f214606b = C58710pc.m90487d(Comparator.EL.reversed(Comparator.CC.comparingLong(C77899d.f214604a)));

    /* renamed from: c */
    private final C58974d f214607c = C58974d.m91136j();

    /* renamed from: d */
    private final Map f214608d = new HashMap();

    /* renamed from: e */
    private String f214609e = BuildConfig.FLAVOR;

    /* renamed from: f */
    private List f214610f = C58485gu.m89845m();

    /* renamed from: g */
    private long f214611g = 1;

    /* renamed from: h */
    private Optional f214612h = Optional.empty();

    /* renamed from: i */
    private final Object f214613i = new Object();

    /* renamed from: j */
    private final d f214614j;

    /* renamed from: k */
    private final d f214615k;

    /* renamed from: l */
    private final C60950i f214616l;

    public C77900e(C58889cz czVar, C60950i iVar) {
        Duration duration = f214605a;
        this.f214614j = new d(czVar, duration);
        this.f214615k = new d(czVar, duration);
        this.f214616l = iVar;
    }

    /* renamed from: l */
    private final C80413ae m125030l(C80413ae aeVar) {
        if ((aeVar.f220690a & 1) != 0 && !aeVar.f220691b.isEmpty()) {
            return aeVar;
        }
        C80412ad adVar = (C80412ad) aeVar.toBuilder();
        long j = this.f214611g;
        this.f214611g = 1 + j;
        adVar.copyOnWrite();
        C80413ae aeVar2 = (C80413ae) adVar.instance;
        aeVar2.f220690a |= 1;
        aeVar2.f220691b = "HistoryId_" + j;
        return (C80413ae) adVar.build();
    }

    /* renamed from: m */
    private final List m125031m() {
        return C58485gu.m89836F(f214606b, this.f214608d.values());
    }

    /* renamed from: n */
    private final void m125032n(C80413ae aeVar) {
        this.f214608d.put(aeVar.f220691b, aeVar);
        List m = m125031m();
        for (int i = 10; i < m.size(); i++) {
            this.f214608d.remove(((C80413ae) m.get(i)).f220691b);
        }
    }

    /* renamed from: a */
    public final void mo72876a(C80413ae aeVar) {
        synchronized (this.f214613i) {
            if ((aeVar.f220690a & 1) == 0 || aeVar.f220691b.isEmpty()) {
                ((C58970a) ((C58970a) this.f214607c.mo56226d()).mo56372aa(3931)).mo56389s("Received a clientQuery without a QueryId: [%s]. This works but it is not expected. Please verify that the usage makes sense.", aeVar.f220692c);
            }
            C80413ae l = m125030l(aeVar);
            m125032n(C79028k.m126974c(l, (C80413ae) this.f214608d.get(l.f220691b)));
        }
    }

    /* renamed from: b */
    public final void mo72877b(C80413ae aeVar) {
        if (!aeVar.f220692c.isEmpty()) {
            synchronized (this.f214613i) {
                C80413ae l = m125030l(aeVar);
                m125032n(C79028k.m126974c((C80413ae) this.f214608d.get(l.f220691b), l));
            }
        }
    }

    /* renamed from: c */
    public final void mo72878c() {
        synchronized (this.f214613i) {
            this.f214612h = Optional.empty();
        }
    }

    /* renamed from: d */
    public final void mo72879d() {
        this.f214614j.c();
        this.f214615k.c();
    }

    /* renamed from: e */
    public final void mo72880e(C52091ex exVar) {
        this.f214615k.b(exVar);
    }

    /* renamed from: f */
    public final void mo72881f(C80401n nVar) {
        this.f214614j.b(nVar);
    }

    /* renamed from: g */
    public final void mo72882g() {
        synchronized (this.f214613i) {
            this.f214612h = Optional.m71637of(this.f214616l.mo57444a());
        }
    }

    /* renamed from: h */
    public final C58485gu mo72883h() {
        return this.f214615k.a();
    }

    /* renamed from: i */
    public final C58485gu mo72884i() {
        return this.f214614j.a();
    }

    /* renamed from: j */
    public final Optional mo72885j() {
        Optional optional;
        synchronized (this.f214613i) {
            optional = this.f214612h;
        }
        return optional;
    }

    /* renamed from: k */
    public final List mo72886k(C83320io ioVar) {
        List list;
        synchronized (this.f214613i) {
            if (!ioVar.f227136c.equals(this.f214609e)) {
                this.f214609e = ioVar.f227136c;
                this.f214610f = m125031m();
            }
            list = this.f214610f;
        }
        return list;
    }
}
