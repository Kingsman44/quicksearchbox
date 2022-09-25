package com.google.android.libraries.home.coreui.devicetile;

import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.y */
/* compiled from: PG */
public final class C23763y {

    /* renamed from: a */
    public final int f65128a;

    /* renamed from: b */
    public final int f65129b;

    /* renamed from: c */
    public final int f65130c;

    public C23763y() {
        this(0, 0, 0, 0, 31);
    }

    public C23763y(int i, int i2, int i3) {
        this.f65128a = i;
        this.f65129b = i2;
        this.f65130c = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23763y(int i, int i2, int i3, int i4, int i5) {
        this(1 == (i5 & 1) ? R.attr.control_stateful_foreground : i, (i5 & 2) != 0 ? R.attr.control_enabled_default_background : i2, (i5 & 4) != 0 ? R.attr.control_enabled_default_secondary_background : 0);
    }
}
