package com.google.research.p5181a.p5187e;

import com.google.research.p5181a.p5186d.C66343o;
import com.google.research.p5181a.p5188f.C66376a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.google.research.a.e.x */
/* compiled from: PG */
public abstract class C66374x extends C66361k {

    /* renamed from: a */
    private static final Comparator f180466a = new C66373w();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo59576a(C66376a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C66343o mo59577b(C66376a aVar);

    /* renamed from: c */
    public C66367q mo59571c(C66376a aVar) {
        C66343o b = mo59577b(aVar);
        int a = mo59576a(aVar);
        if (a != -1) {
            return mo59578d().mo59586b(b, a);
        }
        return new C66367q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C66372v mo59578d();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract ArrayList mo59579f(C66376a aVar, float[] fArr);

    /* renamed from: g */
    public void mo59580g(DataInputStream dataInputStream, C66376a aVar) {
        throw null;
    }

    /* renamed from: h */
    public void mo59581h(DataOutputStream dataOutputStream) {
        throw null;
    }

    /* renamed from: l */
    public final void mo59594l(Integer num, Integer num2) {
        throw null;
    }

    /* renamed from: t */
    public final C66367q mo59574t(C66376a aVar) {
        ArrayList f = mo59579f(aVar, mo59578d().mo59589e(mo59577b(aVar)));
        Collections.sort(f, f180466a);
        C66367q qVar = new C66367q();
        qVar.f180459b = f;
        return qVar;
    }
}
