package com.google.android.libraries.onegoogle.common.p2384a;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;

/* renamed from: com.google.android.libraries.onegoogle.common.a.a */
/* compiled from: PG */
public abstract class C30900a {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo36297a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo36298b();

    /* renamed from: c */
    public abstract int mo36299c();

    /* renamed from: d */
    public final Context mo36585d(Context context) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{mo36297a()});
        try {
            return new ContextThemeWrapper(new ContextThemeWrapper(context, obtainStyledAttributes.getResourceId(0, mo36298b())), mo36299c());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
