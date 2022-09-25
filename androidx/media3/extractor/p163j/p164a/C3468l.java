package androidx.media3.extractor.p163j.p164a;

import android.support.p033v7.widget.LinearLayoutManager;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.p163j.C3482c;
import androidx.media3.extractor.p163j.C3486d;
import androidx.media3.extractor.p163j.C3496f;
import androidx.media3.extractor.p163j.C3508g;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: androidx.media3.extractor.j.a.l */
/* compiled from: PG */
abstract class C3468l implements C3486d {

    /* renamed from: a */
    private final ArrayDeque f10770a = new ArrayDeque();

    /* renamed from: b */
    public final ArrayDeque f10771b;

    /* renamed from: c */
    public long f10772c;

    /* renamed from: d */
    private final PriorityQueue f10773d;

    /* renamed from: e */
    private C3466j f10774e;

    /* renamed from: f */
    private long f10775f;

    public C3468l() {
        for (int i = 0; i < 10; i++) {
            this.f10770a.add(new C3466j());
        }
        this.f10771b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f10771b.add(new C3467k(new C3465i(this)));
        }
        this.f10773d = new PriorityQueue();
    }

    /* renamed from: k */
    private final void m10049k(C3466j jVar) {
        jVar.mo5953fg();
        this.f10770a.add(jVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5955a() {
        C2601a.m6832d(this.f10774e == null);
        if (this.f10770a.isEmpty()) {
            return null;
        }
        C3466j jVar = (C3466j) this.f10770a.pollFirst();
        this.f10774e = jVar;
        return jVar;
    }

    /* renamed from: c */
    public void mo5957c() {
        this.f10775f = 0;
        this.f10772c = 0;
        while (!this.f10773d.isEmpty()) {
            int i = C2612ak.f7249a;
            m10049k((C3466j) this.f10773d.poll());
        }
        C3466j jVar = this.f10774e;
        if (jVar != null) {
            m10049k(jVar);
            this.f10774e = null;
        }
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo5958d(Object obj) {
        C2601a.m6830b(obj == this.f10774e);
        C3466j jVar = (C3466j) obj;
        if (jVar.mo5954fh(LinearLayoutManager.INVALID_OFFSET)) {
            m10049k(jVar);
        } else {
            long j = this.f10775f;
            this.f10775f = 1 + j;
            jVar.f10768h = j;
            this.f10773d.add(jVar);
        }
        this.f10774e = null;
    }

    /* renamed from: e */
    public void mo5959e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract C3482c mo7420g();

    /* renamed from: h */
    public C3508g mo5956b() {
        if (!this.f10771b.isEmpty()) {
            while (!this.f10773d.isEmpty()) {
                int i = C2612ak.f7249a;
                if (((C3466j) this.f10773d.peek()).f6957e > this.f10772c) {
                    break;
                }
                C3466j jVar = (C3466j) this.f10773d.poll();
                if (jVar.mo5954fh(4)) {
                    C3508g gVar = (C3508g) this.f10771b.pollFirst();
                    gVar.f6941a = 4 | gVar.f6941a;
                    m10049k(jVar);
                    return gVar;
                }
                mo7422i(jVar);
                if (mo7423j()) {
                    C3482c g = mo7420g();
                    C3508g gVar2 = (C3508g) this.f10771b.pollFirst();
                    gVar2.mo7447e(jVar.f6957e, g, Long.MAX_VALUE);
                    m10049k(jVar);
                    return gVar2;
                }
                m10049k(jVar);
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo7422i(C3496f fVar);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract boolean mo7423j();

    /* renamed from: r */
    public final void mo7197r(long j) {
        this.f10772c = j;
    }
}
