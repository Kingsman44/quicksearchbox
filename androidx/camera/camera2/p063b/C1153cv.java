package androidx.camera.camera2.p063b;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.p063b.p064a.p067c.C1050h;

/* renamed from: androidx.camera.camera2.b.cv */
/* compiled from: PG */
public final class C1153cv {

    /* renamed from: b */
    private static final Size f3387b = new Size(1920, 1080);

    /* renamed from: c */
    private static final Object f3388c = new Object();

    /* renamed from: d */
    private static volatile C1153cv f3389d;

    /* renamed from: a */
    public volatile Size f3390a = null;

    /* renamed from: e */
    private final DisplayManager f3391e;

    /* renamed from: f */
    private final C1050h f3392f = new C1050h();

    private C1153cv(Context context) {
        this.f3391e = (DisplayManager) context.getSystemService("display");
    }

    /* renamed from: d */
    public static C1153cv m3205d(Context context) {
        if (f3389d == null) {
            synchronized (f3388c) {
                if (f3389d == null) {
                    f3389d = new C1153cv(context);
                }
            }
        }
        return f3389d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
        r0 = androidx.camera.camera2.p063b.p064a.p066b.C1029n.m3027b(1);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Size mo3945a() {
        /*
            r5 = this;
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            android.view.Display r1 = r5.mo3947c()
            r1.getRealSize(r0)
            int r1 = r0.x
            int r2 = r0.y
            if (r1 <= r2) goto L_0x001c
            android.util.Size r1 = new android.util.Size
            int r2 = r0.x
            int r0 = r0.y
            r1.<init>(r2, r0)
            goto L_0x0025
        L_0x001c:
            android.util.Size r1 = new android.util.Size
            int r2 = r0.y
            int r0 = r0.x
            r1.<init>(r2, r0)
        L_0x0025:
            int r0 = r1.getWidth()
            int r2 = r1.getHeight()
            int r0 = r0 * r2
            android.util.Size r2 = f3387b
            int r3 = r2.getWidth()
            int r4 = r2.getHeight()
            int r3 = r3 * r4
            if (r0 <= r3) goto L_0x003e
            r1 = r2
        L_0x003e:
            androidx.camera.camera2.b.a.c.h r0 = r5.f3392f
            androidx.camera.camera2.b.a.b.n r0 = r0.f3180a
            if (r0 != 0) goto L_0x0045
            goto L_0x0063
        L_0x0045:
            r0 = 1
            android.util.Size r0 = androidx.camera.camera2.p063b.p064a.p066b.C1029n.m3027b(r0)
            if (r0 == 0) goto L_0x0063
            int r2 = r0.getWidth()
            int r3 = r0.getHeight()
            int r2 = r2 * r3
            int r3 = r1.getWidth()
            int r4 = r1.getHeight()
            int r3 = r3 * r4
            if (r2 <= r3) goto L_0x0063
            return r0
        L_0x0063:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p063b.C1153cv.mo3945a():android.util.Size");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Size mo3946b() {
        if (this.f3390a != null) {
            return this.f3390a;
        }
        this.f3390a = mo3945a();
        return this.f3390a;
    }

    /* renamed from: c */
    public final Display mo3947c() {
        Display[] displays = this.f3391e.getDisplays();
        if (r1 == 1) {
            return displays[0];
        }
        Display display = null;
        int i = -1;
        for (Display display2 : displays) {
            if (display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                if (point.x * point.y > i) {
                    i = point.x * point.y;
                    display = display2;
                }
            }
        }
        if (display != null) {
            return display;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }
}
