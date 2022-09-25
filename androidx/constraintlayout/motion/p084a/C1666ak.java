package androidx.constraintlayout.motion.p084a;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.p079a.p080a.p081a.C1597g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.constraintlayout.motion.a.ak */
/* compiled from: PG */
public final class C1666ak extends C1675at {

    /* renamed from: k */
    boolean f4807k = false;

    /* renamed from: d */
    public final boolean mo4706d(View view, float f, long j, C1597g gVar) {
        Method method;
        View view2 = view;
        if (view2 instanceof MotionLayout) {
            ((MotionLayout) view2).mo4735q(mo4707e(f, j, view, gVar));
        } else if (this.f4807k) {
            return false;
        } else {
            try {
                method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
            } catch (NoSuchMethodException unused) {
                this.f4807k = true;
                method = null;
            }
            Method method2 = method;
            if (method2 != null) {
                try {
                    method2.invoke(view, new Object[]{Float.valueOf(mo4707e(f, j, view, gVar))});
                } catch (IllegalAccessException e) {
                    Log.e("ViewTimeCycle", "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    Log.e("ViewTimeCycle", "unable to setProgress", e2);
                }
            }
        }
        return this.f4474h;
    }
}
