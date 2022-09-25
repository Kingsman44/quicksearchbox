package android.support.p033v7.view;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.view.h */
/* compiled from: PG */
final class C0440h implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    private static final Class[] f1456a = {MenuItem.class};

    /* renamed from: b */
    private final Object f1457b;

    /* renamed from: c */
    private Method f1458c;

    public C0440h(Object obj, String str) {
        this.f1457b = obj;
        Class<?> cls = obj.getClass();
        try {
            this.f1458c = cls.getMethod(str, f1456a);
        } catch (Exception e) {
            InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        try {
            if (this.f1458c.getReturnType() == Boolean.TYPE) {
                return ((Boolean) this.f1458c.invoke(this.f1457b, new Object[]{menuItem})).booleanValue();
            }
            this.f1458c.invoke(this.f1457b, new Object[]{menuItem});
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
