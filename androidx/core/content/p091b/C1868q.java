package androidx.core.content.p091b;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* renamed from: androidx.core.content.b.q */
/* compiled from: PG */
final class C1868q {

    /* renamed from: a */
    final ColorStateList f5745a;

    /* renamed from: b */
    final Configuration f5746b;

    /* renamed from: c */
    final int f5747c;

    public C1868q(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f5745a = colorStateList;
        this.f5746b = configuration;
        this.f5747c = theme == null ? 0 : theme.hashCode();
    }
}
