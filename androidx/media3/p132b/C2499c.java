package androidx.media3.p132b;

import androidx.media3.common.p136b.C2612ak;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.media3.b.c */
/* compiled from: PG */
public abstract class C2499c implements C2505i {

    /* renamed from: a */
    private final boolean f6865a;

    /* renamed from: b */
    private final ArrayList f6866b = new ArrayList(1);

    /* renamed from: c */
    private int f6867c;

    /* renamed from: d */
    private C2510n f6868d;

    protected C2499c(boolean z) {
        this.f6865a = z;
    }

    /* renamed from: e */
    public /* synthetic */ Map mo5883e() {
        return Collections.emptyMap();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo5927g(int i) {
        C2510n nVar = this.f6868d;
        int i2 = C2612ak.f7249a;
        for (int i3 = 0; i3 < this.f6867c; i3++) {
            ((C2495an) this.f6866b.get(i3)).mo5923a(this, nVar, this.f6865a, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo5928h() {
        C2510n nVar = this.f6868d;
        int i = C2612ak.f7249a;
        for (int i2 = 0; i2 < this.f6867c; i2++) {
            ((C2495an) this.f6866b.get(i2)).mo5924b(this, nVar, this.f6865a);
        }
        this.f6868d = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo5929i(C2510n nVar) {
        for (int i = 0; i < this.f6867c; i++) {
            ((C2495an) this.f6866b.get(i)).mo5925c(this, nVar, this.f6865a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo5930j(C2510n nVar) {
        this.f6868d = nVar;
        for (int i = 0; i < this.f6867c; i++) {
            ((C2495an) this.f6866b.get(i)).mo5926d(this, nVar, this.f6865a);
        }
    }

    /* renamed from: f */
    public final void mo5884f(C2495an anVar) {
        anVar.getClass();
        if (!this.f6866b.contains(anVar)) {
            this.f6866b.add(anVar);
            this.f6867c++;
        }
    }
}
