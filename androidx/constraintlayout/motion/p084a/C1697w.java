package androidx.constraintlayout.motion.p084a;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.constraintlayout.motion.a.w */
/* compiled from: PG */
public final class C1697w extends C1661af {

    /* renamed from: e */
    boolean f4816e = false;

    /* renamed from: d */
    public final void mo4705d(View view, float f) {
        Method method;
        if (view instanceof MotionLayout) {
            ((MotionLayout) view).mo4735q(mo4534a(f));
        } else if (!this.f4816e) {
            try {
                method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
            } catch (NoSuchMethodException unused) {
                this.f4816e = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, new Object[]{Float.valueOf(mo4534a(f))});
                } catch (IllegalAccessException e) {
                    Log.e("ViewSpline", "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    Log.e("ViewSpline", "unable to setProgress", e2);
                }
            }
        }
    }
}
