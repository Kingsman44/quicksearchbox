package androidx.camera.camera2.p063b;

import androidx.camera.core.p069a.C1357cq;
import androidx.core.p097i.C1974i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.camera.camera2.b.bv */
/* compiled from: PG */
public final class C1126bv {

    /* renamed from: a */
    public volatile boolean f3339a = false;

    /* renamed from: b */
    public volatile C1357cq f3340b;

    public C1126bv(C1147cp cpVar, List list) {
        boolean z = false;
        z = cpVar.f3372l == 5 ? true : z;
        int i = cpVar.f3372l;
        C1145cn.m3165a(i);
        C1974i.m5314b(z, "CaptureSession state must be OPENED. Current state:".concat(C1145cn.m3165a(i)));
        Collections.unmodifiableList(new ArrayList(list));
    }
}
