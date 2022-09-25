package androidx.p124l.p125a;

import android.util.Log;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2333ah;
import androidx.lifecycle.C2391v;
import androidx.p124l.p126b.C2313c;
import com.google.android.libraries.social.licenses.C41957e;

/* renamed from: androidx.l.a.c */
/* compiled from: PG */
public final class C2306c extends C2332ag {

    /* renamed from: h */
    public final int f6452h = 54321;

    /* renamed from: i */
    public final C2313c f6453i;

    /* renamed from: j */
    public C2307d f6454j;

    /* renamed from: k */
    private C2391v f6455k;

    public C2306c(C2313c cVar) {
        this.f6453i = cVar;
        if (cVar.f6475i == null) {
            cVar.f6475i = this;
            cVar.f6469c = 54321;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    /* renamed from: b */
    public final void mo5676b() {
        C2391v vVar = this.f6455k;
        C2307d dVar = this.f6454j;
        if (vVar != null && dVar != null) {
            super.mo5679j(dVar);
            mo5704e(vVar, dVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo5677g() {
        if (C2310g.m6251b(2)) {
            new StringBuilder("  Starting: ").append(this);
            Log.v("LoaderManager", "  Starting: ".concat(toString()));
        }
        C2313c cVar = this.f6453i;
        cVar.f6471e = true;
        cVar.f6473g = false;
        cVar.f6472f = false;
        cVar.mo5695e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo5678h() {
        if (C2310g.m6251b(2)) {
            new StringBuilder("  Stopping: ").append(this);
            Log.v("LoaderManager", "  Stopping: ".concat(toString()));
        }
        C2313c cVar = this.f6453i;
        cVar.f6471e = false;
        cVar.mo5693c();
    }

    /* renamed from: j */
    public final void mo5679j(C2333ah ahVar) {
        super.mo5679j(ahVar);
        this.f6455k = null;
        this.f6454j = null;
    }

    /* renamed from: n */
    public final void mo5680n() {
        if (C2310g.m6251b(3)) {
            new StringBuilder("  Destroying: ").append(this);
            Log.d("LoaderManager", "  Destroying: ".concat(toString()));
        }
        this.f6453i.mo5693c();
        this.f6453i.f6472f = true;
        C2307d dVar = this.f6454j;
        if (dVar != null) {
            mo5679j(dVar);
            if (dVar.f6458c) {
                if (C2310g.m6251b(2)) {
                    StringBuilder sb = new StringBuilder("  Resetting: ");
                    C2313c cVar = dVar.f6456a;
                    sb.append(cVar);
                    Log.v("LoaderManager", "  Resetting: ".concat(String.valueOf(cVar)));
                }
                C41957e eVar = (C41957e) dVar.f6457b;
                eVar.f109509a.clear();
                eVar.f109509a.notifyDataSetChanged();
            }
        }
        C2313c cVar2 = this.f6453i;
        C2306c cVar3 = cVar2.f6475i;
        if (cVar3 == null) {
            throw new IllegalStateException("No listener register");
        } else if (cVar3 == this) {
            cVar2.f6475i = null;
            cVar2.f6473g = true;
            cVar2.f6471e = false;
            cVar2.f6472f = false;
            cVar2.f6474h = false;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    /* renamed from: o */
    public final void mo5681o(C2391v vVar, C2304a aVar) {
        C2307d dVar = new C2307d(this.f6453i, aVar);
        mo5704e(vVar, dVar);
        C2307d dVar2 = this.f6454j;
        if (dVar2 != null) {
            mo5679j(dVar2);
        }
        this.f6455k = vVar;
        this.f6454j = dVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.f6452h);
        sb.append(" : ");
        sb.append(this.f6453i.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.f6453i)));
        sb.append("}}");
        return sb.toString();
    }
}
