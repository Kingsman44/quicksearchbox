package androidx.camera.camera2.p063b;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.p069a.p070a.p072b.C1252a;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: androidx.camera.camera2.b.ba */
/* compiled from: PG */
public final /* synthetic */ class C1105ba implements C1252a {

    /* renamed from: a */
    public final /* synthetic */ C1112bh f3293a;

    /* renamed from: b */
    public final /* synthetic */ int f3294b;

    public /* synthetic */ C1105ba(C1112bh bhVar, int i) {
        this.f3293a = bhVar;
        this.f3294b = i;
    }

    /* renamed from: a */
    public final C60870cx mo3782a(Object obj) {
        C1112bh bhVar = this.f3293a;
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        if (C1122br.m3145c(this.f3294b, totalCaptureResult)) {
            bhVar.f3310g = C1112bh.f3303a;
        }
        return bhVar.f3312i.mo3860a(totalCaptureResult);
    }
}
