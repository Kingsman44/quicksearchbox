package androidx.p186q.p189b;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.q.b.a */
/* compiled from: PG */
public final class C4058a {

    /* renamed from: a */
    public static final Map f12940a = new HashMap();

    /* renamed from: b */
    public final boolean f12941b = false;

    /* renamed from: c */
    private final File f12942c;

    /* renamed from: d */
    private final Lock f12943d;

    /* renamed from: e */
    private FileChannel f12944e;

    public C4058a(String str, File file) {
        Lock lock;
        C69664n.m101061g(str, "name");
        C69664n.m101061g(file, "lockDir");
        File file2 = new File(file, String.valueOf(str).concat(".lck"));
        this.f12942c = file2;
        String absolutePath = file2.getAbsolutePath();
        C69664n.m101060f(absolutePath, "lockFile.absolutePath");
        Map map = f12940a;
        synchronized (map) {
            Object obj = map.get(absolutePath);
            if (obj == null) {
                obj = new ReentrantLock();
                map.put(absolutePath, obj);
            }
            lock = (Lock) obj;
        }
        this.f12943d = lock;
    }

    /* renamed from: a */
    public final void mo8492a(boolean z) {
        this.f12943d.lock();
        if (z) {
            try {
                File parentFile = this.f12942c.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f12942c).getChannel();
                channel.lock();
                this.f12944e = channel;
            } catch (IOException e) {
                this.f12944e = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
            }
        }
    }

    /* renamed from: b */
    public final void mo8493b() {
        try {
            FileChannel fileChannel = this.f12944e;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f12943d.unlock();
    }
}
