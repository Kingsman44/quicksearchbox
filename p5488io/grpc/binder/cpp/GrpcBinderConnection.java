package p5488io.grpc.binder.cpp;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.net.URISyntaxException;

/* renamed from: io.grpc.binder.cpp.GrpcBinderConnection */
/* compiled from: PG */
public class GrpcBinderConnection implements ServiceConnection {
    private static final String logTag = "GrpcBinderConnection";
    private final String mConnId;
    private Context mContext;
    private IBinder mService;

    public GrpcBinderConnection(Context context, String str) {
        this.mContext = context;
        this.mConnId = str;
    }

    private static native void notifyConnected(String str, IBinder iBinder);

    private void tryConnect(Intent intent) {
        synchronized (this) {
            if (this.mContext.bindService(intent, this, 1)) {
                Log.e(logTag, "bindService returns ok");
            } else {
                Log.e(logTag, "bindService failed. Maybe the system couldn't find the service or the client doesn't have permission to bind to it.");
            }
        }
    }

    public void onNullBinding(ComponentName componentName) {
        Log.e(logTag, "Service returned null IBinder. mConnId = ".concat(String.valueOf(this.mConnId)));
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.e(logTag, "Service has connected. mConnId = ".concat(String.valueOf(this.mConnId)));
        if (iBinder != null) {
            synchronized (this) {
                this.mService = iBinder;
            }
            notifyConnected(this.mConnId, iBinder);
            return;
        }
        throw new IllegalArgumentException("service was null");
    }

    public void onServiceDisconnected(ComponentName componentName) {
        Log.e(logTag, "Service has disconnected. mConnId = ".concat(String.valueOf(this.mConnId)));
    }

    public void tryConnect(String str) {
        try {
            tryConnect(Intent.parseUri(str, 3));
        } catch (URISyntaxException unused) {
            Log.e(logTag, "Unable to parse the Uri: ".concat(String.valueOf(str)));
        }
    }

    public void tryConnect(String str, String str2, String str3) {
        Intent intent = new Intent(str3);
        intent.setComponent(new ComponentName(str, str2));
        tryConnect(intent);
    }
}
