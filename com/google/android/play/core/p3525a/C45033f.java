package com.google.android.play.core.p3525a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.tasks.C146021aq;
import com.google.android.play.core.install.C45199b;

/* renamed from: com.google.android.play.core.a.f */
/* compiled from: PG */
final class C45033f implements C45032e {

    /* renamed from: a */
    private final C45043p f117655a;

    /* renamed from: b */
    private final Context f117656b;

    public C45033f(C45043p pVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.f117655a = pVar;
        this.f117656b = context;
    }

    /* renamed from: a */
    public final C146006ab mo48866a() {
        C45043p pVar = this.f117655a;
        String packageName = this.f117656b.getPackageName();
        if (pVar.f117673b == null) {
            C45043p.f117671a.mo48884b("onError(%d)", -9);
            return C146021aq.m237849c(new C45199b(-9));
        }
        C45043p.f117671a.mo48886d("requestUpdateInfo(%s)", packageName);
        C146010af afVar = new C146010af();
        pVar.f117673b.mo48909c(new C45040m(pVar, afVar, packageName, afVar), afVar);
        return afVar.f394698a;
    }

    /* renamed from: b */
    public final void mo48867b(C45025a aVar, Activity activity) {
        C45038k c = C45038k.m80183c();
        if (activity != null && aVar != null && aVar.mo48862a(c) != null && !aVar.f117646c) {
            aVar.f117646c = true;
            activity.startIntentSenderForResult(aVar.mo48862a(c).getIntentSender(), 338535043, (Intent) null, 0, 0, 0, (Bundle) null);
        }
    }
}
