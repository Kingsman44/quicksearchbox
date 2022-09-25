package androidx.p114h.p115a;

import android.system.Os;
import java.io.FileDescriptor;

/* renamed from: androidx.h.a.h */
/* compiled from: PG */
final class C2276h {
    /* renamed from: a */
    static long m6213a(FileDescriptor fileDescriptor, long j, int i) {
        return Os.lseek(fileDescriptor, j, i);
    }

    /* renamed from: b */
    static FileDescriptor m6214b(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    /* renamed from: c */
    static void m6215c(FileDescriptor fileDescriptor) {
        Os.close(fileDescriptor);
    }
}
