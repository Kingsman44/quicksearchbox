package com.google.p3723ar.imp.view.ipc;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.p3723ar.imp.view.ipc.p3727a.C47997c;
import java.io.IOException;
import p3186j$.util.function.Function;

/* renamed from: com.google.ar.imp.view.ipc.a */
/* compiled from: PG */
public final /* synthetic */ class C47994a implements Function {

    /* renamed from: a */
    public final /* synthetic */ LoaderClient f124224a;

    public /* synthetic */ C47994a(LoaderClient loaderClient) {
        this.f124224a = loaderClient;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        LoaderClient loaderClient = this.f124224a;
        Void voidR = (Void) obj;
        try {
            ParcelFileDescriptor[] createSocketPair = ParcelFileDescriptor.createSocketPair();
            loaderClient.f124215d = 0;
            synchronized (loaderClient) {
                C47997c cVar = loaderClient.f124214c;
                if (cVar != null) {
                    cVar.create(createSocketPair[1], loaderClient.f124216e);
                    loaderClient.f124215d = createSocketPair[0].detachFd();
                    createSocketPair[1].detachFd();
                } else {
                    throw new IOException("Service connection lost");
                }
            }
            return true;
        } catch (RemoteException | IOException e) {
            Log.e(LoaderClient.f124212a, "Exception completing connection ".concat(String.valueOf(e.getMessage())));
            throw new IllegalStateException(e);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
