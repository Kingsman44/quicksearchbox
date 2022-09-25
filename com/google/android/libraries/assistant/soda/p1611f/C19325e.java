package com.google.android.libraries.assistant.soda.p1611f;

import com.google.android.libraries.assistant.soda.Soda;
import com.google.android.libraries.assistant.soda.p1611f.p1612a.C19321a;
import com.google.android.libraries.p1963i.C23846au;
import com.google.android.libraries.p1963i.C23847av;
import com.google.common.p4526f.C59052c;
import com.google.speech.p5218j.C66760aa;
import com.google.speech.p5218j.C67175t;
import com.google.speech.p5218j.p5219a.C66745l;
import com.google.speech.p5218j.p5219a.C66748o;
import com.google.speech.p5218j.p5219a.C66750q;
import com.google.speech.p5218j.p5219a.C66752s;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.soda.f.e */
/* compiled from: PG */
public final /* synthetic */ class C19325e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C19329i f54080a;

    /* renamed from: b */
    public final /* synthetic */ C66752s f54081b;

    public /* synthetic */ C19325e(C19329i iVar, C66752s sVar) {
        this.f54080a = iVar;
        this.f54081b = sVar;
    }

    public final Object call() {
        C66750q qVar;
        C66750q qVar2;
        C19329i iVar = this.f54080a;
        C66752s sVar = this.f54081b;
        Soda soda = iVar.f54090e;
        if (soda != null) {
            soda.mo24332h(C19329i.f54087b, 0);
            ((C59052c) ((C59052c) C19329i.f54086a.mo56224b()).mo56372aa(47767)).mo56386p("End audio push first.");
            iVar.f54090e.mo24349p();
            ((C59052c) ((C59052c) C19329i.f54086a.mo56224b()).mo56372aa(47768)).mo56386p("Stop capturing before start.");
            C66745l lVar = sVar.f181550e;
            if (lVar == null) {
                lVar = C66745l.f181530c;
            }
            if (lVar.f181532a == 1) {
                qVar = (C66750q) lVar.f181533b;
            } else {
                qVar = C66750q.f181536g;
            }
            int a = C66748o.m97338a(qVar.f181539b);
            iVar.f54091f = a != 0 && a == 3;
            iVar.f54092g = 0;
            C66745l lVar2 = sVar.f181550e;
            if (lVar2 == null) {
                lVar2 = C66745l.f181530c;
            }
            if (lVar2.f181532a == 1) {
                qVar2 = (C66750q) lVar2.f181533b;
            } else {
                qVar2 = C66750q.f181536g;
            }
            C67175t tVar = qVar2.f181541d;
            if (tVar == null) {
                tVar = C67175t.f182588e;
            }
            iVar.f54093h = tVar;
            if ((sVar.f181546a & 64) != 0) {
                C19321a aVar = iVar.f54089d;
                C66760aa aaVar = sVar.f181553h;
                if (aaVar == null) {
                    aaVar = C66760aa.f181571b;
                }
                aVar.mo24458b(aaVar);
            }
            C23846au a2 = C23847av.m44395a(-16);
            try {
                iVar.f54090e.mo24327d(sVar);
                a2.close();
                ((C59052c) ((C59052c) C19329i.f54086a.mo56224b()).mo56372aa(47769)).mo56386p("#startCapture capture started.");
                return null;
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        } else {
            ((C59052c) ((C59052c) C19329i.f54086a.mo56225c()).mo56372aa(47766)).mo56386p("Soda is not initialized!");
            throw new Exception("Soda is not initialized!");
        }
        throw th;
    }
}
