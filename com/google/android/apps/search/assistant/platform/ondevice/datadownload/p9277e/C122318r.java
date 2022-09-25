package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e;

import android.content.Context;
import android.os.StatFs;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60887da;
import p3186j$.util.OptionalLong;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.r */
/* compiled from: PG */
public final class C122318r {

    /* renamed from: b */
    private static final C58974d f339177b = C58974d.m91136j();

    /* renamed from: a */
    public final C60887da f339178a;

    public C122318r(C60887da daVar) {
        this.f339178a = daVar;
    }

    /* renamed from: a */
    public static OptionalLong m201826a(Context context) {
        try {
            StatFs statFs = new StatFs(context.getFilesDir().getAbsolutePath());
            return OptionalLong.m71641of(C122315o.m201825a(statFs.getAvailableBlocksLong(), statFs.getBlockSizeLong()));
        } catch (ArithmeticException | IllegalArgumentException e) {
            ((C58970a) ((C58970a) ((C58970a) f339177b.mo56226d()).mo56382g(e)).mo56372aa(34749)).mo56386p("impossible to calculate free space");
            return OptionalLong.empty();
        }
    }

    /* renamed from: b */
    public static OptionalLong m201827b(Context context) {
        try {
            StatFs statFs = new StatFs(context.getFilesDir().getAbsolutePath());
            return OptionalLong.m71641of(C122315o.m201825a(statFs.getBlockCountLong(), statFs.getBlockSizeLong()));
        } catch (ArithmeticException | IllegalArgumentException e) {
            ((C58970a) ((C58970a) ((C58970a) f339177b.mo56226d()).mo56382g(e)).mo56372aa(34750)).mo56386p("impossible to calculate total space");
            return OptionalLong.empty();
        }
    }
}
