package android.support.p033v7.widget;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.cp */
/* compiled from: PG */
final class C0573cp {

    /* renamed from: a */
    public static boolean f2218a = true;

    /* renamed from: b */
    private static Method f2219b;

    /* renamed from: c */
    private static Method f2220c;

    /* renamed from: d */
    private static Method f2221d;

    static {
        try {
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", new Class[]{Integer.TYPE, View.class, Boolean.TYPE, Float.TYPE, Float.TYPE});
            f2219b = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", new Class[]{Integer.TYPE});
            f2220c = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{Integer.TYPE});
            f2221d = declaredMethod3;
            declaredMethod3.setAccessible(true);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    static void m2118a(C0578cu cuVar, int i, View view) {
        try {
            Method method = f2219b;
            Integer valueOf = Integer.valueOf(i);
            method.invoke(cuVar, new Object[]{valueOf, view, false, -1, -1});
            f2220c.invoke(cuVar, new Object[]{valueOf});
            f2221d.invoke(cuVar, new Object[]{valueOf});
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e2) {
            e2.printStackTrace();
        }
    }
}
