package p5589m;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: m.k */
/* compiled from: PG */
public final /* synthetic */ class C71834k {
    static {
        Logger.getLogger("okio.Okio");
    }

    /* renamed from: a */
    public static final C71845v m105184a(Socket socket) {
        C69664n.m101061g(socket, "<this>");
        new C71846w(socket);
        OutputStream outputStream = socket.getOutputStream();
        C69664n.m101060f(outputStream, "getOutputStream()");
        return new C71825b(new C71838o(outputStream));
    }

    /* renamed from: b */
    public static final C71847x m105185b(InputStream inputStream) {
        C69664n.m101061g(inputStream, "<this>");
        return new C71833j(inputStream);
    }

    /* renamed from: c */
    public static final C71847x m105186c(Socket socket) {
        C69664n.m101061g(socket, "<this>");
        new C71846w(socket);
        InputStream inputStream = socket.getInputStream();
        C69664n.m101060f(inputStream, "getInputStream()");
        return new C71826c(new C71833j(inputStream));
    }

    /* renamed from: d */
    public static final boolean m105187d(AssertionError assertionError) {
        String message;
        if (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !C69764m.m101205y(message, "getsockname failed", false)) {
            return false;
        }
        return true;
    }
}
