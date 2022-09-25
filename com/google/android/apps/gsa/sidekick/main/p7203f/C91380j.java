package com.google.android.apps.gsa.sidekick.main.p7203f;

import android.os.StatFs;
import com.google.common.base.C58881cr;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.sidekick.main.f.j */
/* compiled from: PG */
public final class C91380j implements C58881cr {

    /* renamed from: a */
    final /* synthetic */ C58881cr f254954a;

    /* renamed from: b */
    private Long f254955b;

    public C91380j(C58881cr crVar) {
        this.f254954a = crVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6453a() {
        Long l = this.f254955b;
        if (l != null) {
            return l;
        }
        Long valueOf = Long.valueOf(new StatFs(((File) this.f254954a.mo6453a()).getAbsolutePath()).getBlockSizeLong());
        this.f254955b = valueOf;
        return valueOf;
    }
}
