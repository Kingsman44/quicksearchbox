package com.google.android.youtube.player.p3561b;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.youtube.player.C45510f;
import java.util.ArrayList;

/* renamed from: com.google.android.youtube.player.b.ab */
public final class C45443ab extends C45442aa {

    /* renamed from: b */
    public final C45510f f118850b;

    /* renamed from: c */
    public final IBinder f118851c;

    /* renamed from: d */
    final /* synthetic */ C45446ae f118852d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45443ab(C45446ae aeVar, String str, IBinder iBinder) {
        super(aeVar, true);
        C45510f fVar;
        this.f118852d = aeVar;
        try {
            fVar = C45510f.m81264a(str);
        } catch (IllegalArgumentException | NullPointerException unused) {
            fVar = C45510f.UNKNOWN_ERROR;
        }
        this.f118850b = fVar;
        this.f118851c = iBinder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo49589a(Object obj) {
        C45446ae aeVar;
        C45510f fVar;
        if (obj != null) {
            C45510f fVar2 = C45510f.SUCCESS;
            if (this.f118850b.ordinal() != 0) {
                aeVar = this.f118852d;
                fVar = this.f118850b;
            } else {
                try {
                    if (this.f118852d.mo49594d().equals(this.f118851c.getInterfaceDescriptor())) {
                        C45446ae aeVar2 = this.f118852d;
                        aeVar2.f118856b = aeVar2.mo49593c(this.f118851c);
                        C45446ae aeVar3 = this.f118852d;
                        if (aeVar3.f118856b != null) {
                            synchronized (aeVar3.f118857c) {
                                boolean z = true;
                                C45459ar.m81134a(!aeVar3.f118859e);
                                aeVar3.f118855a.removeMessages(4);
                                aeVar3.f118859e = true;
                                if (aeVar3.f118858d.size() != 0) {
                                    z = false;
                                }
                                C45459ar.m81134a(z);
                                ArrayList arrayList = aeVar3.f118857c;
                                int size = arrayList.size();
                                int i = 0;
                                while (true) {
                                    if (i >= size || !aeVar3.f118861g) {
                                        break;
                                    } else if (!aeVar3.mo49602l()) {
                                        break;
                                    } else {
                                        if (!aeVar3.f118858d.contains(arrayList.get(i))) {
                                            ((C45481bm) arrayList.get(i)).mo49633a();
                                        }
                                        i++;
                                    }
                                }
                                aeVar3.f118858d.clear();
                                aeVar3.f118859e = false;
                            }
                            return;
                        }
                    }
                } catch (RemoteException unused) {
                }
                this.f118852d.mo49598h();
                aeVar = this.f118852d;
                fVar = C45510f.INTERNAL_ERROR;
            }
            aeVar.mo49601k(fVar);
        }
    }
}
