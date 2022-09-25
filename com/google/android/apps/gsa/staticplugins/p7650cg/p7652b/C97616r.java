package com.google.android.apps.gsa.staticplugins.p7650cg.p7652b;

import android.widget.Toast;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.libraries.p1646ay.C19599a;
import com.google.p375ai.p378b.C7871na;
import com.google.p375ai.p378b.C8150xj;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.cg.b.r */
/* compiled from: PG */
public final /* synthetic */ class C97616r implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C97620v f272651a;

    public /* synthetic */ C97616r(C97620v vVar) {
        this.f272651a = vVar;
    }

    public final Object call() {
        C97620v vVar = this.f272651a;
        C7871na naVar = vVar.f272658d;
        if ((naVar.f27566a & 64) != 0) {
            C89291a aVar = vVar.f272656b;
            C19599a aVar2 = vVar.f54539k;
            C8150xj xjVar = naVar.f27573h;
            if (xjVar == null) {
                xjVar = C8150xj.f28657d;
            }
            Toast.makeText(vVar.f54539k, aVar.mo83231a(aVar2, xjVar), 1).show();
        }
        vVar.f54539k.mo24855e();
        return C118826c.f331422a;
    }
}
