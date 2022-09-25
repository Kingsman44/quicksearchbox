package com.google.android.gms.cast.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.cast.internal.b */
/* compiled from: PG */
public class C143576b extends C143586l {

    /* renamed from: a */
    public final List f389308a = Collections.synchronizedList(new ArrayList());

    public C143576b(String str) {
        super(str);
    }

    /* renamed from: a */
    public final void mo118910a() {
        synchronized (this.f389308a) {
            for (C143575an d : this.f389308a) {
                d.mo118908d(2002);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo118911b(C143575an anVar) {
        this.f389308a.add(anVar);
    }
}
