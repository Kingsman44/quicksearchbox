package com.google.android.libraries.p579ar.faceviewer.p580a.p581a;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.a.b */
/* compiled from: PG */
public final class C10566b {

    /* renamed from: a */
    public final ArrayList f35350a = new ArrayList(Collections.nCopies(60, 0));

    /* renamed from: b */
    public int f35351b = 0;

    /* renamed from: c */
    public int f35352c = 0;

    /* renamed from: d */
    public int f35353d = 0;

    /* renamed from: e */
    public int f35354e = 0;

    /* renamed from: a */
    public final void mo18629a() {
        this.f35352c -= ((Integer) this.f35350a.get(this.f35354e)).intValue();
        this.f35354e = (this.f35354e + 1) % 60;
        this.f35351b--;
    }
}
