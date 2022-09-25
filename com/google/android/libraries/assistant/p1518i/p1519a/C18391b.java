package com.google.android.libraries.assistant.p1518i.p1519a;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* renamed from: com.google.android.libraries.assistant.i.a.b */
/* compiled from: PG */
public final class C18391b extends ContextWrapper {

    /* renamed from: a */
    private final Resources f52219a;

    /* renamed from: b */
    private final LayoutInflater f52220b;

    /* renamed from: c */
    private final ClassLoader f52221c;

    /* renamed from: d */
    private final Resources.Theme f52222d;

    /* renamed from: e */
    private final AssetManager f52223e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18391b(Context context, Resources resources, ClassLoader classLoader) {
        super(context);
        Resources.Theme newTheme = resources.newTheme();
        newTheme.applyStyle(16974120, false);
        this.f52219a = resources;
        this.f52221c = classLoader;
        this.f52222d = newTheme;
        this.f52223e = resources.getAssets();
        LayoutInflater cloneInContext = ((LayoutInflater) super.getSystemService("layout_inflater")).cloneInContext(this);
        cloneInContext.setFactory(new C18390a(classLoader));
        this.f52220b = cloneInContext;
    }

    public final AssetManager getAssets() {
        return this.f52223e;
    }

    public final ClassLoader getClassLoader() {
        return this.f52221c;
    }

    public final Resources getResources() {
        return this.f52219a;
    }

    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            return this.f52220b;
        }
        return super.getSystemService(str);
    }

    public final Resources.Theme getTheme() {
        return this.f52222d;
    }
}
