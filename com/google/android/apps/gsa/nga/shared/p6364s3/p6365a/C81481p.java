package com.google.android.apps.gsa.nga.shared.p6364s3.p6365a;

/* renamed from: com.google.android.apps.gsa.nga.shared.s3.a.p */
/* compiled from: PG */
public final class C81481p {
    /* renamed from: a */
    public static /* synthetic */ String m129587a(int i) {
        return i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNRECOGNIZED" : "SUCCESS" : "CANCELLATION" : "FAILURE" : "UNKNOWN";
    }

    /* renamed from: b */
    public static int m129588b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 5;
        }
        return 4;
    }
}
