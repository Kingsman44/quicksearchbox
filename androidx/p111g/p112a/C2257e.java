package androidx.p111g.p112a;

import android.text.SpannableStringBuilder;
import androidx.core.p097i.C1974i;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.g.a.e */
/* compiled from: PG */
public final class C2257e extends SpannableStringBuilder {

    /* renamed from: a */
    private final Class f6347a;

    /* renamed from: b */
    private final List f6348b = new ArrayList();

    public C2257e(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f6347a = cls;
    }

    /* renamed from: a */
    private final C2256d m6169a(Object obj) {
        for (int i = 0; i < this.f6348b.size(); i++) {
            C2256d dVar = (C2256d) this.f6348b.get(i);
            if (dVar.f6345a == obj) {
                return dVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    private final void m6170b() {
        for (int i = 0; i < this.f6348b.size(); i++) {
            ((C2256d) this.f6348b.get(i)).f6346b.incrementAndGet();
        }
    }

    /* renamed from: c */
    private final void m6171c() {
        for (int i = 0; i < this.f6348b.size(); i++) {
            ((C2256d) this.f6348b.get(i)).f6346b.decrementAndGet();
        }
    }

    /* renamed from: d */
    private final boolean m6172d(Class cls) {
        return this.f6347a == cls;
    }

    /* renamed from: e */
    private final boolean m6173e(Object obj) {
        return obj != null && m6172d(obj.getClass());
    }

    public final int getSpanEnd(Object obj) {
        C2256d a;
        if (m6173e(obj) && (a = m6169a(obj)) != null) {
            obj = a;
        }
        return super.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        C2256d a;
        if (m6173e(obj) && (a = m6169a(obj)) != null) {
            obj = a;
        }
        return super.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        C2256d a;
        if (m6173e(obj) && (a = m6169a(obj)) != null) {
            obj = a;
        }
        return super.getSpanStart(obj);
    }

    public final Object[] getSpans(int i, int i2, Class cls) {
        if (!m6172d(cls)) {
            return super.getSpans(i, i2, cls);
        }
        C2256d[] dVarArr = (C2256d[]) super.getSpans(i, i2, C2256d.class);
        Object[] objArr = (Object[]) Array.newInstance(cls, dVarArr.length);
        for (int i3 = 0; i3 < dVarArr.length; i3++) {
            objArr[i3] = dVarArr[i3].f6345a;
        }
        return objArr;
    }

    public final int nextSpanTransition(int i, int i2, Class<C2256d> cls) {
        if (cls == null || m6172d(cls)) {
            cls = C2256d.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    public final void removeSpan(Object obj) {
        C2256d dVar;
        if (m6173e(obj)) {
            dVar = m6169a(obj);
            if (dVar != null) {
                obj = dVar;
            }
        } else {
            dVar = null;
        }
        super.removeSpan(obj);
        if (dVar != null) {
            this.f6348b.remove(dVar);
        }
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m6173e(obj)) {
            C2256d dVar = new C2256d(obj);
            this.f6348b.add(dVar);
            obj = dVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    public final CharSequence subSequence(int i, int i2) {
        return new C2257e(this.f6347a, this, i, i2);
    }

    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m6170b();
        super.replace(i, i2, charSequence);
        m6171c();
        return this;
    }

    public C2257e(Class cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        C1974i.m5319g(cls, "watcherClass cannot be null");
        this.f6347a = cls;
    }

    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m6170b();
        super.replace(i, i2, charSequence, i3, i4);
        m6171c();
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
