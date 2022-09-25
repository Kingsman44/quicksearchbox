package androidx.media3.exoplayer.p145h;

import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import androidx.media3.common.C2576ac;
import androidx.media3.common.C2590aq;
import androidx.media3.common.C2651bm;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.p151k.C3241g;
import androidx.media3.p132b.C2495an;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.media3.exoplayer.h.w */
/* compiled from: PG */
public final class C3128w extends C3115j {

    /* renamed from: a */
    public static final C2590aq f9175a;

    /* renamed from: b */
    public final List f9176b;

    /* renamed from: c */
    public final Map f9177c;

    /* renamed from: d */
    public C3098ci f9178d;

    /* renamed from: e */
    private final List f9179e;

    /* renamed from: f */
    private final Set f9180f;

    /* renamed from: g */
    private Handler f9181g;

    /* renamed from: h */
    private final IdentityHashMap f9182h;

    /* renamed from: i */
    private final Set f9183i;

    /* renamed from: j */
    private boolean f9184j;

    /* renamed from: k */
    private Set f9185k;

    static {
        C2576ac acVar = new C2576ac();
        acVar.f7104b = Uri.EMPTY;
        f9175a = acVar.mo6082a();
    }

    public C3128w(C3038au... auVarArr) {
        C3098ci ciVar = new C3098ci();
        for (C3038au auVar : auVarArr) {
            auVar.getClass();
        }
        this.f9178d = ciVar.f9065a.length > 0 ? ciVar.mo7090a() : ciVar;
        this.f9182h = new IdentityHashMap();
        this.f9177c = new HashMap();
        this.f9179e = new ArrayList();
        this.f9176b = new ArrayList();
        this.f9185k = new HashSet();
        this.f9180f = new HashSet();
        this.f9183i = new HashSet();
        mo7113G(Arrays.asList(auVarArr));
    }

    /* renamed from: O */
    private final void m9114O() {
        Iterator it = this.f9183i.iterator();
        while (it.hasNext()) {
            C3121p pVar = (C3121p) it.next();
            if (pVar.f9145c.isEmpty()) {
                mo7102e(pVar);
                it.remove();
            }
        }
    }

    /* renamed from: P */
    private final void m9115P(int i, Collection collection) {
        Handler handler = this.f9181g;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((C3038au) it.next()).getClass();
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C3121p((C3038au) it2.next()));
        }
        this.f9179e.addAll(i, arrayList);
        if (handler != null && !collection.isEmpty()) {
            handler.obtainMessage(0, new C3122q(i, arrayList)).sendToTarget();
        }
    }

    /* renamed from: D */
    public final boolean mo6941D() {
        return false;
    }

    /* renamed from: E */
    public final synchronized void mo7111E(C3038au auVar) {
        mo7112F(this.f9179e.size(), auVar);
    }

    /* renamed from: F */
    public final synchronized void mo7112F(int i, C3038au auVar) {
        m9115P(i, Collections.singletonList(auVar));
    }

    /* renamed from: G */
    public final synchronized void mo7113G(Collection collection) {
        m9115P(this.f9179e.size(), collection);
    }

    /* renamed from: H */
    public final void mo7114H(int i, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C3121p pVar = (C3121p) it.next();
            int i2 = i + 1;
            if (i > 0) {
                C3121p pVar2 = (C3121p) this.f9176b.get(i - 1);
                pVar.mo7107a(i, pVar2.f9147e + pVar2.f9143a.f8786a.f8765a.mo6022c());
            } else {
                pVar.mo7107a(i, 0);
            }
            mo7115I(i, 1, pVar.f9143a.f8786a.f8765a.mo6022c());
            this.f9176b.add(i, pVar);
            this.f9177c.put(pVar.f9144b, pVar);
            mo7104k(pVar, pVar.f9143a);
            if (!mo6940C() || !this.f9182h.isEmpty()) {
                mo7102e(pVar);
            } else {
                this.f9183i.add(pVar);
            }
            i = i2;
        }
    }

    /* renamed from: I */
    public final void mo7115I(int i, int i2, int i3) {
        while (i < this.f9176b.size()) {
            C3121p pVar = (C3121p) this.f9176b.get(i);
            pVar.f9146d += i2;
            pVar.f9147e += i3;
            i++;
        }
    }

    /* renamed from: J */
    public final synchronized void mo7116J(Set set) {
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            this.f9180f.removeAll(set);
        } else {
            C3120o oVar = (C3120o) it.next();
            throw null;
        }
    }

    /* renamed from: K */
    public final void mo7117K(C3121p pVar) {
        if (pVar.f9148f && pVar.f9145c.isEmpty()) {
            this.f9183i.remove(pVar);
            mo7105l(pVar);
        }
    }

    /* renamed from: L */
    public final synchronized void mo7118L(int i, int i2) {
        Handler handler = this.f9181g;
        C2612ak.m6942Y(this.f9179e, i, i2);
        if (handler != null) {
            handler.obtainMessage(1, new C3122q(i, Integer.valueOf(i2))).sendToTarget();
        }
    }

    /* renamed from: M */
    public final void mo7119M() {
        this.f9184j = false;
        Set set = this.f9185k;
        this.f9185k = new HashSet();
        mo6952y(new C3118m(this.f9176b, this.f9178d));
        Handler handler = this.f9181g;
        handler.getClass();
        handler.obtainMessage(5, set).sendToTarget();
    }

    /* renamed from: a */
    public final C2590aq mo6745a() {
        return f9175a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ int mo7101b(Object obj, int i) {
        return i + ((C3121p) obj).f9147e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C3036as mo6963d(Object obj, C3036as asVar) {
        C3121p pVar = (C3121p) obj;
        for (int i = 0; i < pVar.f9145c.size(); i++) {
            if (((C3036as) pVar.f9145c.get(i)).f7207d == asVar.f7207d) {
                return asVar.mo6972b(Pair.create(pVar.f9144b, asVar.f7204a));
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final synchronized void mo6750f(C2495an anVar) {
        super.mo6750f(anVar);
        this.f9181g = new Handler(new C3117l(this));
        if (this.f9179e.isEmpty()) {
            mo7119M();
            return;
        }
        this.f9178d = this.f9178d.mo7091b(0, this.f9179e.size());
        mo7114H(0, this.f9179e);
        mo7120N();
    }

    /* renamed from: h */
    public final void mo6752h(C3034aq aqVar) {
        C3121p pVar = (C3121p) this.f9182h.remove(aqVar);
        pVar.getClass();
        pVar.f9143a.mo6752h(aqVar);
        pVar.f9145c.remove(((C3028ak) aqVar).f8773a);
        if (!this.f9182h.isEmpty()) {
            m9114O();
        }
        mo7117K(pVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final synchronized void mo6753i() {
        super.mo6753i();
        this.f9176b.clear();
        this.f9183i.clear();
        this.f9177c.clear();
        this.f9178d = this.f9178d.mo7090a();
        Handler handler = this.f9181g;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f9181g = null;
        }
        this.f9184j = false;
        this.f9185k.clear();
        mo7116J(this.f9180f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final /* synthetic */ void mo6964j(Object obj, C3038au auVar, C2651bm bmVar) {
        int c;
        C3121p pVar = (C3121p) obj;
        if (pVar.f9146d + 1 < this.f9176b.size() && (c = bmVar.mo6022c() - (((C3121p) this.f9176b.get(pVar.f9146d + 1)).f9147e - pVar.f9147e)) != 0) {
            mo7115I(pVar.f9146d + 1, 0, c);
        }
        mo7120N();
    }

    /* renamed from: m */
    public final C3034aq mo6757m(C3036as asVar, C3241g gVar, long j) {
        Object obj = ((Pair) asVar.f7204a).first;
        C3036as b = asVar.mo6972b(((Pair) asVar.f7204a).second);
        C3121p pVar = (C3121p) this.f9177c.get(obj);
        if (pVar == null) {
            pVar = new C3121p(new C3119n());
            pVar.f9148f = true;
            mo7104k(pVar, pVar.f9143a);
        }
        this.f9183i.add(pVar);
        mo7103g(pVar);
        pVar.f9145c.add(b);
        C3028ak n = pVar.f9143a.mo6757m(b, gVar, j);
        this.f9182h.put(n, pVar);
        m9114O();
        return n;
    }

    /* renamed from: n */
    public final synchronized int mo7121n() {
        return this.f9179e.size();
    }

    /* renamed from: o */
    public final synchronized C2651bm mo6942o() {
        C3098ci ciVar;
        if (this.f9178d.f9065a.length != this.f9179e.size()) {
            ciVar = this.f9178d.mo7090a().mo7091b(0, this.f9179e.size());
        } else {
            ciVar = this.f9178d;
        }
        return new C3118m(this.f9179e, ciVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo6948u() {
        super.mo6948u();
        this.f9183i.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo6950w() {
    }

    /* renamed from: N */
    public final void mo7120N() {
        if (!this.f9184j) {
            Handler handler = this.f9181g;
            handler.getClass();
            handler.obtainMessage(4).sendToTarget();
            this.f9184j = true;
        }
    }
}
