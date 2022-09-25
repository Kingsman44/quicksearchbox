package androidx.emoji.widget;

import android.text.SpannableStringBuilder;
import androidx.core.p097i.C1974i;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.emoji.widget.j */
/* compiled from: PG */
public final class C2226j extends SpannableStringBuilder {

    /* renamed from: a */
    private final Class f6285a;

    /* renamed from: b */
    private final List f6286b = new ArrayList();

    public C2226j(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f6285a = cls;
    }

    /* renamed from: d */
    private final C2225i m6116d(Object obj) {
        for (int i = 0; i < this.f6286b.size(); i++) {
            C2225i iVar = (C2225i) this.f6286b.get(i);
            if (iVar.f6283a == obj) {
                return iVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    private final boolean m6117e(Class cls) {
        return this.f6285a == cls;
    }

    /* renamed from: f */
    private final boolean m6118f(Object obj) {
        return obj != null && m6117e(obj.getClass());
    }

    /* renamed from: a */
    public final void mo5553a() {
        for (int i = 0; i < this.f6286b.size(); i++) {
            ((C2225i) this.f6286b.get(i)).f6284b.incrementAndGet();
        }
    }

    /* renamed from: b */
    public final void mo5558b() {
        for (int i = 0; i < this.f6286b.size(); i++) {
            ((C2225i) this.f6286b.get(i)).onTextChanged(this, 0, length(), length());
        }
    }

    /* renamed from: c */
    public final void mo5559c() {
        for (int i = 0; i < this.f6286b.size(); i++) {
            ((C2225i) this.f6286b.get(i)).f6284b.decrementAndGet();
        }
    }

    public final int getSpanEnd(Object obj) {
        C2225i d;
        if (m6118f(obj) && (d = m6116d(obj)) != null) {
            obj = d;
        }
        return super.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        C2225i d;
        if (m6118f(obj) && (d = m6116d(obj)) != null) {
            obj = d;
        }
        return super.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        C2225i d;
        if (m6118f(obj) && (d = m6116d(obj)) != null) {
            obj = d;
        }
        return super.getSpanStart(obj);
    }

    public final Object[] getSpans(int i, int i2, Class cls) {
        if (!m6117e(cls)) {
            return super.getSpans(i, i2, cls);
        }
        C2225i[] iVarArr = (C2225i[]) super.getSpans(i, i2, C2225i.class);
        Object[] objArr = (Object[]) Array.newInstance(cls, iVarArr.length);
        for (int i3 = 0; i3 < iVarArr.length; i3++) {
            objArr[i3] = iVarArr[i3].f6283a;
        }
        return objArr;
    }

    public final int nextSpanTransition(int i, int i2, Class<C2225i> cls) {
        if (true == m6117e(cls)) {
            cls = C2225i.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    public final void removeSpan(Object obj) {
        C2225i iVar;
        if (m6118f(obj)) {
            iVar = m6116d(obj);
            if (iVar != null) {
                obj = iVar;
            }
        } else {
            iVar = null;
        }
        super.removeSpan(obj);
        if (iVar != null) {
            this.f6286b.remove(iVar);
        }
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m6118f(obj)) {
            C2225i iVar = new C2225i(obj);
            this.f6286b.add(iVar);
            obj = iVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    public final CharSequence subSequence(int i, int i2) {
        return new C2226j(this.f6285a, this, i, i2);
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
        mo5553a();
        super.replace(i, i2, charSequence);
        mo5559c();
        return this;
    }

    public C2226j(Class cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        C1974i.m5319g(cls, "watcherClass cannot be null");
        this.f6285a = cls;
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
        mo5553a();
        super.replace(i, i2, charSequence, i3, i4);
        mo5559c();
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
