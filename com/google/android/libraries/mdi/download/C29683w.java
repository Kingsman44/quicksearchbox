package com.google.android.libraries.mdi.download;

import android.net.Uri;
import com.google.android.libraries.mdi.download.p2230c.C28779n;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.mdi.download.w */
/* compiled from: PG */
public final class C29683w extends C29659ib {

    /* renamed from: a */
    public Uri f80377a;

    /* renamed from: b */
    public String f80378b;

    /* renamed from: c */
    public C28779n f80379c;

    /* renamed from: d */
    public C58833ax f80380d;

    /* renamed from: e */
    public int f80381e;

    /* renamed from: f */
    public C58485gu f80382f;

    /* renamed from: g */
    public String f80383g;

    /* renamed from: h */
    public final C58833ax f80384h;

    /* renamed from: i */
    public boolean f80385i;

    /* renamed from: j */
    public byte f80386j;

    public C29683w() {
        C58836b bVar = C58836b.f156633a;
        this.f80380d = bVar;
        this.f80384h = bVar;
    }

    /* renamed from: a */
    public final void mo34804a(C28779n nVar) {
        if (nVar != null) {
            this.f80379c = nVar;
            return;
        }
        throw new NullPointerException("Null downloadConstraints");
    }

    /* renamed from: b */
    public final void mo34805b(boolean z) {
        this.f80385i = z;
        this.f80386j = (byte) (this.f80386j | 4);
    }
}
