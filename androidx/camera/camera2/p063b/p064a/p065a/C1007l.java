package androidx.camera.camera2.p063b.p064a.p065a;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: androidx.camera.camera2.b.a.a.l */
/* compiled from: PG */
public final class C1007l {

    /* renamed from: a */
    public final SessionConfiguration f3149a;

    public C1007l(List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        C0999d dVar;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) ((C0999d) it.next()).f3147a.mo3765b());
        }
        SessionConfiguration sessionConfiguration = new SessionConfiguration(0, arrayList, executor, stateCallback);
        this.f3149a = sessionConfiguration;
        List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
        ArrayList arrayList2 = new ArrayList(outputConfigurations.size());
        for (OutputConfiguration next : outputConfigurations) {
            if (next == null) {
                dVar = null;
            } else {
                dVar = new C0999d(Build.VERSION.SDK_INT >= 33 ? new C1005j(next) : new C1004i(next));
            }
            arrayList2.add(dVar);
        }
        Collections.unmodifiableList(arrayList2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1007l)) {
            return false;
        }
        return Objects.equals(this.f3149a, ((C1007l) obj).f3149a);
    }

    public final int hashCode() {
        return this.f3149a.hashCode();
    }
}
