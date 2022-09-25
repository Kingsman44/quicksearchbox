package com.google.android.libraries.assistant.p1518i.p1519a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.libraries.assistant.i.a.a */
/* compiled from: PG */
final class C18390a implements LayoutInflater.Factory {

    /* renamed from: a */
    private final ClassLoader f52218a;

    public C18390a(ClassLoader classLoader) {
        this.f52218a = classLoader;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        try {
            return (View) this.f52218a.loadClass(str).asSubclass(View.class).getConstructor(new Class[]{Context.class, AttributeSet.class}).newInstance(new Object[]{context, attributeSet});
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
