package p5488io.grpc.p5531h.p5532a;

import com.google.common.base.C58838bb;
import com.google.protobuf.C62921ba;
import com.google.protobuf.MessageLite;
import java.io.InputStream;
import java.io.OutputStream;
import p5488io.grpc.C70293cv;
import p5488io.grpc.C70336dg;

/* renamed from: io.grpc.h.a.d */
/* compiled from: PG */
public final class C70850d {

    /* renamed from: a */
    static volatile C62921ba f189014a = C62921ba.f169869a;

    /* renamed from: a */
    static long m103695a(InputStream inputStream, OutputStream outputStream) {
        C58838bb.m90866a(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: b */
    public static C70293cv m103696b(MessageLite messageLite) {
        return new C70849c(messageLite);
    }

    /* renamed from: c */
    public static C70336dg m103697c(MessageLite messageLite) {
        return new C70848b(messageLite);
    }

    /* renamed from: d */
    public static void m103698d(C62921ba baVar) {
        C58838bb.m90866a(baVar, "newRegistry");
        f189014a = baVar;
    }
}
