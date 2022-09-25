package androidx.media;

/* renamed from: androidx.media.z */
/* compiled from: PG */
public class C2449z {

    /* renamed from: a */
    private boolean f6741a;

    /* renamed from: e */
    public final Object f6742e;

    /* renamed from: f */
    public boolean f6743f;

    /* renamed from: g */
    public boolean f6744g;

    /* renamed from: h */
    public int f6745h;

    public C2449z(Object obj) {
        this.f6742e = obj;
    }

    /* renamed from: a */
    public void mo5853a(Object obj) {
    }

    /* renamed from: b */
    public void mo5857b() {
        if (this.f6741a) {
            StringBuilder sb = new StringBuilder("detach() called when detach() had already been called for: ");
            Object obj = this.f6742e;
            sb.append(obj);
            throw new IllegalStateException("detach() called when detach() had already been called for: ".concat(String.valueOf(obj)));
        } else if (this.f6743f) {
            StringBuilder sb2 = new StringBuilder("detach() called when sendResult() had already been called for: ");
            Object obj2 = this.f6742e;
            sb2.append(obj2);
            throw new IllegalStateException("detach() called when sendResult() had already been called for: ".concat(String.valueOf(obj2)));
        } else if (!this.f6744g) {
            this.f6741a = true;
        } else {
            StringBuilder sb3 = new StringBuilder("detach() called when sendError() had already been called for: ");
            Object obj3 = this.f6742e;
            sb3.append(obj3);
            throw new IllegalStateException("detach() called when sendError() had already been called for: ".concat(String.valueOf(obj3)));
        }
    }

    /* renamed from: c */
    public final void mo5863c(Object obj) {
        if (this.f6743f || this.f6744g) {
            StringBuilder sb = new StringBuilder("sendResult() called when either sendResult() or sendError() had already been called for: ");
            Object obj2 = this.f6742e;
            sb.append(obj2);
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: ".concat(String.valueOf(obj2)));
        }
        this.f6743f = true;
        mo5853a(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo5864d() {
        return this.f6741a || this.f6743f || this.f6744g;
    }
}
