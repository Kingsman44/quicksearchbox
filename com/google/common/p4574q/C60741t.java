package com.google.common.p4574q;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58584kl;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: com.google.common.q.t */
/* compiled from: PG */
public final class C60741t implements Cloneable, Serializable {
    private static final long serialVersionUID = -8238943980617262692L;

    /* renamed from: a */
    private final Charset f164770a;

    /* renamed from: b */
    private String f164771b;

    /* renamed from: c */
    private String f164772c;

    /* renamed from: d */
    private String f164773d;

    /* renamed from: e */
    private C60743v f164774e;

    /* renamed from: f */
    private String f164775f;

    public C60741t() {
        this.f164770a = C60742u.f164776a;
    }

    /* renamed from: a */
    public static C60741t m92704a(C60740s sVar) {
        C60741t b = C60739r.m92697b(sVar.f164767g);
        C58838bb.m90879n(b.f164770a.equals(sVar.f164767g), "encoding mismatch; expected %s but was %s", b.f164770a, sVar.f164767g);
        String str = sVar.f164762b;
        if (str != null) {
            b.f164771b = str;
        }
        String str2 = sVar.f164763c;
        if (str2 != null) {
            b.f164772c = str2;
        }
        String str3 = sVar.f164764d;
        if (str3 != null) {
            b.f164773d = str3;
        }
        if (!sVar.mo57131c().mo54954G()) {
            b.mo57136b().mo54955H(sVar.mo57131c());
        }
        String str4 = sVar.f164766f;
        if (str4 != null) {
            b.f164775f = str4;
        }
        return b;
    }

    /* renamed from: b */
    public final C60743v mo57136b() {
        if (this.f164774e == null) {
            this.f164774e = new C60743v(new C58584kl(12));
        }
        return this.f164774e;
    }

    /* renamed from: c */
    public final void mo57137c(String str, String... strArr) {
        mo57136b().mo55279i(str, Arrays.asList(strArr));
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C60741t tVar = new C60741t();
        String str = this.f164771b;
        if (str != null) {
            tVar.f164771b = str;
        }
        String str2 = this.f164772c;
        if (str2 != null) {
            tVar.f164772c = str2;
        }
        String str3 = this.f164773d;
        if (str3 != null) {
            tVar.f164773d = str3;
        }
        String str4 = this.f164775f;
        if (str4 != null) {
            tVar.f164775f = str4;
        }
        C60743v vVar = this.f164774e;
        if (vVar != null) {
            tVar.f164774e = vVar.clone();
        }
        return tVar;
    }

    /* renamed from: d */
    public final C60740s mo57139d() {
        String str = this.f164771b;
        String str2 = this.f164772c;
        String str3 = this.f164773d;
        C60743v vVar = this.f164774e;
        String str4 = null;
        if (vVar != null && !vVar.mo54954G()) {
            str4 = C60739r.m92700e(this.f164774e, this.f164770a);
        }
        return new C60740s(str, str2, str3, str4, this.f164775f, this.f164770a);
    }

    public final String toString() {
        return mo57139d().toString();
    }

    public C60741t(Charset charset) {
        charset.getClass();
        this.f164770a = charset;
    }
}
