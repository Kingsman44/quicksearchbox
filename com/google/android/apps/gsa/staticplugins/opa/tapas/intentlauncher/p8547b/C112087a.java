package com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.p8547b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90043cv;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8557b.C112194t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113164bv;
import com.google.android.libraries.assistant.p1594s.p1597b.C19140aa;
import com.google.android.libraries.assistant.p1594s.p1597b.C19141ab;
import com.google.android.libraries.assistant.p1594s.p1597b.C19153an;
import com.google.android.libraries.assistant.p1594s.p1597b.C19165az;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.b.a */
/* compiled from: PG */
public final class C112087a {

    /* renamed from: a */
    private final C86124t f311292a;

    /* renamed from: b */
    private C19167ba f311293b;

    public C112087a(C86124t tVar) {
        this.f311292a = tVar;
    }

    /* renamed from: a */
    public final C19167ba mo99370a() {
        if (this.f311293b == null) {
            C19165az azVar = (C19165az) C19167ba.f53673s.createBuilder();
            azVar.mo24303c(C113164bv.m187181b(this.f311292a.mo79745c(C90043cv.f248721c)));
            azVar.mo24302b(C113164bv.m187181b(this.f311292a.mo79745c(C90043cv.f248720b)));
            azVar.mo24301a(this.f311292a.mo79745c(C90043cv.f248719a));
            C19140aa aaVar = (C19140aa) C19141ab.f53614i.createBuilder();
            C19153an a = C112194t.m186075a(this.f311292a.mo79751q(C90063do.f249538fS));
            aaVar.copyOnWrite();
            C19141ab abVar = (C19141ab) aaVar.instance;
            a.getClass();
            abVar.f53621g = a;
            abVar.f53616a |= 8;
            C19153an a2 = C112194t.m186075a(this.f311292a.mo79751q(C90063do.f249539fT));
            aaVar.copyOnWrite();
            C19141ab abVar2 = (C19141ab) aaVar.instance;
            a2.getClass();
            abVar2.f53622h = a2;
            abVar2.f53616a |= 16;
            C19141ab abVar3 = (C19141ab) aaVar.build();
            azVar.copyOnWrite();
            C19167ba baVar = (C19167ba) azVar.instance;
            abVar3.getClass();
            baVar.f53685m = abVar3;
            baVar.f53675a |= 128;
            this.f311293b = (C19167ba) azVar.build();
        }
        return this.f311293b;
    }
}
