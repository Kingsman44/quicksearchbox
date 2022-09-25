package p3186j$.wrapper.java.nio.channels;

import android.os.Build;
import java.nio.channels.FileChannel;

/* renamed from: j$.wrapper.java.nio.channels.b */
public abstract class C41336b {
    /* renamed from: a */
    public static FileChannel m72303a(FileChannel fileChannel) {
        if (fileChannel == null) {
            return null;
        }
        return Build.VERSION.SDK_INT < 24 ? fileChannel : new C41335a(fileChannel);
    }
}
