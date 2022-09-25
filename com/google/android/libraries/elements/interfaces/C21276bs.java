package com.google.android.libraries.elements.interfaces;

import android.graphics.Rect;
import java.util.Set;

/* renamed from: com.google.android.libraries.elements.interfaces.bs */
/* compiled from: PG */
public abstract class C21276bs {

    /* renamed from: a */
    public Set f59590a;

    protected C21276bs() {
    }

    /* renamed from: a */
    public abstract C21277bt mo26036a(String str, Object obj);

    /* renamed from: b */
    public abstract void mo26037b();

    /* renamed from: c */
    public abstract void mo26038c(String str, Rect rect, Rect rect2, Rect rect3, boolean z);

    /* renamed from: d */
    public abstract void mo26039d(String str, Rect rect, Rect rect2, Rect rect3, boolean z);

    /* renamed from: e */
    public final boolean mo26770e() {
        Set set = this.f59590a;
        return set != null && !set.isEmpty();
    }
}
