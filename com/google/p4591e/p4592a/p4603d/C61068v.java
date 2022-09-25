package com.google.p4591e.p4592a.p4603d;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.e.a.d.v */
/* compiled from: PG */
public final class C61068v {

    /* renamed from: a */
    private final String f165344a;

    /* renamed from: b */
    private final C61067u f165345b;

    /* renamed from: c */
    private C61067u f165346c;

    public C61068v(String str) {
        C61067u uVar = new C61067u();
        this.f165345b = uVar;
        this.f165346c = uVar;
        this.f165344a = str;
    }

    /* renamed from: a */
    public final void mo57642a(String str, Object obj) {
        C61067u uVar = new C61067u();
        this.f165346c.f165343c = uVar;
        this.f165346c = uVar;
        uVar.f165342b = obj;
        uVar.f165341a = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f165344a);
        sb.append('{');
        C61067u uVar = this.f165345b.f165343c;
        String str = BuildConfig.FLAVOR;
        while (uVar != null) {
            sb.append(str);
            String str2 = uVar.f165341a;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            sb.append(uVar.f165342b);
            uVar = uVar.f165343c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
