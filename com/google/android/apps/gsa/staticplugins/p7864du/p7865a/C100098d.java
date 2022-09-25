package com.google.android.apps.gsa.staticplugins.p7864du.p7865a;

import android.content.Context;
import android.os.StatFs;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.a.d */
/* compiled from: PG */
public final class C100098d implements C58881cr {

    /* renamed from: a */
    final /* synthetic */ Context f279934a;

    /* renamed from: b */
    private Long f279935b;

    public C100098d(Context context) {
        this.f279934a = context;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6453a() {
        Long l = this.f279935b;
        if (l != null) {
            return l;
        }
        File filesDir = this.f279934a.getFilesDir();
        if (filesDir == null) {
            this.f279935b = -1L;
            return -1L;
        }
        filesDir.mkdirs();
        try {
            this.f279935b = Long.valueOf((long) new StatFs(filesDir.getAbsolutePath()).getBlockSize());
        } catch (IllegalArgumentException e) {
            ((C59052c) ((C59052c) ((C59052c) C100099e.f279936a.mo56225c()).mo56382g(e)).mo56372aa(33177)).mo56386p("Cannot determine block size.");
            this.f279935b = -1L;
        }
        return this.f279935b;
    }
}
