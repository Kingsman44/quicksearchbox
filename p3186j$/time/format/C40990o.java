package p3186j$.time.format;

import com.evernote.android.state.BuildConfig;

/* renamed from: j$.time.format.o */
final class C40990o extends C40991p {
    C40990o() {
        super(BuildConfig.FLAVOR, (String) null, (C40991p) null, 0);
    }

    private C40990o(String str, String str2, C40991p pVar) {
        super(str, str2, pVar, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo43310c(char c, char c2) {
        return C40999x.m71455c(c, c2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C40991p mo43311e(String str, String str2, C40991p pVar) {
        return new C40990o(str, str2, pVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo43312h(CharSequence charSequence, int i, int i2) {
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
            if (!C40999x.m71455c(this.f107361a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }
}
