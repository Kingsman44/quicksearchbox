package com.google.android.libraries.lens.view.feedback;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.feedback.j */
/* compiled from: PG */
public final /* synthetic */ class C25819j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f70157a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f70158b;

    public /* synthetic */ C25819j(C60870cx cxVar, C60870cx cxVar2) {
        this.f70157a = cxVar;
        this.f70158b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f70157a;
        C60870cx cxVar2 = this.f70158b;
        Bundle bundle = new Bundle();
        ProtoParsers.ParcelableProto parcelableProto = (ProtoParsers.ParcelableProto) C60856cj.m92909r(cxVar2);
        bundle.putParcelable("screenshot", (Bitmap) C60856cj.m92909r(cxVar));
        if (parcelableProto != null) {
            bundle.putParcelable("client_image", parcelableProto);
        }
        return bundle;
    }
}
