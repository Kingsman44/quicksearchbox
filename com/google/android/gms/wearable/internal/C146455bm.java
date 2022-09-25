package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143825n;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.wearable.internal.bm */
/* compiled from: PG */
final class C146455bm extends C146489ct {

    /* renamed from: a */
    private final WeakReference f395652a;

    /* renamed from: b */
    private final WeakReference f395653b;

    public C146455bm(Map map, Object obj, C143825n nVar) {
        super(nVar);
        this.f395652a = new WeakReference(map);
        this.f395653b = new WeakReference(obj);
    }

    /* renamed from: i */
    public final void mo123186i(Status status) {
        Map map = (Map) this.f395652a.get();
        Object obj = this.f395653b.get();
        if (!(status.f389621g != 4002 || map == null || obj == null)) {
            synchronized (map) {
                C146503dg dgVar = (C146503dg) map.remove(obj);
                if (dgVar != null) {
                    dgVar.mo123291a();
                }
            }
        }
        mo123287H(status);
    }
}
