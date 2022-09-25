package androidx.media3.exoplayer;

import android.os.Handler;
import androidx.media3.common.C2651bm;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.p137a.C2684a;
import androidx.media3.exoplayer.p137a.C2731bt;
import androidx.media3.exoplayer.p139c.C2862e;
import androidx.media3.exoplayer.p145h.C3005a;
import androidx.media3.exoplayer.p145h.C3028ak;
import androidx.media3.exoplayer.p145h.C3031an;
import androidx.media3.exoplayer.p145h.C3034aq;
import androidx.media3.exoplayer.p145h.C3038au;
import androidx.media3.exoplayer.p145h.C3065bc;
import androidx.media3.exoplayer.p145h.C3098ci;
import androidx.media3.p132b.C2495an;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.media3.exoplayer.cp */
/* compiled from: PG */
final class C2887cp {

    /* renamed from: a */
    public final List f8151a = new ArrayList();

    /* renamed from: b */
    public final IdentityHashMap f8152b = new IdentityHashMap();

    /* renamed from: c */
    public final Map f8153c = new HashMap();

    /* renamed from: d */
    public final C2886co f8154d;

    /* renamed from: e */
    public final C3065bc f8155e;

    /* renamed from: f */
    public final C2862e f8156f;

    /* renamed from: g */
    public final HashMap f8157g;

    /* renamed from: h */
    public final Set f8158h;

    /* renamed from: i */
    public boolean f8159i;

    /* renamed from: j */
    public C2495an f8160j;

    /* renamed from: k */
    public C3098ci f8161k = new C3098ci();

    /* renamed from: l */
    private final C2731bt f8162l;

    public C2887cp(C2886co coVar, C2684a aVar, Handler handler, C2731bt btVar) {
        this.f8162l = btVar;
        this.f8154d = coVar;
        C3065bc bcVar = new C3065bc();
        this.f8155e = bcVar;
        C2862e eVar = new C2862e();
        this.f8156f = eVar;
        this.f8157g = new HashMap();
        this.f8158h = new HashSet();
        bcVar.mo7003b(handler, aVar);
        eVar.mo6609c(aVar);
    }

    /* renamed from: h */
    private final void m8031h(int i, int i2) {
        while (i < this.f8151a.size()) {
            ((C2885cn) this.f8151a.get(i)).f8149d += i2;
            i++;
        }
    }

    /* renamed from: i */
    private final void m8032i(C2885cn cnVar) {
        C2884cm cmVar = (C2884cm) this.f8157g.get(cnVar);
        if (cmVar != null) {
            cmVar.f8143a.mo6947t(cmVar.f8144b);
        }
    }

    /* renamed from: j */
    private final void m8033j(C2885cn cnVar) {
        if (cnVar.f8150e && cnVar.f8148c.isEmpty()) {
            C2884cm cmVar = (C2884cm) this.f8157g.remove(cnVar);
            cmVar.getClass();
            cmVar.f8143a.mo6953z(cmVar.f8144b);
            C3038au auVar = cmVar.f8143a;
            ((C3005a) auVar).f8710o.mo7013l(cmVar.f8145c);
            C3038au auVar2 = cmVar.f8143a;
            ((C3005a) auVar2).f8711p.mo6608b(cmVar.f8145c);
            this.f8158h.remove(cnVar);
        }
    }

    /* renamed from: a */
    public final int mo6660a() {
        return this.f8151a.size();
    }

    /* renamed from: b */
    public final C2651bm mo6661b() {
        if (this.f8151a.isEmpty()) {
            return C2651bm.f7353c;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f8151a.size(); i2++) {
            C2885cn cnVar = (C2885cn) this.f8151a.get(i2);
            cnVar.f8149d = i;
            i += cnVar.f8146a.f8786a.f8765a.mo6022c();
        }
        return new C2892cu(this.f8151a, this.f8161k);
    }

    /* renamed from: c */
    public final void mo6662c() {
        Iterator it = this.f8158h.iterator();
        while (it.hasNext()) {
            C2885cn cnVar = (C2885cn) it.next();
            if (cnVar.f8148c.isEmpty()) {
                m8032i(cnVar);
                it.remove();
            }
        }
    }

    /* renamed from: d */
    public final void mo6663d(C2885cn cnVar) {
        C3031an anVar = cnVar.f8146a;
        C2882ck ckVar = new C2882ck(this);
        C2883cl clVar = new C2883cl(this, cnVar);
        this.f8157g.put(cnVar, new C2884cm(anVar, ckVar, clVar));
        anVar.mo6946s(new Handler(C2612ak.m6923F(), (Handler.Callback) null), clVar);
        anVar.mo6945r(new Handler(C2612ak.m6923F(), (Handler.Callback) null), clVar);
        anVar.mo6951x(ckVar, this.f8160j, this.f8162l);
    }

    /* renamed from: e */
    public final void mo6664e(C3034aq aqVar) {
        C2885cn cnVar = (C2885cn) this.f8152b.remove(aqVar);
        cnVar.getClass();
        cnVar.f8146a.mo6752h(aqVar);
        cnVar.f8148c.remove(((C3028ak) aqVar).f8773a);
        if (!this.f8152b.isEmpty()) {
            mo6662c();
        }
        m8033j(cnVar);
    }

    /* renamed from: f */
    public final void mo6665f(int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= i) {
                C2885cn cnVar = (C2885cn) this.f8151a.remove(i2);
                this.f8153c.remove(cnVar.f8147b);
                m8031h(i2, -cnVar.f8146a.f8786a.f8765a.mo6022c());
                cnVar.f8150e = true;
                if (this.f8159i) {
                    m8033j(cnVar);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final C2651bm mo6666g(int i, List list, C3098ci ciVar) {
        if (!list.isEmpty()) {
            this.f8161k = ciVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                C2885cn cnVar = (C2885cn) list.get(i2 - i);
                if (i2 > 0) {
                    C2885cn cnVar2 = (C2885cn) this.f8151a.get(i2 - 1);
                    cnVar.mo6659c(cnVar2.f8149d + cnVar2.f8146a.f8786a.f8765a.mo6022c());
                } else {
                    cnVar.mo6659c(0);
                }
                m8031h(i2, cnVar.f8146a.f8786a.f8765a.mo6022c());
                this.f8151a.add(i2, cnVar);
                this.f8153c.put(cnVar.f8147b, cnVar);
                if (this.f8159i) {
                    mo6663d(cnVar);
                    if (this.f8152b.isEmpty()) {
                        this.f8158h.add(cnVar);
                    } else {
                        m8032i(cnVar);
                    }
                }
            }
        }
        return mo6661b();
    }
}
