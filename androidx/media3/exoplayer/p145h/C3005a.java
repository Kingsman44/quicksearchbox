package androidx.media3.exoplayer.p145h;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.C2651bm;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.exoplayer.p137a.C2731bt;
import androidx.media3.exoplayer.p139c.C2862e;
import androidx.media3.exoplayer.p139c.C2863f;
import androidx.media3.p132b.C2495an;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: androidx.media3.exoplayer.h.a */
/* compiled from: PG */
public abstract class C3005a implements C3038au {

    /* renamed from: a */
    private final ArrayList f8706a = new ArrayList(1);

    /* renamed from: b */
    private final HashSet f8707b = new HashSet(1);

    /* renamed from: c */
    private Looper f8708c;

    /* renamed from: d */
    private C2651bm f8709d;

    /* renamed from: o */
    public final C3065bc f8710o = new C3065bc();

    /* renamed from: p */
    public final C2862e f8711p = new C2862e();

    /* renamed from: q */
    public C2731bt f8712q;

    /* renamed from: A */
    public final void mo6938A(C2863f fVar) {
        this.f8711p.mo6608b(fVar);
    }

    /* renamed from: B */
    public final void mo6939B(C3066bd bdVar) {
        this.f8710o.mo7013l(bdVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final boolean mo6940C() {
        return !this.f8707b.isEmpty();
    }

    /* renamed from: D */
    public /* synthetic */ boolean mo6941D() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo6750f(C2495an anVar);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo6753i();

    /* renamed from: o */
    public /* synthetic */ C2651bm mo6942o() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final C2862e mo6943p(C3036as asVar) {
        return this.f8711p.mo6607a(0, asVar);
    }

    /* renamed from: q */
    public final C3065bc mo6944q(C3036as asVar) {
        return this.f8710o.mo7002a(0, asVar, 0);
    }

    /* renamed from: t */
    public final void mo6947t(C3037at atVar) {
        boolean isEmpty = this.f8707b.isEmpty();
        this.f8707b.remove(atVar);
        if ((!isEmpty) && this.f8707b.isEmpty()) {
            mo6948u();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo6948u() {
    }

    /* renamed from: v */
    public final void mo6949v(C3037at atVar) {
        this.f8708c.getClass();
        boolean isEmpty = this.f8707b.isEmpty();
        this.f8707b.add(atVar);
        if (isEmpty) {
            mo6950w();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo6950w() {
    }

    /* renamed from: x */
    public final void mo6951x(C3037at atVar, C2495an anVar, C2731bt btVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f8708c;
        boolean z = true;
        if (!(looper == null || looper == myLooper)) {
            z = false;
        }
        C2601a.m6830b(z);
        this.f8712q = btVar;
        C2651bm bmVar = this.f8709d;
        this.f8706a.add(atVar);
        if (this.f8708c == null) {
            this.f8708c = myLooper;
            this.f8707b.add(atVar);
            mo6750f(anVar);
        } else if (bmVar != null) {
            mo6949v(atVar);
            atVar.mo6658a(this, bmVar);
        }
    }

    /* renamed from: y */
    public final void mo6952y(C2651bm bmVar) {
        this.f8709d = bmVar;
        ArrayList arrayList = this.f8706a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C3037at) arrayList.get(i)).mo6658a(this, bmVar);
        }
    }

    /* renamed from: z */
    public final void mo6953z(C3037at atVar) {
        this.f8706a.remove(atVar);
        if (this.f8706a.isEmpty()) {
            this.f8708c = null;
            this.f8709d = null;
            this.f8712q = null;
            this.f8707b.clear();
            mo6753i();
            return;
        }
        mo6947t(atVar);
    }

    /* renamed from: r */
    public final void mo6945r(Handler handler, C2863f fVar) {
        fVar.getClass();
        this.f8711p.mo6609c(fVar);
    }

    /* renamed from: s */
    public final void mo6946s(Handler handler, C3066bd bdVar) {
        bdVar.getClass();
        this.f8710o.mo7003b(handler, bdVar);
    }
}
