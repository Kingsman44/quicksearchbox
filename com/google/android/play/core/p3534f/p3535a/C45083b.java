package com.google.android.play.core.p3534f.p3535a;

import android.content.Intent;
import android.util.Log;
import com.google.android.play.core.p3534f.C45111s;
import com.google.android.play.core.p3538g.C45146c;
import com.google.android.play.core.p3542h.C45192a;
import java.util.List;

/* renamed from: com.google.android.play.core.f.a.b */
/* compiled from: PG */
final class C45083b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f117740a;

    /* renamed from: b */
    final /* synthetic */ C45146c f117741b;

    /* renamed from: c */
    final /* synthetic */ C45084c f117742c;

    public C45083b(C45084c cVar, List list, C45146c cVar2) {
        this.f117742c = cVar;
        this.f117740a = list;
        this.f117741b = cVar2;
    }

    public final void run() {
        try {
            C45086e eVar = this.f117742c.f117744b;
            for (Intent stringExtra : this.f117740a) {
                if (!eVar.f117748a.mo48933f(stringExtra.getStringExtra("split_id")).exists()) {
                    C45084c cVar = this.f117742c;
                    List list = this.f117740a;
                    C45146c cVar2 = this.f117741b;
                    Integer a = cVar.mo48916a(list);
                    if (a != null) {
                        if (a.intValue() == 0) {
                            cVar2.mo48978c();
                            return;
                        } else {
                            cVar2.mo48977b(a.intValue());
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            C45084c cVar3 = this.f117742c;
            C45146c cVar4 = this.f117741b;
            try {
                if (!C45111s.m80290c(C45192a.m80471a(cVar3.f117743a), true)) {
                    Log.e("SplitCompat", "Emulating splits failed.");
                    cVar4.mo48977b(-12);
                    return;
                }
                Log.i("SplitCompat", "Splits installed.");
                cVar4.mo48976a();
            } catch (Exception e) {
                Log.e("SplitCompat", "Error emulating splits.", e);
                cVar4.mo48977b(-12);
            }
        } catch (Exception e2) {
            Log.e("SplitCompat", "Error checking verified files.", e2);
            this.f117741b.mo48977b(-11);
        }
    }
}
