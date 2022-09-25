package androidx.constraintlayout.motion.p084a;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.constraintlayout.motion.a.g */
/* compiled from: PG */
final class C1681g extends C1690p {

    /* renamed from: g */
    boolean f4813g = false;

    /* renamed from: c */
    public final void mo4711c(View view, float f) {
        Method method;
        if (view instanceof MotionLayout) {
            ((MotionLayout) view).mo4735q((float) this.f4415a.mo4526a(f));
        } else if (!this.f4813g) {
            try {
                method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
            } catch (NoSuchMethodException unused) {
                this.f4813g = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, new Object[]{Float.valueOf((float) this.f4415a.mo4526a(f))});
                } catch (IllegalAccessException e) {
                    Log.e("ViewOscillator", "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    Log.e("ViewOscillator", "unable to setProgress", e2);
                }
            }
        }
    }
}
