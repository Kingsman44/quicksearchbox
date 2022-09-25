package com.google.android.libraries.assistant.auto.tng.morris.p1096h;

import com.evernote.android.state.BuildConfig;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protos.p4850an.p4855d.p4858c.C63531d;
import com.google.protos.p4850an.p4855d.p4858c.C63533f;
import com.google.protos.p4850an.p4855d.p4858c.C63535h;
import java.util.Iterator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.h.d */
/* compiled from: PG */
public final /* synthetic */ class C15376d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C15376d f46153a = new C15376d();

    private /* synthetic */ C15376d() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C63533f fVar;
        for (C61746h hVar : ((C61752n) obj).f166812c) {
            C61748j jVar = hVar.f166797e;
            if (jVar == null) {
                jVar = C61748j.f166800d;
            }
            if (jVar.f166802a == 22) {
                fVar = (C63533f) jVar.f166803b;
            } else {
                fVar = C63533f.f171842d;
            }
            Iterator it = fVar.f171845b.iterator();
            while (true) {
                if (it.hasNext()) {
                    Iterator it2 = ((C63535h) it.next()).f171850a.iterator();
                    if (it2.hasNext()) {
                        return ((C63531d) it2.next()).f171839a;
                    }
                }
            }
        }
        return BuildConfig.FLAVOR;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
