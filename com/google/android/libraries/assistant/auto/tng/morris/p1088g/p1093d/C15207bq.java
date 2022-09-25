package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.os.CountDownTimer;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14426iu;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.bq */
/* compiled from: PG */
final class C15207bq extends CountDownTimer {

    /* renamed from: a */
    final /* synthetic */ C15208br f45653a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15207bq(C15208br brVar) {
        super(2000, 2000);
        this.f45653a = brVar;
    }

    public final void onFinish() {
        C14986h hVar = this.f45653a.f45654a;
        C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
        C14426iu iuVar = (C14426iu) C14427iv.f43643o.createBuilder();
        iuVar.copyOnWrite();
        ((C14427iv) iuVar.instance).f43645a = 5;
        gtVar.copyOnWrite();
        C14492lf lfVar = (C14492lf) gtVar.instance;
        C14427iv ivVar = (C14427iv) iuVar.build();
        ivVar.getClass();
        lfVar.f43801d = ivVar;
        lfVar.f43800c = 5;
        hVar.mo21875g((C14492lf) gtVar.build());
        cancel();
    }

    public final void onTick(long j) {
    }
}
