package p5488io.grpc.binder.cpp;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.grpc.binder.cpp.NativeConnectionHelper */
/* compiled from: PG */
final class NativeConnectionHelper {
    static Map connectionIdToGrpcBinderConnectionMap = new HashMap();

    NativeConnectionHelper() {
    }

    static Parcel getEmptyParcel() {
        return Parcel.obtain();
    }

    static boolean isSignatureMatch(Context context, int i, int i2) {
        int checkSignatures = context.getPackageManager().checkSignatures(i, i2);
        if (checkSignatures == 0) {
            return true;
        }
        Log.e("NativeConnectionHelper", "Signatures does not match. checkSignature return value = " + checkSignatures);
        return false;
    }

    static void tryEstablishConnection(Context context, String str, String str2, String str3, String str4) {
        connectionIdToGrpcBinderConnectionMap.put(str4, new GrpcBinderConnection(context, str4));
        ((GrpcBinderConnection) connectionIdToGrpcBinderConnectionMap.get(str4)).tryConnect(str, str2, str3);
    }

    static void tryEstablishConnectionWithUri(Context context, String str, String str2) {
        connectionIdToGrpcBinderConnectionMap.put(str2, new GrpcBinderConnection(context, str2));
        ((GrpcBinderConnection) connectionIdToGrpcBinderConnectionMap.get(str2)).tryConnect(str);
    }
}
