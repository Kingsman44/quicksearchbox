package androidx.media3.exoplayer.p138b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: androidx.media3.exoplayer.b.y */
/* compiled from: PG */
public abstract class C2829y implements C2809e {

    /* renamed from: b */
    protected C2807c f7920b;

    /* renamed from: c */
    public ByteBuffer f7921c;

    /* renamed from: d */
    private C2807c f7922d = C2807c.f7838a;

    /* renamed from: e */
    private C2807c f7923e;

    /* renamed from: f */
    private ByteBuffer f7924f;

    /* renamed from: g */
    private boolean f7925g;

    public C2829y() {
        ByteBuffer byteBuffer = f7843a;
        this.f7924f = byteBuffer;
        this.f7921c = byteBuffer;
        C2807c cVar = C2807c.f7838a;
        this.f7923e = cVar;
        this.f7920b = cVar;
    }

    /* renamed from: a */
    public final C2807c mo6540a(C2807c cVar) {
        this.f7922d = cVar;
        this.f7923e = mo6501i(cVar);
        return mo6533g() ? this.f7923e : C2807c.f7838a;
    }

    /* renamed from: b */
    public ByteBuffer mo6541b() {
        ByteBuffer byteBuffer = this.f7921c;
        this.f7921c = f7843a;
        return byteBuffer;
    }

    /* renamed from: c */
    public final void mo6542c() {
        this.f7921c = f7843a;
        this.f7925g = false;
        this.f7920b = this.f7922d;
        mo6534k();
    }

    /* renamed from: d */
    public final void mo6543d() {
        this.f7925g = true;
        mo6535l();
    }

    /* renamed from: f */
    public final void mo6544f() {
        mo6542c();
        this.f7924f = f7843a;
        this.f7922d = C2807c.f7838a;
        C2807c cVar = C2807c.f7838a;
        this.f7923e = cVar;
        this.f7920b = cVar;
        mo6536m();
    }

    /* renamed from: g */
    public boolean mo6533g() {
        return this.f7923e != C2807c.f7838a;
    }

    /* renamed from: h */
    public boolean mo6545h() {
        return this.f7925g && this.f7921c == f7843a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C2807c mo6501i(C2807c cVar) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final ByteBuffer mo6569j(int i) {
        if (this.f7924f.capacity() < i) {
            this.f7924f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f7924f.clear();
        }
        ByteBuffer byteBuffer = this.f7924f;
        this.f7921c = byteBuffer;
        return byteBuffer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo6534k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo6535l() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo6536m() {
    }
}
