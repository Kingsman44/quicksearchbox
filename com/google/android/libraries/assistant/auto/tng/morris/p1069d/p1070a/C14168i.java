package com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a;

import android.content.Context;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.C14157a;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.C14186b;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.C14187c;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14347fw;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14348fx;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35608aa;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.OptionalLong;
import p3186j$.util.stream.Collectors;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.d.a.i */
/* compiled from: PG */
public final class C14168i implements C14157a {

    /* renamed from: c */
    private static final C59071e f42919c = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.d.a.i");

    /* renamed from: a */
    public final LinkedHashMap f42920a = new LinkedHashMap();

    /* renamed from: b */
    final Queue f42921b = new ArrayDeque();

    /* renamed from: d */
    private final C69464a f42922d;

    /* renamed from: e */
    private long f42923e;

    /* renamed from: f */
    private long f42924f;

    /* renamed from: g */
    private final C21370a f42925g;

    /* renamed from: h */
    private final LinkedHashMap f42926h = new LinkedHashMap();

    /* renamed from: i */
    private final LinkedHashMap f42927i = new LinkedHashMap();

    /* renamed from: j */
    private Optional f42928j = Optional.empty();

    public C14168i(C69464a aVar, C21370a aVar2) {
        this.f42922d = aVar;
        this.f42925g = aVar2;
    }

    /* renamed from: A */
    private final C14167h m30487A(String str) {
        if (!this.f42920a.containsKey(str)) {
            this.f42920a.put(str, new C14167h());
        }
        return (C14167h) this.f42920a.get(str);
    }

    /* renamed from: B */
    private final void m30488B(String str) {
        C14167h A = m30487A(str);
        A.f42917d = false;
        if (!A.f42916c.isEmpty()) {
            A.f42916c = OptionalLong.empty();
            this.f42924f = ((Long) Collection.EL.stream(this.f42920a.values()).map(C14161b.f42908a).max(Comparator.CC.naturalOrder()).get()).longValue();
        }
    }

    /* renamed from: C */
    private final void m30489C(String str) {
        this.f42924f = this.f42925g.mo26870b();
        m30487A(str).f42916c = OptionalLong.m71641of(this.f42924f);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo21501a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21502b() {
    }

    /* renamed from: c */
    public final void mo21503c() {
        this.f42923e = this.f42925g.mo26870b();
    }

    /* renamed from: d */
    public final void mo21504d() {
        this.f42926h.clear();
        this.f42920a.clear();
        this.f42921b.clear();
        this.f42928j = Optional.empty();
    }

    /* renamed from: e */
    public final void mo21505e() {
        this.f42927i.clear();
    }

    /* renamed from: f */
    public final long mo21481f() {
        return this.f42924f;
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* renamed from: h */
    public final C58485gu mo21482h(Context context) {
        C58480gp e = C58485gu.m89837e();
        for (C14187c cVar : (List) Collection.EL.stream(this.f42926h.values()).sorted(Comparator.EL.reversed(Comparator.CC.comparingLong(C14164e.f42911a))).collect(Collectors.toCollection(C14165f.f42912a))) {
            C14347fw fwVar = (C14347fw) C14348fx.f43414h.createBuilder();
            String e2 = cVar.mo21517e();
            fwVar.copyOnWrite();
            e2.getClass();
            ((C14348fx) fwVar.instance).f43416a = e2;
            String h = cVar.mo21520h();
            fwVar.copyOnWrite();
            h.getClass();
            ((C14348fx) fwVar.instance).f43418c = h;
            long b = cVar.mo21514b();
            fwVar.copyOnWrite();
            ((C14348fx) fwVar.instance).f43417b = b;
            int a = cVar.mo21513a();
            fwVar.copyOnWrite();
            ((C14348fx) fwVar.instance).f43421f = a;
            boolean isPresent = m30487A(cVar.mo21518f()).f42916c.isPresent();
            fwVar.copyOnWrite();
            ((C14348fx) fwVar.instance).f43420e = isPresent;
            long c = cVar.mo21515c();
            fwVar.copyOnWrite();
            ((C14348fx) fwVar.instance).f43422g = c;
            Optional d = cVar.mo21516d(context);
            Objects.requireNonNull(fwVar);
            d.ifPresent(new C14166g(fwVar));
            e.mo55395g((C14348fx) fwVar.build());
        }
        return e.mo55394f();
    }

    /* renamed from: i */
    public final C60870cx mo21483i(C35608aa aaVar) {
        C58480gp e = C58485gu.m89837e();
        mo21487m().ifPresent(new C14158a(e));
        return aaVar.mo21083c(e.mo55394f());
    }

    /* renamed from: j */
    public final C60870cx mo21484j(C35608aa aaVar) {
        C58480gp e = C58485gu.m89837e();
        for (C14187c cVar : this.f42926h.values()) {
            if (cVar instanceof C14176q) {
                e.mo55395g(((C14176q) cVar).f42940a);
            } else {
                C59104x c = f42919c.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Morris.IncomingMsgCtrl");
                ((C59052c) ((C59052c) c).mo56372aa(45834)).mo56386p("ERROR: Attemping to use OPA MorrisMessageNotification type with TNG message cache.");
            }
        }
        return aaVar.mo21083c(e.mo55394f());
    }

    /* renamed from: k */
    public final Optional mo21485k() {
        return this.f42928j;
    }

    /* renamed from: l */
    public final Optional mo21486l() {
        if (this.f42926h.isEmpty()) {
            return Optional.empty();
        }
        Optional max = Collection.EL.stream(this.f42926h.entrySet()).max(Comparator.CC.comparing(new C14162c(this)));
        if (max.isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of((C14187c) ((Map.Entry) max.get()).getValue());
    }

    /* renamed from: m */
    public final Optional mo21487m() {
        if (this.f42927i.isEmpty()) {
            return Optional.empty();
        }
        Optional max = Collection.EL.stream(this.f42927i.entrySet()).max(Comparator.CC.comparing(new C14163d(this)));
        if (max.isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of((C14187c) ((Map.Entry) max.get()).getValue());
    }

    /* renamed from: n */
    public final void mo21488n(boolean z) {
        if (!this.f42928j.isEmpty()) {
            mo21491q(z);
            this.f42928j = Optional.empty();
        }
    }

    /* renamed from: o */
    public final void mo21489o(String str) {
        m30487A(str).f42917d = true;
    }

    /* renamed from: p */
    public final void mo21490p() {
        if (!this.f42928j.isEmpty()) {
            C14187c cVar = (C14187c) this.f42928j.get();
            String f = cVar.mo21518f();
            if (this.f42926h.containsKey(f) && !m30487A(f).f42918e) {
                m30487A(f).f42914a = OptionalLong.m71641of(cVar.mo21515c());
                if (this.f42926h.containsKey(f) && this.f42926h.get(f) == cVar) {
                    this.f42926h.remove(f);
                }
                this.f42927i.put(f, cVar);
                ((C14186b) this.f42922d.mo17428b()).mo21510c(cVar.mo21514b());
                m30488B(f);
            }
        }
    }

    /* renamed from: q */
    public final void mo21491q(boolean z) {
        if (!this.f42928j.isEmpty()) {
            C14187c cVar = (C14187c) this.f42928j.get();
            String f = cVar.mo21518f();
            m30487A(f).f42915b = OptionalLong.m71641of(cVar.mo21515c());
            if (z) {
                m30488B(f);
            } else {
                m30489C(f);
            }
        }
    }

    /* renamed from: r */
    public final void mo21492r() {
        if (!this.f42928j.isEmpty()) {
            this.f42927i.remove(((C14187c) this.f42928j.get()).mo21518f());
        }
    }

    /* renamed from: s */
    public final boolean mo21493s(long j) {
        if (this.f42928j.isPresent()) {
            return false;
        }
        C14187c a = ((C14186b) this.f42922d.mo17428b()).mo21509a(j);
        if (a == null) {
            C59104x d = f42919c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.IncomingMsgCtrl");
            ((C59052c) ((C59052c) d).mo56372aa(45836)).mo56388r("message notification with id %d not found in message notification store", j);
            return false;
        }
        Optional of = Optional.m71637of(a);
        this.f42928j = of;
        m30487A(((C14187c) of.get()).mo21518f()).f42918e = false;
        return true;
    }

    /* renamed from: t */
    public final boolean mo21494t(long j) {
        boolean s = mo21493s(j);
        m30487A(((C14187c) this.f42928j.get()).mo21518f()).f42918e = true;
        return s;
    }

    /* renamed from: u */
    public final boolean mo21495u() {
        if (!this.f42921b.isEmpty()) {
            while (!this.f42921b.isEmpty()) {
                C14187c cVar = (C14187c) this.f42921b.poll();
                cVar.getClass();
                String f = cVar.mo21518f();
                C14167h A = m30487A(f);
                if (A.f42914a.isPresent()) {
                    cVar.mo21521i(A.f42914a.getAsLong());
                }
                if (!this.f42926h.containsKey(f)) {
                    C58976aa aaVar = C58975e.f156826a;
                } else if (cVar.mo21524l()) {
                    ((C14186b) this.f42922d.mo17428b()).mo21510c(cVar.mo21514b());
                    if (this.f42926h.containsKey(f) && this.f42926h.get(f) == cVar) {
                        this.f42926h.remove(f);
                    }
                } else {
                    this.f42928j = Optional.m71637of(cVar);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: v */
    public final boolean mo21496v(String str) {
        return m30487A(str).f42917d;
    }

    /* renamed from: w */
    public final boolean mo21497w() {
        return !this.f42926h.isEmpty();
    }

    /* renamed from: x */
    public final boolean mo21498x(String str) {
        C14187c cVar;
        if (!this.f42926h.containsKey(str) && !this.f42927i.containsKey(str)) {
            C59104x d = f42919c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.IncomingMsgCtrl");
            ((C59052c) ((C59052c) d).mo56372aa(45838)).mo56389s("message notification with key %s not found in unreadmessages or replyable message list", str);
            return false;
        } else if (this.f42928j.isPresent() && ((C14187c) this.f42928j.get()).mo21518f().equals(str)) {
            return false;
        } else {
            if (this.f42928j.isPresent()) {
                mo21488n(true);
            }
            if (this.f42926h.containsKey(str)) {
                cVar = (C14187c) this.f42926h.get(str);
            } else {
                cVar = (C14187c) this.f42927i.get(str);
            }
            this.f42928j = Optional.ofNullable(cVar);
            return true;
        }
    }

    /* renamed from: y */
    public final boolean mo21499y(long j) {
        C14187c cVar;
        C14187c a = ((C14186b) this.f42922d.mo17428b()).mo21509a(j);
        if (a == null) {
            C59104x d = f42919c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.IncomingMsgCtrl");
            ((C59052c) ((C59052c) d).mo56372aa(45839)).mo56388r("new incoming message notification with id %d not found in message notification store", j);
            return false;
        }
        C14167h A = m30487A(a.mo21518f());
        OptionalLong optionalLong = A.f42916c;
        String f = a.mo21518f();
        C14167h A2 = m30487A(f);
        if (this.f42926h.containsKey(f)) {
            cVar = (C14187c) this.f42926h.get(f);
            C58976aa aaVar = C58975e.f156826a;
            if (cVar.mo21515c() < a.mo21515c()) {
                cVar.mo21522j(a);
                C14167h A3 = m30487A(cVar.mo21518f());
                if (A3.f42914a.isPresent()) {
                    cVar.mo21521i(A3.f42914a.getAsLong());
                }
            }
            ((C14186b) this.f42922d.mo17428b()).mo21510c(a.mo21514b());
        } else {
            cVar = a;
        }
        if (!A2.f42914a.isPresent() || cVar.mo21515c() > A2.f42914a.getAsLong()) {
            if (!this.f42926h.containsKey(f)) {
                this.f42926h.put(f, cVar);
            }
            if (cVar.mo21515c() <= this.f42923e) {
                A2.f42915b = OptionalLong.m71641of(cVar.mo21515c());
                m30489C(f);
            } else if ((!A2.f42915b.isPresent() || A2.f42915b.getAsLong() < cVar.mo21515c()) && ((!this.f42928j.isPresent() || ((C14187c) this.f42928j.get()).mo21514b() != cVar.mo21514b()) && !this.f42921b.contains(cVar))) {
                this.f42921b.add(cVar);
            }
        }
        if (!this.f42928j.isPresent()) {
            mo21495u();
            if (this.f42928j.isPresent() || !C58832aw.m90831a(A.f42916c, optionalLong)) {
                return true;
            }
            return false;
        } else if (!a.mo21518f().equals(((C14187c) this.f42928j.get()).mo21518f()) || !A.f42915b.isPresent() || ((C14187c) this.f42928j.get()).mo21515c() <= A.f42915b.getAsLong()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: z */
    public final boolean mo21500z(String str) {
        if (!this.f42926h.containsKey(str)) {
            return false;
        }
        ((C14186b) this.f42922d.mo17428b()).mo21510c(((C14187c) this.f42926h.get(str)).mo21514b());
        this.f42926h.remove(str);
        return true;
    }
}
