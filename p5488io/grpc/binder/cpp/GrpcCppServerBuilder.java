package p5488io.grpc.binder.cpp;

import android.os.IBinder;
import android.util.Log;

/* renamed from: io.grpc.binder.cpp.GrpcCppServerBuilder */
/* compiled from: PG */
public class GrpcCppServerBuilder {
    private static final String logTag = "GrpcCppServerBuilder";

    public static IBinder GetEndpointBinder(String str) {
        if (str.startsWith("binder:")) {
            IBinder GetEndpointBinderInternal = GetEndpointBinderInternal(str.substring(7));
            String valueOf = String.valueOf(GetEndpointBinderInternal);
            Log.e(logTag, "Returning binder=" + valueOf + " for URI=" + str);
            return GetEndpointBinderInternal;
        }
        Log.e(logTag, "URI " + str + " does not start with 'binder:'");
        return null;
    }

    private static native IBinder GetEndpointBinderInternal(String str);
}
