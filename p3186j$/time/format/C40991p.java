package p3186j$.time.format;

import com.evernote.android.state.BuildConfig;
import java.text.ParsePosition;
import java.util.Iterator;
import java.util.Set;

/* renamed from: j$.time.format.p */
class C40991p {

    /* renamed from: a */
    protected String f107361a;

    /* renamed from: b */
    protected String f107362b;

    /* renamed from: c */
    protected char f107363c;

    /* renamed from: d */
    protected C40991p f107364d;

    /* renamed from: e */
    protected C40991p f107365e;

    private C40991p(String str, String str2, C40991p pVar) {
        this.f107361a = str;
        this.f107362b = str2;
        this.f107364d = pVar;
        this.f107363c = str.isEmpty() ? 65535 : this.f107361a.charAt(0);
    }

    /* synthetic */ C40991p(String str, String str2, C40991p pVar, int i) {
        this(str, str2, pVar);
    }

    /* renamed from: b */
    private boolean m71427b(String str, String str2) {
        int i = 0;
        while (i < str.length() && i < this.f107361a.length() && mo43310c(str.charAt(i), this.f107361a.charAt(i))) {
            i++;
        }
        if (i != this.f107361a.length()) {
            C40991p e = mo43311e(this.f107361a.substring(i), this.f107362b, this.f107364d);
            this.f107361a = str.substring(0, i);
            this.f107364d = e;
            if (i < str.length()) {
                this.f107364d.f107365e = mo43311e(str.substring(i), str2, (C40991p) null);
                this.f107362b = null;
            } else {
                this.f107362b = str2;
            }
            return true;
        } else if (i < str.length()) {
            String substring = str.substring(i);
            for (C40991p pVar = this.f107364d; pVar != null; pVar = pVar.f107365e) {
                if (mo43310c(pVar.f107363c, substring.charAt(0))) {
                    return pVar.m71427b(substring, str2);
                }
            }
            C40991p e2 = mo43311e(substring, str2, (C40991p) null);
            e2.f107365e = this.f107364d;
            this.f107364d = e2;
            return true;
        } else {
            this.f107362b = str2;
            return true;
        }
    }

    /* renamed from: f */
    public static C40991p m71428f(C40999x xVar) {
        return xVar.mo43327k() ? new C40991p(BuildConfig.FLAVOR, (String) null, (C40991p) null) : new C40990o();
    }

    /* renamed from: g */
    public static C40991p m71429g(Set set, C40999x xVar) {
        C40991p f = m71428f(xVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            f.m71427b(str, str);
        }
        return f;
    }

    /* renamed from: a */
    public final void mo43313a(String str, String str2) {
        m71427b(str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo43310c(char c, char c2) {
        return c == c2;
    }

    /* renamed from: d */
    public final String mo43314d(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!mo43312h(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f107361a.length() + index;
        C40991p pVar = this.f107364d;
        if (pVar != null && length2 != length) {
            while (true) {
                if (!mo43310c(pVar.f107363c, charSequence.charAt(length2))) {
                    pVar = pVar.f107365e;
                    if (pVar == null) {
                        break;
                    }
                } else {
                    parsePosition.setIndex(length2);
                    String d = pVar.mo43314d(charSequence, parsePosition);
                    if (d != null) {
                        return d;
                    }
                }
            }
        }
        parsePosition.setIndex(length2);
        return this.f107362b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C40991p mo43311e(String str, String str2, C40991p pVar) {
        return new C40991p(str, str2, pVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo43312h(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f107361a, i);
        }
        int length = this.f107361a.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i5 = i3 + 1;
            int i6 = i + 1;
            if (!mo43310c(this.f107361a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }
}
