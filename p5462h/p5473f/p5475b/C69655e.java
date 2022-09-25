package p5462h.p5473f.p5475b;

import java.io.Serializable;
import p5462h.p5481k.C69703a;
import p5462h.p5481k.C69705c;

/* renamed from: h.f.b.e */
/* compiled from: PG */
public abstract class C69655e implements Serializable, C69703a {

    /* renamed from: b */
    public static final Object f186032b = C69654d.f186031a;

    /* renamed from: a */
    private transient C69703a f186033a;

    /* renamed from: c */
    protected final Object f186034c;

    /* renamed from: d */
    public final String f186035d;

    /* renamed from: e */
    public final String f186036e;

    /* renamed from: f */
    private final Class f186037f;

    /* renamed from: g */
    private final boolean f186038g;

    protected C69655e(Object obj, Class cls, String str, String str2, boolean z) {
        this.f186034c = obj;
        this.f186037f = cls;
        this.f186035d = str;
        this.f186036e = str2;
        this.f186038g = z;
    }

    /* renamed from: c */
    public final String mo61373c() {
        return this.f186035d;
    }

    /* renamed from: d */
    public final C69703a mo61374d() {
        C69703a aVar = this.f186033a;
        if (aVar != null) {
            return aVar;
        }
        mo61377h();
        this.f186033a = this;
        return this;
    }

    /* renamed from: f */
    public final C69705c mo61375f() {
        if (this.f186038g) {
            return new C69671u(this.f186037f);
        }
        Class cls = this.f186037f;
        int i = C69649af.f186028a;
        return new C69657g(cls);
    }

    /* renamed from: g */
    public final Object mo61376g() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo61377h();
}
