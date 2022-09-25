package com.google.android.apps.gsa.nga.shared.p6296ab.p6297a.p6298a;

/* renamed from: com.google.android.apps.gsa.nga.shared.ab.a.a.f */
/* compiled from: PG */
public final class C80535f {
    /* renamed from: a */
    public static /* synthetic */ String m128192a(int i) {
        return i != 1 ? i != 2 ? i != 4 ? i != 5 ? "null" : "EXTERNAL_APP_HAS_MIC" : "PHONE_CALL_OR_VIDEO_RECORDING" : "EXCLUSIVE" : "STATUS_NOT_SET";
    }

    /* renamed from: b */
    public static int m128193b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }
}
