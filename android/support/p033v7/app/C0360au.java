package android.support.p033v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.evernote.android.state.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.app.au */
/* compiled from: PG */
final class C0360au implements View.OnClickListener {

    /* renamed from: a */
    private final View f1230a;

    /* renamed from: b */
    private final String f1231b;

    /* renamed from: c */
    private Method f1232c;

    /* renamed from: d */
    private Context f1233d;

    public C0360au(View view, String str) {
        this.f1230a = view;
        this.f1231b = str;
    }

    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f1232c == null) {
            for (Context context = this.f1230a.getContext(); context != null; context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f1231b, new Class[]{View.class})) != null) {
                        this.f1232c = method;
                        this.f1233d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
            }
            int id = this.f1230a.getId();
            if (id == -1) {
                str = BuildConfig.FLAVOR;
            } else {
                str = " with id '" + this.f1230a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f1231b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f1230a.getClass() + str);
        }
        try {
            this.f1232c.invoke(this.f1233d, new Object[]{view});
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
