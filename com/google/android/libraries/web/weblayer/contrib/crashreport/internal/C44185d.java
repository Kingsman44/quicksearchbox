package com.google.android.libraries.web.weblayer.contrib.crashreport.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72356o;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.crashreport.internal.d */
/* compiled from: PG */
final class C44185d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String[] f114950a;

    /* renamed from: b */
    final /* synthetic */ C44186e f114951b;

    public C44185d(C44186e eVar, String[] strArr) {
        this.f114951b = eVar;
        this.f114950a = strArr;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C44187f.f114954a.mo56225c()).mo56382g(th)).mo56372aa(54181)).mo56386p("Checkbox opt-in check failed");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            String[] strArr = this.f114950a;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                try {
                    C72356o oVar = this.f114951b.f114952a.f193205b;
                    Parcel gA = oVar.mo17260gA();
                    gA.writeString(str);
                    oVar.mo17262he(5, gA);
                    i++;
                } catch (RemoteException e) {
                    throw new C72304a(e);
                }
            }
        }
    }
}
