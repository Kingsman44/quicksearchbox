package androidx.camera.camera2.p063b.p064a;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.camera.camera2.b.a.e */
/* compiled from: PG */
public final class C1062e extends Exception {

    /* renamed from: a */
    static final Set f3202a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{4, 5, 1, 2, 3})));

    /* renamed from: b */
    public final int f3203b;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{10001, 10002})));
    }

    public C1062e(String str, Throwable th) {
        super(String.format("%s (%d): %s", new Object[]{"CAMERA_CHARACTERISTICS_CREATION_ERROR", 10002, str}), th);
        this.f3203b = 10002;
        if (f3202a.contains(10002)) {
            new CameraAccessException(10002, str, th);
        }
    }

    public C1062e(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f3203b = cameraAccessException.getReason();
    }
}
