package androidx.media3.p132b;

import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.common.base.C58890d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* renamed from: androidx.media3.b.ac */
/* compiled from: PG */
public class C2484ac extends C2506j {

    /* renamed from: b */
    public final C2510n f6830b;

    /* renamed from: c */
    public final int f6831c;

    public C2484ac(C2510n nVar) {
        super(m6550b(2008, 1));
        this.f6830b = nVar;
        this.f6831c = 1;
    }

    /* renamed from: a */
    public static C2484ac m6549a(IOException iOException, C2510n nVar, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !C58890d.m90988c(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        if (i2 == 2007) {
            return new C2483ab(iOException, nVar);
        }
        return new C2484ac(iOException, nVar, i2, i);
    }

    /* renamed from: b */
    private static int m6550b(int i, int i2) {
        if (i != 2000) {
            return i;
        }
        if (i2 != 1) {
            return SimpleSnackbar.LENGTH_SHORT;
        }
        return 2001;
    }

    public C2484ac(IOException iOException, C2510n nVar, int i, int i2) {
        super((Throwable) iOException, m6550b(i, i2));
        this.f6830b = nVar;
        this.f6831c = i2;
    }

    public C2484ac(String str, C2510n nVar, int i, int i2) {
        super(str, m6550b(i, i2));
        this.f6830b = nVar;
        this.f6831c = i2;
    }

    public C2484ac(String str, IOException iOException, C2510n nVar, int i) {
        super(str, iOException, m6550b(i, 1));
        this.f6830b = nVar;
        this.f6831c = 1;
    }
}
