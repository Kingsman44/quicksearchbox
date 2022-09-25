package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126292aa;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126293ab;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126309ar;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126332i;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126348y;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126349z;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.ag */
/* compiled from: PG */
public final /* synthetic */ class C125379ag implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C125383ak f345806a;

    /* renamed from: b */
    public final /* synthetic */ C126292aa f345807b;

    /* renamed from: c */
    public final /* synthetic */ C126348y f345808c;

    /* renamed from: d */
    public final /* synthetic */ int f345809d;

    public /* synthetic */ C125379ag(C125383ak akVar, C126292aa aaVar, C126348y yVar, int i) {
        this.f345806a = akVar;
        this.f345807b = aaVar;
        this.f345808c = yVar;
        this.f345809d = i;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        C125383ak akVar = this.f345806a;
        C126292aa aaVar = this.f345807b;
        C126348y yVar = this.f345808c;
        int i = this.f345809d;
        C125374ab abVar = akVar.f345818d;
        if (abVar == null) {
            C125374ab a = akVar.f345816b.mo70186a(aaVar, new C125377ae(akVar), yVar);
            akVar.f345818d = a;
            return a.mo106938a();
        }
        int i2 = i - 2;
        if (i2 == -1 || i2 == 0) {
            ((C59052c) ((C59052c) C125383ak.f345815a.mo56226d()).mo56372aa(36520)).mo56386p("Using the implementation specific ExistingDictationBehavior [SD]");
        } else if (i2 == 1) {
            return C60856cj.m92900i(C126293ab.m206510f(abVar.f345796o));
        }
        C47558bi a2 = C47831fm.m85006a("SD.Dictation.Adopt");
        try {
            ((C59052c) ((C59052c) C125374ab.f345782a.mo56224b()).mo56372aa(36506)).mo56389s("Updating %s with possibly changed params [SD]", abVar.f345795n);
            boolean equals = true ^ abVar.f345793l.mo107514g().equals(aaVar.mo107514g());
            C126349z d = aaVar.mo107511d();
            d.mo107547b(abVar.f345793l.mo107508a());
            abVar.f345793l = d.mo107546a();
            abVar.f345788g.f347976a.set(abVar.f345793l.mo107512e());
            abVar.mo106940c();
            abVar.mo106944g(aaVar.mo107510c());
            if (!equals) {
                if (abVar.f345793l.mo107513f().isEmpty()) {
                    cxVar = C60856cj.m92900i(C126293ab.m206510f(abVar.f345796o));
                    a2.mo51417a(cxVar);
                    a2.close();
                    return cxVar;
                }
            }
            cxVar = C126309ar.m206527f(abVar.f345784c.mo107476a(new C126332i(abVar.f345793l.mo107514g(), abVar.f345793l.mo107513f(), abVar.f345796o)), C126293ab.m206510f(abVar.f345796o));
            a2.mo51417a(cxVar);
            a2.close();
            return cxVar;
        } catch (Throwable th) {
            C125412p.m205382a(th, th);
        }
        throw th;
    }
}
