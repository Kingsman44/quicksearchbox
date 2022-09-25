package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.p440an.p441a.C8841h;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.cp */
/* compiled from: PG */
public final class C113185cp {

    /* renamed from: c */
    private static final C8841h f313508c = C8841h.f30230c;

    /* renamed from: a */
    public final C113131ap f313509a;

    /* renamed from: b */
    public final C113131ap f313510b;

    public C113185cp(C86124t tVar) {
        this.f313509a = new C113131ap(tVar, C113180ck.f313501a, C90063do.f249360c);
        this.f313510b = new C113131ap(tVar, C113181cl.f313502a, C90063do.f249254a);
    }

    /* renamed from: a */
    public static C58495hd m187203a(C58495hd hdVar) {
        C58490gz gzVar = new C58490gz(4);
        Map.EL.forEach(hdVar, new C113179cj(gzVar));
        return gzVar.mo55427f(false);
    }

    /* renamed from: b */
    public static C8841h m187204b(String str) {
        if (str.equals("un")) {
            return f313508c;
        }
        if (str.length() > 2) {
            str = str.substring(0, 2);
        }
        return C8841h.m23466a(str);
    }

    /* renamed from: d */
    public static boolean m187205d(String str, C8841h hVar, C58495hd hdVar) {
        if (((Boolean) Optional.ofNullable((C58528ij) hdVar.get(f313508c)).map(new C113182cm(str)).orElse(false)).booleanValue() || ((Boolean) Optional.ofNullable((C58528ij) hdVar.get(hVar)).map(new C113183cn(str)).orElse(false)).booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final String mo99900c(String str, C8841h hVar, C48580an anVar) {
        return TextUtils.join(" ", (Iterable) DesugarArrays.stream((T[]) str.split("\\s+")).filter(new C113184co(this, hVar, anVar)).collect(C58370cn.f155946a));
    }
}
